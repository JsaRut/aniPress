package p139d.p225c.p226a.p227a.p250j;

import android.os.Handler;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;

/* renamed from: d.c.a.a.j.y */
/* loaded from: classes.dex */
public interface InterfaceC2515y {

    /* renamed from: d.c.a.a.j.y$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Object f10271a;

        /* renamed from: b */
        public final int f10272b;

        /* renamed from: c */
        public final int f10273c;

        /* renamed from: d */
        public final long f10274d;

        /* renamed from: e */
        public final long f10275e;

        public a(Object obj) {
            this(obj, -1L);
        }

        public a(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, Long.MIN_VALUE);
        }

        private a(Object obj, int i, int i2, long j, long j2) {
            this.f10271a = obj;
            this.f10272b = i;
            this.f10273c = i2;
            this.f10274d = j;
            this.f10275e = j2;
        }

        public a(Object obj, long j) {
            this(obj, -1, -1, j, Long.MIN_VALUE);
        }

        public a(Object obj, long j, long j2) {
            this(obj, -1, -1, j, j2);
        }

        /* renamed from: a */
        public a m10486a(Object obj) {
            return this.f10271a.equals(obj) ? this : new a(obj, this.f10272b, this.f10273c, this.f10274d, this.f10275e);
        }

        /* renamed from: a */
        public boolean m10487a() {
            return this.f10272b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10271a.equals(aVar.f10271a) && this.f10272b == aVar.f10272b && this.f10273c == aVar.f10273c && this.f10274d == aVar.f10274d && this.f10275e == aVar.f10275e;
        }

        public int hashCode() {
            return ((((((((527 + this.f10271a.hashCode()) * 31) + this.f10272b) * 31) + this.f10273c) * 31) + ((int) this.f10274d)) * 31) + ((int) this.f10275e);
        }
    }

    /* renamed from: d.c.a.a.j.y$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo9979a(InterfaceC2515y interfaceC2515y, AbstractC2151P abstractC2151P, Object obj);
    }

    /* renamed from: a */
    InterfaceC2514x mo9889a(a aVar, InterfaceC2590d interfaceC2590d);

    /* renamed from: a */
    void mo9891a();

    /* renamed from: a */
    void mo10433a(Handler handler, InterfaceC2516z interfaceC2516z);

    /* renamed from: a */
    void mo9892a(InterfaceC2514x interfaceC2514x);

    /* renamed from: a */
    void mo10435a(b bVar);

    /* renamed from: a */
    void mo10436a(InterfaceC2516z interfaceC2516z);

    /* renamed from: a */
    void mo10437a(InterfaceC2517k interfaceC2517k, boolean z, b bVar, InterfaceC2586E interfaceC2586E);
}
