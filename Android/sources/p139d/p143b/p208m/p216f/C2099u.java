package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.blob.BlobModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.u */
/* loaded from: classes.dex */
class C2099u implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7573a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7574b;

    public C2099u(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7574b = c2078b;
        this.f7573a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new BlobModule(this.f7573a);
    }
}
