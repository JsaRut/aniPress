package com.facebook.react.bridge;

import javax.inject.Provider;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

/* loaded from: classes.dex */
public class ModuleSpec {
    private static final String TAG = "ModuleSpec";
    private final String mName;
    private final Provider<? extends NativeModule> mProvider;
    private final Class<? extends NativeModule> mType;

    private ModuleSpec(Provider<? extends NativeModule> provider) {
        this.mType = null;
        this.mProvider = provider;
        this.mName = null;
    }

    private ModuleSpec(Provider<? extends NativeModule> provider, String str) {
        this.mType = null;
        this.mProvider = provider;
        this.mName = str;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider<? extends NativeModule> provider) {
        InterfaceC2073a interfaceC2073a = (InterfaceC2073a) cls.getAnnotation(InterfaceC2073a.class);
        if (interfaceC2073a != null) {
            return new ModuleSpec(provider, interfaceC2073a.name());
        }
        C1700a.m7015d(TAG, "Could not find @ReactModule annotation on " + cls.getName() + ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
        return new ModuleSpec(provider, provider.get().getName());
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider, str);
    }

    public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider);
    }

    public String getName() {
        return this.mName;
    }

    public Provider<? extends NativeModule> getProvider() {
        return this.mProvider;
    }

    public Class<? extends NativeModule> getType() {
        return this.mType;
    }
}
