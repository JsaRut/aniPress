package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    /* JADX INFO: Access modifiers changed from: protected */
    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.m5090a();
    }

    public abstract String getName();
}
