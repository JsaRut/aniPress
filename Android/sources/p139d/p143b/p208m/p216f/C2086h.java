package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.location.LocationModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.h */
/* loaded from: classes.dex */
class C2086h implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7547a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7548b;

    public C2086h(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7548b = c2078b;
        this.f7547a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new LocationModule(this.f7547a);
    }
}
