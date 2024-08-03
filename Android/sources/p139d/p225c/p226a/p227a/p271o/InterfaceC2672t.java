package p139d.p225c.p226a.p227a.p271o;

import android.os.Handler;
import android.view.Surface;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p230c.C2195e;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2672t;

/* renamed from: d.c.a.a.o.t */
/* loaded from: classes.dex */
public interface InterfaceC2672t {

    /* renamed from: d.c.a.a.o.t$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f11124a;

        /* renamed from: b */
        private final InterfaceC2672t f11125b;

        public a(Handler handler, InterfaceC2672t interfaceC2672t) {
            Handler handler2;
            if (interfaceC2672t != null) {
                C2628e.m11110a(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f11124a = handler2;
            this.f11125b = interfaceC2672t;
        }

        /* renamed from: a */
        public /* synthetic */ void m11327a(int i, int i2, int i3, float f) {
            this.f11125b.mo8623a(i, i2, i3, f);
        }

        /* renamed from: a */
        public void m11328a(final int i, final long j) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11334b(i, j);
                    }
                });
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m11329a(Surface surface) {
            this.f11125b.mo8625a(surface);
        }

        /* renamed from: a */
        public void m11330a(final C2195e c2195e) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11339c(c2195e);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m11331a(final C2676s c2676s) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11337b(c2676s);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m11332a(final String str, final long j, final long j2) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11338b(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m11333b(final int i, final int i2, final int i3, final float f) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11327a(i, i2, i3, f);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m11334b(int i, long j) {
            this.f11125b.mo8624a(i, j);
        }

        /* renamed from: b */
        public void m11335b(final Surface surface) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11329a(surface);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m11336b(final C2195e c2195e) {
            if (this.f11125b != null) {
                this.f11124a.post(new Runnable() { // from class: d.c.a.a.o.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2672t.a.this.m11340d(c2195e);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m11337b(C2676s c2676s) {
            this.f11125b.mo8627a(c2676s);
        }

        /* renamed from: b */
        public /* synthetic */ void m11338b(String str, long j, long j2) {
            this.f11125b.mo8628a(str, j, j2);
        }

        /* renamed from: c */
        public /* synthetic */ void m11339c(C2195e c2195e) {
            c2195e.m9024a();
            this.f11125b.mo8635d(c2195e);
        }

        /* renamed from: d */
        public /* synthetic */ void m11340d(C2195e c2195e) {
            this.f11125b.mo8634c(c2195e);
        }
    }

    /* renamed from: a */
    void mo8623a(int i, int i2, int i3, float f);

    /* renamed from: a */
    void mo8624a(int i, long j);

    /* renamed from: a */
    void mo8625a(Surface surface);

    /* renamed from: a */
    void mo8627a(C2676s c2676s);

    /* renamed from: a */
    void mo8628a(String str, long j, long j2);

    /* renamed from: c */
    void mo8634c(C2195e c2195e);

    /* renamed from: d */
    void mo8635d(C2195e c2195e);
}
