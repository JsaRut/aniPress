package p139d.p225c.p226a.p227a.p270n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p139d.p225c.p226a.p227a.p270n.C2614A;

/* renamed from: d.c.a.a.n.A */
/* loaded from: classes.dex */
public class C2614A {

    /* renamed from: a */
    private static final Comparator<a> f10891a = new Comparator() { // from class: d.c.a.a.n.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C2614A.m10990a((C2614A.a) obj, (C2614A.a) obj2);
        }
    };

    /* renamed from: b */
    private static final Comparator<a> f10892b = new Comparator() { // from class: d.c.a.a.n.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Float.compare(((C2614A.a) obj).f10902c, ((C2614A.a) obj2).f10902c);
            return compare;
        }
    };

    /* renamed from: c */
    private final int f10893c;

    /* renamed from: g */
    private int f10897g;

    /* renamed from: h */
    private int f10898h;

    /* renamed from: i */
    private int f10899i;

    /* renamed from: e */
    private final a[] f10895e = new a[5];

    /* renamed from: d */
    private final ArrayList<a> f10894d = new ArrayList<>();

    /* renamed from: f */
    private int f10896f = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.n.A$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f10900a;

        /* renamed from: b */
        public int f10901b;

        /* renamed from: c */
        public float f10902c;

        private a() {
        }
    }

    public C2614A(int i) {
        this.f10893c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ int m10990a(a aVar, a aVar2) {
        return aVar.f10900a - aVar2.f10900a;
    }

    /* renamed from: a */
    private void m10991a() {
        if (this.f10896f != 1) {
            Collections.sort(this.f10894d, f10891a);
            this.f10896f = 1;
        }
    }

    /* renamed from: b */
    private void m10993b() {
        if (this.f10896f != 0) {
            Collections.sort(this.f10894d, f10892b);
            this.f10896f = 0;
        }
    }

    /* renamed from: a */
    public float m10994a(float f) {
        m10993b();
        float f2 = f * this.f10898h;
        int i = 0;
        for (int i2 = 0; i2 < this.f10894d.size(); i2++) {
            a aVar = this.f10894d.get(i2);
            i += aVar.f10901b;
            if (i >= f2) {
                return aVar.f10902c;
            }
        }
        if (this.f10894d.isEmpty()) {
            return Float.NaN;
        }
        return this.f10894d.get(r5.size() - 1).f10902c;
    }

    /* renamed from: a */
    public void m10995a(int i, float f) {
        a aVar;
        int i2;
        a aVar2;
        int i3;
        m10991a();
        int i4 = this.f10899i;
        if (i4 > 0) {
            a[] aVarArr = this.f10895e;
            int i5 = i4 - 1;
            this.f10899i = i5;
            aVar = aVarArr[i5];
        } else {
            aVar = new a();
        }
        int i6 = this.f10897g;
        this.f10897g = i6 + 1;
        aVar.f10900a = i6;
        aVar.f10901b = i;
        aVar.f10902c = f;
        this.f10894d.add(aVar);
        int i7 = this.f10898h + i;
        while (true) {
            this.f10898h = i7;
            while (true) {
                int i8 = this.f10898h;
                int i9 = this.f10893c;
                if (i8 <= i9) {
                    return;
                }
                i2 = i8 - i9;
                aVar2 = this.f10894d.get(0);
                i3 = aVar2.f10901b;
                if (i3 <= i2) {
                    this.f10898h -= i3;
                    this.f10894d.remove(0);
                    int i10 = this.f10899i;
                    if (i10 < 5) {
                        a[] aVarArr2 = this.f10895e;
                        this.f10899i = i10 + 1;
                        aVarArr2[i10] = aVar2;
                    }
                }
            }
            aVar2.f10901b = i3 - i2;
            i7 = this.f10898h - i2;
        }
    }
}
