package p031c.p032a.p046N;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p043K.C0539a;
import p031c.p032a.p043K.C0541c;
import p031c.p032a.p045M.C0543a;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p069m.C0684a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0815d;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.N.d */
/* loaded from: classes.dex */
public final class C0548d {

    /* renamed from: a */
    private static final Object f2689a = new Object();

    /* renamed from: b */
    private static CookieManager f2690b;

    /* renamed from: c */
    private String f2691c;

    /* renamed from: d */
    private String f2692d;

    /* renamed from: e */
    private String f2693e;

    /* renamed from: f */
    private Context f2694f;

    /* renamed from: g */
    private int f2695g = 0;

    /* renamed from: h */
    private String f2696h;

    public C0548d(Context context) {
        String m3943b = C0812a.m3943b(context, this.f2691c);
        String m2843b = C0547c.m2843b(context, this.f2692d);
        String m3946c = C0812a.m3946c(context, this.f2693e);
        CookieManager cookieManager = new CookieManager();
        f2690b = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(f2690b);
        this.f2694f = context;
        this.f2691c = m3943b;
        this.f2692d = m2843b;
        this.f2693e = m3946c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d9, code lost:            if (r17 == null) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:            r17.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01df, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e0, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01d8, code lost:            r11 = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02ae, code lost:            if (r16 != null) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0288, code lost:            r16.disconnect();     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02d3, code lost:            if (r16 != null) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0286, code lost:            if (r16 != null) goto L154;     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p031c.p032a.p045M.C0543a m2844a(android.content.Context r30, java.lang.String r31, int r32, long r33, boolean r35, java.io.File r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p046N.C0548d.m2844a(android.content.Context, java.lang.String, int, long, boolean, java.io.File, java.lang.String):c.a.M.a");
    }

    /* renamed from: a */
    private String m2845a(int i) {
        this.f2696h = C0541c.m2810a(this.f2694f, i);
        return this.f2696h;
    }

    /* renamed from: a */
    public static String m2846a(Context context) {
        if (context == null) {
            return "";
        }
        return C0819h.m3994d(C0812a.m3943b(context, "") + C0547c.m2843b(context, "") + C0812a.m3946c(context, ""));
    }

    /* renamed from: a */
    private String m2847a(String str) {
        String m2856e = m2856e(str);
        if (!TextUtils.isEmpty(m2856e) && Patterns.PHONE.matcher(m2856e).matches()) {
            return m2856e;
        }
        return null;
    }

    /* renamed from: a */
    private String m2848a(String str, C0543a c0543a) {
        if (m2851a(this.f2694f, c0543a)) {
            return m2854c(str);
        }
        return null;
    }

    /* renamed from: a */
    private String m2849a(TreeMap<String, String> treeMap) {
        if (treeMap.size() == 0) {
            return null;
        }
        Iterator<Map.Entry<String, String>> it = treeMap.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append((Object) it.next().getValue());
        }
        return C0819h.m3994d(sb.toString() + C0541c.m2816c(this.f2694f)).toUpperCase();
    }

