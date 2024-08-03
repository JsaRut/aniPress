package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.Util;
import p275e.C2719g;
import p275e.C2722j;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
public final class MultipartBody extends RequestBody {
    private final C2722j boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    /* loaded from: classes.dex */
    public static final class Builder {
        private final C2722j boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = C2722j.m11725c(str);
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part == null) {
                throw new NullPointerException("part == null");
            }
            this.parts.add(part);
            return this;
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            }
            if (mediaType.type().equals("multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + mediaType);
        }
    }

    /* loaded from: classes.dex */
    public static final class Part {
        final RequestBody body;
        final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static Part create(Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, requestBody);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                MultipartBody.appendQuotedString(sb, str2);
            }
            return create(Headers.m11768of("Content-Disposition", sb.toString()), requestBody);
        }

        public RequestBody body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }
    }

    MultipartBody(C2722j c2722j, MediaType mediaType, List<Part> list) {
        this.boundary = c2722j;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + c2722j.mo11658k());
        this.parts = Util.immutableList(list);
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                str2 = "%0A";
            } else if (charAt == '\r') {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(InterfaceC2720h interfaceC2720h, boolean z) {
        C2719g c2719g;
        if (z) {
            interfaceC2720h = new C2719g();
            c2719g = interfaceC2720h;
        } else {
            c2719g = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            interfaceC2720h.write(DASHDASH);
            interfaceC2720h.mo11676a(this.boundary);
            interfaceC2720h.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    interfaceC2720h.mo11677a(headers.name(i2)).write(COLONSPACE).mo11677a(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                interfaceC2720h.mo11677a("Content-Type: ").mo11677a(contentType.toString()).write(CRLF);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength != -1) {
                interfaceC2720h.mo11677a("Content-Length: ").mo11701g(contentLength).write(CRLF);
            } else if (z) {
                c2719g.m11712m();
                return -1L;
            }
            interfaceC2720h.write(CRLF);
            if (z) {
                j += contentLength;
            } else {
                requestBody.writeTo(interfaceC2720h);
            }
            interfaceC2720h.write(CRLF);
        }
        interfaceC2720h.write(DASHDASH);
        interfaceC2720h.mo11676a(this.boundary);
        interfaceC2720h.write(DASHDASH);
        interfaceC2720h.write(CRLF);
        if (!z) {
            return j;
        }
        long size3 = j + c2719g.size();
        c2719g.m11712m();
        return size3;
    }

    public String boundary() {
        return this.boundary.mo11658k();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public MediaType type() {
        return this.originalType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC2720h interfaceC2720h) {
        writeOrCountBytes(interfaceC2720h, false);
    }
}
