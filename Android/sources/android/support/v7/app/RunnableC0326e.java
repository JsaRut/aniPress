package android.support.v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.e */
/* loaded from: classes.dex */
public class RunnableC0326e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f1550a;

    /* renamed from: b */
    final /* synthetic */ View f1551b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1552c;

    public RunnableC0326e(AlertController alertController, View view, View view2) {
        this.f1552c = alertController;
        this.f1550a = view;
        this.f1551b = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m1696a(this.f1552c.f1381A, this.f1550a, this.f1551b);
    }
}
