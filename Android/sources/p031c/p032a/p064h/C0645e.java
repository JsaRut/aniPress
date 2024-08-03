package p031c.p032a.p064h;

import java.util.Random;

/* renamed from: c.a.h.e */
/* loaded from: classes.dex */
public final class C0645e implements Cloneable {

    /* renamed from: a */
    private static Random f3001a = new Random();

    /* renamed from: b */
    private int f3002b;

    /* renamed from: c */
    private int f3003c;

    /* renamed from: d */
    private int[] f3004d;

    public C0645e() {
        this.f3003c = 256;
        m3292b();
    }

    private C0645e(int i) {
        this.f3003c = 256;
        m3292b();
        if (i >= 0 && i <= 65535) {
            this.f3002b = i;
            return;
        }
        throw new IllegalArgumentException("DNS message ID " + i + " is out of range");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0645e(C0643c c0643c) {
        this(c0643c.m3279g());
        this.f3003c = c0643c.m3279g();
        int i = 0;
        while (true) {
            int[] iArr = this.f3004d;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = c0643c.m3279g();
            i++;
        }
    }

    /* renamed from: b */
    private void m3292b() {
        this.f3004d = new int[4];
        this.f3003c = 256;
        this.f3002b = -1;
    }

    /* renamed from: c */
    private int m3293c() {
        int i;
        int i2 = this.f3002b;
        if (i2 >= 0) {
            return i2;
        }
        synchronized (this) {
            if (this.f3002b < 0) {
                this.f3002b = f3001a.nextInt(65535);
            }
            i = this.f3002b;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m3294a() {
        return this.f3003c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3295a(int i) {
        int[] iArr = this.f3004d;
        if (iArr[i] == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3296a(C0644d c0644d) {
        c0644d.m3291c(m3293c());
        c0644d.m3291c(this.f3003c);
        int i = 0;
        while (true) {
            int[] iArr = this.f3004d;
            if (i >= iArr.length) {
                return;
            }
            c0644d.m3291c(iArr[i]);
            i++;
        }
    }

    /* renamed from: b */
    public final int m3297b(int i) {
        return this.f3004d[i];
    }

    public final Object clone() {
        C0645e c0645e = new C0645e();
        c0645e.f3002b = this.f3002b;
        c0645e.f3003c = this.f3003c;
        int[] iArr = this.f3004d;
        System.arraycopy(iArr, 0, c0645e.f3004d, 0, iArr.length);
        return c0645e;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(";; ->>HEADER<<- ");
        stringBuffer.append(", id: " + m3293c());
        stringBuffer.append("\n");
        stringBuffer.append("; ");
        for (int i = 0; i < 4; i++) {
            stringBuffer.append(C0656p.m3364a(i) + ": " + this.f3004d[i] + " ");
        }
        return stringBuffer.toString();
    }
}
