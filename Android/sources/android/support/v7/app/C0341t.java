package android.support.v7.app;

import android.support.v7.widget.ContentFrameLayout;

/* renamed from: android.support.v7.app.t */
/* loaded from: classes.dex */
public class C0341t implements ContentFrameLayout.InterfaceC0394a {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x f1582a;

    public C0341t(LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x) {
        this.f1582a = layoutInflaterFactory2C0345x;
    }

    @Override // android.support.v7.widget.ContentFrameLayout.InterfaceC0394a
    /* renamed from: a */
    public void mo1856a() {
    }

    @Override // android.support.v7.widget.ContentFrameLayout.InterfaceC0394a
    public void onDetachedFromWindow() {
        this.f1582a.m1897k();
    }
}
