package p139d.p143b.p208m;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.InterfaceC1141a;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.C1552c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: d.b.m.j */
/* loaded from: classes.dex */
public abstract class AbstractC2114j implements InterfaceC2051K {
    /* renamed from: a */
    public static InterfaceC1141a m8454a(AbstractC2114j abstractC2114j) {
        try {
            Class<?> cls = Class.forName(abstractC2114j.getClass().getCanonicalName() + "$$ReactModuleInfoProvider");
            if (cls == null) {
                throw new RuntimeException("ReactModuleInfoProvider class for " + abstractC2114j.getClass().getCanonicalName() + " not found.");
            }
            try {
                return (InterfaceC1141a) cls.newInstance();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + abstractC2114j.getClass(), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + abstractC2114j.getClass(), e3);
            }
        } catch (ClassNotFoundException unused) {
            return new C2105g();
        }
    }

    /* renamed from: a */
    public abstract InterfaceC1141a mo8444a();

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: a */
    public List<ViewManager> mo4767a(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> m8456e = m8456e(reactApplicationContext);
        if (m8456e == null || m8456e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = m8456e.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) it.next().getProvider().get());
        }
        return arrayList;
    }

    @Override // p139d.p143b.p208m.InterfaceC2051K
    /* renamed from: b */
    public final List<NativeModule> mo4768b(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : mo8445d(reactApplicationContext)) {
            C1552c.a m6467a = C1552c.m6467a(0L, "createNativeModule");
            m6467a.mo6469a("module", moduleSpec.getType());
            m6467a.mo6470a();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C1552c.m6466a(0L).mo6470a();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C1552c.m6466a(0L).mo6470a();
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public Iterable<ModuleHolder> m8455c(ReactApplicationContext reactApplicationContext) {
        return new C2112i(this, mo8445d(reactApplicationContext), mo8444a().mo5251a());
    }

    /* renamed from: d */
    protected abstract List<ModuleSpec> mo8445d(ReactApplicationContext reactApplicationContext);

    /* renamed from: e */
    public List<ModuleSpec> m8456e(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
