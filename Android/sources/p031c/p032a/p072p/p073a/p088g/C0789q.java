package p031c.p032a.p072p.p073a.p088g;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p075b.C0717i;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p085e.C0753a;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;
import p031c.p032a.p072p.p073a.p089h.C0804o;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.g.q */
/* loaded from: classes.dex */
public final class C0789q {

    /* renamed from: a */
    private static boolean f3459a = false;

    /* renamed from: b */
    private static String f3460b = "SDK is uninitialized";

    /* renamed from: c */
    private static String f3461c;

    /* renamed from: a */
    public static String m3895a() {
        return f3461c;
    }

    /* renamed from: a */
    public static void m3896a(Context context, Uri uri) {
        String str;
        C0717i.m3644a(context);
        if (!C0707b.m3615a()) {
            str = "SDK init failed，please check integration guide";
        } else if (!f3459a) {
            str = f3460b;
        } else if (Build.VERSION.SDK_INT < 17) {
            str = "to open circle, Android API should be above 17";
        } else {
            String queryParameter = uri.getQueryParameter("token");
            if (TextUtils.isEmpty(queryParameter)) {
                str = "token is invalid，please try again";
            } else {
                f3461c = queryParameter;
                String queryParameter2 = uri.getQueryParameter("signature");
                if (TextUtils.isEmpty(queryParameter2)) {
                    str = "illegal argument signature";
                } else {
                    String m3816b = C0766h.m3816b("timestamp=" + uri.getQueryParameter("timestamp") + "&appKey=" + C0830f.m4048a() + "&jiguang");
                    StringBuilder sb = new StringBuilder("signature=");
                    sb.append(queryParameter2);
                    sb.append(" md5=");
                    sb.append(m3816b);
                    C0732b.m3718b("VisualTrackInterface_xxx", sb.toString());
                    if (queryParameter2.equalsIgnoreCase(m3816b)) {
                        C0804o.m3914a(context);
                        return;
                    }
                    str = "illegal request";
                }
            }
        }
        m3897a(context, str);
    }

    /* renamed from: a */
    private static void m3897a(Context context, String str) {
        Toast.makeText(context, str, (str == null || str.length() <= 40) ? 0 : 1).show();
        C0732b.m3723f("VisualTrackInterface_xxx", str);
    }

    /* renamed from: b */
    public static boolean m3898b() {
        return f3459a;
    }

    /* renamed from: c */
    public static void m3899c() {
        Object obj;
        Object obj2 = null;
        try {
            obj = C0753a.m3776a(C0717i.class, "PLUGIN_VER");
        } catch (Throwable unused) {
            C0732b.m3723f("VisualTrackInterface_xxx", "get Field PLUGIN_VER failed");
            obj = null;
        }
        try {
            obj2 = C0753a.m3776a(C0717i.class, "AOP_BIND_VER");
        } catch (Throwable unused2) {
            C0732b.m3723f("VisualTrackInterface_xxx", "get Field AOP_BIND_VER failed");
        }
        if (obj2 == null) {
            f3459a = false;
            f3460b = "janalytics-gradle-plugin does NOT work, please check integration guide";
            C0732b.m3723f("VisualTrackInterface_xxx", f3460b);
            return;
        }
        if (obj2.equals(1)) {
            f3459a = true;
            C0732b.m3720c("VisualTrackInterface_xxx", "VisualTrack init done... plugin ver" + obj + ", bind ver" + obj2);
            return;
        }
        f3459a = false;
        f3460b = "janalytics-gradle-plugin(" + obj + "-" + obj2 + ") does NOT support this janalytics-SDK(1), please check janalytics-gradle-plugin version";
        C0732b.m3723f("VisualTrackInterface_xxx", f3460b);
    }
}
