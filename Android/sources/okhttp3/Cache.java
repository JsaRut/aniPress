package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import p275e.AbstractC2723k;
import p275e.AbstractC2724l;
import p275e.C2719g;
import p275e.C2722j;
import p275e.C2732t;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2720h;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class CacheRequestImpl implements CacheRequest {
        private InterfaceC2708C body;
        private InterfaceC2708C cacheOut;
        boolean done;
        private final DiskLruCache.Editor editor;

        CacheRequestImpl(final DiskLruCache.Editor editor) {
            this.editor = editor;
            this.cacheOut = editor.newSink(1);
            this.body = new AbstractC2723k(this.cacheOut) { // from class: okhttp3.Cache.CacheRequestImpl.1
                @Override // p275e.AbstractC2723k, p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (Cache.this) {
                        if (CacheRequestImpl.this.done) {
                            return;
                        }
                        CacheRequestImpl.this.done = true;
                        Cache.this.writeSuccessCount++;
                        super.close();
                        editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache.this.writeAbortCount++;
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public InterfaceC2708C body() {
            return this.body;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CacheResponseBody extends ResponseBody {
        private final InterfaceC2721i bodySource;
        private final String contentLength;
        private final String contentType;
        final DiskLruCache.Snapshot snapshot;

        CacheResponseBody(final DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C2732t.m11745a(new AbstractC2724l(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // p275e.AbstractC2724l, p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    snapshot.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                if (this.contentLength != null) {
                    return Long.parseLong(this.contentLength);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC2721i source() {
            return this.bodySource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Entry {
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;
        private static final String SENT_MILLIS = Platform.get().getPrefix() + "-Sent-Millis";
        private static final String RECEIVED_MILLIS = Platform.get().getPrefix() + "-Received-Millis";

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        Entry(InterfaceC2709D interfaceC2709D) {
            try {
                InterfaceC2721i m11745a = C2732t.m11745a(interfaceC2709D);
                this.url = m11745a.mo11702g();
                this.requestMethod = m11745a.mo11702g();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(m11745a);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(m11745a.mo11702g());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(m11745a.mo11702g());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(m11745a);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(m11745a.mo11702g());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0L;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String mo11702g = m11745a.mo11702g();
                    if (mo11702g.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + mo11702g + "\"");
                    }
                    this.handshake = Handshake.get(!m11745a.mo11695d() ? TlsVersion.forJavaName(m11745a.mo11702g()) : TlsVersion.SSL_3_0, CipherSuite.forJavaName(m11745a.mo11702g()), readCertificateList(m11745a), readCertificateList(m11745a));
                } else {
                    this.handshake = null;
                }
            } finally {
                interfaceC2709D.close();
            }
        }

        Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        private List<Certificate> readCertificateList(InterfaceC2721i interfaceC2721i) {
            int readInt = Cache.readInt(interfaceC2721i);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String mo11702g = interfaceC2721i.mo11702g();
                    C2719g c2719g = new C2719g();
                    c2719g.mo11676a(C2722j.m11721a(mo11702g));
                    arrayList.add(certificateFactory.generateCertificate(c2719g.mo11711l()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        private void writeCertList(InterfaceC2720h interfaceC2720h, List<Certificate> list) {
            try {
                interfaceC2720h.mo11701g(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    interfaceC2720h.mo11677a(C2722j.m11723a(list.get(i).getEncoded()).mo11649b()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public void writeTo(DiskLruCache.Editor editor) {
            InterfaceC2720h m11744a = C2732t.m11744a(editor.newSink(0));
            m11744a.mo11677a(this.url).writeByte(10);
            m11744a.mo11677a(this.requestMethod).writeByte(10);
            m11744a.mo11701g(this.varyHeaders.size()).writeByte(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                m11744a.mo11677a(this.varyHeaders.name(i)).mo11677a(": ").mo11677a(this.varyHeaders.value(i)).writeByte(10);
            }
            m11744a.mo11677a(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
            m11744a.mo11701g(this.responseHeaders.size() + 2).writeByte(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                m11744a.mo11677a(this.responseHeaders.name(i2)).mo11677a(": ").mo11677a(this.responseHeaders.value(i2)).writeByte(10);
            }
            m11744a.mo11677a(SENT_MILLIS).mo11677a(": ").mo11701g(this.sentRequestMillis).writeByte(10);
            m11744a.mo11677a(RECEIVED_MILLIS).mo11677a(": ").mo11701g(this.receivedResponseMillis).writeByte(10);
            if (isHttps()) {
                m11744a.writeByte(10);
                m11744a.mo11677a(this.handshake.cipherSuite().javaName()).writeByte(10);
                writeCertList(m11744a, this.handshake.peerCertificates());
                writeCertList(m11744a, this.handshake.localCertificates());
                m11744a.mo11677a(this.handshake.tlsVersion().javaName()).writeByte(10);
            }
            m11744a.close();
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() { // from class: okhttp3.Cache.1
            @Override // okhttp3.internal.cache.InternalCache
            public Response get(Request request) {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static String key(HttpUrl httpUrl) {
        return C2722j.m11725c(httpUrl.toString()).mo11652e().mo11650c();
    }

    static int readInt(InterfaceC2721i interfaceC2721i) {
        try {
            long mo11699f = interfaceC2721i.mo11699f();
            String mo11702g = interfaceC2721i.mo11702g();
            if (mo11699f >= 0 && mo11699f <= 2147483647L && mo11702g.isEmpty()) {
                return (int) mo11699f;
            }
            throw new IOException("expected an int but was \"" + mo11699f + mo11702g + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public void delete() {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = this.cache.edit(key(response.request().url()));
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new CacheRequestImpl(editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    void remove(Request request) {
        this.cache.remove(key(request.url()));
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() {
        return this.cache.size();
    }

    synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public Iterator<String> urls() {
        return new Iterator<String>() { // from class: okhttp3.Cache.2
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            String nextUrl;

            {
                this.delegate = Cache.this.cache.snapshots();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = C2732t.m11745a(next.getSource(0)).mo11702g();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.nextUrl;
                this.nextUrl = null;
                this.canRemove = true;
                return str;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (!this.canRemove) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.delegate.remove();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }
}
