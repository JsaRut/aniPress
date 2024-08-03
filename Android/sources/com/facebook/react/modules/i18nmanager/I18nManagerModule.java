package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.C1104f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = I18nManagerModule.NAME)
/* loaded from: classes.dex */
public class I18nManagerModule extends ContextBaseJavaModule {
    public static final String NAME = "I18nManager";
    private final C1190a sharedI18nUtilInstance;

    public I18nManagerModule(Context context) {
        super(context);
        this.sharedI18nUtilInstance = C1190a.m5346a();
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.m5352a(getContext(), z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.m5354b(getContext(), z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Context context = getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap m5182b = C1104f.m5182b();
        m5182b.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.m5355b(context)));
        m5182b.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.m5353a(context)));
        m5182b.put("localeIdentifier", locale.toString());
        return m5182b;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.m5356c(getContext(), z);
    }
}
