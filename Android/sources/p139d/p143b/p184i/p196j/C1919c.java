package p139d.p143b.p184i.p196j;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p156h.InterfaceC1718d;
import p139d.p143b.p203j.C2032b;

/* renamed from: d.b.i.j.c */
/* loaded from: classes.dex */
public class C1919c extends AbstractC1917a {

    /* renamed from: a */
    private C1716b<Bitmap> f7064a;

    /* renamed from: b */
    private volatile Bitmap f7065b;

    /* renamed from: c */
    private final InterfaceC1923g f7066c;

    /* renamed from: d */
    private final int f7067d;

    /* renamed from: e */
    private final int f7068e;

    public C1919c(Bitmap bitmap, InterfaceC1718d<Bitmap> interfaceC1718d, InterfaceC1923g interfaceC1923g, int i) {
        this(bitmap, interfaceC1718d, interfaceC1923g, i, 0);
    }

    public C1919c(Bitmap bitmap, InterfaceC1718d<Bitmap> interfaceC1718d, InterfaceC1923g interfaceC1923g, int i, int i2) {
        C1691j.m6971a(bitmap);
        this.f7065b = bitmap;
        Bitmap bitmap2 = this.f7065b;
        C1691j.m6971a(interfaceC1718d);
        this.f7064a = C1716b.m7044a(bitmap2, interfaceC1718d);
        this.f7066c = interfaceC1923g;
        this.f7067d = i;
        this.f7068e = i2;
    }

    public C1919c(C1716b<Bitmap> c1716b, InterfaceC1923g interfaceC1923g, int i, int i2) {
        C1716b<Bitmap> m7047m = c1716b.m7047m();
        C1691j.m6971a(m7047m);
        this.f7064a = m7047m;
        this.f7065b = this.f7064a.m7048n();
        this.f7066c = interfaceC1923g;
        this.f7067d = i;
        this.f7068e = i2;
    }

    /* renamed from: a */
    private static int m7894a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* renamed from: b */
    private static int m7895b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: u */
    private synchronized C1716b<Bitmap> m7896u() {
        C1716b<Bitmap> c1716b;
        c1716b = this.f7064a;
        this.f7064a = null;
        this.f7065b = null;
        return c1716b;
    }

    @Override // p139d.p143b.p184i.p196j.AbstractC1918b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1716b<Bitmap> m7896u = m7896u();
        if (m7896u != null) {
            m7896u.close();
        }
    }

    @Override // p139d.p143b.p184i.p196j.AbstractC1918b
    public synchronized boolean isClosed() {
        return this.f7064a == null;
    }

    @Override // p139d.p143b.p184i.p196j.InterfaceC1921e
    /* renamed from: m */
    public int mo6292m() {
        int i;
        return (this.f7067d % 180 != 0 || (i = this.f7068e) == 5 || i == 7) ? m7895b(this.f7065b) : m7894a(this.f7065b);
    }

    @Override // p139d.p143b.p184i.p196j.InterfaceC1921e
    /* renamed from: n */
    public int mo6293n() {
        int i;
        return (this.f7067d % 180 != 0 || (i = this.f7068e) == 5 || i == 7) ? m7894a(this.f7065b) : m7895b(this.f7065b);
    }

    @Override // p139d.p143b.p184i.p196j.AbstractC1918b
    /* renamed from: o */
    public InterfaceC1923g mo7891o() {
        return this.f7066c;
    }

    @Override // p139d.p143b.p184i.p196j.AbstractC1918b
    /* renamed from: p */
    public int mo7892p() {
        return C2032b.m8294a(this.f7065b);
    }

    /* renamed from: r */
    public int m7897r() {
        return this.f7068e;
    }

    /* renamed from: s */
    public int m7898s() {
        return this.f7067d;
    }

    /* renamed from: t */
    public Bitmap m7899t() {
        return this.f7065b;
    }
}
