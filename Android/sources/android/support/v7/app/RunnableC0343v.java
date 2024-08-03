package android.support.v7.app;

import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v7.app.v */
/* loaded from: classes.dex */
public class RunnableC0343v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x f1584a;

    public RunnableC0343v(LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x) {
        this.f1584a = layoutInflaterFactory2C0345x;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x = this.f1584a;
        layoutInflaterFactory2C0345x.f1623r.showAtLocation(layoutInflaterFactory2C0345x.f1622q, 55, 0, 0);
        this.f1584a.m1898l();
        if (!this.f1584a.m1905s()) {
            this.f1584a.f1622q.setAlpha(1.0f);
            this.f1584a.f1622q.setVisibility(0);
            return;
        }
        this.f1584a.f1622q.setAlpha(0.0f);
        LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x2 = this.f1584a;
        C0074H m490a = C0107v.m490a(layoutInflaterFactory2C0345x2.f1622q);
        m490a.m338a(1.0f);
        layoutInflaterFactory2C0345x2.f1625t = m490a;
        this.f1584a.f1625t.m340a(new C0342u(this));
    }
}
