package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* renamed from: com.facebook.react.views.text.d */
/* loaded from: classes.dex */
public final class C1451d {
    /* renamed from: a */
    public static ColorStateList m6139a(Context context) {
        return m6140a(context, R.attr.textColor);
    }

    /* renamed from: a */
    private static ColorStateList m6140a(Context context, int i) {
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            return typedArray.getColorStateList(0);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    /* renamed from: b */
    public static int m6141b(Context context) {
        return m6140a(context, R.attr.textColorHighlight).getDefaultColor();
    }

    /* renamed from: c */
    public static ColorStateList m6142c(Context context) {
        return m6140a(context, R.attr.textColorHint);
    }
}
