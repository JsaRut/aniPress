package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1347h;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import com.facebook.react.views.scroll.C1427h;
import com.facebook.yoga.C1553a;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<C1424e> implements C1427h.a<C1424e> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private InterfaceC1420a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    public ReactHorizontalScrollViewManager(InterfaceC1420a interfaceC1420a) {
        this.mFpsListener = null;
        this.mFpsListener = interfaceC1420a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1424e createViewInstance(C1278N c1278n) {
        return new C1424e(c1278n, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.C1427h.a
    public void flashScrollIndicators(C1424e c1424e) {
        c1424e.m6073b();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1424e c1424e, int i, ReadableArray readableArray) {
        C1427h.m6093a(this, c1424e, i, readableArray);
    }

    @Override // com.facebook.react.views.scroll.C1427h.a
    public void scrollTo(C1424e c1424e, C1427h.b bVar) {
        if (bVar.f5273c) {
            c1424e.smoothScrollTo(bVar.f5271a, bVar.f5272b);
        } else {
            c1424e.scrollTo(bVar.f5271a, bVar.f5272b);
        }
    }

    @Override // com.facebook.react.views.scroll.C1427h.a
    public void scrollToEnd(C1424e c1424e, C1427h.c cVar) {
        int width = c1424e.getChildAt(0).getWidth() + c1424e.getPaddingRight();
        if (cVar.f5274a) {
            c1424e.smoothScrollTo(width, c1424e.getScrollY());
        } else {
            c1424e.scrollTo(width, c1424e.getScrollY());
        }
    }

    @InterfaceC1295b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1424e c1424e, int i, Integer num) {
        c1424e.m6072a(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1424e c1424e, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        if (i == 0) {
            c1424e.setBorderRadius(f);
        } else {
            c1424e.m6070a(f, i - 1);
        }
    }

    @InterfaceC1294a(name = "borderStyle")
    public void setBorderStyle(C1424e c1424e, String str) {
        c1424e.setBorderStyle(str);
    }

    @InterfaceC1295b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1424e c1424e, int i, float f) {
        if (!C1553a.m6544a(f)) {
            f = C1374w.m5959b(f);
        }
        c1424e.m6071a(SPACING_TYPES[i], f);
    }

    @InterfaceC1294a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(C1424e c1424e, int i) {
        c1424e.setEndFillColor(i);
    }

    @InterfaceC1294a(name = "decelerationRate")
    public void setDecelerationRate(C1424e c1424e, float f) {
        c1424e.setDecelerationRate(f);
    }

    @InterfaceC1294a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C1424e c1424e, boolean z) {
        C0107v.m504a(c1424e, z);
    }

    @InterfaceC1294a(name = "overScrollMode")
    public void setOverScrollMode(C1424e c1424e, String str) {
        c1424e.setOverScrollMode(C1428i.m6094a(str));
    }

    @InterfaceC1294a(name = "overflow")
    public void setOverflow(C1424e c1424e, String str) {
        c1424e.setOverflow(str);
    }

    @InterfaceC1294a(name = "pagingEnabled")
    public void setPagingEnabled(C1424e c1424e, boolean z) {
        c1424e.setPagingEnabled(z);
    }

    @InterfaceC1294a(name = "persistentScrollbar")
    public void setPersistentScrollbar(C1424e c1424e, boolean z) {
        c1424e.setScrollbarFadingEnabled(!z);
    }

    @InterfaceC1294a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C1424e c1424e, boolean z) {
        c1424e.setRemoveClippedSubviews(z);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C1424e c1424e, boolean z) {
        c1424e.setScrollEnabled(z);
    }

    @InterfaceC1294a(name = "scrollPerfTag")
    public void setScrollPerfTag(C1424e c1424e, String str) {
        c1424e.setScrollPerfTag(str);
    }

    @InterfaceC1294a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(C1424e c1424e, boolean z) {
        c1424e.setSendMomentumEvents(z);
    }

    @InterfaceC1294a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C1424e c1424e, boolean z) {
        c1424e.setHorizontalScrollBarEnabled(z);
    }

    @InterfaceC1294a(name = "snapToEnd")
    public void setSnapToEnd(C1424e c1424e, boolean z) {
        c1424e.setSnapToEnd(z);
    }

    @InterfaceC1294a(name = "snapToInterval")
    public void setSnapToInterval(C1424e c1424e, float f) {
        c1424e.setSnapInterval((int) (f * C1347h.m5778a().density));
    }

    @InterfaceC1294a(name = "snapToOffsets")
    public void setSnapToOffsets(C1424e c1424e, ReadableArray readableArray) {
        DisplayMetrics m5778a = C1347h.m5778a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d2 = readableArray.getDouble(i);
            double d3 = m5778a.density;
            Double.isNaN(d3);
            arrayList.add(Integer.valueOf((int) (d2 * d3)));
        }
        c1424e.setSnapOffsets(arrayList);
    }

    @InterfaceC1294a(name = "snapToStart")
    public void setSnapToStart(C1424e c1424e, boolean z) {
        c1424e.setSnapToStart(z);
    }
}
