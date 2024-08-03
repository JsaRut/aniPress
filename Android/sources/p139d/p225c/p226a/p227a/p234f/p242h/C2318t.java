package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.h.t */
/* loaded from: classes.dex */
final class C2318t {

    /* renamed from: a */
    private final int f9083a;

    /* renamed from: b */
    private boolean f9084b;

    /* renamed from: c */
    private boolean f9085c;

    /* renamed from: d */
    public byte[] f9086d;

    /* renamed from: e */
    public int f9087e;

    public C2318t(int i, int i2) {
        this.f9083a = i;
        this.f9086d = new byte[i2 + 3];
        this.f9086d[2] = 1;
    }

    /* renamed from: a */
    public void m9639a(byte[] bArr, int i, int i2) {
        if (this.f9084b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f9086d;
            int length = bArr2.length;
            int i4 = this.f9087e;
            if (length < i4 + i3) {
                this.f9086d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f9086d, this.f9087e, i3);
            this.f9087e += i3;
        }
    }

    /* renamed from: a */
    public boolean m9640a() {
        return this.f9085c;
    }

    /* renamed from: a */
    public boolean m9641a(int i) {
        if (!this.f9084b) {
            return false;
        }
        this.f9087e -= i;
        this.f9084b = false;
        this.f9085c = true;
        return true;
    }

    /* renamed from: b */
    public void m9642b() {
        this.f9084b = false;
        this.f9085c = false;
    }

    /* renamed from: b */
    public void m9643b(int i) {
        C2628e.m11113b(!this.f9084b);
        this.f9084b = i == this.f9083a;
        if (this.f9084b) {
            this.f9087e = 3;
            this.f9085c = false;
        }
    }
}
