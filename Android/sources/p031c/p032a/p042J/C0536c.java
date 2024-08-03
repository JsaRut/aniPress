package p031c.p032a.p042J;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.J.c */
/* loaded from: classes.dex */
public class C0536c {

    /* renamed from: a */
    private String f2662a;

    /* renamed from: b */
    private String f2663b;

    /* renamed from: g */
    private int f2668g = -1;

    /* renamed from: d */
    private int f2665d = 0;

    /* renamed from: e */
    private boolean f2666e = false;

    /* renamed from: f */
    private boolean f2667f = false;

    /* renamed from: c */
    private Map<String, Object> f2664c = new HashMap();

    public C0536c(String str) {
        this.f2662a = str;
    }

    /* renamed from: a */
    public String m2795a() {
        return this.f2663b;
    }

    /* renamed from: a */
    public void m2796a(int i) {
        this.f2668g = i;
    }

    /* renamed from: a */
    public void m2797a(String str) {
        this.f2663b = str;
    }

    /* renamed from: a */
    public void m2798a(String str, String str2) {
        Map<String, Object> map = this.f2664c;
        if (map != null) {
            map.put(str, str2);
        }
    }

    /* renamed from: b */
    public int m2799b() {
        return this.f2668g;
    }

    public String toString() {
        return "HttpResponse{responseBody='" + this.f2663b + "', responseCode=" + this.f2668g + '}';
    }
}
