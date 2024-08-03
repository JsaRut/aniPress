package p139d.p225c.p226a.p227a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2641r;
import p139d.p225c.p226a.p227a.p271o.C2662j;

/* renamed from: d.c.a.a.s */
/* loaded from: classes.dex */
public final class C2676s implements Parcelable {
    public static final Parcelable.Creator<C2676s> CREATOR = new C2675r();

    /* renamed from: A */
    public final int f11174A;

    /* renamed from: B */
    private int f11175B;

    /* renamed from: a */
    public final String f11176a;

    /* renamed from: b */
    public final String f11177b;

    /* renamed from: c */
    public final int f11178c;

    /* renamed from: d */
    public final String f11179d;

    /* renamed from: e */
    public final C2353b f11180e;

    /* renamed from: f */
    public final String f11181f;

    /* renamed from: g */
    public final String f11182g;

    /* renamed from: h */
    public final int f11183h;

    /* renamed from: i */
    public final List<byte[]> f11184i;

    /* renamed from: j */
    public final C2213m f11185j;

    /* renamed from: k */
    public final long f11186k;

    /* renamed from: l */
    public final int f11187l;

    /* renamed from: m */
    public final int f11188m;

    /* renamed from: n */
    public final float f11189n;

    /* renamed from: o */
    public final int f11190o;

    /* renamed from: p */
    public final float f11191p;

    /* renamed from: q */
    public final int f11192q;

    /* renamed from: r */
    public final byte[] f11193r;

    /* renamed from: s */
    public final C2662j f11194s;

    /* renamed from: t */
    public final int f11195t;

    /* renamed from: u */
    public final int f11196u;

    /* renamed from: v */
    public final int f11197v;

    /* renamed from: w */
    public final int f11198w;

    /* renamed from: x */
    public final int f11199x;

    /* renamed from: y */
    public final int f11200y;

    /* renamed from: z */
    public final String f11201z;

