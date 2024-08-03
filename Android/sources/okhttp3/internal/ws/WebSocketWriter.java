package okhttp3.internal.ws;

import java.io.IOException;
import java.util.Random;
import p275e.C2711F;
import p275e.C2719g;
import p275e.C2722j;
import p275e.InterfaceC2708C;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
final class WebSocketWriter {
    boolean activeWriter;
    final C2719g buffer = new C2719g();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final C2719g.a maskCursor;
    private final byte[] maskKey;
    final Random random;
    final InterfaceC2720h sink;
    final C2719g sinkBuffer;
    boolean writerClosed;

    /* loaded from: classes.dex */
    final class FrameSink implements InterfaceC2708C {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                throw new IOException("closed");
            }
            WebSocketWriter webSocketWriter = WebSocketWriter.this;
            webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, true);
            this.closed = true;
            WebSocketWriter.this.activeWriter = false;
        }

        @Override // p275e.InterfaceC2708C, java.io.Flushable
        public void flush() {
            if (this.closed) {
                throw new IOException("closed");
            }
            WebSocketWriter webSocketWriter = WebSocketWriter.this;
            webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, false);
            this.isFirstFrame = false;
        }

        @Override // p275e.InterfaceC2708C
        public C2711F timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // p275e.InterfaceC2708C
        public void write(C2719g c2719g, long j) {
            if (this.closed) {
                throw new IOException("closed");
            }
            WebSocketWriter.this.buffer.write(c2719g, j);
            boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.size() > this.contentLength - 8192;
            long m11713n = WebSocketWriter.this.buffer.m11713n();
            if (m11713n <= 0 || z) {
                return;
            }
            WebSocketWriter.this.writeMessageFrame(this.formatOpcode, m11713n, this.isFirstFrame, false);
            this.isFirstFrame = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, InterfaceC2720h interfaceC2720h, Random random) {
        if (interfaceC2720h == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.isClient = z;
        this.sink = interfaceC2720h;
        this.sinkBuffer = interfaceC2720h.mo11674a();
        this.random = random;
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C2719g.a() : null;
    }

    private void writeControlFrame(int i, C2722j c2722j) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int mo11655h = c2722j.mo11655h();
        if (mo11655h > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.writeByte(i | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(mo11655h | 128);
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.write(this.maskKey);
            if (mo11655h > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.mo11676a(c2722j);
                this.sinkBuffer.m11673a(this.maskCursor);
                this.maskCursor.m11717h(size);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(mo11655h);
            this.sinkBuffer.mo11676a(c2722j);
        }
        this.sink.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC2708C newMessageSink(int i, long j) {
        if (this.activeWriter) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.activeWriter = true;
        FrameSink frameSink = this.frameSink;
        frameSink.formatOpcode = i;
        frameSink.contentLength = j;
        frameSink.isFirstFrame = true;
        frameSink.closed = false;
        return frameSink;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeClose(int i, C2722j c2722j) {
        C2722j c2722j2 = C2722j.f11399b;
        if (i != 0 || c2722j != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            C2719g c2719g = new C2719g();
            c2719g.writeShort(i);
            if (c2722j != null) {
                c2719g.mo11676a(c2722j);
            }
            c2722j2 = c2719g.m11714o();
        }
        try {
            writeControlFrame(8, c2722j2);
        } finally {
            this.writerClosed = true;
        }
    }

    void writeMessageFrame(int i, long j, boolean z, boolean z2) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.sinkBuffer.writeByte(i);
        int i2 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.writeByte(((int) j) | i2);
        } else if (j <= 65535) {
            this.sinkBuffer.writeByte(i2 | 126);
            this.sinkBuffer.writeShort((int) j);
        } else {
            this.sinkBuffer.writeByte(i2 | 127);
            this.sinkBuffer.m11710k(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.write(this.maskKey);
            if (j > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.write(this.buffer, j);
                this.sinkBuffer.m11673a(this.maskCursor);
                this.maskCursor.m11717h(size);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.write(this.buffer, j);
        }
        this.sink.mo11689b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePing(C2722j c2722j) {
        writeControlFrame(9, c2722j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePong(C2722j c2722j) {
        writeControlFrame(10, c2722j);
    }
}
