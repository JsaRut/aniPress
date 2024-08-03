package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.uimanager.h */
/* loaded from: classes.dex */
public class C1347h {

    /* renamed from: a */
    private static DisplayMetrics f4919a;

    /* renamed from: b */
    private static DisplayMetrics f4920b;

    /* renamed from: a */
    public static DisplayMetrics m5778a() {
        return f4920b;
    }

    /* renamed from: a */
    public static Map<String, Map<String, Object>> m5779a(double d2) {
        C2038a.m8319a(Boolean.valueOf((f4919a == null && f4920b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        HashMap hashMap = new HashMap();
        hashMap.put("windowPhysicalPixels", m5780a(f4919a, d2));
        hashMap.put("screenPhysicalPixels", m5780a(f4920b, d2));
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, Object> m5780a(DisplayMetrics displayMetrics, double d2) {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
        hashMap.put("scale", Float.valueOf(displayMetrics.density));
        hashMap.put("fontScale", Double.valueOf(d2));
        hashMap.put("densityDpi", Integer.valueOf(displayMetrics.densityDpi));
        return hashMap;
    }

    /* renamed from: a */
    public static void m5781a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m5787b(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C2038a.m8319a(windowManager, "WindowManager is null!");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                displayMetrics2.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e2);
            }
        }
        m5782a(displayMetrics2);
    }

    /* renamed from: a */
    public static void m5782a(DisplayMetrics displayMetrics) {
        f4920b = displayMetrics;
    }

    @Deprecated
    /* renamed from: b */
    public static DisplayMetrics m5783b() {
        return f4919a;
    }

    /* renamed from: b */
    public static WritableNativeMap m5784b(double d2) {
        C2038a.m8319a(Boolean.valueOf((f4919a == null && f4920b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", m5785b(f4919a, d2));
        writableNativeMap.putMap("screenPhysicalPixels", m5785b(f4920b, d2));
        return writableNativeMap;
    }

    /* renamed from: b */
    private static WritableNativeMap m5785b(DisplayMetrics displayMetrics, double d2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d2);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    /* renamed from: b */
    public static void m5786b(Context context) {
        if (m5778a() != null) {
            return;
        }
        m5781a(context);
    }

    /* renamed from: b */
    public static void m5787b(DisplayMetrics displayMetrics) {
        f4919a = displayMetrics;
    }
}
