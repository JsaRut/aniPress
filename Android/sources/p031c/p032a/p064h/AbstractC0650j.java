package p031c.p032a.p064h;

import java.io.IOException;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: c.a.h.j */
/* loaded from: classes.dex */
public abstract class AbstractC0650j implements Serializable, Cloneable, Comparable {

    /* renamed from: a */
    private static final DecimalFormat f3031a;

    /* renamed from: b */
    protected C0648h f3032b;

    /* renamed from: c */
    protected int f3033c;

    /* renamed from: d */
    protected int f3034d;

    /* renamed from: e */
    protected long f3035e;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        f3031a = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0650j m3332a(C0643c c0643c, int i) {
        C0648h c0648h = new C0648h(c0643c);
        int m3279g = c0643c.m3279g();
        int m3279g2 = c0643c.m3279g();
        if (i == 0) {
            return m3333a(c0648h, m3279g, m3279g2);
        }
        long m3280h = c0643c.m3280h();
        int m3279g3 = c0643c.m3279g();
        AbstractC0650j m3334a = m3334a(c0648h, m3279g, m3279g2, m3280h);
        if (c0643c != null) {
            if (c0643c.m3273b() < m3279g3) {
                throw new IOException("truncated record");
            }
            c0643c.m3271a(m3279g3);
            m3334a.mo3338a(c0643c);
            if (c0643c.m3273b() > 0) {
                throw new IOException("invalid record length");
            }
            c0643c.m3275c();
        }
        return m3334a;
    }

    /* renamed from: a */
    public static AbstractC0650j m3333a(C0648h c0648h, int i, int i2) {
        if (c0648h.m3324a()) {
            return m3334a(c0648h, i, i2, 0L);
        }
        throw new C0651k(c0648h);
    }

    /* renamed from: a */
    private static final AbstractC0650j m3334a(C0648h c0648h, int i, int i2, long j) {
        C0655o c0655o = new C0655o();
        c0655o.f3032b = c0648h;
        c0655o.f3033c = i;
        c0655o.f3034d = i2;
        c0655o.f3035e = j;
        return c0655o;
    }

    /* renamed from: h */
    private byte[] m3335h() {
        C0644d c0644d = new C0644d();
        mo3340a(c0644d, true);
        return c0644d.m3290b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo3336a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3337a(long j) {
        this.f3035e = j;
    }

    /* renamed from: a */
    abstract void mo3338a(C0643c c0643c);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3339a(C0644d c0644d, C0641a c0641a) {
        this.f3032b.m3322a(c0644d, c0641a);
        c0644d.m3291c(this.f3033c);
        c0644d.m3291c(this.f3034d);
    }

    /* renamed from: a */
    abstract void mo3340a(C0644d c0644d, boolean z);

    /* renamed from: a */
    public final boolean m3341a(AbstractC0650j abstractC0650j) {
        return this.f3033c == abstractC0650j.f3033c && this.f3034d == abstractC0650j.f3034d && this.f3032b.equals(abstractC0650j.f3032b);
    }

    /* renamed from: b */
    public final C0648h m3342b() {
        return this.f3032b;
    }

    /* renamed from: c */
    public final int m3343c() {
        return this.f3033c;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        AbstractC0650j abstractC0650j = (AbstractC0650j) obj;
        if (this == abstractC0650j) {
            return 0;
        }
        int compareTo = this.f3032b.compareTo(abstractC0650j.f3032b);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = this.f3034d - abstractC0650j.f3034d;
        if (i != 0) {
            return i;
        }
        int i2 = this.f3033c - abstractC0650j.f3033c;
        if (i2 != 0) {
            return i2;
        }
        byte[] m3335h = m3335h();
        byte[] m3335h2 = abstractC0650j.m3335h();
        for (int i3 = 0; i3 < m3335h.length && i3 < m3335h2.length; i3++) {
            int i4 = (m3335h[i3] & 255) - (m3335h2[i3] & 255);
            if (i4 != 0) {
                return i4;
            }
        }
        return m3335h.length - m3335h2.length;
    }

    /* renamed from: d */
    public final int m3344d() {
        return this.f3033c;
    }

    /* renamed from: e */
    public final int m3345e() {
        return this.f3034d;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AbstractC0650j)) {
            AbstractC0650j abstractC0650j = (AbstractC0650j) obj;
            if (this.f3033c == abstractC0650j.f3033c && this.f3034d == abstractC0650j.f3034d && this.f3032b.equals(abstractC0650j.f3032b)) {
                return Arrays.equals(m3335h(), abstractC0650j.m3335h());
            }
        }
        return false;
    }

    /* renamed from: f */
    public final long m3346f() {
        return this.f3035e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final AbstractC0650j m3347g() {
        try {
            return (AbstractC0650j) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    public int hashCode() {
        C0644d c0644d = new C0644d();
        this.f3032b.m3321a(c0644d);
        c0644d.m3291c(this.f3033c);
        c0644d.m3291c(this.f3034d);
        c0644d.m3286a(0L);
        int m3283a = c0644d.m3283a();
        c0644d.m3291c(0);
        mo3340a(c0644d, true);
        c0644d.m3285a((c0644d.m3283a() - m3283a) - 2, m3283a);
        int i = 0;
        for (byte b2 : c0644d.m3290b()) {
            i += (i << 3) + (b2 & 255);
        }
        return i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f3032b);
        if (stringBuffer.length() < 8) {
            stringBuffer.append("\t");
        }
        if (stringBuffer.length() < 16) {
            stringBuffer.append("\t");
        }
        stringBuffer.append("\t");
        String mo3336a = mo3336a();
        if (!mo3336a.equals("")) {
            stringBuffer.append("\t");
            stringBuffer.append(mo3336a);
        }
        return stringBuffer.toString();
    }
}
