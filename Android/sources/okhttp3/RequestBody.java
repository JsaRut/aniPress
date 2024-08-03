package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p275e.C2722j;
import p275e.C2732t;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
public abstract class RequestBody {

    /* renamed from: okhttp3.RequestBody$1 */
    /* loaded from: classes.dex */
    public class C27581 extends RequestBody {
        final /* synthetic */ C2722j val$content;

        C27581(C2722j c2722j) {
            r2 = c2722j;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return r2.mo11655h();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.this;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC2720h interfaceC2720h) {
            interfaceC2720h.mo11676a(r2);
        }
    }

    /* renamed from: okhttp3.RequestBody$2 */
    /* loaded from: classes.dex */
    public class C27592 extends RequestBody {
        final /* synthetic */ int val$byteCount;
        final /* synthetic */ byte[] val$content;
        final /* synthetic */ int val$offset;

        C27592(int i, byte[] bArr, int i2) {
            r2 = i;
            r3 = bArr;
            r4 = i2;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return r2;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.this;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC2720h interfaceC2720h) {
            interfaceC2720h.write(r3, r4, r2);
        }
    }

    /* renamed from: okhttp3.RequestBody$3 */
    /* loaded from: classes.dex */
    class C27603 extends RequestBody {
        final /* synthetic */ File val$file;

        C27603(File file) {
            r2 = file;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return r2.length();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.this;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC2720h interfaceC2720h) {
            InterfaceC2709D interfaceC2709D = null;
            try {
                interfaceC2709D = C2732t.m11749c(r2);
                interfaceC2720h.mo11671a(interfaceC2709D);
            } finally {
                Util.closeQuietly(interfaceC2709D);
            }
        }
    }

    public static RequestBody create(MediaType mediaType, C2722j c2722j) {
        return new RequestBody() { // from class: okhttp3.RequestBody.1
            final /* synthetic */ C2722j val$content;

            C27581(C2722j c2722j2) {
                r2 = c2722j2;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return r2.mo11655h();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC2720h interfaceC2720h) {
                interfaceC2720h.mo11676a(r2);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, File file) {
        if (file != null) {
            return new RequestBody() { // from class: okhttp3.RequestBody.3
                final /* synthetic */ File val$file;

                C27603(File file2) {
                    r2 = file2;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return r2.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC2720h interfaceC2720h) {
                    InterfaceC2709D interfaceC2709D = null;
                    try {
                        interfaceC2709D = C2732t.m11749c(r2);
                        interfaceC2720h.mo11671a(interfaceC2709D);
                    } finally {
                        Util.closeQuietly(interfaceC2709D);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: okhttp3.RequestBody.2
            final /* synthetic */ int val$byteCount;
            final /* synthetic */ byte[] val$content;
            final /* synthetic */ int val$offset;

            C27592(int i22, byte[] bArr2, int i3) {
                r2 = i22;
                r3 = bArr2;
                r4 = i3;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return r2;
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC2720h interfaceC2720h) {
                interfaceC2720h.write(r3, r4, r2);
            }
        };
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(InterfaceC2720h interfaceC2720h);
}
