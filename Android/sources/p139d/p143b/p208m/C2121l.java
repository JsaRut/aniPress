package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p208m.p210b.C2067a;

/* renamed from: d.b.m.l */
/* loaded from: classes.dex */
public class C2121l {

    /* renamed from: a */
    private final ReactApplicationContext f7602a;

    /* renamed from: b */
    private final C2047G f7603b;

    /* renamed from: c */
    private final Map<String, ModuleHolder> f7604c = new HashMap();

    public C2121l(ReactApplicationContext reactApplicationContext, C2047G c2047g) {
        this.f7602a = reactApplicationContext;
        this.f7603b = c2047g;
    }

    /* renamed from: a */
    public NativeModuleRegistry m8475a() {
        return new NativeModuleRegistry(this.f7602a, this.f7604c);
    }

    /* renamed from: a */
    public void m8476a(InterfaceC2051K interfaceC2051K) {
        for (ModuleHolder moduleHolder : interfaceC2051K instanceof AbstractC2114j ? ((AbstractC2114j) interfaceC2051K).m8455c(this.f7602a) : interfaceC2051K instanceof AbstractC2059T ? ((AbstractC2059T) interfaceC2051K).m8422c(this.f7602a) : C2054N.m8397a(interfaceC2051K, this.f7602a, this.f7603b)) {
            String name = moduleHolder.getName();
            if (this.f7604c.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.f7604c.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + " for module name .Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true");
                }
                this.f7604c.remove(moduleHolder2);
            }
            if (!C2067a.f7514d || !moduleHolder.isTurboModule()) {
                this.f7604c.put(name, moduleHolder);
            }
        }
    }
}
