package com.facebook.react.bridge;

import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.C1550a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

/* loaded from: classes.dex */
public class NativeModuleRegistry {
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    private Map<String, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleHolder> it = this.mModules.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getModule());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getValue().isCxxModule()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (!entry.getValue().isCxxModule()) {
                arrayList.add(new JavaModuleWrapper(jSInstance, entry.getValue()));
            }
        }
        return arrayList;
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        InterfaceC2073a interfaceC2073a = (InterfaceC2073a) cls.getAnnotation(InterfaceC2073a.class);
        if (interfaceC2073a == null) {
            throw new IllegalArgumentException("Could not find @ReactModule annotation in class " + cls.getName());
        }
        ModuleHolder moduleHolder = this.mModules.get(interfaceC2073a.name());
        C2038a.m8319a(moduleHolder, interfaceC2073a.name() + " could not be found. Is it defined in " + cls.getName());
        return (T) moduleHolder.getModule();
    }

    public NativeModule getModule(String str) {
        ModuleHolder moduleHolder = this.mModules.get(str);
        C2038a.m8319a(moduleHolder, "Could not find module with name " + str);
        return moduleHolder.getModule();
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(((InterfaceC2073a) cls.getAnnotation(InterfaceC2073a.class)).name());
    }

    public boolean hasModule(String str) {
        return this.mModules.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        C1550a.m6454a(0L, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            Iterator<ModuleHolder> it = this.mModules.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        } finally {
            C1550a.m6453a(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        C1550a.m6454a(0L, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            Iterator<ModuleHolder> it = this.mModules.values().iterator();
            while (it.hasNext()) {
                it.next().markInitializable();
            }
        } finally {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        ModuleHolder moduleHolder = this.mModules.get(UIManagerModule.NAME);
        if (moduleHolder == null || !moduleHolder.hasInstance()) {
            return;
        }
        ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        C2038a.m8321a(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        for (Map.Entry<String, ModuleHolder> entry : nativeModuleRegistry.getModuleMap().entrySet()) {
            String key = entry.getKey();
            if (!this.mModules.containsKey(key)) {
                this.mModules.put(key, entry.getValue());
            }
        }
    }
}
