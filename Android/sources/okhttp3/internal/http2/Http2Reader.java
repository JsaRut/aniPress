package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import p275e.C2711F;
import p275e.C2719g;
import p275e.C2722j;
import p275e.InterfaceC2709D;
import p275e.InterfaceC2721i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final InterfaceC2721i source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ContinuationSource implements InterfaceC2709D {
        byte flags;
        int left;
        int length;
        short padding;
        private final InterfaceC2721i source;
        int streamId;

        ContinuationSource(InterfaceC2721i interfaceC2721i) {
            this.source = interfaceC2721i;
        }

        private void readContinuationHeader() {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte readByte = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, readByte, this.flags));
            }
            this.streamId = this.source.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            }
            if (this.streamId == i) {
                return;
            }
            Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            while (true) {
                int i = this.left;
                if (i != 0) {
                    long read = this.source.read(c2719g, Math.min(j, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left = (int) (this.left - read);
                    return read;
                }
                this.source.skip(this.padding);
                this.padding = (short) 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        @Override // p275e.InterfaceC2709D
        public C2711F timeout() {
            return this.source.timeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, C2722j c2722j, String str2, int i2, long j);

        void data(boolean z, int i, InterfaceC2721i interfaceC2721i, int i2);

        void goAway(int i, ErrorCode errorCode, C2722j c2722j);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Reader(InterfaceC2721i interfaceC2721i, boolean z) {
        this.source = interfaceC2721i;
        this.client = z;
        this.continuation = new ContinuationSource(this.source);
        this.hpackReader = new Hpack.Reader(4096, this.continuation);
    }

    static int lengthWithoutPadding(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    private void readData(Handler handler, int i, byte b2, int i2) {
        if (i2 == 0) {
            Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
        handler.data(z, i2, this.source, lengthWithoutPadding(i, b2, readByte));
        this.source.skip(readByte);
    }

    private void readGoAway(Handler handler, int i, byte b2, int i2) {
        if (i < 8) {
            Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i3 = i - 8;
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        }
        C2722j c2722j = C2722j.f11399b;
        if (i3 > 0) {
            c2722j = this.source.mo11682a(i3);
        }
        handler.goAway(readInt, fromHttp2, c2722j);
    }

    private List<Header> readHeaderBlock(int i, short s, byte b2, int i2) {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i;
        continuationSource.length = i;
        continuationSource.padding = s;
        continuationSource.flags = b2;
        continuationSource.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(Handler handler, int i, byte b2, int i2) {
        if (i2 == 0) {
            Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        short readByte = (b2 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            readPriority(handler, i2);
            i -= 5;
        }
        handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b2, readByte), readByte, b2, i2));
    }

    static int readMedium(InterfaceC2721i interfaceC2721i) {
        return (interfaceC2721i.readByte() & 255) | ((interfaceC2721i.readByte() & 255) << 16) | ((interfaceC2721i.readByte() & 255) << 8);
    }

    private void readPing(Handler handler, int i, byte b2, int i2) {
        if (i != 8) {
            Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        handler.ping((b2 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private void readPriority(Handler handler, int i) {
        int readInt = this.source.readInt();
        handler.priority(i, readInt & Integer.MAX_VALUE, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void readPriority(Handler handler, int i, byte b2, int i2) {
        if (i != 5) {
            Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            readPriority(handler, i2);
        } else {
            Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void readPushPromise(Handler handler, int i, byte b2, int i2) {
        if (i2 == 0) {
            Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
        handler.pushPromise(i2, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i - 4, b2, readByte), readByte, b2, i2));
    }

    private void readRstStream(Handler handler, int i, byte b2, int i2) {
        if (i != 4) {
            Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int readInt = this.source.readInt();
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
        if (fromHttp2 != null) {
            handler.rstStream(i2, fromHttp2);
        } else {
            Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void readSettings(Handler handler, int i, byte b2, int i2) {
        if (i2 != 0) {
            Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b2 & 1) != 0) {
            if (i == 0) {
                handler.ackSettings();
                return;
            } else {
                Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        Settings settings = new Settings();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int readShort = this.source.readShort() & 65535;
            int readInt = this.source.readInt();
            switch (readShort) {
                case 2:
                    if (readInt != 0 && readInt != 1) {
                        Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    break;
                case 3:
                    readShort = 4;
                    break;
                case 4:
                    readShort = 7;
                    if (readInt < 0) {
                        Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    break;
                case 5:
                    if (readInt < 16384 || readInt > 16777215) {
                        Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                    break;
                    break;
            }
            settings.set(readShort, readInt);
        }
        handler.settings(false, settings);
    }

    private void readWindowUpdate(Handler handler, int i, byte b2, int i2) {
        if (i != 4) {
            Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long readInt = this.source.readInt() & 2147483647L;
        if (readInt != 0) {
            handler.windowUpdate(i2, readInt);
        } else {
            Http2.ioException("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public boolean nextFrame(boolean z, Handler handler) {
        try {
            this.source.mo11700f(9L);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
                throw null;
            }
            byte readByte = (byte) (this.source.readByte() & 255);
            if (z && readByte != 4) {
                Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.source.readByte() & 255);
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.frameLog(true, readInt, readMedium, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    readData(handler, readMedium, readByte2, readInt);
                    return true;
                case 1:
                    readHeaders(handler, readMedium, readByte2, readInt);
                    return true;
                case 2:
                    readPriority(handler, readMedium, readByte2, readInt);
                    return true;
                case 3:
                    readRstStream(handler, readMedium, readByte2, readInt);
                    return true;
                case 4:
                    readSettings(handler, readMedium, readByte2, readInt);
                    return true;
                case 5:
                    readPushPromise(handler, readMedium, readByte2, readInt);
                    return true;
                case 6:
                    readPing(handler, readMedium, readByte2, readInt);
                    return true;
                case 7:
                    readGoAway(handler, readMedium, readByte2, readInt);
                    return true;
                case 8:
                    readWindowUpdate(handler, readMedium, readByte2, readInt);
                    return true;
                default:
                    this.source.skip(readMedium);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public void readConnectionPreface(Handler handler) {
        if (this.client) {
            if (nextFrame(true, handler)) {
                return;
            }
            Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        C2722j mo11682a = this.source.mo11682a(Http2.CONNECTION_PREFACE.mo11655h());
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.format("<< CONNECTION %s", mo11682a.mo11650c()));
        }
        if (Http2.CONNECTION_PREFACE.equals(mo11682a)) {
            return;
        }
        Http2.ioException("Expected a connection header but was %s", mo11682a.mo11658k());
        throw null;
    }
}
