package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: com.facebook.react.jscexecutor.a */
/* loaded from: classes.dex */
public class C1140a implements JavaScriptExecutorFactory {

    /* renamed from: a */
    private final String f4440a;

    /* renamed from: b */
    private final String f4441b;

    public C1140a(String str, String str2) {
        this.f4440a = str;
        this.f4441b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f4440a);
        writableNativeMap.putString("DeviceIdentity", this.f4441b);
        return new JSCExecutor(writableNativeMap);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
