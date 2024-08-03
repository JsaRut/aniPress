package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.b.D */
/* loaded from: classes.dex */
public final class C2159D implements InterfaceC2178o {

    /* renamed from: a */
    private int f7766a;

    /* renamed from: b */
    private int f7767b;

    /* renamed from: c */
    private int f7768c;

    /* renamed from: d */
    private boolean f7769d;

    /* renamed from: e */
    private ByteBuffer f7770e;

    /* renamed from: f */
    private ByteBuffer f7771f;

    /* renamed from: g */
    private boolean f7772g;

    /* renamed from: h */
    private byte[] f7773h;

    /* renamed from: i */
    private byte[] f7774i;

    /* renamed from: j */
    private int f7775j;

    /* renamed from: k */
    private int f7776k;

    /* renamed from: l */
    private int f7777l;

    /* renamed from: m */
    private boolean f7778m;

    /* renamed from: n */
    private long f7779n;

    public C2159D() {
        ByteBuffer byteBuffer = InterfaceC2178o.f7882a;
        this.f7770e = byteBuffer;
        this.f7771f = byteBuffer;
        this.f7766a = -1;
        this.f7767b = -1;
        byte[] bArr = C2622I.f10921f;
        this.f7773h = bArr;
        this.f7774i = bArr;
    }

    /* renamed from: a */
    private int m8806a(long j) {
        return (int) ((j * this.f7767b) / 1000000);
    }

    /* renamed from: a */
    private void m8807a(int i) {
        if (this.f7770e.capacity() < i) {
            this.f7770e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7770e.clear();
        }
        if (i > 0) {
            this.f7778m = true;
        }
    }

    /* renamed from: a */
    private void m8808a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f7777l);
        int i2 = this.f7777l - min;
        System.arraycopy(bArr, i - i2, this.f7774i, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f7774i, i2, min);
    }

    /* renamed from: a */
    private void m8809a(byte[] bArr, int i) {
        m8807a(i);
        this.f7770e.put(bArr, 0, i);
        this.f7770e.flip();
        this.f7771f = this.f7770e;
    }

    /* renamed from: b */
    private int m8810b(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i = this.f7768c;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    /* renamed from: c */
    private int m8811c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.f7768c;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: d */
    private void m8812d(ByteBuffer byteBuffer) {
        m8807a(byteBuffer.remaining());
        this.f7770e.put(byteBuffer);
        this.f7770e.flip();
        this.f7771f = this.f7770e;
    }

    /* renamed from: e */
    private void m8813e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m8811c = m8811c(byteBuffer);
        int position = m8811c - byteBuffer.position();
        byte[] bArr = this.f7773h;
        int length = bArr.length;
        int i = this.f7776k;
        int i2 = length - i;
        if (m8811c < limit && position < i2) {
            m8809a(bArr, i);
            this.f7776k = 0;
            this.f7775j = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f7773h, this.f7776k, min);
        this.f7776k += min;
        int i3 = this.f7776k;
        byte[] bArr2 = this.f7773h;
        if (i3 == bArr2.length) {
            if (this.f7778m) {
                m8809a(bArr2, this.f7777l);
                this.f7779n += (this.f7776k - (this.f7777l * 2)) / this.f7768c;
            } else {
                this.f7779n += (i3 - this.f7777l) / this.f7768c;
            }
            m8808a(byteBuffer, this.f7773h, this.f7776k);
            this.f7776k = 0;
            this.f7775j = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: f */
    private void m8814f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f7773h.length));
        int m8810b = m8810b(byteBuffer);
        if (m8810b == byteBuffer.position()) {
            this.f7775j = 1;
        } else {
            byteBuffer.limit(m8810b);
            m8812d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: g */
    private void m8815g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m8811c = m8811c(byteBuffer);
        byteBuffer.limit(m8811c);
        this.f7779n += byteBuffer.remaining() / this.f7768c;
        m8808a(byteBuffer, this.f7774i, this.f7777l);
        if (m8811c < limit) {
            m8809a(this.f7774i, this.f7777l);
            this.f7775j = 0;
            byteBuffer.limit(limit);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public ByteBuffer mo8797a() {
        ByteBuffer byteBuffer = this.f7771f;
        this.f7771f = InterfaceC2178o.f7882a;
        return byteBuffer;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public void mo8798a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.f7771f.hasRemaining()) {
            int i = this.f7775j;
            if (i == 0) {
                m8814f(byteBuffer);
            } else if (i == 1) {
                m8813e(byteBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                m8815g(byteBuffer);
            }
        }
    }

    /* renamed from: a */
    public void m8816a(boolean z) {
        this.f7769d = z;
        flush();
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public boolean mo8799a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new InterfaceC2178o.a(i, i2, i3);
        }
        if (this.f7767b == i && this.f7766a == i2) {
            return false;
        }
        this.f7767b = i;
        this.f7766a = i2;
        this.f7768c = i2 * 2;
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: b */
    public int mo8800b() {
        return this.f7766a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: c */
    public int mo8801c() {
        return this.f7767b;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: d */
    public boolean mo8802d() {
        return this.f7772g && this.f7771f == InterfaceC2178o.f7882a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: e */
    public int mo8803e() {
        return 2;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: f */
    public void mo8804f() {
        this.f7772g = true;
        int i = this.f7776k;
        if (i > 0) {
            m8809a(this.f7773h, i);
        }
        if (this.f7778m) {
            return;
        }
        this.f7779n += this.f7777l / this.f7768c;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void flush() {
        if (mo8805g()) {
            int m8806a = m8806a(150000L) * this.f7768c;
            if (this.f7773h.length != m8806a) {
                this.f7773h = new byte[m8806a];
            }
            this.f7777l = m8806a(20000L) * this.f7768c;
            int length = this.f7774i.length;
            int i = this.f7777l;
            if (length != i) {
                this.f7774i = new byte[i];
            }
        }
        this.f7775j = 0;
        this.f7771f = InterfaceC2178o.f7882a;
        this.f7772g = false;
        this.f7779n = 0L;
        this.f7776k = 0;
        this.f7778m = false;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: g */
    public boolean mo8805g() {
        return this.f7767b != -1 && this.f7769d;
    }

    /* renamed from: h */
    public long m8817h() {
        return this.f7779n;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void reset() {
        this.f7769d = false;
        flush();
        this.f7770e = InterfaceC2178o.f7882a;
        this.f7766a = -1;
        this.f7767b = -1;
        this.f7777l = 0;
        byte[] bArr = C2622I.f10921f;
        this.f7773h = bArr;
        this.f7774i = bArr;
    }
}
