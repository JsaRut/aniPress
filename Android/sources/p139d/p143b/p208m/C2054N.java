package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.m.N */
/* loaded from: classes.dex */
public class C2054N {
    /* renamed from: a */
    public static Iterable<ModuleHolder> m8397a(InterfaceC2051K interfaceC2051K, ReactApplicationContext reactApplicationContext, C2047G c2047g) {
        C1700a.m6997a("ReactNative", interfaceC2051K.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new C2053M(interfaceC2051K instanceof AbstractC2049I ? ((AbstractC2049I) interfaceC2051K).m8387a(reactApplicationContext, c2047g) : interfaceC2051K.mo4768b(reactApplicationContext));
    }
}
