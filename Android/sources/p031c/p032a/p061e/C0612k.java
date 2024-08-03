package p031c.p032a.p061e;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0590a;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0598a;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0822k;
import p031c.p032a.p092s.C0831g;
import p031c.p032a.p092s.InterfaceC0836l;
import p031c.p032a.p095u.C0844a;
import p031c.p032a.p096v.C0849e;
import p031c.p032a.p096v.C0852h;
import p031c.p032a.p096v.C0853i;
import p031c.p032a.p096v.C0854j;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;
import p031c.p032a.p100z.C0868c;

/* renamed from: c.a.e.k */
/* loaded from: classes.dex */
public final class C0612k {

    /* renamed from: a */
    private static String f2879a = "/v3/report";

    /* renamed from: b */
    public static boolean f2880b = true;

    /* renamed from: c */
    private static String f2881c = "";

    /* renamed from: d */
    public static boolean f2882d = true;

    /* renamed from: a */
    public static int m3120a(Context context, Set<String> set, JSONObject jSONObject, File file, InterfaceC0836l interfaceC0836l) {
        try {
            if (jSONObject != null) {
                try {
                    if (jSONObject.length() != 0) {
                        if (!C0812a.m3947c(context)) {
                            C0601d.m3077f("ReportUtils", "no network, give up upload");
                            C0605d.m3100a(file);
                            if (interfaceC0836l != null) {
                                interfaceC0836l.mo2758a(-2);
                            }
                            return -2;
                        }
                        Pair<byte[], Integer> m3122a = m3122a(jSONObject.toString(), true, 2);
                        if (m3122a != null && m3122a.first != null && ((byte[]) m3122a.first).length != 0) {
                            byte[] bArr = (byte[]) m3122a.first;
                            int intValue = ((Integer) m3122a.second).intValue();
                            C0601d.m3072b("ReportUtils", "will upload length=" + bArr.length);
                            if (f2880b && bArr.length < 30680 && set != null && !set.contains("crash_log")) {
                                C0557c.m2896a(context, jSONObject, bArr, intValue, file, set, interfaceC0836l);
                                return 1;
                            }
                            int m3121a = m3121a(context, bArr, intValue, set);
                            if (m3121a == 0) {
                                C0601d.m3072b("ReportUtils", "http upload success json=" + C0852h.m4145a(jSONObject));
                                C0849e.m4135a(file);
                            }
                            if (m3121a != 1) {
                                C0605d.m3100a(file);
                                if (interfaceC0836l != null) {
                                    interfaceC0836l.mo2758a(m3121a);
                                }
                            }
                            return m3121a;
                        }
                        C0601d.m3077f("ReportUtils", "package body failed, give up upload");
                        C0605d.m3100a(file);
                        if (interfaceC0836l != null) {
                            interfaceC0836l.mo2758a(-1);
                        }
                        return -1;
                    }
                } catch (Throwable th) {
                    C0601d.m3077f("ReportUtils", "upload failed, error:" + th);
                    C0605d.m3100a(file);
                    if (interfaceC0836l != null) {
                        interfaceC0836l.mo2758a(-1);
                    }
                    return -1;
                }
            }
            C0601d.m3077f("ReportUtils", "upload content is empty, do nothing");
            C0605d.m3100a(file);
            if (interfaceC0836l != null) {
                interfaceC0836l.mo2758a(-1);
            }
            return -1;
        } catch (Throwable th2) {
            if (0 != 1) {
                C0605d.m3100a(file);
                if (interfaceC0836l != null) {
                    interfaceC0836l.mo2758a(0);
                }
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private static int m3121a(Context context, byte[] bArr, int i, Set<String> set) {
        String str;
        StringBuilder sb;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        C0602a m3081a = C0602a.m3081a();
        m3081a.m3087b(context);
        Set<String> m3088b = m3081a.m3088b(set);
        if (m3088b != null) {
            for (String str2 : m3088b) {
                if (!TextUtils.isEmpty(str2)) {
                    linkedHashSet.add(str2);
                }
            }
        }
        String str3 = (!C0831g.m4081c() || TextUtils.isEmpty(f2881c)) ? "stats.jpush.cn" : f2881c;
        if (!TextUtils.isEmpty(str3)) {
            linkedHashSet.add("https://" + str3);
        }
        String str4 = (String) C0867b.m4225a(context, C0866a.m4200a(true));
        if (!TextUtils.isEmpty(str4)) {
            for (String str5 : str4.split(",")) {
                if (!C0854j.m4165e(str5)) {
                    if (!C0854j.m4166f(str5)) {
                        sb = new StringBuilder();
                    } else if (!f2882d) {
                        sb = new StringBuilder();
                    }
                    sb.append("https://");
                    sb.append(str5);
                    linkedHashSet.add(sb.toString());
                } else if (f2882d) {
                    sb = new StringBuilder();
                    sb.append("https://");
                    sb.append(str5);
                    linkedHashSet.add(sb.toString());
                }
            }
        }
        C0601d.m3072b("ReportUtils", "types=" + set + " find urls=" + linkedHashSet);
        if (linkedHashSet.isEmpty()) {
            C0601d.m3077f("ReportUtils", "can't get url, give up upload");
            return -2;
        }
        String str6 = " type=" + set;
        for (String str7 : linkedHashSet) {
            if (TextUtils.isEmpty(str7)) {
                C0601d.m3077f("ReportUtils", "can't get url, give up upload");
            } else {
                if (!str7.endsWith(f2879a)) {
                    str7 = str7 + f2879a;
                }
                String str8 = str7;
                C0601d.m3072b("ReportUtils", "upload" + str6 + " to url:" + str8);
                C0615n m3089a = C0603b.m3089a(context, str8, bArr, i, 3, 1);
                int m3144a = m3089a.m3144a();
                if (m3144a == -3) {
                    C0605d.m3099a(context, C0595f.m3050b(context));
                    return -2;
                }
                if (m3144a == -1) {
                    str = "upload" + str6 + " error:" + m3089a.m3145b();
                } else {
                    if (m3144a == 0) {
                        return 0;
                    }
                    str = "upload" + str6 + " failed";
                }
                C0601d.m3072b("ReportUtils", str);
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static Pair<byte[], Integer> m3122a(String str, boolean z, int i) {
        try {
            byte[] m4016a = C0822k.m4016a(str.getBytes("UTF-8"));
            int m4149a = C0853i.m4149a();
            return new Pair<>(C0853i.m4154a(m4016a, C0853i.m4150a(m4149a), "iop203040506aPk!"), Integer.valueOf(m4149a));
        } catch (UnsupportedEncodingException | IOException | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m3123a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long longValue = ((Long) C0867b.m4225a(context, C0866a.m4202c())).longValue();
        if (longValue == 0) {
            C0601d.m3072b("ReportUtils", " miss uid,generate report token failed");
            return null;
        }
        String m4169i = C0854j.m4169i(longValue + C0854j.m4164d((String) C0867b.m4225a(context, C0866a.m4204e())) + str);
        if (C0854j.m4161a(m4169i)) {
            return null;
        }
        try {
            return Base64.encodeToString((longValue + ":" + m4169i + ":" + str2).getBytes(), 10);
        } catch (Exception unused) {
            C0601d.m3079h("getBasicAuthorization", "basic authorization encode failed");
            return null;
        }
    }

    /* renamed from: a */
    public static String m3124a(String str) {
        try {
            return C0853i.m4152a(str, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCi0v4VEUhOdfIEfFCrPC72pcDsQF/luTmr4q34NY0EZYGKzfQuTrUAm916P52HCgF+342gjZ/Nvijts5543qYNyoLvgtu4NRcHJmuGI/w7qifhfsivYeoEj9wYphXOyB9HUjzwn1BtAih+1RyUrcErCi249yabUOIKQygPZ9OXXQIDAQAB");
        } catch (Throwable unused) {
            C0601d.m3079h("getBasicAuthorization", "basic authorization encode failed");
            return null;
        }
    }

    /* renamed from: a */
    private static ArrayList<JSONArray> m3125a(JSONArray jSONArray, int i, int i2) {
        ArrayList<JSONArray> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() != 0) {
            if (jSONArray.length() == 1) {
                arrayList.add(jSONArray);
                return arrayList;
            }
            JSONArray jSONArray2 = new JSONArray();
            int i3 = 0;
            JSONArray jSONArray3 = jSONArray2;
            int i4 = 0;
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                JSONObject optJSONObject = jSONArray.optJSONObject(length);
                try {
                    int m4148b = C0852h.m4148b(optJSONObject);
                    if (m4148b != 0) {
                        int i5 = i3 + m4148b;
                        if (i5 > 204800) {
                            break;
                        }
                        int i6 = i4 + m4148b;
                        if (i6 > 40960) {
                            if (jSONArray3.length() > 0) {
                                arrayList.add(jSONArray3);
                            }
                            JSONArray jSONArray4 = new JSONArray();
                            try {
                                jSONArray4.put(optJSONObject);
                                jSONArray3 = jSONArray4;
                            } catch (Throwable th) {
                                th = th;
                                jSONArray3 = jSONArray4;
                                C0601d.m3077f("ReportUtils", "partition exception:" + th);
                            }
                        } else {
                            jSONArray3.put(optJSONObject);
                            m4148b = i6;
                        }
                        i4 = m4148b;
                        i3 = i5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (jSONArray3.length() > 0) {
                arrayList.add(jSONArray3);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Set<String> m3127a(JSONObject jSONObject) {
        return jSONObject == null ? new HashSet() : m3142c(jSONObject.optJSONArray("content"));
    }

    /* renamed from: a */
    public static JSONObject m3129a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", "a");
            long longValue = ((Long) C0867b.m4225a(context, C0866a.m4202c())).longValue();
            if (longValue == 0) {
                C0601d.m3077f("ReportUtils", "miss uid when wrap container info");
                return null;
            }
            jSONObject.put("uid", longValue);
            String m3050b = C0595f.m3050b(context);
            if (C0854j.m4161a(m3050b)) {
                C0601d.m3079h("ReportUtils", "miss app_key when wrap container info");
                return null;
            }
            jSONObject.put("app_key", m3050b);
            C0590a.m3014a();
            C0590a.m3017a(jSONObject);
            jSONObject.put("core_sdk_ver", "2.1.2");
            String m3051c = C0595f.m3051c(context);
            if (C0854j.m4161a(m3051c)) {
                C0601d.m3078g("ReportUtils", "miss channel when wrap container info,but continue report...");
            } else {
                jSONObject.put("channel", m3051c);
            }
            Pair<String, Integer> m3053e = C0595f.m3053e(context);
            if (m3053e == null || C0854j.m4161a((String) m3053e.first)) {
                C0601d.m3078g("ReportUtils", "miss app version when wrap container info,but continue report...");
            } else {
                jSONObject.put("app_version", m3053e.first);
            }
            return jSONObject;
        } catch (Throwable th) {
            C0601d.m3077f("ReportUtils", "wrapContainerInfo exception:" + th);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m3130a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C0601d.m3072b("ReportUtils", "file_name is null , give up read ");
                return null;
            }
            String m4140b = C0849e.m4140b(C0849e.m4133a(context, str));
            if (!C0854j.m4161a(m4140b)) {
                return new JSONObject(m4140b.trim());
            }
            C0601d.m3072b("ReportUtils", "read String is empty");
            return null;
        } catch (Throwable th) {
            C0601d.m3072b("ReportUtils", "can't build " + str + " into JsonObject, give up read :" + th);
            return null;
        }
    }

    /* renamed from: a */
    public static JSONObject m3131a(Context context, JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("itime", C0868c.m4234b(context));
            jSONObject.put("type", str);
            jSONObject.put("account_id", C0867b.m4225a(context, C0866a.m4212m()));
        } catch (JSONException e2) {
            C0601d.m3077f("ReportUtils", "fillBase exception:" + e2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m3132a(JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("content", jSONArray);
        } catch (JSONException unused) {
        }
        C0852h.m4147a(jSONObject2, jSONObject);
        return jSONObject2;
    }

    /* renamed from: a */
    public static void m3133a(Context context, int i, byte[] bArr, int i2, File file, Set<String> set, InterfaceC0836l interfaceC0836l) {
        try {
            C0601d.m3072b("ReportUtils", "onTcpReportResult, types=" + set + " code=" + i);
            if (i != -3) {
                if (i != 0) {
                    i = m3121a(context, bArr, i2, set);
                    if (i == 0) {
                        boolean z = C0583a.f2796c;
                    }
                } else {
                    boolean z2 = C0583a.f2796c;
                }
                C0849e.m4135a(file);
            } else {
                C0605d.m3099a(context, C0595f.m3050b(context));
            }
            if (interfaceC0836l != null) {
                interfaceC0836l.mo2758a(i);
            }
        } catch (Throwable unused) {
        } finally {
            C0605d.m3100a(file);
        }
    }

    /* renamed from: a */
    public static void m3134a(Context context, Object obj) {
        try {
            if (m3141b(obj)) {
                C0844a.m4116a("BUILD_REPORT", new RunnableC0613l(obj, context));
            } else {
                C0601d.m3072b("ReportUtils", "data is invalid or empty");
            }
            C0605d.m3102b(context);
        } catch (Throwable th) {
            C0601d.m3077f("ReportUtils", "report e:" + th);
        }
    }

    /* renamed from: a */
    public static void m3135a(Context context, String str, Object obj) {
        try {
            C0601d.m3072b("ReportUtils", "going to report data at push service");
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("sdk_type", str);
            }
            if (m3141b(obj)) {
                bundle.putString("report_data", obj.toString());
            }
            C0583a.m2979a(context, "a1", bundle);
        } catch (Throwable th) {
            try {
                C0601d.m3071a("ReportUtils", "reportAtPushService", th);
            } catch (Throwable th2) {
                C0601d.m3071a("ReportUtils", "reportAtPushService", th2);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m3136a(Context context, JSONArray jSONArray, Set set) {
        try {
            C0602a m3081a = C0602a.m3081a();
            m3081a.m3084a(context);
            String m3085a = m3081a.m3085a((Set<String>) set);
            JSONObject m3129a = m3129a(context);
            boolean z = m3129a != null;
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append(m3085a);
            sb.append(File.separator);
            sb.append(z ? "tmp" : "nowrap");
            String sb2 = sb.toString();
            Iterator<JSONArray> it = m3125a(jSONArray, 40960, 204800).iterator();
            while (it.hasNext()) {
                try {
                    JSONObject m3132a = m3132a(it.next(), m3129a);
                    File m3095a = C0605d.m3095a(context, sb2, m3132a, z);
                    C0601d.m3072b("ReportUtils", "save report types=" + set + " at " + sb2 + File.separator + m3095a.getName());
                    if (z) {
                        C0844a.m4116a("UPLOAD_REPORT", new RunnableC0614m(context, set, m3132a, m3095a));
                    }
                } catch (Throwable unused) {
                    C0598a.m3064a("JCore", "ReportUtils", false, 5, "buildReport [for item]");
                }
            }
        } catch (Throwable th) {
            C0601d.m3079h("ReportUtils", "report exception:" + th);
        }
    }

    /* renamed from: a */
    public static void m3137a(Context context, JSONObject jSONObject, InterfaceC0836l interfaceC0836l) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() > 0) {
                    JSONObject m3129a = m3129a(context);
                    if (m3129a == null) {
                        C0601d.m3079h("ReportUtils", "wrap data failed");
                        if (interfaceC0836l != null) {
                            interfaceC0836l.mo2758a(-1);
                        }
                    } else {
                        String m3139b = m3139b(jSONObject);
                        JSONObject m3132a = m3132a(new JSONArray().put(jSONObject), m3129a);
                        HashSet hashSet = new HashSet();
                        hashSet.add(m3139b);
                        C0601d.m3072b("ReportUtils", "reportWithoutStore type=" + m3139b);
                        m3120a(context, hashSet, m3132a, null, interfaceC0836l);
                    }
                }
            } catch (Throwable th) {
                C0601d.m3079h("ReportUtils", "reportWithoutStore exception:" + th);
            }
        }
        C0605d.m3102b(context);
    }

    /* renamed from: a */
    public static boolean m3138a(Context context, String str, JSONObject jSONObject) {
        try {
            if (C0854j.m4161a(str)) {
                C0601d.m3072b("ReportUtils", "file_name is null , give up save ");
                return false;
            }
            if (context != null) {
                return C0849e.m4136a(C0849e.m4133a(context, str), jSONObject != null ? jSONObject.toString() : "");
            }
            C0601d.m3072b("ReportUtils", "context is null , give up save " + str);
            return false;
        } catch (Throwable th) {
            C0601d.m3072b("ReportUtils", "writeLogFile e:" + th);
            return false;
        }
    }

    /* renamed from: b */
    private static String m3139b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optString("type");
        }
        return null;
    }

    /* renamed from: b */
    private static JSONArray m3140b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.length() > 0) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* renamed from: b */
    private static boolean m3141b(Object obj) {
        return obj instanceof String ? ((String) obj).length() > 2 : obj instanceof JSONObject ? ((JSONObject) obj).length() > 0 : (obj instanceof JSONArray) && m3140b((JSONArray) obj).length() > 0;
    }

    /* renamed from: c */
    public static Set<String> m3142c(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String m3139b = m3139b(jSONArray.optJSONObject(i));
                if (m3139b == null) {
                    m3139b = "";
                }
                hashSet.add(m3139b);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: Throwable -> 0x0043, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0043, blocks: (B:3:0x0001, B:8:0x0036, B:10:0x003c, B:5:0x0020, B:7:0x0024, B:16:0x002e, B:18:0x0032), top: B:2:0x0001 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONArray m3143c(java.lang.Object r3) {
        /*
            r0 = 0
            boolean r1 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L20
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lf
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            r3 = r1
            goto L36
        Lf:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L35
            r1.<init>()     // Catch: java.lang.Throwable -> L35
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            org.json.JSONArray r3 = r1.put(r2)     // Catch: java.lang.Throwable -> L35
            goto L36
        L20:
            boolean r1 = r3 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L2e
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L43
            org.json.JSONArray r3 = r1.put(r3)     // Catch: java.lang.Throwable -> L43
            goto L36
        L2e:
            boolean r1 = r3 instanceof org.json.JSONArray     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L35
            org.json.JSONArray r3 = (org.json.JSONArray) r3     // Catch: java.lang.Throwable -> L43
            goto L36
        L35:
            r3 = r0
        L36:
            org.json.JSONArray r3 = m3140b(r3)     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L57
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L43
            if (r1 <= 0) goto L57
            return r3
        L43:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "adapt JSONArray e:"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ReportUtils"
            p031c.p032a.p060d.C0601d.m3077f(r1, r3)
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p061e.C0612k.m3143c(java.lang.Object):org.json.JSONArray");
    }
}
