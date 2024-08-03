package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.blob.FileReaderModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.v */
/* loaded from: classes.dex */
class C2100v implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7575a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7576b;

    public C2100v(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7576b = c2078b;
        this.f7575a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new FileReaderModule(this.f7575a);
    }
}
