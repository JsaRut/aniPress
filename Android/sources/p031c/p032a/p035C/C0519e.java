package p031c.p032a.p035C;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p036D.C0520a;
import p031c.p032a.p036D.C0521b;
import p031c.p032a.p037E.C0522a;
import p031c.p032a.p037E.C0523b;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.C.e */
/* loaded from: classes.dex */
public class C0519e extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0519e f2601a;

    /* renamed from: b */
    private Context f2602b;

    /* renamed from: c */
    private List<C0520a> f2603c;

    /* renamed from: d */
    private List<C0521b> f2604d;

    /* renamed from: d */
    public static C0519e m2733d() {
        if (f2601a == null) {
            synchronized (C0519e.class) {
                f2601a = new C0519e();
            }
        }
        return f2601a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final void mo2672a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("content");
        try {
            long j = optJSONObject.getLong("interval");
            if (j == -1) {
                C0511f.m2690a(this.f2602b, "JAppRunning", false);
                return;
            }
            if (j == 0) {
                C0511f.m2690a(this.f2602b, "JAppRunning", true);
                return;
            }
            int optInt = optJSONObject.optInt("app_type", 0);
            int optInt2 = optJSONObject.optInt("process_type", 0);
            C0511f.m2690a(this.f2602b, "JAppRunning", true);
            C0511f.m2687a(this.f2602b, optInt);
            C0511f.m2695b(this.f2602b, optInt2);
            if (j > 0) {
                C0511f.m2696b(this.f2602b, "JAppRunning", j);
            }
        } catch (JSONException e2) {
            C0675a.m3475g("JAppRunning", "parse interval exception:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    public final boolean mo2673a() {
        C0675a.m3469c("JAppRunning", "for googlePlay:false");
        return true;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    protected final boolean mo2677b() {
        return C0511f.m2709h(this.f2602b, "JAppRunning");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        int m2685a = C0511f.m2685a(context);
        int m2693b = C0511f.m2693b(context);
        if (m2685a > 0) {
            this.f2603c = C0522a.m2741a(context);
        } else {
            C0675a.m3475g("JAppRunning", "can't collect runningApp because reportRunningAppType:" + m2685a);
        }
        if (m2693b > 0) {
            this.f2604d = C0523b.m2752a(m2693b);
        } else {
            C0675a.m3475g("JAppRunning", "can't collect runningProcess because reportRunningProcessType:" + m2693b);
        }
        List<C0520a> list = this.f2603c;
        if (list != null && !list.isEmpty()) {
            C0675a.m3469c("JAppRunning", "collect runningAppList success");
        }
        List<C0521b> list2 = this.f2604d;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        C0675a.m3469c("JAppRunning", "collect runningProcessList success");
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2602b = context;
        return "JAppRunning";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2683d(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List<c.a.D.a> r0 = r7.f2603c
            r1 = 128(0x80, float:1.8E-43)
            java.lang.String r2 = "JAppRunning"
            r3 = 0
            if (r0 == 0) goto L30
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List<c.a.D.a> r4 = r7.f2603c
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r5 = r4.next()
            c.a.D.a r5 = (p031c.p032a.p036D.C0520a) r5
            org.json.JSONObject r5 = r5.m2734a(r1)
            if (r5 == 0) goto L1a
            r0.put(r5)
            goto L1a
        L30:
            java.lang.String r0 = "there are no running app to report"
            p031c.p032a.p066j.C0675a.m3475g(r2, r0)
            r0 = r3
        L36:
            java.util.List<c.a.D.b> r4 = r7.f2604d
            if (r4 == 0) goto L61
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L61
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.List<c.a.D.b> r5 = r7.f2604d
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L67
            java.lang.Object r6 = r5.next()
            c.a.D.b r6 = (p031c.p032a.p036D.C0521b) r6
            org.json.JSONObject r6 = r6.m2735a(r1)
            if (r6 == 0) goto L4b
            r4.put(r6)
            goto L4b
        L61:
            java.lang.String r1 = "there are no running process to report"
            p031c.p032a.p066j.C0675a.m3475g(r2, r1)
            r4 = r3
        L67:
            r7.f2603c = r3
            r7.f2604d = r3
            r1 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L92
            r5.<init>()     // Catch: org.json.JSONException -> L92
            r3 = 1
            if (r0 == 0) goto L83
            int r6 = r0.length()     // Catch: org.json.JSONException -> L81
            if (r6 <= 0) goto L83
            java.lang.String r6 = "app"
            r5.put(r6, r0)     // Catch: org.json.JSONException -> L81
            r1 = 1
            goto L83
        L81:
            r0 = move-exception
            goto L94
        L83:
            if (r4 == 0) goto La9
            int r0 = r4.length()     // Catch: org.json.JSONException -> L81
            if (r0 <= 0) goto La9
            java.lang.String r0 = "process"
            r5.put(r0, r4)     // Catch: org.json.JSONException -> L81
            r1 = 1
            goto La9
        L92:
            r0 = move-exception
            r5 = r3
        L94:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "package json exception:"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p031c.p032a.p066j.C0675a.m3475g(r2, r0)
        La9:
            if (r1 == 0) goto Lb6
            java.lang.String r0 = "app_running"
            p031c.p032a.p033A.C0513h.m2719a(r8, r5, r0)
            p031c.p032a.p033A.C0513h.m2720a(r8, r5)
            super.mo2683d(r8, r9)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p035C.C0519e.mo2683d(android.content.Context, java.lang.String):void");
    }
}
