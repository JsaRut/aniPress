package p139d.p225c.p226a.p227a.p234f.p235a;

import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2237c;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.a.b */
/* loaded from: classes.dex */
public final class C2229b implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8150a = new InterfaceC2330j() { // from class: d.c.a.a.f.a.a
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2229b.m9151b();
        }
    };

    /* renamed from: b */
    private static final int[] f8151b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f8152c = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    private static final byte[] f8153d = C2622I.m11086c("#!AMR\n");

    /* renamed from: e */
    private static final byte[] f8154e = C2622I.m11086c("#!AMR-WB\n");

    /* renamed from: f */
    private static final int f8155f = f8152c[8];

    /* renamed from: g */
    private final byte[] f8156g;

    /* renamed from: h */
    private final int f8157h;

    /* renamed from: i */
    private boolean f8158i;

    /* renamed from: j */
    private long f8159j;

    /* renamed from: k */
    private int f8160k;

    /* renamed from: l */
    private int f8161l;

    /* renamed from: m */
    private boolean f8162m;

    /* renamed from: n */
    private long f8163n;

    /* renamed from: o */
    private int f8164o;

    /* renamed from: p */
    private int f8165p;

    /* renamed from: q */
    private long f8166q;

    /* renamed from: r */
    private InterfaceC2325i f8167r;

    /* renamed from: s */
    private InterfaceC2337q f8168s;

    /* renamed from: t */
    private InterfaceC2335o f8169t;

    /* renamed from: u */
    private boolean f8170u;

    public C2229b() {
        this(0);
    }

    public C2229b(int i) {
        this.f8157h = i;
        this.f8156g = new byte[1];
        this.f8164o = -1;
    }

    /* renamed from: a */
    private int m9144a(int i) {
        if (m9153c(i)) {
            return this.f8158i ? f8152c[i] : f8151b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f8158i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new C2683z(sb.toString());
    }

    /* renamed from: a */
    private static int m9145a(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: a */
    private InterfaceC2335o m9146a(long j) {
        return new C2237c(j, this.f8163n, m9145a(this.f8164o, 20000L), this.f8164o);
    }

    /* renamed from: a */
    private void m9147a(long j, int i) {
        InterfaceC2335o bVar;
        int i2;
        if (this.f8162m) {
            return;
        }
        if ((this.f8157h & 1) == 0 || j == -1 || !((i2 = this.f8164o) == -1 || i2 == this.f8160k)) {
            bVar = new InterfaceC2335o.b(-9223372036854775807L);
        } else if (this.f8165p < 20 && i != -1) {
            return;
        } else {
            bVar = m9146a(j);
        }
        this.f8169t = bVar;
        this.f8167r.mo9673a(this.f8169t);
        this.f8162m = true;
    }

    /* renamed from: a */
    private boolean m9148a(InterfaceC2289h interfaceC2289h, byte[] bArr) {
        interfaceC2289h.mo9280b();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC2289h.mo9276a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: b */
    private int m9149b(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9276a(this.f8156g, 0, 1);
        byte b2 = this.f8156g[0];
        if ((b2 & 131) <= 0) {
            return m9144a((b2 >> 3) & 15);
        }
        throw new C2683z("Invalid padding bits for frame header " + ((int) b2));
    }

    /* renamed from: b */
    private boolean m9150b(int i) {
        return !this.f8158i && (i < 12 || i > 14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9151b() {
        return new InterfaceC2287g[]{new C2229b()};
    }

    /* renamed from: c */
    private void m9152c() {
        if (this.f8170u) {
            return;
        }
        this.f8170u = true;
        this.f8168s.mo9433a(C2676s.m11425a((String) null, this.f8158i ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, f8155f, 1, this.f8158i ? 16000 : 8000, -1, (List<byte[]>) null, (C2213m) null, 0, (String) null));
    }

    /* renamed from: c */
    private boolean m9153c(int i) {
        return i >= 0 && i <= 15 && (m9156d(i) || m9150b(i));
    }

    /* renamed from: c */
    private boolean m9154c(InterfaceC2289h interfaceC2289h) {
        int length;
        if (m9148a(interfaceC2289h, f8153d)) {
            this.f8158i = false;
            length = f8153d.length;
        } else {
            if (!m9148a(interfaceC2289h, f8154e)) {
                return false;
            }
            this.f8158i = true;
            length = f8154e.length;
        }
        interfaceC2289h.mo9283c(length);
        return true;
    }

    /* renamed from: d */
    private int m9155d(InterfaceC2289h interfaceC2289h) {
        if (this.f8161l == 0) {
            try {
                this.f8160k = m9149b(interfaceC2289h);
                this.f8161l = this.f8160k;
                if (this.f8164o == -1) {
                    this.f8163n = interfaceC2289h.getPosition();
                    this.f8164o = this.f8160k;
                }
                if (this.f8164o == this.f8160k) {
                    this.f8165p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int mo9430a = this.f8168s.mo9430a(interfaceC2289h, this.f8161l, true);
        if (mo9430a == -1) {
            return -1;
        }
        this.f8161l -= mo9430a;
        if (this.f8161l > 0) {
            return 0;
        }
        this.f8168s.mo9431a(this.f8166q + this.f8159j, 1, this.f8160k, 0, null);
        this.f8159j += 20000;
        return 0;
    }

    /* renamed from: d */
    private boolean m9156d(int i) {
        return this.f8158i && (i < 10 || i > 13);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        if (interfaceC2289h.getPosition() == 0 && !m9154c(interfaceC2289h)) {
            throw new C2683z("Could not find AMR header.");
        }
        m9152c();
        int m9155d = m9155d(interfaceC2289h);
        m9147a(interfaceC2289h.getLength(), m9155d);
        return m9155d;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8159j = 0L;
        this.f8160k = 0;
        this.f8161l = 0;
        if (j != 0) {
            InterfaceC2335o interfaceC2335o = this.f8169t;
            if (interfaceC2335o instanceof C2237c) {
                this.f8166q = ((C2237c) interfaceC2335o).m9209c(j);
                return;
            }
        }
        this.f8166q = 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8167r = interfaceC2325i;
        this.f8168s = interfaceC2325i.mo9671a(0, 1);
        interfaceC2325i.mo9672a();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        return m9154c(interfaceC2289h);
    }
}
