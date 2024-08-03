package p139d.p143b.p208m.p216f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.websocket.WebSocketModule;
import javax.inject.Provider;

/* renamed from: d.b.m.f.s */
/* loaded from: classes.dex */
class C2097s implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7569a;

    /* renamed from: b */
    final /* synthetic */ C2078B f7570b;

    public C2097s(C2078B c2078b, ReactApplicationContext reactApplicationContext) {
        this.f7570b = c2078b;
        this.f7569a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new WebSocketModule(this.f7569a);
    }
}
