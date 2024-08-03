package p139d.p143b.p184i.p192f;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p139d.p143b.p145b.p147b.C1661g;
import p139d.p143b.p145b.p147b.C1664j;
import p139d.p143b.p145b.p147b.InterfaceC1662h;
import p139d.p143b.p145b.p147b.InterfaceC1668n;

/* renamed from: d.b.i.f.b */
/* loaded from: classes.dex */
public class C1885b implements InterfaceC1889f {

    /* renamed from: a */
    private InterfaceC1886c f6878a;

    public C1885b(InterfaceC1886c interfaceC1886c) {
        this.f6878a = interfaceC1886c;
    }

    /* renamed from: a */
    public static C1664j m7672a(C1661g c1661g, InterfaceC1662h interfaceC1662h) {
        return m7673a(c1661g, interfaceC1662h, Executors.newSingleThreadExecutor());
    }

    /* renamed from: a */
    public static C1664j m7673a(C1661g c1661g, InterfaceC1662h interfaceC1662h, Executor executor) {
        return new C1664j(interfaceC1662h, c1661g.m6877h(), new C1664j.b(c1661g.m6880k(), c1661g.m6879j(), c1661g.m6875f()), c1661g.m6873d(), c1661g.m6872c(), c1661g.m6876g(), c1661g.m6874e(), executor, c1661g.m6878i());
    }

    @Override // p139d.p143b.p184i.p192f.InterfaceC1889f
    /* renamed from: a */
    public InterfaceC1668n mo7674a(C1661g c1661g) {
        return m7672a(c1661g, this.f6878a.mo7675a(c1661g));
    }
}
