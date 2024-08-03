package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.Pair;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2630g;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.r */
/* loaded from: classes.dex */
public final class C2316r implements InterfaceC2310l {

    /* renamed from: a */
    private final String f9051a;

    /* renamed from: b */
    private final C2644u f9052b = new C2644u(1024);

    /* renamed from: c */
    private final C2643t f9053c = new C2643t(this.f9052b.f11004a);

    /* renamed from: d */
    private InterfaceC2337q f9054d;

    /* renamed from: e */
    private C2676s f9055e;

    /* renamed from: f */
    private String f9056f;

    /* renamed from: g */
    private int f9057g;

    /* renamed from: h */
    private int f9058h;

    /* renamed from: i */
    private int f9059i;

    /* renamed from: j */
    private int f9060j;

    /* renamed from: k */
    private long f9061k;

    /* renamed from: l */
    private boolean f9062l;

    /* renamed from: m */
    private int f9063m;

    /* renamed from: n */
    private int f9064n;

    /* renamed from: o */
    private int f9065o;

    /* renamed from: p */
    private boolean f9066p;

    /* renamed from: q */
    private long f9067q;

    /* renamed from: r */
    private int f9068r;

    /* renamed from: s */
    private long f9069s;

    /* renamed from: t */
    private int f9070t;

    public C2316r(String str) {
        this.f9051a = str;
    }

    /* renamed from: a */
    private static long m9628a(C2643t c2643t) {
        return c2643t.m11191a((c2643t.m11191a(2) + 1) * 8);
    }

    /* renamed from: a */
    private void m9629a(int i) {
        this.f9052b.m11218c(i);
        this.f9053c.m11194a(this.f9052b.f11004a);
    }

    /* renamed from: a */
    private void m9630a(C2643t c2643t, int i) {
        int m11202d = c2643t.m11202d();
        if ((m11202d & 7) == 0) {
            this.f9052b.m11222e(m11202d >> 3);
        } else {
            c2643t.m11196a(this.f9052b.f11004a, 0, i * 8);
            this.f9052b.m11222e(0);
        }
        this.f9054d.mo9432a(this.f9052b, i);
        this.f9054d.mo9431a(this.f9061k, 1, i, 0, null);
        this.f9061k += this.f9069s;
    }

    /* renamed from: b */
    private void m9631b(C2643t c2643t) {
        if (!c2643t.m11204e()) {
            this.f9062l = true;
            m9635f(c2643t);
        } else if (!this.f9062l) {
            return;
        }
        if (this.f9063m != 0) {
            throw new C2683z();
        }
        if (this.f9064n != 0) {
            throw new C2683z();
        }
        m9630a(c2643t, m9634e(c2643t));
        if (this.f9066p) {
            c2643t.m11201c((int) this.f9067q);
        }
    }

    /* renamed from: c */
    private int m9632c(C2643t c2643t) {
        int m11190a = c2643t.m11190a();
        Pair<Integer, Integer> m11117a = C2630g.m11117a(c2643t, true);
        this.f9068r = ((Integer) m11117a.first).intValue();
        this.f9070t = ((Integer) m11117a.second).intValue();
        return m11190a - c2643t.m11190a();
    }

    /* renamed from: d */
    private void m9633d(C2643t c2643t) {
        int i;
        this.f9065o = c2643t.m11191a(3);
        int i2 = this.f9065o;
        if (i2 == 0) {
            i = 8;
        } else {
            if (i2 != 1) {
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    c2643t.m11201c(6);
                    return;
                } else {
                    if (i2 != 6 && i2 != 7) {
                        throw new IllegalStateException();
                    }
                    c2643t.m11201c(1);
                    return;
                }
            }
            i = 9;
        }
        c2643t.m11201c(i);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: e */
    private int m9634e(C2643t c2643t) {
        int m11191a;
        if (this.f9065o != 0) {
            throw new C2683z();
        }
        int i = 0;
        do {
            m11191a = c2643t.m11191a(8);
            i += m11191a;
        } while (m11191a == 255);
        return i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: f */
    private void m9635f(C2643t c2643t) {
        boolean m11204e;
        int m11191a = c2643t.m11191a(1);
        this.f9063m = m11191a == 1 ? c2643t.m11191a(1) : 0;
        if (this.f9063m != 0) {
            throw new C2683z();
        }
        if (m11191a == 1) {
            m9628a(c2643t);
        }
        if (!c2643t.m11204e()) {
            throw new C2683z();
        }
        this.f9064n = c2643t.m11191a(6);
        int m11191a2 = c2643t.m11191a(4);
        int m11191a3 = c2643t.m11191a(3);
        if (m11191a2 != 0 || m11191a3 != 0) {
            throw new C2683z();
        }
        if (m11191a == 0) {
            int m11202d = c2643t.m11202d();
            int m9632c = m9632c(c2643t);
            c2643t.m11198b(m11202d);
            byte[] bArr = new byte[(m9632c + 7) / 8];
            c2643t.m11196a(bArr, 0, m9632c);
            C2676s m11426a = C2676s.m11426a(this.f9056f, "audio/mp4a-latm", (String) null, -1, -1, this.f9070t, this.f9068r, (List<byte[]>) Collections.singletonList(bArr), (C2213m) null, 0, this.f9051a);
            if (!m11426a.equals(this.f9055e)) {
                this.f9055e = m11426a;
                this.f9069s = 1024000000 / m11426a.f11196u;
                this.f9054d.mo9433a(m11426a);
            }
        } else {
            c2643t.m11201c(((int) m9628a(c2643t)) - m9632c(c2643t));
        }
        m9633d(c2643t);
        this.f9066p = c2643t.m11204e();
        this.f9067q = 0L;
        if (this.f9066p) {
            if (m11191a == 1) {
                this.f9067q = m9628a(c2643t);
            }
            do {
                m11204e = c2643t.m11204e();
                this.f9067q = (this.f9067q << 8) + c2643t.m11191a(8);
            } while (m11204e);
        }
        if (c2643t.m11204e()) {
            c2643t.m11201c(8);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        this.f9057g = 0;
        this.f9062l = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f9061k = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f9054d = interfaceC2325i.mo9671a(dVar.m9550c(), 1);
        this.f9056f = dVar.m9549b();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            int i = this.f9057g;
            if (i != 0) {
                if (i == 1) {
                    int m11238t = c2644u.m11238t();
                    if ((m11238t & 224) == 224) {
                        this.f9060j = m11238t;
                        this.f9057g = 2;
                    } else if (m11238t != 86) {
                        this.f9057g = 0;
                    }
                } else if (i == 2) {
                    this.f9059i = ((this.f9060j & (-225)) << 8) | c2644u.m11238t();
                    int i2 = this.f9059i;
                    if (i2 > this.f9052b.f11004a.length) {
                        m9629a(i2);
                    }
                    this.f9058h = 0;
                    this.f9057g = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c2644u.m11208a(), this.f9059i - this.f9058h);
                    c2644u.m11214a(this.f9053c.f11000a, this.f9058h, min);
                    this.f9058h += min;
                    if (this.f9058h == this.f9059i) {
                        this.f9053c.m11198b(0);
                        m9631b(this.f9053c);
                        this.f9057g = 0;
                    }
                }
            } else if (c2644u.m11238t() == 86) {
                this.f9057g = 1;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
