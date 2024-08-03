package p031c.p032a.p060d;

import android.util.Log;
import p031c.p032a.p057a.C0583a;

/* renamed from: c.a.d.a */
/* loaded from: classes.dex */
public final class C0598a {
    /* renamed from: a */
    public static void m3064a(String str, String str2, boolean z, int i, String str3) {
        String str4;
        if (C0583a.f2796c || i >= 5) {
            if (!z || i >= 6) {
                if (i >= 2) {
                    if (i == 2) {
                        Log.v("JIGUANG-" + str, "[" + str2 + "] " + str3);
                        str4 = "TRACE";
                    } else if (i == 3) {
                        Log.d("JIGUANG-" + str, "[" + str2 + "] " + str3);
                        str4 = "DEBUG";
                    } else if (i == 4) {
                        Log.i("JIGUANG-" + str, "[" + str2 + "] " + str3);
                        str4 = "INFO";
                    } else {
                        if (i != 5) {
                            if (i != 6) {
                                return;
                            }
                            Log.e("JIGUANG-" + str, "[" + str2 + "] " + str3);
                            C0599b.m3066a("ERROR", str2, str3, null);
                            return;
                        }
                        Log.w("JIGUANG-" + str, "[" + str2 + "] " + str3);
                        str4 = "WARN";
                    }
                    C0599b.m3066a(str4, str2, str3, null);
                }
            }
        }
    }
}
