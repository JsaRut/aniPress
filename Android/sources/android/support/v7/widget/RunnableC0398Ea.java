package android.support.v7.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.Ea */
/* loaded from: classes.dex */
public class RunnableC0398Ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewOnLongClickListenerC0402Ga f2025a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0398Ea(ViewOnLongClickListenerC0402Ga viewOnLongClickListenerC0402Ga) {
        this.f2025a = viewOnLongClickListenerC0402Ga;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2025a.m2201a(false);
    }
}
