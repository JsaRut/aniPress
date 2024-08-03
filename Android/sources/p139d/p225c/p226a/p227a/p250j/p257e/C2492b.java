package p139d.p225c.p226a.p227a.p250j.p257e;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.p239e.C2263h;
import p139d.p225c.p226a.p227a.p234f.p239e.C2268m;
import p139d.p225c.p226a.p227a.p234f.p239e.C2269n;
import p139d.p225c.p226a.p227a.p250j.C2504n;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2419b;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2421d;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l;
import p139d.p225c.p226a.p227a.p250j.p252b.C2422e;
import p139d.p225c.p226a.p227a.p250j.p252b.C2423f;
import p139d.p225c.p226a.p227a.p250j.p252b.C2426i;
import p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2431n;
import p139d.p225c.p226a.p227a.p250j.p257e.InterfaceC2493c;
import p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2489a;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2582A;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.e.b */
/* loaded from: classes.dex */
public class C2492b implements InterfaceC2493c {

    /* renamed from: a */
    private final InterfaceC2582A f10112a;

    /* renamed from: b */
    private final int f10113b;

    /* renamed from: c */
    private final InterfaceC2577k f10114c;

    /* renamed from: d */
    private final C2422e[] f10115d;

    /* renamed from: e */
    private final InterfaceC2597k f10116e;

    /* renamed from: f */
    private C2489a f10117f;

    /* renamed from: g */
    private int f10118g;

    /* renamed from: h */
    private IOException f10119h;

    /* renamed from: d.c.a.a.j.e.b$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2493c.a {

        /* renamed from: a */
        private final InterfaceC2597k.a f10120a;

        public a(InterfaceC2597k.a aVar) {
            this.f10120a = aVar;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.InterfaceC2493c.a
        /* renamed from: a */
        public InterfaceC2493c mo10418a(InterfaceC2582A interfaceC2582A, C2489a c2489a, int i, InterfaceC2577k interfaceC2577k, C2269n[] c2269nArr, InterfaceC2586E interfaceC2586E) {
            InterfaceC2597k mo10923a = this.f10120a.mo10923a();
            if (interfaceC2586E != null) {
                mo10923a.mo10300a(interfaceC2586E);
            }
            return new C2492b(interfaceC2582A, c2489a, i, interfaceC2577k, mo10923a, c2269nArr);
        }
    }

    /* renamed from: d.c.a.a.j.e.b$b */
    /* loaded from: classes.dex */
    private static final class b extends AbstractC2419b {

        /* renamed from: d */
        private final C2489a.b f10121d;

        /* renamed from: e */
        private final int f10122e;

        public b(C2489a.b bVar, int i, int i2) {
            super(i2, bVar.f10074k - 1);
            this.f10121d = bVar;
            this.f10122e = i;
        }
    }

