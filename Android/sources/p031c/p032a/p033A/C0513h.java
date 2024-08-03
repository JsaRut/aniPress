package p031c.p032a.p033A;

import android.content.Context;
import java.io.File;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p065i.C0659b;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p070n.RunnableC0686a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.A.h */
/* loaded from: classes.dex */
public final class C0513h {
    /* renamed from: a */
    public static File m2717a(Context context, String str) {
        File filesDir;
        if (context != null && (filesDir = context.getFilesDir()) != null) {
            return new File(filesDir, str);
        }
        C0675a.m3475g("FileUtils", "can't get file :" + str);
        return null;
    }

    /* renamed from: a */
    public static String m2718a(int i) {
        C0659b.m3371a();
        return C0659b.m3378b(i);
    }

    /* renamed from: a */
    public static JSONObject m2719a(Context context, JSONObject jSONObject, String str) {
        Object m4072a = C0831g.m4072a(context, "JCOMMON", 26, null, null, jSONObject, str);
        return m4072a instanceof JSONObject ? (JSONObject) m4072a : jSONObject;
    }

    /* renamed from: a */
    public static void m2720a(Context context, Object obj) {
        C0831g.m4072a(context, "JCOMMON", 39, null, null, obj);
    }

    /* renamed from: a */
    public static void m2721a(Context context, Object obj, Object obj2) {
        C0831g.m4072a(context, "JCOMMON", 15, null, null, obj, obj2);
    }

    /* renamed from: a */
    public static void m2722a(Context context, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            C0675a.m3469c("JCommonPresenter", "jsonContent:" + jSONObject2);
            int optInt = jSONObject2.optInt("state", -1);
            if (optInt == -1) {
                C0675a.m3475g("JCommonPresenter", "unknow state");
                return;
            }
            if (optInt == 0) {
                C0675a.m3469c("JCommonPresenter", "turn on share process");
                C0557c.m2889a(context, optInt);
            } else if (optInt != 1) {
                C0675a.m3475g("JCommonPresenter", "#exception - unsupport state:" + optInt);
            } else {
                C0675a.m3469c("JCommonPresenter", "turn off share process");
                C0557c.m2889a(context, optInt);
                RunnableC0686a.m3523a().m3538a(context, C0557c.m2911e(context));
                RunnableC0686a.m3527a(context, context.getPackageName());
            }
        } catch (Exception e2) {
            C0675a.m3475g("JCommonPresenter", "configReportRunningApp exception:" + e2.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m2723a(Context context) {
        if (!C0557c.m2903a(context, true, "canGetLbsInBackGround") || C0557c.f2707a || C0812a.m3939a(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return true;
        }
        C0675a.m3476h("JCommonPresenter", "app is not in foreground and no android.permission.ACCESS_BACKGROUND_LOCATION");
        return false;
    }
}
