package p031c.p032a.p072p.p073a.p080f.p083c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.p.a.f.c.c */
/* loaded from: classes.dex */
public final class C0738c {

    /* renamed from: a */
    private String f3330a;

    /* renamed from: b */
    private String f3331b;

    /* renamed from: g */
    private int f3336g = -1;

    /* renamed from: d */
    private int f3333d = 0;

    /* renamed from: e */
    private boolean f3334e = false;

    /* renamed from: f */
    private boolean f3335f = false;

    /* renamed from: c */
    private Map<String, Object> f3332c = new HashMap();

    public C0738c(String str) {
        this.f3330a = str;
    }

    /* renamed from: a */
    public final String m3751a() {
        return this.f3331b;
    }

    /* renamed from: a */
    public final void m3752a(int i) {
        this.f3336g = i;
    }

    /* renamed from: a */
    public final void m3753a(String str) {
        this.f3331b = str;
    }

    /* renamed from: a */
    public final void m3754a(String str, String str2) {
        Map<String, Object> map = this.f3332c;
        if (map != null) {
            map.put(str, str2);
        }
    }

    /* renamed from: b */
    public final int m3755b() {
        return this.f3336g;
    }

    public final String toString() {
        return "HttpResponse{responseBody='" + this.f3331b + "', responseCode=" + this.f3336g + '}';
    }
}
