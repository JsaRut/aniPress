package p275e;

import java.io.IOException;

/* renamed from: e.u */
/* loaded from: classes.dex */
public final class C2733u {

    /* renamed from: a */
    final long f11419a;

    /* renamed from: c */
    boolean f11421c;

    /* renamed from: d */
    boolean f11422d;

    /* renamed from: b */
    final C2719g f11420b = new C2719g();

    /* renamed from: e */
    private final InterfaceC2708C f11423e = new a();

    /* renamed from: f */
    private final InterfaceC2709D f11424f = new b();

    /* renamed from: e.u$a */
    /* loaded from: classes.dex */
    final class a implements InterfaceC2708C {

        /* renamed from: a */
        final C2711F f11425a = new C2711F();

        a() {
        }

        @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (C2733u.this.f11420b) {
                if (C2733u.this.f11421c) {
                    return;
                }
                if (C2733u.this.f11422d && C2733u.this.f11420b.size() > 0) {
                    throw new IOException("source is closed");
                }
                C2733u.this.f11421c = true;
                C2733u.this.f11420b.notifyAll();
            }
        }

        @Override // p275e.InterfaceC2708C, java.io.Flushable
        public void flush() {
            synchronized (C2733u.this.f11420b) {
                if (C2733u.this.f11421c) {
                    throw new IllegalStateException("closed");
                }
                if (C2733u.this.f11422d && C2733u.this.f11420b.size() > 0) {
                    throw new IOException("source is closed");
                }
            }
        }

        @Override // p275e.InterfaceC2708C
        public C2711F timeout() {
            return this.f11425a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2708C
        public void write(C2719g c2719g, long j) {
            synchronized (C2733u.this.f11420b) {
                if (C2733u.this.f11421c) {
                    throw new IllegalStateException("closed");
                }
                while (j > 0) {
                    if (C2733u.this.f11422d) {
                        throw new IOException("source is closed");
                    }
                    long size = C2733u.this.f11419a - C2733u.this.f11420b.size();
                    if (size == 0) {
                        this.f11425a.waitUntilNotified(C2733u.this.f11420b);
                    } else {
                        long min = Math.min(size, j);
                        C2733u.this.f11420b.write(c2719g, min);
                        j -= min;
                        C2733u.this.f11420b.notifyAll();
                    }
                }
            }
        }
    }

    /* renamed from: e.u$b */
    /* loaded from: classes.dex */
    final class b implements InterfaceC2709D {

        /* renamed from: a */
        final C2711F f11427a = new C2711F();

        b() {
        }

        @Override // p275e.InterfaceC2709D, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (C2733u.this.f11420b) {
                C2733u.this.f11422d = true;
                C2733u.this.f11420b.notifyAll();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p275e.InterfaceC2709D
        public long read(C2719g c2719g, long j) {
            synchronized (C2733u.this.f11420b) {
                if (C2733u.this.f11422d) {
                    throw new IllegalStateException("closed");
                }
                while (C2733u.this.f11420b.size() == 0) {
                    if (C2733u.this.f11421c) {
                        return -1L;
                    }
                    this.f11427a.waitUntilNotified(C2733u.this.f11420b);
                }
                long read = C2733u.this.f11420b.read(c2719g, j);
                C2733u.this.f11420b.notifyAll();
                return read;
            }
        }

        @Override // p275e.InterfaceC2709D
        public C2711F timeout() {
            return this.f11427a;
        }
    }

    public C2733u(long j) {
        if (j >= 1) {
            this.f11419a = j;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j);
    }

    /* renamed from: a */
    public final InterfaceC2708C m11751a() {
        return this.f11423e;
    }

    /* renamed from: b */
    public final InterfaceC2709D m11752b() {
        return this.f11424f;
    }
}
