package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = AndroidInfoModule.NAME)
@SuppressLint({"HardwareIds"})
/* loaded from: classes.dex */
public class AndroidInfoModule extends ReactContextBaseJavaModule {
    private static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "PlatformConstants";

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 2 ? currentModeType != 3 ? currentModeType != 4 ? currentModeType != 6 ? "unknown" : "watch" : "tv" : "car" : "desk" : "normal";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("Release", Build.VERSION.RELEASE);
        hashMap.put("Serial", Build.SERIAL);
        hashMap.put("Fingerprint", Build.FINGERPRINT);
        hashMap.put("Model", Build.MODEL);
        hashMap.put("isTesting", Boolean.valueOf("true".equals(System.getProperty(IS_TESTING))));
        hashMap.put("reactNativeVersion", C1255b.f4707a);
        hashMap.put("uiMode", uiMode());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
