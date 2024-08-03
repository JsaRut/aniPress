package p031c.p032a.p062f;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.f.a */
/* loaded from: classes.dex */
public final class C0616a {

    /* renamed from: a */
    private static final LinkedHashMap<String, Integer> f2891a;

    /* renamed from: b */
    private static final LinkedHashMap<String, Integer> f2892b;

    /* renamed from: c */
    private static final LinkedHashMap<String, Integer> f2893c;

    /* renamed from: d */
    private static final LinkedHashMap<String, Integer> f2894d;

    /* renamed from: e */
    private static String f2895e;

    /* renamed from: f */
    private static String f2896f;

    /* renamed from: g */
    private static String f2897g;

    /* renamed from: h */
    private static String f2898h;

    /* renamed from: i */
    public static String f2899i;

    /* renamed from: j */
    public static int f2900j;

    /* renamed from: k */
    public static String f2901k;

    /* renamed from: l */
    public static int f2902l;

    static {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        f2891a = linkedHashMap;
        linkedHashMap.put("s.jpush.cn", 19000);
        f2891a.put("sis.jpush.io", 19000);
        f2891a.put("easytomessage.com", 19000);
        LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap<>();
        f2892b = linkedHashMap2;
        linkedHashMap2.put("123.196.118.23", 19000);
        f2892b.put("103.229.215.60", 19000);
        f2892b.put("117.121.49.100", 19000);
        f2893c = new LinkedHashMap<>();
        f2894d = new LinkedHashMap<>();
        f2895e = "";
        f2896f = "";
        f2897g = "";
        f2898h = "";
    }

    /* renamed from: a */
    public static String m3146a(Context context) {
        if (C0831g.m4081c() && !TextUtils.isEmpty(f2895e)) {
            return f2895e;
        }
        String str = (String) C0618c.m3194b(context, C0617b.m3184v());
        return !TextUtils.isEmpty(str) ? str : "im64.jpush.cn";
    }

    /* renamed from: a */
    public static LinkedHashMap<String, Integer> m3147a() {
        return (!C0831g.m4081c() || f2893c.isEmpty()) ? f2891a : f2893c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence, T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.CharSequence, T, java.lang.String] */
    /* renamed from: a */
    public static void m3148a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C0675a.m3475g("HostConfig", "conn info was empty");
            return;
        }
        C0675a.m3469c("HostConfig", "get conn info=" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            ?? optString = jSONObject.optString("srv");
            C0675a.m3469c("HostConfig", "save srvHost:" + ((String) optString));
            if (!TextUtils.isEmpty(optString)) {
                C0617b<String> m3185w = C0617b.m3185w();
                m3185w.f2906d = optString;
                C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3185w});
            }
            ?? optString2 = jSONObject.optString("conn");
            C0675a.m3469c("HostConfig", "save connHost:" + ((String) optString2));
            if (TextUtils.isEmpty(optString2)) {
                return;
            }
            C0617b<String> m3184v = C0617b.m3184v();
            m3184v.f2906d = optString2;
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3184v});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static String m3149b(Context context) {
        if (C0831g.m4081c() && !TextUtils.isEmpty(f2896f)) {
            return f2896f;
        }
        String str = (String) C0618c.m3194b(context, C0617b.m3185w());
        return !TextUtils.isEmpty(str) ? str : "_im64._tcp.jpush.cn";
    }

    /* renamed from: b */
    public static LinkedHashMap<String, Integer> m3150b() {
        return (!C0831g.m4081c() || f2894d.isEmpty()) ? f2892b : f2894d;
    }

    /* renamed from: c */
    public static String m3151c() {
        return (!C0831g.m4081c() || TextUtils.isEmpty(f2897g)) ? "_psis._udp.jpush.cn" : f2897g;
    }

    /* renamed from: d */
    public static String m3152d() {
        return (!C0831g.m4081c() || TextUtils.isEmpty(f2898h)) ? "" : f2898h;
    }
}
