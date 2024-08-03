package p139d.p143b.p208m;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C1112a;
import com.facebook.react.devsupport.InterfaceC1119e;
import com.facebook.react.devsupport.InterfaceC1120f;
import com.facebook.react.devsupport.p124a.InterfaceC1113a;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.C1170i;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.InterfaceC1164c;
import com.facebook.react.modules.debug.p126a.InterfaceC1179a;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.uimanager.C1288V;
import com.facebook.react.uimanager.C1289W;
import com.facebook.react.uimanager.C1347h;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p162e.p165b.C1747c;
import p139d.p143b.p162e.p166c.C1748a;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.G */
/* loaded from: classes.dex */
public class C2047G {

    /* renamed from: b */
    private volatile LifecycleState f7422b;

    /* renamed from: c */
    private a f7423c;

    /* renamed from: d */
    private volatile Thread f7424d;

    /* renamed from: e */
    private final JavaScriptExecutorFactory f7425e;

    /* renamed from: f */
    private final JSBundleLoader f7426f;

    /* renamed from: g */
    private final String f7427g;

    /* renamed from: h */
    private final List<InterfaceC2051K> f7428h;

    /* renamed from: i */
    private final InterfaceC1114b f7429i;

    /* renamed from: j */
    private final boolean f7430j;

    /* renamed from: k */
    private final NotThreadSafeBridgeIdleDebugListener f7431k;

    /* renamed from: m */
    private volatile ReactContext f7433m;

    /* renamed from: n */
    private final Context f7434n;

    /* renamed from: o */
    private InterfaceC1164c f7435o;

    /* renamed from: p */
    private Activity f7436p;

    /* renamed from: t */
    private final ComponentCallbacks2C2120k f7440t;

    /* renamed from: u */
    private final NativeModuleCallExceptionHandler f7441u;

    /* renamed from: v */
    private final JSIModulePackage f7442v;

    /* renamed from: w */
    private List<ViewManager> f7443w;

    /* renamed from: a */
    private final Set<C2056P> f7421a = Collections.synchronizedSet(new HashSet());

    /* renamed from: l */
    private final Object f7432l = new Object();

    /* renamed from: q */
    private final Collection<b> f7437q = Collections.synchronizedSet(new HashSet());

    /* renamed from: r */
    private volatile boolean f7438r = false;

    /* renamed from: s */
    private volatile Boolean f7439s = false;

    /* renamed from: d.b.m.G$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        private final JavaScriptExecutorFactory f7444a;

        /* renamed from: b */
        private final JSBundleLoader f7445b;

