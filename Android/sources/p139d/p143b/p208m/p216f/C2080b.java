package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.b */
/* loaded from: classes.dex */
class C2080b implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7535a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7536b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2080b(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7536b = c2078b;
        this.f7535a = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // javax.inject.Provider
    public NativeModule get() {
        C2079a c2079a;
        C2079a c2079a2;
        ReactApplicationContext reactApplicationContext = this.f7535a;
        c2079a = this.f7536b.f7534a;
        if (c2079a == null) {
            return new FrescoModule(reactApplicationContext, true, null);
        }
        c2079a2 = this.f7536b.f7534a;
        c2079a2.m8447a();
        throw null;
    }
}
