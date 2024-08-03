package p139d.p225c.p226a.p227a.p234f;

import java.io.EOFException;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.d */
/* loaded from: classes.dex */
public final class C2247d implements InterfaceC2289h {

    /* renamed from: b */
    private final InterfaceC2597k f8350b;

    /* renamed from: c */
    private final long f8351c;

    /* renamed from: d */
    private long f8352d;

    /* renamed from: f */
    private int f8354f;

    /* renamed from: g */
    private int f8355g;

    /* renamed from: e */
    private byte[] f8353e = new byte[65536];

    /* renamed from: a */
    private final byte[] f8349a = new byte[4096];

    public C2247d(InterfaceC2597k interfaceC2597k, long j, long j2) {
        this.f8350b = interfaceC2597k;
        this.f8352d = j;
        this.f8351c = j2;
    }

    /* renamed from: a */
    private int m9268a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int read = this.f8350b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    private int m9269b(byte[] bArr, int i, int i2) {
        int i3 = this.f8355g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f8353e, 0, bArr, i, min);
        m9273g(min);
        return min;
    }

    /* renamed from: d */
    private void m9270d(int i) {
        if (i != -1) {
            this.f8352d += i;
        }
    }

    /* renamed from: e */
    private void m9271e(int i) {
        int i2 = this.f8354f + i;
        byte[] bArr = this.f8353e;
        if (i2 > bArr.length) {
            this.f8353e = Arrays.copyOf(this.f8353e, C2622I.m11038a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: f */
    private int m9272f(int i) {
        int min = Math.min(this.f8355g, i);
        m9273g(min);
        return min;
    }

    /* renamed from: g */
    private void m9273g(int i) {
        this.f8355g -= i;
        this.f8354f = 0;
        byte[] bArr = this.f8353e;
        int i2 = this.f8355g;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        System.arraycopy(this.f8353e, i, bArr, 0, this.f8355g);
        this.f8353e = bArr;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: a */
    public long mo9274a() {
        return this.f8352d + this.f8354f;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: a */
    public void mo9275a(int i) {
        mo9277a(i, false);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: a */
    public void mo9276a(byte[] bArr, int i, int i2) {
        mo9282b(bArr, i, i2, false);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: a */
    public boolean mo9277a(int i, boolean z) {
        m9271e(i);
        int i2 = this.f8355g - this.f8354f;
        while (i2 < i) {
            i2 = m9268a(this.f8353e, this.f8354f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f8355g = this.f8354f + i2;
        }
        this.f8354f += i;
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: a */
    public boolean mo9278a(byte[] bArr, int i, int i2, boolean z) {
        int m9269b = m9269b(bArr, i, i2);
        while (m9269b < i2 && m9269b != -1) {
            m9269b = m9268a(bArr, i, i2, m9269b, z);
        }
        m9270d(m9269b);
        return m9269b != -1;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: b */
    public int mo9279b(int i) {
        int m9272f = m9272f(i);
        if (m9272f == 0) {
            byte[] bArr = this.f8349a;
            m9272f = m9268a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m9270d(m9272f);
        return m9272f;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: b */
    public void mo9280b() {
        this.f8354f = 0;
    }

    /* renamed from: b */
    public boolean m9281b(int i, boolean z) {
        int m9272f = m9272f(i);
        while (m9272f < i && m9272f != -1) {
            m9272f = m9268a(this.f8349a, -m9272f, Math.min(i, this.f8349a.length + m9272f), m9272f, z);
        }
        m9270d(m9272f);
        return m9272f != -1;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: b */
    public boolean mo9282b(byte[] bArr, int i, int i2, boolean z) {
        if (!mo9277a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f8353e, this.f8354f - i2, bArr, i, i2);
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    /* renamed from: c */
    public void mo9283c(int i) {
        m9281b(i, false);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    public long getLength() {
        return this.f8351c;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    public long getPosition() {
        return this.f8352d;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    public int read(byte[] bArr, int i, int i2) {
        int m9269b = m9269b(bArr, i, i2);
        if (m9269b == 0) {
            m9269b = m9268a(bArr, i, i2, 0, true);
        }
        m9270d(m9269b);
        return m9269b;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2289h
    public void readFully(byte[] bArr, int i, int i2) {
        mo9278a(bArr, i, i2, false);
    }
}
