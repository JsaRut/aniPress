package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.c */
/* loaded from: classes.dex */
class C2081c implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7537a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7538b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2081c(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7538b = c2078b;
        this.f7537a = reactApplicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // javax.inject.Provider
    public NativeModule get() {
        return new I18nManagerModule(this.f7537a);
    }
}
