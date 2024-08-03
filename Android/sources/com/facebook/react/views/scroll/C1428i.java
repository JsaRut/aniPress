package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.facebook.react.views.scroll.i */
/* loaded from: classes.dex */
public class C1428i {
    /* renamed from: a */
    public static int m6094a(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }

    /* renamed from: a */
    public static void m6095a(ViewGroup viewGroup) {
        m6098a(viewGroup, EnumC1431l.BEGIN_DRAG);
    }

    /* renamed from: a */
    public static void m6096a(ViewGroup viewGroup, float f, float f2) {
        m6099a(viewGroup, EnumC1431l.END_DRAG, f, f2);
    }

    /* renamed from: a */
    public static void m6097a(ViewGroup viewGroup, int i, int i2) {
        m6099a(viewGroup, EnumC1431l.MOMENTUM_BEGIN, i, i2);
    }

    /* renamed from: a */
    private static void m6098a(ViewGroup viewGroup, EnumC1431l enumC1431l) {
        m6099a(viewGroup, enumC1431l, 0.0f, 0.0f);
    }

    /* renamed from: a */
    private static void m6099a(ViewGroup viewGroup, EnumC1431l enumC1431l, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ((UIManagerModule) ((ReactContext) viewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(C1429j.m6102a(viewGroup.getId(), enumC1431l, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
    }

    /* renamed from: b */
    public static void m6100b(ViewGroup viewGroup) {
        m6098a(viewGroup, EnumC1431l.MOMENTUM_END);
    }

    /* renamed from: b */
    public static void m6101b(ViewGroup viewGroup, float f, float f2) {
        m6099a(viewGroup, EnumC1431l.SCROLL, f, f2);
    }
}
