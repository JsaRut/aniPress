package android.support.v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.S */
/* loaded from: classes.dex */
public class RunnableC0417S implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0429U f2126a;

    public RunnableC0417S(C0429U c0429u) {
        this.f2126a = c0429u;
    }

    @Override // java.lang.Runnable
    public void run() {
        View m2404e = this.f2126a.m2404e();
        if (m2404e == null || m2404e.getWindowToken() == null) {
            return;
        }
        this.f2126a.mo1941c();
    }
}
