package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.permissions.PermissionsModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.m */
/* loaded from: classes.dex */
class C2091m implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7557a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7558b;

    public C2091m(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7558b = c2078b;
        this.f7557a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new PermissionsModule(this.f7557a);
    }
}
