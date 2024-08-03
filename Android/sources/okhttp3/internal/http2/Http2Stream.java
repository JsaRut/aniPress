package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import p275e.C2711F;
import p275e.C2715c;
import p275e.C2719g;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    private boolean hasResponseHeaders;
    private Header.Listener headersListener;

    /* renamed from: id */
    final int f11448id;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    private final Deque<Headers> headersQueue = new ArrayDeque();
    final StreamTimeout readTimeout = new StreamTimeout();
    final StreamTimeout writeTimeout = new StreamTimeout();
    ErrorCode errorCode = null;

    /* loaded from: classes.dex */
    public final class FramingSink implements InterfaceC2708C {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final C2719g sendBuffer = new C2719g();

        FramingSink() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        private void emitFrame(boolean z) {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } finally {
                    }
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.f11448id, (z && min == this.sendBuffer.size()) ? true : $assertionsDisabled, this.sendBuffer, min);
            } finally {
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                if (!Http2Stream.this.sink.finished) {
                    if (this.sendBuffer.size() > 0) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else {
                        Http2Stream http2Stream = Http2Stream.this;
                        http2Stream.connection.writeData(http2Stream.f11448id, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.connection.flush();
                Http2Stream.this.cancelStreamIfNecessary();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2708C, java.io.Flushable
        public void flush() {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame($assertionsDisabled);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // p275e.InterfaceC2708C
        public C2711F timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // p275e.InterfaceC2708C
        public void write(C2719g c2719g, long j) {
            this.sendBuffer.write(c2719g, j);
            while (this.sendBuffer.size() >= EMIT_BUFFER_SIZE) {
                emitFrame($assertionsDisabled);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class FramingSource implements InterfaceC2709D {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final C2719g receiveBuffer = new C2719g();
        private final C2719g readBuffer = new C2719g();

        FramingSource(long j) {
            this.maxByteCount = j;
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            ArrayList arrayList;
            Header.Listener listener;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.m11712m();
                arrayList = null;
                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                    listener = null;
                } else {
                    arrayList = new ArrayList(Http2Stream.this.headersQueue);
                    Http2Stream.this.headersQueue.clear();
                    listener = Http2Stream.this.headersListener;
                }
                Http2Stream.this.notifyAll();
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listener.onHeaders((Headers) it.next());
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:            if (r11 == (-1)) goto L189;     */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:            updateConnectionFlowControl(r11);     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:            return r11;     */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:            if (r0 != null) goto L191;     */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:            return -1;     */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:            throw new okhttp3.internal.http2.StreamResetException(r0);     */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:            throw new java.io.IOException("stream closed");     */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2709D
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(p275e.C2719g r18, long r19) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(e.g, long):long");
        }

        void receive(InterfaceC2721i interfaceC2721i, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.size() + j > this.maxByteCount;
                }
                if (z3) {
                    interfaceC2721i.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    interfaceC2721i.skip(j);
                    return;
                }
                long read = interfaceC2721i.read(this.receiveBuffer, j);
                if (read == -1) {
                    throw new EOFException();
                }
                j -= read;
                synchronized (Http2Stream.this) {
                    if (this.readBuffer.size() != 0) {
                        z2 = false;
                    }
                    this.readBuffer.mo11671a(this.receiveBuffer);
                    if (z2) {
                        Http2Stream.this.notifyAll();
                    }
                }
            }
        }

        @Override // p275e.InterfaceC2709D
        public C2711F timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    /* loaded from: classes.dex */
    public class StreamTimeout extends C2715c {
        StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // p275e.C2715c
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p275e.C2715c
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        if (http2Connection == null) {
            throw new NullPointerException("connection == null");
        }
        this.f11448id = i;
        this.connection = http2Connection;
        this.bytesLeftInWriteWindow = http2Connection.peerSettings.getInitialWindowSize();
        this.source = new FramingSource(http2Connection.okHttpSettings.getInitialWindowSize());
        this.sink = new FramingSink();
        this.source.finished = z2;
        this.sink.finished = z;
        if (headers != null) {
            this.headersQueue.add(headers);
        }
        if (isLocallyInitiated() && headers != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!isLocallyInitiated() && headers == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            notifyAll();
            this.connection.removeStream(this.f11448id);
            return true;
        }
    }

    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    void cancelStreamIfNecessary() {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            z = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else {
            if (isOpen) {
                return;
            }
            this.connection.removeStream(this.f11448id);
        }
    }

    void checkOutNotClosed() {
        FramingSink framingSink = this.sink;
        if (framingSink.closed) {
            throw new IOException("stream closed");
        }
        if (framingSink.finished) {
            throw new IOException("stream finished");
        }
        ErrorCode errorCode = this.errorCode;
        if (errorCode != null) {
            throw new StreamResetException(errorCode);
        }
    }

    public void close(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.f11448id, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.f11448id, errorCode);
        }
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.f11448id;
    }

    public InterfaceC2708C getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public InterfaceC2709D getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        return this.connection.client == ((this.f11448id & 1) == 1);
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && (this.sink.finished || this.sink.closed)) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    public C2711F readTimeout() {
        return this.readTimeout;
    }

    public void receiveData(InterfaceC2721i interfaceC2721i, int i) {
        this.source.receive(interfaceC2721i, i);
    }

    public void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (isOpen) {
            return;
        }
        this.connection.removeStream(this.f11448id);
    }

    public void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (isOpen) {
            return;
        }
        this.connection.removeStream(this.f11448id);
    }

    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public synchronized void setHeadersListener(Header.Listener listener) {
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public synchronized Headers takeHeaders() {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (this.headersQueue.isEmpty()) {
            throw new StreamResetException(this.errorCode);
        }
        return this.headersQueue.removeFirst();
    }

    void waitForIo() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void writeHeaders(List<Header> list, boolean z) {
        boolean z2;
        boolean z3;
        if (list == null) {
            throw new NullPointerException("headers == null");
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z) {
                z2 = false;
                z3 = false;
            } else {
                this.sink.finished = true;
                z2 = true;
                z3 = true;
            }
        }
        if (!z2) {
            synchronized (this.connection) {
                z2 = this.connection.bytesLeftInWriteWindow == 0;
            }
        }
        this.connection.writeSynReply(this.f11448id, z3, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public C2711F writeTimeout() {
        return this.writeTimeout;
    }
}
