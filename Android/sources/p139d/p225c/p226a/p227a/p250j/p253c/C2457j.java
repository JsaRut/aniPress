package p139d.p225c.p226a.p227a.p250j.p253c;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.C2230b;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p237c.C2244g;
import p139d.p225c.p226a.p227a.p234f.p239e.C2263h;
import p139d.p225c.p226a.p227a.p234f.p241g.C2288a;
import p139d.p225c.p226a.p227a.p250j.C2504n;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2419b;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2421d;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l;
import p139d.p225c.p226a.p227a.p250j.p252b.C2422e;
import p139d.p225c.p226a.p227a.p250j.p252b.C2423f;
import p139d.p225c.p226a.p227a.p250j.p252b.C2426i;
import p139d.p225c.p226a.p227a.p250j.p252b.C2428k;
import p139d.p225c.p226a.p227a.p250j.p252b.C2432o;
import p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2431n;
import p139d.p225c.p226a.p227a.p250j.p253c.C2459l;
import p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2450c;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2435a;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2436b;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2442h;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2582A;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2609w;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.j.c.j */
/* loaded from: classes.dex */
public class C2457j implements InterfaceC2450c {

    /* renamed from: a */
    private final InterfaceC2582A f9747a;

    /* renamed from: b */
    private final int[] f9748b;

    /* renamed from: c */
    private final InterfaceC2577k f9749c;

    /* renamed from: d */
    private final int f9750d;

    /* renamed from: e */
    private final InterfaceC2597k f9751e;

    /* renamed from: f */
    private final long f9752f;

    /* renamed from: g */
    private final int f9753g;

    /* renamed from: h */
    private final C2459l.c f9754h;

    /* renamed from: i */
    protected final b[] f9755i;

    /* renamed from: j */
    private C2436b f9756j;

    /* renamed from: k */
    private int f9757k;

    /* renamed from: l */
    private IOException f9758l;

    /* renamed from: m */
    private boolean f9759m;

    /* renamed from: n */
    private long f9760n;

    /* renamed from: d.c.a.a.j.c.j$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC2450c.a {

        /* renamed from: a */
        private final InterfaceC2597k.a f9761a;

        /* renamed from: b */
        private final int f9762b;

        public a(InterfaceC2597k.a aVar) {
            this(aVar, 1);
        }

