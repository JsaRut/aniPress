package cn.jiguang.plugins.push.p119a;

import android.util.Log;

/* renamed from: cn.jiguang.plugins.push.a.a */
/* loaded from: classes.dex */
public class C0951a {

    /* renamed from: a */
    private static boolean f3993a = false;

    /* renamed from: a */
    public static void m4763a(String str) {
        if (f3993a) {
            Log.d("react-native-JPush", str);
        }
    }

    /* renamed from: a */
    public static void m4764a(boolean z) {
        Log.d("react-native-JPush", "setLoggerEnable:" + z);
        f3993a = z;
    }

    /* renamed from: b */
    public static void m4765b(String str) {
        if (f3993a) {
            Log.e("react-native-JPush", str);
        }
    }

    /* renamed from: c */
    public static void m4766c(String str) {
        if (f3993a) {
            Log.w("react-native-JPush", str);
        }
    }
}
