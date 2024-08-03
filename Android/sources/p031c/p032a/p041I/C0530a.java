package p031c.p032a.p041I;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.I.a */
/* loaded from: classes.dex */
public class C0530a extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0530a f2633a;

    /* renamed from: b */
    private Context f2634b;

    /* renamed from: c */
    private JSONObject f2635c;

    /* renamed from: d */
    private String f2636d;

    /* renamed from: d */
    public static C0530a m2767d() {
        if (f2633a == null) {
            synchronized (C0530a.class) {
                f2633a = new C0530a();
            }
        }
        return f2633a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223 A[Catch: Throwable -> 0x0325, JSONException -> 0x0327, TryCatch #3 {JSONException -> 0x0327, Throwable -> 0x0325, blocks: (B:14:0x0087, B:16:0x00a7, B:17:0x00d6, B:19:0x0100, B:22:0x022e, B:25:0x0243, B:28:0x0269, B:31:0x0276, B:34:0x0283, B:37:0x0290, B:40:0x029d, B:43:0x02ad, B:46:0x02bd, B:49:0x02cd, B:52:0x02dd, B:55:0x02ed, B:58:0x02fd, B:61:0x030d, B:64:0x031a, B:75:0x0110, B:76:0x0117, B:78:0x0127, B:80:0x021d, B:82:0x0223, B:86:0x012e, B:89:0x013e, B:92:0x014d, B:95:0x015d, B:98:0x016d, B:101:0x017d, B:104:0x018d, B:106:0x019c, B:107:0x01a1, B:110:0x01b2, B:113:0x01c3, B:116:0x01d4, B:119:0x01e5, B:122:0x01f6, B:125:0x0207, B:127:0x0217, B:131:0x00be, B:132:0x00c8, B:133:0x00cd), top: B:13:0x0087 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject m2768g(android.content.Context r28) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p041I.C0530a.m2768g(android.content.Context):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[Catch: Throwable -> 0x00a7, TryCatch #2 {Throwable -> 0x00a7, blocks: (B:3:0x0007, B:12:0x0047, B:15:0x005d, B:18:0x006a, B:21:0x0077, B:24:0x0084, B:27:0x0091, B:30:0x009f, B:35:0x0041, B:36:0x003b, B:39:0x0021), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b A[Catch: Throwable -> 0x00a7, TryCatch #2 {Throwable -> 0x00a7, blocks: (B:3:0x0007, B:12:0x0047, B:15:0x005d, B:18:0x006a, B:21:0x0077, B:24:0x0084, B:27:0x0091, B:30:0x009f, B:35:0x0041, B:36:0x003b, B:39:0x0021), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m2769h(android.content.Context r11) {
        /*
            java.lang.String r0 = "JDevice"
            java.lang.String r1 = ","
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = p031c.p032a.p048P.p049a.C0557c.m2910d(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = p031c.p032a.p048P.p049a.C0557c.m2915i(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r6 = r11.getPackageName()     // Catch: java.lang.Throwable -> L1f
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch: java.lang.Throwable -> L1d
            r7 = 0
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r6, r7)     // Catch: java.lang.Throwable -> L1d
            goto L37
        L1d:
            r11 = move-exception
            goto L21
        L1f:
            r11 = move-exception
            r6 = r2
        L21:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = "getPackageManager failed:"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> La7
            r7.append(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r7.toString()     // Catch: java.lang.Throwable -> La7
            p031c.p032a.p066j.C0675a.m3475g(r0, r11)     // Catch: java.lang.Throwable -> La7
            r11 = r3
        L37:
            if (r11 != 0) goto L3b
            r7 = r2
            goto L3d
        L3b:
            java.lang.String r7 = r11.versionName     // Catch: java.lang.Throwable -> La7
        L3d:
            if (r11 != 0) goto L41
            r11 = r2
            goto L47
        L41:
            int r11 = r11.versionCode     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> La7
        L47:
            java.lang.String r8 = "2.1.2"
            java.lang.String r9 = "212"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r10.<init>()     // Catch: java.lang.Throwable -> La7
            r10.append(r4)     // Catch: java.lang.Throwable -> La7
            r10.append(r1)     // Catch: java.lang.Throwable -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L5d
            r5 = r2
        L5d:
            r10.append(r5)     // Catch: java.lang.Throwable -> La7
            r10.append(r1)     // Catch: java.lang.Throwable -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L6a
            r7 = r2
        L6a:
            r10.append(r7)     // Catch: java.lang.Throwable -> La7
            r10.append(r1)     // Catch: java.lang.Throwable -> La7
            boolean r4 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L77
            r11 = r2
        L77:
            r10.append(r11)     // Catch: java.lang.Throwable -> La7
            r10.append(r1)     // Catch: java.lang.Throwable -> La7
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> La7
            if (r11 == 0) goto L84
            r8 = r2
        L84:
            r10.append(r8)     // Catch: java.lang.Throwable -> La7
            r10.append(r1)     // Catch: java.lang.Throwable -> La7
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> La7
            if (r11 == 0) goto L91
            r9 = r2
        L91:
            r10.append(r9)     // Catch: java.lang.Throwable -> La7
            r10.append(r1)     // Catch: java.lang.Throwable -> La7
            boolean r11 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La7
            if (r11 == 0) goto L9e
            goto L9f
        L9e:
            r2 = r6
        L9f:
            r10.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r10.toString()     // Catch: java.lang.Throwable -> La7
            return r11
        La7:
            r11 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentCondition throwable: "
            r1.<init>(r2)
            java.lang.String r11 = r11.getMessage()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            p031c.p032a.p066j.C0675a.m3475g(r0, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p041I.C0530a.m2769h(android.content.Context):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    public final boolean mo2678b(Context context, String str) {
        if (!C0511f.m2698b(context, str)) {
            return false;
        }
        JSONObject jSONObject = this.f2635c;
        if (jSONObject == null) {
            C0675a.m3475g("JDevice", "there are no data to report");
            return false;
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            return false;
        }
        this.f2636d = C0819h.m4001k(jSONObject2 + m2769h(context));
        String m2706f = C0511f.m2706f(context);
        if (TextUtils.isEmpty(this.f2636d) || TextUtils.equals(this.f2636d, m2706f)) {
            C0675a.m3469c("JDevice", "device detail is not change");
            return false;
        }
        C0675a.m3469c("JDevice", "device detail is change");
        return super.mo2678b(context, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        this.f2635c = m2768g(context);
        if (this.f2635c == null) {
            C0675a.m3475g("JDevice", "collect failed");
            return;
        }
        C0675a.m3469c("JDevice", "collect success:" + this.f2635c);
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2634b = context;
        return "JDevice";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        JSONObject jSONObject = this.f2635c;
        if (jSONObject == null) {
            C0675a.m3469c("JDevice", "there are no data to report");
            return;
        }
        C0513h.m2719a(context, jSONObject, "device_info");
        C0513h.m2721a(context, this.f2635c, new C0531b(this, context, str));
        this.f2635c = null;
    }

    /* renamed from: f */
    public final Object m2770f(Context context) {
        return m2768g(context);
    }
}
