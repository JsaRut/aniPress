package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.util.ArrayMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.common.C1322b;
import com.facebook.react.uimanager.common.InterfaceC1321a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.p128b.InterfaceC1298a;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p162e.p165b.C1747c;
import p139d.p143b.p162e.p166c.C1748a;
import p139d.p143b.p208m.p209a.AbstractC2062a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    private static final boolean DEBUG = C1747c.m7161a().mo7160a(C1748a.f6325f);
    public static final String NAME = "UIManager";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final C1333f mEventDispatcher;
    private final List<InterfaceC1327ea> mListeners;
    private final ComponentCallbacks2C1286b mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final C1284U mUIImplementation;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final C1362oa mViewManagerRegistry;

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1285a {
        /* renamed from: a */
        String mo5668a(String str);
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$b */
    /* loaded from: classes.dex */
    public class ComponentCallbacks2C1286b implements ComponentCallbacks2 {
        private ComponentCallbacks2C1286b() {
        }

        /* synthetic */ ComponentCallbacks2C1286b(UIManagerModule uIManagerModule, C1290X c1290x) {
            this();
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                C1370sa.m5936a().m5164b();
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.UIManagerModule$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1287c {
        /* renamed from: a */
        ViewManager mo5669a(String str);

        /* renamed from: a */
        List<String> mo5670a();
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, InterfaceC1287c interfaceC1287c, int i) {
        this(reactApplicationContext, interfaceC1287c, new C1288V(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, InterfaceC1287c interfaceC1287c, C1288V c1288v, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new ComponentCallbacks2C1286b(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        C1347h.m5786b(reactApplicationContext);
        this.mEventDispatcher = new C1333f(reactApplicationContext);
        this.mModuleConstants = createConstants(interfaceC1287c);
        this.mCustomDirectEvents = C1319ca.m5701c();
        this.mViewManagerRegistry = new C1362oa(interfaceC1287c);
        this.mUIImplementation = c1288v.m5671a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new C1288V(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, C1288V c1288v, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new ComponentCallbacks2C1286b(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        C1347h.m5786b(reactApplicationContext);
        this.mEventDispatcher = new C1333f(reactApplicationContext);
        this.mCustomDirectEvents = C1104f.m5182b();
        this.mModuleConstants = createConstants(list, null, this.mCustomDirectEvents);
        this.mViewManagerRegistry = new C1362oa(list);
        this.mUIImplementation = c1288v.m5671a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager m5646b = str != null ? this.mUIImplementation.m5646b(str) : null;
        if (m5646b == null) {
            return null;
        }
        C1552c.a m6467a = C1552c.m6467a(0L, "UIManagerModule.getConstantsForViewManager");
        m6467a.mo6469a("ViewManager", m5646b.getName());
        m6467a.mo6469a("Lazy", (Object) true);
        m6467a.mo6470a();
        try {
            Map<String, Object> m5711a = C1325da.m5711a(m5646b, null, null, null, this.mCustomDirectEvents);
            if (m5711a != null) {
                return Arguments.makeNativeMap(m5711a);
            }
            return null;
        } finally {
            C1552c.m6466a(0L).mo6470a();
        }
    }

    private static Map<String, Object> createConstants(InterfaceC1287c interfaceC1287c) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C1552c.a m6467a = C1552c.m6467a(0L, "CreateUIManagerConstants");
        m6467a.mo6469a("Lazy", (Object) true);
        m6467a.mo6470a();
        try {
            return C1325da.m5710a(interfaceC1287c);
        } finally {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C1552c.a m6467a = C1552c.m6467a(0L, "CreateUIManagerConstants");
        m6467a.mo6469a("Lazy", Boolean.valueOf(DEBUG));
        m6467a.mo6470a();
        try {
            return C1325da.m5712a(list, map, map2);
        } finally {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public void addAnimation(int i, int i2, Callback callback) {
        this.mUIImplementation.m5621a(i, i2, callback);
    }

    public <T extends SizeMonitoringFrameLayout & InterfaceC1321a> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends SizeMonitoringFrameLayout & InterfaceC1321a> int addRootView(T t, WritableMap writableMap, String str) {
        C1550a.m6454a(0L, "UIManagerModule.addRootView");
        int m5474a = C1268D.m5474a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        this.mUIImplementation.m5642a((C1284U) t, m5474a, new C1278N(reactApplicationContext, t.getContext()));
        t.setOnSizeChangedListener(new C1292Z(this, reactApplicationContext, m5474a));
        C1550a.m6453a(0L);
        return m5474a;
    }

    public void addUIBlock(InterfaceC1282S interfaceC1282S) {
        this.mUIImplementation.m5640a(interfaceC1282S);
    }

    public void addUIManagerListener(InterfaceC1327ea interfaceC1327ea) {
        this.mListeners.add(interfaceC1327ea);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.m5616a();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.m5634a(readableMap, callback, callback2);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            C1700a.m6997a("ReactNative", str2);
            C1747c.m7161a().mo7158a(C1748a.f6325f, str2);
        }
        this.mUIImplementation.m5631a(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.m5654c();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.m5623a(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        C1289W.m5672a(getReactApplicationContext(), C1322b.m5702a(i)).dispatchCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.m5618a(i, Math.round(C1374w.m5956a(readableArray.getDouble(0))), Math.round(C1374w.m5956a(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(C1325da.m5709a());
    }

    public InterfaceC1285a getDirectEventNamesResolver() {
        return new C1290X(this);
    }

    public C1333f getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.m5657d();
    }

    public C1284U getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public C1362oa getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.m5751a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        InterfaceC1269E m5663g = this.mUIImplementation.m5663g(i);
        if (m5663g != null) {
            m5663g.mo5494c();
            this.mUIImplementation.m5617a(-1);
        } else {
            C1700a.m7015d("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
        }
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            C1700a.m6997a("ReactNative", str);
            C1747c.m7161a().mo7158a(C1748a.f6325f, str);
        }
        this.mUIImplementation.m5628a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.m5624a(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.m5651b(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.m5622a(i, i2, callback, callback2);
    }

    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.m5625a(i, callback, callback2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        C1552c.a m6467a = C1552c.m6467a(0L, "onBatchCompleteUI");
        m6467a.mo6468a("BatchId", i);
        m6467a.mo6470a();
        Iterator<InterfaceC1327ea> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.m5617a(i);
        } finally {
            C1550a.m6453a(0L);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.m5757c();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        C1370sa.m5936a().m5164b();
        C1360na.m5858a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.m5659e();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.m5662f();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.m5664g();
    }

    @ReactMethod
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                arrayMap.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(arrayMap);
    }

    public void prependUIBlock(InterfaceC1282S interfaceC1282S) {
        this.mUIImplementation.m5653b(interfaceC1282S);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.m5665h();
    }

    public void registerAnimation(AbstractC2062a abstractC2062a) {
        this.mUIImplementation.m5643a(abstractC2062a);
    }

    public void removeAnimation(int i, int i2) {
        this.mUIImplementation.m5619a(i, i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.m5658d(i);
    }

    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.m5660e(i);
    }

    public void removeUIManagerListener(InterfaceC1327ea interfaceC1327ea) {
        this.mListeners.remove(interfaceC1327ea);
    }

    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.m5648b(i, i2);
    }

    public int resolveRootTagFromReactTag(int i) {
        return C1322b.m5703b(i) ? i : this.mUIImplementation.m5661f(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.m5656c(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + readableArray;
            C1700a.m6997a("ReactNative", str);
            C1747c.m7161a().mo7158a(C1748a.f6325f, str);
        }
        this.mUIImplementation.m5626a(i, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.m5633a(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.m5644a(z);
    }

    public void setViewHierarchyUpdateDebugListener(InterfaceC1298a interfaceC1298a) {
        this.mUIImplementation.m5641a(interfaceC1298a);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new C1296aa(this, reactApplicationContext, i, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.m5627a(i, readableArray, callback, callback2);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.m5620a(i, i2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new C1299ba(this, reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            C1700a.m6997a("ReactNative", str2);
            C1747c.m7161a().mo7158a(C1748a.f6325f, str2);
        }
        this.mUIImplementation.m5632a(i, str, readableMap);
    }

    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.m5650b(i, i2, callback);
    }
}
