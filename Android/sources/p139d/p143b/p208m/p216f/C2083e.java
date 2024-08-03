package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.image.ImageLoaderModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.e */
/* loaded from: classes.dex */
class C2083e implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7541a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7542b;

    public C2083e(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7542b = c2078b;
        this.f7541a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new ImageLoaderModule(this.f7541a);
    }
}
