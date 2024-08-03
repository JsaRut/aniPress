package p031c.p101b.p102a.p103a;

import android.content.Context;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.a.h */
/* loaded from: classes.dex */
public class C0877h {

    /* renamed from: a */
    private static C0877h f3691a;

    /* renamed from: b */
    private static final Object f3692b = new Object();

    /* renamed from: c */
    private AbstractC0876g f3693c;

    private C0877h(Context context) {
        m4293b(context);
    }

    /* renamed from: a */
    public static C0877h m4292a(Context context) {
        if (f3691a == null) {
            synchronized (f3692b) {
                if (f3691a == null) {
                    f3691a = new C0877h(context);
                }
            }
        }
        return f3691a;
    }

    /* renamed from: b */
    private void m4293b(Context context) {
        if (context == null) {
            C0923b.m4644b("GeofenceManager", "context is null,init failed");
        } else {
            this.f3693c = new C0873d(context);
        }
    }

    /* renamed from: a */
    public void m4294a() {
        this.f3693c.mo4274b();
    }

    /* renamed from: a */
    public void m4295a(int i) {
        this.f3693c.m4286a(i);
    }

    /* renamed from: a */
    public void m4296a(long j) {
        this.f3693c.mo4271a(j);
    }

    /* renamed from: a */
    public void m4297a(C0874e c0874e) {
        C0923b.m4644b("GeofenceManager", "recv geofence...");
        this.f3693c.m4290c(c0874e);
    }

    /* renamed from: a */
    public void m4298a(String str) {
        this.f3693c.m4287a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:            if (r3 == 1) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:            if (r3 == 2) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:            p031c.p101b.p102a.p114l.C0923b.m4653i("GeofenceManager", "operation " + r1 + " not supported");     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:            r8.f3693c.m4287a(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:            r8.f3693c.m4288a(r2, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:            return;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4299a(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "GeofenceManager"
            java.lang.String r1 = "content"
            org.json.JSONObject r9 = r9.getJSONObject(r1)     // Catch: java.lang.Throwable -> L9a
            if (r9 == 0) goto Laf
            int r1 = r9.length()     // Catch: java.lang.Throwable -> L9a
            if (r1 <= 0) goto Laf
            java.lang.String r1 = "op"
            java.lang.String r1 = r9.optString(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = "geofenceid"
            java.lang.String r2 = r9.optString(r2)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L94
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L2a
            goto L94
        L2a:
            r3 = -1
            int r4 = r1.hashCode()     // Catch: java.lang.Throwable -> L9a
            r5 = 96417(0x178a1, float:1.35109E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L55
            r5 = 99339(0x1840b, float:1.39204E-40)
            if (r4 == r5) goto L4b
            r5 = 116009(0x1c529, float:1.62563E-40)
            if (r4 == r5) goto L41
            goto L5e
        L41:
            java.lang.String r4 = "upd"
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L5e
            r3 = 1
            goto L5e
        L4b:
            java.lang.String r4 = "del"
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L5e
            r3 = 2
            goto L5e
        L55:
            java.lang.String r4 = "add"
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L5e
            r3 = 0
        L5e:
            if (r3 == 0) goto L8a
            if (r3 == r7) goto L84
            if (r3 == r6) goto L7e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r9.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = "operation "
            r9.append(r2)     // Catch: java.lang.Throwable -> L9a
            r9.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = " not supported"
            r9.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L9a
            p031c.p101b.p102a.p114l.C0923b.m4653i(r0, r9)     // Catch: java.lang.Throwable -> L9a
            goto Laf
        L7e:
            c.b.a.a.g r9 = r8.f3693c     // Catch: java.lang.Throwable -> L9a
            r9.m4287a(r2)     // Catch: java.lang.Throwable -> L9a
            goto Laf
        L84:
            c.b.a.a.g r1 = r8.f3693c     // Catch: java.lang.Throwable -> L9a
            r1.m4288a(r2, r9)     // Catch: java.lang.Throwable -> L9a
            goto Laf
        L8a:
            c.b.a.a.e r9 = p031c.p101b.p102a.p103a.C0874e.m4276a(r9)     // Catch: java.lang.Throwable -> L9a
            c.b.a.a.g r1 = r8.f3693c     // Catch: java.lang.Throwable -> L9a
            r1.m4290c(r9)     // Catch: java.lang.Throwable -> L9a
            goto Laf
        L94:
            java.lang.String r9 = "json error: required key not found"
            p031c.p101b.p102a.p114l.C0923b.m4653i(r0, r9)     // Catch: java.lang.Throwable -> L9a
            return
        L9a:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "json error:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            p031c.p101b.p102a.p114l.C0923b.m4653i(r0, r9)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p103a.C0877h.m4299a(org.json.JSONObject):void");
    }
}
