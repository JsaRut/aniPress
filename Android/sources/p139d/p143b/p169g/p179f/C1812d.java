package p139d.p143b.p169g.p179f;

import java.util.Arrays;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.f.d */
/* loaded from: classes.dex */
public class C1812d {

    /* renamed from: a */
    private a f6691a = a.BITMAP_ONLY;

    /* renamed from: b */
    private boolean f6692b = false;

    /* renamed from: c */
    private float[] f6693c = null;

    /* renamed from: d */
    private int f6694d = 0;

    /* renamed from: e */
    private float f6695e = 0.0f;

    /* renamed from: f */
    private int f6696f = 0;

    /* renamed from: g */
    private float f6697g = 0.0f;

    /* renamed from: h */
    private boolean f6698h = false;

    /* renamed from: d.b.g.f.d$a */
    /* loaded from: classes.dex */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public static C1812d m7445a(float f) {
        C1812d c1812d = new C1812d();
        c1812d.m7453b(f);
        return c1812d;
    }

    /* renamed from: i */
    private float[] m7446i() {
        if (this.f6693c == null) {
            this.f6693c = new float[8];
        }
        return this.f6693c;
    }

    /* renamed from: a */
    public int m7447a() {
        return this.f6696f;
    }

    /* renamed from: a */
    public C1812d m7448a(float f, float f2, float f3, float f4) {
        float[] m7446i = m7446i();
        m7446i[1] = f;
        m7446i[0] = f;
        m7446i[3] = f2;
        m7446i[2] = f2;
        m7446i[5] = f3;
        m7446i[4] = f3;
        m7446i[7] = f4;
        m7446i[6] = f4;
        return this;
    }

    /* renamed from: a */
    public C1812d m7449a(int i) {
        this.f6694d = i;
        this.f6691a = a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: a */
    public C1812d m7450a(int i, float f) {
        C1691j.m6975a(f >= 0.0f, "the border width cannot be < 0");
        this.f6695e = f;
        this.f6696f = i;
        return this;
    }

    /* renamed from: a */
    public C1812d m7451a(a aVar) {
        this.f6691a = aVar;
        return this;
    }

    /* renamed from: b */
    public float m7452b() {
        return this.f6695e;
    }

    /* renamed from: b */
    public C1812d m7453b(float f) {
        Arrays.fill(m7446i(), f);
        return this;
    }

    /* renamed from: c */
    public float[] m7454c() {
        return this.f6693c;
    }

    /* renamed from: d */
    public int m7455d() {
        return this.f6694d;
    }

    /* renamed from: e */
    public float m7456e() {
        return this.f6697g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1812d.class != obj.getClass()) {
            return false;
        }
        C1812d c1812d = (C1812d) obj;
        if (this.f6692b == c1812d.f6692b && this.f6694d == c1812d.f6694d && Float.compare(c1812d.f6695e, this.f6695e) == 0 && this.f6696f == c1812d.f6696f && Float.compare(c1812d.f6697g, this.f6697g) == 0 && this.f6691a == c1812d.f6691a && this.f6698h == c1812d.f6698h) {
            return Arrays.equals(this.f6693c, c1812d.f6693c);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m7457f() {
        return this.f6692b;
    }

    /* renamed from: g */
    public a m7458g() {
        return this.f6691a;
    }

    /* renamed from: h */
    public boolean m7459h() {
        return this.f6698h;
    }

    public int hashCode() {
        a aVar = this.f6691a;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f6692b ? 1 : 0)) * 31;
        float[] fArr = this.f6693c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f6694d) * 31;
        float f = this.f6695e;
        int floatToIntBits = (((hashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f6696f) * 31;
        float f2 = this.f6697g;
        return ((floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.f6698h ? 1 : 0);
    }
}
