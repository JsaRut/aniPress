package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p275e.C2719g;
import p275e.InterfaceC2720h;

/* loaded from: classes.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C2719g hpackBuffer = new C2719g();
    final Hpack.Writer hpackWriter = new Hpack.Writer(this.hpackBuffer);
    private int maxFrameSize = 16384;
    private final InterfaceC2720h sink;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Writer(InterfaceC2720h interfaceC2720h, boolean z) {
        this.sink = interfaceC2720h;
        this.client = z;
    }

    private void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.maxFrameSize, j);
            long j2 = min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    private static void writeMedium(InterfaceC2720h interfaceC2720h, int i) {
        interfaceC2720h.writeByte((i >>> 16) & 255);
        interfaceC2720h.writeByte((i >>> 8) & 255);
        interfaceC2720h.writeByte(i & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
        if (settings.getHeaderTableSize() != -1) {
            this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
        }
        frameHeader(0, 0, (byte) 4, (byte) 1);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.mo11650c()));
            }
            this.sink.write(Http2.CONNECTION_PREFACE.mo11657j());
            this.sink.flush();
        }
    }

    public synchronized void data(boolean z, int i, C2719g c2719g, int i2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i, z ? (byte) 1 : (byte) 0, c2719g, i2);
    }

    void dataFrame(int i, byte b2, C2719g c2719g, int i2) {
        frameHeader(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.sink.write(c2719g, i2);
        }
    }

    public synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public void frameHeader(int i, int i2, byte b2, byte b3) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b2, b3));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        writeMedium(this.sink, i2);
        this.sink.writeByte(b2 & 255);
        this.sink.writeByte(b3 & 255);
        this.sink.writeInt(i & Integer.MAX_VALUE);
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.sink.writeInt(i);
        this.sink.writeInt(errorCode.httpCode);
        if (bArr.length > 0) {
            this.sink.write(bArr);
        }
        this.sink.flush();
    }

    public synchronized void headers(int i, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        headers(false, i, list);
    }

    void headers(boolean z, int i, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        int min = (int) Math.min(this.maxFrameSize, size);
        long j = min;
        byte b2 = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        frameHeader(i, min, (byte) 1, b2);
        this.sink.write(this.hpackBuffer, j);
        if (size > j) {
            writeContinuationFrames(i, size - j);
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z, int i, int i2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.sink.writeInt(i);
        this.sink.writeInt(i2);
        this.sink.flush();
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        int min = (int) Math.min(this.maxFrameSize - 4, size);
        long j = min;
        frameHeader(i, min + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.sink.writeInt(i2 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j);
        if (size > j) {
            writeContinuationFrames(i, size - j);
        }
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        frameHeader(i, 4, (byte) 3, (byte) 0);
        this.sink.writeInt(errorCode.httpCode);
        this.sink.flush();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public synchronized void settings(Settings settings) {
        if (this.closed) {
            throw new IOException("closed");
        }
        int i = 0;
        frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (settings.isSet(i)) {
                this.sink.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                this.sink.writeInt(settings.get(i));
            }
            i++;
        }
        this.sink.flush();
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        headers(z, i, list);
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        headers(z, i, list);
    }

    public synchronized void windowUpdate(int i, long j) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        frameHeader(i, 4, (byte) 8, (byte) 0);
        this.sink.writeInt((int) j);
        this.sink.flush();
    }
}
