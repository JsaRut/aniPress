package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, WritableNativeArray writableNativeArray);

    private native void putNativeMap(String str, WritableNativeMap writableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        C2038a.m8321a(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        C2038a.m8321a(writableArray == null || (writableArray instanceof WritableNativeArray), "Illegal type provided");
        putNativeArray(str, (WritableNativeArray) writableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String str, boolean z);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String str, double d2);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String str, int i);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        C2038a.m8321a(writableMap == null || (writableMap instanceof WritableNativeMap), "Illegal type provided");
        putNativeMap(str, (WritableNativeMap) writableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String str, String str2);
}
