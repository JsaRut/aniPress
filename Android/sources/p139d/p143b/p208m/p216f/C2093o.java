package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.statusbar.StatusBarModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.o */
/* loaded from: classes.dex */
class C2093o implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7561a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7562b;

    public C2093o(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7562b = c2078b;
        this.f7561a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new StatusBarModule(this.f7561a);
    }
}
