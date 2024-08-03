package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.intent.IntentModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.g */
/* loaded from: classes.dex */
class C2085g implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7545a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7546b;

    public C2085g(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7546b = c2078b;
        this.f7545a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new IntentModule(this.f7545a);
    }
}
