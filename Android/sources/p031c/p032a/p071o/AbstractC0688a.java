package p031c.p032a.p071o;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* renamed from: c.a.o.a */
/* loaded from: classes.dex */
public abstract class AbstractC0688a implements Closeable {

    /* renamed from: b */
    protected SocketChannel f3185b;

    /* renamed from: c */
    protected int f3186c;

    /* renamed from: d */
    protected Selector f3187d;

    /* renamed from: f */
    protected int f3189f = 20;

    /* renamed from: a */
    protected ByteBuffer f3184a = ByteBuffer.allocate(49152);

    /* renamed from: e */
    protected boolean f3188e = false;

    /* renamed from: a */
    public int mo3554a(String str, int i) {
        if (this.f3184a == null) {
            this.f3184a = ByteBuffer.allocate(49152);
        }
        this.f3184a.clear();
        this.f3186c = 0;
        this.f3188e = true;
        return 0;
    }

    /* renamed from: a */
    public abstract int mo3555a(byte[] bArr);

    /* renamed from: b */
    public abstract ByteBuffer mo3556b(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final ByteBuffer m3557c(int i) {
        int i2 = this.f3186c;
        if (i2 < i) {
            return null;
        }
        this.f3186c = i2 - i;
        byte[] bArr = new byte[i];
        this.f3184a.flip();
        this.f3184a.get(bArr, 0, i);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f3184a.compact();
        return wrap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3188e = false;
        ByteBuffer byteBuffer = this.f3184a;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f3186c = 0;
    }

    /* renamed from: m */
    public final boolean m3558m() {
        SocketChannel socketChannel;
        return this.f3188e && (socketChannel = this.f3185b) != null && socketChannel.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final int m3559n() {
        if (this.f3186c < this.f3189f) {
            return 0;
        }
        int position = this.f3184a.position();
        this.f3184a.position(0);
        int i = this.f3184a.getShort() & Short.MAX_VALUE;
        this.f3184a.position(position);
        return i;
    }
}
