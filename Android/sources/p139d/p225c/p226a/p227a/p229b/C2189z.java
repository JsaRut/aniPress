package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.b.z */
/* loaded from: classes.dex */
final class C2189z implements InterfaceC2178o {

    /* renamed from: a */
    private static final int f8001a = Float.floatToIntBits(Float.NaN);

    /* renamed from: b */
    private int f8002b = -1;

    /* renamed from: c */
    private int f8003c = -1;

    /* renamed from: d */
    private int f8004d = 0;

    /* renamed from: e */
    private ByteBuffer f8005e;

    /* renamed from: f */
    private ByteBuffer f8006f;

    /* renamed from: g */
    private boolean f8007g;

    public C2189z() {
        ByteBuffer byteBuffer = InterfaceC2178o.f7882a;
        this.f8005e = byteBuffer;
        this.f8006f = byteBuffer;
    }

    /* renamed from: a */
    private static void m8998a(int i, ByteBuffer byteBuffer) {
        double d2 = i;
        Double.isNaN(d2);
        int floatToIntBits = Float.floatToIntBits((float) (d2 * 4.656612875245797E-10d));
        if (floatToIntBits == f8001a) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public ByteBuffer mo8797a() {
        ByteBuffer byteBuffer = this.f8006f;
        this.f8006f = InterfaceC2178o.f7882a;
        return byteBuffer;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public void mo8798a(ByteBuffer byteBuffer) {
        boolean z = this.f8004d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.f8005e.capacity() < i) {
            this.f8005e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f8005e.clear();
        }
        if (z) {
            while (position < limit) {
                m8998a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f8005e);
                position += 4;
            }
        } else {
            while (position < limit) {
                m8998a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f8005e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f8005e.flip();
        this.f8006f = this.f8005e;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public boolean mo8799a(int i, int i2, int i3) {
        if (!C2622I.m11091e(i3)) {
            throw new InterfaceC2178o.a(i, i2, i3);
        }
        if (this.f8002b == i && this.f8003c == i2 && this.f8004d == i3) {
            return false;
        }
        this.f8002b = i;
        this.f8003c = i2;
        this.f8004d = i3;
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: b */
    public int mo8800b() {
        return this.f8003c;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: c */
    public int mo8801c() {
        return this.f8002b;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: d */
    public boolean mo8802d() {
        return this.f8007g && this.f8006f == InterfaceC2178o.f7882a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: e */
    public int mo8803e() {
        return 4;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: f */
    public void mo8804f() {
        this.f8007g = true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void flush() {
        this.f8006f = InterfaceC2178o.f7882a;
        this.f8007g = false;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: g */
    public boolean mo8805g() {
        return C2622I.m11091e(this.f8004d);
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void reset() {
        flush();
        this.f8002b = -1;
        this.f8003c = -1;
        this.f8004d = 0;
        this.f8005e = InterfaceC2178o.f7882a;
    }
}
