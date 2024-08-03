package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class CxxCallbackImpl implements Callback {

    @InterfaceC2039a
    private final HybridData mHybridData;

    @InterfaceC2039a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
