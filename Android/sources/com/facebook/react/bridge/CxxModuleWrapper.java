package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.m6388a(str);
        return makeDsoNative(SoLoader.m6396c(str).getAbsolutePath(), str2);
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
