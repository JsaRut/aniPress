package p139d.p143b.p208m;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.InterfaceC1141a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.InterfaceC1164c;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.C1288V;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.C1550a;
import java.util.HashMap;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.m.c */
/* loaded from: classes.dex */
public class C2068c extends AbstractC2059T implements InterfaceC2055O {

    /* renamed from: a */
    private final C2047G f7515a;

    /* renamed from: b */
    private final InterfaceC1164c f7516b;

    /* renamed from: c */
    private final boolean f7517c;

    /* renamed from: d */
    private final int f7518d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2068c(C2047G c2047g, InterfaceC1164c interfaceC1164c, C1288V c1288v, boolean z, int i) {
        this.f7515a = c2047g;
        this.f7516b = interfaceC1164c;
        this.f7517c = z;
        this.f7518d = i;
    }

    /* renamed from: e */
    private UIManagerModule m8436e(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        C1550a.m6454a(0L, "createUIManagerModule");
        try {
            return this.f7517c ? new UIManagerModule(reactApplicationContext, new C2066b(this), this.f7518d) : new UIManagerModule(reactApplicationContext, this.f7515a.m8353a(reactApplicationContext), this.f7518d);
        } finally {
            C1550a.m6453a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p139d.p143b.p208m.AbstractC2059T
    /* renamed from: a */
    public NativeModule mo8420a(String str, ReactApplicationContext reactApplicationContext) {
        char c2;
        switch (str.hashCode()) {
            case -1789797270:
                if (str.equals(Timing.NAME)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1520650172:
                if (str.equals(DeviceInfoModule.NAME)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1037217463:
                if (str.equals(DeviceEventManagerModule.NAME)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -790603268:
                if (str.equals(AndroidInfoModule.NAME)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 512434409:
                if (str.equals(ExceptionsManagerModule.NAME)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 881516744:
                if (str.equals(SourceCodeModule.NAME)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1256514152:
                if (str.equals(HeadlessJsTaskSupportModule.NAME)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new AndroidInfoModule(reactApplicationContext);
            case 1:
                return new DeviceEventManagerModule(reactApplicationContext, this.f7516b);
            case 2:
                return new ExceptionsManagerModule(this.f7515a.m8364d());
            case 3:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case 4:
                return new SourceCodeModule(reactApplicationContext);
            case 5:
                return new Timing(reactApplicationContext, this.f7515a.m8364d());
            case 6:
                return m8436e(reactApplicationContext);
            case 7:
                return new DeviceInfoModule(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // p139d.p143b.p208m.InterfaceC2055O
    /* renamed from: a */
    public void mo8398a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // p139d.p143b.p208m.InterfaceC2055O
    /* renamed from: b */
    public void mo8399b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // p139d.p143b.p208m.AbstractC2059T
    /* renamed from: c */
    public InterfaceC1141a mo8421c() {
        try {
            return (InterfaceC1141a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            HashMap hashMap = new HashMap();
            for (Class cls : new Class[]{AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, ExceptionsManagerModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, Timing.class, UIManagerModule.class}) {
                InterfaceC2073a interfaceC2073a = (InterfaceC2073a) cls.getAnnotation(InterfaceC2073a.class);
                hashMap.put(interfaceC2073a.name(), new ReactModuleInfo(interfaceC2073a.name(), cls.getName(), interfaceC2073a.canOverrideExistingModule(), interfaceC2073a.needsEagerInit(), interfaceC2073a.hasConstants(), interfaceC2073a.isCxxModule(), false));
            }
            return new C2061a(this, hashMap);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e3);
        }
    }
}
