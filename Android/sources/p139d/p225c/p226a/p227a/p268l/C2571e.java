package p139d.p225c.p226a.p227a.p268l;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p139d.p225c.p226a.p227a.C2145J;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p250j.C2411L;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p268l.AbstractC2575i;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.l.e */
/* loaded from: classes.dex */
public class C2571e extends AbstractC2575i {

    /* renamed from: d */
    private static final int[] f10659d = new int[0];

    /* renamed from: e */
    private final InterfaceC2577k.a f10660e;

    /* renamed from: f */
    private final AtomicReference<c> f10661f = new AtomicReference<>(c.f10672a);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.l.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f10662a;

        /* renamed from: b */
        public final int f10663b;

        /* renamed from: c */
        public final String f10664c;

        public a(int i, int i2, String str) {
            this.f10662a = i;
            this.f10663b = i2;
            this.f10664c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10662a == aVar.f10662a && this.f10663b == aVar.f10663b && TextUtils.equals(this.f10664c, aVar.f10664c);
        }

        public int hashCode() {
            int i = ((this.f10662a * 31) + this.f10663b) * 31;
            String str = this.f10664c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.l.e$b */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        private final c f10665a;

        /* renamed from: b */
        private final int f10666b;

        /* renamed from: c */
        private final int f10667c;

        /* renamed from: d */
        private final int f10668d;

        /* renamed from: e */
        private final int f10669e;

        /* renamed from: f */
        private final int f10670f;

        /* renamed from: g */
        private final int f10671g;

        public b(C2676s c2676s, c cVar, int i) {
            this.f10665a = cVar;
            this.f10666b = C2571e.m10833a(i, false) ? 1 : 0;
            this.f10667c = C2571e.m10836a(c2676s, cVar.f10675d) ? 1 : 0;
            this.f10668d = (c2676s.f11200y & 1) == 0 ? 0 : 1;
            this.f10669e = c2676s.f11195t;
            this.f10670f = c2676s.f11196u;
            this.f10671g = c2676s.f11178c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i = this.f10666b;
            int i2 = bVar.f10666b;
            if (i != i2) {
                return C2571e.m10844c(i, i2);
            }
            int i3 = this.f10667c;
            int i4 = bVar.f10667c;
            if (i3 != i4) {
                return C2571e.m10844c(i3, i4);
            }
            int i5 = this.f10668d;
            int i6 = bVar.f10668d;
            if (i5 != i6) {
                return C2571e.m10844c(i5, i6);
            }
            if (this.f10665a.f10687p) {
                return C2571e.m10844c(bVar.f10671g, this.f10671g);
            }
            int i7 = i != 1 ? -1 : 1;
            int i8 = this.f10669e;
            int i9 = bVar.f10669e;
            return i7 * ((i8 == i9 && (i8 = this.f10670f) == (i9 = bVar.f10670f)) ? C2571e.m10844c(this.f10671g, bVar.f10671g) : C2571e.m10844c(i8, i9));
        }
    }

    /* renamed from: d.c.a.a.l.e$c */
    /* loaded from: classes.dex */
    public static final class c implements Parcelable {

        /* renamed from: b */
        private final SparseArray<Map<C2413N, e>> f10673b;

        /* renamed from: c */
        private final SparseBooleanArray f10674c;

        /* renamed from: d */
        public final String f10675d;

        /* renamed from: e */
        public final String f10676e;

        /* renamed from: f */
        public final boolean f10677f;

        /* renamed from: g */
        public final int f10678g;

        /* renamed from: h */
        public final int f10679h;

        /* renamed from: i */
        public final int f10680i;

        /* renamed from: j */
        public final int f10681j;

        /* renamed from: k */
        public final int f10682k;

        /* renamed from: l */
        public final boolean f10683l;

        /* renamed from: m */
        public final int f10684m;

        /* renamed from: n */
        public final int f10685n;

        /* renamed from: o */
        public final boolean f10686o;

        /* renamed from: p */
        public final boolean f10687p;

        /* renamed from: q */
        public final boolean f10688q;

        /* renamed from: r */
        public final boolean f10689r;

