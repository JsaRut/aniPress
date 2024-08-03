package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.appstate.AppStateModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.t */
/* loaded from: classes.dex */
class C2098t implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7571a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7572b;

    public C2098t(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7572b = c2078b;
        this.f7571a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new AppStateModule(this.f7571a);
    }
}
