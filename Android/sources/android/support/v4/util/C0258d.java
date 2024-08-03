package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: android.support.v4.util.d */
/* loaded from: classes.dex */
public final class C0258d<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    private static final int[] f1064a = new int[0];

    /* renamed from: b */
    private static final Object[] f1065b = new Object[0];

    /* renamed from: c */
    private static Object[] f1066c;

    /* renamed from: d */
    private static int f1067d;

    /* renamed from: e */
    private static Object[] f1068e;

    /* renamed from: f */
    private static int f1069f;

    /* renamed from: g */
    private int[] f1070g;

    /* renamed from: h */
    Object[] f1071h;

    /* renamed from: i */
    int f1072i;

    /* renamed from: j */
    private AbstractC0264j<E, E> f1073j;

    public C0258d() {
        this(0);
    }

    public C0258d(int i) {
        if (i == 0) {
            this.f1070g = f1064a;
            this.f1071h = f1065b;
        } else {
            m1343d(i);
        }
        this.f1072i = 0;
    }

    /* renamed from: a */
    private int m1339a(Object obj, int i) {
        int i2 = this.f1072i;
        if (i2 == 0) {
            return -1;
        }
        int m1348a = C0259e.m1348a(this.f1070g, i2, i);
        if (m1348a < 0 || obj.equals(this.f1071h[m1348a])) {
            return m1348a;
        }
        int i3 = m1348a + 1;
        while (i3 < i2 && this.f1070g[i3] == i) {
            if (obj.equals(this.f1071h[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m1348a - 1; i4 >= 0 && this.f1070g[i4] == i; i4--) {
            if (obj.equals(this.f1071h[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    private AbstractC0264j<E, E> m1340a() {
        if (this.f1073j == null) {
            this.f1073j = new C0257c(this);
        }
        return this.f1073j;
    }

    /* renamed from: a */
    private static void m1341a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0258d.class) {
                if (f1069f < 10) {
                    objArr[0] = f1068e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1068e = objArr;
                    f1069f++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0258d.class) {
                if (f1067d < 10) {
                    objArr[0] = f1066c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1066c = objArr;
                    f1067d++;
                }
            }
        }
    }

    /* renamed from: b */
    private int m1342b() {
        int i = this.f1072i;
        if (i == 0) {
            return -1;
        }
        int m1348a = C0259e.m1348a(this.f1070g, i, 0);
        if (m1348a < 0 || this.f1071h[m1348a] == null) {
            return m1348a;
        }
        int i2 = m1348a + 1;
        while (i2 < i && this.f1070g[i2] == 0) {
            if (this.f1071h[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m1348a - 1; i3 >= 0 && this.f1070g[i3] == 0; i3--) {
            if (this.f1071h[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* renamed from: d */
    private void m1343d(int i) {
        if (i == 8) {
            synchronized (C0258d.class) {
                if (f1068e != null) {
                    Object[] objArr = f1068e;
                    this.f1071h = objArr;
                    f1068e = (Object[]) objArr[0];
                    this.f1070g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1069f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0258d.class) {
                if (f1066c != null) {
                    Object[] objArr2 = f1066c;
                    this.f1071h = objArr2;
                    f1066c = (Object[]) objArr2[0];
                    this.f1070g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1067d--;
                    return;
                }
            }
        }
        this.f1070g = new int[i];
        this.f1071h = new Object[i];
    }

    /* renamed from: a */
    public void m1344a(int i) {
        int[] iArr = this.f1070g;
        if (iArr.length < i) {
            Object[] objArr = this.f1071h;
            m1343d(i);
            int i2 = this.f1072i;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1070g, 0, i2);
                System.arraycopy(objArr, 0, this.f1071h, 0, this.f1072i);
            }
            m1341a(iArr, objArr, this.f1072i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i;
        int m1339a;
        if (e2 == null) {
            m1339a = m1342b();
            i = 0;
        } else {
            int hashCode = e2.hashCode();
            i = hashCode;
            m1339a = m1339a(e2, hashCode);
        }
        if (m1339a >= 0) {
            return false;
        }
        int i2 = m1339a ^ (-1);
        int i3 = this.f1072i;
        if (i3 >= this.f1070g.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f1070g;
            Object[] objArr = this.f1071h;
            m1343d(i4);
            int[] iArr2 = this.f1070g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1071h, 0, objArr.length);
            }
            m1341a(iArr, objArr, this.f1072i);
        }
        int i5 = this.f1072i;
        if (i2 < i5) {
            int[] iArr3 = this.f1070g;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f1071h;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f1072i - i2);
        }
        this.f1070g[i2] = i;
        this.f1071h[i2] = e2;
        this.f1072i++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m1344a(this.f1072i + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public E m1345b(int i) {
        Object[] objArr = this.f1071h;
        E e2 = (E) objArr[i];
        int i2 = this.f1072i;
        if (i2 <= 1) {
            m1341a(this.f1070g, objArr, i2);
            this.f1070g = f1064a;
            this.f1071h = f1065b;
            this.f1072i = 0;
        } else {
            int[] iArr = this.f1070g;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f1072i--;
                int i3 = this.f1072i;
                if (i < i3) {
                    int[] iArr2 = this.f1070g;
                    int i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i3 - i);
                    Object[] objArr2 = this.f1071h;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f1072i - i);
                }
                this.f1071h[this.f1072i] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr3 = this.f1070g;
                Object[] objArr3 = this.f1071h;
                m1343d(i5);
                this.f1072i--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f1070g, 0, i);
                    System.arraycopy(objArr3, 0, this.f1071h, 0, i);
                }
                int i6 = this.f1072i;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f1070g, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.f1071h, i, this.f1072i - i);
                }
            }
        }
        return e2;
    }

    /* renamed from: c */
    public E m1346c(int i) {
        return (E) this.f1071h[i];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f1072i;
        if (i != 0) {
            m1341a(this.f1070g, this.f1071h, i);
            this.f1070g = f1064a;
            this.f1071h = f1065b;
            this.f1072i = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f1072i; i++) {
                try {
                    if (!set.contains(m1346c(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1070g;
        int i = this.f1072i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m1342b() : m1339a(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1072i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m1340a().m1379e().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m1345b(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1072i - 1; i >= 0; i--) {
            if (!collection.contains(this.f1071h[i])) {
                m1345b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1072i;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f1072i;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f1071h, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1072i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1072i));
        }
        System.arraycopy(this.f1071h, 0, tArr, 0, this.f1072i);
        int length = tArr.length;
        int i = this.f1072i;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1072i * 14);
        sb.append('{');
        for (int i = 0; i < this.f1072i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m1346c = m1346c(i);
            if (m1346c != this) {
                sb.append(m1346c);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
