package p139d.p143b.p148c.p156h;

import java.lang.ref.SoftReference;

/* renamed from: d.b.c.h.c */
/* loaded from: classes.dex */
public class C1717c<T> {

    /* renamed from: a */
    SoftReference<T> f6242a = null;

    /* renamed from: b */
    SoftReference<T> f6243b = null;

    /* renamed from: c */
    SoftReference<T> f6244c = null;

    /* renamed from: a */
    public void m7051a() {
        SoftReference<T> softReference = this.f6242a;
        if (softReference != null) {
            softReference.clear();
            this.f6242a = null;
        }
        SoftReference<T> softReference2 = this.f6243b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f6243b = null;
        }
        SoftReference<T> softReference3 = this.f6244c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f6244c = null;
        }
    }

    /* renamed from: a */
    public void m7052a(T t) {
        this.f6242a = new SoftReference<>(t);
        this.f6243b = new SoftReference<>(t);
        this.f6244c = new SoftReference<>(t);
    }

    /* renamed from: b */
    public T m7053b() {
        SoftReference<T> softReference = this.f6242a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }
}
