package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import p275e.AbstractC2723k;
import p275e.C2719g;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    /* loaded from: classes.dex */
    static final class CountingSink extends AbstractC2723k {
        long successfulCount;

        CountingSink(InterfaceC2708C interfaceC2708C) {
            super(interfaceC2708C);
        }

        @Override // p275e.AbstractC2723k, p275e.InterfaceC2708C
        public void write(C2719g c2719g, long j) {
            super.write(c2719g, j);
            this.successfulCount += j;
        }
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response.Builder newBuilder;
        ResponseBody openResponseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        HttpCodec httpStream = realInterceptorChain.httpStream();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        RealConnection realConnection = (RealConnection) realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.eventListener().requestHeadersStart(realInterceptorChain.call());
        httpStream.writeRequestHeaders(request);
        realInterceptorChain.eventListener().requestHeadersEnd(realInterceptorChain.call(), request);
        Response.Builder builder = null;
        if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpStream.flushRequest();
                realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
                builder = httpStream.readResponseHeaders(true);
            }
            if (builder == null) {
                realInterceptorChain.eventListener().requestBodyStart(realInterceptorChain.call());
                CountingSink countingSink = new CountingSink(httpStream.createRequestBody(request, request.body().contentLength()));
                InterfaceC2720h m11744a = C2732t.m11744a(countingSink);
                request.body().writeTo(m11744a);
                m11744a.close();
                realInterceptorChain.eventListener().requestBodyEnd(realInterceptorChain.call(), countingSink.successfulCount);
            } else if (!realConnection.isMultiplexed()) {
                streamAllocation.noNewStreams();
            }
        }
        httpStream.finishRequest();
        if (builder == null) {
            realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
            builder = httpStream.readResponseHeaders(false);
        }
        Response build = builder.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            build = httpStream.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        realInterceptorChain.eventListener().responseHeadersEnd(realInterceptorChain.call(), build);
        if (this.forWebSocket && code == 101) {
            newBuilder = build.newBuilder();
            openResponseBody = Util.EMPTY_RESPONSE;
        } else {
            newBuilder = build.newBuilder();
            openResponseBody = httpStream.openResponseBody(build);
        }
        Response build2 = newBuilder.body(openResponseBody).build();
        if ("close".equalsIgnoreCase(build2.request().header("Connection")) || "close".equalsIgnoreCase(build2.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((code != 204 && code != 205) || build2.body().contentLength() <= 0) {
            return build2;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().contentLength());
    }
}
