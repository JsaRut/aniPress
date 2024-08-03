package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@SuppressLint({"MissingNativeLoadLibrary"})
@InterfaceC2039a
/* loaded from: classes.dex */
public class Binding {

    @InterfaceC2039a
    private final HybridData mHybridData = initHybrid();

    static {
        C1128b.m5242a();
    }

    private static native HybridData initHybrid();

    private native void installFabricUIManager(long j, Object obj, EventBeatManager eventBeatManager, MessageQueueThread messageQueueThread, ComponentFactoryDelegate componentFactoryDelegate, Object obj2);

    private native void uninstallFabricUIManager();

    /* renamed from: a */
    public void m5238a() {
        uninstallFabricUIManager();
    }

    public native void renderTemplateToSurface(int i, String str);

    public native void setConstraints(int i, float f, float f2, float f3, float f4);

    public native void setPixelDensity(float f);

    public native void startSurface(int i, NativeMap nativeMap);

    public native void stopSurface(int i);
}
