package p031c.p032a.p046N;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p031c.p032a.p045M.C0544b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.N.e */
/* loaded from: classes.dex */
public final class C0549e {
    /* renamed from: a */
    private static C0544b m2858a(String str, int i, List<C0544b> list) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            for (C0544b c0544b : list) {
                if (m2860a(str, i, c0544b)) {
                    return c0544b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<C0544b> m2859a(Context context) {
        C0544b c0544b;
        C0544b m2858a;
        if (C0557c.m2903a(context, false, "need get getDefaultApiSimInfo")) {
            c0544b = null;
        } else {
            c0544b = new C0544b();
            c0544b.f2684b = C0812a.m3946c(context, "");
            c0544b.f2685c = C0547c.m2843b(context, "");
            c0544b.f2683a = C0812a.m3943b(context, "");
        }
        ArrayList<C0544b> m2863a = C0550f.m2863a(context);
        ArrayList<C0544b> m2842a = C0547c.m2842a(context);
        if (m2863a != null && !m2863a.isEmpty()) {
            for (int size = m2863a.size() - 1; size >= 0; size--) {
                if (m2863a.get(size).m2823b()) {
                    m2863a.remove(size);
                }
            }
        }
        if (m2863a != null && !m2863a.isEmpty()) {
            for (C0544b c0544b2 : m2863a) {
                if (TextUtils.isEmpty(c0544b2.f2683a) && !TextUtils.isEmpty(c0544b2.f2684b)) {
                    C0544b m2858a2 = m2858a(c0544b2.f2684b, 1, m2842a);
                    if (m2858a2 != null) {
                        c0544b2.f2683a = m2858a2.f2683a;
                    }
                } else if (TextUtils.isEmpty(c0544b2.f2684b) && !TextUtils.isEmpty(c0544b2.f2683a) && (m2858a = m2858a(c0544b2.f2683a, 1, m2842a)) != null) {
                    c0544b2.f2684b = m2858a.f2684b;
                    c0544b2.f2685c = m2858a.f2685c;
                }
            }
            return m2863a;
        }
        if (c0544b == null || c0544b.m2823b()) {
            return m2842a;
        }
        if (m2842a != null && m2842a.size() == 1) {
            if (TextUtils.isEmpty(c0544b.f2683a) || !c0544b.f2683a.equals(m2842a.get(0).f2683a)) {
                if (!TextUtils.isEmpty(c0544b.f2684b) && c0544b.f2684b.equals(m2842a.get(0).f2684b)) {
                    c0544b.f2684b = "";
                    c0544b.f2685c = "";
                    if (c0544b.m2823b()) {
                        return m2842a;
                    }
                }
            } else if (TextUtils.isEmpty(c0544b.f2684b) || c0544b.f2684b.equals(m2842a.get(0).f2684b)) {
                return m2842a;
            }
            m2842a.add(c0544b);
            return m2842a;
        }
        C0544b m2858a3 = m2858a(c0544b.f2683a, 0, m2842a);
        if (m2858a3 == null || !TextUtils.isEmpty(m2858a3.f2684b) || m2858a(c0544b.f2684b, 1, m2842a) != null) {
            return m2842a;
        }
        String str = c0544b.f2683a;
        if (m2842a == null || m2842a.isEmpty() || TextUtils.isEmpty(str) || c0544b == null) {
            return null;
        }
        for (C0544b c0544b3 : m2842a) {
            if (m2860a(str, 0, c0544b3)) {
                c0544b3.f2684b = c0544b.f2684b;
                c0544b3.f2685c = c0544b.f2685c;
                return m2842a;
            }
        }
        return m2842a;
    }

    /* renamed from: a */
    private static boolean m2860a(String str, int i, C0544b c0544b) {
        return i != 0 ? i != 1 ? i == 2 && str.equals(c0544b.f2685c) : str.equals(c0544b.f2684b) : str.equals(c0544b.f2683a);
    }
}