        public a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            C2038a.m8318a(javaScriptExecutorFactory);
            this.f7444a = javaScriptExecutorFactory;
            C2038a.m8318a(jSBundleLoader);
            this.f7445b = jSBundleLoader;
        }

        /* renamed from: a */
        public JSBundleLoader m8371a() {
            return this.f7445b;
        }

        /* renamed from: b */
        public JavaScriptExecutorFactory m8372b() {
            return this.f7444a;
        }
    }

    /* renamed from: d.b.m.G$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m8373a(ReactContext reactContext);
    }

    public C2047G(Context context, Activity activity, InterfaceC1164c interfaceC1164c, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<InterfaceC2051K> list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, C1288V c1288v, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, InterfaceC1120f interfaceC1120f, boolean z2, InterfaceC1113a interfaceC1113a, int i, int i2, JSIModulePackage jSIModulePackage, Map<String, Object> map) {
        Log.d("ReactNative", "ReactInstanceManager.ctor()");
        m8328a(context);
        C1347h.m5786b(context);
        this.f7434n = context;
        this.f7436p = activity;
        this.f7435o = interfaceC1164c;
        this.f7425e = javaScriptExecutorFactory;
        this.f7426f = jSBundleLoader;
        this.f7427g = str;
        this.f7428h = new ArrayList();
        this.f7430j = z;
        C1550a.m6454a(0L, "ReactInstanceManager.initDevSupportManager");
        this.f7429i = C1112a.m5198a(context, m8345k(), this.f7427g, z, interfaceC1120f, interfaceC1113a, i, map);
        C1550a.m6453a(0L);
        this.f7431k = notThreadSafeBridgeIdleDebugListener;
        this.f7422b = lifecycleState;
        this.f7440t = new ComponentCallbacks2C2120k(context);
        this.f7441u = nativeModuleCallExceptionHandler;
        synchronized (this.f7428h) {
            C1747c.m7161a().mo7158a(C1748a.f6322c, "RNCore: Use Split Packages");
            this.f7428h.add(new C2068c(this, new C2131v(this), c1288v, z2, i2));
            if (this.f7430j) {
                this.f7428h.add(new C2076f());
            }
            this.f7428h.addAll(list);
        }
        this.f7442v = jSIModulePackage;
        C1170i.m5291b();
        if (this.f7430j) {
            this.f7429i.mo5211g();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private NativeModuleRegistry m8322a(ReactApplicationContext reactApplicationContext, List<InterfaceC2051K> list, boolean z) {
        C2121l c2121l = new C2121l(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f7428h) {
            Iterator<InterfaceC2051K> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    InterfaceC2051K next = it.next();
                    if (!z || !this.f7428h.contains(next)) {
                        C1550a.m6454a(0L, "createAndProcessCustomReactPackage");
                        if (z) {
                            try {
                                this.f7428h.add(next);
                            } catch (Throwable th) {
                                C1550a.m6453a(0L);
                                throw th;
                            }
                        }
                        m8335a(next, c2121l);
                        C1550a.m6453a(0L);
                    }
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        C1550a.m6454a(0L, "buildNativeModuleRegistry");
        try {
            return c2121l.m8475a();
        } finally {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    /* renamed from: a */
    public ReactApplicationContext m8323a(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.f7434n);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.f7441u;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.f7429i;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(m8322a(reactApplicationContext, this.f7428h, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        C1550a.m6454a(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            JSIModulePackage jSIModulePackage = this.f7442v;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f7431k;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (C1550a.m6462b(0L)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            C1550a.m6454a(0L, "runJSBundle");
            build.runJSBundle();
            C1550a.m6453a(0L);
            reactApplicationContext.initializeWithInstance(build);
            return reactApplicationContext;
        } catch (Throwable th) {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    /* renamed from: a */
    public static C2048H m8326a() {
        return new C2048H();
    }

    /* renamed from: a */
    private static void m8328a(Context context) {
        SoLoader.m6385a(context, false);
    }

    /* renamed from: a */
    private void m8329a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        a aVar = new a(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f7424d == null) {
            m8332a(aVar);
        } else {
            this.f7423c = aVar;
        }
    }

    /* renamed from: a */
    private void m8330a(NativeDeltaClient nativeDeltaClient) {
        Log.d("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        m8329a(this.f7425e, nativeDeltaClient == null ? JSBundleLoader.createCachedBundleFromNetworkLoader(this.f7429i.mo5209e(), this.f7429i.mo5199a()) : JSBundleLoader.createDeltaFromNetworkLoader(this.f7429i.mo5209e(), nativeDeltaClient));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m8331a(ReactContext reactContext) {
        Log.d("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f7422b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f7421a) {
            for (C2056P c2056p : this.f7421a) {
                c2056p.removeAllViews();
                c2056p.setId(-1);
            }
        }
        reactContext.destroy();
        this.f7429i.mo5204b(reactContext);
        this.f7440t.m8474b(reactContext.getCatalystInstance());
    }

    /* renamed from: a */
    public void m8332a(a aVar) {
        Log.d("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f7421a) {
            synchronized (this.f7432l) {
                if (this.f7433m != null) {
                    m8331a(this.f7433m);
                    this.f7433m = null;
                }
            }
        }
        this.f7424d = new Thread(null, new RunnableC2042B(this, aVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f7424d.start();
    }

    /* renamed from: a */
    private void m8335a(InterfaceC2051K interfaceC2051K, C2121l c2121l) {
        C1552c.a m6467a = C1552c.m6467a(0L, "processPackage");
        m6467a.mo6469a("className", interfaceC2051K.getClass().getSimpleName());
        m6467a.mo6470a();
        boolean z = interfaceC2051K instanceof InterfaceC2055O;
        if (z) {
            ((InterfaceC2055O) interfaceC2051K).mo8398a();
        }
        c2121l.m8476a(interfaceC2051K);
        if (z) {
            ((InterfaceC2055O) interfaceC2051K).mo8399b();
        }
        C1552c.m6466a(0L).mo6470a();
    }

    /* renamed from: a */
    private void m8336a(C2056P c2056p, CatalystInstance catalystInstance) {
        Log.d("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (c2056p.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(c2056p.getId());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(c2056p.getId());
        }
    }

    /* renamed from: a */
    private synchronized void m8337a(boolean z) {
        ReactContext m8362c = m8362c();
        if (m8362c != null && (z || this.f7422b == LifecycleState.BEFORE_RESUME || this.f7422b == LifecycleState.BEFORE_CREATE)) {
            m8362c.onHostResume(this.f7436p);
        }
        this.f7422b = LifecycleState.RESUMED;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public void m8340b(ReactApplicationContext reactApplicationContext) {
        Log.d("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        C1550a.m6454a(0L, "setupReactContext");
        synchronized (this.f7421a) {
            synchronized (this.f7432l) {
                C2038a.m8318a(reactApplicationContext);
                this.f7433m = reactApplicationContext;
            }
            CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
            C2038a.m8318a(catalystInstance);
            CatalystInstance catalystInstance2 = catalystInstance;
            catalystInstance2.initialize();
            this.f7429i.mo5200a(reactApplicationContext);
            this.f7440t.m8473a(catalystInstance2);
            m8347m();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            Iterator<C2056P> it = this.f7421a.iterator();
            while (it.hasNext()) {
                m8343c(it.next());
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new RunnableC2043C(this, (b[]) this.f7437q.toArray(new b[this.f7437q.size()]), reactApplicationContext));
        C1550a.m6453a(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new RunnableC2044D(this));
        reactApplicationContext.runOnNativeModulesQueueThread(new RunnableC2045E(this));
    }

    /* renamed from: c */
    private void m8343c(C2056P c2056p) {
        Log.d("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        C1550a.m6454a(0L, "attachRootViewToInstance");
        UIManager m5672a = C1289W.m5672a(this.f7433m, c2056p.getUIManagerType());
        Bundle appProperties = c2056p.getAppProperties();
        int addRootView = m5672a.addRootView(c2056p, appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), c2056p.getInitialUITemplate());
        c2056p.setRootViewTag(addRootView);
        c2056p.m8411b();
        C1550a.m6455a(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
        UiThreadUtil.runOnUiThread(new RunnableC2046F(this, addRootView, c2056p));
        C1550a.m6453a(0L);
    }

    /* renamed from: k */
    private InterfaceC1119e m8345k() {
        return new C2132w(this);
    }

    /* renamed from: l */
    public void m8346l() {
        UiThreadUtil.assertOnUiThread();
        InterfaceC1164c interfaceC1164c = this.f7435o;
        if (interfaceC1164c != null) {
            interfaceC1164c.mo5285b();
        }
    }

    /* renamed from: m */
    private synchronized void m8347m() {
        if (this.f7422b == LifecycleState.RESUMED) {
            m8337a(true);
        }
    }

    /* renamed from: n */
    private synchronized void m8348n() {
        ReactContext m8362c = m8362c();
        if (m8362c != null) {
            if (this.f7422b == LifecycleState.RESUMED) {
                m8362c.onHostPause();
                this.f7422b = LifecycleState.BEFORE_RESUME;
            }
            if (this.f7422b == LifecycleState.BEFORE_RESUME) {
                m8362c.onHostDestroy();
            }
        }
        this.f7422b = LifecycleState.BEFORE_CREATE;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: o */
    private synchronized void m8349o() {
        ReactContext m8362c = m8362c();
        if (m8362c != null) {
            if (this.f7422b == LifecycleState.BEFORE_CREATE) {
                m8362c.onHostResume(this.f7436p);
            } else if (this.f7422b == LifecycleState.RESUMED) {
            }
            m8362c.onHostPause();
        }
        this.f7422b = LifecycleState.BEFORE_RESUME;
    }

    /* renamed from: p */
    private void m8350p() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        C1747c.m7161a().mo7158a(C1748a.f6322c, "RNCore: load from BundleLoader");
        m8329a(this.f7425e, this.f7426f);
    }

    /* renamed from: q */
    private void m8351q() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        C1747c.m7161a().mo7158a(C1748a.f6322c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f7430j && this.f7427g != null) {
            InterfaceC1179a mo5210f = this.f7429i.mo5210f();
            if (this.f7429i.mo5212h() && !mo5210f.m5313b()) {
                m8330a((NativeDeltaClient) null);
                return;
            } else if (!C1550a.m6462b(0L)) {
                if (this.f7426f == null) {
                    this.f7429i.mo5208d();
                    return;
                } else {
                    this.f7429i.mo5201a(new C2133x(this, mo5210f));
                    return;
                }
            }
        }
        m8350p();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public ViewManager m8352a(String str) {
        ViewManager m8424a;
        synchronized (this.f7432l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) m8362c();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.f7428h) {
                    for (InterfaceC2051K interfaceC2051K : this.f7428h) {
                        if ((interfaceC2051K instanceof InterfaceC2060U) && (m8424a = ((InterfaceC2060U) interfaceC2051K).m8424a(reactApplicationContext, str)) != null) {
                            return m8424a;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public List<ViewManager> m8353a(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        C1550a.m6454a(0L, "createAllViewManagers");
        try {
            if (this.f7443w == null) {
                synchronized (this.f7428h) {
                    if (this.f7443w == null) {
                        this.f7443w = new ArrayList();
                        Iterator<InterfaceC2051K> it = this.f7428h.iterator();
                        while (it.hasNext()) {
                            this.f7443w.addAll(it.next().mo4767a(reactApplicationContext));
                        }
                        list = this.f7443w;
                    }
                }
                return list;
            }
            list = this.f7443w;
            return list;
        } finally {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    /* renamed from: a */
    public void m8354a(Activity activity) {
        if (activity == this.f7436p) {
            m8368h();
        }
    }

    /* renamed from: a */
    public void m8355a(Activity activity, int i, int i2, Intent intent) {
        ReactContext m8362c = m8362c();
        if (m8362c != null) {
            m8362c.onActivityResult(activity, i, i2, intent);
        }
    }

    /* renamed from: a */
    public void m8356a(Activity activity, InterfaceC1164c interfaceC1164c) {
        UiThreadUtil.assertOnUiThread();
        this.f7435o = interfaceC1164c;
        m8363c(activity);
    }

    /* renamed from: a */
    public void m8357a(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext m8362c = m8362c();
        if (m8362c == null) {
            C1700a.m7015d("ReactNative", "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            ((DeviceEventManagerModule) m8362c.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        m8362c.onNewIntent(this.f7436p, intent);
    }

    /* renamed from: a */
    public void m8358a(C2056P c2056p) {
        UiThreadUtil.assertOnUiThread();
        this.f7421a.add(c2056p);
        c2056p.removeAllViews();
        c2056p.setId(-1);
        ReactContext m8362c = m8362c();
        if (this.f7424d != null || m8362c == null) {
            return;
        }
        m8343c(c2056p);
    }

    /* renamed from: b */
    public void m8359b() {
        Log.d("ReactNative", "ReactInstanceManager.createReactContextInBackground()");
        C2038a.m8321a(!this.f7438r, "createReactContextInBackground should only be called when creating the react application for the first time. When reloading JS, e.g. from a new file, explicitlyuse recreateReactContextInBackground");
        this.f7438r = true;
        m8351q();
    }

    /* renamed from: b */
    public void m8360b(Activity activity) {
        C2038a.m8318a(this.f7436p);
        C2038a.m8321a(activity == this.f7436p, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f7436p.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        m8369i();
    }

    /* renamed from: b */
    public void m8361b(C2056P c2056p) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f7421a) {
            if (this.f7421a.contains(c2056p)) {
                ReactContext m8362c = m8362c();
                this.f7421a.remove(c2056p);
                if (m8362c != null && m8362c.hasActiveCatalystInstance()) {
                    m8336a(c2056p, m8362c.getCatalystInstance());
                }
            }
        }
    }

    /* renamed from: c */
    public ReactContext m8362c() {
        ReactContext reactContext;
        synchronized (this.f7432l) {
            reactContext = this.f7433m;
        }
        return reactContext;
    }

    /* renamed from: c */
    public void m8363c(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f7436p = activity;
        if (this.f7430j) {
            View decorView = this.f7436p.getWindow().getDecorView();
            if (C0107v.m529q(decorView)) {
                this.f7429i.mo5203a(true);
            } else {
                decorView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2134y(this, decorView));
            }
        }
        m8337a(false);
    }

    /* renamed from: d */
    public InterfaceC1114b m8364d() {
        return this.f7429i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: e */
    public List<String> m8365e() {
        ArrayList arrayList;
        List<String> m8425a;
        C1550a.m6454a(0L, "ReactInstanceManager.getViewManagerNames");
        synchronized (this.f7432l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) m8362c();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.f7428h) {
                    HashSet hashSet = new HashSet();
                    for (InterfaceC2051K interfaceC2051K : this.f7428h) {
                        C1552c.a m6467a = C1552c.m6467a(0L, "ReactInstanceManager.getViewManagerName");
                        m6467a.mo6469a("Package", interfaceC2051K.getClass().getSimpleName());
                        m6467a.mo6470a();
                        if ((interfaceC2051K instanceof InterfaceC2060U) && (m8425a = ((InterfaceC2060U) interfaceC2051K).m8425a(reactApplicationContext)) != null) {
                            hashSet.addAll(m8425a);
                        }
                        C1552c.m6466a(0L).mo6470a();
                    }
                    C1550a.m6453a(0L);
                    arrayList = new ArrayList(hashSet);
                }
                return arrayList;
            }
            return null;
        }
    }

    /* renamed from: f */
    public boolean m8366f() {
        return this.f7438r;
    }

    /* renamed from: g */
    public void m8367g() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f7433m;
        if (reactContext != null) {
            ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
        } else {
            C1700a.m7015d("ReactNative", "Instance detached from instance manager");
            m8346l();
        }
    }

    /* renamed from: h */
    public void m8368h() {
        UiThreadUtil.assertOnUiThread();
        if (this.f7430j) {
            this.f7429i.mo5203a(false);
        }
        m8348n();
        this.f7436p = null;
    }

    /* renamed from: i */
    public void m8369i() {
        UiThreadUtil.assertOnUiThread();
        this.f7435o = null;
        if (this.f7430j) {
            this.f7429i.mo5203a(false);
        }
        m8349o();
    }

    /* renamed from: j */
    public void m8370j() {
        UiThreadUtil.assertOnUiThread();
        this.f7429i.mo5213i();
    }
}
