package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import p275e.C2711F;
import p275e.C2719g;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2720h;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public final class CacheInterceptor implements Interceptor {
    final InternalCache cache;

    /* renamed from: okhttp3.internal.cache.CacheInterceptor$1 */
    /* loaded from: classes.dex */
    public class C27651 implements InterfaceC2709D {
        boolean cacheRequestClosed;
        final /* synthetic */ InterfaceC2720h val$cacheBody;
        final /* synthetic */ CacheRequest val$cacheRequest;
        final /* synthetic */ InterfaceC2721i val$source;

        C27651(InterfaceC2721i interfaceC2721i, CacheRequest cacheRequest, InterfaceC2720h interfaceC2720h) {
            r2 = interfaceC2721i;
            r3 = cacheRequest;
            r4 = interfaceC2720h;
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                r3.abort();
            }
            r2.close();
        }

        @Override // p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            try {
                long read = r2.read(c2719g, j);
                if (read != -1) {
                    c2719g.m11675a(r4.mo11674a(), c2719g.size() - read, read);
                    r4.mo11697e();
                    return read;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    r4.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    r3.abort();
                }
                throw e2;
            }
        }

        @Override // p275e.InterfaceC2709D
        public C2711F timeout() {
            return r2.timeout();
        }
    }

    public CacheInterceptor(InternalCache internalCache) {
        this.cache = internalCache;
    }

    private Response cacheWritingResponse(CacheRequest cacheRequest, Response response) {
        InterfaceC2708C body;
        if (cacheRequest == null || (body = cacheRequest.body()) == null) {
            return response;
        }
        return response.newBuilder().body(new RealResponseBody(response.header("Content-Type"), response.body().contentLength(), C2732t.m11745a(new InterfaceC2709D() { // from class: okhttp3.internal.cache.CacheInterceptor.1
            boolean cacheRequestClosed;
            final /* synthetic */ InterfaceC2720h val$cacheBody;
            final /* synthetic */ CacheRequest val$cacheRequest;
            final /* synthetic */ InterfaceC2721i val$source;

            C27651(InterfaceC2721i interfaceC2721i, CacheRequest cacheRequest2, InterfaceC2720h interfaceC2720h) {
                r2 = interfaceC2721i;
                r3 = cacheRequest2;
                r4 = interfaceC2720h;
            }

            @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    r3.abort();
                }
                r2.close();
            }

            @Override // p275e.InterfaceC2709D
            public long read(C2719g c2719g, long j) {
                try {
                    long read = r2.read(c2719g, j);
                    if (read != -1) {
                        c2719g.m11675a(r4.mo11674a(), c2719g.size() - read, read);
                        r4.mo11697e();
                        return read;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        r4.close();
                    }
                    return -1L;
                } catch (IOException e2) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        r3.abort();
                    }
                    throw e2;
                }
            }

            @Override // p275e.InterfaceC2709D
            public C2711F timeout() {
                return r2.timeout();
            }
        }))).build();
    }

    private static Headers combine(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                Internal.instance.addLenient(builder, name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    static boolean isContentSpecificHeader(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean isEndToEnd(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static Response stripBody(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        InternalCache internalCache = this.cache;
        Response response = internalCache != null ? internalCache.get(chain.request()) : null;
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).get();
        Request request = cacheStrategy.networkRequest;
        Response response2 = cacheStrategy.cacheResponse;
        InternalCache internalCache2 = this.cache;
        if (internalCache2 != null) {
            internalCache2.trackResponse(cacheStrategy);
        }
        if (response != null && response2 == null) {
            Util.closeQuietly(response.body());
        }
        if (request == null && response2 == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request == null) {
            return response2.newBuilder().cacheResponse(stripBody(response2)).build();
        }
        try {
            Response proceed = chain.proceed(request);
            if (proceed == null && response != null) {
            }
            if (response2 != null) {
                if (proceed.code() == 304) {
                    Response build = response2.newBuilder().headers(combine(response2.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
                    proceed.body().close();
                    this.cache.trackConditionalCacheHit();
                    this.cache.update(response2, build);
                    return build;
                }
                Util.closeQuietly(response2.body());
            }
            Response build2 = proceed.newBuilder().cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.hasBody(build2) && CacheStrategy.isCacheable(build2, request)) {
                    return cacheWritingResponse(this.cache.put(build2), build2);
                }
                if (HttpMethod.invalidatesCache(request.method())) {
                    try {
                        this.cache.remove(request);
                    } catch (IOException unused) {
                    }
                }
            }
            return build2;
        } finally {
            if (response != null) {
                Util.closeQuietly(response.body());
            }
        }
    }
}
