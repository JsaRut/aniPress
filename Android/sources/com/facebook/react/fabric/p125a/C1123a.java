package com.facebook.react.fabric.p125a;

import android.view.View;
import com.facebook.react.uimanager.C1374w;
import com.facebook.yoga.YogaMeasureMode;

/* renamed from: com.facebook.react.fabric.a.a */
/* loaded from: classes.dex */
public class C1123a {
    /* renamed from: a */
    public static float m5217a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return -2.1474836E9f;
        }
        return size;
    }

    /* renamed from: a */
    public static YogaMeasureMode m5218a(float f, float f2) {
        return f == f2 ? YogaMeasureMode.EXACTLY : f2 == -2.1474836E9f ? YogaMeasureMode.UNDEFINED : YogaMeasureMode.AT_MOST;
    }

    /* renamed from: b */
    public static float m5219b(float f, float f2) {
        if (f != f2 && f2 == -2.1474836E9f) {
            return 0.0f;
        }
        return C1374w.m5959b(f2);
    }

    /* renamed from: b */
    public static float m5220b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }
}
