package android.support.v4.util;

/* loaded from: classes.dex */
public class Pools$SimplePool<T> implements InterfaceC0266l<T> {

    /* renamed from: a */
    private final Object[] f1059a;

    /* renamed from: b */
    private int f1060b;

    public Pools$SimplePool(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1059a = new Object[i];
    }

    /* renamed from: b */
    private boolean m1325b(T t) {
        for (int i = 0; i < this.f1060b; i++) {
            if (this.f1059a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo1326a() {
        int i = this.f1060b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f1059a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f1060b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo1327a(T t) {
        if (m1325b(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f1060b;
        Object[] objArr = this.f1059a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f1060b = i + 1;
        return true;
    }
}
