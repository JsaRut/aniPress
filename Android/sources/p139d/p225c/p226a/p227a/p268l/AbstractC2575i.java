package p139d.p225c.p226a.p227a.p268l;

import android.util.Pair;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2145J;
import p139d.p225c.p226a.p227a.InterfaceC2144I;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.l.i */
/* loaded from: classes.dex */
public abstract class AbstractC2575i extends AbstractC2579m {

    /* renamed from: c */
    private a f10718c;

    /* renamed from: d.c.a.a.l.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        @Deprecated
        public final int f10719a;

        /* renamed from: b */
        private final int f10720b;

        /* renamed from: c */
        private final int[] f10721c;

        /* renamed from: d */
        private final C2413N[] f10722d;

        /* renamed from: e */
        private final int[] f10723e;

        /* renamed from: f */
        private final int[][][] f10724f;

        /* renamed from: g */
        private final C2413N f10725g;

        a(int[] iArr, C2413N[] c2413nArr, int[] iArr2, int[][][] iArr3, C2413N c2413n) {
            this.f10721c = iArr;
            this.f10722d = c2413nArr;
            this.f10724f = iArr3;
            this.f10723e = iArr2;
            this.f10725g = c2413n;
            this.f10720b = iArr.length;
            this.f10719a = this.f10720b;
        }

        /* renamed from: a */
        public int m10879a() {
            return this.f10720b;
        }

        /* renamed from: a */
        public int m10880a(int i) {
            return this.f10721c[i];
        }

        /* renamed from: a */
        public int m10881a(int i, int i2, int i3) {
            return this.f10724f[i][i2][i3] & 7;
        }

        /* renamed from: a */
        public int m10882a(int i, int i2, boolean z) {
            int i3 = this.f10722d[i].m9978a(i2).f9481a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int m10881a = m10881a(i, i2, i5);
                if (m10881a == 4 || (z && m10881a == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m10883a(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: a */
        public int m10883a(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str2 = this.f10722d[i].m9978a(i2).m9976a(iArr[i3]).f11182g;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !C2622I.m11067a((Object) str, (Object) str2);
                }
                i5 = Math.min(i5, this.f10724f[i][i2][i3] & 24);
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.f10723e[i]) : i5;
        }

        /* renamed from: b */
        public C2413N m10884b(int i) {
            return this.f10722d[i];
        }
    }

    /* renamed from: a */
    private static int m10873a(InterfaceC2144I[] interfaceC2144IArr, C2411L c2411l) {
        int length = interfaceC2144IArr.length;
        int i = 0;
        int i2 = 0;
        while (i < interfaceC2144IArr.length) {
            InterfaceC2144I interfaceC2144I = interfaceC2144IArr[i];
            int i3 = i2;
            int i4 = length;
            for (int i5 = 0; i5 < c2411l.f9481a; i5++) {
                int mo8576a = interfaceC2144I.mo8576a(c2411l.m9976a(i5)) & 7;
                if (mo8576a > i3) {
                    if (mo8576a == 4) {
                        return i;
                    }
                    i4 = i;
                    i3 = mo8576a;
                }
            }
            i++;
            length = i4;
            i2 = i3;
        }
        return length;
    }

    /* renamed from: a */
    private static int[] m10874a(InterfaceC2144I interfaceC2144I, C2411L c2411l) {
        int[] iArr = new int[c2411l.f9481a];
        for (int i = 0; i < c2411l.f9481a; i++) {
            iArr[i] = interfaceC2144I.mo8576a(c2411l.m9976a(i));
        }
        return iArr;
    }

    /* renamed from: a */
    private static int[] m10875a(InterfaceC2144I[] interfaceC2144IArr) {
        int[] iArr = new int[interfaceC2144IArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = interfaceC2144IArr[i].mo8577n();
        }
        return iArr;
    }

    /* renamed from: a */
    protected abstract Pair<C2145J[], InterfaceC2577k[]> mo10847a(a aVar, int[][][] iArr, int[] iArr2);

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2579m
    /* renamed from: a */
    public final C2580n mo10876a(InterfaceC2144I[] interfaceC2144IArr, C2413N c2413n) {
        int[] iArr = new int[interfaceC2144IArr.length + 1];
        C2411L[][] c2411lArr = new C2411L[interfaceC2144IArr.length + 1];
        int[][][] iArr2 = new int[interfaceC2144IArr.length + 1][];
        for (int i = 0; i < c2411lArr.length; i++) {
            int i2 = c2413n.f9485b;
            c2411lArr[i] = new C2411L[i2];
            iArr2[i] = new int[i2];
        }
        int[] m10875a = m10875a(interfaceC2144IArr);
        for (int i3 = 0; i3 < c2413n.f9485b; i3++) {
            C2411L m9978a = c2413n.m9978a(i3);
            int m10873a = m10873a(interfaceC2144IArr, m9978a);
            int[] m10874a = m10873a == interfaceC2144IArr.length ? new int[m9978a.f9481a] : m10874a(interfaceC2144IArr[m10873a], m9978a);
            int i4 = iArr[m10873a];
            c2411lArr[m10873a][i4] = m9978a;
            iArr2[m10873a][i4] = m10874a;
            iArr[m10873a] = iArr[m10873a] + 1;
        }
        C2413N[] c2413nArr = new C2413N[interfaceC2144IArr.length];
        int[] iArr3 = new int[interfaceC2144IArr.length];
        for (int i5 = 0; i5 < interfaceC2144IArr.length; i5++) {
            int i6 = iArr[i5];
            c2413nArr[i5] = new C2413N((C2411L[]) C2622I.m11072a(c2411lArr[i5], i6));
            iArr2[i5] = (int[][]) C2622I.m11072a(iArr2[i5], i6);
            iArr3[i5] = interfaceC2144IArr[i5].mo8568f();
        }
        a aVar = new a(iArr3, c2413nArr, m10875a, iArr2, new C2413N((C2411L[]) C2622I.m11072a(c2411lArr[interfaceC2144IArr.length], iArr[interfaceC2144IArr.length])));
        Pair<C2145J[], InterfaceC2577k[]> mo10847a = mo10847a(aVar, iArr2, m10875a);
        return new C2580n((C2145J[]) mo10847a.first, (InterfaceC2577k[]) mo10847a.second, aVar);
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2579m
    /* renamed from: a */
    public final void mo10877a(Object obj) {
        this.f10718c = (a) obj;
    }

    /* renamed from: c */
    public final a m10878c() {
        return this.f10718c;
    }
}
