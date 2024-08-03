package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.b.G */
/* loaded from: classes.dex */
final class C2162G implements InterfaceC2178o {

    /* renamed from: a */
    private boolean f7815a;

    /* renamed from: b */
    private int f7816b;

    /* renamed from: c */
    private int f7817c;

    /* renamed from: d */
    private int f7818d;

    /* renamed from: e */
    private int f7819e;

    /* renamed from: f */
    private int f7820f;

    /* renamed from: g */
    private boolean f7821g;

    /* renamed from: h */
    private int f7822h;

    /* renamed from: i */
    private ByteBuffer f7823i;

    /* renamed from: j */
    private ByteBuffer f7824j;

    /* renamed from: k */
    private byte[] f7825k;

    /* renamed from: l */
    private int f7826l;

    /* renamed from: m */
    private boolean f7827m;

    /* renamed from: n */
    private long f7828n;

    public C2162G() {
        ByteBuffer byteBuffer = InterfaceC2178o.f7882a;
        this.f7823i = byteBuffer;
        this.f7824j = byteBuffer;
        this.f7818d = -1;
        this.f7819e = -1;
        this.f7825k = C2622I.f10921f;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public ByteBuffer mo8797a() {
        ByteBuffer byteBuffer = this.f7824j;
        if (this.f7827m && this.f7826l > 0 && byteBuffer == InterfaceC2178o.f7882a) {
            int capacity = this.f7823i.capacity();
            int i = this.f7826l;
            if (capacity < i) {
                this.f7823i = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f7823i.clear();
            }
            this.f7823i.put(this.f7825k, 0, this.f7826l);
            this.f7826l = 0;
            this.f7823i.flip();
            byteBuffer = this.f7823i;
        }
        this.f7824j = InterfaceC2178o.f7882a;
        return byteBuffer;
    }

    /* renamed from: a */
    public void m8843a(int i, int i2) {
        this.f7816b = i;
        this.f7817c = i2;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public void mo8798a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        this.f7821g = true;
        int min = Math.min(i, this.f7822h);
        this.f7828n += min / this.f7820f;
        this.f7822h -= min;
        byteBuffer.position(position + min);
        if (this.f7822h > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f7826l + i2) - this.f7825k.length;
        if (this.f7823i.capacity() < length) {
            this.f7823i = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7823i.clear();
        }
        int m11038a = C2622I.m11038a(length, 0, this.f7826l);
        this.f7823i.put(this.f7825k, 0, m11038a);
        int m11038a2 = C2622I.m11038a(length - m11038a, 0, i2);
        byteBuffer.limit(byteBuffer.position() + m11038a2);
        this.f7823i.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - m11038a2;
        this.f7826l -= m11038a;
        byte[] bArr = this.f7825k;
        System.arraycopy(bArr, m11038a, bArr, 0, this.f7826l);
        byteBuffer.get(this.f7825k, this.f7826l, i3);
        this.f7826l += i3;
        this.f7823i.flip();
        this.f7824j = this.f7823i;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public boolean mo8799a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new InterfaceC2178o.a(i, i2, i3);
        }
        if (this.f7826l > 0) {
            this.f7828n += r8 / this.f7820f;
        }
        this.f7818d = i2;
        this.f7819e = i;
        this.f7820f = C2622I.m11075b(2, i2);
        int i4 = this.f7817c;
        int i5 = this.f7820f;
        this.f7825k = new byte[i4 * i5];
        this.f7826l = 0;
        int i6 = this.f7816b;
        this.f7822h = i5 * i6;
        boolean z = this.f7815a;
        this.f7815a = (i6 == 0 && i4 == 0) ? false : true;
        this.f7821g = false;
        return z != this.f7815a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: b */
    public int mo8800b() {
        return this.f7818d;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: c */
    public int mo8801c() {
        return this.f7819e;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: d */
    public boolean mo8802d() {
        return this.f7827m && this.f7826l == 0 && this.f7824j == InterfaceC2178o.f7882a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: e */
    public int mo8803e() {
        return 2;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: f */
    public void mo8804f() {
        this.f7827m = true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void flush() {
        this.f7824j = InterfaceC2178o.f7882a;
        this.f7827m = false;
        if (this.f7821g) {
            this.f7822h = 0;
        }
        this.f7826l = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: g */
    public boolean mo8805g() {
        return this.f7815a;
    }

    /* renamed from: h */
    public long m8844h() {
        return this.f7828n;
    }

    /* renamed from: i */
    public void m8845i() {
        this.f7828n = 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void reset() {
        flush();
        this.f7823i = InterfaceC2178o.f7882a;
        this.f7818d = -1;
        this.f7819e = -1;
        this.f7825k = C2622I.f10921f;
    }
}
