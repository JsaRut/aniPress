package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class EventEmitterWrapper {

    @InterfaceC2039a
    private final HybridData mHybridData = initHybrid();

    static {
        C1128b.m5242a();
    }

    private EventEmitterWrapper() {
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap);
}
