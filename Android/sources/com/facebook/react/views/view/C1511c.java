package com.facebook.react.views.view;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;

/* renamed from: com.facebook.react.views.view.c */
/* loaded from: classes.dex */
public class C1511c {

    /* renamed from: a */
    private static final TypedValue f5563a = new TypedValue();

    @TargetApi(21)
    /* renamed from: a */
    public static Drawable m6297a(Context context, ReadableMap readableMap) {
        int color;
        String string = readableMap.getString("type");
        if (!"ThemeAttrAndroid".equals(string)) {
            if (!"RippleAndroid".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
            }
            if (Build.VERSION.SDK_INT < 21) {
                throw new JSApplicationIllegalArgumentException("Ripple drawable is not available on android API <21");
            }
            if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                color = readableMap.getInt("color");
            } else {
                if (!context.getTheme().resolveAttribute(R.attr.colorControlHighlight, f5563a, true)) {
                    throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
                }
                color = context.getResources().getColor(f5563a.resourceId);
            }
            return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) ? null : new ColorDrawable(-1));
        }
        String string2 = readableMap.getString("attribute");
        SoftAssertions.assertNotNull(string2);
        int identifier = context.getResources().getIdentifier(string2, "attr", "android");
        if (identifier == 0) {
            throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be found in the resource list");
        }
        if (context.getTheme().resolveAttribute(identifier, f5563a, true)) {
            return Build.VERSION.SDK_INT >= 21 ? context.getResources().getDrawable(f5563a.resourceId, context.getTheme()) : context.getResources().getDrawable(f5563a.resourceId);
        }
        throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " couldn't be resolved into a drawable");
    }
}
