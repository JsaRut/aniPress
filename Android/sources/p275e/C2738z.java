package p275e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.z */
/* loaded from: classes.dex */
public final class C2738z {

    /* renamed from: a */
    final byte[] f11437a;

    /* renamed from: b */
    int f11438b;

    /* renamed from: c */
    int f11439c;

    /* renamed from: d */
    boolean f11440d;

    /* renamed from: e */
    boolean f11441e;

    /* renamed from: f */
    C2738z f11442f;

    /* renamed from: g */
    C2738z f11443g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2738z() {
        this.f11437a = new byte[8192];
        this.f11441e = true;
        this.f11440d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2738z(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f11437a = bArr;
        this.f11438b = i;
        this.f11439c = i2;
        this.f11440d = z;
        this.f11441e = z2;
    }

    /* renamed from: a */
    public final C2738z m11755a(int i) {
        C2738z m11640a;
        if (i <= 0 || i > this.f11439c - this.f11438b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            m11640a = m11760c();
        } else {
            m11640a = C2706A.m11640a();
            System.arraycopy(this.f11437a, this.f11438b, m11640a.f11437a, 0, i);
        }
        m11640a.f11439c = m11640a.f11438b + i;
        this.f11438b += i;
        this.f11443g.m11756a(m11640a);
        return m11640a;
    }

    /* renamed from: a */
    public final C2738z m11756a(C2738z c2738z) {
        c2738z.f11443g = this;
        c2738z.f11442f = this.f11442f;
        this.f11442f.f11443g = c2738z;
        this.f11442f = c2738z;
        return c2738z;
    }

    /* renamed from: a */
    public final void m11757a() {
        C2738z c2738z = this.f11443g;
        if (c2738z == this) {
            throw new IllegalStateException();
        }
        if (c2738z.f11441e) {
            int i = this.f11439c - this.f11438b;
            if (i > (8192 - c2738z.f11439c) + (c2738z.f11440d ? 0 : c2738z.f11438b)) {
                return;
            }
            m11758a(this.f11443g, i);
            m11759b();
            C2706A.m11641a(this);
        }
    }

    /* renamed from: a */
    public final void m11758a(C2738z c2738z, int i) {
        if (!c2738z.f11441e) {
            throw new IllegalArgumentException();
        }
        int i2 = c2738z.f11439c;
        if (i2 + i > 8192) {
            if (c2738z.f11440d) {
                throw new IllegalArgumentException();
            }
            int i3 = c2738z.f11438b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c2738z.f11437a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            c2738z.f11439c -= c2738z.f11438b;
            c2738z.f11438b = 0;
        }
        System.arraycopy(this.f11437a, this.f11438b, c2738z.f11437a, c2738z.f11439c, i);
        c2738z.f11439c += i;
        this.f11438b += i;
    }

    /* renamed from: b */
    public final C2738z m11759b() {
        C2738z c2738z = this.f11442f;
        if (c2738z == this) {
            c2738z = null;
        }
        C2738z c2738z2 = this.f11443g;
        c2738z2.f11442f = this.f11442f;
        this.f11442f.f11443g = c2738z2;
        this.f11442f = null;
        this.f11443g = null;
        return c2738z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2738z m11760c() {
        this.f11440d = true;
        return new C2738z(this.f11437a, this.f11438b, this.f11439c, true, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final C2738z m11761d() {
        return new C2738z((byte[]) this.f11437a.clone(), this.f11438b, this.f11439c, false, true);
    }
}
