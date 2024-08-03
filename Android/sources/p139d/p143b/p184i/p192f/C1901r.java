package p139d.p143b.p184i.p192f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p194h.InterfaceC1910d;
import p139d.p143b.p184i.p194h.InterfaceC1912f;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p200n.C1933A;
import p139d.p143b.p184i.p200n.C1936Ba;
import p139d.p143b.p184i.p200n.C1938Ca;
import p139d.p143b.p184i.p200n.C1944Fa;
import p139d.p143b.p184i.p200n.C1946Ga;
import p139d.p143b.p184i.p200n.C1951J;
import p139d.p143b.p184i.p200n.C1953K;
import p139d.p143b.p184i.p200n.C1954Ka;
import p139d.p143b.p184i.p200n.C1955L;
import p139d.p143b.p184i.p200n.C1958O;
import p139d.p143b.p184i.p200n.C1962T;
import p139d.p143b.p184i.p200n.C1963U;
import p139d.p143b.p184i.p200n.C1966X;
import p139d.p143b.p184i.p200n.C1971b;
import p139d.p143b.p184i.p200n.C1974ca;
import p139d.p143b.p184i.p200n.C1981g;
import p139d.p143b.p184i.p200n.C1982ga;
import p139d.p143b.p184i.p200n.C1983h;
import p139d.p143b.p184i.p200n.C1984ha;
import p139d.p143b.p184i.p200n.C1987j;
import p139d.p143b.p184i.p200n.C1989k;
import p139d.p143b.p184i.p200n.C1992la;
import p139d.p143b.p184i.p200n.C1993m;
import p139d.p143b.p184i.p200n.C1997o;
import p139d.p143b.p184i.p200n.C1999p;
import p139d.p143b.p184i.p200n.C2004ra;
import p139d.p143b.p184i.p200n.C2010ua;
import p139d.p143b.p184i.p200n.C2011v;
import p139d.p143b.p184i.p200n.C2015x;
import p139d.p143b.p184i.p200n.C2018ya;
import p139d.p143b.p184i.p200n.C2019z;
import p139d.p143b.p184i.p200n.InterfaceC1948Ha;
import p139d.p143b.p184i.p200n.InterfaceC1976da;
import p139d.p143b.p184i.p200n.InterfaceC1996na;

/* renamed from: d.b.i.f.r */
/* loaded from: classes.dex */
public class C1901r {

    /* renamed from: a */
    private ContentResolver f6999a;

    /* renamed from: b */
    private Resources f7000b;

    /* renamed from: c */
    private AssetManager f7001c;

    /* renamed from: d */
    private final InterfaceC1704a f7002d;

    /* renamed from: e */
    private final InterfaceC1910d f7003e;

    /* renamed from: f */
    private final InterfaceC1912f f7004f;

    /* renamed from: g */
    private final boolean f7005g;

    /* renamed from: h */
    private final boolean f7006h;

    /* renamed from: i */
    private final boolean f7007i;

    /* renamed from: j */
    private final InterfaceC1888e f7008j;

    /* renamed from: k */
    private final InterfaceC1711h f7009k;

    /* renamed from: l */
    private final C1862l f7010l;

    /* renamed from: m */
    private final C1862l f7011m;

    /* renamed from: n */
    private final InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> f7012n;

    /* renamed from: o */
    private final InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f7013o;

    /* renamed from: p */
    private final InterfaceC1863m f7014p;

    /* renamed from: q */
    private final AbstractC1842f f7015q;

    /* renamed from: r */
    private final int f7016r;

    /* renamed from: s */
    private final int f7017s;

    /* renamed from: t */
    private boolean f7018t;

    public C1901r(Context context, InterfaceC1704a interfaceC1704a, InterfaceC1910d interfaceC1910d, InterfaceC1912f interfaceC1912f, boolean z, boolean z2, boolean z3, InterfaceC1888e interfaceC1888e, InterfaceC1711h interfaceC1711h, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> interfaceC1844A2, C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m, AbstractC1842f abstractC1842f, int i, int i2, boolean z4) {
        this.f6999a = context.getApplicationContext().getContentResolver();
        this.f7000b = context.getApplicationContext().getResources();
        this.f7001c = context.getApplicationContext().getAssets();
        this.f7002d = interfaceC1704a;
        this.f7003e = interfaceC1910d;
        this.f7004f = interfaceC1912f;
        this.f7005g = z;
        this.f7006h = z2;
        this.f7007i = z3;
        this.f7008j = interfaceC1888e;
        this.f7009k = interfaceC1711h;
        this.f7013o = interfaceC1844A;
        this.f7012n = interfaceC1844A2;
        this.f7010l = c1862l;
        this.f7011m = c1862l2;
        this.f7014p = interfaceC1863m;
        this.f7015q = abstractC1842f;
        this.f7016r = i;
        this.f7017s = i2;
        this.f7018t = z4;
    }

    /* renamed from: a */
    public static C1971b m7800a(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C1971b(interfaceC1996na);
    }

