package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.devsupport.JSCHeapCapture;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = JSDevSupport.MODULE_NAME)
/* loaded from: classes.dex */
public class JSDevSupport extends ReactContextBaseJavaModule {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    private volatile InterfaceC1111a mCurrentCallback;

    /* loaded from: classes.dex */
    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    /* renamed from: com.facebook.react.devsupport.JSDevSupport$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1111a {
        /* renamed from: a */
        void m5196a(int i, Exception exc);

        /* renamed from: a */
        void m5197a(String str);
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCurrentCallback = null;
    }

    public synchronized void computeDeepestJSHierarchy(View view, InterfaceC1111a interfaceC1111a) {
        getJSHierarchy(Integer.valueOf(((View) C1121g.m5216a(view).first).getId()).intValue(), interfaceC1111a);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", 0);
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", 1);
        return hashMap;
    }

    public synchronized void getJSHierarchy(int i, InterfaceC1111a interfaceC1111a) {
        JSDevSupportModule jSDevSupportModule = (JSDevSupportModule) getReactApplicationContext().getJSModule(JSDevSupportModule.class);
        if (jSDevSupportModule == null) {
            interfaceC1111a.m5196a(0, new JSCHeapCapture.C1109b("JSDevSupport module not registered."));
        } else {
            this.mCurrentCallback = interfaceC1111a;
            jSDevSupportModule.getJSHierarchy(i);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public synchronized void onFailure(int i, String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.m5196a(i, new RuntimeException(str));
        }
    }

    @ReactMethod
    public synchronized void onSuccess(String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.m5197a(str);
        }
    }
}
