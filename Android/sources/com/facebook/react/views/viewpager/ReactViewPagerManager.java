package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import java.util.Map;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactViewPagerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewPagerManager extends ViewGroupManager<C1521e> {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    public static final String REACT_CLASS = "AndroidViewPager";

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C1521e c1521e, View view, int i) {
        c1521e.m6359a(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1521e createViewInstance(C1278N c1278n) {
        return new C1521e(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C1521e c1521e, int i) {
        return c1521e.m6361d(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C1521e c1521e) {
        return c1521e.getViewCountInAdapter();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1104f.m5177a("setPage", 1, "setPageWithoutAnimation", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C1104f.m5178a("topPageScroll", C1104f.m5176a("registrationName", "onPageScroll"), "topPageScrollStateChanged", C1104f.m5176a("registrationName", "onPageScrollStateChanged"), "topPageSelected", C1104f.m5176a("registrationName", "onPageSelected"));
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
    public void receiveCommand(C1521e c1521e, int i, ReadableArray readableArray) {
        C2038a.m8318a(c1521e);
        C2038a.m8318a(readableArray);
        if (i == 1) {
            c1521e.m6360b(readableArray.getInt(0), true);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), ReactViewPagerManager.class.getSimpleName()));
            }
            c1521e.m6360b(readableArray.getInt(0), false);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C1521e c1521e, int i) {
        c1521e.m6362e(i);
    }

    @InterfaceC1294a(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(C1521e c1521e, float f) {
        c1521e.setPageMargin((int) C1374w.m5959b(f));
    }

    @InterfaceC1294a(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(C1521e c1521e, boolean z) {
        c1521e.setClipToPadding(!z);
    }

    @InterfaceC1294a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C1521e c1521e, boolean z) {
        c1521e.setScrollEnabled(z);
    }
}
