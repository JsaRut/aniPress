package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.dialog.DialogModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.A */
/* loaded from: classes.dex */
class C2077A implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7532a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7533b;

    public C2077A(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7533b = c2078b;
        this.f7532a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new DialogModule(this.f7532a);
    }
}
