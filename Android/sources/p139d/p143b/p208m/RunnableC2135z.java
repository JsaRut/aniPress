package p139d.p143b.p208m;

import p139d.p143b.p208m.C2047G;

/* renamed from: d.b.m.z */
/* loaded from: classes.dex */
class RunnableC2135z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC2042B f7626a;

    public RunnableC2135z(RunnableC2042B runnableC2042B) {
        this.f7626a = runnableC2042B;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2047G.a aVar;
        C2047G.a aVar2;
        aVar = this.f7626a.f7412b.f7423c;
        if (aVar != null) {
            C2047G c2047g = this.f7626a.f7412b;
            aVar2 = c2047g.f7423c;
            c2047g.m8332a(aVar2);
            this.f7626a.f7412b.f7423c = null;
        }
    }
}
