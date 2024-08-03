package p031c.p032a.p097w;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p061e.C0612k;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p096v.C0849e;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;
import p031c.p032a.p100z.C0868c;

/* renamed from: c.a.w.a */
/* loaded from: classes.dex */
public final class C0855a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static C0855a f3606a = new C0855a();

    /* renamed from: b */
    private static int f3607b = 1048576;

    /* renamed from: c */
    private Thread.UncaughtExceptionHandler f3608c = null;

    /* renamed from: d */
    public boolean f3609d;

    private C0855a() {
        this.f3609d = true;
        this.f3609d = ((Boolean) C0867b.m4225a(C0583a.m2978a(null), C0866a.m4201b())).booleanValue();
    }

    /* renamed from: a */
    public static C0855a m4170a() {
        return f3606a;
    }

    /* renamed from: a */
    private static String m4171a(Throwable th) {
        String th2 = th.toString();
        try {
            String[] split = th2.split(":");
            if (split.length <= 1) {
                return th2;
            }
            for (int length = split.length - 1; length >= 0; length--) {
                if (!split[length].endsWith("Exception") && !split[length].endsWith("Error")) {
                }
                return split[length];
            }
            return th2;
        } catch (NullPointerException | PatternSyntaxException unused) {
            return th2;
        }
    }

    /* renamed from: a */
    private JSONArray m4172a(Context context, Throwable th) {
        String m4140b = C0849e.m4140b(C0849e.m4133a(context, "jpush_uncaughtexception_file"));
        JSONArray jSONArray = null;
        int i = 0;
        if (!TextUtils.isEmpty(m4140b)) {
            try {
                JSONArray jSONArray2 = new JSONArray(m4140b);
                try {
                    i = m4140b.length();
                } catch (JSONException unused) {
                }
                jSONArray = jSONArray2;
            } catch (JSONException unused2) {
            }
        }
        return m4173a(context, jSONArray, i, th);
    }

    /* renamed from: a */
    private JSONArray m4173a(Context context, JSONArray jSONArray, int i, Throwable th) {
        JSONObject jSONObject;
        long currentTimeMillis = System.currentTimeMillis() + C0868c.m4236c(context);
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        int i2 = 0;
        while (true) {
            jSONObject = null;
            try {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                jSONObject = jSONArray.optJSONObject(i2);
                if (jSONObject != null && stringWriter2.equals(jSONObject.getString("stacktrace"))) {
                    jSONObject.put("count", jSONObject.getInt("count") + 1);
                    jSONObject.put("crashtime", currentTimeMillis);
                    break;
                }
                i2++;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("crashtime", currentTimeMillis);
            jSONObject2.put("stacktrace", stringWriter2);
            jSONObject2.put("message", m4171a(th));
            jSONObject2.put("count", 1);
            jSONObject2.put("networktype", C0812a.m3956i(context));
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            if (packageInfo != null) {
                String str = packageInfo.versionName == null ? "null" : packageInfo.versionName;
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.versionCode);
                String sb2 = sb.toString();
                jSONObject2.put("versionname", str);
                jSONObject2.put("versioncode", sb2);
            }
            if (i + jSONObject2.toString().length() < f3607b) {
                jSONArray.put(jSONObject2);
            } else {
                long j = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                    if (optJSONObject != null) {
                        long optLong = optJSONObject.optLong("crashtime");
                        if (j == -1 || optLong < j) {
                            i3 = i4;
                            j = optLong;
                        }
                    }
                }
                jSONArray.put(i3, jSONObject2);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m4175a(Context context) {
        if (context == null) {
            C0601d.m3077f("JPushCrashHandler", "Action - deleteCrashLog context is null");
        } else {
            C0849e.m4135a(C0849e.m4133a(context, "jpush_uncaughtexception_file"));
        }
    }

    /* renamed from: c */
    private static JSONArray m4176c(Context context) {
        String m4140b = C0849e.m4140b(C0849e.m4133a(context, "jpush_uncaughtexception_file"));
        if (TextUtils.isEmpty(m4140b)) {
            return null;
        }
        try {
            return new JSONArray(m4140b);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static JSONObject m4177d(Context context) {
        JSONArray m4176c = m4176c(context);
        if (m4176c == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crashlogs", m4176c);
            jSONObject.put("network_type", C0812a.m3956i(context));
            C0612k.m3131a(context, jSONObject, "crash_log");
            Object m3052d = C0595f.m3052d(context);
            JSONObject jSONObject2 = m3052d instanceof JSONObject ? (JSONObject) m3052d : null;
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                jSONObject.put("device_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void m4178b() {
        if (this.f3608c == null) {
            this.f3608c = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: b */
    public final void m4179b(Context context) {
        if (context == null) {
            C0601d.m3077f("JPushCrashHandler", "Action - reportCrashLog context is null");
            return;
        }
        if (C0868c.m4233a(context)) {
            try {
                new C0856b(this).start();
            } catch (Throwable th) {
                C0601d.m3079h("JPushCrashHandler", "report crash e:" + th);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        File m4133a;
        if (this.f3609d) {
            C0601d.m3070a("JPushCrashHandler", "enable crash report");
            if (this.f3609d) {
                Context m2978a = C0583a.m2978a(null);
                if (m2978a != null) {
                    JSONArray m4172a = m4172a(m2978a, th);
                    m4175a(m2978a);
                    String jSONArray = m4172a != null ? m4172a.toString() : null;
                    if (!TextUtils.isEmpty(jSONArray) && (m4133a = C0849e.m4133a(m2978a, "jpush_uncaughtexception_file")) != null) {
                        C0849e.m4136a(m4133a, jSONArray);
                    }
                } else {
                    C0601d.m3079h("JPushCrashHandler", "handleException failed: context is null");
                }
            }
            try {
                C0856b c0856b = new C0856b(this);
                c0856b.start();
                c0856b.join(2000L);
            } catch (InterruptedException unused) {
            } catch (Throwable th2) {
                C0601d.m3079h("JPushCrashHandler", "report crash e:" + th2);
            }
        } else {
            C0601d.m3070a("JPushCrashHandler", "disable crash report");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3608c;
        if (uncaughtExceptionHandler == this || uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
