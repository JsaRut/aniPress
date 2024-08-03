package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.p122BV.LinearGradient.LinearGradientManager;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<C1438a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1438a c1438a) {
        c1438a.setOnRefreshListener(new C1440c(this, c1278n, c1438a));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1438a createViewInstance(C1278N c1278n) {
        return new C1438a(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a("topRefresh", C1104f.m5176a("registrationName", "onRefresh"));
        return m5175a.m5185a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return C1104f.m5176a("SIZE", C1104f.m5177a("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC1294a(customType = "ColorArray", name = LinearGradientManager.PROP_COLORS)
    public void setColors(C1438a c1438a, ReadableArray readableArray) {
        if (readableArray == null) {
            c1438a.setColorSchemeColors(new int[0]);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            iArr[i] = readableArray.getInt(i);
        }
        c1438a.setColorSchemeColors(iArr);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1438a c1438a, boolean z) {
        c1438a.setEnabled(z);
    }

    @InterfaceC1294a(customType = "Color", defaultInt = 0, name = "progressBackgroundColor")
    public void setProgressBackgroundColor(C1438a c1438a, int i) {
        c1438a.setProgressBackgroundColorSchemeColor(i);
    }

    @InterfaceC1294a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(C1438a c1438a, float f) {
        c1438a.setProgressViewOffset(f);
    }

    @InterfaceC1294a(name = "refreshing")
    public void setRefreshing(C1438a c1438a, boolean z) {
        c1438a.setRefreshing(z);
    }

    @InterfaceC1294a(defaultInt = 1, name = "size")
    public void setSize(C1438a c1438a, int i) {
        c1438a.setSize(i);
    }
}
