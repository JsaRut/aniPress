package p031c.p032a.p072p.p073a.p088g;

import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.a.p.a.g.j */
/* loaded from: classes.dex */
public final class C0782j {

    /* renamed from: a */
    final C0783k f3435a;

    /* renamed from: b */
    private LinkedList<Long> f3436b = new LinkedList<>();

    /* renamed from: c */
    private LinkedList<Pair<Long, Long>> f3437c = new LinkedList<>();

    public C0782j(C0783k c0783k) {
        this.f3435a = c0783k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0782j m3871a(JSONObject jSONObject) {
        try {
            C0783k m3875a = C0783k.m3875a(jSONObject);
            if (m3875a == null) {
                return null;
            }
            C0782j c0782j = new C0782j(m3875a);
            JSONArray optJSONArray = jSONObject.optJSONArray("browse");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    c0782j.f3437c.add(new Pair<>(Long.valueOf(jSONObject2.getLong("show")), Long.valueOf(jSONObject2.getLong("hide"))));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("click");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    c0782j.f3436b.add(Long.valueOf(optJSONArray2.getJSONObject(i2).getLong("time")));
                }
            }
            return c0782j;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject m3872a() {
        try {
            JSONObject m3876a = this.f3435a.m3876a();
            if (m3876a == null) {
                return null;
            }
            try {
                if (this.f3437c.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<Pair<Long, Long>> it = this.f3437c.iterator();
                    while (it.hasNext()) {
                        Pair<Long, Long> next = it.next();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("show", next.first);
                        jSONObject.put("hide", next.second);
                        jSONArray.put(jSONObject);
                    }
                    m3876a.put("browse", jSONArray);
                }
                if (this.f3436b.size() <= 0) {
                    return m3876a;
                }
                JSONArray jSONArray2 = new JSONArray();
                Iterator<Long> it2 = this.f3436b.iterator();
                while (it2.hasNext()) {
                    Long next2 = it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("time", next2);
                    jSONArray2.put(jSONObject2);
                }
                m3876a.put("click", jSONArray2);
                return m3876a;
            } catch (JSONException unused) {
                return m3876a;
            }
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3873a(long j) {
        this.f3436b.add(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3874a(long j, long j2) {
        this.f3437c.add(new Pair<>(Long.valueOf(j), Long.valueOf(j2)));
    }
}
