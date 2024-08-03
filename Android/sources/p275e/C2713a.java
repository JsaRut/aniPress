package p275e;

import java.io.IOException;

/* renamed from: e.a */
/* loaded from: classes.dex */
public class C2713a implements InterfaceC2708C {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2708C f11380a;

    /* renamed from: b */
    final /* synthetic */ C2715c f11381b;

    public C2713a(C2715c c2715c, InterfaceC2708C interfaceC2708C) {
        this.f11381b = c2715c;
        this.f11380a = interfaceC2708C;
    }

    @Override // p275e.InterfaceC2708C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11381b.enter();
        try {
            try {
                this.f11380a.close();
                this.f11381b.exit(true);
            } catch (IOException e2) {
                throw this.f11381b.exit(e2);
            }
        } catch (Throwable th) {
            this.f11381b.exit(false);
            throw th;
        }
    }

    @Override // p275e.InterfaceC2708C, java.io.Flushable
    public void flush() {
        this.f11381b.enter();
        try {
            try {
                this.f11380a.flush();
                this.f11381b.exit(true);
            } catch (IOException e2) {
                throw this.f11381b.exit(e2);
            }
        } catch (Throwable th) {
            this.f11381b.exit(false);
            throw th;
        }
    }

    @Override // p275e.InterfaceC2708C
    public C2711F timeout() {
        return this.f11381b;
    }

    public String toString() {
        return "AsyncTimeout.sink(" + this.f11380a + ")";
    }

    @Override // p275e.InterfaceC2708C
    public void write(C2719g c2719g, long j) {
        C2712G.m11661a(c2719g.f11390c, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C2738z c2738z = c2719g.f11389b;
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += c2738z.f11439c - c2738z.f11438b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c2738z = c2738z.f11442f;
            }
            this.f11381b.enter();
            try {
                try {
                    this.f11380a.write(c2719g, j2);
                    j -= j2;
                    this.f11381b.exit(true);
                } catch (IOException e2) {
                    throw this.f11381b.exit(e2);
                }
            } catch (Throwable th) {
                this.f11381b.exit(false);
                throw th;
            }
        }
    }
}
