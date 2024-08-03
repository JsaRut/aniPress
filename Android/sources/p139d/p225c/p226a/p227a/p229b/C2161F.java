package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.b.F */
/* loaded from: classes.dex */
public final class C2161F implements InterfaceC2178o {

    /* renamed from: g */
    private C2160E f7808g;

    /* renamed from: k */
    private long f7812k;

    /* renamed from: l */
    private long f7813l;

    /* renamed from: m */
    private boolean f7814m;

    /* renamed from: c */
    private float f7804c = 1.0f;

    /* renamed from: d */
    private float f7805d = 1.0f;

    /* renamed from: a */
    private int f7802a = -1;

    /* renamed from: b */
    private int f7803b = -1;

    /* renamed from: e */
    private int f7806e = -1;

    /* renamed from: h */
    private ByteBuffer f7809h = InterfaceC2178o.f7882a;

    /* renamed from: i */
    private ShortBuffer f7810i = this.f7809h.asShortBuffer();

    /* renamed from: j */
    private ByteBuffer f7811j = InterfaceC2178o.f7882a;

    /* renamed from: f */
    private int f7807f = -1;

    /* renamed from: a */
    public float m8840a(float f) {
        float m11035a = C2622I.m11035a(f, 0.1f, 8.0f);
        if (this.f7805d != m11035a) {
            this.f7805d = m11035a;
            this.f7808g = null;
        }
        flush();
        return m11035a;
    }

    /* renamed from: a */
    public long m8841a(long j) {
        long j2 = this.f7813l;
        if (j2 >= 1024) {
            int i = this.f7806e;
            int i2 = this.f7803b;
            return i == i2 ? C2622I.m11085c(j, this.f7812k, j2) : C2622I.m11085c(j, this.f7812k * i, j2 * i2);
        }
        double d2 = this.f7804c;
        double d3 = j;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return (long) (d2 * d3);
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public ByteBuffer mo8797a() {
        ByteBuffer byteBuffer = this.f7811j;
        this.f7811j = InterfaceC2178o.f7882a;
        return byteBuffer;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public void mo8798a(ByteBuffer byteBuffer) {
        C2628e.m11113b(this.f7808g != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f7812k += remaining;
            this.f7808g.m8838b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int m8837b = this.f7808g.m8837b() * this.f7802a * 2;
        if (m8837b > 0) {
            if (this.f7809h.capacity() < m8837b) {
                this.f7809h = ByteBuffer.allocateDirect(m8837b).order(ByteOrder.nativeOrder());
                this.f7810i = this.f7809h.asShortBuffer();
            } else {
                this.f7809h.clear();
                this.f7810i.clear();
            }
            this.f7808g.m8836a(this.f7810i);
            this.f7813l += m8837b;
            this.f7809h.limit(m8837b);
            this.f7811j = this.f7809h;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public boolean mo8799a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new InterfaceC2178o.a(i, i2, i3);
        }
        int i4 = this.f7807f;
        if (i4 == -1) {
            i4 = i;
        }
        if (this.f7803b == i && this.f7802a == i2 && this.f7806e == i4) {
            return false;
        }
        this.f7803b = i;
        this.f7802a = i2;
        this.f7806e = i4;
        this.f7808g = null;
        return true;
    }

    /* renamed from: b */
    public float m8842b(float f) {
        float m11035a = C2622I.m11035a(f, 0.1f, 8.0f);
        if (this.f7804c != m11035a) {
            this.f7804c = m11035a;
            this.f7808g = null;
        }
        flush();
        return m11035a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: b */
    public int mo8800b() {
        return this.f7802a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: c */
    public int mo8801c() {
        return this.f7806e;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: d */
    public boolean mo8802d() {
        C2160E c2160e;
        return this.f7814m && ((c2160e = this.f7808g) == null || c2160e.m8837b() == 0);
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: e */
    public int mo8803e() {
        return 2;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: f */
    public void mo8804f() {
        C2628e.m11113b(this.f7808g != null);
        this.f7808g.m8839c();
        this.f7814m = true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void flush() {
        if (mo8805g()) {
            C2160E c2160e = this.f7808g;
            if (c2160e == null) {
                this.f7808g = new C2160E(this.f7803b, this.f7802a, this.f7804c, this.f7805d, this.f7806e);
            } else {
                c2160e.m8835a();
            }
        }
        this.f7811j = InterfaceC2178o.f7882a;
        this.f7812k = 0L;
        this.f7813l = 0L;
        this.f7814m = false;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: g */
    public boolean mo8805g() {
        return this.f7803b != -1 && (Math.abs(this.f7804c - 1.0f) >= 0.01f || Math.abs(this.f7805d - 1.0f) >= 0.01f || this.f7806e != this.f7803b);
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void reset() {
        this.f7804c = 1.0f;
        this.f7805d = 1.0f;
        this.f7802a = -1;
        this.f7803b = -1;
        this.f7806e = -1;
        this.f7809h = InterfaceC2178o.f7882a;
        this.f7810i = this.f7809h.asShortBuffer();
        this.f7811j = InterfaceC2178o.f7882a;
        this.f7807f = -1;
        this.f7808g = null;
        this.f7812k = 0L;
        this.f7813l = 0L;
        this.f7814m = false;
    }
}
