package p031c.p032a.p072p.p073a.p075b;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p072p.p073a.C0727d;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;

/* renamed from: c.a.p.a.b.h */
/* loaded from: classes.dex */
public abstract class AbstractC0716h implements Serializable {

    /* renamed from: a */
    protected Map<String, String> f3248a;

    /* renamed from: b */
    @InterfaceC0715g("type")
    protected String f3249b;

    /* renamed from: c */
    @InterfaceC0715g("itime")
    protected long f3250c;

    public AbstractC0716h() {
        this.f3249b = "custom_counting";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0716h(String str) {
        this.f3249b = str;
    }

    /* renamed from: a */
    public AbstractC0716h m3638a(long j) {
        this.f3250c = j;
        return this;
    }

    /* renamed from: a */
    public AbstractC0716h m3639a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C0732b.m3724g("Event", "invalide key:" + str);
            return this;
        }
        if (this.f3248a == null) {
            this.f3248a = new HashMap();
        }
        this.f3248a.put(str, str2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m3640a(String str, String str2, boolean z) {
        return m3641a(str, str2, z, false);
    }

    /* renamed from: a */
    protected boolean m3641a(String str, String str2, boolean z, boolean z2) {
        if (z && C0766h.m3815a(str)) {
            C0732b.m3724g("Event", "Parameter invalid, some value must be not null");
            return false;
        }
        if (str == null || str.getBytes().length <= 256) {
            return true;
        }
        C0732b.m3724g("Event", z2 ? "Parameter invalid, extra key or value size must be less than 256 bytes" : "Parameter invalid, string value size must be less than 256 bytes");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m3642b(String str, String str2) {
        if (C0727d.f3300a) {
            C0732b.m3724g(str, "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recorded");
        }
    }

    /* renamed from: b */
    public boolean mo3637b() {
        String key;
        String value;
        Map<String, String> map = this.f3248a;
        if (map != null && map.size() > 10) {
            C0732b.m3726i("Event", "This event will not record, since you have more than 10 pairs of custom key/value");
            return false;
        }
        C0732b.m3720c("Event", "You can only have 10 pairs of key/value at most if you are using custom key/value");
        Map<String, String> map2 = this.f3248a;
        if (map2 == null) {
            return true;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            try {
                key = entry.getKey();
                value = entry.getValue();
            } catch (Exception e2) {
                C0732b.m3719b("Event", "There was an error add extra map", e2);
            }
            if (m3641a(key, "extra " + key, false, true)) {
                if (m3641a(value, "extra " + key + " with value", false, true)) {
                    continue;
                }
            }
            this.f3248a.remove(key);
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public Map<String, String> m3643c() {
        return this.f3248a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC0716h abstractC0716h = (AbstractC0716h) obj;
            Map<String, String> map = this.f3248a;
            if (map == null ? abstractC0716h.f3248a != null : !map.equals(abstractC0716h.f3248a)) {
                return false;
            }
            String str = this.f3249b;
            if (str != null) {
                return str.equals(abstractC0716h.f3249b);
            }
            if (abstractC0716h.f3249b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Map<String, String> map = this.f3248a;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.f3249b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return ", type='" + this.f3249b + "', itime=" + this.f3250c + ", extMap='" + this.f3248a + "'";
    }
}
