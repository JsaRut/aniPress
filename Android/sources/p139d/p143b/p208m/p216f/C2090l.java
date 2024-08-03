package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.l */
/* loaded from: classes.dex */
class C2090l implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7555a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7556b;

    public C2090l(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7556b = c2078b;
        this.f7555a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new AccessibilityInfoModule(this.f7555a);
    }
}
