package p031c.p101b.p102a.p104b;

import java.io.Serializable;
import java.util.Set;

/* renamed from: c.b.a.b.g */
/* loaded from: classes.dex */
public class C0884g implements Serializable {

    /* renamed from: a */
    private String f3745a;

    /* renamed from: b */
    private Set<String> f3746b;

    /* renamed from: c */
    private String f3747c;

    /* renamed from: d */
    private int f3748d;

    /* renamed from: e */
    private boolean f3749e;

    /* renamed from: f */
    private boolean f3750f;

    /* renamed from: g */
    private int f3751g;

    /* renamed from: h */
    private String f3752h;

    /* renamed from: a */
    public void m4351a(int i) {
        this.f3748d = i;
    }

    /* renamed from: a */
    public void m4352a(String str) {
        this.f3745a = str;
    }

    /* renamed from: a */
    public void m4353a(Set<String> set) {
        this.f3746b = set;
    }

    /* renamed from: a */
    public void m4354a(boolean z) {
        this.f3750f = z;
    }

    /* renamed from: b */
    public String m4355b() {
        return this.f3745a;
    }

    /* renamed from: b */
    public void m4356b(int i) {
        this.f3751g = i;
    }

    /* renamed from: b */
    public void m4357b(String str) {
        this.f3747c = str;
    }

    /* renamed from: b */
    public void m4358b(boolean z) {
        this.f3749e = z;
    }

    /* renamed from: c */
    public String m4359c() {
        return this.f3747c;
    }

    /* renamed from: c */
    public void m4360c(String str) {
        this.f3752h = str;
    }

    /* renamed from: d */
    public int m4361d() {
        return this.f3748d;
    }

    /* renamed from: e */
    public int m4362e() {
        return this.f3751g;
    }

    /* renamed from: f */
    public boolean m4363f() {
        return this.f3749e;
    }

    /* renamed from: g */
    public Set<String> m4364g() {
        return this.f3746b;
    }

    /* renamed from: h */
    public boolean m4365h() {
        return this.f3750f;
    }

    public String toString() {
        return "JPushMessage{alias='" + this.f3745a + "', tags=" + this.f3746b + ", checkTag='" + this.f3747c + "', errorCode=" + this.f3748d + ", tagCheckStateResult=" + this.f3749e + ", isTagCheckOperator=" + this.f3750f + ", sequence=" + this.f3751g + ", mobileNumber=" + this.f3752h + '}';
    }
}
