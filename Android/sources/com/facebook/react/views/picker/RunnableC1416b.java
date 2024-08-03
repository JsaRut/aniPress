package com.facebook.react.views.picker;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.picker.b */
/* loaded from: classes.dex */
public class RunnableC1416b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1417c f5193a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1416b(C1417c c1417c) {
        this.f5193a = c1417c;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1417c c1417c = this.f5193a;
        c1417c.measure(View.MeasureSpec.makeMeasureSpec(c1417c.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5193a.getHeight(), 1073741824));
        C1417c c1417c2 = this.f5193a;
        c1417c2.layout(c1417c2.getLeft(), this.f5193a.getTop(), this.f5193a.getRight(), this.f5193a.getBottom());
    }
}
