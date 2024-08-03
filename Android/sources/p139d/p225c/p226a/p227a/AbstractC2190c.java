package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2640q;

/* renamed from: d.c.a.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC2190c implements InterfaceC2143H, InterfaceC2144I {

    /* renamed from: a */
    private final int f8008a;

    /* renamed from: b */
    private C2145J f8009b;

    /* renamed from: c */
    private int f8010c;

    /* renamed from: d */
    private int f8011d;

    /* renamed from: e */
    private InterfaceC2404E f8012e;

    /* renamed from: f */
    private C2676s[] f8013f;

    /* renamed from: g */
    private long f8014g;

    /* renamed from: h */
    private boolean f8015h = true;

    /* renamed from: i */
    private boolean f8016i;

    public AbstractC2190c(int i) {
        this.f8008a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static boolean m8999a(InterfaceC2215o<?> interfaceC2215o, C2213m c2213m) {
        if (c2213m == null) {
            return true;
        }
        if (interfaceC2215o == null) {
            return false;
        }
        return interfaceC2215o.mo9087a(c2213m);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final int m9000a(C2677t c2677t, C2196f c2196f, boolean z) {
        int mo9960a = this.f8012e.mo9960a(c2677t, c2196f, z);
        if (mo9960a == -4) {
            if (c2196f.m9010d()) {
                this.f8015h = true;
                return this.f8016i ? -4 : -3;
            }
            c2196f.f8041d += this.f8014g;
        } else if (mo9960a == -5) {
            C2676s c2676s = c2677t.f11202a;
            long j = c2676s.f11186k;
            if (j != Long.MAX_VALUE) {
                c2677t.f11202a = c2676s.m11439a(j + this.f8014g);
            }
        }
        return mo9960a;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public /* synthetic */ void mo8560a(float f) {
        C2142G.m8559a(this, f);
    }

    @Override // p139d.p225c.p226a.p227a.C2141F.b
    /* renamed from: a */
    public void mo8558a(int i, Object obj) {
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public final void mo8561a(long j) {
        this.f8016i = false;
        this.f8015h = false;
        mo8779a(j, false);
    }

    /* renamed from: a */
    protected abstract void mo8779a(long j, boolean z);

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public final void mo8563a(C2145J c2145j, C2676s[] c2676sArr, InterfaceC2404E interfaceC2404E, long j, boolean z, long j2) {
        C2628e.m11113b(this.f8011d == 0);
        this.f8009b = c2145j;
        this.f8011d = 1;
        mo8784a(z);
        mo8564a(c2676sArr, interfaceC2404E, j2);
        mo8779a(j, z);
    }

    /* renamed from: a */
    protected void mo8784a(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8785a(C2676s[] c2676sArr, long j) {
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public final void mo8564a(C2676s[] c2676sArr, InterfaceC2404E interfaceC2404E, long j) {
        C2628e.m11113b(!this.f8016i);
        this.f8012e = interfaceC2404E;
        this.f8015h = false;
        this.f8013f = c2676sArr;
        this.f8014g = j;
        mo8785a(c2676sArr, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m9001b(long j) {
        return this.f8012e.mo9963d(j - this.f8014g);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: e */
    public final void mo8567e() {
        C2628e.m11113b(this.f8011d == 1);
        this.f8011d = 0;
        this.f8012e = null;
        this.f8013f = null;
        this.f8016i = false;
        mo8791s();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H, p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: f */
    public final int mo8568f() {
        return this.f8008a;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: g */
    public final boolean mo8569g() {
        return this.f8015h;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    public final int getState() {
        return this.f8011d;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: h */
    public final void mo8570h() {
        this.f8016i = true;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: i */
    public final InterfaceC2144I mo8571i() {
        return this;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: j */
    public final InterfaceC2404E mo8572j() {
        return this.f8012e;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: k */
    public final void mo8573k() {
        this.f8012e.mo9961a();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: l */
    public final boolean mo8574l() {
        return this.f8016i;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: m */
    public InterfaceC2640q mo8575m() {
        return null;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: n */
    public int mo8577n() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final C2145J m9002o() {
        return this.f8009b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final int m9003p() {
        return this.f8010c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final C2676s[] m9004q() {
        return this.f8013f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean m9005r() {
        return this.f8015h ? this.f8016i : this.f8012e.mo9962c();
    }

    /* renamed from: s */
    protected abstract void mo8791s();

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    public final void setIndex(int i) {
        this.f8010c = i;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    public final void start() {
        C2628e.m11113b(this.f8011d == 1);
        this.f8011d = 2;
        mo8792t();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    public final void stop() {
        C2628e.m11113b(this.f8011d == 2);
        this.f8011d = 1;
        mo8793u();
    }

    /* renamed from: t */
    protected void mo8792t() {
    }

    /* renamed from: u */
    protected void mo8793u() {
    }
}
