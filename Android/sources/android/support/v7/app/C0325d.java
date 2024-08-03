package android.support.v7.app;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

/* renamed from: android.support.v7.app.d */
/* loaded from: classes.dex */
public class C0325d implements NestedScrollView.InterfaceC0281b {

    /* renamed from: a */
    final /* synthetic */ View f1547a;

    /* renamed from: b */
    final /* synthetic */ View f1548b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1549c;

    public C0325d(AlertController alertController, View view, View view2) {
        this.f1549c = alertController;
        this.f1547a = view;
        this.f1548b = view2;
    }

    @Override // android.support.v4.widget.NestedScrollView.InterfaceC0281b
    /* renamed from: a */
    public void mo1536a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        AlertController.m1696a(nestedScrollView, this.f1547a, this.f1548b);
    }
}
