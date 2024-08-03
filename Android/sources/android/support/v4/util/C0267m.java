package android.support.v4.util;

/* renamed from: android.support.v4.util.m */
/* loaded from: classes.dex */
public class C0267m<T> extends Pools$SimplePool<T> {

    /* renamed from: c */
    private final Object f1107c;

    public C0267m(int i) {
        super(i);
        this.f1107c = new Object();
    }

    @Override // android.support.v4.util.Pools$SimplePool
    /* renamed from: a */
    public T mo1326a() {
        T t;
        synchronized (this.f1107c) {
            t = (T) super.mo1326a();
        }
        return t;
    }

    @Override // android.support.v4.util.Pools$SimplePool
    /* renamed from: a */
    public boolean mo1327a(T t) {
        boolean mo1327a;
        synchronized (this.f1107c) {
            mo1327a = super.mo1327a(t);
        }
        return mo1327a;
    }
}
