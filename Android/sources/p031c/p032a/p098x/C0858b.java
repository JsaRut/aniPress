package p031c.p032a.p098x;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p061e.C0612k;
import p031c.p032a.p096v.C0846b;
import p031c.p032a.p096v.C0854j;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.x.b */
/* loaded from: classes.dex */
public class C0858b {

    /* renamed from: a */
    private static volatile C0858b f3612a = null;

    /* renamed from: b */
    public static boolean f3613b = false;

    /* renamed from: c */
    public static boolean f3614c = false;

    /* renamed from: d */
    private ExecutorService f3615d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    private String f3616e = null;

    /* renamed from: f */
    private String f3617f = null;

    /* renamed from: g */
    private long f3618g = 30;

    /* renamed from: h */
    private long f3619h = 0;

    /* renamed from: i */
    private long f3620i = 0;

    /* renamed from: j */
    private boolean f3621j = true;

    /* renamed from: k */
    private boolean f3622k = false;

    /* renamed from: l */
    private boolean f3623l = true;

    /* renamed from: m */
    private long f3624m = 0;

    /* renamed from: n */
    private JSONObject f3625n = null;

    /* renamed from: o */
    private final Object f3626o = new Object();

    private C0858b() {
    }

    /* renamed from: a */
    public static C0858b m4180a() {
        if (f3612a == null) {
            synchronized (C0858b.class) {
                f3612a = new C0858b();
            }
        }
        return f3612a;
    }

