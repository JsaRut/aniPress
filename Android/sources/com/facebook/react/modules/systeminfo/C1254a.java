package com.facebook.react.modules.systeminfo;

import android.os.Build;

/* renamed from: com.facebook.react.modules.systeminfo.a */
/* loaded from: classes.dex */
public class C1254a {
    /* renamed from: a */
    public static String m5467a() {
        if (m5468b()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    private static boolean m5468b() {
        return Build.FINGERPRINT.contains("vbox");
    }
}
