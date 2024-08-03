package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public abstract class NativeArray implements NativeArrayInterface {

    @InterfaceC2039a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
