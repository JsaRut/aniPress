package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.swiperefresh.b */
/* loaded from: classes.dex */
public class C1439b extends AbstractC1330c<C1439b> {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1439b(int i) {
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
        return "topRefresh";
    }
}
