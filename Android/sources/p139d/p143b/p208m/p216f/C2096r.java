package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.vibration.VibrationModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.r */
/* loaded from: classes.dex */
class C2096r implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7567a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7568b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2096r(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7568b = c2078b;
        this.f7567a = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // javax.inject.Provider
    public NativeModule get() {
        return new VibrationModule(this.f7567a);
    }
}
