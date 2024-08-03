package p139d.p225c.p226a.p227a.p250j.p255d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2405F;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2508r;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p255d.C2483n;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.j.d.k */
/* loaded from: classes.dex */
public final class C2480k implements InterfaceC2514x, C2483n.a, InterfaceC2470i.b {

    /* renamed from: a */
    private final InterfaceC2477h f9966a;

    /* renamed from: b */
    private final InterfaceC2470i f9967b;

    /* renamed from: c */
    private final InterfaceC2476g f9968c;

    /* renamed from: d */
    private final InterfaceC2586E f9969d;

    /* renamed from: e */
    private final InterfaceC2610x f9970e;

    /* renamed from: f */
    private final InterfaceC2516z.a f9971f;

    /* renamed from: g */
    private final InterfaceC2590d f9972g;

    /* renamed from: j */
    private final InterfaceC2508r f9975j;

    /* renamed from: k */
    private final boolean f9976k;

    /* renamed from: l */
    private InterfaceC2514x.a f9977l;

    /* renamed from: m */
    private int f9978m;

    /* renamed from: n */
    private C2413N f9979n;

    /* renamed from: q */
    private InterfaceC2405F f9982q;

    /* renamed from: r */
    private boolean f9983r;

    /* renamed from: h */
    private final IdentityHashMap<InterfaceC2404E, Integer> f9973h = new IdentityHashMap<>();

    /* renamed from: i */
    private final C2485p f9974i = new C2485p();

    /* renamed from: o */
    private C2483n[] f9980o = new C2483n[0];

    /* renamed from: p */
    private C2483n[] f9981p = new C2483n[0];

    public C2480k(InterfaceC2477h interfaceC2477h, InterfaceC2470i interfaceC2470i, InterfaceC2476g interfaceC2476g, InterfaceC2586E interfaceC2586E, InterfaceC2610x interfaceC2610x, InterfaceC2516z.a aVar, InterfaceC2590d interfaceC2590d, InterfaceC2508r interfaceC2508r, boolean z) {
        this.f9966a = interfaceC2477h;
        this.f9967b = interfaceC2470i;
        this.f9968c = interfaceC2476g;
        this.f9969d = interfaceC2586E;
        this.f9970e = interfaceC2610x;
        this.f9971f = aVar;
        this.f9972g = interfaceC2590d;
        this.f9975j = interfaceC2508r;
        this.f9976k = z;
        this.f9982q = interfaceC2508r.mo10449a(new InterfaceC2405F[0]);
        aVar.m10491a();
    }

    /* renamed from: a */
    private C2483n m10337a(int i, C2465d.a[] aVarArr, C2676s c2676s, List<C2676s> list, long j) {
        return new C2483n(i, this, new C2475f(this.f9966a, this.f9967b, aVarArr, this.f9968c, this.f9969d, this.f9974i, list), this.f9972g, j, c2676s, this.f9970e, this.f9971f);
    }

    /* renamed from: a */
    private static C2676s m10338a(C2676s c2676s) {
        String m11053a = C2622I.m11053a(c2676s.f11179d, 2);
        return C2676s.m11431a(c2676s.f11176a, c2676s.f11177b, c2676s.f11181f, C2641r.m11168c(m11053a), m11053a, c2676s.f11178c, c2676s.f11187l, c2676s.f11188m, c2676s.f11189n, (List<byte[]>) null, c2676s.f11200y);
    }