    public C2492b(InterfaceC2582A interfaceC2582A, C2489a c2489a, int i, InterfaceC2577k interfaceC2577k, InterfaceC2597k interfaceC2597k, C2269n[] c2269nArr) {
        this.f10112a = interfaceC2582A;
        this.f10117f = c2489a;
        this.f10113b = i;
        this.f10114c = interfaceC2577k;
        this.f10116e = interfaceC2597k;
        C2489a.b bVar = c2489a.f10059f[i];
        this.f10115d = new C2422e[interfaceC2577k.length()];
        int i2 = 0;
        while (i2 < this.f10115d.length) {
            int mo10819b = interfaceC2577k.mo10819b(i2);
            C2676s c2676s = bVar.f10073j[mo10819b];
            int i3 = i2;
            this.f10115d[i3] = new C2422e(new C2263h(3, null, new C2268m(mo10819b, bVar.f10064a, bVar.f10066c, -9223372036854775807L, c2489a.f10060g, c2676s, 0, c2269nArr, bVar.f10064a == 2 ? 4 : 0, null, null), null), bVar.f10064a, c2676s);
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    private long m10415a(long j) {
        C2489a c2489a = this.f10117f;
        if (!c2489a.f10057d) {
            return -9223372036854775807L;
        }
        C2489a.b bVar = c2489a.f10059f[this.f10113b];
        int i = bVar.f10074k - 1;
        return (bVar.m10391b(i) + bVar.m10389a(i)) - j;
    }

    /* renamed from: a */
    private static AbstractC2429l m10416a(C2676s c2676s, InterfaceC2597k interfaceC2597k, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, C2422e c2422e) {
        return new C2426i(interfaceC2597k, new C2600n(uri, 0L, -1L, str), c2676s, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, c2422e);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public int mo10026a(long j, List<? extends AbstractC2429l> list) {
        return (this.f10119h != null || this.f10114c.length() < 2) ? list.size() : this.f10114c.mo10810a(j, list);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public long mo10027a(long j, C2147L c2147l) {
        C2489a.b bVar = this.f10117f.f10059f[this.f10113b];
        int m10388a = bVar.m10388a(j);
        long m10391b = bVar.m10391b(m10388a);
        return C2622I.m11046a(j, c2147l, m10391b, (m10391b >= j || m10388a >= bVar.f10074k + (-1)) ? m10391b : bVar.m10391b(m10388a + 1));
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public void mo10028a() {
        IOException iOException = this.f10119h;
        if (iOException != null) {
            throw iOException;
        }
        this.f10112a.mo10177a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public final void mo10029a(long j, long j2, List<? extends AbstractC2429l> list, C2423f c2423f) {
        int mo10032g;
        long j3 = j2;
        if (this.f10119h != null) {
            return;
        }
        C2489a.b bVar = this.f10117f.f10059f[this.f10113b];
        if (bVar.f10074k == 0) {
            c2423f.f9536b = !r4.f10057d;
            return;
        }
        if (list.isEmpty()) {
            mo10032g = bVar.m10388a(j3);
        } else {
            mo10032g = (int) (list.get(list.size() - 1).mo10032g() - this.f10118g);
            if (mo10032g < 0) {
                this.f10119h = new C2504n();
                return;
            }
        }
        if (mo10032g >= bVar.f10074k) {
            c2423f.f9536b = !this.f10117f.f10057d;
            return;
        }
        long j4 = j3 - j;
        long m10415a = m10415a(j);
        InterfaceC2431n[] interfaceC2431nArr = new InterfaceC2431n[this.f10114c.length()];
        for (int i = 0; i < interfaceC2431nArr.length; i++) {
            interfaceC2431nArr[i] = new b(bVar, this.f10114c.mo10819b(i), mo10032g);
        }
        this.f10114c.mo10327a(j, j4, m10415a, list, interfaceC2431nArr);
        long m10391b = bVar.m10391b(mo10032g);
        long m10389a = m10391b + bVar.m10389a(mo10032g);
        if (!list.isEmpty()) {
            j3 = -9223372036854775807L;
        }
        long j5 = j3;
        int i2 = mo10032g + this.f10118g;
        int mo10328b = this.f10114c.mo10328b();
        c2423f.f9535a = m10416a(this.f10114c.mo10824f(), this.f10116e, bVar.m10390a(this.f10114c.mo10819b(mo10328b), mo10032g), null, i2, m10391b, m10389a, j5, this.f10114c.mo10329g(), this.f10114c.mo10330h(), this.f10115d[mo10328b]);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public void mo10030a(AbstractC2421d abstractC2421d) {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p257e.InterfaceC2493c
    /* renamed from: a */
    public void mo10417a(C2489a c2489a) {
        C2489a.b[] bVarArr = this.f10117f.f10059f;
        int i = this.f10113b;
        C2489a.b bVar = bVarArr[i];
        int i2 = bVar.f10074k;
        C2489a.b bVar2 = c2489a.f10059f[i];
        if (i2 != 0 && bVar2.f10074k != 0) {
            int i3 = i2 - 1;
            long m10391b = bVar.m10391b(i3) + bVar.m10389a(i3);
            long m10391b2 = bVar2.m10391b(0);
            if (m10391b > m10391b2) {
                this.f10118g += bVar.m10388a(m10391b2);
                this.f10117f = c2489a;
            }
        }
        this.f10118g += i2;
        this.f10117f = c2489a;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public boolean mo10031a(AbstractC2421d abstractC2421d, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            InterfaceC2577k interfaceC2577k = this.f10114c;
            if (interfaceC2577k.mo10818a(interfaceC2577k.mo10814a(abstractC2421d.f9513c), j)) {
                return true;
            }
        }
        return false;
    }
}
