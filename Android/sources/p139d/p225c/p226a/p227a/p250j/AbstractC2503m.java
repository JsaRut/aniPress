package p139d.p225c.p226a.p227a.p250j;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.m */
/* loaded from: classes.dex */
public abstract class AbstractC2503m implements InterfaceC2515y {

    /* renamed from: a */
    private final ArrayList<InterfaceC2515y.b> f10179a = new ArrayList<>(1);

    /* renamed from: b */
    private final InterfaceC2516z.a f10180b = new InterfaceC2516z.a();

    /* renamed from: c */
    private InterfaceC2517k f10181c;

    /* renamed from: d */
    private AbstractC2151P f10182d;

    /* renamed from: e */
    private Object f10183e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC2516z.a m10430a(int i, InterfaceC2515y.a aVar, long j) {
        return this.f10180b.m10490a(i, aVar, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC2516z.a m10431a(InterfaceC2515y.a aVar) {
        return this.f10180b.m10490a(0, aVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC2516z.a m10432a(InterfaceC2515y.a aVar, long j) {
        C2628e.m11111a(aVar != null);
        return this.f10180b.m10490a(0, aVar, j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public final void mo10433a(Handler handler, InterfaceC2516z interfaceC2516z) {
        this.f10180b.m10494a(handler, interfaceC2516z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m10434a(AbstractC2151P abstractC2151P, Object obj) {
        this.f10182d = abstractC2151P;
        this.f10183e = obj;
        Iterator<InterfaceC2515y.b> it = this.f10179a.iterator();
        while (it.hasNext()) {
            it.next().mo9979a(this, abstractC2151P, obj);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public final void mo10435a(InterfaceC2515y.b bVar) {
        this.f10179a.remove(bVar);
        if (this.f10179a.isEmpty()) {
            this.f10181c = null;
            this.f10182d = null;
            this.f10183e = null;
            mo9895b();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public final void mo10436a(InterfaceC2516z interfaceC2516z) {
        this.f10180b.m10498a(interfaceC2516z);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public final void mo10437a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2515y.b bVar, InterfaceC2586E interfaceC2586E) {
        InterfaceC2517k interfaceC2517k2 = this.f10181c;
        C2628e.m11111a(interfaceC2517k2 == null || interfaceC2517k2 == interfaceC2517k);
        this.f10179a.add(bVar);
        if (this.f10181c == null) {
            this.f10181c = interfaceC2517k;
            mo9893a(interfaceC2517k, z, interfaceC2586E);
        } else {
            AbstractC2151P abstractC2151P = this.f10182d;
            if (abstractC2151P != null) {
                bVar.mo9979a(this, abstractC2151P, this.f10183e);
            }
        }
    }

    /* renamed from: a */
    protected abstract void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E);

    /* renamed from: b */
    protected abstract void mo9895b();
}
