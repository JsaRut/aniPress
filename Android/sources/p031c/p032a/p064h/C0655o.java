package p031c.p032a.p064h;

/* renamed from: c.a.h.o */
/* loaded from: classes.dex */
public final class C0655o extends AbstractC0650j {

    /* renamed from: f */
    private int f3047f;

    /* renamed from: g */
    private int f3048g;

    /* renamed from: h */
    private int f3049h;

    /* renamed from: i */
    private C0648h f3050i;

    @Override // p031c.p032a.p064h.AbstractC0650j
    /* renamed from: a */
    public final String mo3336a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f3047f + " ");
        stringBuffer.append(this.f3048g + " ");
        stringBuffer.append(this.f3049h + " ");
        stringBuffer.append(this.f3050i);
        return stringBuffer.toString();
    }

    @Override // p031c.p032a.p064h.AbstractC0650j
    /* renamed from: a */
    final void mo3338a(C0643c c0643c) {
        this.f3047f = c0643c.m3279g();
        this.f3048g = c0643c.m3279g();
        this.f3049h = c0643c.m3279g();
        this.f3050i = new C0648h(c0643c);
    }

    @Override // p031c.p032a.p064h.AbstractC0650j
    /* renamed from: a */
    final void mo3340a(C0644d c0644d, boolean z) {
        c0644d.m3291c(this.f3047f);
        c0644d.m3291c(this.f3048g);
        c0644d.m3291c(this.f3049h);
        this.f3050i.m3323a(c0644d, (C0641a) null, true);
    }

    /* renamed from: h */
    public final int m3362h() {
        return this.f3049h;
    }

    /* renamed from: i */
    public final C0648h m3363i() {
        return this.f3050i;
    }
}
