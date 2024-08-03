package p139d.p225c.p226a.p227a.p269m;

import android.content.Context;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;

/* renamed from: d.c.a.a.m.s */
/* loaded from: classes.dex */
public final class C2605s implements InterfaceC2597k.a {

    /* renamed from: a */
    private final Context f10829a;

    /* renamed from: b */
    private final InterfaceC2586E f10830b;

    /* renamed from: c */
    private final InterfaceC2597k.a f10831c;

    public C2605s(Context context, InterfaceC2586E interfaceC2586E, InterfaceC2597k.a aVar) {
        this.f10829a = context.getApplicationContext();
        this.f10830b = interfaceC2586E;
        this.f10831c = aVar;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k.a
    /* renamed from: a */
    public C2604r mo10923a() {
        C2604r c2604r = new C2604r(this.f10829a, this.f10831c.mo10923a());
        InterfaceC2586E interfaceC2586E = this.f10830b;
        if (interfaceC2586E != null) {
            c2604r.mo10300a(interfaceC2586E);
        }
        return c2604r;
    }
}
