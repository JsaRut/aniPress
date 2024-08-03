package p139d.p143b.p169g.p170a.p171a;

import android.content.res.Resources;
import java.util.concurrent.Executor;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1686e;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p169g.p174b.C1770b;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p195i.InterfaceC1916a;
import p139d.p143b.p184i.p196j.AbstractC1918b;

/* renamed from: d.b.g.a.a.h */
/* loaded from: classes.dex */
public class C1768h {

    /* renamed from: a */
    private Resources f6409a;

    /* renamed from: b */
    private C1770b f6410b;

    /* renamed from: c */
    private InterfaceC1916a f6411c;

    /* renamed from: d */
    private Executor f6412d;

    /* renamed from: e */
    private InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f6413e;

    /* renamed from: f */
    private C1686e<InterfaceC1916a> f6414f;

    /* renamed from: g */
    private InterfaceC1694m<Boolean> f6415g;

    /* renamed from: a */
    public C1764d m7243a() {
        C1764d m7244a = m7244a(this.f6409a, this.f6410b, this.f6411c, this.f6412d, this.f6413e, this.f6414f);
        InterfaceC1694m<Boolean> interfaceC1694m = this.f6415g;
        if (interfaceC1694m != null) {
            m7244a.m7229b(interfaceC1694m.get().booleanValue());
        }
        return m7244a;
    }

    /* renamed from: a */
    protected C1764d m7244a(Resources resources, C1770b c1770b, InterfaceC1916a interfaceC1916a, Executor executor, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, C1686e<InterfaceC1916a> c1686e) {
        return new C1764d(resources, c1770b, interfaceC1916a, executor, interfaceC1844A, c1686e);
    }

    /* renamed from: a */
    public void m7245a(Resources resources, C1770b c1770b, InterfaceC1916a interfaceC1916a, Executor executor, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, C1686e<InterfaceC1916a> c1686e, InterfaceC1694m<Boolean> interfaceC1694m) {
        this.f6409a = resources;
        this.f6410b = c1770b;
        this.f6411c = interfaceC1916a;
        this.f6412d = executor;
        this.f6413e = interfaceC1844A;
        this.f6414f = c1686e;
        this.f6415g = interfaceC1694m;
    }
}
