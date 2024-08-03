package p031c.p032a.p072p.p073a.p075b;

import java.util.Map;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.b.d */
/* loaded from: classes.dex */
public class C0712d extends AbstractC0716h {

    /* renamed from: d */
    @InterfaceC0715g("event_id")
    private String f3241d;

    /* renamed from: e */
    @InterfaceC0715g("event_value")
    private double f3242e;

    /* renamed from: f */
    private boolean f3243f;

    public C0712d() {
        super("custom_calculate");
        this.f3243f = false;
    }

    public C0712d(String str, double d2) {
        super("custom_calculate");
        this.f3243f = false;
        this.f3241d = str;
        this.f3242e = d2;
        this.f3243f = true;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    /* renamed from: b */
    public boolean mo3637b() {
        if (!super.mo3637b()) {
            return false;
        }
        Map<String, String> map = this.f3248a;
        if (map != null) {
            if (map.containsKey("event_id")) {
                m3642b("CalculateEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedevent_id");
                this.f3248a.remove("event_id");
            }
            if (this.f3248a.containsKey("event_value")) {
                m3642b("CalculateEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedevent_value");
                this.f3248a.remove("event_value");
            }
        }
        if (!m3640a(this.f3241d, "eventId", true)) {
            return false;
        }
        if (this.f3243f) {
            return true;
        }
        C0732b.m3724g("CalculateEvent", "invalide CalculateEvent - eventValue must set value");
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0712d.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0712d c0712d = (C0712d) obj;
        String str = this.f3241d;
        return str == null ? c0712d.f3241d == null : str.equals(c0712d.f3241d);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3241d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public String toString() {
        return "CalculateEvent{eventId='" + this.f3241d + "', eventValue=" + this.f3242e + super.toString() + '}';
    }
}
