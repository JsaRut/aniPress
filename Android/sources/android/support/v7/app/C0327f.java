package android.support.v7.app;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: android.support.v7.app.f */
/* loaded from: classes.dex */
public class C0327f implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ View f1553a;

    /* renamed from: b */
    final /* synthetic */ View f1554b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1555c;

    public C0327f(AlertController alertController, View view, View view2) {
        this.f1555c = alertController;
        this.f1553a = view;
        this.f1554b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m1696a(absListView, this.f1553a, this.f1554b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
