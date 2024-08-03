package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.C1217i;
import com.facebook.react.modules.network.C1226r;
import com.facebook.react.modules.network.InterfaceC1209a;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p169g.p170a.p171a.C1763c;
import p139d.p143b.p184i.p187b.p188a.C1832a;
import p139d.p143b.p184i.p192f.C1895l;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p139d.p143b.p208m.p214e.p215a.InterfaceC2075a;

@InterfaceC2073a(name = FrescoModule.NAME, needsEagerInit = true)
/* loaded from: classes.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements InterfaceC2075a, LifecycleEventListener {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private C1895l mConfig;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, C1895l c1895l) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = c1895l;
    }

    private static C1895l getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).m7752a();
    }

    public static C1895l.a getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new C1189c());
        OkHttpClient m5428a = C1226r.m5428a();
        ((InterfaceC1209a) m5428a.cookieJar()).mo5400a(new JavaNetCookieJar(new C1217i(reactContext)));
        C1895l.a m7533a = C1832a.m7533a(reactContext.getApplicationContext(), m5428a);
        m7533a.m7749a(new C1188b(m5428a));
        m7533a.m7751a(false);
        m7533a.m7750a(hashSet);
        return m7533a;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        C1763c.m7207a().m7687a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            C1763c.m7209a(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            C1700a.m7015d("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            C1763c.m7207a().m7694c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
