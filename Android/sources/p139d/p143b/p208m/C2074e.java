package p139d.p143b.p208m;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import javax.inject.Provider;

/* renamed from: d.b.m.e */
/* loaded from: classes.dex */
class C2074e implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7530a;

    /* renamed from: b */
    final /* synthetic */ C2076f f7531b;

    public C2074e(C2076f c2076f, ReactApplicationContext reactApplicationContext) {
        this.f7531b = c2076f;
        this.f7530a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new JSCSamplingProfiler(this.f7530a);
    }
}
