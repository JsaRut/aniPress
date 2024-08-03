package p031c.p032a.p072p.p073a.p075b;

import java.util.Map;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.b.j */
/* loaded from: classes.dex */
public class C0718j extends AbstractC0716h {

    /* renamed from: d */
    @InterfaceC0715g("login_method")
    private String f3252d;

    /* renamed from: e */
    @InterfaceC0715g("login_success")
    private boolean f3253e;

    /* renamed from: f */
    private boolean f3254f;

    public C0718j() {
        super("custom_login");
        this.f3254f = false;
    }

    public C0718j(String str, boolean z) {
        super("custom_login");
        this.f3254f = false;
        this.f3252d = str;
        this.f3253e = z;
        this.f3254f = true;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    /* renamed from: b */
    public boolean mo3637b() {
        if (!super.mo3637b()) {
            return false;
        }
        Map<String, String> map = this.f3248a;
        if (map != null) {
            if (map.containsKey("login_method")) {
                m3642b("LoginEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedlogin_method");
                this.f3248a.remove("login_method");
            }
            if (this.f3248a.containsKey("login_success")) {
                m3642b("LoginEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedlogin_success");
                this.f3248a.remove("login_success");
            }
        }
        if (!m3640a(this.f3252d, "loginMethod", true)) {
            return false;
        }
        if (this.f3254f) {
            return true;
        }
        C0732b.m3720c("LoginEvent", "invalide LoginEvent - loginSuccess must set value");
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0718j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0718j c0718j = (C0718j) obj;
        String str = this.f3252d;
        if (str == null ? c0718j.f3252d == null : str.equals(c0718j.f3252d)) {
            return this.f3253e == c0718j.f3253e;
        }
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3252d;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f3253e ? 1 : 0);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public String toString() {
        return "LoginEvent{loginMethod='" + this.f3252d + "', loginSuccess=" + this.f3253e + super.toString() + '}';
    }
}
