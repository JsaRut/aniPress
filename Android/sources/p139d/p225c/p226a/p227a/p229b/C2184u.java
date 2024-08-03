package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.b.u */
/* loaded from: classes.dex */
final class C2184u implements InterfaceC2178o {

    /* renamed from: a */
    private int f7925a;

    /* renamed from: b */
    private int f7926b;

    /* renamed from: c */
    private int[] f7927c;

    /* renamed from: d */
    private boolean f7928d;

    /* renamed from: e */
    private int[] f7929e;

    /* renamed from: f */
    private ByteBuffer f7930f;

    /* renamed from: g */
    private ByteBuffer f7931g;

    /* renamed from: h */
    private boolean f7932h;

    public C2184u() {
        ByteBuffer byteBuffer = InterfaceC2178o.f7882a;
        this.f7930f = byteBuffer;
        this.f7931g = byteBuffer;
        this.f7925a = -1;
        this.f7926b = -1;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public ByteBuffer mo8797a() {
        ByteBuffer byteBuffer = this.f7931g;
        this.f7931g = InterfaceC2178o.f7882a;
        return byteBuffer;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public void mo8798a(ByteBuffer byteBuffer) {
        C2628e.m11113b(this.f7929e != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f7925a * 2)) * this.f7929e.length * 2;
        if (this.f7930f.capacity() < length) {
            this.f7930f = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7930f.clear();
        }
        while (position < limit) {
            for (int i : this.f7929e) {
                this.f7930f.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f7925a * 2;
        }
        byteBuffer.position(limit);
        this.f7930f.flip();
        this.f7931g = this.f7930f;
    }

    /* renamed from: a */
    public void m8950a(int[] iArr) {
        this.f7927c = iArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public boolean mo8799a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f7927c, this.f7929e);
        this.f7929e = this.f7927c;
        if (this.f7929e == null) {
            this.f7928d = false;
            return z;
        }
        if (i3 != 2) {
            throw new InterfaceC2178o.a(i, i2, i3);
        }
        if (!z && this.f7926b == i && this.f7925a == i2) {
            return false;
        }
        this.f7926b = i;
        this.f7925a = i2;
        this.f7928d = i2 != this.f7929e.length;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f7929e;
            if (i4 >= iArr.length) {
                return true;
            }
            int i5 = iArr[i4];
            if (i5 >= i2) {
                throw new InterfaceC2178o.a(i, i2, i3);
            }
            this.f7928d = (i5 != i4) | this.f7928d;
            i4++;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: b */
    public int mo8800b() {
        int[] iArr = this.f7929e;
        return iArr == null ? this.f7925a : iArr.length;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: c */
    public int mo8801c() {
        return this.f7926b;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: d */
    public boolean mo8802d() {
        return this.f7932h && this.f7931g == InterfaceC2178o.f7882a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: e */
    public int mo8803e() {
        return 2;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: f */
    public void mo8804f() {
        this.f7932h = true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void flush() {
        this.f7931g = InterfaceC2178o.f7882a;
        this.f7932h = false;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: g */
    public boolean mo8805g() {
        return this.f7928d;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void reset() {
        flush();
        this.f7930f = InterfaceC2178o.f7882a;
        this.f7925a = -1;
        this.f7926b = -1;
        this.f7929e = null;
        this.f7927c = null;
        this.f7928d = false;
    }
}
