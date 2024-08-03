package com.facebook.react.modules.core;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p211c.C2070b;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = HeadlessJsTaskSupportModule.NAME)
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void notifyTaskFinished(int i) {
        C2070b m8437a = C2070b.m8437a(getReactApplicationContext());
        if (m8437a.m8443b(i)) {
            m8437a.m8439a(i);
        } else {
            C1700a.m7011c((Class<?>) HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }
}
