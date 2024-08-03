package p031c.p032a.p072p.p073a.p075b;

import java.util.Map;

/* renamed from: c.a.p.a.b.e */
/* loaded from: classes.dex */
public class C0713e extends AbstractC0716h {

    /* renamed from: d */
    @InterfaceC0715g("event_id")
    private String f3244d;

    public C0713e() {
        super("custom_counting");
    }

    public C0713e(String str) {
        super("custom_counting");
        this.f3244d = str;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    /* renamed from: b */
    public boolean mo3637b() {
        if (!super.mo3637b()) {
            return false;
        }
        Map<String, String> map = this.f3248a;
        if (map != null && map.containsKey("event_id")) {
            m3642b("CountEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedevent_id");
            this.f3248a.remove("event_id");
        }
        return m3640a(this.f3244d, "eventId", true);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0713e.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0713e c0713e = (C0713e) obj;
        String str = this.f3244d;
        return str == null ? c0713e.f3244d == null : str.equals(c0713e.f3244d);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3244d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public String toString() {
        return "CountEvent{eventId='" + this.f3244d + '\'' + super.toString() + '}';
    }
}
