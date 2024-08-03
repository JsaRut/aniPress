package com.facebook.react.modules.statusbar;

import android.app.Activity;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1374w;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = StatusBarModule.NAME)
/* loaded from: classes.dex */
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        return C1104f.m5177a(HEIGHT_KEY, Float.valueOf(reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android") > 0 ? C1374w.m5957a(reactApplicationContext.getResources().getDimensionPixelSize(r2)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, (currentActivity == null || Build.VERSION.SDK_INT < 21) ? "black" : String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setColor(int i, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C1700a.m7015d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new C1238b(this, getReactApplicationContext(), currentActivity, z, i));
        }
    }

    @ReactMethod
    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C1700a.m7015d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new RunnableC1241e(this, z, currentActivity));
        }
    }

    @ReactMethod
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C1700a.m7015d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new RunnableC1242f(this, currentActivity, str));
        }
    }

    @ReactMethod
    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            C1700a.m7015d("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new C1240d(this, getReactApplicationContext(), currentActivity, z));
        }
    }
}
