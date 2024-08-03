package p139d.p143b.p184i.p196j;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p155g.C1712i;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p183h.C1827c;
import p139d.p143b.p183h.C1828d;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p203j.C2032b;
import p139d.p143b.p203j.C2033c;
import p139d.p143b.p203j.C2037g;

/* renamed from: d.b.i.j.d */
/* loaded from: classes.dex */
public class C1920d implements Closeable {

    /* renamed from: a */
    private final C1716b<InterfaceC1710g> f7069a;

    /* renamed from: b */
    private final InterfaceC1694m<FileInputStream> f7070b;

    /* renamed from: c */
    private C1827c f7071c;

    /* renamed from: d */
    private int f7072d;

    /* renamed from: e */
    private int f7073e;

    /* renamed from: f */
    private int f7074f;

    /* renamed from: g */
    private int f7075g;

    /* renamed from: h */
    private int f7076h;

    /* renamed from: i */
    private int f7077i;

    /* renamed from: j */
    private C1877a f7078j;

    public C1920d(InterfaceC1694m<FileInputStream> interfaceC1694m) {
        this.f7071c = C1827c.f6749a;
        this.f7072d = -1;
        this.f7073e = 0;
        this.f7074f = -1;
        this.f7075g = -1;
        this.f7076h = 1;
        this.f7077i = -1;
        C1691j.m6971a(interfaceC1694m);
        this.f7069a = null;
        this.f7070b = interfaceC1694m;
    }

    public C1920d(InterfaceC1694m<FileInputStream> interfaceC1694m, int i) {
        this(interfaceC1694m);
        this.f7077i = i;
    }

    public C1920d(C1716b<InterfaceC1710g> c1716b) {
        this.f7071c = C1827c.f6749a;
        this.f7072d = -1;
        this.f7073e = 0;
        this.f7074f = -1;
        this.f7075g = -1;
        this.f7076h = 1;
        this.f7077i = -1;
        C1691j.m6974a(C1716b.m7046c(c1716b));
        this.f7069a = c1716b.m11778clone();
        this.f7070b = null;
    }

    /* renamed from: A */
    private Pair<Integer, Integer> m7900A() {
        Pair<Integer, Integer> m8310b = C2037g.m8310b(m7922s());
        if (m8310b != null) {
            this.f7074f = ((Integer) m8310b.first).intValue();
            this.f7075g = ((Integer) m8310b.second).intValue();
        }
        return m8310b;
    }

    /* renamed from: a */
    public static C1920d m7901a(C1920d c1920d) {
        if (c1920d != null) {
            return c1920d.m7916m();
        }
        return null;
    }

    /* renamed from: b */
    public static void m7902b(C1920d c1920d) {
        if (c1920d != null) {
            c1920d.close();
        }
    }

    /* renamed from: d */
    public static boolean m7903d(C1920d c1920d) {
        return c1920d.f7072d >= 0 && c1920d.f7074f >= 0 && c1920d.f7075g >= 0;
    }

    /* renamed from: e */
    public static boolean m7904e(C1920d c1920d) {
        return c1920d != null && c1920d.m7927x();
    }