    public C2676s(Parcel parcel) {
        this.f11176a = parcel.readString();
        this.f11177b = parcel.readString();
        this.f11181f = parcel.readString();
        this.f11182g = parcel.readString();
        this.f11179d = parcel.readString();
        this.f11178c = parcel.readInt();
        this.f11183h = parcel.readInt();
        this.f11187l = parcel.readInt();
        this.f11188m = parcel.readInt();
        this.f11189n = parcel.readFloat();
        this.f11190o = parcel.readInt();
        this.f11191p = parcel.readFloat();
        this.f11193r = C2622I.m11065a(parcel) ? parcel.createByteArray() : null;
        this.f11192q = parcel.readInt();
        this.f11194s = (C2662j) parcel.readParcelable(C2662j.class.getClassLoader());
        this.f11195t = parcel.readInt();
        this.f11196u = parcel.readInt();
        this.f11197v = parcel.readInt();
        this.f11198w = parcel.readInt();
        this.f11199x = parcel.readInt();
        this.f11200y = parcel.readInt();
        this.f11201z = parcel.readString();
        this.f11174A = parcel.readInt();
        this.f11186k = parcel.readLong();
        int readInt = parcel.readInt();
        this.f11184i = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f11184i.add(parcel.createByteArray());
        }
        this.f11185j = (C2213m) parcel.readParcelable(C2213m.class.getClassLoader());
        this.f11180e = (C2353b) parcel.readParcelable(C2353b.class.getClassLoader());
    }

    C2676s(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, C2662j c2662j, int i7, int i8, int i9, int i10, int i11, int i12, String str6, int i13, long j, List<byte[]> list, C2213m c2213m, C2353b c2353b) {
        this.f11176a = str;
        this.f11177b = str2;
        this.f11181f = str3;
        this.f11182g = str4;
        this.f11179d = str5;
        this.f11178c = i;
        this.f11183h = i2;
        this.f11187l = i3;
        this.f11188m = i4;
        this.f11189n = f;
        int i14 = i5;
        this.f11190o = i14 == -1 ? 0 : i14;
        this.f11191p = f2 == -1.0f ? 1.0f : f2;
        this.f11193r = bArr;
        this.f11192q = i6;
        this.f11194s = c2662j;
        this.f11195t = i7;
        this.f11196u = i8;
        this.f11197v = i9;
        int i15 = i10;
        this.f11198w = i15 == -1 ? 0 : i15;
        int i16 = i11;
        this.f11199x = i16 == -1 ? 0 : i16;
        this.f11200y = i12;
        this.f11201z = str6;
        this.f11174A = i13;
        this.f11186k = j;
        this.f11184i = list == null ? Collections.emptyList() : list;
        this.f11185j = c2213m;
        this.f11180e = c2353b;
    }

    /* renamed from: a */
    public static C2676s m11419a(String str, String str2, int i, String str3) {
        return m11420a(str, str2, i, str3, (C2213m) null);
    }

    /* renamed from: a */
    public static C2676s m11420a(String str, String str2, int i, String str3, C2213m c2213m) {
        return m11427a(str, str2, null, -1, i, str3, -1, c2213m, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: a */
    public static C2676s m11421a(String str, String str2, long j) {
        return new C2676s(str, null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    /* renamed from: a */
    public static C2676s m11422a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, C2213m c2213m) {
        return m11423a(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (C2662j) null, c2213m);
    }

    /* renamed from: a */
    public static C2676s m11423a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, C2662j c2662j, C2213m c2213m) {
        return new C2676s(str, null, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, c2662j, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, c2213m, null);
    }

    /* renamed from: a */
    public static C2676s m11424a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, C2213m c2213m, int i8, String str4, C2353b c2353b) {
        return new C2676s(str, null, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, c2213m, c2353b);
    }

    /* renamed from: a */
    public static C2676s m11425a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, C2213m c2213m, int i6, String str4) {
        return m11424a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, c2213m, i6, str4, (C2353b) null);
    }

    /* renamed from: a */
    public static C2676s m11426a(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, C2213m c2213m, int i5, String str4) {
        return m11425a(str, str2, str3, i, i2, i3, i4, -1, list, c2213m, i5, str4);
    }

    /* renamed from: a */
    public static C2676s m11427a(String str, String str2, String str3, int i, int i2, String str4, int i3, C2213m c2213m, long j, List<byte[]> list) {
        return new C2676s(str, null, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, c2213m, null);
    }

    /* renamed from: a */
    public static C2676s m11428a(String str, String str2, String str3, int i, int i2, String str4, C2213m c2213m, long j) {
        return m11427a(str, str2, str3, i, i2, str4, -1, c2213m, j, Collections.emptyList());
    }

    /* renamed from: a */
    public static C2676s m11429a(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, C2213m c2213m) {
        return new C2676s(str, null, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, c2213m, null);
    }

    /* renamed from: a */
    public static C2676s m11430a(String str, String str2, String str3, int i, C2213m c2213m) {
        return new C2676s(str, null, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, c2213m, null);
    }

    /* renamed from: a */
    public static C2676s m11431a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new C2676s(str, str2, str3, str4, str5, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
    }

    /* renamed from: a */
    public static C2676s m11432a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List<byte[]> list, int i4, String str6) {
        return new C2676s(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str6, -1, Long.MAX_VALUE, list, null, null);
    }

    /* renamed from: a */
    public static C2676s m11433a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        return new C2676s(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str6, -1, Long.MAX_VALUE, null, null, null);
    }

    /* renamed from: a */
    public static C2676s m11434a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, int i3) {
        return new C2676s(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str6, i3, Long.MAX_VALUE, null, null, null);
    }

    /* renamed from: b */
    public static C2676s m11435b(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        return m11434a(str, str2, str3, str4, str5, i, i2, str6, -1);
    }

    /* renamed from: a */
    public int m11436a() {
        int i;
        int i2 = this.f11187l;
        if (i2 == -1 || (i = this.f11188m) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: a */
    public C2676s m11437a(int i) {
        return new C2676s(this.f11176a, this.f11177b, this.f11181f, this.f11182g, this.f11179d, this.f11178c, i, this.f11187l, this.f11188m, this.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, this.f11200y, this.f11201z, this.f11174A, this.f11186k, this.f11184i, this.f11185j, this.f11180e);
    }

    /* renamed from: a */
    public C2676s m11438a(int i, int i2) {
        return new C2676s(this.f11176a, this.f11177b, this.f11181f, this.f11182g, this.f11179d, this.f11178c, this.f11183h, this.f11187l, this.f11188m, this.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, i, i2, this.f11200y, this.f11201z, this.f11174A, this.f11186k, this.f11184i, this.f11185j, this.f11180e);
    }

    /* renamed from: a */
    public C2676s m11439a(long j) {
        return new C2676s(this.f11176a, this.f11177b, this.f11181f, this.f11182g, this.f11179d, this.f11178c, this.f11183h, this.f11187l, this.f11188m, this.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, this.f11200y, this.f11201z, this.f11174A, j, this.f11184i, this.f11185j, this.f11180e);
    }

    /* renamed from: a */
    public C2676s m11440a(C2213m c2213m) {
        return new C2676s(this.f11176a, this.f11177b, this.f11181f, this.f11182g, this.f11179d, this.f11178c, this.f11183h, this.f11187l, this.f11188m, this.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, this.f11200y, this.f11201z, this.f11174A, this.f11186k, this.f11184i, c2213m, this.f11180e);
    }

    /* renamed from: a */
    public C2676s m11441a(C2353b c2353b) {
        return new C2676s(this.f11176a, this.f11177b, this.f11181f, this.f11182g, this.f11179d, this.f11178c, this.f11183h, this.f11187l, this.f11188m, this.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, this.f11200y, this.f11201z, this.f11174A, this.f11186k, this.f11184i, this.f11185j, c2353b);
    }

    /* renamed from: a */
    public C2676s m11442a(C2676s c2676s) {
        String str;
        String str2;
        if (this == c2676s) {
            return this;
        }
        int m11169d = C2641r.m11169d(this.f11182g);
        String str3 = c2676s.f11176a;
        String str4 = c2676s.f11177b;
        if (str4 == null) {
            str4 = this.f11177b;
        }
        String str5 = str4;
        String str6 = ((m11169d == 3 || m11169d == 1) && (str = c2676s.f11201z) != null) ? str : this.f11201z;
        int i = this.f11178c;
        if (i == -1) {
            i = c2676s.f11178c;
        }
        int i2 = i;
        String str7 = this.f11179d;
        if (str7 == null) {
            String m11053a = C2622I.m11053a(c2676s.f11179d, m11169d);
            if (C2622I.m11097i(m11053a).length == 1) {
                str2 = m11053a;
                float f = this.f11189n;
                return new C2676s(str3, str5, this.f11181f, this.f11182g, str2, i2, this.f11183h, this.f11187l, this.f11188m, (f == -1.0f || m11169d != 2) ? f : c2676s.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, this.f11200y | c2676s.f11200y, str6, this.f11174A, this.f11186k, this.f11184i, C2213m.m9088a(c2676s.f11185j, this.f11185j), this.f11180e);
            }
        }
        str2 = str7;
        float f2 = this.f11189n;
        return new C2676s(str3, str5, this.f11181f, this.f11182g, str2, i2, this.f11183h, this.f11187l, this.f11188m, (f2 == -1.0f || m11169d != 2) ? f2 : c2676s.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, this.f11200y | c2676s.f11200y, str6, this.f11174A, this.f11186k, this.f11184i, C2213m.m9088a(c2676s.f11185j, this.f11185j), this.f11180e);
    }

    /* renamed from: a */
    public C2676s m11443a(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5) {
        return new C2676s(str, str2, this.f11181f, str3, str4, i, this.f11183h, i2, i3, this.f11189n, this.f11190o, this.f11191p, this.f11193r, this.f11192q, this.f11194s, this.f11195t, this.f11196u, this.f11197v, this.f11198w, this.f11199x, i4, str5, this.f11174A, this.f11186k, this.f11184i, this.f11185j, this.f11180e);
    }

    /* renamed from: b */
    public boolean m11444b(C2676s c2676s) {
        if (this.f11184i.size() != c2676s.f11184i.size()) {
            return false;
        }
        for (int i = 0; i < this.f11184i.size(); i++) {
            if (!Arrays.equals(this.f11184i.get(i), c2676s.f11184i.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2676s.class != obj.getClass()) {
            return false;
        }
        C2676s c2676s = (C2676s) obj;
        int i2 = this.f11175B;
        return (i2 == 0 || (i = c2676s.f11175B) == 0 || i2 == i) && this.f11178c == c2676s.f11178c && this.f11183h == c2676s.f11183h && this.f11187l == c2676s.f11187l && this.f11188m == c2676s.f11188m && Float.compare(this.f11189n, c2676s.f11189n) == 0 && this.f11190o == c2676s.f11190o && Float.compare(this.f11191p, c2676s.f11191p) == 0 && this.f11192q == c2676s.f11192q && this.f11195t == c2676s.f11195t && this.f11196u == c2676s.f11196u && this.f11197v == c2676s.f11197v && this.f11198w == c2676s.f11198w && this.f11199x == c2676s.f11199x && this.f11186k == c2676s.f11186k && this.f11200y == c2676s.f11200y && C2622I.m11067a((Object) this.f11176a, (Object) c2676s.f11176a) && C2622I.m11067a((Object) this.f11177b, (Object) c2676s.f11177b) && C2622I.m11067a((Object) this.f11201z, (Object) c2676s.f11201z) && this.f11174A == c2676s.f11174A && C2622I.m11067a((Object) this.f11181f, (Object) c2676s.f11181f) && C2622I.m11067a((Object) this.f11182g, (Object) c2676s.f11182g) && C2622I.m11067a((Object) this.f11179d, (Object) c2676s.f11179d) && C2622I.m11067a(this.f11185j, c2676s.f11185j) && C2622I.m11067a(this.f11180e, c2676s.f11180e) && C2622I.m11067a(this.f11194s, c2676s.f11194s) && Arrays.equals(this.f11193r, c2676s.f11193r) && m11444b(c2676s);
    }

    public int hashCode() {
        if (this.f11175B == 0) {
            String str = this.f11176a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11181f;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11182g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11179d;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f11178c) * 31) + this.f11187l) * 31) + this.f11188m) * 31) + this.f11195t) * 31) + this.f11196u) * 31;
            String str5 = this.f11201z;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f11174A) * 31;
            C2213m c2213m = this.f11185j;
            int hashCode6 = (hashCode5 + (c2213m == null ? 0 : c2213m.hashCode())) * 31;
            C2353b c2353b = this.f11180e;
            int hashCode7 = (hashCode6 + (c2353b == null ? 0 : c2353b.hashCode())) * 31;
            String str6 = this.f11177b;
            this.f11175B = ((((((((((((((((((((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f11183h) * 31) + ((int) this.f11186k)) * 31) + Float.floatToIntBits(this.f11189n)) * 31) + Float.floatToIntBits(this.f11191p)) * 31) + this.f11190o) * 31) + this.f11192q) * 31) + this.f11197v) * 31) + this.f11198w) * 31) + this.f11199x) * 31) + this.f11200y;
        }
        return this.f11175B;
    }

    public String toString() {
        return "Format(" + this.f11176a + ", " + this.f11177b + ", " + this.f11181f + ", " + this.f11182g + ", " + this.f11179d + ", " + this.f11178c + ", " + this.f11201z + ", [" + this.f11187l + ", " + this.f11188m + ", " + this.f11189n + "], [" + this.f11195t + ", " + this.f11196u + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11176a);
        parcel.writeString(this.f11177b);
        parcel.writeString(this.f11181f);
        parcel.writeString(this.f11182g);
        parcel.writeString(this.f11179d);
        parcel.writeInt(this.f11178c);
        parcel.writeInt(this.f11183h);
        parcel.writeInt(this.f11187l);
        parcel.writeInt(this.f11188m);
        parcel.writeFloat(this.f11189n);
        parcel.writeInt(this.f11190o);
        parcel.writeFloat(this.f11191p);
        C2622I.m11059a(parcel, this.f11193r != null);
        byte[] bArr = this.f11193r;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f11192q);
        parcel.writeParcelable(this.f11194s, i);
        parcel.writeInt(this.f11195t);
        parcel.writeInt(this.f11196u);
        parcel.writeInt(this.f11197v);
        parcel.writeInt(this.f11198w);
        parcel.writeInt(this.f11199x);
        parcel.writeInt(this.f11200y);
        parcel.writeString(this.f11201z);
        parcel.writeInt(this.f11174A);
        parcel.writeLong(this.f11186k);
        int size = this.f11184i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f11184i.get(i2));
        }
        parcel.writeParcelable(this.f11185j, 0);
        parcel.writeParcelable(this.f11180e, 0);
    }
}
