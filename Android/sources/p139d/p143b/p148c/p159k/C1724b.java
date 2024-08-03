package p139d.p143b.p148c.p159k;

/* renamed from: d.b.c.k.b */
/* loaded from: classes.dex */
public class C1724b {
    /* renamed from: a */
    public static int m7072a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    /* renamed from: a */
    public static int m7073a(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    /* renamed from: a */
    public static int m7074a(Object obj, Object obj2) {
        return m7072a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }

    /* renamed from: a */
    public static int m7075a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m7073a(obj == null ? 0 : obj.hashCode(), obj2 == null ? 0 : obj2.hashCode(), obj3 == null ? 0 : obj3.hashCode(), obj4 == null ? 0 : obj4.hashCode(), obj5 == null ? 0 : obj5.hashCode(), obj6 == null ? 0 : obj6.hashCode());
    }
}
