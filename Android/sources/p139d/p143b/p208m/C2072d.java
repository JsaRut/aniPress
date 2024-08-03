package p139d.p143b.p208m;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import javax.inject.Provider;

/* renamed from: d.b.m.d */
/* loaded from: classes.dex */
class C2072d implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f7528a;

    /* renamed from: b */
    final /* synthetic */ C2076f f7529b;

    public C2072d(C2076f c2076f, ReactApplicationContext reactApplicationContext) {
        this.f7529b = c2076f;
        this.f7528a = reactApplicationContext;
    }

    @Override // javax.inject.Provider
    public NativeModule get() {
        return new JSCHeapCapture(this.f7528a);
    }
}
