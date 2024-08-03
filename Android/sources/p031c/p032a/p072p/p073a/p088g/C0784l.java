package p031c.p032a.p072p.p073a.p088g;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p074a.AbstractRunnableC0704n;
import p031c.p032a.p072p.p073a.p074a.C0697g;
import p031c.p032a.p072p.p073a.p078d.C0728a;
import p031c.p032a.p072p.p073a.p079e.C0729a;
import p031c.p032a.p072p.p073a.p080f.C0743d;
import p031c.p032a.p072p.p073a.p080f.C0758g;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0767i;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.g.l */
/* loaded from: classes.dex */
public final class C0784l {

    /* renamed from: a */
    private static final Object f3442a = new Object();

    /* renamed from: b */
    public static C0784l f3443b;

    /* renamed from: c */
    private Map<C0783k, Long> f3444c = new HashMap();

    private C0784l() {
    }

    /* renamed from: a */
    private static C0783k m3877a(C0728a c0728a) {
        List<C0774b> m3860a;
        if (!C0789q.m3898b() || (m3860a = C0776d.m3860a(c0728a.m3697a(), c0728a.m3698b(), c0728a.m3699c())) == null || m3860a.isEmpty()) {
            return null;
        }
        Integer[] numArr = new Integer[m3860a.size()];
        for (int i = 0; i < m3860a.size(); i++) {
            numArr[i] = Integer.valueOf(m3860a.get(i).f3419b);
        }
        return new C0783k(c0728a.m3697a(), numArr, c0728a.m3698b(), c0728a.m3699c());
    }

