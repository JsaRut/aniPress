package p139d.p225c.p226a.p227a.p230c;

import java.lang.Exception;
import java.util.ArrayDeque;
import p139d.p225c.p226a.p227a.p230c.AbstractC2197g;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.c.i */
/* loaded from: classes.dex */
public abstract class AbstractC2199i<I extends C2196f, O extends AbstractC2197g, E extends Exception> implements InterfaceC2194d<I, O, E> {

    /* renamed from: a */
    private final Thread f8046a;

    /* renamed from: b */
    private final Object f8047b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f8048c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f8049d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f8050e;

    /* renamed from: f */
    private final O[] f8051f;

    /* renamed from: g */
    private int f8052g;

    /* renamed from: h */
    private int f8053h;

    /* renamed from: i */
    private I f8054i;

    /* renamed from: j */
    private E f8055j;

    /* renamed from: k */
    private boolean f8056k;

    /* renamed from: l */
    private boolean f8057l;

    /* renamed from: m */
    private int f8058m;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2199i(I[] iArr, O[] oArr) {
        this.f8050e = iArr;
        this.f8052g = iArr.length;
        for (int i = 0; i < this.f8052g; i++) {
            this.f8050e[i] = mo9045d();
        }
        this.f8051f = oArr;
        this.f8053h = oArr.length;
        for (int i2 = 0; i2 < this.f8053h; i2++) {
            this.f8051f[i2] = mo9046e();
        }
        this.f8046a = new C2198h(this);
        this.f8046a.start();
    }

    /* renamed from: b */
    private void m9033b(I i) {
        i.mo9006b();
        I[] iArr = this.f8050e;
        int i2 = this.f8052g;
        this.f8052g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private void m9034b(O o) {
        o.mo9006b();
        O[] oArr = this.f8051f;
        int i = this.f8053h;
        this.f8053h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: f */
    private boolean m9035f() {
        return !this.f8048c.isEmpty() && this.f8053h > 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: g */
    private boolean m9036g() {
        synchronized (this.f8047b) {
            while (!this.f8057l && !m9035f()) {
                this.f8047b.wait();
            }
            if (this.f8057l) {
                return false;
            }
            I removeFirst = this.f8048c.removeFirst();
            O[] oArr = this.f8051f;
            int i = this.f8053h - 1;
            this.f8053h = i;
            O o = oArr[i];
            boolean z = this.f8056k;
            this.f8056k = false;
            if (removeFirst.m9010d()) {
                o.m9007b(4);
            } else {
                if (removeFirst.m9009c()) {
                    o.m9007b(Integer.MIN_VALUE);
                }
                try {
                    this.f8055j = mo9040a(removeFirst, o, z);
                } catch (OutOfMemoryError | RuntimeException e2) {
                    this.f8055j = mo9041a(e2);
                }
                if (this.f8055j != null) {
                    synchronized (this.f8047b) {
                    }
                    return false;
                }
            }
            synchronized (this.f8047b) {
                if (!this.f8056k) {
                    if (o.m9009c()) {
                        this.f8058m++;
                    } else {
                        o.f8044c = this.f8058m;
                        this.f8058m = 0;
                        this.f8049d.addLast(o);
                        m9033b((AbstractC2199i<I, O, E>) removeFirst);
                    }
                }
                o.mo9031f();
                m9033b((AbstractC2199i<I, O, E>) removeFirst);
            }
            return true;
        }
    }

    /* renamed from: h */
    private void m9037h() {
        if (m9035f()) {
            this.f8047b.notify();
        }
    }

    /* renamed from: i */
    private void m9038i() {
        E e2 = this.f8055j;
        if (e2 != null) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: j */
    public void m9039j() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (m9036g());
    }

    /* renamed from: a */
    protected abstract E mo9040a(I i, O o, boolean z);

    /* renamed from: a */
    protected abstract E mo9041a(Throwable th);

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: a */
    public void mo9020a() {
        synchronized (this.f8047b) {
            this.f8057l = true;
            this.f8047b.notify();
        }
        try {
            this.f8046a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m9042a(int i) {
        C2628e.m11113b(this.f8052g == this.f8050e.length);
        for (I i2 : this.f8050e) {
            i2.m9028f(i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo9021a(I i) {
        synchronized (this.f8047b) {
            m9038i();
            C2628e.m11111a(i == this.f8054i);
            this.f8048c.addLast(i);
            m9037h();
            this.f8054i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m9044a(O o) {
        synchronized (this.f8047b) {
            m9034b((AbstractC2199i<I, O, E>) o);
            m9037h();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: b */
    public final O mo9022b() {
        synchronized (this.f8047b) {
            m9038i();
            if (this.f8049d.isEmpty()) {
                return null;
            }
            return this.f8049d.removeFirst();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: c */
    public final I mo9023c() {
        I i;
        I i2;
        synchronized (this.f8047b) {
            m9038i();
            C2628e.m11113b(this.f8054i == null);
            if (this.f8052g == 0) {
                i = null;
            } else {
                I[] iArr = this.f8050e;
                int i3 = this.f8052g - 1;
                this.f8052g = i3;
                i = iArr[i3];
            }
            this.f8054i = i;
            i2 = this.f8054i;
        }
        return i2;
    }

    /* renamed from: d */
    protected abstract I mo9045d();

    /* renamed from: e */
    protected abstract O mo9046e();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    public final void flush() {
        synchronized (this.f8047b) {
            this.f8056k = true;
            this.f8058m = 0;
            if (this.f8054i != null) {
                m9033b((AbstractC2199i<I, O, E>) this.f8054i);
                this.f8054i = null;
            }
            while (!this.f8048c.isEmpty()) {
                m9033b((AbstractC2199i<I, O, E>) this.f8048c.removeFirst());
            }
            while (!this.f8049d.isEmpty()) {
                this.f8049d.removeFirst().mo9031f();
            }
        }
    }
}