    /* renamed from: a */
    public static C1993m m7801a(InterfaceC1996na<C1920d> interfaceC1996na, InterfaceC1996na<C1920d> interfaceC1996na2) {
        return new C1993m(interfaceC1996na, interfaceC1996na2);
    }

    /* renamed from: n */
    public static <T> C2018ya<T> m7802n(InterfaceC1996na<T> interfaceC1996na) {
        return new C2018ya<>(interfaceC1996na);
    }

    /* renamed from: a */
    public <T> C1936Ba<T> m7803a(InterfaceC1996na<T> interfaceC1996na, C1938Ca c1938Ca) {
        return new C1936Ba<>(interfaceC1996na, c1938Ca);
    }

    /* renamed from: a */
    public C1946Ga m7804a(InterfaceC1948Ha<C1920d>[] interfaceC1948HaArr) {
        return new C1946Ga(interfaceC1948HaArr);
    }

    /* renamed from: a */
    public C1974ca m7805a(InterfaceC1976da interfaceC1976da) {
        return new C1974ca(this.f7009k, this.f7002d, interfaceC1976da);
    }

    /* renamed from: a */
    public C1997o m7806a() {
        return new C1997o(this.f7009k);
    }

    /* renamed from: a */
    public C2010ua m7807a(InterfaceC1996na<C1920d> interfaceC1996na, boolean z, boolean z2) {
        return new C2010ua(this.f7008j.mo7669c(), this.f7009k, z && !this.f7005g, interfaceC1996na, z2);
    }

    /* renamed from: b */
    public C1951J m7808b() {
        return new C1951J(this.f7008j.mo7671e(), this.f7009k, this.f7001c);
    }

    /* renamed from: b */
    public C1981g m7809b(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return new C1981g(this.f7013o, this.f7014p, interfaceC1996na);
    }

    /* renamed from: c */
    public C1953K m7810c() {
        return new C1953K(this.f7008j.mo7671e(), this.f7009k, this.f6999a);
    }

    /* renamed from: c */
    public C1983h m7811c(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return new C1983h(this.f7014p, interfaceC1996na);
    }

    /* renamed from: d */
    public C1955L m7812d() {
        return new C1955L(this.f7008j.mo7671e(), this.f7009k, this.f6999a);
    }

    /* renamed from: d */
    public C1987j m7813d(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return new C1987j(this.f7013o, this.f7014p, interfaceC1996na);
    }

    /* renamed from: e */
    public C1958O m7814e() {
        return new C1958O(this.f7008j.mo7671e(), this.f7009k, this.f6999a);
    }

    /* renamed from: e */
    public C1989k m7815e(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return new C1989k(interfaceC1996na, this.f7016r, this.f7017s, this.f7018t);
    }

    /* renamed from: f */
    public C1962T m7816f() {
        return new C1962T(this.f7008j.mo7671e(), this.f7009k);
    }

    /* renamed from: f */
    public C1999p m7817f(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C1999p(this.f7002d, this.f7008j.mo7667a(), this.f7003e, this.f7004f, this.f7005g, this.f7006h, this.f7007i, interfaceC1996na);
    }

    /* renamed from: g */
    public C1963U m7818g() {
        return new C1963U(this.f7008j.mo7671e(), this.f7009k, this.f7000b);
    }

    /* renamed from: g */
    public C2011v m7819g(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C2011v(this.f7010l, this.f7011m, this.f7014p, interfaceC1996na);
    }

    /* renamed from: h */
    public C1966X m7820h() {
        return new C1966X(this.f7008j.mo7671e(), this.f6999a);
    }

    /* renamed from: h */
    public C2015x m7821h(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C2015x(this.f7010l, this.f7011m, this.f7014p, interfaceC1996na);
    }

    /* renamed from: i */
    public C2004ra m7822i() {
        return new C2004ra(this.f7008j.mo7671e(), this.f7009k, this.f6999a);
    }

    /* renamed from: i */
    public C2019z m7823i(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C2019z(this.f7014p, interfaceC1996na);
    }

    /* renamed from: j */
    public C1933A m7824j(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C1933A(this.f7012n, this.f7014p, interfaceC1996na);
    }

    /* renamed from: k */
    public C1982ga m7825k(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C1982ga(this.f7010l, this.f7014p, this.f7009k, this.f7002d, interfaceC1996na);
    }

    /* renamed from: l */
    public C1984ha m7826l(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return new C1984ha(this.f7013o, this.f7014p, interfaceC1996na);
    }

    /* renamed from: m */
    public C1992la m7827m(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return new C1992la(interfaceC1996na, this.f7015q, this.f7008j.mo7669c());
    }

    /* renamed from: o */
    public <T> C1944Fa<T> m7828o(InterfaceC1996na<T> interfaceC1996na) {
        return new C1944Fa<>(5, this.f7008j.mo7668b(), interfaceC1996na);
    }

    /* renamed from: p */
    public C1954Ka m7829p(InterfaceC1996na<C1920d> interfaceC1996na) {
        return new C1954Ka(this.f7008j.mo7669c(), this.f7009k, interfaceC1996na);
    }
}