    /* renamed from: a */
    private static void m2850a(Map<String, List<String>> map) {
        List<String> list = map.get("Set-Cookie");
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                f2690b.getCookieStore().add(null, HttpCookie.parse(it.next()).get(0));
            }
        }
    }

    /* renamed from: a */
    private static boolean m2851a(Context context, C0543a c0543a) {
        File m2717a;
        if (context == null || c0543a == null || (m2717a = C0513h.m2717a(context, "resp.raw")) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("");
        Map<String, List<String>> map = c0543a.f2682c;
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, List<String>> entry : c0543a.f2682c.entrySet()) {
                if (entry.getKey() != null) {
                    sb.append(entry.getKey());
                    sb.append(": ");
                }
                Iterator<String> it = entry.getValue().iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append(it.next());
                        if (it.hasNext()) {
                            sb.append(", ");
                        }
                    }
                }
                sb.append("\n");
            }
        }
        sb.append("\r\n\r\n");
        if (!TextUtils.isEmpty(c0543a.f2681b)) {
            sb.append(c0543a.f2681b);
        }
        if (!C0815d.m3966a(m2717a, sb.toString())) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m2717a);
        File m2717a2 = C0513h.m2717a(context, "resp.zip");
        if (m2717a2 == null) {
            return false;
        }
        if (m2717a2 != null) {
            try {
                if (m2717a2.exists()) {
                    m2717a2.delete();
                }
            } catch (Throwable th) {
                C0675a.m3475g("JCommonFileHelper", "delete throwable:" + th.getMessage());
            }
        }
        try {
            C0552b.m2877a(arrayList, m2717a2);
            return true;
        } catch (IOException e2) {
            C0675a.m3475g("JDevicePNWorker", "report phoneNumber exception:" + e2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private boolean m2852a(String str, String str2, String str3) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (!TextUtils.isEmpty(str)) {
            treeMap.put("imei", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            treeMap.put("iccid", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            treeMap.put("imsi", str3);
        }
        treeMap.put("version", C0541c.m2809a(this.f2694f));
        treeMap.put("app_id", C0541c.m2814b(this.f2694f));
        treeMap.put("req_time", C0539a.m2807a());
        treeMap.put("sign", m2849a(treeMap));
        String str4 = "";
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            try {
                str4 = str4 + "&" + ((Object) entry.getKey()) + "=" + URLEncoder.encode(entry.getValue(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        try {
            C0543a m2844a = m2844a(this.f2694f, this.f2696h + "statistic/query?" + str4, 10, 30000L, false, null, null);
            if (m2844a.f2680a != 200) {
                return false;
            }
            JSONObject m2853b = m2853b(m2844a.f2681b);
            String str5 = null;
            if (m2853b != null) {
                if (m2853b.optInt("code", -1) != 200) {
                    return false;
                }
                str5 = m2847a(m2853b.optString("num"));
            } else if (m2844a.f2682c != null || !TextUtils.isEmpty(m2844a.f2681b)) {
                synchronized (f2689a) {
                    this.f2695g = 0;
                    try {
                        str5 = m2848a(str4, m2844a);
                    } catch (Throwable unused2) {
                    }
                    this.f2694f.deleteFile("resp.raw");
                    this.f2694f.deleteFile("resp.zip");
                }
            }
            if (TextUtils.isEmpty(str5)) {
                return false;
            }
            m2855d(str5);
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* renamed from: b */
    private static JSONObject m2853b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new JSONObject(str);
        } catch (Exception e2) {
            C0675a.m3475g("JDevicePNWorker", "report phoneNumber exception:" + e2.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private String m2854c(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C0543a m2844a = m2844a(this.f2694f, this.f2696h + "statistic/query?" + str, 10, 30000L, false, C0513h.m2717a(this.f2694f, "resp.zip"), "resp_data");
            if (m2844a.f2680a != 200) {
                return null;
            }
            JSONObject m2853b = m2853b(m2844a.f2681b);
            if (m2853b != null) {
                if (m2853b.optInt("code", -1) != 200) {
                    return null;
                }
                return m2847a(m2853b.optString("num"));
            }
            if ((m2844a.f2682c == null && TextUtils.isEmpty(m2844a.f2681b)) || (i = this.f2695g) > 4) {
                return null;
            }
            this.f2695g = i + 1;
            try {
                return m2848a(str, m2844a);
            } catch (Throwable th) {
                C0675a.m3475g("JDevicePNWorker", "report phoneNumber throwable:" + th.getMessage());
                return null;
            }
        } catch (Throwable th2) {
            C0675a.m3475g("JDevicePNWorker", "report phoneNumber throwable:" + th2.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    private void m2855d(String str) {
        StringBuilder sb;
        String message;
        C0541c.m2811a(this.f2694f, str);
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("num", str);
                if (!TextUtils.isEmpty(this.f2691c)) {
                    jSONObject.put("imei", this.f2691c);
                }
                if (!TextUtils.isEmpty(this.f2693e)) {
                    jSONObject.put("imsi", this.f2693e);
                }
                if (!TextUtils.isEmpty(this.f2692d)) {
                    jSONObject.put("iccid", this.f2692d);
                }
                String jSONObject2 = jSONObject.toString();
                try {
                    jSONObject2 = C0684a.m3501a(jSONObject2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (TextUtils.isEmpty(jSONObject2)) {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                C0513h.m2719a(this.f2694f, jSONObject3, "nb");
                jSONObject3.put("content", jSONObject2);
                C0675a.m3469c("JDevicePNWorker", "collect success:" + jSONObject3);
                C0513h.m2720a(this.f2694f, (Object) jSONObject3);
                C0541c.m2813a(this.f2694f, false);
            } catch (JSONException e3) {
                sb = new StringBuilder("report phoneNumber exception:");
                message = e3.getMessage();
                sb.append(message);
                C0675a.m3475g("JDevicePNWorker", sb.toString());
            }
        } catch (Throwable th) {
            sb = new StringBuilder("report phoneNumber throwable:");
            message = th.getMessage();
            sb.append(message);
            C0675a.m3475g("JDevicePNWorker", sb.toString());
        }
    }

    /* renamed from: e */
    private String m2856e(String str) {
        try {
            return C0684a.m3502a(str, C0541c.m2816c(this.f2694f).substring(0, 16));
        } catch (Exception e2) {
            C0675a.m3475g("JDevicePNWorker", "report phoneNumber exception:" + e2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: Exception -> 0x00db, TryCatch #0 {Exception -> 0x00db, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0010, B:10:0x0019, B:12:0x0025, B:15:0x002e, B:17:0x0033, B:19:0x0042, B:21:0x004a, B:23:0x0052, B:25:0x005a, B:28:0x0063, B:30:0x006b, B:32:0x0073, B:35:0x007c, B:37:0x0084, B:39:0x008c, B:43:0x009d, B:45:0x00a8, B:51:0x00b7, B:54:0x00c4, B:57:0x00cc), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2857a() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p046N.C0548d.m2857a():void");
    }
}
