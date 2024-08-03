package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.netinfo.NetInfoModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.k */
/* loaded from: classes.dex */
class C2089k implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7553a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7554b;

    public C2089k(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7554b = c2078b;
        this.f7553a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new NetInfoModule(this.f7553a);
    }
}
