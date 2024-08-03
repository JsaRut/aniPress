package p031c.p032a.p042J;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;

/* renamed from: c.a.J.b */
/* loaded from: classes.dex */
public class C0535b {

    /* renamed from: a */
    private String f2647a;

    /* renamed from: d */
    private Map<String, String> f2650d;

    /* renamed from: f */
    private Object f2652f;

    /* renamed from: g */
    private boolean f2653g;

    /* renamed from: h */
    private boolean f2654h;

    /* renamed from: i */
    private boolean f2655i;

    /* renamed from: m */
    private C0538e f2659m;

    /* renamed from: n */
    private boolean f2660n;

    /* renamed from: o */
    private HostnameVerifier f2661o;

    /* renamed from: j */
    private boolean f2656j = true;

    /* renamed from: k */
    private boolean f2657k = false;

    /* renamed from: l */
    private boolean f2658l = false;

    /* renamed from: b */
    private int f2648b = -1;

    /* renamed from: c */
    private int f2649c = -1;

    /* renamed from: e */
    private Map<String, String> f2651e = new HashMap();

    public C0535b(String str) {
        this.f2647a = str;
    }

    /* renamed from: a */
    public int m2773a() {
        return this.f2648b;
    }

    /* renamed from: a */
    public void m2774a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout can not be negative");
        }
        this.f2648b = i;
    }

    /* renamed from: a */
    public void m2775a(C0538e c0538e) {
        this.f2659m = c0538e;
    }

    /* renamed from: a */
    public void m2776a(Object obj) {
        this.f2652f = obj;
    }

    /* renamed from: a */
    public void m2777a(String str, String str2) {
        this.f2651e.put(str, str2);
    }

    /* renamed from: a */
    public void m2778a(boolean z) {
        this.f2654h = z;
    }

    /* renamed from: b */
    public HostnameVerifier m2779b() {
        return this.f2661o;
    }

    /* renamed from: b */
    public void m2780b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("timeout can not be negative");
        }
        this.f2649c = i;
    }

    /* renamed from: b */
    public void m2781b(boolean z) {
        this.f2653g = z;
    }

    /* renamed from: c */
    public void m2782c(boolean z) {
        this.f2656j = z;
    }

    /* renamed from: c */
    public byte[] m2783c() {
        Object obj = this.f2652f;
        if (obj != null) {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((CharSequence) obj)) {
                    return ((String) this.f2652f).getBytes();
                }
            } else if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
        }
        String m2803a = C0537d.m2803a(this.f2650d);
        if (TextUtils.isEmpty(m2803a)) {
            return null;
        }
        return m2803a.getBytes();
    }

    /* renamed from: d */
    public int m2784d() {
        return this.f2649c;
    }

    /* renamed from: d */
    public void m2785d(boolean z) {
        this.f2658l = z;
    }

    /* renamed from: e */
    public Map<String, String> m2786e() {
        return this.f2651e;
    }

    /* renamed from: e */
    public void m2787e(boolean z) {
        this.f2660n = z;
    }

    /* renamed from: f */
    public C0538e m2788f() {
        return this.f2659m;
    }

    /* renamed from: f */
    public void m2789f(boolean z) {
        this.f2657k = z;
    }

    /* renamed from: g */
    public String m2790g() {
        return this.f2647a;
    }

    /* renamed from: g */
    public void m2791g(boolean z) {
        this.f2655i = z;
    }

    /* renamed from: h */
    public boolean m2792h() {
        return this.f2656j;
    }

    /* renamed from: i */
    public boolean m2793i() {
        return this.f2658l;
    }

    /* renamed from: j */
    public boolean m2794j() {
        return this.f2657k;
    }
}
