package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.InterfaceC1141a;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

/* renamed from: d.b.m.T */
/* loaded from: classes.dex */
public abstract class AbstractC2059T implements InterfaceC2051K {

    /* renamed from: d.b.m.T$a */
    /* loaded from: classes.dex */
    public class a implements Provider<NativeModule> {

        /* renamed from: a */
        private final String f7498a;

        /* renamed from: b */
        private final ReactApplicationContext f7499b;

        public a(String str, ReactApplicationContext reactApplicationContext) {
            this.f7498a = str;
            this.f7499b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        public NativeModule get() {
            return AbstractC2059T.this.mo8420a(this.f7498a, this.f7499b);
        }
    }

    /* renamed from: a */
    public abstract NativeModule mo8420a(String str, ReactApplicationContext reactApplicationContext);

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> m8423d = m8423d(reactApplicationContext);
        if (m8423d == null || m8423d.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = m8423d.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) it.next().getProvider().get());
        }
        return arrayList;
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    /* renamed from: c */
    public abstract InterfaceC1141a mo8421c();

    /* renamed from: c */
    public Iterable<ModuleHolder> m8422c(ReactApplicationContext reactApplicationContext) {
        return new C2058S(this, mo8421c().mo5251a().entrySet().iterator(), reactApplicationContext);
    }

    /* renamed from: d */
    protected List<ModuleSpec> m8423d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
