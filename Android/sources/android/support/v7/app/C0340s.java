package android.support.v7.app;

import android.graphics.Rect;
import android.support.v7.widget.InterfaceC0414O;

/* renamed from: android.support.v7.app.s */
/* loaded from: classes.dex */
public class C0340s implements InterfaceC0414O.a {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x f1581a;

    public C0340s(LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x) {
        this.f1581a = layoutInflaterFactory2C0345x;
    }

    @Override // android.support.v7.widget.InterfaceC0414O.a
    /* renamed from: a */
    public void mo1855a(Rect rect) {
        rect.top = this.f1581a.m1896i(rect.top);
    }
}
