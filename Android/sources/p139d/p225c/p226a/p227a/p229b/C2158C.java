package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;

/* renamed from: d.c.a.a.b.C */
/* loaded from: classes.dex */
final class C2158C implements InterfaceC2178o {

    /* renamed from: a */
    private int f7760a = -1;

    /* renamed from: b */
    private int f7761b = -1;

    /* renamed from: c */
    private int f7762c = 0;

    /* renamed from: d */
    private ByteBuffer f7763d;

    /* renamed from: e */
    private ByteBuffer f7764e;

    /* renamed from: f */
    private boolean f7765f;

    public C2158C() {
        ByteBuffer byteBuffer = InterfaceC2178o.f7882a;
        this.f7763d = byteBuffer;
        this.f7764e = byteBuffer;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public ByteBuffer mo8797a() {
        ByteBuffer byteBuffer = this.f7764e;
        this.f7764e = InterfaceC2178o.f7882a;
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[ADDED_TO_REGION, LOOP:2: B:24:0x0081->B:25:0x0083, LOOP_START, PHI: r0
  0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0041, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo8798a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f7762c
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.f7763d
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f7763d = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f7763d
            r2.clear()
        L3f:
            int r2 = r7.f7762c
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7763d
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7763d
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7763d
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7763d
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f7763d
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7763d
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f7763d
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f7763d
            r7.f7764e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p229b.C2158C.mo8798a(java.nio.ByteBuffer):void");
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: a */
    public boolean mo8799a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new InterfaceC2178o.a(i, i2, i3);
        }
        if (this.f7760a == i && this.f7761b == i2 && this.f7762c == i3) {
            return false;
        }
        this.f7760a = i;
        this.f7761b = i2;
        this.f7762c = i3;
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: b */
    public int mo8800b() {
        return this.f7761b;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: c */
    public int mo8801c() {
        return this.f7760a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: d */
    public boolean mo8802d() {
        return this.f7765f && this.f7764e == InterfaceC2178o.f7882a;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: e */
    public int mo8803e() {
        return 2;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: f */
    public void mo8804f() {
        this.f7765f = true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void flush() {
        this.f7764e = InterfaceC2178o.f7882a;
        this.f7765f = false;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    /* renamed from: g */
    public boolean mo8805g() {
        int i = this.f7762c;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2178o
    public void reset() {
        flush();
        this.f7760a = -1;
        this.f7761b = -1;
        this.f7762c = 0;
        this.f7763d = InterfaceC2178o.f7882a;
    }
}
