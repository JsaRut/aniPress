package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageEditingManager;
import javax.inject.Provider;

/* renamed from: d.b.m.f.d */
/* loaded from: classes.dex */
class C2082d implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7539a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7540b;

    public C2082d(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7540b = c2078b;
        this.f7539a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new ImageEditingManager(this.f7539a);
    }
}
