package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.modal.h */
/* loaded from: classes.dex */
class C1410h extends AbstractC1330c<C1410h> {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1410h(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), null);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topRequestClose";
    }
}
