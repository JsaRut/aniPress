package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void pushNativeArray(WritableNativeArray writableNativeArray);

    private native void pushNativeMap(WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(WritableArray writableArray) {
        C2038a.m8321a(writableArray == null || (writableArray instanceof WritableNativeArray), "Illegal type provided");
        pushNativeArray((WritableNativeArray) writableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d2);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(WritableMap writableMap) {
        C2038a.m8321a(writableMap == null || (writableMap instanceof WritableNativeMap), "Illegal type provided");
        pushNativeMap((WritableNativeMap) writableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(String str);
}
