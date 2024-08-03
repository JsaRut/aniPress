package me.listenzz.modal;

import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.views.modal.C1409g;
import com.facebook.react.views.modal.ReactModalHostManager;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = TranslucentModalHostManager.REACT_CLASS)
/* loaded from: classes.dex */
public class TranslucentModalHostManager extends ReactModalHostManager {
    protected static final String REACT_CLASS = "TranslucentModalHostView";

    @Override // com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C1359n createShadowNodeInstance() {
        return new C2740b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.uimanager.ViewManager
    public C1409g createViewInstance(C1278N c1278n) {
        return new C2742d(c1278n);
    }

    @Override // com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C1359n> getShadowNodeClass() {
        return C2740b.class;
    }
}
