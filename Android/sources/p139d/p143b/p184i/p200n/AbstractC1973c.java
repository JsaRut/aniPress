package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.i.n.c */
/* loaded from: classes.dex */
public abstract class AbstractC1973c<T> implements InterfaceC1995n<T> {

    /* renamed from: a */
    private boolean f7210a = false;

    /* renamed from: a */
    public static int m8076a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static boolean m8077a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: a */
    public static boolean m8078a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    public static boolean m8079b(int i) {
        return !m8077a(i);
    }

    /* renamed from: b */
    public static boolean m8080b(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: c */
    public static int m8081c(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1995n
    /* renamed from: a */
    public synchronized void mo8082a() {
        if (this.f7210a) {
            return;
        }
        this.f7210a = true;
        try {
            mo7858b();
        } catch (Exception e2) {
            m8084a(e2);
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1995n
    /* renamed from: a */
    public synchronized void mo8083a(float f) {
        if (this.f7210a) {
            return;
        }
        try {
            mo7859b(f);
        } catch (Exception e2) {
            m8084a(e2);
        }
    }

    /* renamed from: a */
    protected void m8084a(Exception exc) {
        C1700a.m7010c(getClass(), "unhandled exception", exc);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1995n
    /* renamed from: a */
    public synchronized void mo8085a(T t, int i) {
        if (this.f7210a) {
            return;
        }
        this.f7210a = m8077a(i);
        try {
            mo7860b((AbstractC1973c<T>) t, i);
        } catch (Exception e2) {
            m8084a(e2);
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1995n
    /* renamed from: a */
    public synchronized void mo8086a(Throwable th) {
        if (this.f7210a) {
            return;
        }
        this.f7210a = true;
        try {
            mo7861b(th);
        } catch (Exception e2) {
            m8084a(e2);
        }
    }

    /* renamed from: b */
    protected abstract void mo7858b();

    /* renamed from: b */
    protected abstract void mo7859b(float f);

    /* renamed from: b */
    protected abstract void mo7860b(T t, int i);

    /* renamed from: b */
    protected abstract void mo7861b(Throwable th);
}
