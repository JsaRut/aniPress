package p139d.p225c.p226a.p227a.p250j.p253c;

import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.C2511u;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2405F;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2508r;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p252b.C2424g;
import p139d.p225c.p226a.p227a.p250j.p253c.C2459l;
import p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2450c;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2444j;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2435a;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2436b;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2438d;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2439e;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2440f;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2582A;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;

/* renamed from: d.c.a.a.j.c.e */
/* loaded from: classes.dex */
final class C2452e implements InterfaceC2514x, InterfaceC2405F.a<C2424g<InterfaceC2450c>>, C2424g.b<InterfaceC2450c> {

    /* renamed from: a */
    final int f9669a;

    /* renamed from: b */
    private final InterfaceC2450c.a f9670b;

    /* renamed from: c */
    private final InterfaceC2586E f9671c;

    /* renamed from: d */
    private final InterfaceC2610x f9672d;

    /* renamed from: e */
    private final long f9673e;

    /* renamed from: f */
    private final InterfaceC2582A f9674f;

    /* renamed from: g */
    private final InterfaceC2590d f9675g;

    /* renamed from: h */
    private final C2413N f9676h;

    /* renamed from: i */
    private final a[] f9677i;

    /* renamed from: j */
    private final InterfaceC2508r f9678j;

    /* renamed from: k */
    private final C2459l f9679k;

    /* renamed from: m */
    private final InterfaceC2516z.a f9681m;

    /* renamed from: n */
    private InterfaceC2514x.a f9682n;

    /* renamed from: q */
    private InterfaceC2405F f9685q;

    /* renamed from: r */
    private C2436b f9686r;

    /* renamed from: s */
    private int f9687s;

    /* renamed from: t */
    private List<C2439e> f9688t;

    /* renamed from: u */
    private boolean f9689u;

    /* renamed from: o */
    private C2424g<InterfaceC2450c>[] f9683o = m10141a(0);

    /* renamed from: p */
    private C2458k[] f9684p = new C2458k[0];

    /* renamed from: l */
    private final IdentityHashMap<C2424g<InterfaceC2450c>, C2459l.c> f9680l = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int[] f9690a;

        /* renamed from: b */
        public final int f9691b;

        /* renamed from: c */
        public final int f9692c;

        /* renamed from: d */
        public final int f9693d;

        /* renamed from: e */
        public final int f9694e;

        /* renamed from: f */
        public final int f9695f;

        /* renamed from: g */
        public final int f9696g;

