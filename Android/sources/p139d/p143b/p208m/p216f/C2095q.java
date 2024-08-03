package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.toast.ToastModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.q */
/* loaded from: classes.dex */
class C2095q implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7565a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7566b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2095q(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7566b = c2078b;
        this.f7565a = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // javax.inject.Provider
    public NativeModule get() {
        return new ToastModule(this.f7565a);
    }
}
