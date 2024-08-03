package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.storage.AsyncStorageModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.w */
/* loaded from: classes.dex */
class C2101w implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7577a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7578b;

    public C2101w(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7578b = c2078b;
        this.f7577a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new AsyncStorageModule(this.f7577a);
    }
}
