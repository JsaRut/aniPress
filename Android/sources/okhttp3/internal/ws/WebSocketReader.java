package okhttp3.internal.ws;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p275e.C2719g;
import p275e.C2722j;
import p275e.InterfaceC2721i;

/* loaded from: classes.dex */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final C2719g.a maskCursor;
    private final byte[] maskKey;
    int opcode;
    final InterfaceC2721i source;
    private final C2719g controlFrameBuffer = new C2719g();
    private final C2719g messageFrameBuffer = new C2719g();

    /* loaded from: classes.dex */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(C2722j c2722j);

        void onReadMessage(String str);

        void onReadPing(C2722j c2722j);

        void onReadPong(C2722j c2722j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReader(boolean z, InterfaceC2721i interfaceC2721i, FrameCallback frameCallback) {
        if (interfaceC2721i == null) {
            throw new NullPointerException("source == null");
        }
        if (frameCallback == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.isClient = z;
        this.source = interfaceC2721i;
        this.frameCallback = frameCallback;
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new C2719g.a();
    }

    private void readControlFrame() {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo11685a(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.m11673a(this.maskCursor);
                this.maskCursor.m11717h(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long size = this.controlFrameBuffer.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s = this.controlFrameBuffer.readShort();
                    str = this.controlFrameBuffer.m11715p();
                    String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        throw new ProtocolException(closeCodeExceptionMessage);
                    }
                } else {
                    str = "";
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.m11714o());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.m11714o());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() {
        if (this.closed) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int readByte = this.source.readByte() & 255;
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            this.opcode = readByte & 15;
            this.isFinalFrame = (readByte & 128) != 0;
            this.isControlFrame = (readByte & 8) != 0;
            if (this.isControlFrame && !this.isFinalFrame) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z = (readByte & 64) != 0;
            boolean z2 = (readByte & 32) != 0;
            boolean z3 = (readByte & 16) != 0;
            if (z || z2 || z3) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            boolean z4 = ((this.source.readByte() & 255) & 128) != 0;
            boolean z5 = this.isClient;
            if (z4 == z5) {
                throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            this.frameLength = r0 & 127;
            long j = this.frameLength;
            if (j == 126) {
                this.frameLength = this.source.readShort() & 65535;
            } else if (j == 127) {
                this.frameLength = this.source.readLong();
                if (this.frameLength < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z4) {
                this.source.readFully(this.maskKey);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo11685a(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.m11673a(this.maskCursor);
                    this.maskCursor.m11717h(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        readMessage();
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m11715p());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m11714o());
        }
    }

    private void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
