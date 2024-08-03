package p139d.p225c.p226a.p227a.p270n;

/* renamed from: d.c.a.a.n.i */
/* loaded from: classes.dex */
public final class C2632i {

    /* renamed from: a */
    private boolean f10951a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized void m11132a() {
        while (!this.f10951a) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized boolean m11133b() {
        boolean z;
        z = this.f10951a;
        this.f10951a = false;
        return z;
    }

    /* renamed from: c */
    public synchronized boolean m11134c() {
        if (this.f10951a) {
            return false;
        }
        this.f10951a = true;
        notifyAll();
        return true;
    }
}
