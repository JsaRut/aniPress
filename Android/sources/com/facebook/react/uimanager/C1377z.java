package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.react.uimanager.z */
/* loaded from: classes.dex */
public class C1377z {

    /* renamed from: a */
    private static final Rect f5092a = new Rect();

    /* renamed from: a */
    public static void m5964a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof InterfaceC1376y) {
            InterfaceC1376y interfaceC1376y = (InterfaceC1376y) parent;
            if (interfaceC1376y.getRemoveClippedSubviews()) {
                interfaceC1376y.mo5963a(f5092a);
                if (!f5092a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.setEmpty();
                    return;
                }
                f5092a.offset(-view.getLeft(), -view.getTop());
                f5092a.offset(view.getScrollX(), view.getScrollY());
                rect.set(f5092a);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
