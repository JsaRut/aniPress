package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.uimanager.C1348ha;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;

@TargetApi(23)
/* renamed from: com.facebook.react.views.text.r */
/* loaded from: classes.dex */
public class C1467r extends AbstractC1457h {

    /* renamed from: S */
    private static final TextPaint f5392S = new TextPaint(1);

    /* renamed from: T */
    private Spannable f5393T;

    /* renamed from: U */
    private boolean f5394U;

    /* renamed from: V */
    private final YogaMeasureFunction f5395V = new C1466q(this);

    public C1467r() {
        m6170P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public int m6169O() {
        int i = this.f5361C;
        if (m5526B() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    /* renamed from: P */
    private void m6170P() {
        if (mo5507j()) {
            return;
        }
        m5544a(this.f5395V);
    }

    @Override // com.facebook.react.uimanager.C1270F
    /* renamed from: K */
    public void mo5535K() {
        super.mo5535K();
        super.mo5494c();
    }

    @Override // com.facebook.react.uimanager.C1270F
    /* renamed from: a */
    public void mo5539a(C1348ha c1348ha) {
        super.mo5539a(c1348ha);
        Spannable spannable = this.f5393T;
        if (spannable != null) {
            c1348ha.m5821a(mo5504g(), new C1468s(spannable, -1, this.f5375Q, m5555f(4), m5555f(1), m5555f(5), m5555f(3), m6169O(), this.f5362D, this.f5363E));
        }
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: m */
    public void mo5510m() {
        this.f5393T = AbstractC1457h.m6157a(this, (String) null);
        mo5535K();
    }

    @InterfaceC1294a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.f5394U = z;
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: w */
    public boolean mo5520w() {
        return true;
    }
}