        /* renamed from: s */
        public final boolean f10690s;

        /* renamed from: t */
        public final boolean f10691t;

        /* renamed from: u */
        public final int f10692u;

        /* renamed from: a */
        public static final c f10672a = new c();
        public static final Parcelable.Creator<c> CREATOR = new C2572f();

        private c() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Parcel parcel) {
            this.f10673b = m10856a(parcel);
            this.f10674c = parcel.readSparseBooleanArray();
            this.f10675d = parcel.readString();
            this.f10676e = parcel.readString();
            this.f10677f = C2622I.m11065a(parcel);
            this.f10678g = parcel.readInt();
            this.f10687p = C2622I.m11065a(parcel);
            this.f10688q = C2622I.m11065a(parcel);
            this.f10689r = C2622I.m11065a(parcel);
            this.f10690s = C2622I.m11065a(parcel);
            this.f10679h = parcel.readInt();
            this.f10680i = parcel.readInt();
            this.f10681j = parcel.readInt();
            this.f10682k = parcel.readInt();
            this.f10683l = C2622I.m11065a(parcel);
            this.f10691t = C2622I.m11065a(parcel);
            this.f10684m = parcel.readInt();
            this.f10685n = parcel.readInt();
            this.f10686o = C2622I.m11065a(parcel);
            this.f10692u = parcel.readInt();
        }

        c(SparseArray<Map<C2413N, e>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, int i5, boolean z6, boolean z7, int i6, int i7, boolean z8, int i8) {
            this.f10673b = sparseArray;
            this.f10674c = sparseBooleanArray;
            this.f10675d = C2622I.m11092f(str);
            this.f10676e = C2622I.m11092f(str2);
            this.f10677f = z;
            this.f10678g = i;
            this.f10687p = z2;
            this.f10688q = z3;
            this.f10689r = z4;
            this.f10690s = z5;
            this.f10679h = i2;
            this.f10680i = i3;
            this.f10681j = i4;
            this.f10682k = i5;
            this.f10683l = z6;
            this.f10691t = z7;
            this.f10684m = i6;
            this.f10685n = i7;
            this.f10686o = z8;
            this.f10692u = i8;
        }

