package p139d.p143b.p208m;

import android.app.Activity;
import android.app.Application;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.InterfaceC1120f;
import com.facebook.react.devsupport.p124a.InterfaceC1113a;
import com.facebook.react.jscexecutor.C1140a;
import com.facebook.react.modules.core.InterfaceC1164c;
import com.facebook.react.modules.systeminfo.C1254a;
import com.facebook.react.uimanager.C1288V;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: d.b.m.H */
/* loaded from: classes.dex */
public class C2048H {

    /* renamed from: b */
    private String f7448b;

    /* renamed from: c */
    private JSBundleLoader f7449c;

    /* renamed from: d */
    private String f7450d;

    /* renamed from: e */
    private NotThreadSafeBridgeIdleDebugListener f7451e;

    /* renamed from: f */
    private Application f7452f;

    /* renamed from: g */
    private boolean f7453g;

    /* renamed from: h */
    private LifecycleState f7454h;

    /* renamed from: i */
    private C1288V f7455i;

    /* renamed from: j */
    private NativeModuleCallExceptionHandler f7456j;

    /* renamed from: k */
    private Activity f7457k;

    /* renamed from: l */
    private InterfaceC1164c f7458l;

    /* renamed from: m */
    private InterfaceC1120f f7459m;

    /* renamed from: n */
    private boolean f7460n;

    /* renamed from: o */
    private InterfaceC1113a f7461o;

    /* renamed from: p */
    private JavaScriptExecutorFactory f7462p;

    /* renamed from: s */
    private JSIModulePackage f7465s;

    /* renamed from: t */
    private Map<String, Object> f7466t;

    /* renamed from: a */
    private final List<InterfaceC2051K> f7447a = new ArrayList();

    /* renamed from: q */
    private int f7463q = 1;

    /* renamed from: r */
    private int f7464r = -1;

    /* renamed from: a */
    public C2047G m8374a() {
        String str;
        C2038a.m8319a(this.f7452f, "Application property has not been set with this builder");
        boolean z = true;
        C2038a.m8321a((!this.f7453g && this.f7448b == null && this.f7449c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f7450d == null && this.f7448b == null && this.f7449c == null) {
            z = false;
        }
        C2038a.m8321a(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.f7455i == null) {
            this.f7455i = new C1288V();
        }
        String packageName = this.f7452f.getPackageName();
        String m5467a = C1254a.m5467a();
        Application application = this.f7452f;
        Activity activity = this.f7457k;
        InterfaceC1164c interfaceC1164c = this.f7458l;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f7462p;
        if (javaScriptExecutorFactory == null) {
            javaScriptExecutorFactory = new C1140a(packageName, m5467a);
        }
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = javaScriptExecutorFactory;
        JSBundleLoader createAssetLoader = (this.f7449c != null || (str = this.f7448b) == null) ? this.f7449c : JSBundleLoader.createAssetLoader(this.f7452f, str, false);
        String str2 = this.f7450d;
        List<InterfaceC2051K> list = this.f7447a;
        boolean z2 = this.f7453g;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f7451e;
        LifecycleState lifecycleState = this.f7454h;
        C2038a.m8319a(lifecycleState, "Initial lifecycle state was not set");
        return new C2047G(application, activity, interfaceC1164c, javaScriptExecutorFactory2, createAssetLoader, str2, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, this.f7455i, this.f7456j, this.f7459m, this.f7460n, this.f7461o, this.f7463q, this.f7464r, this.f7465s, this.f7466t);
    }

    /* renamed from: a */
    public C2048H m8375a(Application application) {
        this.f7452f = application;
        return this;
    }

    /* renamed from: a */
    public C2048H m8376a(JSBundleLoader jSBundleLoader) {
        this.f7449c = jSBundleLoader;
        this.f7448b = null;
        return this;
    }

    /* renamed from: a */
    public C2048H m8377a(JSIModulePackage jSIModulePackage) {
        this.f7465s = jSIModulePackage;
        return this;
    }

    /* renamed from: a */
    public C2048H m8378a(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f7462p = javaScriptExecutorFactory;
        return this;
    }

    /* renamed from: a */
    public C2048H m8379a(LifecycleState lifecycleState) {
        this.f7454h = lifecycleState;
        return this;
    }

    /* renamed from: a */
    public C2048H m8380a(InterfaceC1120f interfaceC1120f) {
        this.f7459m = interfaceC1120f;
        return this;
    }

    /* renamed from: a */
    public C2048H m8381a(C1288V c1288v) {
        this.f7455i = c1288v;
        return this;
    }

    /* renamed from: a */
    public C2048H m8382a(InterfaceC2051K interfaceC2051K) {
        this.f7447a.add(interfaceC2051K);
        return this;
    }

    /* renamed from: a */
    public C2048H m8383a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f7448b = str2;
        this.f7449c = null;
        return this;
    }

    /* renamed from: a */
    public C2048H m8384a(boolean z) {
        this.f7453g = z;
        return this;
    }

    /* renamed from: b */
    public C2048H m8385b(String str) {
        if (!str.startsWith("assets://")) {
            m8376a(JSBundleLoader.createFileLoader(str));
            return this;
        }
        this.f7448b = str;
        this.f7449c = null;
        return this;
    }

    /* renamed from: c */
    public C2048H m8386c(String str) {
        this.f7450d = str;
        return this;
    }
}
