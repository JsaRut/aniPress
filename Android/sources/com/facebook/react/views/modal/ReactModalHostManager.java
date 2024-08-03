package com.facebook.react.views.modal;

import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactModalHostManager extends ViewGroupManager<C1409g> {
    public static final String REACT_CLASS = "RCTModalHostView";

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1409g c1409g) {
        C1333f eventDispatcher = ((UIManagerModule) c1278n.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        c1409g.setOnRequestCloseListener(new C1405c(this, eventDispatcher, c1409g));
        c1409g.setOnShowListener(new DialogInterfaceOnShowListenerC1406d(this, eventDispatcher, c1409g));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C1359n createShadowNodeInstance() {
        return new C1404b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1409g createViewInstance(C1278N c1278n) {
        return new C1409g(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a("topRequestClose", C1104f.m5176a("registrationName", "onRequestClose"));
        m5175a.m5184a("topShow", C1104f.m5176a("registrationName", "onShow"));
        return m5175a.m5185a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C1359n> getShadowNodeClass() {
        return C1404b.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C1409g c1409g) {
        super.onAfterUpdateTransaction((ReactModalHostManager) c1409g);
        c1409g.mo6032b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C1409g c1409g) {
        super.onDropViewInstance((ReactModalHostManager) c1409g);
        c1409g.m6031a();
    }

    @InterfaceC1294a(name = "animationType")
    public void setAnimationType(C1409g c1409g, String str) {
        c1409g.setAnimationType(str);
    }

    @InterfaceC1294a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(C1409g c1409g, boolean z) {
        c1409g.setHardwareAccelerated(z);
    }

    @InterfaceC1294a(name = "transparent")
    public void setTransparent(C1409g c1409g, boolean z) {
        c1409g.setTransparent(z);
    }
}
