package com.facebook.react.views.viewpager;

import android.view.View;

/* renamed from: com.facebook.react.views.viewpager.d */
/* loaded from: classes.dex */
public class RunnableC1520d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1521e f5629a;

    public RunnableC1520d(C1521e c1521e) {
        this.f5629a = c1521e;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1521e c1521e = this.f5629a;
        c1521e.measure(View.MeasureSpec.makeMeasureSpec(c1521e.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5629a.getHeight(), 1073741824));
        C1521e c1521e2 = this.f5629a;
        c1521e2.layout(c1521e2.getLeft(), this.f5629a.getTop(), this.f5629a.getRight(), this.f5629a.getBottom());
    }
}
