package p031c.p032a.p072p.p073a.p088g;

import android.util.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p074a.C0693c;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p083c.C0739d;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.g.a */
/* loaded from: classes.dex */
public final class C0773a {
    /* renamed from: a */
    public static String m3847a() {
        try {
            String m4048a = C0830f.m4048a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appKey", m4048a);
            jSONObject.put("platform", "a");
            String m3567a = C0693c.m3567a("fetch_bury");
            C0739d c0739d = new C0739d(m3567a);
            C0732b.m3718b("BuryHttpHelper", "http url=" + m3567a);
            Pair<Integer, String> m3756a = c0739d.m3756a(jSONObject.toString(), m4048a, false);
            if (((Integer) m3756a.first).intValue() == 2000) {
                return (String) m3756a.second;
            }
            C0732b.m3723f("BuryHttpHelper", "http url=" + m3567a + " ,response:" + m3756a.first + " " + ((String) m3756a.second));
            return null;
        } catch (JSONException e2) {
            C0732b.m3723f("BuryHttpHelper", "fetchBury e:" + e2);
            return null;
        }
    }
}
