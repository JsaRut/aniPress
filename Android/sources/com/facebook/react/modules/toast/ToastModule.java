package com.facebook.react.modules.toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1104f;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ToastModule.NAME)
/* loaded from: classes.dex */
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap m5182b = C1104f.m5182b();
        m5182b.put(DURATION_SHORT_KEY, 0);
        m5182b.put(DURATION_LONG_KEY, 1);
        m5182b.put(GRAVITY_TOP_KEY, 49);
        m5182b.put(GRAVITY_BOTTOM_KEY, 81);
        m5182b.put(GRAVITY_CENTER, 17);
        return m5182b;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(String str, int i) {
        UiThreadUtil.runOnUiThread(new RunnableC1260a(this, str, i));
    }

    @ReactMethod
    public void showWithGravity(String str, int i, int i2) {
        UiThreadUtil.runOnUiThread(new RunnableC1261b(this, str, i, i2));
    }

    @ReactMethod
    public void showWithGravityAndOffset(String str, int i, int i2, int i3, int i4) {
        UiThreadUtil.runOnUiThread(new RunnableC1262c(this, str, i, i2, i3, i4));
    }
}
