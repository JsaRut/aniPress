package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.share.ShareModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.n */
/* loaded from: classes.dex */
class C2092n implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7559a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7560b;

    public C2092n(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7560b = c2078b;
        this.f7559a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new ShareModule(this.f7559a);
    }
}
