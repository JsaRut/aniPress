package p139d.p225c.p226a.p227a.p268l;

import p139d.p225c.p226a.p227a.InterfaceC2144I;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.l.m */
/* loaded from: classes.dex */
public abstract class AbstractC2579m {

    /* renamed from: a */
    private a f10729a;

    /* renamed from: b */
    private InterfaceC2592f f10730b;

    /* renamed from: d.c.a.a.l.m$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo10892a();
    }

    /* renamed from: a */
    public abstract C2580n mo10876a(InterfaceC2144I[] interfaceC2144IArr, C2413N c2413n);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC2592f m10889a() {
        InterfaceC2592f interfaceC2592f = this.f10730b;
        C2628e.m11110a(interfaceC2592f);
        return interfaceC2592f;
    }

    /* renamed from: a */
    public final void m10890a(a aVar, InterfaceC2592f interfaceC2592f) {
        this.f10729a = aVar;
        this.f10730b = interfaceC2592f;
    }

    /* renamed from: a */
    public abstract void mo10877a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m10891b() {
        a aVar = this.f10729a;
        if (aVar != null) {
            aVar.mo10892a();
        }
    }
}
