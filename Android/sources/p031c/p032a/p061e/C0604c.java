package p031c.p032a.p061e;

import android.text.TextUtils;
import java.io.File;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p096v.C0849e;
import p031c.p032a.p096v.C0852h;

/* renamed from: c.a.e.c */
/* loaded from: classes.dex */
public final class C0604c {

    /* renamed from: a */
    private File f2862a;

    /* renamed from: b */
    private JSONObject f2863b;

    /* renamed from: c */
    public long f2864c;

    /* renamed from: d */
    public JSONObject f2865d;

    /* renamed from: e */
    private boolean f2866e;

    /* renamed from: f */
    private boolean f2867f;

    private C0604c(File file, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        this.f2862a = file;
        this.f2863b = jSONObject;
        this.f2865d = jSONObject2;
        this.f2864c = file.length();
        this.f2867f = z;
        this.f2866e = z;
    }

    /* renamed from: a */
    public static C0604c m3091a(File file, Set<String> set) {
        JSONObject m3093a = m3093a(file);
        if (m3093a != null) {
            return new C0604c(file, m3093a, C0852h.m4146a(m3093a, set), false);
        }
        C0849e.m4135a(file);
        return null;
    }

    /* renamed from: a */
    public static C0604c m3092a(File file, JSONObject jSONObject) {
        JSONObject m3093a = m3093a(file);
        if (m3093a != null) {
            return new C0604c(file, m3093a, jSONObject, true);
        }
        C0849e.m4135a(file);
        return null;
    }

    /* renamed from: a */
    public static JSONObject m3093a(File file) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        try {
            String m4140b = C0849e.m4140b(file);
            if (TextUtils.isEmpty(m4140b) || (optJSONArray = (jSONObject = new JSONObject(m4140b)).optJSONArray("content")) == null) {
                return null;
            }
            if (optJSONArray.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m3094a(C0604c c0604c, File file) {
        boolean z = true;
        if (c0604c != null) {
            try {
                if (this.f2864c + c0604c.f2864c <= 40960) {
                    JSONArray jSONArray = this.f2863b.getJSONArray("content");
                    JSONArray jSONArray2 = c0604c.f2863b.getJSONArray("content");
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        jSONArray.put(jSONArray2.getJSONObject(i));
                    }
                    this.f2864c += c0604c.f2864c;
                    this.f2866e = true;
                    C0849e.m4135a(c0604c.f2862a);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, this.f2862a.getName());
        if (this.f2867f) {
            C0852h.m4147a(this.f2863b, this.f2865d);
        }
        if (this.f2862a.equals(file2)) {
            z = false;
        }
        if (this.f2866e || z) {
            C0849e.m4136a(file2, this.f2863b.toString());
        }
        if (z) {
            C0849e.m4135a(this.f2862a);
        }
        return false;
    }
}
