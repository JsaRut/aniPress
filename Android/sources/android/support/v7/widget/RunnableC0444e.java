package android.support.v7.widget;

/* renamed from: android.support.v7.widget.e */
/* loaded from: classes.dex */
public class RunnableC0444e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2339a;

    public RunnableC0444e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2339a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2339a.m2128h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2339a;
        actionBarOverlayLayout.f1951x = actionBarOverlayLayout.f1932e.animate().translationY(0.0f).setListener(this.f2339a.f1952y);
    }
}
