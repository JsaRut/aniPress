package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.clipboard.ClipboardModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.y */
/* loaded from: classes.dex */
class C2103y implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7581a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7582b;

    public C2103y(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7582b = c2078b;
        this.f7581a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new ClipboardModule(this.f7581a);
    }
}