        /* renamed from: a */
        private static SparseArray<Map<C2413N, e>> m10856a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<C2413N, e>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((C2413N) parcel.readParcelable(C2413N.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: a */
        private static void m10858a(Parcel parcel, SparseArray<Map<C2413N, e>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map<C2413N, e> valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<C2413N, e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        /* renamed from: a */
        private static boolean m10859a(SparseArray<Map<C2413N, e>> sparseArray, SparseArray<Map<C2413N, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m10861a(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        private static boolean m10860a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        private static boolean m10861a(Map<C2413N, e> map, Map<C2413N, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C2413N, e> entry : map.entrySet()) {
                C2413N key = entry.getKey();
                if (!map2.containsKey(key) || !C2622I.m11067a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public d m10863a() {
            return new d(this);
        }

        /* renamed from: a */
        public final e m10864a(int i, C2413N c2413n) {
            Map<C2413N, e> map = this.f10673b.get(i);
            if (map != null) {
                return map.get(c2413n);
            }
            return null;
        }

        /* renamed from: a */
        public final boolean m10865a(int i) {
            return this.f10674c.get(i);
        }

        /* renamed from: b */
        public final boolean m10866b(int i, C2413N c2413n) {
            Map<C2413N, e> map = this.f10673b.get(i);
            return map != null && map.containsKey(c2413n);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10677f == cVar.f10677f && this.f10678g == cVar.f10678g && this.f10687p == cVar.f10687p && this.f10688q == cVar.f10688q && this.f10689r == cVar.f10689r && this.f10690s == cVar.f10690s && this.f10679h == cVar.f10679h && this.f10680i == cVar.f10680i && this.f10681j == cVar.f10681j && this.f10683l == cVar.f10683l && this.f10691t == cVar.f10691t && this.f10686o == cVar.f10686o && this.f10684m == cVar.f10684m && this.f10685n == cVar.f10685n && this.f10682k == cVar.f10682k && this.f10692u == cVar.f10692u && TextUtils.equals(this.f10675d, cVar.f10675d) && TextUtils.equals(this.f10676e, cVar.f10676e) && m10860a(this.f10674c, cVar.f10674c) && m10859a(this.f10673b, cVar.f10673b);
        }

        public int hashCode() {
            int i = (((((((((((((((((((((((((((((((this.f10677f ? 1 : 0) * 31) + this.f10678g) * 31) + (this.f10687p ? 1 : 0)) * 31) + (this.f10688q ? 1 : 0)) * 31) + (this.f10689r ? 1 : 0)) * 31) + (this.f10690s ? 1 : 0)) * 31) + this.f10679h) * 31) + this.f10680i) * 31) + this.f10681j) * 31) + (this.f10683l ? 1 : 0)) * 31) + (this.f10691t ? 1 : 0)) * 31) + (this.f10686o ? 1 : 0)) * 31) + this.f10684m) * 31) + this.f10685n) * 31) + this.f10682k) * 31) + this.f10692u) * 31;
            String str = this.f10675d;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10676e;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            m10858a(parcel, this.f10673b);
            parcel.writeSparseBooleanArray(this.f10674c);
            parcel.writeString(this.f10675d);
            parcel.writeString(this.f10676e);
            C2622I.m11059a(parcel, this.f10677f);
            parcel.writeInt(this.f10678g);
            C2622I.m11059a(parcel, this.f10687p);
            C2622I.m11059a(parcel, this.f10688q);
            C2622I.m11059a(parcel, this.f10689r);
            C2622I.m11059a(parcel, this.f10690s);
            parcel.writeInt(this.f10679h);
            parcel.writeInt(this.f10680i);
            parcel.writeInt(this.f10681j);
            parcel.writeInt(this.f10682k);
            C2622I.m11059a(parcel, this.f10683l);
            C2622I.m11059a(parcel, this.f10691t);
            parcel.writeInt(this.f10684m);
            parcel.writeInt(this.f10685n);
            C2622I.m11059a(parcel, this.f10686o);
            parcel.writeInt(this.f10692u);
        }
    }

    /* renamed from: d.c.a.a.l.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final SparseArray<Map<C2413N, e>> f10693a;

        /* renamed from: b */
        private final SparseBooleanArray f10694b;

        /* renamed from: c */
        private String f10695c;

        /* renamed from: d */
        private String f10696d;

        /* renamed from: e */
        private boolean f10697e;

        /* renamed from: f */
        private int f10698f;

        /* renamed from: g */
        private boolean f10699g;

        /* renamed from: h */
        private boolean f10700h;

        /* renamed from: i */
        private boolean f10701i;

        /* renamed from: j */
        private boolean f10702j;

        /* renamed from: k */
        private int f10703k;

        /* renamed from: l */
        private int f10704l;

        /* renamed from: m */
        private int f10705m;

        /* renamed from: n */
        private int f10706n;

        /* renamed from: o */
        private boolean f10707o;

        /* renamed from: p */
        private boolean f10708p;

        /* renamed from: q */
        private int f10709q;

        /* renamed from: r */
        private int f10710r;

        /* renamed from: s */
        private boolean f10711s;

        /* renamed from: t */
        private int f10712t;

        private d(c cVar) {
            this.f10693a = m10867a((SparseArray<Map<C2413N, e>>) cVar.f10673b);
            this.f10694b = cVar.f10674c.clone();
            this.f10695c = cVar.f10675d;
            this.f10696d = cVar.f10676e;
            this.f10697e = cVar.f10677f;
            this.f10698f = cVar.f10678g;
            this.f10699g = cVar.f10687p;
            this.f10700h = cVar.f10688q;
            this.f10701i = cVar.f10689r;
            this.f10702j = cVar.f10690s;
            this.f10703k = cVar.f10679h;
            this.f10704l = cVar.f10680i;
            this.f10705m = cVar.f10681j;
            this.f10706n = cVar.f10682k;
            this.f10707o = cVar.f10683l;
            this.f10708p = cVar.f10691t;
            this.f10709q = cVar.f10684m;
            this.f10710r = cVar.f10685n;
            this.f10711s = cVar.f10686o;
            this.f10712t = cVar.f10692u;
        }

        /* renamed from: a */
        private static SparseArray<Map<C2413N, e>> m10867a(SparseArray<Map<C2413N, e>> sparseArray) {
            SparseArray<Map<C2413N, e>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }

        /* renamed from: a */
        public c m10868a() {
            return new c(this.f10693a, this.f10694b, this.f10695c, this.f10696d, this.f10697e, this.f10698f, this.f10699g, this.f10700h, this.f10701i, this.f10702j, this.f10703k, this.f10704l, this.f10705m, this.f10706n, this.f10707o, this.f10708p, this.f10709q, this.f10710r, this.f10711s, this.f10712t);
        }

        /* renamed from: a */
        public d m10869a(int i) {
            this.f10706n = i;
            return this;
        }

        /* renamed from: a */
        public final d m10870a(int i, C2413N c2413n, e eVar) {
            Map<C2413N, e> map = this.f10693a.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f10693a.put(i, map);
            }
            if (map.containsKey(c2413n) && C2622I.m11067a(map.get(c2413n), eVar)) {
                return this;
            }
            map.put(c2413n, eVar);
            return this;
        }

        /* renamed from: a */
        public final d m10871a(int i, boolean z) {
            if (this.f10694b.get(i) == z) {
                return this;
            }
            if (z) {
                this.f10694b.put(i, true);
            } else {
                this.f10694b.delete(i);
            }
            return this;
        }
    }

    /* renamed from: d.c.a.a.l.e$e */
    /* loaded from: classes.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new C2573g();

        /* renamed from: a */
        public final int f10713a;

        /* renamed from: b */
        public final int[] f10714b;

        /* renamed from: c */
        public final int f10715c;

        public e(int i, int... iArr) {
            this.f10713a = i;
            this.f10714b = Arrays.copyOf(iArr, iArr.length);
            this.f10715c = iArr.length;
            Arrays.sort(this.f10714b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Parcel parcel) {
            this.f10713a = parcel.readInt();
            this.f10715c = parcel.readByte();
            this.f10714b = new int[this.f10715c];
            parcel.readIntArray(this.f10714b);
        }

        /* renamed from: a */
        public boolean m10872a(int i) {
            for (int i2 : this.f10714b) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f10713a == eVar.f10713a && Arrays.equals(this.f10714b, eVar.f10714b);
        }

        public int hashCode() {
            return (this.f10713a * 31) + Arrays.hashCode(this.f10714b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10713a);
            parcel.writeInt(this.f10714b.length);
            parcel.writeIntArray(this.f10714b);
        }
    }

    public C2571e(InterfaceC2577k.a aVar) {
        this.f10660e = aVar;
    }

    /* renamed from: a */
    private static int m10827a(C2411L c2411l, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < c2411l.f9481a; i2++) {
            if (m10835a(c2411l.m9976a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:            if ((r6 > r7) != (r4 > r5)) goto L13;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point m10828a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p139d.p225c.p226a.p227a.p270n.C2622I.m11037a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p139d.p225c.p226a.p227a.p270n.C2622I.m11037a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p268l.C2571e.m10828a(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: a */
    private static InterfaceC2577k m10829a(C2413N c2413n, int[][] iArr, int i, c cVar, InterfaceC2577k.a aVar, InterfaceC2592f interfaceC2592f) {
        C2413N c2413n2 = c2413n;
        int i2 = cVar.f10690s ? 24 : 16;
        boolean z = cVar.f10689r && (i & i2) != 0;
        int i3 = 0;
        while (i3 < c2413n2.f9485b) {
            C2411L m9978a = c2413n2.m9978a(i3);
            int[] m10840a = m10840a(m9978a, iArr[i3], z, i2, cVar.f10679h, cVar.f10680i, cVar.f10681j, cVar.f10682k, cVar.f10684m, cVar.f10685n, cVar.f10686o);
            if (m10840a.length > 0) {
                C2628e.m11110a(aVar);
                return aVar.mo10813a(m9978a, interfaceC2592f, m10840a);
            }
            i3++;
            c2413n2 = c2413n;
        }
        return null;
    }

    /* renamed from: a */
    private static List<Integer> m10830a(C2411L c2411l, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(c2411l.f9481a);
        for (int i4 = 0; i4 < c2411l.f9481a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < c2411l.f9481a; i6++) {
                C2676s m9976a = c2411l.m9976a(i6);
                int i7 = m9976a.f11187l;
                if (i7 > 0 && (i3 = m9976a.f11188m) > 0) {
                    Point m10828a = m10828a(z, i, i2, i7, i3);
                    int i8 = m9976a.f11187l;
                    int i9 = m9976a.f11188m;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (m10828a.x * 0.98f)) && i9 >= ((int) (m10828a.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int m11436a = c2411l.m9976a(((Integer) arrayList.get(size)).intValue()).m11436a();
                    if (m11436a == -1 || m11436a > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m10831a(C2411L c2411l, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!m10837a(c2411l.m9976a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                list.remove(size);
            }
        }
    }

    /* renamed from: a */
    private static void m10832a(AbstractC2575i.a aVar, int[][][] iArr, C2145J[] c2145jArr, InterfaceC2577k[] interfaceC2577kArr, int i) {
        boolean z;
        if (i == 0) {
            return;
        }
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.m10879a(); i4++) {
            int m10880a = aVar.m10880a(i4);
            InterfaceC2577k interfaceC2577k = interfaceC2577kArr[i4];
            if ((m10880a == 1 || m10880a == 2) && interfaceC2577k != null && m10838a(iArr[i4], aVar.m10884b(i4), interfaceC2577k)) {
                if (m10880a == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z = true;
        if (i3 != -1 && i2 != -1) {
            z2 = true;
        }
        if (z && z2) {
            C2145J c2145j = new C2145J(i);
            c2145jArr[i3] = c2145j;
            c2145jArr[i2] = c2145j;
        }
    }

    /* renamed from: a */
    protected static boolean m10833a(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: a */
    protected static boolean m10834a(C2676s c2676s) {
        return TextUtils.isEmpty(c2676s.f11201z) || m10836a(c2676s, "und");
    }

    /* renamed from: a */
    private static boolean m10835a(C2676s c2676s, int i, a aVar) {
        if (!m10833a(i, false) || c2676s.f11195t != aVar.f10662a || c2676s.f11196u != aVar.f10663b) {
            return false;
        }
        String str = aVar.f10664c;
        return str == null || TextUtils.equals(str, c2676s.f11182g);
    }

    /* renamed from: a */
    protected static boolean m10836a(C2676s c2676s, String str) {
        return str != null && TextUtils.equals(str, C2622I.m11092f(c2676s.f11201z));
    }

    /* renamed from: a */
    private static boolean m10837a(C2676s c2676s, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!m10833a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C2622I.m11067a((Object) c2676s.f11182g, (Object) str)) {
            return false;
        }
        int i7 = c2676s.f11187l;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = c2676s.f11188m;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f = c2676s.f11189n;
        if (f != -1.0f && f > i5) {
            return false;
        }
        int i9 = c2676s.f11178c;
        return i9 == -1 || i9 <= i6;
    }

    /* renamed from: a */
    private static boolean m10838a(int[][] iArr, C2413N c2413n, InterfaceC2577k interfaceC2577k) {
        if (interfaceC2577k == null) {
            return false;
        }
        int m9977a = c2413n.m9977a(interfaceC2577k.mo10815a());
        for (int i = 0; i < interfaceC2577k.length(); i++) {
            if ((iArr[m9977a][interfaceC2577k.mo10819b(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int[] m10839a(C2411L c2411l, int[] iArr, boolean z) {
        int m10827a;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < c2411l.f9481a; i2++) {
            C2676s m9976a = c2411l.m9976a(i2);
            a aVar2 = new a(m9976a.f11195t, m9976a.f11196u, z ? null : m9976a.f11182g);
            if (hashSet.add(aVar2) && (m10827a = m10827a(c2411l, iArr, aVar2)) > i) {
                i = m10827a;
                aVar = aVar2;
            }
        }
        if (i <= 1) {
            return f10659d;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < c2411l.f9481a; i4++) {
            C2676s m9976a2 = c2411l.m9976a(i4);
            int i5 = iArr[i4];
            C2628e.m11110a(aVar);
            if (m10835a(m9976a2, i5, aVar)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int[] m10840a(C2411L c2411l, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        String str;
        int m10842b;
        if (c2411l.f9481a < 2) {
            return f10659d;
        }
        List<Integer> m10830a = m10830a(c2411l, i6, i7, z2);
        if (m10830a.size() < 2) {
            return f10659d;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i8 = 0;
            for (int i9 = 0; i9 < m10830a.size(); i9++) {
                String str3 = c2411l.m9976a(m10830a.get(i9).intValue()).f11182g;
                if (hashSet.add(str3) && (m10842b = m10842b(c2411l, iArr, i, str3, i2, i3, i4, i5, m10830a)) > i8) {
                    i8 = m10842b;
                    str2 = str3;
                }
            }
            str = str2;
        }
        m10831a(c2411l, iArr, i, str, i2, i3, i4, i5, m10830a);
        return m10830a.size() < 2 ? f10659d : C2622I.m11069a(m10830a);
    }

    /* renamed from: b */
    private static int m10841b(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: b */
    private static int m10842b(C2411L c2411l, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = list.get(i7).intValue();
            if (m10837a(c2411l.m9976a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:            if (m10841b(r2.f11178c, r14) < 0) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:            r18 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p139d.p225c.p226a.p227a.p268l.InterfaceC2577k m10843b(p139d.p225c.p226a.p227a.p250j.C2413N r19, int[][] r20, p139d.p225c.p226a.p227a.p268l.C2571e.c r21) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p268l.C2571e.m10843b(d.c.a.a.j.N, int[][], d.c.a.a.l.e$c):d.c.a.a.l.k");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static int m10844c(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: a */
    protected Pair<InterfaceC2577k, b> m10845a(C2413N c2413n, int[][] iArr, int i, c cVar, InterfaceC2577k.a aVar) {
        InterfaceC2577k interfaceC2577k = null;
        b bVar = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i2 < c2413n.f9485b) {
            C2411L m9978a = c2413n.m9978a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            b bVar2 = bVar;
            int i6 = i3;
            for (int i7 = 0; i7 < m9978a.f9481a; i7++) {
                if (m10833a(iArr2[i7], cVar.f10691t)) {
                    b bVar3 = new b(m9978a.m9976a(i7), cVar, iArr2[i7]);
                    if (bVar2 == null || bVar3.compareTo(bVar2) > 0) {
                        i6 = i2;
                        i5 = i7;
                        bVar2 = bVar3;
                    }
                }
            }
            i2++;
            i3 = i6;
            bVar = bVar2;
            i4 = i5;
        }
        if (i3 == -1) {
            return null;
        }
        C2411L m9978a2 = c2413n.m9978a(i3);
        if (!cVar.f10688q && !cVar.f10687p && aVar != null) {
            int[] m10839a = m10839a(m9978a2, iArr[i3], cVar.f10689r);
            if (m10839a.length > 0) {
                interfaceC2577k = aVar.mo10813a(m9978a2, m10889a(), m10839a);
            }
        }
        if (interfaceC2577k == null) {
            interfaceC2577k = new C2574h(m9978a2, i4);
        }
        C2628e.m11110a(bVar);
        return Pair.create(interfaceC2577k, bVar);
    }

    /* renamed from: a */
    protected Pair<InterfaceC2577k, Integer> m10846a(C2413N c2413n, int[][] iArr, c cVar) {
        int i = 0;
        C2411L c2411l = null;
        int i2 = 0;
        int i3 = 0;
        while (i < c2413n.f9485b) {
            C2411L m9978a = c2413n.m9978a(i);
            int[] iArr2 = iArr[i];
            int i4 = i3;
            int i5 = i2;
            C2411L c2411l2 = c2411l;
            for (int i6 = 0; i6 < m9978a.f9481a; i6++) {
                if (m10833a(iArr2[i6], cVar.f10691t)) {
                    C2676s m9976a = m9978a.m9976a(i6);
                    int i7 = m9976a.f11200y & (cVar.f10678g ^ (-1));
                    int i8 = 1;
                    boolean z = (i7 & 1) != 0;
                    boolean z2 = (i7 & 2) != 0;
                    boolean m10836a = m10836a(m9976a, cVar.f10676e);
                    if (m10836a || (cVar.f10677f && m10834a(m9976a))) {
                        i8 = (z ? 8 : !z2 ? 6 : 4) + (m10836a ? 1 : 0);
                    } else if (z) {
                        i8 = 3;
                    } else if (z2) {
                        if (m10836a(m9976a, cVar.f10675d)) {
                            i8 = 2;
                        }
                    }
                    if (m10833a(iArr2[i6], false)) {
                        i8 += 1000;
                    }
                    if (i8 > i4) {
                        i5 = i6;
                        c2411l2 = m9978a;
                        i4 = i8;
                    }
                }
            }
            i++;
            c2411l = c2411l2;
            i2 = i5;
            i3 = i4;
        }
        if (c2411l == null) {
            return null;
        }
        return Pair.create(new C2574h(c2411l, i2), Integer.valueOf(i3));
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2575i
    /* renamed from: a */
    protected final Pair<C2145J[], InterfaceC2577k[]> mo10847a(AbstractC2575i.a aVar, int[][][] iArr, int[] iArr2) {
        c cVar = this.f10661f.get();
        int m10879a = aVar.m10879a();
        InterfaceC2577k[] m10851a = m10851a(aVar, iArr, iArr2, cVar);
        for (int i = 0; i < m10879a; i++) {
            if (cVar.m10865a(i)) {
                m10851a[i] = null;
            } else {
                C2413N m10884b = aVar.m10884b(i);
                if (cVar.m10866b(i, m10884b)) {
                    e m10864a = cVar.m10864a(i, m10884b);
                    if (m10864a == null) {
                        m10851a[i] = null;
                    } else if (m10864a.f10715c == 1) {
                        m10851a[i] = new C2574h(m10884b.m9978a(m10864a.f10713a), m10864a.f10714b[0]);
                    } else {
                        InterfaceC2577k.a aVar2 = this.f10660e;
                        C2628e.m11110a(aVar2);
                        m10851a[i] = aVar2.mo10813a(m10884b.m9978a(m10864a.f10713a), m10889a(), m10864a.f10714b);
                    }
                }
            }
        }
        C2145J[] c2145jArr = new C2145J[m10879a];
        for (int i2 = 0; i2 < m10879a; i2++) {
            c2145jArr[i2] = !cVar.m10865a(i2) && (aVar.m10880a(i2) == 6 || m10851a[i2] != null) ? C2145J.f7659a : null;
        }
        m10832a(aVar, iArr, c2145jArr, m10851a, cVar.f10692u);
        return Pair.create(c2145jArr, m10851a);
    }

    /* renamed from: a */
    protected InterfaceC2577k m10848a(int i, C2413N c2413n, int[][] iArr, c cVar) {
        C2411L c2411l = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < c2413n.f9485b) {
            C2411L m9978a = c2413n.m9978a(i2);
            int[] iArr2 = iArr[i2];
            int i5 = i4;
            int i6 = i3;
            C2411L c2411l2 = c2411l;
            for (int i7 = 0; i7 < m9978a.f9481a; i7++) {
                if (m10833a(iArr2[i7], cVar.f10691t)) {
                    int i8 = (m9978a.m9976a(i7).f11200y & 1) != 0 ? 2 : 1;
                    if (m10833a(iArr2[i7], false)) {
                        i8 += 1000;
                    }
                    if (i8 > i5) {
                        i6 = i7;
                        c2411l2 = m9978a;
                        i5 = i8;
                    }
                }
            }
            i2++;
            c2411l = c2411l2;
            i3 = i6;
            i4 = i5;
        }
        if (c2411l == null) {
            return null;
        }
        return new C2574h(c2411l, i3);
    }

    /* renamed from: a */
    public void m10849a(c cVar) {
        C2628e.m11110a(cVar);
        if (this.f10661f.getAndSet(cVar).equals(cVar)) {
            return;
        }
        m10891b();
    }

    /* renamed from: a */
    public void m10850a(d dVar) {
        m10849a(dVar.m10868a());
    }

    /* renamed from: a */
    protected InterfaceC2577k[] m10851a(AbstractC2575i.a aVar, int[][][] iArr, int[] iArr2, c cVar) {
        int i;
        int i2;
        int i3;
        b bVar;
        int i4;
        int i5;
        int m10879a = aVar.m10879a();
        InterfaceC2577k[] interfaceC2577kArr = new InterfaceC2577k[m10879a];
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = 2;
            if (i7 >= m10879a) {
                break;
            }
            if (2 == aVar.m10880a(i7)) {
                if (!z) {
                    interfaceC2577kArr[i7] = m10852b(aVar.m10884b(i7), iArr[i7], iArr2[i7], cVar, this.f10660e);
                    z = interfaceC2577kArr[i7] != null;
                }
                i8 |= aVar.m10884b(i7).f9485b <= 0 ? 0 : 1;
            }
            i7++;
        }
        b bVar2 = null;
        int i9 = -1;
        int i10 = -1;
        int i11 = Integer.MIN_VALUE;
        while (i6 < m10879a) {
            int m10880a = aVar.m10880a(i6);
            if (m10880a != i2) {
                if (m10880a != i) {
                    if (m10880a != 3) {
                        interfaceC2577kArr[i6] = m10848a(m10880a, aVar.m10884b(i6), iArr[i6], cVar);
                    } else {
                        Pair<InterfaceC2577k, Integer> m10846a = m10846a(aVar.m10884b(i6), iArr[i6], cVar);
                        if (m10846a != null && ((Integer) m10846a.second).intValue() > i11) {
                            if (i10 != -1) {
                                interfaceC2577kArr[i10] = null;
                            }
                            interfaceC2577kArr[i6] = (InterfaceC2577k) m10846a.first;
                            i11 = ((Integer) m10846a.second).intValue();
                            i10 = i6;
                            i6++;
                            i = 2;
                            i2 = 1;
                        }
                    }
                }
                i3 = i9;
                bVar = bVar2;
                i4 = i10;
                i5 = i11;
            } else {
                i3 = i9;
                bVar = bVar2;
                i4 = i10;
                i5 = i11;
                Pair<InterfaceC2577k, b> m10845a = m10845a(aVar.m10884b(i6), iArr[i6], iArr2[i6], cVar, i8 != 0 ? null : this.f10660e);
                if (m10845a != null && (bVar == null || ((b) m10845a.second).compareTo(bVar) > 0)) {
                    if (i3 != -1) {
                        interfaceC2577kArr[i3] = null;
                    }
                    interfaceC2577kArr[i6] = (InterfaceC2577k) m10845a.first;
                    bVar2 = (b) m10845a.second;
                    i9 = i6;
                    i10 = i4;
                    i11 = i5;
                    i6++;
                    i = 2;
                    i2 = 1;
                }
            }
            bVar2 = bVar;
            i9 = i3;
            i10 = i4;
            i11 = i5;
            i6++;
            i = 2;
            i2 = 1;
        }
        return interfaceC2577kArr;
    }

    /* renamed from: b */
    protected InterfaceC2577k m10852b(C2413N c2413n, int[][] iArr, int i, c cVar, InterfaceC2577k.a aVar) {
        InterfaceC2577k m10829a = (cVar.f10688q || cVar.f10687p || aVar == null) ? null : m10829a(c2413n, iArr, i, cVar, aVar, m10889a());
        return m10829a == null ? m10843b(c2413n, iArr, cVar) : m10829a;
    }

    /* renamed from: d */
    public d m10853d() {
        return m10854e().m10863a();
    }

    /* renamed from: e */
    public c m10854e() {
        return this.f10661f.get();
    }
}
