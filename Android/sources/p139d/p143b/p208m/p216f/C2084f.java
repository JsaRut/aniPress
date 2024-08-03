package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageStoreManager;
import javax.inject.Provider;

/* renamed from: d.b.m.f.f */
/* loaded from: classes.dex */
class C2084f implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7543a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7544b;

    public C2084f(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7544b = c2078b;
        this.f7543a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new ImageStoreManager(this.f7543a);
    }
}
