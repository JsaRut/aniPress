package p031c.p032a.p072p.p073a.p077c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.p087g.C0763e;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.c.e */
/* loaded from: classes.dex */
public final class C0726e implements InterfaceC0722a {

    /* renamed from: b */
    private long f3291b;

    /* renamed from: c */
    private long f3292c;

    /* renamed from: d */
    private long f3293d;

    /* renamed from: f */
    private C0724c f3295f;

    /* renamed from: g */
    private C0724c f3296g;

    /* renamed from: i */
    private C0725d f3298i;

    /* renamed from: a */
    private String f3290a = null;

    /* renamed from: e */
    private List<C0725d> f3294e = new ArrayList();

    /* renamed from: h */
    private boolean f3297h = false;

    /* renamed from: j */
    private int f3299j = 1;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:            if (r5 < 0) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:            if (r5 < 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:            if (r5 < 0) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:            if (r5 < 0) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:            if (r5 < 0) goto L46;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m3684h() {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "session_phone_total_memory"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            r3 = 0
            if (r2 != 0) goto Lf
            r5 = r3
            goto L15
        Lf:
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            long r5 = r2.m3671f()     // Catch: org.json.JSONException -> Lca
        L15:
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lca
            java.lang.String r1 = "session_phone_rx_bytes"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L30
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L23
            goto L30
        L23:
            long r5 = p031c.p032a.p072p.p073a.p077c.C0724c.m3665a()     // Catch: org.json.JSONException -> Lca
            long r7 = p031c.p032a.p072p.p073a.p077c.C0724c.m3665a()     // Catch: org.json.JSONException -> Lca
            long r5 = r5 - r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L31
        L30:
            r5 = r3
        L31:
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lca
            java.lang.String r1 = "session_phone_tx_bytes"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L4c
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L3f
            goto L4c
        L3f:
            long r5 = p031c.p032a.p072p.p073a.p077c.C0724c.m3666b()     // Catch: org.json.JSONException -> Lca
            long r7 = p031c.p032a.p072p.p073a.p077c.C0724c.m3666b()     // Catch: org.json.JSONException -> Lca
            long r5 = r5 - r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L4d
        L4c:
            r5 = r3
        L4d:
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lca
            java.lang.String r1 = "session_phone_mobile_rx_bytes"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L68
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L5b
            goto L68
        L5b:
            long r5 = p031c.p032a.p072p.p073a.p077c.C0724c.m3667c()     // Catch: org.json.JSONException -> Lca
            long r7 = p031c.p032a.p072p.p073a.p077c.C0724c.m3667c()     // Catch: org.json.JSONException -> Lca
            long r5 = r5 - r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L69
        L68:
            r5 = r3
        L69:
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lca
            java.lang.String r1 = "session_phone_mobile_tx_bytes"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L84
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L77
            goto L84
        L77:
            long r5 = p031c.p032a.p072p.p073a.p077c.C0724c.m3668d()     // Catch: org.json.JSONException -> Lca
            long r7 = p031c.p032a.p072p.p073a.p077c.C0724c.m3668d()     // Catch: org.json.JSONException -> Lca
            long r5 = r5 - r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L85
        L84:
            r5 = r3
        L85:
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lca
            java.lang.String r1 = "session_app_rx_bytes"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto La4
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L93
            goto La4
        L93:
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            long r5 = r2.m3673h()     // Catch: org.json.JSONException -> Lca
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            long r7 = r2.m3673h()     // Catch: org.json.JSONException -> Lca
            long r5 = r5 - r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto La5
        La4:
            r5 = r3
        La5:
            r0.put(r1, r5)     // Catch: org.json.JSONException -> Lca
            java.lang.String r1 = "session_app_tx_bytes"
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto Lc6
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto Lb3
            goto Lc6
        Lb3:
            c.a.p.a.c.c r2 = r9.f3296g     // Catch: org.json.JSONException -> Lca
            long r5 = r2.m3672g()     // Catch: org.json.JSONException -> Lca
            c.a.p.a.c.c r2 = r9.f3295f     // Catch: org.json.JSONException -> Lca
            long r7 = r2.m3672g()     // Catch: org.json.JSONException -> Lca
            long r5 = r5 - r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lc5
            goto Lc6
        Lc5:
            r3 = r5
        Lc6:
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Lca
            goto Lce
        Lca:
            r1 = move-exception
            r1.printStackTrace()
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p077c.C0726e.m3684h():org.json.JSONObject");
    }

    @Override // p031c.p032a.p072p.p073a.p077c.InterfaceC0722a
    /* renamed from: a */
    public final JSONObject mo3661a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f3290a);
            jSONObject.put("start_time", this.f3291b / 1000);
            C0830f.m4050a(jSONObject, "page");
            if (this.f3294e != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<C0725d> it = this.f3294e.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().mo3661a());
                }
                boolean m3809a = C0763e.m3809a(jSONArray);
                Object obj = jSONArray;
                if (m3809a) {
                    obj = "";
                }
                jSONObject.put("page_list", obj);
            }
            jSONObject.put("session_end", this.f3297h);
            if (this.f3297h) {
                jSONObject.put("end_time", this.f3292c / 1000);
                jSONObject.put("duration_time", C0766h.m3814a(((float) (this.f3292c - this.f3291b)) / 1000.0f, 2));
                JSONObject m3684h = m3684h();
                if (!C0763e.m3809a(m3684h)) {
                    jSONObject.put("extra", m3684h);
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void m3685a(long j) {
        this.f3291b = j;
    }

    /* renamed from: a */
    public final void m3686a(C0724c c0724c) {
        this.f3296g = c0724c;
    }

    /* renamed from: a */
    public final void m3687a(C0725d c0725d) {
        this.f3294e.add(c0725d);
        this.f3298i = c0725d;
        this.f3299j++;
    }

    /* renamed from: a */
    public final void m3688a(String str) {
        this.f3290a = str;
    }

    /* renamed from: b */
    public final C0725d m3689b() {
        return this.f3298i;
    }

    /* renamed from: b */
    public final void m3690b(long j) {
        this.f3292c = j;
        this.f3293d = j - this.f3291b;
    }

    /* renamed from: b */
    public final void m3691b(C0724c c0724c) {
        this.f3295f = c0724c;
    }

    /* renamed from: c */
    public final int m3692c() {
        return this.f3299j;
    }

    /* renamed from: d */
    public final List<C0725d> m3693d() {
        return this.f3294e;
    }

    /* renamed from: e */
    public final void m3694e() {
        this.f3297h = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0726e.class == obj.getClass()) {
            C0726e c0726e = (C0726e) obj;
            String str = this.f3290a;
            if (str != null) {
                return str.equals(c0726e.f3290a);
            }
            if (c0726e.f3290a == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m3695f() {
        return this.f3297h;
    }

    /* renamed from: g */
    public final void m3696g() {
        this.f3294e.clear();
    }

    public final int hashCode() {
        String str = this.f3290a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SessionEntity{sessionId='" + this.f3290a + "', sessionStartTime=" + this.f3291b + ", sessionEndTime=" + this.f3292c + ", sessionDuration=" + this.f3293d + ", pageEntityList=" + this.f3294e + ", sessionStartExtra=" + this.f3295f + ", sessionEndExtra=" + this.f3296g + '}';
    }
}
