package com.facebook.react.views.toolbar;

import android.view.View;

/* renamed from: com.facebook.react.views.toolbar.e */
/* loaded from: classes.dex */
public class RunnableC1505e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1506f f5541a;

    public RunnableC1505e(C1506f c1506f) {
        this.f5541a = c1506f;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1506f c1506f = this.f5541a;
        c1506f.measure(View.MeasureSpec.makeMeasureSpec(c1506f.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5541a.getHeight(), 1073741824));
        C1506f c1506f2 = this.f5541a;
        c1506f2.layout(c1506f2.getLeft(), this.f5541a.getTop(), this.f5541a.getRight(), this.f5541a.getBottom());
    }
}
