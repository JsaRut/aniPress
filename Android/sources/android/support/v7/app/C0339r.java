package android.support.v7.app;

import android.view.View;
import p000a.p005b.p009c.p019h.C0078L;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0102q;

/* renamed from: android.support.v7.app.r */
/* loaded from: classes.dex */
public class C0339r implements InterfaceC0102q {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x f1580a;

    public C0339r(LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x) {
        this.f1580a = layoutInflaterFactory2C0345x;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0102q
    /* renamed from: a */
    public C0078L mo279a(View view, C0078L c0078l) {
        int m358d = c0078l.m358d();
        int m1896i = this.f1580a.m1896i(m358d);
        if (m358d != m1896i) {
            c0078l = c0078l.m355a(c0078l.m356b(), m1896i, c0078l.m357c(), c0078l.m354a());
        }
        return C0107v.m506b(view, c0078l);
    }
}
