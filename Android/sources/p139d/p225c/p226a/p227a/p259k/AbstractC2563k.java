package p139d.p225c.p226a.p227a.p259k;

import java.util.List;
import p139d.p225c.p226a.p227a.p230c.AbstractC2197g;

/* renamed from: d.c.a.a.k.k */
/* loaded from: classes.dex */
public abstract class AbstractC2563k extends AbstractC2197g implements InterfaceC2537e {

    /* renamed from: d */
    private InterfaceC2537e f10617d;

    /* renamed from: e */
    private long f10618e;

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10603a() {
        return this.f10617d.mo10603a();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10604a(long j) {
        return this.f10617d.mo10604a(j - this.f10618e);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public long mo10605a(int i) {
        return this.f10617d.mo10605a(i) + this.f10618e;
    }

    /* renamed from: a */
    public void m10794a(long j, InterfaceC2537e interfaceC2537e, long j2) {
        this.f8043b = j;
        this.f10617d = interfaceC2537e;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f8043b;
        }
        this.f10618e = j2;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: b */
    public List<C2527b> mo10606b(long j) {
        return this.f10617d.mo10606b(j - this.f10618e);
    }

    @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2191a
    /* renamed from: b */
    public void mo9006b() {
        super.mo9006b();
        this.f10617d = null;
    }
}
