package android.support.v4.util;

/* renamed from: android.support.v4.util.p */
/* loaded from: classes.dex */
public class C0270p<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1115a = new Object();

    /* renamed from: b */
    private boolean f1116b;

    /* renamed from: c */
    private int[] f1117c;

    /* renamed from: d */
    private Object[] f1118d;

    /* renamed from: e */
    private int f1119e;

    public C0270p() {
        this(10);
    }

    public C0270p(int i) {
        Object[] objArr;
        this.f1116b = false;
        if (i == 0) {
            this.f1117c = C0259e.f1074a;
            objArr = C0259e.f1076c;
        } else {
            int m1351b = C0259e.m1351b(i);
            this.f1117c = new int[m1351b];
            objArr = new Object[m1351b];
        }
        this.f1118d = objArr;
        this.f1119e = 0;
    }

    /* renamed from: c */
    private void m1398c() {
        int i = this.f1119e;
        int[] iArr = this.f1117c;
        Object[] objArr = this.f1118d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1115a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1116b = false;
        this.f1119e = i2;
    }

    /* renamed from: a */
    public void m1399a() {
        int i = this.f1119e;
        Object[] objArr = this.f1118d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1119e = 0;
        this.f1116b = false;
    }

    /* renamed from: a */
    public void m1400a(int i) {
        int m1348a = C0259e.m1348a(this.f1117c, this.f1119e, i);
        if (m1348a >= 0) {
            Object[] objArr = this.f1118d;
            Object obj = objArr[m1348a];
            Object obj2 = f1115a;
            if (obj != obj2) {
                objArr[m1348a] = obj2;
                this.f1116b = true;
            }
        }
    }

    /* renamed from: a */
    public void m1401a(int i, E e2) {
        int i2 = this.f1119e;
        if (i2 != 0 && i <= this.f1117c[i2 - 1]) {
            m1406c(i, e2);
            return;
        }
        if (this.f1116b && this.f1119e >= this.f1117c.length) {
            m1398c();
        }
        int i3 = this.f1119e;
        if (i3 >= this.f1117c.length) {
            int m1351b = C0259e.m1351b(i3 + 1);
            int[] iArr = new int[m1351b];
            Object[] objArr = new Object[m1351b];
            int[] iArr2 = this.f1117c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1118d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1117c = iArr;
            this.f1118d = objArr;
        }
        this.f1117c[i3] = i;
        this.f1118d[i3] = e2;
        this.f1119e = i3 + 1;
    }

    /* renamed from: b */
    public int m1402b() {
        if (this.f1116b) {
            m1398c();
        }
        return this.f1119e;
    }

    /* renamed from: b */
    public E m1403b(int i) {
        return m1404b(i, null);
    }

    /* renamed from: b */
    public E m1404b(int i, E e2) {
        int m1348a = C0259e.m1348a(this.f1117c, this.f1119e, i);
        if (m1348a >= 0) {
            Object[] objArr = this.f1118d;
            if (objArr[m1348a] != f1115a) {
                return (E) objArr[m1348a];
            }
        }
        return e2;
    }

    /* renamed from: c */
    public int m1405c(int i) {
        if (this.f1116b) {
            m1398c();
        }
        return this.f1117c[i];
    }

    /* renamed from: c */
    public void m1406c(int i, E e2) {
        int m1348a = C0259e.m1348a(this.f1117c, this.f1119e, i);
        if (m1348a >= 0) {
            this.f1118d[m1348a] = e2;
            return;
        }
        int i2 = m1348a ^ (-1);
        if (i2 < this.f1119e) {
            Object[] objArr = this.f1118d;
            if (objArr[i2] == f1115a) {
                this.f1117c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1116b && this.f1119e >= this.f1117c.length) {
            m1398c();
            i2 = C0259e.m1348a(this.f1117c, this.f1119e, i) ^ (-1);
        }
        int i3 = this.f1119e;
        if (i3 >= this.f1117c.length) {
            int m1351b = C0259e.m1351b(i3 + 1);
            int[] iArr = new int[m1351b];
            Object[] objArr2 = new Object[m1351b];
            int[] iArr2 = this.f1117c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1118d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1117c = iArr;
            this.f1118d = objArr2;
        }
        int i4 = this.f1119e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f1117c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f1118d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f1119e - i2);
        }
        this.f1117c[i2] = i;
        this.f1118d[i2] = e2;
        this.f1119e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0270p<E> m11776clone() {
        try {
            C0270p<E> c0270p = (C0270p) super.clone();
            c0270p.f1117c = (int[]) this.f1117c.clone();
            c0270p.f1118d = (Object[]) this.f1118d.clone();
            return c0270p;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public void m1407d(int i) {
        m1400a(i);
    }

    /* renamed from: e */
    public E m1408e(int i) {
        if (this.f1116b) {
            m1398c();
        }
        return (E) this.f1118d[i];
    }

    public String toString() {
        if (m1402b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1119e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1119e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1405c(i));
            sb.append('=');
            E m1408e = m1408e(i);
            if (m1408e != this) {
                sb.append(m1408e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
