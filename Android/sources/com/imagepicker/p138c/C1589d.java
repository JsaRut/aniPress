package com.imagepicker.p138c;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.imagepicker.c.d */
/* loaded from: classes.dex */
public class C1589d {
    /* renamed from: a */
    public static boolean m6686a(ReadableMap readableMap, String str) {
        return m6687a(String.class, readableMap, str);
    }

    /* renamed from: a */
    public static boolean m6687a(Class cls, ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return false;
        }
        if (String.class.equals(cls)) {
            return !TextUtils.isEmpty(readableMap.getString(str));
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m6688b(ReadableMap readableMap, String str) {
        return m6687a(ReadableMap.class, readableMap, str);
    }
}
