package p031c.p032a.p072p.p073a.p075b;

import java.util.Map;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.b.l */
/* loaded from: classes.dex */
public class C0720l extends AbstractC0716h {

    /* renamed from: d */
    @InterfaceC0715g("register_method")
    private String f3264d;

    /* renamed from: e */
    @InterfaceC0715g("register_success")
    private boolean f3265e;

    /* renamed from: f */
    private boolean f3266f;

    public C0720l() {
        super("custom_register");
        this.f3266f = false;
    }

    public C0720l(String str, boolean z) {
        super("custom_register");
        this.f3266f = false;
        this.f3264d = str;
        this.f3265e = z;
        this.f3266f = true;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    /* renamed from: b */
    public boolean mo3637b() {
        if (!super.mo3637b()) {
            return false;
        }
        Map<String, String> map = this.f3248a;
        if (map != null) {
            if (map.containsKey("register_success")) {
                m3642b("RegisterEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedregister_success");
                this.f3248a.remove("register_success");
            }
            if (this.f3248a.containsKey("register_method")) {
                m3642b("RegisterEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedregister_method");
                this.f3248a.remove("register_method");
            }
        }
        if (!m3640a(this.f3264d, "registerMethod", true)) {
            return false;
        }
        if (this.f3266f) {
            return true;
        }
        C0732b.m3724g("RegisterEvent", "invalide RegisterEvent - registerSuccess must set value");
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0720l.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0720l c0720l = (C0720l) obj;
        String str = this.f3264d;
        if (str == null ? c0720l.f3264d == null : str.equals(c0720l.f3264d)) {
            return this.f3265e == c0720l.f3265e;
        }
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3264d;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f3265e ? 1 : 0);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public String toString() {
        return "RegisterEvent{registerSuccess=" + this.f3265e + ", registerMethod='" + this.f3264d + '\'' + super.toString() + '}';
    }
}
