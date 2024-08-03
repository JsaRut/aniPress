package android.support.v7.app;

import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.app.q */
/* loaded from: classes.dex */
public class RunnableC0338q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x f1579a;

    public RunnableC0338q(LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x) {
        this.f1579a = layoutInflaterFactory2C0345x;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x = this.f1579a;
        if ((layoutInflaterFactory2C0345x.f1604P & 1) != 0) {
            layoutInflaterFactory2C0345x.m1892e(0);
        }
        LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x2 = this.f1579a;
        if ((layoutInflaterFactory2C0345x2.f1604P & 4096) != 0) {
            layoutInflaterFactory2C0345x2.m1892e(C0121j.AppCompatTheme_tooltipForegroundColor);
        }
        LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x3 = this.f1579a;
        layoutInflaterFactory2C0345x3.f1603O = false;
        layoutInflaterFactory2C0345x3.f1604P = 0;
    }
}
