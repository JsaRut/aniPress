package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p275e.C2711F;
import p275e.C2719g;
import p275e.C2725m;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2720h;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final InterfaceC2720h sink;
    final InterfaceC2721i source;
    final StreamAllocation streamAllocation;
    int state = 0;
    private long headerLimit = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements InterfaceC2709D {
        protected long bytesRead;
        protected boolean closed;
        protected final C2725m timeout;

        private AbstractSource() {
            this.timeout = new C2725m(Http1Codec.this.source.timeout());
            this.bytesRead = 0L;
        }

        protected final void endOfInput(boolean z, IOException iOException) {
            Http1Codec http1Codec = Http1Codec.this;
            int i = http1Codec.state;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
            http1Codec.detachTimeout(this.timeout);
            Http1Codec http1Codec2 = Http1Codec.this;
            http1Codec2.state = 6;
            StreamAllocation streamAllocation = http1Codec2.streamAllocation;
            if (streamAllocation != null) {
                streamAllocation.streamFinished(!z, http1Codec2, this.bytesRead, iOException);
            }
        }

        @Override // p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            try {
                long read = Http1Codec.this.source.read(c2719g, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e2) {
                endOfInput(false, e2);
                throw e2;
            }
        }

        @Override // p275e.InterfaceC2709D
        public C2711F timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class ChunkedSink implements InterfaceC2708C {
        private boolean closed;
        private final C2725m timeout;

        ChunkedSink() {
            this.timeout = new C2725m(Http1Codec.this.sink.timeout());
        }

        @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.mo11677a("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }

        @Override // p275e.InterfaceC2708C, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // p275e.InterfaceC2708C
        public C2711F timeout() {
            return this.timeout;
        }

        @Override // p275e.InterfaceC2708C
        public void write(C2719g c2719g, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1Codec.this.sink.mo11693c(j);
            Http1Codec.this.sink.mo11677a("\r\n");
            Http1Codec.this.sink.write(c2719g, j);
            Http1Codec.this.sink.mo11677a("\r\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = NO_CHUNK_YET;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != NO_CHUNK_YET) {
                Http1Codec.this.source.mo11702g();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.mo11709k();
                String trim = Http1Codec.this.source.mo11702g().trim();
                if (this.bytesRemainingInChunk < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return NO_CHUNK_YET;
            }
            long j2 = this.bytesRemainingInChunk;
            if (j2 == 0 || j2 == NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return NO_CHUNK_YET;
                }
            }
            long read = super.read(c2719g, Math.min(j, this.bytesRemainingInChunk));
            if (read != NO_CHUNK_YET) {
                this.bytesRemainingInChunk -= read;
                return read;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            endOfInput(false, protocolException);
            throw protocolException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class FixedLengthSink implements InterfaceC2708C {
        private long bytesRemaining;
        private boolean closed;
        private final C2725m timeout;

        FixedLengthSink(long j) {
            this.timeout = new C2725m(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }

        @Override // p275e.InterfaceC2708C, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // p275e.InterfaceC2708C
        public C2711F timeout() {
            return this.timeout;
        }

        @Override // p275e.InterfaceC2708C
        public void write(C2719g c2719g, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(c2719g.size(), 0L, j);
            if (j <= this.bytesRemaining) {
                Http1Codec.this.sink.write(c2719g, j);
                this.bytesRemaining -= j;
                return;
            }
            throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.bytesRemaining;
            if (j2 == 0) {
                return -1L;
            }
            long read = super.read(c2719g, Math.min(j2, j));
            if (read == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
            this.bytesRemaining -= read;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
            return read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long read = super.read(c2719g, j);
            if (read != -1) {
                return read;
            }
            this.inputExhausted = true;
            endOfInput(true, null);
            return -1L;
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, InterfaceC2721i interfaceC2721i, InterfaceC2720h interfaceC2720h) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = interfaceC2721i;
        this.sink = interfaceC2720h;
    }

    private String readHeaderLine() {
        String mo11691b = this.source.mo11691b(this.headerLimit);
        this.headerLimit -= mo11691b.length();
        return mo11691b;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public InterfaceC2708C createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    void detachTimeout(C2725m c2725m) {
        C2711F m11729a = c2725m.m11729a();
        c2725m.m11730a(C2711F.NONE);
        m11729a.clearDeadline();
        m11729a.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() {
        this.sink.flush();
    }

    public boolean isClosed() {
        return this.state == 6;
    }

    public InterfaceC2708C newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public InterfaceC2709D newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public InterfaceC2708C newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public InterfaceC2709D newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public InterfaceC2709D newUnknownLengthSource() {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.state = 5;
        streamAllocation.noNewStreams();
        return new UnknownLengthSource();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation = this.streamAllocation;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0L, C2732t.m11745a(newFixedLengthSource(0L)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1L, C2732t.m11745a(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        return contentLength != -1 ? new RealResponseBody(header, contentLength, C2732t.m11745a(newFixedLengthSource(contentLength))) : new RealResponseBody(header, -1L, C2732t.m11745a(newUnknownLengthSource()));
    }

    public Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(readHeaderLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void writeRequest(Headers headers, String str) {
        if (this.state != 0) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.sink.mo11677a(str).mo11677a("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.mo11677a(headers.name(i)).mo11677a(": ").mo11677a(headers.value(i)).mo11677a("\r\n");
        }
        this.sink.mo11677a("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
