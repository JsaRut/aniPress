package p139d.p225c.p226a.p227a.p229b;

import android.os.Handler;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2179p;
import p139d.p225c.p226a.p227a.p230c.C2195e;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.b.p */
/* loaded from: classes.dex */
public interface InterfaceC2179p {

    /* renamed from: d.c.a.a.b.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f7883a;

        /* renamed from: b */
        private final InterfaceC2179p f7884b;

        public a(Handler handler, InterfaceC2179p interfaceC2179p) {
            Handler handler2;
            if (interfaceC2179p != null) {
                C2628e.m11110a(handler);
                handler2 = handler;
            } else {
                handler2 = null;
            }
            this.f7883a = handler2;
            this.f7884b = interfaceC2179p;
        }

        /* renamed from: a */
        public void m8884a(final int i) {
            if (this.f7884b != null) {
                this.f7883a.post(new Runnable() { // from class: d.c.a.a.b.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2179p.a.this.m8889b(i);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8885a(final int i, final long j, final long j2) {
            if (this.f7884b != null) {
                this.f7883a.post(new Runnable() { // from class: d.c.a.a.b.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2179p.a.this.m8890b(i, j, j2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8886a(final C2195e c2195e) {
            if (this.f7884b != null) {
                this.f7883a.post(new Runnable() { // from class: d.c.a.a.b.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2179p.a.this.m8894c(c2195e);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8887a(final C2676s c2676s) {
            if (this.f7884b != null) {
                this.f7883a.post(new Runnable() { // from class: d.c.a.a.b.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2179p.a.this.m8892b(c2676s);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8888a(final String str, final long j, final long j2) {
            if (this.f7884b != null) {
                this.f7883a.post(new Runnable() { // from class: d.c.a.a.b.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2179p.a.this.m8893b(str, j, j2);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m8889b(int i) {
            this.f7884b.mo8633c(i);
        }

        /* renamed from: b */
        public /* synthetic */ void m8890b(int i, long j, long j2) {
            this.f7884b.mo8629b(i, j, j2);
        }

        /* renamed from: b */
        public void m8891b(final C2195e c2195e) {
            if (this.f7884b != null) {
                this.f7883a.post(new Runnable() { // from class: d.c.a.a.b.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2179p.a.this.m8895d(c2195e);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m8892b(C2676s c2676s) {
            this.f7884b.mo8631b(c2676s);
        }

        /* renamed from: b */
        public /* synthetic */ void m8893b(String str, long j, long j2) {
            this.f7884b.mo8632b(str, j, j2);
        }

        /* renamed from: c */
        public /* synthetic */ void m8894c(C2195e c2195e) {
            c2195e.m9024a();
            this.f7884b.mo8626a(c2195e);
        }

        /* renamed from: d */
        public /* synthetic */ void m8895d(C2195e c2195e) {
            this.f7884b.mo8630b(c2195e);
        }
    }

    /* renamed from: a */
    void mo8626a(C2195e c2195e);

    /* renamed from: b */
    void mo8629b(int i, long j, long j2);

    /* renamed from: b */
    void mo8630b(C2195e c2195e);

    /* renamed from: b */
    void mo8631b(C2676s c2676s);

    /* renamed from: b */
    void mo8632b(String str, long j, long j2);

    /* renamed from: c */
    void mo8633c(int i);
}
