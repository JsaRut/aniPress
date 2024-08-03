package p031c.p032a.p061e;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p091r.C0820i;
import p031c.p032a.p095u.C0844a;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.e.i */
/* loaded from: classes.dex */
public final class C0610i {

    /* renamed from: a */
    private static RunnableC0611j f2873a;

    /* renamed from: b */
    private static volatile FutureTask<?> f2874b;

    /* renamed from: c */
    private static final Object f2875c = new Object();

    /* renamed from: d */
    private static final LinkedHashSet<String> f2876d;

    /* renamed from: e */
    private static final LinkedHashSet<String> f2877e;

    static {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        f2876d = linkedHashSet;
        linkedHashSet.add("https://tsis.jpush.cn");
        f2877e = new LinkedHashSet<>();
    }

    /* renamed from: a */
    public static LinkedHashSet<String> m3113a() {
        C0583a.m2981a();
        return f2876d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static void m3114a(Context context, boolean z) {
        StringBuilder sb;
        if (f2873a == null) {
            f2873a = new RunnableC0611j(context, (byte) 0);
        }
        if (f2874b == null || f2874b.isCancelled() || f2874b.isDone()) {
            synchronized (f2875c) {
                if (f2874b == null || f2874b.isCancelled() || f2874b.isDone()) {
                    try {
                        f2874b = new FutureTask<>(f2873a, null);
                        C0844a.m4116a("ASYNC", f2874b);
                    } catch (Throwable th) {
                        C0601d.m3077f("ReportSis", "new sis task e:" + th);
                    }
                }
            }
        }
        if (z) {
            try {
                f2874b.get(10L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                sb = new StringBuilder("sis task e:");
                sb.append(e);
                C0601d.m3077f("ReportSis", sb.toString());
            } catch (ExecutionException e3) {
                e = e3;
                sb = new StringBuilder("sis task e:");
                sb.append(e);
                C0601d.m3077f("ReportSis", sb.toString());
            } catch (TimeoutException e4) {
                e = e4;
                sb = new StringBuilder("sis task e:");
                sb.append(e);
                C0601d.m3077f("ReportSis", sb.toString());
            } catch (Throwable th2) {
                C0601d.m3077f("ReportSis", "sis task e:" + th2);
            }
        }
    }

    /* renamed from: b */
    public static boolean m3117b(Context context, String str, String str2) {
        C0615n m3090a = C0603b.m3090a(str, str2, context, true, 3, 2);
        C0601d.m3072b("ReportSis", "report sis code[" + m3090a.m3144a() + "] from url=" + str + "\n body=" + m3090a.m3145b());
        if (m3090a.m3144a() != 0) {
            return false;
        }
        String m3145b = m3090a.m3145b();
        if (TextUtils.isEmpty(m3145b)) {
            return false;
        }
        try {
            C0602a.m3081a().m3086a(context, new JSONObject(m3145b).getJSONObject("ret"));
            return true;
        } catch (Throwable th) {
            C0601d.m3077f("ReportSis", "getUrls e:" + th);
            return false;
        }
    }

    /* renamed from: c */
    public static String m3118c(Context context) {
        long j;
        Object m3386a;
        double d2;
        double d3;
        JSONObject jSONObject = new JSONObject();
        try {
            String m3050b = C0595f.m3050b(context);
            long longValue = ((Long) C0867b.m4225a(context, C0866a.m4202c())).longValue();
            int m4002a = C0820i.m4002a(context);
            String m4004b = C0820i.m4004b(context);
            jSONObject.put("type", m4002a);
            jSONObject.put("appkey", m3050b);
            jSONObject.put("sdkver", "2.1.2");
            jSONObject.put("platform", 0);
            j = 0;
            if (longValue != 0) {
                jSONObject.put("uid", longValue);
            }
            if (m4004b != null) {
                jSONObject.put("opera", m4004b);
            }
            m3386a = C0661d.m3386a(context, "get_loc_info", null);
            d2 = 200.0d;
        } catch (Throwable unused) {
        }
        if (m3386a instanceof Bundle) {
            try {
                Bundle bundle = (Bundle) m3386a;
                double d4 = bundle.getDouble("lat");
                try {
                    d2 = bundle.getDouble("lot");
                    j = bundle.getLong("time");
                } catch (Throwable unused2) {
                }
                double d5 = d2;
                d2 = d4;
                d3 = d5;
            } catch (Throwable unused3) {
            }
            if (d2 > -90.0d && d2 < 90.0d && d3 > -180.0d && d3 < 180.0d) {
                jSONObject.put("lat", d2);
                jSONObject.put("lng", d3);
                jSONObject.put("time", j);
            }
            return jSONObject.toString();
        }
        d3 = 200.0d;
        if (d2 > -90.0d) {
            jSONObject.put("lat", d2);
            jSONObject.put("lng", d3);
            jSONObject.put("time", j);
        }
        return jSONObject.toString();
    }

    /* renamed from: d */
    public static LinkedHashSet<String> m3119d(Context context) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        String str = (String) C0867b.m4225a(context, C0866a.m4218s());
        if (TextUtils.isEmpty(str)) {
            return linkedHashSet;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedHashSet.add(jSONArray.optString(i));
            }
        } catch (JSONException unused) {
        }
        return linkedHashSet;
    }
}
