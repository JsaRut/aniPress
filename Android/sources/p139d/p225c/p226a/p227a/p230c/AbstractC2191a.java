package p139d.p225c.p226a.p227a.p230c;

/* renamed from: d.c.a.a.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC2191a {

    /* renamed from: a */
    private int f8017a;

    /* renamed from: b */
    public void mo9006b() {
        this.f8017a = 0;
    }

    /* renamed from: b */
    public final void m9007b(int i) {
        this.f8017a = i | this.f8017a;
    }

    /* renamed from: c */
    public final void m9008c(int i) {
        this.f8017a = (i ^ (-1)) & this.f8017a;
    }

    /* renamed from: c */
    public final boolean m9009c() {
        return m9011d(Integer.MIN_VALUE);
    }

    /* renamed from: d */
    public final boolean m9010d() {
        return m9011d(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m9011d(int i) {
        return (this.f8017a & i) == i;
    }

    /* renamed from: e */
    public final void m9012e(int i) {
        this.f8017a = i;
    }

    /* renamed from: e */
    public final boolean m9013e() {
        return m9011d(1);
    }
}
