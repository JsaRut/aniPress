package android.support.v4.app;

import android.view.View;

/* renamed from: android.support.v4.app.u */
/* loaded from: classes.dex */
class RunnableC0214u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0215v f874a;

    public RunnableC0214u(C0215v c0215v) {
        this.f874a = c0215v;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f874a.f876c.m978g() != null) {
            this.f874a.f876c.m949a((View) null);
            C0215v c0215v = this.f874a;
            LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = c0215v.f877d;
            ComponentCallbacksC0205l componentCallbacksC0205l = c0215v.f876c;
            layoutInflaterFactory2C0219z.m1117a(componentCallbacksC0205l, componentCallbacksC0205l.m1005y(), 0, 0, false);
        }
    }
}
