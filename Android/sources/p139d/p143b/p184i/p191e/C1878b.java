package p139d.p143b.p184i.p191e;

import android.graphics.Bitmap;
import p139d.p143b.p184i.p194h.InterfaceC1910d;

/* renamed from: d.b.i.e.b */
/* loaded from: classes.dex */
public class C1878b {

    /* renamed from: a */
    private static final C1878b f6846a = m7650b().m7651a();

    /* renamed from: b */
    public final int f6847b;

    /* renamed from: c */
    public final boolean f6848c;

    /* renamed from: d */
    public final boolean f6849d;

    /* renamed from: e */
    public final boolean f6850e;

    /* renamed from: f */
    public final boolean f6851f;

    /* renamed from: g */
    public final Bitmap.Config f6852g;

    /* renamed from: h */
    public final InterfaceC1910d f6853h;

    public C1878b(C1879c c1879c) {
        this.f6847b = c1879c.m7657g();
        this.f6848c = c1879c.m7655e();
        this.f6849d = c1879c.m7658h();
        this.f6850e = c1879c.m7654d();
        this.f6851f = c1879c.m7656f();
        this.f6852g = c1879c.m7652b();
        this.f6853h = c1879c.m7653c();
    }

    /* renamed from: a */
    public static C1878b m7649a() {
        return f6846a;
    }

    /* renamed from: b */
    public static C1879c m7650b() {
        return new C1879c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1878b.class != obj.getClass()) {
            return false;
        }
        C1878b c1878b = (C1878b) obj;
        return this.f6848c == c1878b.f6848c && this.f6849d == c1878b.f6849d && this.f6850e == c1878b.f6850e && this.f6851f == c1878b.f6851f && this.f6852g == c1878b.f6852g && this.f6853h == c1878b.f6853h;
    }

    public int hashCode() {
        int ordinal = ((((((((((this.f6847b * 31) + (this.f6848c ? 1 : 0)) * 31) + (this.f6849d ? 1 : 0)) * 31) + (this.f6850e ? 1 : 0)) * 31) + (this.f6851f ? 1 : 0)) * 31) + this.f6852g.ordinal()) * 31;
        InterfaceC1910d interfaceC1910d = this.f6853h;
        return ordinal + (interfaceC1910d != null ? interfaceC1910d.hashCode() : 0);
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%s-%s", Integer.valueOf(this.f6847b), Boolean.valueOf(this.f6848c), Boolean.valueOf(this.f6849d), Boolean.valueOf(this.f6850e), Boolean.valueOf(this.f6851f), this.f6852g.name(), this.f6853h);
    }
}
