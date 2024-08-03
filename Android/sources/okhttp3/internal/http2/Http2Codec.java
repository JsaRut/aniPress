package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p275e.AbstractC2724l;
import p275e.C2719g;
import p275e.C2722j;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2709D;

/* loaded from: classes.dex */
public final class Http2Codec implements HttpCodec {
    private final Interceptor.Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private Http2Stream stream;
    final StreamAllocation streamAllocation;
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";

    /* renamed from: TE */
    private static final String f11447TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f11447TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f11447TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* loaded from: classes.dex */
    class StreamFinishingSource extends AbstractC2724l {
        long bytesRead;
        boolean completed;

        StreamFinishingSource(InterfaceC2709D interfaceC2709D) {
            super(interfaceC2709D);
            this.completed = false;
            this.bytesRead = 0L;
        }

        private void endOfInput(IOException iOException) {
            if (this.completed) {
                return;
            }
            this.completed = true;
            Http2Codec http2Codec = Http2Codec.this;
            http2Codec.streamAllocation.streamFinished(false, http2Codec, this.bytesRead, iOException);
        }

        @Override // p275e.AbstractC2724l, p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            endOfInput(null);
        }

        @Override // p275e.AbstractC2724l, p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            try {
                long read = delegate().read(c2719g, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e2) {
                endOfInput(e2);
                throw e2;
            }
        }
    }

    public Http2Codec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
        this.chain = chain;
        this.streamAllocation = streamAllocation;
        this.connection = http2Connection;
        this.protocol = okHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            C2722j m11725c = C2722j.m11725c(headers.name(i).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(m11725c.mo11658k())) {
                arrayList.add(new Header(m11725c, headers.value(i)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if (name.equals(Header.RESPONSE_STATUS_UTF8)) {
                statusLine = StatusLine.parse("HTTP/1.1 " + value);
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        if (statusLine != null) {
            return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public InterfaceC2708C createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() {
        this.stream.getSink().close();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() {
        this.connection.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation = this.streamAllocation;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        return new RealResponseBody(response.header("Content-Type"), HttpHeaders.contentLength(response), C2732t.m11745a(new StreamFinishingSource(this.stream.getSource())));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) {
        Response.Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (z && Internal.instance.code(readHttp2HeadersList) == 100) {
            return null;
        }
        return readHttp2HeadersList;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) {
        if (this.stream != null) {
            return;
        }
        this.stream = this.connection.newStream(http2HeadersList(request), request.body() != null);
        this.stream.readTimeout().timeout(this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.stream.writeTimeout().timeout(this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
    }
}
