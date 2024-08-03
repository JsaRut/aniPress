package android.support.v4.util;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.util.o */
/* loaded from: classes.dex */
public class C0269o<K, V> {

    /* renamed from: a */
    static Object[] f1108a;

    /* renamed from: b */
    static int f1109b;

    /* renamed from: c */
    static Object[] f1110c;

    /* renamed from: d */
    static int f1111d;

    /* renamed from: e */
    int[] f1112e;

    /* renamed from: f */
    Object[] f1113f;

    /* renamed from: g */
    int f1114g;

    public C0269o() {
        this.f1112e = C0259e.f1074a;
        this.f1113f = C0259e.f1076c;
        this.f1114g = 0;
    }

    public C0269o(int i) {
        if (i == 0) {
            this.f1112e = C0259e.f1074a;
            this.f1113f = C0259e.f1076c;
        } else {
            m1388e(i);
        }
        this.f1114g = 0;
    }

    /* renamed from: a */
    private static int m1386a(int[] iArr, int i, int i2) {
        try {
            return C0259e.m1348a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m1387a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0256b.class) {
                if (f1111d < 10) {
                    objArr[0] = f1110c;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1110c = objArr;
                    f1111d++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0256b.class) {
                if (f1109b < 10) {
                    objArr[0] = f1108a;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1108a = objArr;
                    f1109b++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m1388e(int i) {
        if (i == 8) {
            synchronized (C0256b.class) {
                if (f1110c != null) {
                    Object[] objArr = f1110c;
                    this.f1113f = objArr;
                    f1110c = (Object[]) objArr[0];
                    this.f1112e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1111d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0256b.class) {
                if (f1108a != null) {
                    Object[] objArr2 = f1108a;
                    this.f1113f = objArr2;
                    f1108a = (Object[]) objArr2[0];
                    this.f1112e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1109b--;
                    return;
                }
            }
        }
        this.f1112e = new int[i];
        this.f1113f = new Object[i << 1];
    }

    /* renamed from: a */
    int m1389a() {
        int i = this.f1114g;
        if (i == 0) {
            return -1;
        }
        int m1386a = m1386a(this.f1112e, i, 0);
        if (m1386a < 0 || this.f1113f[m1386a << 1] == null) {
            return m1386a;
        }
        int i2 = m1386a + 1;
        while (i2 < i && this.f1112e[i2] == 0) {
            if (this.f1113f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m1386a - 1; i3 >= 0 && this.f1112e[i3] == 0; i3--) {
            if (this.f1113f[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: a */
    public int m1390a(Object obj) {
        return obj == null ? m1389a() : m1391a(obj, obj.hashCode());
    }

    /* renamed from: a */
    int m1391a(Object obj, int i) {
        int i2 = this.f1114g;
        if (i2 == 0) {
            return -1;
        }
        int m1386a = m1386a(this.f1112e, i2, i);
        if (m1386a < 0 || obj.equals(this.f1113f[m1386a << 1])) {
            return m1386a;
        }
        int i3 = m1386a + 1;
        while (i3 < i2 && this.f1112e[i3] == i) {
            if (obj.equals(this.f1113f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m1386a - 1; i4 >= 0 && this.f1112e[i4] == i; i4--) {
            if (obj.equals(this.f1113f[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    public V m1392a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1113f;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void m1393a(int i) {
        int i2 = this.f1114g;
        int[] iArr = this.f1112e;
        if (iArr.length < i) {
            Object[] objArr = this.f1113f;
            m1388e(i);
            if (this.f1114g > 0) {
                System.arraycopy(iArr, 0, this.f1112e, 0, i2);
                System.arraycopy(objArr, 0, this.f1113f, 0, i2 << 1);
            }
            m1387a(iArr, objArr, i2);
        }
        if (this.f1114g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public int m1394b(Object obj) {
        int i = this.f1114g * 2;
        Object[] objArr = this.f1113f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K m1395b(int i) {
        return (K) this.f1113f[i << 1];
    }

    /* renamed from: c */
    public V m1396c(int i) {
        int i2;
        Object[] objArr = this.f1113f;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f1114g;
        if (i4 <= 1) {
            m1387a(this.f1112e, objArr, i4);
            this.f1112e = C0259e.f1074a;
            this.f1113f = C0259e.f1076c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f1112e;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f1112e;
                    int i5 = i + 1;
                    int i6 = i2 - i;
                    System.arraycopy(iArr2, i5, iArr2, i, i6);
                    Object[] objArr2 = this.f1113f;
                    System.arraycopy(objArr2, i5 << 1, objArr2, i3, i6 << 1);
                }
                Object[] objArr3 = this.f1113f;
                int i7 = i2 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i4 > 8 ? i4 + (i4 >> 1) : 8;
                int[] iArr3 = this.f1112e;
                Object[] objArr4 = this.f1113f;
                m1388e(i8);
                if (i4 != this.f1114g) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f1112e, 0, i);
                    System.arraycopy(objArr4, 0, this.f1113f, 0, i3);
                }
                if (i < i2) {
                    int i9 = i + 1;
                    int i10 = i2 - i;
                    System.arraycopy(iArr3, i9, this.f1112e, i, i10);
                    System.arraycopy(objArr4, i9 << 1, this.f1113f, i3, i10 << 1);
                }
            }
        }
        if (i4 != this.f1114g) {
            throw new ConcurrentModificationException();
        }
        this.f1114g = i2;
        return v;
    }

    public void clear() {
        int i = this.f1114g;
        if (i > 0) {
            int[] iArr = this.f1112e;
            Object[] objArr = this.f1113f;
            this.f1112e = C0259e.f1074a;
            this.f1113f = C0259e.f1076c;
            this.f1114g = 0;
            m1387a(iArr, objArr, i);
        }
        if (this.f1114g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1390a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1394b(obj) >= 0;
    }

    /* renamed from: d */
    public V m1397d(int i) {
        return (V) this.f1113f[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0269o) {
            C0269o c0269o = (C0269o) obj;
            if (size() != c0269o.size()) {
                return false;
            }
            for (int i = 0; i < this.f1114g; i++) {
                try {
                    K m1395b = m1395b(i);
                    V m1397d = m1397d(i);
                    Object obj2 = c0269o.get(m1395b);
                    if (m1397d == null) {
                        if (obj2 != null || !c0269o.containsKey(m1395b)) {
                            return false;
                        }
                    } else if (!m1397d.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1114g; i2++) {
                try {
                    K m1395b2 = m1395b(i2);
                    V m1397d2 = m1397d(i2);
                    Object obj3 = map.get(m1395b2);
                    if (m1397d2 == null) {
                        if (obj3 != null || !map.containsKey(m1395b2)) {
                            return false;
                        }
                    } else if (!m1397d2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int m1390a = m1390a(obj);
        if (m1390a >= 0) {
            return (V) this.f1113f[(m1390a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f1112e;
        Object[] objArr = this.f1113f;
        int i = this.f1114g;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f1114g <= 0;
    }

    public V put(K k, V v) {
        int i;
        int m1391a;
        int i2 = this.f1114g;
        if (k == null) {
            m1391a = m1389a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m1391a = m1391a(k, hashCode);
        }
        if (m1391a >= 0) {
            int i3 = (m1391a << 1) + 1;
            Object[] objArr = this.f1113f;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = m1391a ^ (-1);
        if (i2 >= this.f1112e.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f1112e;
            Object[] objArr2 = this.f1113f;
            m1388e(i5);
            if (i2 != this.f1114g) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1112e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1113f, 0, objArr2.length);
            }
            m1387a(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f1112e;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f1113f;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f1114g - i4) << 1);
        }
        int i7 = this.f1114g;
        if (i2 == i7) {
            int[] iArr4 = this.f1112e;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f1113f;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f1114g = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int m1390a = m1390a(obj);
        if (m1390a >= 0) {
            return m1396c(m1390a);
        }
        return null;
    }

    public int size() {
        return this.f1114g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1114g * 28);
        sb.append('{');
        for (int i = 0; i < this.f1114g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m1395b = m1395b(i);
            if (m1395b != this) {
                sb.append(m1395b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m1397d = m1397d(i);
            if (m1397d != this) {
                sb.append(m1397d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