        public a(InterfaceC2597k.a aVar, int i) {
            this.f9761a = aVar;
            this.f9762b = i;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2450c.a
        /* renamed from: a */
        public InterfaceC2450c mo10128a(InterfaceC2582A interfaceC2582A, C2436b c2436b, int i, int[] iArr, InterfaceC2577k interfaceC2577k, int i2, long j, boolean z, boolean z2, C2459l.c cVar, InterfaceC2586E interfaceC2586E) {
            InterfaceC2597k mo10923a = this.f9761a.mo10923a();
            if (interfaceC2586E != null) {
                mo10923a.mo10300a(interfaceC2586E);
            }
            return new C2457j(interfaceC2582A, c2436b, i, iArr, interfaceC2577k, i2, mo10923a, j, this.f9762b, z, z2, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.j.c.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final C2422e f9763a;

        /* renamed from: b */
        public final AbstractC2444j f9764b;

        /* renamed from: c */
        public final InterfaceC2455h f9765c;

        /* renamed from: d */
        private final long f9766d;

        /* renamed from: e */
        private final long f9767e;

        b(long j, int i, AbstractC2444j abstractC2444j, boolean z, boolean z2, InterfaceC2337q interfaceC2337q) {
            this(j, abstractC2444j, m10187a(i, abstractC2444j, z, z2, interfaceC2337q), 0L, abstractC2444j.mo10104d());
        }

        private b(long j, AbstractC2444j abstractC2444j, C2422e c2422e, long j2, InterfaceC2455h interfaceC2455h) {
            this.f9766d = j;
            this.f9764b = abstractC2444j;
            this.f9767e = j2;
            this.f9763a = c2422e;
            this.f9765c = interfaceC2455h;
        }

        /* renamed from: a */
        private static C2422e m10187a(int i, AbstractC2444j abstractC2444j, boolean z, boolean z2, InterfaceC2337q interfaceC2337q) {
            InterfaceC2287g c2263h;
            String str = abstractC2444j.f9637c.f11181f;
            if (m10188a(str)) {
                return null;
            }
            if ("application/x-rawcc".equals(str)) {
                c2263h = new C2288a(abstractC2444j.f9637c);
            } else if (m10189b(str)) {
                c2263h = new C2244g(1);
            } else {
                c2263h = new C2263h(z ? 4 : 0, null, null, null, z2 ? Collections.singletonList(C2676s.m11419a(null, "application/cea-608", 0, null)) : Collections.emptyList(), interfaceC2337q);
            }
            return new C2422e(c2263h, i, abstractC2444j.f9637c);
        }

        /* renamed from: a */
        private static boolean m10188a(String str) {
            return C2641r.m11173h(str) || "application/ttml+xml".equals(str);
        }

        /* renamed from: b */
        private static boolean m10189b(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        /* renamed from: a */
        public long m10190a() {
            return this.f9765c.mo10110b() + this.f9767e;
        }

        /* renamed from: a */
        public long m10191a(long j) {
            return m10198c(j) + this.f9765c.mo10108a(j - this.f9767e, this.f9766d);
        }

        /* renamed from: a */
        public long m10192a(C2436b c2436b, int i, long j) {
            if (m10195b() != -1 || c2436b.f9595f == -9223372036854775807L) {
                return m10190a();
            }
            return Math.max(m10190a(), m10196b(((j - C2200d.m9047a(c2436b.f9590a)) - C2200d.m9047a(c2436b.m10038a(i).f9623b)) - C2200d.m9047a(c2436b.f9595f)));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        b m10193a(long j, AbstractC2444j abstractC2444j) {
            int mo10113c;
            long mo10111b;
            InterfaceC2455h mo10104d = this.f9764b.mo10104d();
            InterfaceC2455h mo10104d2 = abstractC2444j.mo10104d();
            if (mo10104d == null) {
                return new b(j, abstractC2444j, this.f9763a, this.f9767e, mo10104d);
            }
            if (mo10104d.mo10109a() && (mo10113c = mo10104d.mo10113c(j)) != 0) {
                long mo10110b = (mo10104d.mo10110b() + mo10113c) - 1;
                long mo10107a = mo10104d.mo10107a(mo10110b) + mo10104d.mo10108a(mo10110b, j);
                long mo10110b2 = mo10104d2.mo10110b();
                long mo10107a2 = mo10104d2.mo10107a(mo10110b2);
                long j2 = this.f9767e;
                if (mo10107a == mo10107a2) {
                    mo10111b = mo10110b + 1;
                } else {
                    if (mo10107a < mo10107a2) {
                        throw new C2504n();
                    }
                    mo10111b = mo10104d.mo10111b(mo10107a2, j);
                }
                return new b(j, abstractC2444j, this.f9763a, j2 + (mo10111b - mo10110b2), mo10104d2);
            }
            return new b(j, abstractC2444j, this.f9763a, this.f9767e, mo10104d2);
        }

        /* renamed from: a */
        b m10194a(InterfaceC2455h interfaceC2455h) {
            return new b(this.f9766d, this.f9764b, this.f9763a, this.f9767e, interfaceC2455h);
        }

        /* renamed from: b */
        public int m10195b() {
            return this.f9765c.mo10113c(this.f9766d);
        }

        /* renamed from: b */
        public long m10196b(long j) {
            return this.f9765c.mo10111b(j, this.f9766d) + this.f9767e;
        }

        /* renamed from: b */
        public long m10197b(C2436b c2436b, int i, long j) {
            int m10195b = m10195b();
            return (m10195b == -1 ? m10196b((j - C2200d.m9047a(c2436b.f9590a)) - C2200d.m9047a(c2436b.m10038a(i).f9623b)) : m10190a() + m10195b) - 1;
        }

        /* renamed from: c */
        public long m10198c(long j) {
            return this.f9765c.mo10107a(j - this.f9767e);
        }

        /* renamed from: d */
        public C2442h m10199d(long j) {
            return this.f9765c.mo10112b(j - this.f9767e);
        }
    }

    /* renamed from: d.c.a.a.j.c.j$c */
    /* loaded from: classes.dex */
    protected static final class c extends AbstractC2419b {

        /* renamed from: d */
        private final b f9768d;

        public c(b bVar, long j, long j2) {
            super(j, j2);
            this.f9768d = bVar;
        }
    }

    public C2457j(InterfaceC2582A interfaceC2582A, C2436b c2436b, int i, int[] iArr, InterfaceC2577k interfaceC2577k, int i2, InterfaceC2597k interfaceC2597k, long j, int i3, boolean z, boolean z2, C2459l.c cVar) {
        this.f9747a = interfaceC2582A;
        this.f9756j = c2436b;
        this.f9748b = iArr;
        this.f9749c = interfaceC2577k;
        this.f9750d = i2;
        this.f9751e = interfaceC2597k;
        this.f9757k = i;
        this.f9752f = j;
        this.f9753g = i3;
        this.f9754h = cVar;
        long m10040c = c2436b.m10040c(i);
        this.f9760n = -9223372036854775807L;
        ArrayList<AbstractC2444j> m10183c = m10183c();
        this.f9755i = new b[interfaceC2577k.length()];
        for (int i4 = 0; i4 < this.f9755i.length; i4++) {
            this.f9755i[i4] = new b(m10040c, i2, m10183c.get(interfaceC2577k.mo10819b(i4)), z, z2, cVar);
        }
    }

    /* renamed from: a */
    private long m10179a(long j) {
        if (this.f9756j.f9593d && this.f9760n != -9223372036854775807L) {
            return this.f9760n - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private long m10180a(b bVar, AbstractC2429l abstractC2429l, long j, long j2, long j3) {
        return abstractC2429l != null ? abstractC2429l.mo10032g() : C2622I.m11081b(bVar.m10196b(j), j2, j3);
    }

    /* renamed from: a */
    private void m10181a(b bVar, long j) {
        this.f9760n = this.f9756j.f9593d ? bVar.m10191a(j) : -9223372036854775807L;
    }

    /* renamed from: b */
    private long m10182b() {
        return (this.f9752f != 0 ? SystemClock.elapsedRealtime() + this.f9752f : System.currentTimeMillis()) * 1000;
    }

    /* renamed from: c */
    private ArrayList<AbstractC2444j> m10183c() {
        List<C2435a> list = this.f9756j.m10038a(this.f9757k).f9624c;
        ArrayList<AbstractC2444j> arrayList = new ArrayList<>();
        for (int i : this.f9748b) {
            arrayList.addAll(list.get(i).f9587c);
        }
        return arrayList;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public int mo10026a(long j, List<? extends AbstractC2429l> list) {
        return (this.f9758l != null || this.f9749c.length() < 2) ? list.size() : this.f9749c.mo10810a(j, list);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public long mo10027a(long j, C2147L c2147l) {
        for (b bVar : this.f9755i) {
            if (bVar.f9765c != null) {
                long m10196b = bVar.m10196b(j);
                long m10198c = bVar.m10198c(m10196b);
                return C2622I.m11046a(j, c2147l, m10198c, (m10198c >= j || m10196b >= ((long) (bVar.m10195b() + (-1)))) ? m10198c : bVar.m10198c(m10196b + 1));
            }
        }
        return j;
    }

    /* renamed from: a */
    protected AbstractC2421d m10184a(b bVar, InterfaceC2597k interfaceC2597k, int i, C2676s c2676s, int i2, Object obj, long j, int i3, long j2) {
        AbstractC2444j abstractC2444j = bVar.f9764b;
        long m10198c = bVar.m10198c(j);
        C2442h m10199d = bVar.m10199d(j);
        String str = abstractC2444j.f9638d;
        if (bVar.f9763a == null) {
            return new C2432o(interfaceC2597k, new C2600n(m10199d.m10098a(str), m10199d.f9631a, m10199d.f9632b, abstractC2444j.mo10103c()), c2676s, i2, obj, m10198c, bVar.m10191a(j), j, i, c2676s);
        }
        int i4 = 1;
        C2442h c2442h = m10199d;
        int i5 = 1;
        while (i4 < i3) {
            C2442h m10099a = c2442h.m10099a(bVar.m10199d(i4 + j), str);
            if (m10099a == null) {
                break;
            }
            i5++;
            i4++;
            c2442h = m10099a;
        }
        long m10191a = bVar.m10191a((i5 + j) - 1);
        long j3 = bVar.f9766d;
        return new C2426i(interfaceC2597k, new C2600n(c2442h.m10098a(str), c2442h.f9631a, c2442h.f9632b, abstractC2444j.mo10103c()), c2676s, i2, obj, m10198c, m10191a, j2, (j3 == -9223372036854775807L || j3 > m10191a) ? -9223372036854775807L : j3, j, i5, -abstractC2444j.f9639e, bVar.f9763a);
    }

    /* renamed from: a */
    protected AbstractC2421d m10185a(b bVar, InterfaceC2597k interfaceC2597k, C2676s c2676s, int i, Object obj, C2442h c2442h, C2442h c2442h2) {
        String str = bVar.f9764b.f9638d;
        if (c2442h != null && (c2442h2 = c2442h.m10099a(c2442h2, str)) == null) {
            c2442h2 = c2442h;
        }
        return new C2428k(interfaceC2597k, new C2600n(c2442h2.m10098a(str), c2442h2.f9631a, c2442h2.f9632b, bVar.f9764b.mo10103c()), c2676s, i, obj, bVar.f9763a);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public void mo10028a() {
        IOException iOException = this.f9758l;
        if (iOException != null) {
            throw iOException;
        }
        this.f9747a.mo10177a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public void mo10029a(long j, long j2, List<? extends AbstractC2429l> list, C2423f c2423f) {
        InterfaceC2431n[] interfaceC2431nArr;
        int i;
        long j3;
        if (this.f9758l != null) {
            return;
        }
        long j4 = j2 - j;
        long m10179a = m10179a(j);
        long m9047a = C2200d.m9047a(this.f9756j.f9590a) + C2200d.m9047a(this.f9756j.m10038a(this.f9757k).f9623b) + j2;
        C2459l.c cVar = this.f9754h;
        if (cVar == null || !cVar.m10224a(m9047a)) {
            long m10182b = m10182b();
            AbstractC2429l abstractC2429l = list.isEmpty() ? null : list.get(list.size() - 1);
            InterfaceC2431n[] interfaceC2431nArr2 = new InterfaceC2431n[this.f9749c.length()];
            int i2 = 0;
            while (i2 < interfaceC2431nArr2.length) {
                b bVar = this.f9755i[i2];
                if (bVar.f9765c == null) {
                    interfaceC2431nArr2[i2] = InterfaceC2431n.f9578a;
                    interfaceC2431nArr = interfaceC2431nArr2;
                    i = i2;
                    j3 = m10182b;
                } else {
                    long m10192a = bVar.m10192a(this.f9756j, this.f9757k, m10182b);
                    long m10197b = bVar.m10197b(this.f9756j, this.f9757k, m10182b);
                    interfaceC2431nArr = interfaceC2431nArr2;
                    i = i2;
                    j3 = m10182b;
                    long m10180a = m10180a(bVar, abstractC2429l, j2, m10192a, m10197b);
                    if (m10180a < m10192a) {
                        interfaceC2431nArr[i] = InterfaceC2431n.f9578a;
                    } else {
                        interfaceC2431nArr[i] = new c(bVar, m10180a, m10197b);
                    }
                }
                i2 = i + 1;
                interfaceC2431nArr2 = interfaceC2431nArr;
                m10182b = j3;
            }
            long j5 = m10182b;
            this.f9749c.mo10327a(j, j4, m10179a, list, interfaceC2431nArr2);
            b bVar2 = this.f9755i[this.f9749c.mo10328b()];
            C2422e c2422e = bVar2.f9763a;
            if (c2422e != null) {
                AbstractC2444j abstractC2444j = bVar2.f9764b;
                C2442h m10106f = c2422e.m9997b() == null ? abstractC2444j.m10106f() : null;
                C2442h mo10105e = bVar2.f9765c == null ? abstractC2444j.mo10105e() : null;
                if (m10106f != null || mo10105e != null) {
                    c2423f.f9535a = m10185a(bVar2, this.f9751e, this.f9749c.mo10824f(), this.f9749c.mo10329g(), this.f9749c.mo10330h(), m10106f, mo10105e);
                    return;
                }
            }
            long j6 = bVar2.f9766d;
            boolean z = j6 != -9223372036854775807L;
            if (bVar2.m10195b() == 0) {
                c2423f.f9536b = z;
                return;
            }
            long m10192a2 = bVar2.m10192a(this.f9756j, this.f9757k, j5);
            long m10197b2 = bVar2.m10197b(this.f9756j, this.f9757k, j5);
            m10181a(bVar2, m10197b2);
            long m10180a2 = m10180a(bVar2, abstractC2429l, j2, m10192a2, m10197b2);
            if (m10180a2 < m10192a2) {
                this.f9758l = new C2504n();
                return;
            }
            if (m10180a2 > m10197b2 || (this.f9759m && m10180a2 >= m10197b2)) {
                c2423f.f9536b = z;
                return;
            }
            if (z && bVar2.m10198c(m10180a2) >= j6) {
                c2423f.f9536b = true;
                return;
            }
            int min = (int) Math.min(this.f9753g, (m10197b2 - m10180a2) + 1);
            if (j6 != -9223372036854775807L) {
                while (min > 1 && bVar2.m10198c((min + m10180a2) - 1) >= j6) {
                    min--;
                }
            }
            c2423f.f9535a = m10184a(bVar2, this.f9751e, this.f9750d, this.f9749c.mo10824f(), this.f9749c.mo10329g(), this.f9749c.mo10330h(), m10180a2, min, list.isEmpty() ? j2 : -9223372036854775807L);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public void mo10030a(AbstractC2421d abstractC2421d) {
        InterfaceC2335o m9998c;
        if (abstractC2421d instanceof C2428k) {
            int mo10814a = this.f9749c.mo10814a(((C2428k) abstractC2421d).f9513c);
            b bVar = this.f9755i[mo10814a];
            if (bVar.f9765c == null && (m9998c = bVar.f9763a.m9998c()) != null) {
                this.f9755i[mo10814a] = bVar.m10194a(new C2456i((C2230b) m9998c, bVar.f9764b.f9639e));
            }
        }
        C2459l.c cVar = this.f9754h;
        if (cVar != null) {
            cVar.m10226b(abstractC2421d);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2450c
    /* renamed from: a */
    public void mo10127a(C2436b c2436b, int i) {
        try {
            this.f9756j = c2436b;
            this.f9757k = i;
            long m10040c = this.f9756j.m10040c(this.f9757k);
            ArrayList<AbstractC2444j> m10183c = m10183c();
            for (int i2 = 0; i2 < this.f9755i.length; i2++) {
                this.f9755i[i2] = this.f9755i[i2].m10193a(m10040c, m10183c.get(this.f9749c.mo10819b(i2)));
            }
        } catch (C2504n e2) {
            this.f9758l = e2;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.InterfaceC2425h
    /* renamed from: a */
    public boolean mo10031a(AbstractC2421d abstractC2421d, boolean z, Exception exc, long j) {
        b bVar;
        int m10195b;
        if (!z) {
            return false;
        }
        C2459l.c cVar = this.f9754h;
        if (cVar != null && cVar.m10225a(abstractC2421d)) {
            return true;
        }
        if (!this.f9756j.f9593d && (abstractC2421d instanceof AbstractC2429l) && (exc instanceof InterfaceC2609w.e) && ((InterfaceC2609w.e) exc).f10842c == 404 && (m10195b = (bVar = this.f9755i[this.f9749c.mo10814a(abstractC2421d.f9513c)]).m10195b()) != -1 && m10195b != 0) {
            if (((AbstractC2429l) abstractC2421d).mo10032g() > (bVar.m10190a() + m10195b) - 1) {
                this.f9759m = true;
                return true;
            }
        }
        if (j == -9223372036854775807L) {
            return false;
        }
        InterfaceC2577k interfaceC2577k = this.f9749c;
        return interfaceC2577k.mo10818a(interfaceC2577k.mo10814a(abstractC2421d.f9513c), j);
    }
}
