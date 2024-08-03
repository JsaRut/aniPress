package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1348ha;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.views.text.AbstractC1457h;
import com.facebook.react.views.text.C1468s;
import com.facebook.react.views.view.C1510b;
import com.facebook.yoga.C1554b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p204k.p205a.C2038a;

@TargetApi(23)
/* renamed from: com.facebook.react.views.textinput.q */
/* loaded from: classes.dex */
public class C1496q extends AbstractC1457h implements YogaMeasureFunction {

    /* renamed from: T */
    private EditText f5531T;

    /* renamed from: U */
    private C1491l f5532U;

    /* renamed from: S */
    private int f5530S = -1;

    /* renamed from: V */
    private String f5533V = null;

    /* renamed from: W */
    private String f5534W = null;

    public C1496q() {
        this.f5362D = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        m6276P();
    }

    /* renamed from: P */
    private void m6276P() {
        m5544a((YogaMeasureFunction) this);
    }

    @Override // com.facebook.react.uimanager.C1270F
    /* renamed from: I */
    public boolean mo5533I() {
        return true;
    }

    /* renamed from: N */
    public String m6277N() {
        return this.f5534W;
    }

    /* renamed from: O */
    public String m6278O() {
        return this.f5533V;
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5482a(C1278N c1278n) {
        super.mo5482a(c1278n);
        EditText editText = new EditText(mo5513p());
        m5548b(4, C0107v.m522j(editText));
        m5548b(1, editText.getPaddingTop());
        m5548b(5, C0107v.m521i(editText));
        m5548b(3, editText.getPaddingBottom());
        this.f5531T = editText;
        this.f5531T.setPadding(0, 0, 0, 0);
        this.f5531T.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.react.uimanager.C1270F
    /* renamed from: a */
    public void mo5539a(C1348ha c1348ha) {
        super.mo5539a(c1348ha);
        if (this.f5530S != -1) {
            c1348ha.m5821a(mo5504g(), new C1468s(AbstractC1457h.m6157a(this, m6278O()), this.f5530S, this.f5375Q, m5555f(0), m5555f(1), m5555f(2), m5555f(3), this.f5361C, this.f5362D, this.f5363E));
        }
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: a */
    public void mo5484a(Object obj) {
        C2038a.m8320a(obj instanceof C1491l);
        this.f5532U = (C1491l) obj;
        mo5494c();
    }

    @Override // com.facebook.react.uimanager.C1270F
    /* renamed from: e */
    public void mo5554e(int i, float f) {
        super.mo5554e(i, f);
        mo5535K();
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = this.f5531T;
        C2038a.m8318a(editText);
        EditText editText2 = editText;
        C1491l c1491l = this.f5532U;
        if (c1491l != null) {
            c1491l.m6274a(editText2);
        } else {
            editText2.setTextSize(0, this.f5377w.m6224b());
            int i = this.f5360B;
            if (i != -1) {
                editText2.setLines(i);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                int breakStrategy = editText2.getBreakStrategy();
                int i2 = this.f5362D;
                if (breakStrategy != i2) {
                    editText2.setBreakStrategy(i2);
                }
            }
        }
        editText2.setHint(m6277N());
        editText2.measure(C1510b.m6296a(f, yogaMeasureMode), C1510b.m6296a(f2, yogaMeasureMode2));
        return C1554b.m6546a(editText2.getMeasuredWidth(), editText2.getMeasuredHeight());
    }

    @InterfaceC1294a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.f5530S = i;
    }

    @InterfaceC1294a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f5534W = str;
        mo5535K();
    }

    @InterfaceC1294a(name = "text")
    public void setText(String str) {
        this.f5533V = str;
        mo5535K();
    }

    @Override // com.facebook.react.views.text.AbstractC1457h
    public void setTextBreakStrategy(String str) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "simple".equals(str)) {
            i = 0;
        } else if ("highQuality".equals(str)) {
            i = 1;
        } else {
            if (!"balanced".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            i = 2;
        }
        this.f5362D = i;
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: w */
    public boolean mo5520w() {
        return true;
    }
}
