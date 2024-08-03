package android.support.v7.widget;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.Z */
/* loaded from: classes.dex */
public class RunnableC0435Z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f2301a;

    /* renamed from: b */
    final /* synthetic */ C0437aa f2302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0435Z(C0437aa c0437aa, View view) {
        this.f2302b = c0437aa;
        this.f2301a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2302b.smoothScrollTo(this.f2301a.getLeft() - ((this.f2302b.getWidth() - this.f2301a.getWidth()) / 2), 0);
        this.f2302b.f2315b = null;
    }
}
