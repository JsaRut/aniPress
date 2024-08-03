package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;

/* renamed from: com.facebook.react.views.view.b */
/* loaded from: classes.dex */
public class C1510b {
    /* renamed from: a */
    public static int m6296a(float f, YogaMeasureMode yogaMeasureMode) {
        return yogaMeasureMode == YogaMeasureMode.EXACTLY ? View.MeasureSpec.makeMeasureSpec((int) f, 1073741824) : yogaMeasureMode == YogaMeasureMode.AT_MOST ? View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
