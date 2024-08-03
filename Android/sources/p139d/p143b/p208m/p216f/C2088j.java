package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.network.NetworkingModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.j */
/* loaded from: classes.dex */
class C2088j implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7551a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7552b;

    public C2088j(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7552b = c2078b;
        this.f7551a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new NetworkingModule(this.f7551a);
    }
}
