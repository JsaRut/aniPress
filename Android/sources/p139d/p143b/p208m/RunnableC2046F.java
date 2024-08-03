package p139d.p143b.p208m;

import com.facebook.systrace.C1550a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.F */
/* loaded from: classes.dex */
public class RunnableC2046F implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f7418a;

    /* renamed from: b */
    final /* synthetic */ C2056P f7419b;

    /* renamed from: c */
    final /* synthetic */ C2047G f7420c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2046F(C2047G c2047g, int i, C2056P c2056p) {
        this.f7420c = c2047g;
        this.f7418a = i;
        this.f7419b = c2056p;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1550a.m6463c(0L, "pre_rootView.onAttachedToReactInstance", this.f7418a);
        this.f7419b.m8408a();
    }
}
