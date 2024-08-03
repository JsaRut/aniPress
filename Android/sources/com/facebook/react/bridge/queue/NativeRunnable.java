package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    @InterfaceC2039a
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}
