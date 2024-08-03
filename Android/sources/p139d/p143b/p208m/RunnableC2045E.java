package p139d.p143b.p208m;

import android.os.Process;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.E */
/* loaded from: classes.dex */
public class RunnableC2045E implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2047G f7417a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2045E(C2047G c2047g) {
        this.f7417a = c2047g;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(0);
    }
}
