package p031c.p032a.p072p.p073a.p075b;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p084d.AbstractC0747d;
import p031c.p032a.p072p.p073a.p080f.p084d.C0745b;
import p031c.p032a.p072p.p073a.p080f.p084d.C0748e;
import p031c.p032a.p072p.p073a.p080f.p084d.C0749f;
import p031c.p032a.p072p.p073a.p080f.p084d.C0750g;
import p031c.p032a.p072p.p073a.p080f.p084d.C0751h;

/* renamed from: c.a.p.a.b.a */
/* loaded from: classes.dex */
public class C0708a {

    /* renamed from: a */
    private static final Map<String, AbstractC0747d> f3231a = new HashMap();

    /* renamed from: b */
    private final String f3232b;

    /* renamed from: c */
    private Map<String, Serializable> f3233c = new HashMap();

    /* renamed from: d */
    private Map<String, Serializable> f3234d = new HashMap();

    /* renamed from: e */
    private Set<String> f3235e = new HashSet();

    /* renamed from: f */
    private Set<String> f3236f = new HashSet();

    static {
        C0750g c0750g = new C0750g(0, 2);
        f3231a.put("$sex", c0750g);
        f3231a.put("$paid", c0750g);
        f3231a.put("$birthdate", new C0748e());
        f3231a.put("$phone", new C0751h());
        f3231a.put("$email", new C0749f());
    }

    public C0708a(String str) {
        this.f3232b = str;
    }

    /* renamed from: b */
    private void m3617b(String str, Serializable serializable) {
        if (TextUtils.isEmpty(str) || !str.startsWith("$")) {
            C0732b.m3725h("Account", "key should be start with$");
        } else if (serializable == null) {
            this.f3235e.add(str);
            this.f3233c.remove(str);
        } else {
            this.f3233c.put(str, serializable);
            this.f3235e.remove(str);
        }
    }

    /* renamed from: a */
    public C0745b m3618a(JSONObject jSONObject) {
        String str = this.f3232b;
        if (str != null && str.length() > 255) {
            return new C0745b(1004, "account_id should be no more than 255 characters");
        }
        StringBuilder sb = new StringBuilder();
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Serializable> entry : this.f3233c.entrySet()) {
                AbstractC0747d abstractC0747d = f3231a.get(entry.getKey());
                if (abstractC0747d != null && !abstractC0747d.mo3773a(entry.getValue())) {
                    sb.append(" | the value of ");
                    sb.append(entry.getKey());
                    sb.append(" ");
                    sb.append(abstractC0747d.m3772a());
                }
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, Serializable> entry2 : this.f3234d.entrySet()) {
                Serializable value = entry2.getValue();
                if (!(value instanceof String) && !(value instanceof Number)) {
                    sb.append(" | the value of ");
                    sb.append(entry2.getKey());
                    sb.append(" should be String or Number");
                }
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            for (String str2 : this.f3236f) {
                sb.append(" | the key={");
                sb.append(str2);
                sb.append("} in extra is invalid");
            }
            jSONObject2.put("extra", jSONObject3);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.f3235e.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("set_attr", jSONObject2);
            jSONObject.put("remove_attr", jSONArray);
            jSONObject.put("account_id", this.f3232b);
        } catch (Exception e2) {
            C0732b.m3723f("Account", "Account to Json exception:" + e2.toString());
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return new C0745b(1101, sb.toString());
    }

    /* renamed from: a */
    public String m3619a() {
        return this.f3232b;
    }

    /* renamed from: a */
    public void m3620a(Integer num) {
        m3617b("$paid", num);
    }

    /* renamed from: a */
    public void m3621a(Long l) {
        m3617b("$creation_time", l);
    }

    /* renamed from: a */
    public void m3622a(String str) {
        m3617b("$birthdate", str);
    }

    /* renamed from: a */
    public void m3623a(String str, Serializable serializable) {
        if (TextUtils.isEmpty(str)) {
            C0732b.m3724g("Account", "key is empty, do nothing");
            return;
        }
        if (str.startsWith("$")) {
            this.f3236f.add(str);
        } else if (serializable == null) {
            this.f3235e.add(str);
            this.f3234d.remove(str);
        } else {
            this.f3234d.put(str, serializable);
            this.f3235e.remove(str);
        }
    }

    /* renamed from: b */
    public void m3624b(Integer num) {
        m3617b("$sex", num);
    }

    /* renamed from: b */
    public void m3625b(String str) {
        m3617b("$email", str);
    }

    /* renamed from: c */
    public void m3626c(String str) {
        m3617b("$name", str);
    }

    /* renamed from: d */
    public void m3627d(String str) {
        m3617b("$phone", str);
    }

    /* renamed from: e */
    public void m3628e(String str) {
        m3617b("$qq_id", str);
    }

    /* renamed from: f */
    public void m3629f(String str) {
        m3617b("$wechat_id", str);
    }

    /* renamed from: g */
    public void m3630g(String str) {
        m3617b("$weibo_id", str);
    }
}