    /* renamed from: a */
    private JSONObject m4181a(Context context, long j) {
        StringBuilder sb = new StringBuilder();
        String m3050b = C0595f.m3050b(context);
        if (!TextUtils.isEmpty(m3050b)) {
            sb.append(m3050b);
        }
        sb.append(j);
        this.f3617f = C0854j.m4163c(sb.toString());
        C0866a<Long> m4213n = C0866a.m4213n();
        m4213n.m4224a((C0866a<Long>) Long.valueOf(this.f3619h));
        C0866a<String> m4216q = C0866a.m4216q();
        m4216q.m4224a((C0866a<String>) this.f3617f);
        C0867b.m4229a(context, (C0866a<?>[]) new C0866a[]{m4213n, m4216q});
        JSONObject jSONObject = new JSONObject();
        try {
            m4183a(jSONObject);
            C0612k.m3131a(context, jSONObject, "active_launch");
            jSONObject.put("session_id", this.f3617f);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:            if ((r9.f3619h - r9.f3620i) <= (r9.f3618g * 1000)) goto L13;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0062, code lost:            if ((r9.f3619h - r5) <= (r9.f3618g * 1000)) goto L13;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m4182a(p031c.p032a.p098x.C0858b r9, android.content.Context r10) {
        /*
            boolean r0 = r9.f3621j
            r1 = 0
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            if (r0 == 0) goto L65
            r9.f3621j = r1
            java.lang.String r0 = "PushSA"
            java.lang.String r5 = "statistics start"
            p031c.p032a.p060d.C0601d.m3072b(r0, r5)
            c.a.z.a r0 = p031c.p032a.p100z.C0866a.m4215p()
            java.lang.Object r0 = p031c.p032a.p100z.C0867b.m4225a(r10, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "lastPause:"
            r0.<init>(r7)
            r0.append(r5)
            java.lang.String r7 = ",latestResumeTime:"
            r0.append(r7)
            long r7 = r9.f3619h
            r0.append(r7)
            java.lang.String r7 = ",interval:"
            r0.append(r7)
            long r7 = r9.f3618g
            long r7 = r7 * r2
            r0.append(r7)
            java.lang.String r7 = ",a:"
            r0.append(r7)
            long r7 = r9.f3619h
            long r7 = r7 - r5
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "PushSA"
            p031c.p032a.p060d.C0601d.m3072b(r7, r0)
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L73
            long r7 = r9.f3619h
            long r7 = r7 - r5
            long r5 = r9.f3618g
            long r5 = r5 * r2
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L73
            goto L74
        L65:
            long r5 = r9.f3619h
            long r7 = r9.f3620i
            long r5 = r5 - r7
            long r7 = r9.f3618g
            long r7 = r7 * r2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L73
            goto L74
        L73:
            r1 = 1
        L74:
            if (r1 == 0) goto Lbe
            java.lang.String r0 = "PushSA"
            java.lang.String r1 = "new statistics session"
            p031c.p032a.p060d.C0601d.m3075d(r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            long r1 = r9.f3619h
            org.json.JSONObject r1 = r9.m4181a(r10, r1)
            if (r1 == 0) goto L8d
            r0.put(r1)
        L8d:
            java.lang.Object r1 = r9.f3626o
            monitor-enter(r1)
            org.json.JSONObject r2 = r9.m4186d(r10)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto La9
            int r3 = r2.length()     // Catch: java.lang.Throwable -> Lbb
            if (r3 <= 0) goto La9
            java.lang.String r3 = "active_terminate"
            p031c.p032a.p061e.C0612k.m3131a(r10, r2, r3)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lbb
        La1:
            java.lang.String r3 = "push_stat_cache.json"
            r4 = 0
            p031c.p032a.p061e.C0612k.m3138a(r10, r3, r4)     // Catch: java.lang.Throwable -> Lbb
            r9.f3625n = r4     // Catch: java.lang.Throwable -> Lbb
        La9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lb5
            int r9 = r2.length()
            if (r9 <= 0) goto Lb5
            r0.put(r2)
        Lb5:
            java.lang.String r9 = p031c.p032a.p057a.C0583a.f2797d
            p031c.p032a.p061e.C0612k.m3135a(r10, r9, r0)
            return
        Lbb:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbb
            throw r9
        Lbe:
            c.a.z.a r0 = p031c.p032a.p100z.C0866a.m4216q()
            java.lang.Object r10 = p031c.p032a.p100z.C0867b.m4231b(r10, r0)
            java.lang.String r10 = (java.lang.String) r10
            r9.f3617f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p098x.C0858b.m4182a(c.a.x.b, android.content.Context):void");
    }

    /* renamed from: a */
    private static void m4183a(JSONObject jSONObject) {
        String m4123a = C0846b.m4123a();
        String str = m4123a.split("_")[0];
        String str2 = m4123a.split("_")[1];
        jSONObject.put("date", str);
        jSONObject.put("time", str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m4184b(C0858b c0858b, Context context) {
        long j;
        if (context != null) {
            synchronized (c0858b.f3626o) {
                C0866a<Long> m4215p = C0866a.m4215p();
                m4215p.m4224a((C0866a<Long>) Long.valueOf(c0858b.f3620i));
                C0866a<Long> m4214o = C0866a.m4214o();
                m4214o.m4224a((C0866a<Long>) Long.valueOf(c0858b.f3620i));
                C0867b.m4229a(context, (C0866a<?>[]) new C0866a[]{m4215p, m4214o});
                JSONObject m4186d = c0858b.m4186d(context);
                if (m4186d == null) {
                    m4186d = new JSONObject();
                }
                try {
                    long longValue = ((Long) C0867b.m4225a(context, C0866a.m4213n())).longValue();
                    if (longValue <= 0) {
                        long j2 = c0858b.f3620i - c0858b.f3624m;
                        j = j2 > 0 ? j2 / 1000 : 10L;
                        C0866a<Long> m4213n = C0866a.m4213n();
                        m4213n.m4224a((C0866a<Long>) Long.valueOf(c0858b.f3624m));
                        C0867b.m4229a(context, (C0866a<?>[]) new C0866a[]{m4213n});
                    } else {
                        j = (c0858b.f3620i - longValue) / 1000;
                    }
                    m4186d.put("duration", j);
                    m4186d.put("itime", System.currentTimeMillis() / 1000);
                    m4186d.put("session_id", c0858b.f3617f);
                    m4183a(m4186d);
                } catch (Exception unused) {
                }
                c0858b.f3625n = m4186d;
                C0612k.m3138a(context, "push_stat_cache.json", m4186d);
            }
        }
    }

    /* renamed from: c */
    private boolean m4185c(Context context, String str) {
        if (!this.f3623l) {
            C0601d.m3075d("PushSA", "stat function has been disabled");
            return false;
        }
        if (context == null) {
            C0601d.m3075d("PushSA", "context is null");
            return false;
        }
        if (!(context instanceof Application)) {
            return true;
        }
        C0601d.m3080i("PushSA", "Context should be an Activity on this method : " + str);
        return false;
    }

    /* renamed from: d */
    private JSONObject m4186d(Context context) {
        if (this.f3625n == null) {
            this.f3625n = C0612k.m3130a(context, "push_stat_cache.json");
        }
        return this.f3625n;
    }

    /* renamed from: a */
    public final void m4187a(long j) {
        this.f3618g = j;
    }

    /* renamed from: a */
    public final void m4188a(Context context) {
        try {
            if (this.f3616e == null || !this.f3622k) {
                return;
            }
            this.f3620i = System.currentTimeMillis();
            this.f3615d.execute(new RunnableC0861e(this, context.getApplicationContext()));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m4189a(Context context, String str) {
        if (this.f3622k) {
            C0601d.m3072b("PushSA", "JCoreInterface.onResume() must be called after called JCoreInterface.onPause() in last Activity or Fragment");
            return;
        }
        this.f3622k = true;
        this.f3616e = str;
        this.f3619h = System.currentTimeMillis();
        try {
            this.f3615d.execute(new RunnableC0859c(this, context.getApplicationContext()));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m4190a(boolean z) {
        this.f3623l = z;
    }

    /* renamed from: b */
    public final void m4191b(Context context) {
        if (m4185c(context, "onResume")) {
            f3613b = true;
            try {
                this.f3622k = false;
            } catch (ClassCastException | Exception unused) {
            }
            if (this.f3622k) {
                return;
            }
            this.f3622k = true;
            this.f3619h = System.currentTimeMillis();
            this.f3616e = context.getClass().getName();
            try {
                this.f3615d.execute(new RunnableC0862f(true, context.getApplicationContext(), this));
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: b */
    public final void m4192b(Context context, String str) {
        if (!this.f3622k) {
            C0601d.m3072b("PushSA", "JCoreInterface.onPause() must be called after called JCoreInterface.onResume() in this Activity or Fragment");
            return;
        }
        this.f3622k = false;
        String str2 = this.f3616e;
        if (str2 == null || !str2.equals(str)) {
            C0601d.m3080i("PushSA", "page name didn't match the last one passed by onResume");
            return;
        }
        this.f3620i = System.currentTimeMillis();
        try {
            this.f3615d.execute(new RunnableC0860d(this, context.getApplicationContext()));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void m4193c(Context context) {
        if (m4185c(context, "onPause")) {
            f3614c = true;
            try {
                this.f3622k = true;
            } catch (ClassCastException unused) {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.f3622k) {
                this.f3622k = false;
                String str = this.f3616e;
                if (str == null || !str.equals(context.getClass().getName())) {
                    C0601d.m3075d("PushSA", "the activity pass by onPause didn't match last one passed by onResume");
                    return;
                }
                this.f3620i = System.currentTimeMillis();
                this.f3624m = this.f3619h;
                try {
                    this.f3615d.execute(new RunnableC0862f(false, context.getApplicationContext(), this));
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
