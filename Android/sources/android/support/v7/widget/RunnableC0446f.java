package android.support.v7.widget;

/* renamed from: android.support.v7.widget.f */
/* loaded from: classes.dex */
public class RunnableC0446f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2341a;

    public RunnableC0446f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2341a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2341a.m2128h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2341a;
        actionBarOverlayLayout.f1951x = actionBarOverlayLayout.f1932e.animate().translationY(-this.f2341a.f1932e.getHeight()).setListener(this.f2341a.f1952y);
    }
}
