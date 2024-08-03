package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.CameraRollManager;
import javax.inject.Provider;

/* renamed from: d.b.m.f.x */
/* loaded from: classes.dex */
class C2102x implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7579a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7580b;

    public C2102x(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7580b = c2078b;
        this.f7579a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new CameraRollManager(this.f7579a);
    }
}
