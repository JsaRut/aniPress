package p139d.p225c.p226a.p227a.p234f.p240f;

import java.util.ArrayList;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k;
import p139d.p225c.p226a.p227a.p234f.p240f.C2286n;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.m */
/* loaded from: classes.dex */
final class C2285m extends AbstractC2283k {

    /* renamed from: n */
    private a f8763n;

    /* renamed from: o */
    private int f8764o;

    /* renamed from: p */
    private boolean f8765p;

    /* renamed from: q */
    private C2286n.d f8766q;

    /* renamed from: r */
    private C2286n.b f8767r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.f.f.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C2286n.d f8768a;

        /* renamed from: b */
        public final C2286n.b f8769b;

        /* renamed from: c */
        public final byte[] f8770c;

        /* renamed from: d */
        public final C2286n.c[] f8771d;

        /* renamed from: e */
        public final int f8772e;

        public a(C2286n.d dVar, C2286n.b bVar, byte[] bArr, C2286n.c[] cVarArr, int i) {
            this.f8768a = dVar;
            this.f8769b = bVar;
            this.f8770c = bArr;
            this.f8771d = cVarArr;
            this.f8772e = i;
        }
    }

    /* renamed from: a */
    static int m9484a(byte b2, int i, int i2) {
        return (b2 >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: a */
    private static int m9485a(byte b2, a aVar) {
        return !aVar.f8771d[m9484a(b2, aVar.f8772e, 1)].f8781a ? aVar.f8768a.f8791g : aVar.f8768a.f8792h;
    }

    /* renamed from: a */
    static void m9486a(C2644u c2644u, long j) {
        c2644u.m11220d(c2644u.m11219d() + 4);
        c2644u.f11004a[c2644u.m11219d() - 4] = (byte) (j & 255);
        c2644u.f11004a[c2644u.m11219d() - 3] = (byte) ((j >>> 8) & 255);
        c2644u.f11004a[c2644u.m11219d() - 2] = (byte) ((j >>> 16) & 255);
        c2644u.f11004a[c2644u.m11219d() - 1] = (byte) ((j >>> 24) & 255);
    }

    /* renamed from: c */
    public static boolean m9487c(C2644u c2644u) {
        try {
            return C2286n.m9494a(1, c2644u, true);
        } catch (C2683z unused) {
            return false;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    protected long mo9452a(C2644u c2644u) {
        byte[] bArr = c2644u.f11004a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        int m9485a = m9485a(bArr[0], this.f8763n);
        long j = this.f8765p ? (this.f8764o + m9485a) / 4 : 0;
        m9486a(c2644u, j);
        this.f8765p = true;
        this.f8764o = m9485a;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    public void mo9453a(boolean z) {
        super.mo9453a(z);
        if (z) {
            this.f8763n = null;
            this.f8766q = null;
            this.f8767r = null;
        }
        this.f8764o = 0;
        this.f8765p = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    protected boolean mo9454a(C2644u c2644u, long j, AbstractC2283k.a aVar) {
        if (this.f8763n != null) {
            return false;
        }
        this.f8763n = m9488b(c2644u);
        if (this.f8763n == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f8763n.f8768a.f8794j);
        arrayList.add(this.f8763n.f8770c);
        C2286n.d dVar = this.f8763n.f8768a;
        aVar.f8757a = C2676s.m11426a((String) null, "audio/vorbis", (String) null, dVar.f8789e, -1, dVar.f8786b, (int) dVar.f8787c, arrayList, (C2213m) null, 0, (String) null);
        return true;
    }

    /* renamed from: b */
    a m9488b(C2644u c2644u) {
        if (this.f8766q == null) {
            this.f8766q = C2286n.m9496b(c2644u);
            return null;
        }
        if (this.f8767r == null) {
            this.f8767r = C2286n.m9492a(c2644u);
            return null;
        }
        byte[] bArr = new byte[c2644u.m11219d()];
        System.arraycopy(c2644u.f11004a, 0, bArr, 0, c2644u.m11219d());
        return new a(this.f8766q, this.f8767r, bArr, C2286n.m9495a(c2644u, this.f8766q.f8786b), C2286n.m9489a(r5.length - 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: c */
    public void mo9478c(long j) {
        super.mo9478c(j);
        this.f8765p = j != 0;
        C2286n.d dVar = this.f8766q;
        this.f8764o = dVar != null ? dVar.f8791g : 0;
    }
}
