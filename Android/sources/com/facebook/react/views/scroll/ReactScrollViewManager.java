package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1347h;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.react.views.scroll.C1427h;
import com.facebook.yoga.C1553a;
import java.util.ArrayList;
import java.util.Map;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactScrollViewManager extends ViewGroupManager<ViewGroupOnHierarchyChangeListenerC1426g> implements C1427h.a<ViewGroupOnHierarchyChangeListenerC1426g> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private InterfaceC1420a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(InterfaceC1420a interfaceC1420a) {
        this.mFpsListener = null;
        this.mFpsListener = interfaceC1420a;
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        C1104f.a m5175a = C1104f.m5175a();
        m5175a.m5184a(EnumC1431l.m6105a(EnumC1431l.SCROLL), C1104f.m5176a("registrationName", "onScroll"));
        m5175a.m5184a(EnumC1431l.m6105a(EnumC1431l.BEGIN_DRAG), C1104f.m5176a("registrationName", "onScrollBeginDrag"));
        m5175a.m5184a(EnumC1431l.m6105a(EnumC1431l.END_DRAG), C1104f.m5176a("registrationName", "onScrollEndDrag"));
        m5175a.m5184a(EnumC1431l.m6105a(EnumC1431l.MOMENTUM_BEGIN), C1104f.m5176a("registrationName", "onMomentumScrollBegin"));
        m5175a.m5184a(EnumC1431l.m6105a(EnumC1431l.MOMENTUM_END), C1104f.m5176a("registrationName", "onMomentumScrollEnd"));
        return m5175a.m5185a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroupOnHierarchyChangeListenerC1426g createViewInstance(C1278N c1278n) {
        return new ViewGroupOnHierarchyChangeListenerC1426g(c1278n, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.C1427h.a
    public void flashScrollIndicators(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g) {
        viewGroupOnHierarchyChangeListenerC1426g.m6091b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1427h.m6092a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, int i, ReadableArray readableArray) {
        C1427h.m6093a(this, viewGroupOnHierarchyChangeListenerC1426g, i, readableArray);
    }

    @Override // com.facebook.react.views.scroll.C1427h.a
    public void scrollTo(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, C1427h.b bVar) {
        if (bVar.f5273c) {
            viewGroupOnHierarchyChangeListenerC1426g.smoothScrollTo(bVar.f5271a, bVar.f5272b);
        } else {
            viewGroupOnHierarchyChangeListenerC1426g.scrollTo(bVar.f5271a, bVar.f5272b);
        }
    }

    @Override // com.facebook.react.views.scroll.C1427h.a
    public void scrollToEnd(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, C1427h.c cVar) {
        int height = viewGroupOnHierarchyChangeListenerC1426g.getChildAt(0).getHeight() + viewGroupOnHierarchyChangeListenerC1426g.getPaddingBottom();
        if (cVar.f5274a) {
            viewGroupOnHierarchyChangeListenerC1426g.smoothScrollTo(viewGroupOnHierarchyChangeListenerC1426g.getScrollX(), height);
        } else {
            viewGroupOnHierarchyChangeListenerC1426g.scrollTo(viewGroupOnHierarchyChangeListenerC1426g.getScrollX(), height);
        }
    }

    @InterfaceC1295b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, int i, Integer num) {
        viewGroupOnHierarchyChangeListenerC1426g.m6090a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        if (i == 0) {
            viewGroupOnHierarchyChangeListenerC1426g.setBorderRadius(f);
        } else {
            viewGroupOnHierarchyChangeListenerC1426g.m6088a(f, i - 1);
        }
    }

    @InterfaceC1294a(name = "borderStyle")
    public void setBorderStyle(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, String str) {
        viewGroupOnHierarchyChangeListenerC1426g.setBorderStyle(str);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        viewGroupOnHierarchyChangeListenerC1426g.m6089a(SPACING_TYPES[i], f);
    }

    @InterfaceC1294a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, int i) {
        viewGroupOnHierarchyChangeListenerC1426g.setEndFillColor(i);
    }

    @InterfaceC1294a(name = "decelerationRate")
    public void setDecelerationRate(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, float f) {
        viewGroupOnHierarchyChangeListenerC1426g.setDecelerationRate(f);
    }

    @InterfaceC1294a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        C0107v.m504a(viewGroupOnHierarchyChangeListenerC1426g, z);
    }

    @InterfaceC1294a(name = "overScrollMode")
    public void setOverScrollMode(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, String str) {
        viewGroupOnHierarchyChangeListenerC1426g.setOverScrollMode(C1428i.m6094a(str));
    }

    @InterfaceC1294a(name = "overflow")
    public void setOverflow(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, String str) {
        viewGroupOnHierarchyChangeListenerC1426g.setOverflow(str);
    }

    @InterfaceC1294a(name = "pagingEnabled")
    public void setPagingEnabled(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setPagingEnabled(z);
    }

    @InterfaceC1294a(name = "persistentScrollbar")
    public void setPersistentScrollbar(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setScrollbarFadingEnabled(!z);
    }

    @InterfaceC1294a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setRemoveClippedSubviews(z);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setScrollEnabled(z);
    }

    @InterfaceC1294a(name = "scrollPerfTag")
    public void setScrollPerfTag(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, String str) {
        viewGroupOnHierarchyChangeListenerC1426g.setScrollPerfTag(str);
    }

    @InterfaceC1294a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setSendMomentumEvents(z);
    }

    @InterfaceC1294a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setVerticalScrollBarEnabled(z);
    }

    @InterfaceC1294a(name = "snapToEnd")
    public void setSnapToEnd(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setSnapToEnd(z);
    }

    @InterfaceC1294a(name = "snapToInterval")
    public void setSnapToInterval(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, float f) {
        viewGroupOnHierarchyChangeListenerC1426g.setSnapInterval((int) (f * C1347h.m5778a().density));
    }

    @InterfaceC1294a(name = "snapToOffsets")
    public void setSnapToOffsets(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, ReadableArray readableArray) {
        DisplayMetrics m5778a = C1347h.m5778a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d2 = readableArray.getDouble(i);
            double d3 = m5778a.density;
            Double.isNaN(d3);
            arrayList.add(Integer.valueOf((int) (d2 * d3)));
        }
        viewGroupOnHierarchyChangeListenerC1426g.setSnapOffsets(arrayList);
    }

    @InterfaceC1294a(name = "snapToStart")
    public void setSnapToStart(ViewGroupOnHierarchyChangeListenerC1426g viewGroupOnHierarchyChangeListenerC1426g, boolean z) {
        viewGroupOnHierarchyChangeListenerC1426g.setSnapToStart(z);
    }
}
