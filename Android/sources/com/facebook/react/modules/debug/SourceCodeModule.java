package com.facebook.react.modules.debug;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = SourceCodeModule.NAME)
/* loaded from: classes.dex */
public class SourceCodeModule extends BaseJavaModule {
    public static final String NAME = "SourceCode";
    private final ReactContext mReactContext;

    public SourceCodeModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        String sourceURL = this.mReactContext.getCatalystInstance().getSourceURL();
        C2038a.m8319a(sourceURL, "No source URL loaded, have you initialised the instance?");
        hashMap.put("scriptURL", sourceURL);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
