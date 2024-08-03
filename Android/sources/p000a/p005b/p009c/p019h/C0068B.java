package p000a.p005b.p009c.p019h;

import android.graphics.Rect;
import android.view.View;

/* renamed from: a.b.c.h.B */
/* loaded from: classes.dex */
public class C0068B implements InterfaceC0102q {

    /* renamed from: a */
    private final Rect f242a = new Rect();

    /* renamed from: b */
    final /* synthetic */ C0069C f243b;

    public C0068B(C0069C c0069c) {
        this.f243b = c0069c;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0102q
    /* renamed from: a */
    public C0078L mo279a(View view, C0078L c0078l) {
        C0078L m506b = C0107v.m506b(view, c0078l);
        if (m506b.m359e()) {
            return m506b;
        }
        Rect rect = this.f242a;
        rect.left = m506b.m356b();
        rect.top = m506b.m358d();
        rect.right = m506b.m357c();
        rect.bottom = m506b.m354a();
        int childCount = this.f243b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0078L m491a = C0107v.m491a(this.f243b.getChildAt(i), m506b);
            rect.left = Math.min(m491a.m356b(), rect.left);
            rect.top = Math.min(m491a.m358d(), rect.top);
            rect.right = Math.min(m491a.m357c(), rect.right);
            rect.bottom = Math.min(m491a.m354a(), rect.bottom);
        }
        return m506b.m355a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
