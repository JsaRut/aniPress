package p031c.p032a.p064h;

import java.io.EOFException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* renamed from: c.a.h.q */
/* loaded from: classes.dex */
public final class C0657q {

    /* renamed from: a */
    protected long f3054a;

    /* renamed from: b */
    protected SelectionKey f3055b;

    private C0657q(long j) {
        Selector selector;
        SocketChannel open = SocketChannel.open();
        this.f3054a = j;
        try {
            selector = Selector.open();
        } catch (Throwable th) {
            th = th;
            selector = null;
        }
        try {
            open.configureBlocking(false);
            this.f3055b = open.register(selector, 1);
        } catch (Throwable th2) {
            th = th2;
            if (selector != null) {
                selector.close();
            }
            open.close();
            throw th;
        }
    }

    /* renamed from: a */
    private void m3365a() {
        this.f3055b.selector().close();
        this.f3055b.channel().close();
    }

    /* renamed from: a */
    private static void m3366a(SelectionKey selectionKey, long j) {
        long currentTimeMillis = j - System.currentTimeMillis();
        if ((currentTimeMillis > 0 ? selectionKey.selector().select(currentTimeMillis) : currentTimeMillis == 0 ? selectionKey.selector().selectNow() : 0) == 0) {
            throw new SocketTimeoutException();
        }
    }

    /* renamed from: a */
    private byte[] m3367a(int i) {
        SocketChannel socketChannel = (SocketChannel) this.f3055b.channel();
        byte[] bArr = new byte[i];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f3055b.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.f3055b.isReadable()) {
                    long read = socketChannel.read(wrap);
                    if (read < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) read;
                    if (i2 < i && System.currentTimeMillis() > this.f3054a) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    m3366a(this.f3055b, this.f3054a);
                }
            } finally {
                if (this.f3055b.isValid()) {
                    this.f3055b.interestOps(0);
                }
            }
        }
        return bArr;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static byte[] m3368a(SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr, long j) {
        C0657q c0657q = new C0657q(j);
        try {
            SocketChannel socketChannel = (SocketChannel) c0657q.f3055b.channel();
            if (!socketChannel.connect(socketAddress2)) {
                c0657q.f3055b.interestOps(8);
                while (!socketChannel.finishConnect()) {
                    try {
                        if (!c0657q.f3055b.isConnectable()) {
                            m3366a(c0657q.f3055b, c0657q.f3054a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c0657q.f3055b.isValid()) {
                    c0657q.f3055b.interestOps(0);
                }
            }
            SocketChannel socketChannel2 = (SocketChannel) c0657q.f3055b.channel();
            ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) (bArr.length & 255)}), ByteBuffer.wrap(bArr)};
            c0657q.f3055b.interestOps(4);
            int i = 0;
            while (i < bArr.length + 2) {
                try {
                    if (c0657q.f3055b.isWritable()) {
                        long write = socketChannel2.write(byteBufferArr);
                        if (write < 0) {
                            throw new EOFException();
                        }
                        i += (int) write;
                        if (i < bArr.length + 2 && System.currentTimeMillis() > c0657q.f3054a) {
                            throw new SocketTimeoutException();
                        }
                    } else {
                        m3366a(c0657q.f3055b, c0657q.f3054a);
                    }
                } finally {
                    if (c0657q.f3055b.isValid()) {
                        c0657q.f3055b.interestOps(0);
                    }
                }
            }
            if (c0657q.f3055b.isValid()) {
                c0657q.f3055b.interestOps(0);
            }
            byte[] m3367a = c0657q.m3367a(2);
            byte[] m3367a2 = c0657q.m3367a(((m3367a[0] & 255) << 8) + (m3367a[1] & 255));
            c0657q.f3055b.channel();
            return m3367a2;
        } finally {
            c0657q.m3365a();
        }
    }
}
