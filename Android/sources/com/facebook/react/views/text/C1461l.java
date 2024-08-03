package com.facebook.react.views.text;

import com.facebook.react.uimanager.C1270F;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* renamed from: com.facebook.react.views.text.l */
/* loaded from: classes.dex */
public class C1461l extends C1270F {

    /* renamed from: v */
    private String f5389v = null;

    /* renamed from: N */
    public String m6166N() {
        return this.f5389v;
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: j */
    public boolean mo5507j() {
        return true;
    }

    @InterfaceC1294a(name = "text")
    public void setText(String str) {
        this.f5389v = str;
        mo5535K();
    }

    @Override // com.facebook.react.uimanager.C1270F
    public String toString() {
        return mo5517t() + " [text: " + this.f5389v + "]";
    }
}