        private a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f9691b = i;
            this.f9690a = iArr;
            this.f9692c = i2;
            this.f9694e = i3;
            this.f9695f = i4;
            this.f9696g = i5;
            this.f9693d = i6;
        }

        /* renamed from: a */
        public static a m10147a(int i) {
            return new a(4, 2, null, -1, -1, -1, i);
        }

        /* renamed from: a */
        public static a m10148a(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }

        /* renamed from: a */
        public static a m10149a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static a m10150b(int[] iArr, int i) {
            return new a(4, 1, iArr, i, -1, -1, -1);
        }
    }

    public C2452e(int i, C2436b c2436b, int i2, InterfaceC2450c.a aVar, InterfaceC2586E interfaceC2586E, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar2, long j, InterfaceC2582A interfaceC2582A, InterfaceC2590d interfaceC2590d, InterfaceC2508r interfaceC2508r, C2459l.b bVar) {
        this.f9669a = i;
        this.f9686r = c2436b;
        this.f9687s = i2;
        this.f9670b = aVar;
        this.f9671c = interfaceC2586E;
        this.f9672d = interfaceC2610x;
        this.f9681m = aVar2;
        this.f9673e = j;
        this.f9674f = interfaceC2582A;
        this.f9675g = interfaceC2590d;
        this.f9678j = interfaceC2508r;
        this.f9679k = new C2459l(c2436b, bVar, interfaceC2590d);
        this.f9685q = interfaceC2508r.mo10449a(this.f9683o);
        C2440f m10038a = c2436b.m10038a(i2);
        this.f9688t = m10038a.f9625d;
        Pair<C2413N, a[]> m10132a = m10132a(m10038a.f9624c, this.f9688t);
        this.f9676h = (C2413N) m10132a.first;
        this.f9677i = (a[]) m10132a.second;
        aVar2.m10491a();
    }

    /* renamed from: a */
    private static int m10129a(int i, List<C2435a> list, int[][] iArr, boolean[] zArr, boolean[] zArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m10142b(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            if (m10139a(list, iArr[i3])) {
                zArr2[i3] = true;
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private int m10130a(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f9677i[i2].f9694e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f9677i[i5].f9692c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static int m10131a(List<C2435a> list, int[][] iArr, int i, boolean[] zArr, boolean[] zArr2, C2411L[] c2411lArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).f9587c);
            }
            C2676s[] c2676sArr = new C2676s[arrayList.size()];
            for (int i7 = 0; i7 < c2676sArr.length; i7++) {
                c2676sArr[i7] = ((AbstractC2444j) arrayList.get(i7)).f9637c;
            }
            C2435a c2435a = list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8 + 1;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (zArr2[i4]) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            c2411lArr[i5] = new C2411L(c2676sArr);
            aVarArr[i5] = a.m10148a(c2435a.f9586b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                c2411lArr[i8] = new C2411L(C2676s.m11430a(c2435a.f9585a + ":emsg", "application/x-emsg", (String) null, -1, (C2213m) null));
                aVarArr[i8] = a.m10150b(iArr2, i5);
            }
            if (i2 != -1) {
                c2411lArr[i2] = new C2411L(C2676s.m11419a(c2435a.f9585a + ":cea608", "application/cea-608", 0, null));
                aVarArr[i2] = a.m10149a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: a */
    private static Pair<C2413N, a[]> m10132a(List<C2435a> list, List<C2439e> list2) {
        int[][] m10143b = m10143b(list);
        int length = m10143b.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        int m10129a = m10129a(length, list, m10143b, zArr, zArr2) + length + list2.size();
        C2411L[] c2411lArr = new C2411L[m10129a];
        a[] aVarArr = new a[m10129a];
        m10135a(list2, c2411lArr, aVarArr, m10131a(list, m10143b, length, zArr, zArr2, c2411lArr, aVarArr));
        return Pair.create(new C2413N(c2411lArr), aVarArr);
    }

    /* renamed from: a */
    private C2424g<InterfaceC2450c> m10133a(a aVar, InterfaceC2577k interfaceC2577k, long j) {
        int i;
        int[] iArr = new int[2];
        C2676s[] c2676sArr = new C2676s[2];
        boolean z = aVar.f9695f != -1;
        if (z) {
            c2676sArr[0] = this.f9676h.m9978a(aVar.f9695f).m9976a(0);
            iArr[0] = 4;
            i = 1;
        } else {
            i = 0;
        }
        boolean z2 = aVar.f9696g != -1;
        if (z2) {
            c2676sArr[i] = this.f9676h.m9978a(aVar.f9696g).m9976a(0);
            iArr[i] = 3;
            i++;
        }
        if (i < iArr.length) {
            c2676sArr = (C2676s[]) Arrays.copyOf(c2676sArr, i);
            iArr = Arrays.copyOf(iArr, i);
        }
        C2676s[] c2676sArr2 = c2676sArr;
        int[] iArr2 = iArr;
        C2459l.c m10213a = (this.f9686r.f9593d && z) ? this.f9679k.m10213a() : null;
        C2424g<InterfaceC2450c> c2424g = new C2424g<>(aVar.f9691b, iArr2, c2676sArr2, this.f9670b.mo10128a(this.f9674f, this.f9686r, this.f9687s, aVar.f9690a, interfaceC2577k, aVar.f9691b, this.f9673e, z, z2, m10213a, this.f9671c), this, this.f9675g, j, this.f9672d, this.f9681m);
        synchronized (this) {
            this.f9680l.put(c2424g, m10213a);
        }
        return c2424g;
    }

    /* renamed from: a */
    private static C2438d m10134a(List<C2438d> list) {
        for (int i = 0; i < list.size(); i++) {
            C2438d c2438d = list.get(i);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(c2438d.f9614a)) {
                return c2438d;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m10135a(List<C2439e> list, C2411L[] c2411lArr, a[] aVarArr, int i) {
        int i2 = i;
        int i3 = 0;
        while (i3 < list.size()) {
            c2411lArr[i2] = new C2411L(C2676s.m11430a(list.get(i3).m10096a(), "application/x-emsg", (String) null, -1, (C2213m) null));
            aVarArr[i2] = a.m10147a(i3);
            i3++;
            i2++;
        }
    }

    /* renamed from: a */
    private void m10136a(InterfaceC2577k[] interfaceC2577kArr, InterfaceC2404E[] interfaceC2404EArr, int[] iArr) {
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            if ((interfaceC2404EArr[i] instanceof C2511u) || (interfaceC2404EArr[i] instanceof C2424g.a)) {
                int m10130a = m10130a(i, iArr);
                if (!(m10130a == -1 ? interfaceC2404EArr[i] instanceof C2511u : (interfaceC2404EArr[i] instanceof C2424g.a) && ((C2424g.a) interfaceC2404EArr[i]).f9559a == interfaceC2404EArr[m10130a])) {
                    if (interfaceC2404EArr[i] instanceof C2424g.a) {
                        ((C2424g.a) interfaceC2404EArr[i]).m10024b();
                    }
                    interfaceC2404EArr[i] = null;
                }
            }
        }
    }

    /* renamed from: a */
    private void m10137a(InterfaceC2577k[] interfaceC2577kArr, InterfaceC2404E[] interfaceC2404EArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            if (interfaceC2404EArr[i] == null && interfaceC2577kArr[i] != null) {
                zArr[i] = true;
                a aVar = this.f9677i[iArr[i]];
                int i2 = aVar.f9692c;
                if (i2 == 0) {
                    interfaceC2404EArr[i] = m10133a(aVar, interfaceC2577kArr[i], j);
                } else if (i2 == 2) {
                    interfaceC2404EArr[i] = new C2458k(this.f9688t.get(aVar.f9693d), interfaceC2577kArr[i].mo10815a().m9976a(0), this.f9686r.f9593d);
                }
            }
        }
        for (int i3 = 0; i3 < interfaceC2577kArr.length; i3++) {
            if (interfaceC2404EArr[i3] == null && interfaceC2577kArr[i3] != null) {
                a aVar2 = this.f9677i[iArr[i3]];
                if (aVar2.f9692c == 1) {
                    int m10130a = m10130a(i3, iArr);
                    if (m10130a == -1) {
                        interfaceC2404EArr[i3] = new C2511u();
                    } else {
                        interfaceC2404EArr[i3] = ((C2424g) interfaceC2404EArr[m10130a]).m10015a(j, aVar2.f9691b);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m10138a(InterfaceC2577k[] interfaceC2577kArr, boolean[] zArr, InterfaceC2404E[] interfaceC2404EArr) {
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            if (interfaceC2577kArr[i] == null || !zArr[i]) {
                if (interfaceC2404EArr[i] instanceof C2424g) {
                    ((C2424g) interfaceC2404EArr[i]).m10018a(this);
                } else if (interfaceC2404EArr[i] instanceof C2424g.a) {
                    ((C2424g.a) interfaceC2404EArr[i]).m10024b();
                }
                interfaceC2404EArr[i] = null;
            }
        }
    }

    /* renamed from: a */
    private static boolean m10139a(List<C2435a> list, int[] iArr) {
        for (int i : iArr) {
            List<C2438d> list2 = list.get(i).f9588d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if ("urn:scte:dash:cc:cea-608:2015".equals(list2.get(i2).f9614a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private int[] m10140a(InterfaceC2577k[] interfaceC2577kArr) {
        int[] iArr = new int[interfaceC2577kArr.length];
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            if (interfaceC2577kArr[i] != null) {
                iArr[i] = this.f9676h.m9977a(interfaceC2577kArr[i].mo10815a());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static C2424g<InterfaceC2450c>[] m10141a(int i) {
        return new C2424g[i];
    }

    /* renamed from: b */
    private static boolean m10142b(List<C2435a> list, int[] iArr) {
        for (int i : iArr) {
            List<AbstractC2444j> list2 = list.get(i).f9587c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f9640f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static int[][] m10143b(List<C2435a> list) {
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(list.get(i).f9585a, i);
        }
        int[][] iArr = new int[size];
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!zArr[i3]) {
                zArr[i3] = true;
                C2438d m10134a = m10134a(list.get(i3).f9589e);
                if (m10134a == null) {
                    int[] iArr2 = new int[1];
                    iArr2[0] = i3;
                    iArr[i2] = iArr2;
                    i2++;
                } else {
                    String[] split = m10134a.f9615b.split(",");
                    int[] iArr3 = new int[split.length + 1];
                    iArr3[0] = i3;
                    int i4 = 0;
                    while (i4 < split.length) {
                        int i5 = sparseIntArray.get(Integer.parseInt(split[i4]));
                        zArr[i5] = true;
                        i4++;
                        iArr3[i4] = i5;
                    }
                    iArr[i2] = iArr3;
                    i2++;
                }
            }
        }
        return i2 < size ? (int[][]) Arrays.copyOf(iArr, i2) : iArr;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9874a(long j) {
        for (C2424g<InterfaceC2450c> c2424g : this.f9683o) {
            c2424g.m10016a(j);
        }
        for (C2458k c2458k : this.f9684p) {
            c2458k.m10200a(j);
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        for (C2424g<InterfaceC2450c> c2424g : this.f9683o) {
            if (c2424g.f9537a == 2) {
                return c2424g.m10014a(j, c2147l);
            }
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9876a(InterfaceC2577k[] interfaceC2577kArr, boolean[] zArr, InterfaceC2404E[] interfaceC2404EArr, boolean[] zArr2, long j) {
        int[] m10140a = m10140a(interfaceC2577kArr);
        m10138a(interfaceC2577kArr, zArr, interfaceC2404EArr);
        m10136a(interfaceC2577kArr, interfaceC2404EArr, m10140a);
        m10137a(interfaceC2577kArr, interfaceC2404EArr, zArr2, j, m10140a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC2404E interfaceC2404E : interfaceC2404EArr) {
            if (interfaceC2404E instanceof C2424g) {
                arrayList.add((C2424g) interfaceC2404E);
            } else if (interfaceC2404E instanceof C2458k) {
                arrayList2.add((C2458k) interfaceC2404E);
            }
        }
        this.f9683o = m10141a(arrayList.size());
        arrayList.toArray(this.f9683o);
        this.f9684p = new C2458k[arrayList2.size()];
        arrayList2.toArray(this.f9684p);
        this.f9685q = this.f9678j.mo10449a(this.f9683o);
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
        for (C2424g<InterfaceC2450c> c2424g : this.f9683o) {
            c2424g.m10017a(j, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.C2424g.b
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public synchronized void mo10025a(C2424g<InterfaceC2450c> c2424g) {
        C2459l.c remove = this.f9680l.remove(c2424g);
        if (remove != null) {
            remove.m10223a();
        }
    }

    /* renamed from: a */
    public void m10144a(C2436b c2436b, int i) {
        this.f9686r = c2436b;
        this.f9687s = i;
        this.f9679k.m10214a(c2436b);
        C2424g<InterfaceC2450c>[] c2424gArr = this.f9683o;
        if (c2424gArr != null) {
            for (C2424g<InterfaceC2450c> c2424g : c2424gArr) {
                c2424g.m10020i().mo10127a(c2436b, i);
            }
            this.f9682n.mo9878a((InterfaceC2514x.a) this);
        }
        this.f9688t = c2436b.m10038a(i).f9625d;
        for (C2458k c2458k : this.f9684p) {
            Iterator<C2439e> it = this.f9688t.iterator();
            while (true) {
                if (it.hasNext()) {
                    C2439e next = it.next();
                    if (next.m10096a().equals(c2458k.m10202b())) {
                        c2458k.m10201a(next, c2436b.f9593d && i == c2436b.m10037a() - 1);
                    }
                }
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        this.f9682n = aVar;
        aVar.mo10485a((InterfaceC2514x) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        return this.f9685q.mo9880b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9878a(C2424g<InterfaceC2450c> c2424g) {
        this.f9682n.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        return this.f9685q.mo9882b(j);
    }

    /* renamed from: c */
    public void m10146c() {
        this.f9679k.m10217b();
        for (C2424g<InterfaceC2450c> c2424g : this.f9683o) {
            c2424g.m10018a(this);
        }
        this.f9682n = null;
        this.f9681m.m10510b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
        this.f9685q.mo9883c(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
        this.f9674f.mo10177a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        if (this.f9689u) {
            return -9223372036854775807L;
        }
        this.f9681m.m10517c();
        this.f9689u = true;
        return -9223372036854775807L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return this.f9676h;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        return this.f9685q.mo9887g();
    }
}