    /* renamed from: z */
    private Pair<Integer, Integer> m7905z() {
        InputStream inputStream;
        try {
            inputStream = m7922s();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            Pair<Integer, Integer> m8295a = C2032b.m8295a(inputStream);
            if (m8295a != null) {
                this.f7074f = ((Integer) m8295a.first).intValue();
                this.f7075g = ((Integer) m8295a.second).intValue();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return m8295a;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void m7906a(C1827c c1827c) {
        this.f7071c = c1827c;
    }

    /* renamed from: a */
    public void m7907a(C1877a c1877a) {
        this.f7078j = c1877a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public String m7908b(int i) {
        C1716b<InterfaceC1710g> m7917n = m7917n();
        if (m7917n == null) {
            return "";
        }
        int min = Math.min(m7925v(), i);
        byte[] bArr = new byte[min];
        try {
            InterfaceC1710g m7048n = m7917n.m7048n();
            if (m7048n == null) {
                return "";
            }
            m7048n.mo5033a(0, bArr, 0, min);
            m7917n.close();
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte b2 : bArr) {
                sb.append(String.format("%02X", Byte.valueOf(b2)));
            }
            return sb.toString();
        } finally {
            m7917n.close();
        }
    }

    /* renamed from: c */
    public void m7909c(C1920d c1920d) {
        this.f7071c = c1920d.m7921r();
        this.f7074f = c1920d.m7926w();
        this.f7075g = c1920d.m7920q();
        this.f7072d = c1920d.m7923t();
        this.f7073e = c1920d.m7919p();
        this.f7076h = c1920d.m7924u();
        this.f7077i = c1920d.m7925v();
        this.f7078j = c1920d.m7918o();
    }

    /* renamed from: c */
    public boolean m7910c(int i) {
        if (this.f7071c != C1826b.f6739a || this.f7070b != null) {
            return true;
        }
        C1691j.m6971a(this.f7069a);
        InterfaceC1710g m7048n = this.f7069a.m7048n();
        return m7048n.mo5032a(i + (-2)) == -1 && m7048n.mo5032a(i - 1) == -39;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C1716b.m7045b(this.f7069a);
    }

    /* renamed from: d */
    public void m7911d(int i) {
        this.f7073e = i;
    }

    /* renamed from: e */
    public void m7912e(int i) {
        this.f7075g = i;
    }

    /* renamed from: f */
    public void m7913f(int i) {
        this.f7072d = i;
    }

    /* renamed from: g */
    public void m7914g(int i) {
        this.f7076h = i;
    }

    /* renamed from: h */
    public void m7915h(int i) {
        this.f7074f = i;
    }

    /* renamed from: m */
    public C1920d m7916m() {
        C1920d c1920d;
        InterfaceC1694m<FileInputStream> interfaceC1694m = this.f7070b;
        if (interfaceC1694m != null) {
            c1920d = new C1920d(interfaceC1694m, this.f7077i);
        } else {
            C1716b m7042a = C1716b.m7042a((C1716b) this.f7069a);
            if (m7042a == null) {
                c1920d = null;
            } else {
                try {
                    c1920d = new C1920d((C1716b<InterfaceC1710g>) m7042a);
                } finally {
                    C1716b.m7045b(m7042a);
                }
            }
        }
        if (c1920d != null) {
            c1920d.m7909c(this);
        }
        return c1920d;
    }

    /* renamed from: n */
    public C1716b<InterfaceC1710g> m7917n() {
        return C1716b.m7042a((C1716b) this.f7069a);
    }

    /* renamed from: o */
    public C1877a m7918o() {
        return this.f7078j;
    }

    /* renamed from: p */
    public int m7919p() {
        return this.f7073e;
    }

    /* renamed from: q */
    public int m7920q() {
        return this.f7075g;
    }

    /* renamed from: r */
    public C1827c m7921r() {
        return this.f7071c;
    }

    /* renamed from: s */
    public InputStream m7922s() {
        InterfaceC1694m<FileInputStream> interfaceC1694m = this.f7070b;
        if (interfaceC1694m != null) {
            return interfaceC1694m.get();
        }
        C1716b m7042a = C1716b.m7042a((C1716b) this.f7069a);
        if (m7042a == null) {
            return null;
        }
        try {
            return new C1712i((InterfaceC1710g) m7042a.m7048n());
        } finally {
            C1716b.m7045b(m7042a);
        }
    }

    /* renamed from: t */
    public int m7923t() {
        return this.f7072d;
    }

    /* renamed from: u */
    public int m7924u() {
        return this.f7076h;
    }

    /* renamed from: v */
    public int m7925v() {
        C1716b<InterfaceC1710g> c1716b = this.f7069a;
        return (c1716b == null || c1716b.m7048n() == null) ? this.f7077i : this.f7069a.m7048n().size();
    }

    /* renamed from: w */
    public int m7926w() {
        return this.f7074f;
    }

    /* renamed from: x */
    public synchronized boolean m7927x() {
        boolean z;
        if (!C1716b.m7046c(this.f7069a)) {
            z = this.f7070b != null;
        }
        return z;
    }

    /* renamed from: y */
    public void m7928y() {
        int i;
        C1827c m7524c = C1828d.m7524c(m7922s());
        this.f7071c = m7524c;
        Pair<Integer, Integer> m7900A = C1826b.m7518b(m7524c) ? m7900A() : m7905z();
        if (m7524c != C1826b.f6739a || this.f7072d != -1) {
            i = 0;
        } else {
            if (m7900A == null) {
                return;
            }
            this.f7073e = C2033c.m8297a(m7922s());
            i = C2033c.m8296a(this.f7073e);
        }
        this.f7072d = i;
    }
}