    /* renamed from: a */
    public static C0784l m3878a() {
        if (f3443b == null) {
            synchronized (f3442a) {
                if (f3443b == null) {
                    f3443b = new C0784l();
                }
            }
        }
        return f3443b;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONArray m3879a(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lc
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lc
            r0.<init>(r1)     // Catch: org.json.JSONException -> Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L14
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p088g.C0784l.m3879a(java.lang.String):org.json.JSONArray");
    }

    /* renamed from: a */
    private static JSONArray m3880a(JSONArray jSONArray, C0783k c0783k, long j, long j2) {
        boolean z = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                C0782j m3871a = C0782j.m3871a(jSONArray.getJSONObject(i));
                if (m3871a != null && c0783k.equals(m3871a.f3435a)) {
                    if (j2 > 0) {
                        m3871a.m3874a(j, j2);
                    } else {
                        m3871a.m3873a(j);
                    }
                    jSONArray.put(i, m3871a.m3872a());
                    z = true;
                }
            } catch (JSONException unused) {
            }
        }
        if (!z) {
            C0782j c0782j = new C0782j(c0783k);
            if (j2 > 0) {
                c0782j.m3874a(j, j2);
            } else {
                c0782j.m3873a(j);
            }
            jSONArray.put(c0782j.m3872a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static void m3881a(Context context, JSONArray jSONArray) {
        JSONObject m3762a = C0743d.m3762a(jSONArray);
        if (m3762a == null) {
            C0732b.m3718b("RecordManager", "content is empty");
            return;
        }
        C0732b.m3718b("RecordManager", "xxx_upload content " + C0729a.m3700a(m3762a));
        C0830f.m4054a(context, m3762a, false);
    }

    /* renamed from: a */
    private void m3882a(C0783k c0783k, long j, boolean z) {
        C0732b.m3718b("RecordManager", "onBrowseEvent isShow=" + z + ", path=" + c0783k.f3438a + " pos=" + c0783k.f3440c);
        if (z) {
            Long l = this.f3444c.get(c0783k);
            if (l == null || l.longValue() <= 0) {
                this.f3444c.put(c0783k, Long.valueOf(j));
                return;
            }
            return;
        }
        Long l2 = this.f3444c.get(c0783k);
        if (l2 != null && l2.longValue() > 0) {
            this.f3444c.remove(c0783k);
            String valueOf = String.valueOf(c0783k.hashCode());
            JSONArray m3879a = m3879a(C0785m.m3888a(valueOf));
            m3880a(m3879a, c0783k, l2.longValue(), j);
            C0785m.m3890a(valueOf, m3879a.toString());
        }
        m3883b();
    }

    /* renamed from: b */
    private static void m3883b() {
        Context m3613a = C0707b.m3613a(null);
        if (m3613a == null) {
            return;
        }
        AbstractRunnableC0704n m3576a = C0697g.m3576a(4369);
        if (m3576a != null && m3576a.mo3579a() > 0) {
            C0732b.m3718b("RecordManager", "cache data, wait for period upload");
        } else if (C0767i.m3821c(SystemClock.uptimeMillis())) {
            C0732b.m3718b("RecordManager", "upload data too busy, give up this time");
        } else {
            m3878a().m3884a(m3613a);
        }
    }

    /* renamed from: a */
    public final void m3884a(Context context) {
        Map<String, ?> m3889a;
        try {
            if (C0789q.m3898b() && (m3889a = C0785m.m3889a(context)) != null && !m3889a.isEmpty()) {
                JSONArray jSONArray = null;
                C0776d.m3862a(C0707b.m3613a(null), true);
                int i = 0;
                for (Map.Entry<String, ?> entry : m3889a.entrySet()) {
                    if (entry.getValue() instanceof String) {
                        String str = (String) entry.getValue();
                        JSONArray m3879a = m3879a(str);
                        if (m3879a.length() > 0) {
                            if (str.length() >= 40960) {
                                m3881a(context, m3879a);
                            }
                            if (str.length() + i < 40960) {
                                jSONArray = C0729a.m3701a(jSONArray, m3879a);
                            } else {
                                m3881a(context, jSONArray);
                                i = str.length();
                                jSONArray = m3879a;
                            }
                        }
                    }
                }
                if (jSONArray != null) {
                    m3881a(context, jSONArray);
                }
                C0785m.m3891b(context);
            }
        } catch (Throwable th) {
            C0732b.m3725h("RecordManager", "upload e:" + th);
        }
    }

    /* renamed from: a */
    public final void m3885a(View view, long j) {
        try {
            if (C0789q.m3898b()) {
                C0728a m3795b = C0758g.m3795b(view);
                HashMap hashMap = new HashMap();
                for (Map.Entry<C0783k, Long> entry : this.f3444c.entrySet()) {
                    Long value = entry.getValue();
                    if (value != null && value.longValue() > 0) {
                        C0783k key = entry.getKey();
                        if (key.f3438a.startsWith(m3795b.m3697a()) && key.f3440c != null && key.f3440c.startsWith(m3795b.m3698b())) {
                            List<C0774b> m3860a = C0776d.m3860a(key.f3438a, key.f3440c, key.f3441d);
                            if (m3860a != null && !m3860a.isEmpty()) {
                                C0732b.m3718b("RecordManager", "onBrowseEvent hide, path=" + key.f3438a);
                                String valueOf = String.valueOf(key.hashCode());
                                JSONArray m3879a = m3879a(C0785m.m3888a(valueOf));
                                m3880a(m3879a, key, value.longValue(), j);
                                C0785m.m3890a(valueOf, m3879a.toString());
                            }
                        } else {
                            hashMap.put(key, value);
                        }
                    }
                }
                this.f3444c = hashMap;
                m3883b();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m3886a(View view, long j, boolean z) {
        C0783k m3877a;
        try {
            if (C0789q.m3898b() && (m3877a = m3877a(C0758g.m3795b(view))) != null) {
                m3882a(m3877a, j, z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m3887a(C0728a c0728a, long j) {
        try {
            C0783k m3877a = m3877a(c0728a);
            if (m3877a == null) {
                return;
            }
            m3882a(m3877a, j, false);
        } catch (Throwable unused) {
        }
    }
}
