package com.facebook.react.uimanager;

import android.view.View;

/* renamed from: com.facebook.react.uimanager.g */
/* loaded from: classes.dex */
class C1345g {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f4915a = new C1323d();

    /* renamed from: b */
    private static final View.AccessibilityDelegate f4916b = new C1326e();

    /* renamed from: c */
    private static final View.AccessibilityDelegate f4917c = new C1343f();

    /* renamed from: a */
    public static void m5776a(View view, int i) {
        view.sendAccessibilityEvent(i);
    }

    /* renamed from: a */
    public static void m5777a(View view, String str) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (str == null) {
            view.setAccessibilityDelegate(null);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != -1320494052) {
                if (hashCode == -714126251 && str.equals("radiobutton_checked")) {
                    c2 = 1;
                }
            } else if (str.equals("radiobutton_unchecked")) {
                c2 = 2;
            }
        } else if (str.equals("button")) {
            c2 = 0;
        }
        if (c2 == 0) {
            accessibilityDelegate = f4915a;
        } else if (c2 == 1) {
            accessibilityDelegate = f4916b;
        } else {
            if (c2 != 2) {
                view.setAccessibilityDelegate(null);
                return;
            }
            accessibilityDelegate = f4917c;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }
}
