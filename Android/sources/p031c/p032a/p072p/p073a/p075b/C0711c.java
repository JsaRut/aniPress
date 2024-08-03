package p031c.p032a.p072p.p073a.p075b;

import java.util.Map;

/* renamed from: c.a.p.a.b.c */
/* loaded from: classes.dex */
public class C0711c extends AbstractC0716h {

    /* renamed from: d */
    @InterfaceC0715g("browse_content_id")
    private String f3237d;

    /* renamed from: e */
    @InterfaceC0715g("browse_name")
    private String f3238e;

    /* renamed from: f */
    @InterfaceC0715g("browse_type")
    private String f3239f;

    /* renamed from: g */
    @InterfaceC0715g("browse_duration")
    private float f3240g;

    public C0711c() {
        super("custom_browse");
    }

    public C0711c(String str, String str2, String str3, float f) {
        super("custom_browse");
        this.f3237d = str;
        this.f3238e = str2;
        this.f3239f = str3;
        this.f3240g = f;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    /* renamed from: b */
    public boolean mo3637b() {
        if (!super.mo3637b()) {
            return false;
        }
        Map<String, String> map = this.f3248a;
        if (map != null) {
            if (map.containsKey("browse_content_id")) {
                m3642b("BrowseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedbrowse_content_id");
                this.f3248a.remove("browse_content_id");
            }
            if (this.f3248a.containsKey("browse_type")) {
                m3642b("BrowseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedbrowse_type");
                this.f3248a.remove("browse_type");
            }
            if (this.f3248a.containsKey("browse_duration")) {
                m3642b("BrowseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedbrowse_duration");
                this.f3248a.remove("browse_duration");
            }
            if (this.f3248a.containsKey("browse_name")) {
                m3642b("BrowseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedbrowse_name");
                this.f3248a.remove("browse_name");
            }
        }
        return m3640a(this.f3238e, "browseName", true) && m3640a(this.f3237d, "browseId", false) && m3640a(this.f3239f, "browseType", false);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0711c.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0711c c0711c = (C0711c) obj;
        String str = this.f3237d;
        if (str == null ? c0711c.f3237d != null : !str.equals(c0711c.f3237d)) {
            return false;
        }
        String str2 = this.f3238e;
        if (str2 == null ? c0711c.f3238e != null : !str2.equals(c0711c.f3238e)) {
            return false;
        }
        String str3 = this.f3239f;
        if (str3 == null ? c0711c.f3239f == null : str3.equals(c0711c.f3239f)) {
            return this.f3240g == c0711c.f3240g;
        }
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3237d;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3238e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3239f;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + ((int) this.f3240g);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public String toString() {
        return "BrowseEvent{browseId='" + this.f3237d + "', browseName='" + this.f3238e + "', browseType='" + this.f3239f + "', browseDuration=" + this.f3240g + super.toString() + '}';
    }
}
