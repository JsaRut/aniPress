package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.N */
/* loaded from: classes.dex */
public class C1278N extends ReactContext {

    /* renamed from: a */
    private final ReactApplicationContext f4764a;

    public C1278N(ReactApplicationContext reactApplicationContext, Context context) {
        super(context);
        initializeWithInstance(reactApplicationContext.getCatalystInstance());
        this.f4764a = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f4764a.addLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f4764a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f4764a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f4764a.removeLifecycleEventListener(lifecycleEventListener);
    }
}
