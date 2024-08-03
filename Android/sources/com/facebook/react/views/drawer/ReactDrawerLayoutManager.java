package com.facebook.react.views.drawer;

import android.os.Build;
import android.support.v4.widget.C0293k;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.views.drawer.p131a.C1391a;
import com.facebook.react.views.drawer.p131a.C1392b;
import com.facebook.react.views.drawer.p131a.C1393c;
import com.facebook.react.views.drawer.p131a.C1394d;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactDrawerLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<C1390a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    protected static final String REACT_CLASS = "AndroidDrawerLayout";

    /* renamed from: com.facebook.react.views.drawer.ReactDrawerLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C1389a implements C0293k.c {

        /* renamed from: a */
        private final C0293k f5112a;

        /* renamed from: b */
        private final C1333f f5113b;

        public C1389a(C0293k c0293k, C1333f c1333f) {
            this.f5112a = c0293k;
            this.f5113b = c1333f;
        }

        @Override // android.support.v4.widget.C0293k.c
        /* renamed from: a */
        public void mo1677a(int i) {
            this.f5113b.m5753a(new C1394d(this.f5112a.getId(), i));
        }

        @Override // android.support.v4.widget.C0293k.c
        /* renamed from: a */
        public void mo1678a(View view) {
            this.f5113b.m5753a(new C1392b(this.f5112a.getId()));
        }

        @Override // android.support.v4.widget.C0293k.c
        /* renamed from: a */
        public void mo1679a(View view, float f) {
            this.f5113b.m5753a(new C1393c(this.f5112a.getId(), f));
        }

        @Override // android.support.v4.widget.C0293k.c
        /* renamed from: b */
        public void mo1680b(View view) {
            this.f5113b.m5753a(new C1391a(this.f5112a.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1390a c1390a) {
        c1390a.setDrawerListener(new C1389a(c1390a, ((UIManagerModule) c1278n.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C1390a c1390a, View view, int i) {
        if (getChildCount(c1390a) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i == 0 || i == 1) {
            c1390a.addView(view, i);
            c1390a.m5985g();
        } else {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1390a createViewInstance(C1278N c1278n) {
        return new C1390a(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1104f.m5177a("openDrawer", 1, "closeDrawer", 2);
    }

    @InterfaceC1294a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void getDrawerWidth(C1390a c1390a, float f) {
        c1390a.m5987h(Float.isNaN(f) ? -1 : Math.round(C1374w.m5959b(f)));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C1104f.m5179a("topDrawerSlide", C1104f.m5176a("registrationName", "onDrawerSlide"), "topDrawerOpened", C1104f.m5176a("registrationName", "onDrawerOpen"), "topDrawerClosed", C1104f.m5176a("registrationName", "onDrawerClose"), "topDrawerStateChanged", C1104f.m5176a("registrationName", "onDrawerStateChanged"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return C1104f.m5176a("DrawerPosition", C1104f.m5177a("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1390a c1390a, int i, ReadableArray readableArray) {
        if (i == 1) {
            c1390a.m5984f();
        } else {
            if (i != 2) {
                return;
            }
            c1390a.m5983e();
        }
    }

    @InterfaceC1294a(name = "drawerLockMode")
    public void setDrawerLockMode(C1390a c1390a, String str) {
        int i;
        if (str == null || "unlocked".equals(str)) {
            i = 0;
        } else if ("locked-closed".equals(str)) {
            i = 1;
        } else {
            if (!"locked-open".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
            }
            i = 2;
        }
        c1390a.setDrawerLockMode(i);
    }

    @InterfaceC1294a(defaultInt = 8388611, name = "drawerPosition")
    public void setDrawerPosition(C1390a c1390a, int i) {
        if (8388611 == i || 8388613 == i) {
            c1390a.m5986g(i);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(C1390a c1390a, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C1390a.class.getMethod("setDrawerElevation", Float.TYPE).invoke(c1390a, Float.valueOf(C1374w.m5959b(f)));
            } catch (Exception e2) {
                C1700a.m7007b("ReactNative", "setDrawerElevation is not available in this version of the support lib.", e2);
            }
        }
    }
}
