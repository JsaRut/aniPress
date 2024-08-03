package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader;
import p275e.C2722j;
import p275e.InterfaceC2720h;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;
    private final ArrayDeque<C2722j> pongQueue = new ArrayDeque<>();
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private int receivedCloseCode = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class CancelRunnable implements Runnable {
        CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final C2722j reason;

        Close(int i, C2722j c2722j, long j) {
            this.code = i;
            this.reason = c2722j;
            this.cancelAfterCloseMillis = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Message {
        final C2722j data;
        final int formatOpcode;

        Message(int i, C2722j c2722j) {
            this.formatOpcode = i;
            this.data = c2722j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class PingRunnable implements Runnable {
        PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RealWebSocket.this.writePingFrame();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final InterfaceC2720h sink;
        public final InterfaceC2721i source;

        public Streams(boolean z, InterfaceC2721i interfaceC2721i, InterfaceC2720h interfaceC2720h) {
            this.client = z;
            this.source = interfaceC2721i;
            this.sink = interfaceC2720h;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j) {
        if (!"GET".equals(request.method())) {
            throw new IllegalArgumentException("Request must be GET: " + request.method());
        }
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = C2722j.m11723a(bArr).mo11649b();
        this.writerRunnable = new Runnable() { // from class: okhttp3.internal.ws.RealWebSocket.1
            @Override // java.lang.Runnable
            public void run() {
                do {
                    try {
                    } catch (IOException e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                        return;
                    }
                } while (RealWebSocket.this.writeOneFrame());
            }
        };
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    private synchronized boolean send(C2722j c2722j, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + c2722j.mo11655h() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return $assertionsDisabled;
            }
            this.queueSize += c2722j.mo11655h();
            this.messageAndCloseQueue.add(new Message(i, c2722j));
            runWriter();
            return true;
        }
        return $assertionsDisabled;
    }

    void awaitTermination(int i, TimeUnit timeUnit) {
        this.executor.awaitTermination(i, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    void checkResponse(Response response) {
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
        }
        String header = response.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(header)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        String header2 = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(header2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
        }
        String header3 = response.header("Sec-WebSocket-Accept");
        String mo11649b = C2722j.m11725c(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").mo11653f().mo11649b();
        if (mo11649b.equals(header3)) {
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + mo11649b + "' but was '" + header3 + "'");
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        C2722j c2722j = null;
        if (str != null) {
            c2722j = C2722j.m11725c(str);
            if (c2722j.mo11655h() > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i, c2722j, j));
            runWriter();
            return true;
        }
        return $assertionsDisabled;
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = Internal.instance.newWebSocketCall(build, build2);
        this.call.timeout().clearTimeout();
        this.call.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build2.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (ProtocolException e3) {
                    RealWebSocket.this.failWebSocket(e3, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public void failWebSocket(Exception exc, Response response) {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            if (this.cancelFuture != null) {
                this.cancelFuture.cancel($assertionsDisabled);
            }
            if (this.executor != null) {
                this.executor.shutdown();
            }
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                Util.closeQuietly(streams);
            }
        }
    }

    public void initReaderAndWriter(String str, Streams streams) {
        synchronized (this) {
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.client, streams.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, $assertionsDisabled));
            if (this.pingIntervalMillis != 0) {
                this.executor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        Streams streams;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                streams = this.streams;
                this.streams = null;
                if (this.cancelFuture != null) {
                    this.cancelFuture.cancel($assertionsDisabled);
                }
                this.executor.shutdown();
            } else {
                streams = null;
            }
        }
        try {
            this.listener.onClosing(this, i, str);
            if (streams != null) {
                this.listener.onClosed(this, i, str);
            }
        } finally {
            Util.closeQuietly(streams);
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(C2722j c2722j) {
        this.listener.onMessage(this, c2722j);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(C2722j c2722j) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(c2722j);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(C2722j c2722j) {
        this.receivedPongCount++;
        this.awaitingPong = $assertionsDisabled;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    synchronized boolean pong(C2722j c2722j) {
        boolean z;
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(c2722j);
            runWriter();
            z = true;
        }
        z = $assertionsDisabled;
        return z;
    }

    boolean processNextFrame() {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return $assertionsDisabled;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return $assertionsDisabled;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(C2722j c2722j) {
        if (c2722j != null) {
            return send(c2722j, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        if (str != null) {
            return send(C2722j.m11725c(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    void tearDown() {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel($assertionsDisabled);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: all -> 0x00a5, TRY_ENTER, TryCatch #1 {all -> 0x00a5, blocks: (B:18:0x0052, B:21:0x0056, B:23:0x005a, B:24:0x0076, B:32:0x0085, B:33:0x0086, B:35:0x008a, B:37:0x0095, B:38:0x009f, B:39:0x00a4, B:26:0x0077, B:27:0x0081), top: B:16:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:18:0x0052, B:21:0x0056, B:23:0x005a, B:24:0x0076, B:32:0x0085, B:33:0x0086, B:35:0x008a, B:37:0x0095, B:38:0x009f, B:39:0x00a4, B:26:0x0077, B:27:0x0081), top: B:16:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean writeOneFrame() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.failed     // Catch: java.lang.Throwable -> Laa
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laa
            return r1
        L8:
            okhttp3.internal.ws.WebSocketWriter r0 = r11.writer     // Catch: java.lang.Throwable -> Laa
            java.util.ArrayDeque<e.j> r2 = r11.pongQueue     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> Laa
            e.j r2 = (p275e.C2722j) r2     // Catch: java.lang.Throwable -> Laa
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L4c
            java.util.ArrayDeque<java.lang.Object> r5 = r11.messageAndCloseQueue     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r5 = r5.poll()     // Catch: java.lang.Throwable -> Laa
            boolean r6 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L46
            int r1 = r11.receivedCloseCode     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = r11.receivedCloseReason     // Catch: java.lang.Throwable -> Laa
            if (r1 == r3) goto L31
            okhttp3.internal.ws.RealWebSocket$Streams r3 = r11.streams     // Catch: java.lang.Throwable -> Laa
            r11.streams = r4     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.ScheduledExecutorService r4 = r11.executor     // Catch: java.lang.Throwable -> Laa
            r4.shutdown()     // Catch: java.lang.Throwable -> Laa
            r4 = r3
            goto L4f
        L31:
            java.util.concurrent.ScheduledExecutorService r3 = r11.executor     // Catch: java.lang.Throwable -> Laa
            okhttp3.internal.ws.RealWebSocket$CancelRunnable r7 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable     // Catch: java.lang.Throwable -> Laa
            r7.<init>()     // Catch: java.lang.Throwable -> Laa
            r8 = r5
            okhttp3.internal.ws.RealWebSocket$Close r8 = (okhttp3.internal.ws.RealWebSocket.Close) r8     // Catch: java.lang.Throwable -> Laa
            long r8 = r8.cancelAfterCloseMillis     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r7, r8, r10)     // Catch: java.lang.Throwable -> Laa
            r11.cancelFuture = r3     // Catch: java.lang.Throwable -> Laa
            goto L4f
        L46:
            if (r5 != 0) goto L4a
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laa
            return r1
        L4a:
            r6 = r4
            goto L4e
        L4c:
            r5 = r4
            r6 = r5
        L4e:
            r1 = -1
        L4f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L56
            r0.writePong(r2)     // Catch: java.lang.Throwable -> La5
            goto L9a
        L56:
            boolean r2 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L86
            r1 = r5
            okhttp3.internal.ws.RealWebSocket$Message r1 = (okhttp3.internal.ws.RealWebSocket.Message) r1     // Catch: java.lang.Throwable -> La5
            e.j r1 = r1.data     // Catch: java.lang.Throwable -> La5
            okhttp3.internal.ws.RealWebSocket$Message r5 = (okhttp3.internal.ws.RealWebSocket.Message) r5     // Catch: java.lang.Throwable -> La5
            int r2 = r5.formatOpcode     // Catch: java.lang.Throwable -> La5
            int r3 = r1.mo11655h()     // Catch: java.lang.Throwable -> La5
            long r5 = (long) r3     // Catch: java.lang.Throwable -> La5
            e.C r0 = r0.newMessageSink(r2, r5)     // Catch: java.lang.Throwable -> La5
            e.h r0 = p275e.C2732t.m11744a(r0)     // Catch: java.lang.Throwable -> La5
            r0.mo11676a(r1)     // Catch: java.lang.Throwable -> La5
            r0.close()     // Catch: java.lang.Throwable -> La5
            monitor-enter(r11)     // Catch: java.lang.Throwable -> La5
            long r2 = r11.queueSize     // Catch: java.lang.Throwable -> L83
            int r0 = r1.mo11655h()     // Catch: java.lang.Throwable -> L83
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L83
            long r2 = r2 - r0
            r11.queueSize = r2     // Catch: java.lang.Throwable -> L83
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L83
            goto L9a
        L83:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> La5
        L86:
            boolean r2 = r5 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L9f
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5     // Catch: java.lang.Throwable -> La5
            int r2 = r5.code     // Catch: java.lang.Throwable -> La5
            e.j r3 = r5.reason     // Catch: java.lang.Throwable -> La5
            r0.writeClose(r2, r3)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L9a
            okhttp3.WebSocketListener r0 = r11.listener     // Catch: java.lang.Throwable -> La5
            r0.onClosed(r11, r1, r6)     // Catch: java.lang.Throwable -> La5
        L9a:
            r0 = 1
            okhttp3.internal.Util.closeQuietly(r4)
            return r0
        L9f:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            okhttp3.internal.Util.closeQuietly(r4)
            throw r0
        Laa:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Laa
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame():boolean");
    }

    void writePingFrame() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            int i = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            if (i == -1) {
                try {
                    webSocketWriter.writePing(C2722j.f11399b);
                    return;
                } catch (IOException e2) {
                    failWebSocket(e2, null);
                    return;
                }
            }
            failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
        }
    }
}
