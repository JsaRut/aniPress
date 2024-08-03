package com.facebook.react.uimanager;

import android.view.View;

/* loaded from: classes.dex */
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, C1359n> {
    @Override // com.facebook.react.uimanager.ViewManager
    public C1359n createShadowNodeInstance() {
        return new C1359n();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C1359n> getShadowNodeClass() {
        return C1359n.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }
}
