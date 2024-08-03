package p139d.p225c.p226a.p227a.p259k.p267h;

import android.text.Layout;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.k.h.d */
/* loaded from: classes.dex */
public final class C2554d {

    /* renamed from: a */
    private String f10566a;

    /* renamed from: b */
    private String f10567b;

    /* renamed from: c */
    private List<String> f10568c;

    /* renamed from: d */
    private String f10569d;

    /* renamed from: e */
    private String f10570e;

    /* renamed from: f */
    private int f10571f;

    /* renamed from: g */
    private boolean f10572g;

    /* renamed from: h */
    private int f10573h;

    /* renamed from: i */
    private boolean f10574i;

    /* renamed from: j */
    private int f10575j;

    /* renamed from: k */
    private int f10576k;

    /* renamed from: l */
    private int f10577l;

    /* renamed from: m */
    private int f10578m;

    /* renamed from: n */
    private int f10579n;

    /* renamed from: o */
    private float f10580o;

    /* renamed from: p */
    private Layout.Alignment f10581p;

    public C2554d() {
        m10754l();
    }

    /* renamed from: a */
    private static int m10731a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public int m10732a() {
        if (this.f10574i) {
            return this.f10573h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: a */
    public int m10733a(String str, String str2, String[] strArr, String str3) {
        if (this.f10566a.isEmpty() && this.f10567b.isEmpty() && this.f10568c.isEmpty() && this.f10569d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int m10731a = m10731a(m10731a(m10731a(0, this.f10566a, str, 1073741824), this.f10567b, str2, 2), this.f10569d, str3, 4);
        if (m10731a == -1 || !Arrays.asList(strArr).containsAll(this.f10568c)) {
            return 0;
        }
        return m10731a + (this.f10568c.size() * 4);
    }

    /* renamed from: a */
    public C2554d m10734a(int i) {
        this.f10573h = i;
        this.f10574i = true;
        return this;
    }

    /* renamed from: a */
    public C2554d m10735a(String str) {
        this.f10570e = C2622I.m11098j(str);
        return this;
    }

    /* renamed from: a */
    public C2554d m10736a(boolean z) {
        this.f10577l = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public void m10737a(String[] strArr) {
        this.f10568c = Arrays.asList(strArr);
    }

    /* renamed from: b */
    public int m10738b() {
        if (this.f10572g) {
            return this.f10571f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: b */
    public C2554d m10739b(int i) {
        this.f10571f = i;
        this.f10572g = true;
        return this;
    }

    /* renamed from: b */
    public C2554d m10740b(boolean z) {
        this.f10578m = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public void m10741b(String str) {
        this.f10566a = str;
    }

    /* renamed from: c */
    public C2554d m10742c(boolean z) {
        this.f10576k = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public String m10743c() {
        return this.f10570e;
    }

    /* renamed from: c */
    public void m10744c(String str) {
        this.f10567b = str;
    }

    /* renamed from: d */
    public float m10745d() {
        return this.f10580o;
    }

    /* renamed from: d */
    public void m10746d(String str) {
        this.f10569d = str;
    }

    /* renamed from: e */
    public int m10747e() {
        return this.f10579n;
    }

    /* renamed from: f */
    public int m10748f() {
        if (this.f10577l == -1 && this.f10578m == -1) {
            return -1;
        }
        return (this.f10577l == 1 ? 1 : 0) | (this.f10578m == 1 ? 2 : 0);
    }

    /* renamed from: g */
    public Layout.Alignment m10749g() {
        return this.f10581p;
    }

    /* renamed from: h */
    public boolean m10750h() {
        return this.f10574i;
    }

    /* renamed from: i */
    public boolean m10751i() {
        return this.f10572g;
    }

    /* renamed from: j */
    public boolean m10752j() {
        return this.f10575j == 1;
    }

    /* renamed from: k */
    public boolean m10753k() {
        return this.f10576k == 1;
    }

    /* renamed from: l */
    public void m10754l() {
        this.f10566a = "";
        this.f10567b = "";
        this.f10568c = Collections.emptyList();
        this.f10569d = "";
        this.f10570e = null;
        this.f10572g = false;
        this.f10574i = false;
        this.f10575j = -1;
        this.f10576k = -1;
        this.f10577l = -1;
        this.f10578m = -1;
        this.f10579n = -1;
        this.f10581p = null;
    }
}
