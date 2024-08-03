package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public abstract class NativeMap {

    @InterfaceC2039a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
