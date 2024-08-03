package p139d.p225c.p226a.p227a.p250j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.A */
/* loaded from: classes.dex */
final class C2400A implements InterfaceC2514x, InterfaceC2514x.a {

    /* renamed from: a */
    public final InterfaceC2514x[] f9383a;

    /* renamed from: c */
    private final InterfaceC2508r f9385c;

    /* renamed from: e */
    private InterfaceC2514x.a f9387e;

    /* renamed from: f */
    private C2413N f9388f;

    /* renamed from: g */
    private InterfaceC2514x[] f9389g;

    /* renamed from: h */
    private InterfaceC2405F f9390h;

    /* renamed from: d */
    private final ArrayList<InterfaceC2514x> f9386d = new ArrayList<>();

    /* renamed from: b */
    private final IdentityHashMap<InterfaceC2404E, Integer> f9384b = new IdentityHashMap<>();

    public C2400A(InterfaceC2508r interfaceC2508r, InterfaceC2514x... interfaceC2514xArr) {
        this.f9385c = interfaceC2508r;
        this.f9383a = interfaceC2514xArr;
        this.f9390h = interfaceC2508r.mo10449a(new InterfaceC2405F[0]);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9874a(long j) {
        long mo9874a = this.f9389g[0].mo9874a(j);
        int i = 1;
        while (true) {
            InterfaceC2514x[] interfaceC2514xArr = this.f9389g;
            if (i >= interfaceC2514xArr.length) {
                return mo9874a;
            }
            if (interfaceC2514xArr[i].mo9874a(mo9874a) != mo9874a) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        return this.f9389g[0].mo9875a(j, c2147l);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9876a(InterfaceC2577k[] interfaceC2577kArr, boolean[] zArr, InterfaceC2404E[] interfaceC2404EArr, boolean[] zArr2, long j) {
        int[] iArr = new int[interfaceC2577kArr.length];
        int[] iArr2 = new int[interfaceC2577kArr.length];
        for (int i = 0; i < interfaceC2577kArr.length; i++) {
            iArr[i] = interfaceC2404EArr[i] == null ? -1 : this.f9384b.get(interfaceC2404EArr[i]).intValue();
            iArr2[i] = -1;
            if (interfaceC2577kArr[i] != null) {
                C2411L mo10815a = interfaceC2577kArr[i].mo10815a();
                int i2 = 0;
                while (true) {
                    InterfaceC2514x[] interfaceC2514xArr = this.f9383a;
                    if (i2 >= interfaceC2514xArr.length) {
                        break;
                    }
                    if (interfaceC2514xArr[i2].mo9886f().m9977a(mo10815a) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.f9384b.clear();
        InterfaceC2404E[] interfaceC2404EArr2 = new InterfaceC2404E[interfaceC2577kArr.length];
        InterfaceC2404E[] interfaceC2404EArr3 = new InterfaceC2404E[interfaceC2577kArr.length];
        InterfaceC2577k[] interfaceC2577kArr2 = new InterfaceC2577k[interfaceC2577kArr.length];
        ArrayList arrayList = new ArrayList(this.f9383a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f9383a.length) {
            for (int i4 = 0; i4 < interfaceC2577kArr.length; i4++) {
                InterfaceC2577k interfaceC2577k = null;
                interfaceC2404EArr3[i4] = iArr[i4] == i3 ? interfaceC2404EArr[i4] : null;
                if (iArr2[i4] == i3) {
                    interfaceC2577k = interfaceC2577kArr[i4];
                }
                interfaceC2577kArr2[i4] = interfaceC2577k;
            }
            InterfaceC2577k[] interfaceC2577kArr3 = interfaceC2577kArr2;
            ArrayList arrayList2 = arrayList;
            InterfaceC2577k[] interfaceC2577kArr4 = interfaceC2577kArr2;
            int i5 = i3;
            long mo9876a = this.f9383a[i3].mo9876a(interfaceC2577kArr3, zArr, interfaceC2404EArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = mo9876a;
            } else if (mo9876a != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < interfaceC2577kArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    C2628e.m11113b(interfaceC2404EArr3[i6] != null);
                    interfaceC2404EArr2[i6] = interfaceC2404EArr3[i6];
                    this.f9384b.put(interfaceC2404EArr3[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    C2628e.m11113b(interfaceC2404EArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f9383a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            interfaceC2577kArr2 = interfaceC2577kArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC2404EArr2, 0, interfaceC2404EArr, 0, interfaceC2404EArr2.length);
        this.f9389g = new InterfaceC2514x[arrayList3.size()];
        arrayList3.toArray(this.f9389g);
        this.f9390h = this.f9385c.mo10449a(this.f9389g);
        return j2;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
        for (InterfaceC2514x interfaceC2514x : this.f9389g) {
            interfaceC2514x.mo9877a(j, z);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        this.f9387e = aVar;
        Collections.addAll(this.f9386d, this.f9383a);
        for (InterfaceC2514x interfaceC2514x : this.f9383a) {
            interfaceC2514x.mo9879a(this, j);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x.a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void mo10485a(InterfaceC2514x interfaceC2514x) {
        this.f9386d.remove(interfaceC2514x);
        if (this.f9386d.isEmpty()) {
            int i = 0;
            for (InterfaceC2514x interfaceC2514x2 : this.f9383a) {
                i += interfaceC2514x2.mo9886f().f9485b;
            }
            C2411L[] c2411lArr = new C2411L[i];
            InterfaceC2514x[] interfaceC2514xArr = this.f9383a;
            int length = interfaceC2514xArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                C2413N mo9886f = interfaceC2514xArr[i2].mo9886f();
                int i4 = mo9886f.f9485b;
                int i5 = i3;
                int i6 = 0;
                while (i6 < i4) {
                    c2411lArr[i5] = mo9886f.m9978a(i6);
                    i6++;
                    i5++;
                }
                i2++;
                i3 = i5;
            }
            this.f9388f = new C2413N(c2411lArr);
            this.f9387e.mo10485a((InterfaceC2514x) this);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        return this.f9390h.mo9880b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9878a(InterfaceC2514x interfaceC2514x) {
        this.f9387e.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        if (this.f9386d.isEmpty()) {
            return this.f9390h.mo9882b(j);
        }
        int size = this.f9386d.size();
        for (int i = 0; i < size; i++) {
            this.f9386d.get(i).mo9882b(j);
        }
        return false;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
        this.f9390h.mo9883c(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
        for (InterfaceC2514x interfaceC2514x : this.f9383a) {
            interfaceC2514x.mo9884d();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        long mo9885e = this.f9383a[0].mo9885e();
        int i = 1;
        while (true) {
            InterfaceC2514x[] interfaceC2514xArr = this.f9383a;
            if (i >= interfaceC2514xArr.length) {
                if (mo9885e != -9223372036854775807L) {
                    for (InterfaceC2514x interfaceC2514x : this.f9389g) {
                        if (interfaceC2514x != this.f9383a[0] && interfaceC2514x.mo9874a(mo9885e) != mo9885e) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return mo9885e;
            }
            if (interfaceC2514xArr[i].mo9885e() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i++;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return this.f9388f;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        return this.f9390h.mo9887g();
    }
}
