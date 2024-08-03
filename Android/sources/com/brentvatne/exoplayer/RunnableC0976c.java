package com.brentvatne.exoplayer;

import android.view.View;

/* renamed from: com.brentvatne.exoplayer.c */
/* loaded from: classes.dex */
public class RunnableC0976c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0977d f4049a;

    public RunnableC0976c(C0977d c0977d) {
        this.f4049a = c0977d;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0977d c0977d = this.f4049a;
        c0977d.measure(View.MeasureSpec.makeMeasureSpec(c0977d.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4049a.getHeight(), 1073741824));
        C0977d c0977d2 = this.f4049a;
        c0977d2.layout(c0977d2.getLeft(), this.f4049a.getTop(), this.f4049a.getRight(), this.f4049a.getBottom());
    }
}
