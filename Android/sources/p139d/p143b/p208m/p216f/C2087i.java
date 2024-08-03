package p139d.p143b.p208m.p216f;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import javax.inject.Provider;

/* renamed from: d.b.m.f.i */
/* loaded from: classes.dex */
class C2087i implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7549a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7550b;

    public C2087i(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7550b = c2078b;
        this.f7549a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new NativeAnimatedModule(this.f7549a);
    }
}