    /* renamed from: a */
    private static C2676s m10339a(C2676s c2676s, C2676s c2676s2, boolean z) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        if (c2676s2 != null) {
            String str4 = c2676s2.f11179d;
            int i3 = c2676s2.f11195t;
            int i4 = c2676s2.f11200y;
            String str5 = c2676s2.f11201z;
            str2 = c2676s2.f11177b;
            str = str4;
            i = i3;
            i2 = i4;
            str3 = str5;
        } else {
            String m11053a = C2622I.m11053a(c2676s.f11179d, 1);
            if (z) {
                int i5 = c2676s.f11195t;
                int i6 = c2676s.f11200y;
                str = m11053a;
                i = i5;
                str2 = c2676s.f11177b;
                str3 = str2;
                i2 = i6;
            } else {
                str = m11053a;
                str2 = null;
                str3 = null;
                i = -1;
                i2 = 0;
            }
        }
        return C2676s.m11432a(c2676s.f11176a, str2, c2676s.f11181f, C2641r.m11168c(str), str, z ? c2676s.f11178c : -1, i, -1, (List<byte[]>) null, i2, str3);
    }

    /* renamed from: a */
    private void m10340a(C2465d c2465d, long j) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(c2465d.f9831e);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            C2465d.a aVar = (C2465d.a) arrayList2.get(i);
            C2676s c2676s = aVar.f9838b;
            if (c2676s.f11188m > 0 || C2622I.m11053a(c2676s.f11179d, 2) != null) {
                arrayList3.add(aVar);
            } else if (C2622I.m11053a(c2676s.f11179d, 1) != null) {
                arrayList4.add(aVar);
            }
        }
        if (arrayList3.isEmpty()) {
            if (arrayList4.size() < arrayList2.size()) {
                arrayList2.removeAll(arrayList4);
            }
            arrayList = arrayList2;
        } else {
            arrayList = arrayList3;
        }
        C2628e.m11111a(!arrayList.isEmpty());
        C2465d.a[] aVarArr = (C2465d.a[]) arrayList.toArray(new C2465d.a[0]);
        String str = aVarArr[0].f9838b.f11179d;
        C2483n m10337a = m10337a(0, aVarArr, c2465d.f9834h, c2465d.f9835i, j);
        this.f9980o[0] = m10337a;
        if (!this.f9976k || str == null) {
            m10337a.m10371a(true);
            m10337a.m10376c();
            return;
        }
        boolean z = C2622I.m11053a(str, 2) != null;
        boolean z2 = C2622I.m11053a(str, 1) != null;
        ArrayList arrayList5 = new ArrayList();
        if (z) {
            C2676s[] c2676sArr = new C2676s[arrayList.size()];
            for (int i2 = 0; i2 < c2676sArr.length; i2++) {
                c2676sArr[i2] = m10338a(aVarArr[i2].f9838b);
            }
            arrayList5.add(new C2411L(c2676sArr));
            if (z2 && (c2465d.f9834h != null || c2465d.f9832f.isEmpty())) {
                arrayList5.add(new C2411L(m10339a(aVarArr[0].f9838b, c2465d.f9834h, false)));
            }
            List<C2676s> list = c2465d.f9835i;
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    arrayList5.add(new C2411L(list.get(i3)));
                }
            }
        } else {
            if (!z2) {
                throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
            }
            C2676s[] c2676sArr2 = new C2676s[arrayList.size()];
            for (int i4 = 0; i4 < c2676sArr2.length; i4++) {
                c2676sArr2[i4] = m10339a(aVarArr[i4].f9838b, c2465d.f9834h, true);
            }
            arrayList5.add(new C2411L(c2676sArr2));
        }
        C2411L c2411l = new C2411L(C2676s.m11430a("ID3", "application/id3", (String) null, -1, (C2213m) null));
        arrayList5.add(c2411l);
        m10337a.m10370a(new C2413N((C2411L[]) arrayList5.toArray(new C2411L[0])), 0, new C2413N(c2411l));
    }

    /* renamed from: d */
    private void m10341d(long j) {
        C2465d mo10258c = this.f9967b.mo10258c();
        List<C2465d.a> list = mo10258c.f9832f;
        List<C2465d.a> list2 = mo10258c.f9833g;
        int size = list.size() + 1 + list2.size();
        this.f9980o = new C2483n[size];
        this.f9978m = size;
        m10340a(mo10258c, j);
        char c2 = 0;
        int i = 0;
        int i2 = 1;
        while (i < list.size()) {
            C2465d.a aVar = list.get(i);
            C2465d.a[] aVarArr = new C2465d.a[1];
            aVarArr[c2] = aVar;
            C2483n m10337a = m10337a(1, aVarArr, (C2676s) null, Collections.emptyList(), j);
            int i3 = i2 + 1;
            this.f9980o[i2] = m10337a;
            C2676s c2676s = aVar.f9838b;
            if (!this.f9976k || c2676s.f11179d == null) {
                m10337a.m10376c();
            } else {
                m10337a.m10370a(new C2413N(new C2411L(c2676s)), 0, C2413N.f9484a);
            }
            i++;
            i2 = i3;
            c2 = 0;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            C2465d.a aVar2 = list2.get(i4);
            C2483n m10337a2 = m10337a(3, new C2465d.a[]{aVar2}, (C2676s) null, Collections.emptyList(), j);
            this.f9980o[i2] = m10337a2;
            m10337a2.m10370a(new C2413N(new C2411L(aVar2.f9838b)), 0, C2413N.f9484a);
            i4++;
            i2++;
        }
        this.f9981p = this.f9980o;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9874a(long j) {
        C2483n[] c2483nArr = this.f9981p;
        if (c2483nArr.length > 0) {
            boolean m10375b = c2483nArr[0].m10375b(j, false);
            int i = 1;
            while (true) {
                C2483n[] c2483nArr2 = this.f9981p;
                if (i >= c2483nArr2.length) {
                    break;
                }
                c2483nArr2[i].m10375b(j, m10375b);
                i++;
            }
            if (m10375b) {
                this.f9974i.m10385a();
            }
        }
        return j;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:            if (r11 != r8[0]) goto L62;     */
    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo9876a(p139d.p225c.p226a.p227a.p268l.InterfaceC2577k[] r21, boolean[] r22, p139d.p225c.p226a.p227a.p250j.InterfaceC2404E[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p255d.C2480k.mo9876a(d.c.a.a.l.k[], boolean[], d.c.a.a.j.E[], boolean[], long):long");
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.C2483n.a
    /* renamed from: a */
    public void mo10342a() {
        int i = this.f9978m - 1;
        this.f9978m = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C2483n c2483n : this.f9980o) {
            i2 += c2483n.m10380f().f9485b;
        }
        C2411L[] c2411lArr = new C2411L[i2];
        C2483n[] c2483nArr = this.f9980o;
        int length = c2483nArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            C2483n c2483n2 = c2483nArr[i3];
            int i5 = c2483n2.m10380f().f9485b;
            int i6 = i4;
            int i7 = 0;
            while (i7 < i5) {
                c2411lArr[i6] = c2483n2.m10380f().m9978a(i7);
                i7++;
                i6++;
            }
            i3++;
            i4 = i6;
        }
        this.f9979n = new C2413N(c2411lArr);
        this.f9977l.mo10485a((InterfaceC2514x) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
        for (C2483n c2483n : this.f9981p) {
            c2483n.m10369a(j, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.C2483n.a
    /* renamed from: a */
    public void mo10343a(C2465d.a aVar) {
        this.f9967b.mo10253a(aVar);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9878a(C2483n c2483n) {
        this.f9977l.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        this.f9977l = aVar;
        this.f9967b.mo10255b(this);
        m10341d(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i.b
    /* renamed from: a */
    public boolean mo10297a(C2465d.a aVar, long j) {
        boolean z = true;
        for (C2483n c2483n : this.f9980o) {
            z &= c2483n.m10372a(aVar, j);
        }
        this.f9977l.mo9878a((InterfaceC2514x.a) this);
        return z;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        return this.f9982q.mo9880b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        if (this.f9979n != null) {
            return this.f9982q.mo9882b(j);
        }
        for (C2483n c2483n : this.f9980o) {
            c2483n.m10376c();
        }
        return false;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i.b
    /* renamed from: c */
    public void mo10298c() {
        this.f9977l.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
        this.f9982q.mo9883c(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
        for (C2483n c2483n : this.f9980o) {
            c2483n.m10378d();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        if (this.f9983r) {
            return -9223372036854775807L;
        }
        this.f9971f.m10517c();
        this.f9983r = true;
        return -9223372036854775807L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return this.f9979n;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        return this.f9982q.mo9887g();
    }

    /* renamed from: h */
    public void m10344h() {
        this.f9967b.mo10254a(this);
        for (C2483n c2483n : this.f9980o) {
            c2483n.m10382j();
        }
        this.f9977l = null;
        this.f9971f.m10510b();
    }
}
