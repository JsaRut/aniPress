package p139d.p225c.p226a.p227a.p250j.p253c;

import p139d.p225c.p226a.p227a.p234f.C2230b;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2442h;

/* renamed from: d.c.a.a.j.c.i */
/* loaded from: classes.dex */
public final class C2456i implements InterfaceC2455h {

    /* renamed from: a */
    private final C2230b f9745a;

    /* renamed from: b */
    private final long f9746b;

    public C2456i(C2230b c2230b, long j) {
        this.f9745a = c2230b;
        this.f9746b = j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: a */
    public long mo10107a(long j) {
        return this.f9745a.f8187e[(int) j] - this.f9746b;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: a */
    public long mo10108a(long j, long j2) {
        return this.f9745a.f8186d[(int) j];
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: a */
    public boolean mo10109a() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: b */
    public long mo10110b() {
        return 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: b */
    public long mo10111b(long j, long j2) {
        return this.f9745a.m9186c(j + this.f9746b);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: b */
    public C2442h mo10112b(long j) {
        return new C2442h(null, this.f9745a.f8185c[(int) j], r0.f8184b[r9]);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2455h
    /* renamed from: c */
    public int mo10113c(long j) {
        return this.f9745a.f8183a;
    }
}
