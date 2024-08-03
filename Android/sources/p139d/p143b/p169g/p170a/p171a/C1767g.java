package p139d.p143b.p169g.p170a.p171a;

import android.content.Context;
import android.content.res.Resources;
import java.util.Set;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p150b.C1678f;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p169g.p174b.C1770b;
import p139d.p143b.p169g.p175c.InterfaceC1779g;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p192f.C1893j;
import p139d.p143b.p184i.p192f.C1898o;
import p139d.p143b.p184i.p195i.InterfaceC1916a;
import p139d.p143b.p184i.p196j.AbstractC1918b;

/* renamed from: d.b.g.a.a.g */
/* loaded from: classes.dex */
public class C1767g implements InterfaceC1694m<C1766f> {

    /* renamed from: a */
    private final Context f6405a;

    /* renamed from: b */
    private final C1893j f6406b;

    /* renamed from: c */
    private final C1768h f6407c;

    /* renamed from: d */
    private final Set<InterfaceC1779g> f6408d;

    public C1767g(Context context, C1762b c1762b) {
        this(context, C1898o.m7782f(), c1762b);
    }

    public C1767g(Context context, C1898o c1898o, C1762b c1762b) {
        this(context, c1898o, null, c1762b);
    }

    public C1767g(Context context, C1898o c1898o, Set<InterfaceC1779g> set, C1762b c1762b) {
        this.f6405a = context;
        this.f6406b = c1898o.m7793e();
        if (c1762b != null) {
            c1762b.m7206c();
            throw null;
        }
        this.f6407c = new C1768h();
        C1768h c1768h = this.f6407c;
        Resources resources = context.getResources();
        C1770b m7248b = C1770b.m7248b();
        InterfaceC1916a m7789a = c1898o.m7789a(context);
        C1678f m6945b = C1678f.m6945b();
        InterfaceC1844A<InterfaceC1648d, AbstractC1918b> m7695d = this.f6406b.m7695d();
        if (c1762b != null) {
            c1762b.m7204a();
            throw null;
        }
        if (c1762b != null) {
            c1762b.m7205b();
            throw null;
        }
        c1768h.m7245a(resources, m7248b, m7789a, m6945b, m7695d, null, null);
        this.f6408d = set;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public C1766f get() {
        return new C1766f(this.f6405a, this.f6407c, this.f6406b, this.f6408d);
    }
}
