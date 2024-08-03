package p139d.p143b.p161d;

/* renamed from: d.b.d.a */
/* loaded from: classes.dex */
public class RunnableC1732a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f6282a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1739h f6283b;

    /* renamed from: c */
    final /* synthetic */ boolean f6284c;

    /* renamed from: d */
    final /* synthetic */ AbstractC1734c f6285d;

    public RunnableC1732a(AbstractC1734c abstractC1734c, boolean z, InterfaceC1739h interfaceC1739h, boolean z2) {
        this.f6285d = abstractC1734c;
        this.f6282a = z;
        this.f6283b = interfaceC1739h;
        this.f6284c = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6282a) {
            this.f6283b.mo7124b(this.f6285d);
        } else if (this.f6284c) {
            this.f6283b.mo7123a(this.f6285d);
        } else {
            this.f6283b.mo7125c(this.f6285d);
        }
    }
}
