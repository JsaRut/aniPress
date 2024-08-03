package android.support.v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.g */
/* loaded from: classes.dex */
public class RunnableC0328g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f1556a;

    /* renamed from: b */
    final /* synthetic */ View f1557b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1558c;

    public RunnableC0328g(AlertController alertController, View view, View view2) {
        this.f1558c = alertController;
        this.f1556a = view;
        this.f1557b = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m1696a(this.f1558c.f1406g, this.f1556a, this.f1557b);
    }
}
