package com.facebook.react.uimanager;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;

/* renamed from: com.facebook.react.uimanager.W */
/* loaded from: classes.dex */
public class C1289W {
    /* renamed from: a */
    public static UIManager m5672a(ReactContext reactContext, int i) {
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        return (UIManager) (i == 2 ? catalystInstance.getJSIModule(UIManager.class) : catalystInstance.getNativeModule(UIManagerModule.class));
    }
}
