package android.support.v4.util;

/* renamed from: android.support.v4.util.h */
/* loaded from: classes.dex */
public class C0262h<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1079a = new Object();

    /* renamed from: b */
    private boolean f1080b;

    /* renamed from: c */
    private long[] f1081c;

    /* renamed from: d */
    private Object[] f1082d;

    /* renamed from: e */
    private int f1083e;

    public C0262h() {
        this(10);
    }

    public C0262h(int i) {
        Object[] objArr;
        this.f1080b = false;
        if (i == 0) {
            this.f1081c = C0259e.f1075b;
            objArr = C0259e.f1076c;
        } else {
            int m1352c = C0259e.m1352c(i);
            this.f1081c = new long[m1352c];
            objArr = new Object[m1352c];
        }
        this.f1082d = objArr;
        this.f1083e = 0;
    }

    /* renamed from: c */
    private void m1355c() {
        int i = this.f1083e;
        long[] jArr = this.f1081c;
        Object[] objArr = this.f1082d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1079a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1080b = false;
        this.f1083e = i2;
    }

    /* renamed from: a */
    public long m1356a(int i) {
        if (this.f1080b) {
            m1355c();
        }
        return this.f1081c[i];
    }

    /* renamed from: a */
    public void m1357a() {
        int i = this.f1083e;
        Object[] objArr = this.f1082d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1083e = 0;
        this.f1080b = false;
    }

    /* renamed from: a */
    public void m1358a(long j) {
        int m1349a = C0259e.m1349a(this.f1081c, this.f1083e, j);
        if (m1349a >= 0) {
            Object[] objArr = this.f1082d;
            Object obj = objArr[m1349a];
            Object obj2 = f1079a;
            if (obj != obj2) {
                objArr[m1349a] = obj2;
                this.f1080b = true;
            }
        }
    }

    /* renamed from: a */
    public void m1359a(long j, E e2) {
        int i = this.f1083e;
        if (i != 0 && j <= this.f1081c[i - 1]) {
            m1364c(j, e2);
            return;
        }
        if (this.f1080b && this.f1083e >= this.f1081c.length) {
            m1355c();
        }
        int i2 = this.f1083e;
        if (i2 >= this.f1081c.length) {
            int m1352c = C0259e.m1352c(i2 + 1);
            long[] jArr = new long[m1352c];
            Object[] objArr = new Object[m1352c];
            long[] jArr2 = this.f1081c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1082d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1081c = jArr;
            this.f1082d = objArr;
        }
        this.f1081c[i2] = j;
        this.f1082d[i2] = e2;
        this.f1083e = i2 + 1;
    }

    /* renamed from: b */
    public int m1360b() {
        if (this.f1080b) {
            m1355c();
        }
        return this.f1083e;
    }

    /* renamed from: b */
    public E m1361b(int i) {
        if (this.f1080b) {
            m1355c();
        }
        return (E) this.f1082d[i];
    }

    /* renamed from: b */
    public E m1362b(long j) {
        return m1363b(j, null);
    }

    /* renamed from: b */
    public E m1363b(long j, E e2) {
        int m1349a = C0259e.m1349a(this.f1081c, this.f1083e, j);
        if (m1349a >= 0) {
            Object[] objArr = this.f1082d;
            if (objArr[m1349a] != f1079a) {
                return (E) objArr[m1349a];
            }
        }
        return e2;
    }

    /* renamed from: c */
    public void m1364c(long j, E e2) {
        int m1349a = C0259e.m1349a(this.f1081c, this.f1083e, j);
        if (m1349a >= 0) {
            this.f1082d[m1349a] = e2;
            return;
        }
        int i = m1349a ^ (-1);
        if (i < this.f1083e) {
            Object[] objArr = this.f1082d;
            if (objArr[i] == f1079a) {
                this.f1081c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f1080b && this.f1083e >= this.f1081c.length) {
            m1355c();
            i = C0259e.m1349a(this.f1081c, this.f1083e, j) ^ (-1);
        }
        int i2 = this.f1083e;
        if (i2 >= this.f1081c.length) {
            int m1352c = C0259e.m1352c(i2 + 1);
            long[] jArr = new long[m1352c];
            Object[] objArr2 = new Object[m1352c];
            long[] jArr2 = this.f1081c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1082d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1081c = jArr;
            this.f1082d = objArr2;
        }
        int i3 = this.f1083e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f1081c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f1082d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f1083e - i);
        }
        this.f1081c[i] = j;
        this.f1082d[i] = e2;
        this.f1083e++;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0262h<E> m11775clone() {
        try {
            C0262h<E> c0262h = (C0262h) super.clone();
            c0262h.f1081c = (long[]) this.f1081c.clone();
            c0262h.f1082d = (Object[]) this.f1082d.clone();
            return c0262h;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        if (m1360b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1083e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1083e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m1356a(i));
            sb.append('=');
            E m1361b = m1361b(i);
            if (m1361b != this) {
                sb.append(m1361b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
