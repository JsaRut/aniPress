package android.support.v7.widget;

/* renamed from: android.support.v7.widget.Y */
/* loaded from: classes.dex */
class C0434Y {

    /* renamed from: a */
    private int f2293a = 0;

    /* renamed from: b */
    private int f2294b = 0;

    /* renamed from: c */
    private int f2295c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2296d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2297e = 0;

    /* renamed from: f */
    private int f2298f = 0;

    /* renamed from: g */
    private boolean f2299g = false;

    /* renamed from: h */
    private boolean f2300h = false;

    /* renamed from: a */
    public int m2422a() {
        return this.f2299g ? this.f2293a : this.f2294b;
    }

    /* renamed from: a */
    public void m2423a(int i, int i2) {
        this.f2300h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2297e = i;
            this.f2293a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2298f = i2;
            this.f2294b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:            if (r2 != Integer.MIN_VALUE) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:            if (r2 != Integer.MIN_VALUE) goto L25;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2424a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f2299g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f2299g = r2
            boolean r0 = r1.f2300h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f2296d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f2297e
        L16:
            r1.f2293a = r2
            int r2 = r1.f2295c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f2295c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f2297e
        L24:
            r1.f2293a = r2
            int r2 = r1.f2296d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f2297e
            r1.f2293a = r2
        L2f:
            int r2 = r1.f2298f
        L31:
            r1.f2294b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0434Y.m2424a(boolean):void");
    }

    /* renamed from: b */
    public int m2425b() {
        return this.f2293a;
    }

    /* renamed from: b */
    public void m2426b(int i, int i2) {
        this.f2295c = i;
        this.f2296d = i2;
        this.f2300h = true;
        if (this.f2299g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2293a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2294b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2293a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2294b = i2;
        }
    }

    /* renamed from: c */
    public int m2427c() {
        return this.f2294b;
    }

    /* renamed from: d */
    public int m2428d() {
        return this.f2299g ? this.f2294b : this.f2293a;
    }
}
