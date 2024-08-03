package p139d.p225c.p226a.p227a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2141F;
import p139d.p225c.p226a.p227a.C2347h;
import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p268l.AbstractC2579m;
import p139d.p225c.p226a.p227a.p268l.C2580n;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2637n;

/* renamed from: d.c.a.a.p */
/* loaded from: classes.dex */
public final class C2673p implements Handler.Callback, InterfaceC2514x.a, AbstractC2579m.a, InterfaceC2515y.b, C2347h.a, C2141F.a {

    /* renamed from: A */
    private int f11126A;

    /* renamed from: B */
    private boolean f11127B;

    /* renamed from: C */
    private int f11128C;

    /* renamed from: D */
    private d f11129D;

    /* renamed from: E */
    private long f11130E;

    /* renamed from: F */
    private int f11131F;

    /* renamed from: a */
    private final InterfaceC2143H[] f11132a;

    /* renamed from: b */
    private final InterfaceC2144I[] f11133b;

    /* renamed from: c */
    private final AbstractC2579m f11134c;

    /* renamed from: d */
    private final C2580n f11135d;

    /* renamed from: e */
    private final InterfaceC2679v f11136e;

    /* renamed from: f */
    private final InterfaceC2592f f11137f;

    /* renamed from: g */
    private final InterfaceC2637n f11138g;

    /* renamed from: h */
    private final HandlerThread f11139h;

    /* renamed from: i */
    private final Handler f11140i;

    /* renamed from: j */
    private final InterfaceC2517k f11141j;

    /* renamed from: k */
    private final AbstractC2151P.b f11142k;

    /* renamed from: l */
    private final AbstractC2151P.a f11143l;

    /* renamed from: m */
    private final long f11144m;

    /* renamed from: n */
    private final boolean f11145n;

    /* renamed from: o */
    private final C2347h f11146o;

    /* renamed from: q */
    private final ArrayList<b> f11148q;

    /* renamed from: r */
    private final InterfaceC2629f f11149r;

    /* renamed from: u */
    private C2136A f11152u;

    /* renamed from: v */
    private InterfaceC2515y f11153v;

    /* renamed from: w */
    private InterfaceC2143H[] f11154w;

    /* renamed from: x */
    private boolean f11155x;

    /* renamed from: y */
    private boolean f11156y;

    /* renamed from: z */
    private boolean f11157z;

    /* renamed from: s */
    private final C2682y f11150s = new C2682y();

    /* renamed from: t */
    private C2147L f11151t = C2147L.f7665e;

    /* renamed from: p */
    private final c f11147p = new c();

    /* renamed from: d.c.a.a.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC2515y f11158a;

        /* renamed from: b */
        public final AbstractC2151P f11159b;

        /* renamed from: c */
        public final Object f11160c;

        public a(InterfaceC2515y interfaceC2515y, AbstractC2151P abstractC2151P, Object obj) {
            this.f11158a = interfaceC2515y;
            this.f11159b = abstractC2151P;
            this.f11160c = obj;
        }
    }

    /* renamed from: d.c.a.a.p$b */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        public final C2141F f11161a;

        /* renamed from: b */
        public int f11162b;

        /* renamed from: c */
        public long f11163c;

        /* renamed from: d */
        public Object f11164d;

        public b(C2141F c2141f) {
            this.f11161a = c2141f;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            if ((this.f11164d == null) != (bVar.f11164d == null)) {
                return this.f11164d != null ? -1 : 1;
            }
            if (this.f11164d == null) {
                return 0;
            }
            int i = this.f11162b - bVar.f11162b;
            return i != 0 ? i : C2622I.m11076b(this.f11163c, bVar.f11163c);
        }

        /* renamed from: a */
        public void m11409a(int i, long j, Object obj) {
            this.f11162b = i;
            this.f11163c = j;
            this.f11164d = obj;
        }
    }

    /* renamed from: d.c.a.a.p$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private C2136A f11165a;

        /* renamed from: b */
        private int f11166b;

        /* renamed from: c */
        private boolean f11167c;

        /* renamed from: d */
        private int f11168d;

        private c() {
        }

        /* synthetic */ c(C2650o c2650o) {
            this();
        }

        /* renamed from: a */
        public void m11413a(int i) {
            this.f11166b += i;
        }

        /* renamed from: a */
        public boolean m11414a(C2136A c2136a) {
            return c2136a != this.f11165a || this.f11166b > 0 || this.f11167c;
        }

        /* renamed from: b */
        public void m11415b(int i) {
            if (this.f11167c && this.f11168d != 4) {
                C2628e.m11111a(i == 4);
            } else {
                this.f11167c = true;
                this.f11168d = i;
            }
        }

        /* renamed from: b */
        public void m11416b(C2136A c2136a) {
            this.f11165a = c2136a;
            this.f11166b = 0;
            this.f11167c = false;
        }
    }

    /* renamed from: d.c.a.a.p$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final AbstractC2151P f11169a;

        /* renamed from: b */
        public final int f11170b;

        /* renamed from: c */
        public final long f11171c;

        public d(AbstractC2151P abstractC2151P, int i, long j) {
            this.f11169a = abstractC2151P;
            this.f11170b = i;
            this.f11171c = j;
        }
    }

    public C2673p(InterfaceC2143H[] interfaceC2143HArr, AbstractC2579m abstractC2579m, C2580n c2580n, InterfaceC2679v interfaceC2679v, InterfaceC2592f interfaceC2592f, boolean z, int i, boolean z2, Handler handler, InterfaceC2517k interfaceC2517k, InterfaceC2629f interfaceC2629f) {
        this.f11132a = interfaceC2143HArr;
        this.f11134c = abstractC2579m;
        this.f11135d = c2580n;
        this.f11136e = interfaceC2679v;
        this.f11137f = interfaceC2592f;
        this.f11156y = z;
        this.f11126A = i;
        this.f11127B = z2;
        this.f11140i = handler;
        this.f11141j = interfaceC2517k;
        this.f11149r = interfaceC2629f;
        this.f11144m = interfaceC2679v.mo9703c();
        this.f11145n = interfaceC2679v.mo9702b();
        this.f11152u = C2136A.m8500a(-9223372036854775807L, c2580n);
        this.f11133b = new InterfaceC2144I[interfaceC2143HArr.length];
        for (int i2 = 0; i2 < interfaceC2143HArr.length; i2++) {
            interfaceC2143HArr[i2].setIndex(i2);
            this.f11133b[i2] = interfaceC2143HArr[i2].mo8571i();
        }
        this.f11146o = new C2347h(this, interfaceC2629f);
        this.f11148q = new ArrayList<>();
        this.f11154w = new InterfaceC2143H[0];
        this.f11142k = new AbstractC2151P.b();
        this.f11143l = new AbstractC2151P.a();
        abstractC2579m.m10890a(this, interfaceC2592f);
        this.f11139h = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f11139h.start();
        this.f11138g = interfaceC2629f.mo11000a(this.f11139h.getLooper(), this);
    }

    /* renamed from: a */
    private long m11341a(long j) {
        C2680w m11491d = this.f11150s.m11491d();
        if (m11491d == null) {
            return 0L;
        }
        return j - m11491d.m11459c(this.f11130E);
    }

    /* renamed from: a */
    private long m11342a(InterfaceC2515y.a aVar, long j) {
        return m11343a(aVar, j, this.f11150s.m11492e() != this.f11150s.m11493f());
    }

    /* renamed from: a */
    private long m11343a(InterfaceC2515y.a aVar, long j, boolean z) {
        m11395q();
        this.f11157z = false;
        m11366c(2);
        C2680w m11492e = this.f11150s.m11492e();
        C2680w c2680w = m11492e;
        while (true) {
            if (c2680w == null) {
                break;
            }
            if (aVar.equals(c2680w.f11212g.f11221a) && c2680w.f11210e) {
                this.f11150s.m11487a(c2680w);
                break;
            }
            c2680w = this.f11150s.m11478a();
        }
        if (m11492e != c2680w || z) {
            for (InterfaceC2143H interfaceC2143H : this.f11154w) {
                m11349a(interfaceC2143H);
            }
            this.f11154w = new InterfaceC2143H[0];
            m11492e = null;
        }
        if (c2680w != null) {
            m11354a(m11492e);
            if (c2680w.f11211f) {
                long mo9874a = c2680w.f11206a.mo9874a(j);
                c2680w.f11206a.mo9877a(mo9874a - this.f11144m, this.f11145n);
                j = mo9874a;
            }
            m11362b(j);
            m11385h();
        } else {
            this.f11150s.m11483a(true);
            this.f11152u = this.f11152u.m8503a(C2413N.f9484a, this.f11135d);
            m11362b(j);
        }
        m11370c(false);
        this.f11138g.mo11006a(2);
        return j;
    }

    /* renamed from: a */
    private Pair<Object, Long> m11344a(d dVar, boolean z) {
        int mo8637a;
        AbstractC2151P abstractC2151P = this.f11152u.f7628b;
        AbstractC2151P abstractC2151P2 = dVar.f11169a;
        if (abstractC2151P.m8654c()) {
            return null;
        }
        if (abstractC2151P2.m8654c()) {
            abstractC2151P2 = abstractC2151P;
        }
        try {
            Pair<Object, Long> m8645a = abstractC2151P2.m8645a(this.f11142k, this.f11143l, dVar.f11170b, dVar.f11171c);
            if (abstractC2151P == abstractC2151P2 || (mo8637a = abstractC2151P.mo8637a(m8645a.first)) != -1) {
                return m8645a;
            }
            if (!z || m11345a(m8645a.first, abstractC2151P2, abstractC2151P) == null) {
                return null;
            }
            return m11360b(abstractC2151P, abstractC2151P.m8647a(mo8637a, this.f11143l).f7702c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2678u(abstractC2151P, dVar.f11170b, dVar.f11171c);
        }
    }

    /* renamed from: a */
    private Object m11345a(Object obj, AbstractC2151P abstractC2151P, AbstractC2151P abstractC2151P2) {
        int mo8637a = abstractC2151P.mo8637a(obj);
        int mo8636a = abstractC2151P.mo8636a();
        int i = mo8637a;
        int i2 = -1;
        for (int i3 = 0; i3 < mo8636a && i2 == -1; i3++) {
            i = abstractC2151P.m8643a(i, this.f11143l, this.f11142k, this.f11126A, this.f11127B);
            if (i == -1) {
                break;
            }
            i2 = abstractC2151P2.mo8637a(abstractC2151P.mo8640a(i));
        }
        if (i2 == -1) {
            return null;
        }
        return abstractC2151P2.mo8640a(i2);
    }

    /* renamed from: a */
    private void m11346a(float f) {
        for (C2680w m11490c = this.f11150s.m11490c(); m11490c != null; m11490c = m11490c.f11213h) {
            C2580n c2580n = m11490c.f11215j;
            if (c2580n != null) {
                for (InterfaceC2577k interfaceC2577k : c2580n.f10733c.m10888a()) {
                    if (interfaceC2577k != null) {
                        interfaceC2577k.mo10811a(f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m11347a(int i, boolean z, int i2) {
        C2680w m11492e = this.f11150s.m11492e();
        InterfaceC2143H interfaceC2143H = this.f11132a[i];
        this.f11154w[i2] = interfaceC2143H;
        if (interfaceC2143H.getState() == 0) {
            C2580n c2580n = m11492e.f11215j;
            C2145J c2145j = c2580n.f10732b[i];
            C2676s[] m11359a = m11359a(c2580n.f10733c.m10887a(i));
            boolean z2 = this.f11156y && this.f11152u.f7633g == 3;
            interfaceC2143H.mo8563a(c2145j, m11359a, m11492e.f11208c[i], this.f11130E, !z && z2, m11492e.m11458c());
            this.f11146o.m9801b(interfaceC2143H);
            if (z2) {
                interfaceC2143H.start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:            if (r6.f11131F < r6.f11148q.size()) goto L206;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:            r1 = r6.f11148q.get(r6.f11131F);     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:            if (r1 == null) goto L249;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:            if (r1.f11164d == null) goto L247;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:            r3 = r1.f11162b;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:            if (r3 < r0) goto L216;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:            if (r3 != r0) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:            if (r1.f11163c > r7) goto L251;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:            if (r1 == null) goto L254;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:            if (r1.f11164d == null) goto L256;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:            if (r1.f11162b != r0) goto L257;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:            r3 = r1.f11163c;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:            if (r3 <= r7) goto L258;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:            if (r3 > r9) goto L253;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:            m11378e(r1.f11161a);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:            if (r1.f11161a.m8547b() != false) goto L234;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:            if (r1.f11161a.m8555j() == false) goto L233;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:            r6.f11131F++;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:            if (r6.f11131F >= r6.f11148q.size()) goto L255;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:            r1 = r6.f11148q.get(r6.f11131F);     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:            r6.f11148q.remove(r6.f11131F);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007f, code lost:            r6.f11131F++;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x008d, code lost:            if (r6.f11131F >= r6.f11148q.size()) goto L207;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006c, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006d, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x003c, code lost:            r1 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:23:0x0061). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11348a(long r7, long r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.C2673p.m11348a(long, long):void");
    }

    /* renamed from: a */
    private void m11349a(InterfaceC2143H interfaceC2143H) {
        this.f11146o.m9800a(interfaceC2143H);
        m11364b(interfaceC2143H);
        interfaceC2143H.mo8567e();
    }

    /* renamed from: a */
    private void m11350a(C2147L c2147l) {
        this.f11151t = c2147l;
    }

    /* renamed from: a */
    private void m11351a(C2413N c2413n, C2580n c2580n) {
        this.f11136e.mo9699a(this.f11132a, c2413n, c2580n.f10733c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:            if (r10.m10487a() != false) goto L205;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:            r11 = r13;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:            r11 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:            if (r10.m10487a() != false) goto L205;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11352a(p139d.p225c.p226a.p227a.C2673p.a r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.C2673p.m11352a(d.c.a.a.p$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:7:0x0058, B:9:0x005c, B:14:0x0065, B:22:0x006d, B:24:0x0077, B:28:0x0083, B:29:0x008d, B:31:0x009d, B:37:0x00b8, B:40:0x00c2, B:44:0x00c6), top: B:6:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:7:0x0058, B:9:0x005c, B:14:0x0065, B:22:0x006d, B:24:0x0077, B:28:0x0083, B:29:0x008d, B:31:0x009d, B:37:0x00b8, B:40:0x00c2, B:44:0x00c6), top: B:6:0x0058 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11353a(p139d.p225c.p226a.p227a.C2673p.d r23) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.C2673p.m11353a(d.c.a.a.p$d):void");
    }

    /* renamed from: a */
    private void m11354a(C2680w c2680w) {
        C2680w m11492e = this.f11150s.m11492e();
        if (m11492e == null || c2680w == m11492e) {
            return;
        }
        boolean[] zArr = new boolean[this.f11132a.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            InterfaceC2143H[] interfaceC2143HArr = this.f11132a;
            if (i >= interfaceC2143HArr.length) {
                this.f11152u = this.f11152u.m8503a(m11492e.f11214i, m11492e.f11215j);
                m11357a(zArr, i2);
                return;
            }
            InterfaceC2143H interfaceC2143H = interfaceC2143HArr[i];
            zArr[i] = interfaceC2143H.getState() != 0;
            if (m11492e.f11215j.m10893a(i)) {
                i2++;
            }
            if (zArr[i] && (!m11492e.f11215j.m10893a(i) || (interfaceC2143H.mo8574l() && interfaceC2143H.mo8572j() == c2680w.f11208c[i]))) {
                m11349a(interfaceC2143H);
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m11355a(boolean z, boolean z2) {
        m11356a(true, z, z);
        this.f11147p.m11413a(this.f11128C + (z2 ? 1 : 0));
        this.f11128C = 0;
        this.f11136e.mo9706f();
        m11366c(1);
    }

    /* renamed from: a */
    private void m11356a(boolean z, boolean z2, boolean z3) {
        InterfaceC2515y interfaceC2515y;
        this.f11138g.mo11008b(2);
        this.f11157z = false;
        this.f11146o.m9803d();
        this.f11130E = 0L;
        for (InterfaceC2143H interfaceC2143H : this.f11154w) {
            try {
                m11349a(interfaceC2143H);
            } catch (C2399j | RuntimeException e2) {
                C2638o.m11156a("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.f11154w = new InterfaceC2143H[0];
        this.f11150s.m11483a(!z2);
        m11379e(false);
        if (z2) {
            this.f11129D = null;
        }
        if (z3) {
            this.f11150s.m11482a(AbstractC2151P.f7699a);
            Iterator<b> it = this.f11148q.iterator();
            while (it.hasNext()) {
                it.next().f11161a.m8545a(false);
            }
            this.f11148q.clear();
            this.f11131F = 0;
        }
        InterfaceC2515y.a m8508a = z2 ? this.f11152u.m8508a(this.f11127B, this.f11142k) : this.f11152u.f7630d;
        long j = z2 ? -9223372036854775807L : this.f11152u.f7640n;
        long j2 = z2 ? -9223372036854775807L : this.f11152u.f7632f;
        AbstractC2151P abstractC2151P = z3 ? AbstractC2151P.f7699a : this.f11152u.f7628b;
        Object obj = z3 ? null : this.f11152u.f7629c;
        C2136A c2136a = this.f11152u;
        this.f11152u = new C2136A(abstractC2151P, obj, m8508a, j, j2, c2136a.f7633g, false, z3 ? C2413N.f9484a : c2136a.f7635i, z3 ? this.f11135d : this.f11152u.f7636j, m8508a, j, 0L, j);
        if (!z || (interfaceC2515y = this.f11153v) == null) {
            return;
        }
        interfaceC2515y.mo10435a(this);
        this.f11153v = null;
    }

    /* renamed from: a */
    private void m11357a(boolean[] zArr, int i) {
        this.f11154w = new InterfaceC2143H[i];
        C2680w m11492e = this.f11150s.m11492e();
        int i2 = 0;
        for (int i3 = 0; i3 < this.f11132a.length; i3++) {
            if (m11492e.f11215j.m10893a(i3)) {
                m11347a(i3, zArr[i3], i2);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private boolean m11358a(b bVar) {
        Object obj = bVar.f11164d;
        if (obj == null) {
            Pair<Object, Long> m11344a = m11344a(new d(bVar.f11161a.m8552g(), bVar.f11161a.m8554i(), C2200d.m9047a(bVar.f11161a.m8550e())), false);
            if (m11344a == null) {
                return false;
            }
            bVar.m11409a(this.f11152u.f7628b.mo8637a(m11344a.first), ((Long) m11344a.second).longValue(), m11344a.first);
            return true;
        }
        int mo8637a = this.f11152u.f7628b.mo8637a(obj);
        if (mo8637a == -1) {
            return false;
        }
        bVar.f11162b = mo8637a;
        return true;
    }

    /* renamed from: a */
    private static C2676s[] m11359a(InterfaceC2577k interfaceC2577k) {
        int length = interfaceC2577k != null ? interfaceC2577k.length() : 0;
        C2676s[] c2676sArr = new C2676s[length];
        for (int i = 0; i < length; i++) {
            c2676sArr[i] = interfaceC2577k.mo10816a(i);
        }
        return c2676sArr;
    }

    /* renamed from: b */
    private Pair<Object, Long> m11360b(AbstractC2151P abstractC2151P, int i, long j) {
        return abstractC2151P.m8645a(this.f11142k, this.f11143l, i, j);
    }

    /* renamed from: b */
    private void m11361b(int i) {
        this.f11126A = i;
        if (!this.f11150s.m11484a(i)) {
            m11376d(true);
        }
        m11370c(false);
    }

    /* renamed from: b */
    private void m11362b(long j) {
        if (this.f11150s.m11494g()) {
            j = this.f11150s.m11492e().m11461d(j);
        }
        this.f11130E = j;
        this.f11146o.m9799a(this.f11130E);
        for (InterfaceC2143H interfaceC2143H : this.f11154w) {
            interfaceC2143H.mo8561a(this.f11130E);
        }
    }

    /* renamed from: b */
    private void m11363b(long j, long j2) {
        this.f11138g.mo11008b(2);
        this.f11138g.mo11007a(2, j + j2);
    }

    /* renamed from: b */
    private void m11364b(InterfaceC2143H interfaceC2143H) {
        if (interfaceC2143H.getState() == 2) {
            interfaceC2143H.stop();
        }
    }

    /* renamed from: b */
    private void m11365b(InterfaceC2515y interfaceC2515y, boolean z, boolean z2) {
        this.f11128C++;
        m11356a(true, z, z2);
        this.f11136e.mo9698a();
        this.f11153v = interfaceC2515y;
        m11366c(2);
        interfaceC2515y.mo10437a(this.f11141j, true, this, this.f11137f.mo10914a());
        this.f11138g.mo11006a(2);
    }

    /* renamed from: c */
    private void m11366c(int i) {
        C2136A c2136a = this.f11152u;
        if (c2136a.f7633g != i) {
            this.f11152u = c2136a.m8501a(i);
        }
    }

    /* renamed from: c */
    private void m11367c(C2137B c2137b) {
        this.f11140i.obtainMessage(1, c2137b).sendToTarget();
        m11346a(c2137b.f7642b);
        for (InterfaceC2143H interfaceC2143H : this.f11132a) {
            if (interfaceC2143H != null) {
                interfaceC2143H.mo8560a(c2137b.f7642b);
            }
        }
    }

    /* renamed from: c */
    private void m11368c(C2141F c2141f) {
        if (c2141f.m8555j()) {
            return;
        }
        try {
            c2141f.m8551f().mo8558a(c2141f.m8553h(), c2141f.m8549d());
        } finally {
            c2141f.m8545a(true);
        }
    }

    /* renamed from: c */
    private void m11369c(InterfaceC2514x interfaceC2514x) {
        if (this.f11150s.m11485a(interfaceC2514x)) {
            this.f11150s.m11481a(this.f11130E);
            m11385h();
        }
    }

    /* renamed from: c */
    private void m11370c(boolean z) {
        C2680w m11491d = this.f11150s.m11491d();
        InterfaceC2515y.a aVar = m11491d == null ? this.f11152u.f7630d : m11491d.f11212g.f11221a;
        boolean z2 = !this.f11152u.f7637k.equals(aVar);
        if (z2) {
            this.f11152u = this.f11152u.m8504a(aVar);
        }
        C2136A c2136a = this.f11152u;
        c2136a.f7638l = m11491d == null ? c2136a.f7640n : m11491d.m11450a();
        this.f11152u.f7639m = m11377e();
        if ((z2 || z) && m11491d != null && m11491d.f11210e) {
            m11351a(m11491d.f11214i, m11491d.f11215j);
        }
    }

    /* renamed from: c */
    private boolean m11371c(InterfaceC2143H interfaceC2143H) {
        C2680w c2680w = this.f11150s.m11493f().f11213h;
        return c2680w != null && c2680w.f11210e && interfaceC2143H.mo8569g();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11372d() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.C2673p.m11372d():void");
    }

    /* renamed from: d */
    private void m11373d(C2137B c2137b) {
        this.f11146o.mo8775a(c2137b);
    }

    /* renamed from: d */
    private void m11374d(C2141F c2141f) {
        if (c2141f.m8550e() == -9223372036854775807L) {
            m11378e(c2141f);
            return;
        }
        if (this.f11153v == null || this.f11128C > 0) {
            this.f11148q.add(new b(c2141f));
            return;
        }
        b bVar = new b(c2141f);
        if (!m11358a(bVar)) {
            c2141f.m8545a(false);
        } else {
            this.f11148q.add(bVar);
            Collections.sort(this.f11148q);
        }
    }

    /* renamed from: d */
    private void m11375d(InterfaceC2514x interfaceC2514x) {
        if (this.f11150s.m11485a(interfaceC2514x)) {
            C2680w m11491d = this.f11150s.m11491d();
            m11491d.m11453a(this.f11146o.mo8788b().f7642b);
            m11351a(m11491d.f11214i, m11491d.f11215j);
            if (!this.f11150s.m11494g()) {
                m11362b(this.f11150s.m11478a().f11212g.f11222b);
                m11354a((C2680w) null);
            }
            m11385h();
        }
    }

    /* renamed from: d */
    private void m11376d(boolean z) {
        InterfaceC2515y.a aVar = this.f11150s.m11492e().f11212g.f11221a;
        long m11343a = m11343a(aVar, this.f11152u.f7640n, true);
        if (m11343a != this.f11152u.f7640n) {
            C2136A c2136a = this.f11152u;
            this.f11152u = c2136a.m8506a(aVar, m11343a, c2136a.f7632f, m11377e());
            if (z) {
                this.f11147p.m11415b(4);
            }
        }
    }

    /* renamed from: e */
    private long m11377e() {
        return m11341a(this.f11152u.f7638l);
    }

    /* renamed from: e */
    private void m11378e(C2141F c2141f) {
        if (c2141f.m8548c().getLooper() != this.f11138g.mo11002a()) {
            this.f11138g.mo11005a(15, c2141f).sendToTarget();
            return;
        }
        m11368c(c2141f);
        int i = this.f11152u.f7633g;
        if (i == 3 || i == 2) {
            this.f11138g.mo11006a(2);
        }
    }

    /* renamed from: e */
    private void m11379e(boolean z) {
        C2136A c2136a = this.f11152u;
        if (c2136a.f7634h != z) {
            this.f11152u = c2136a.m8507a(z);
        }
    }

    /* renamed from: f */
    private void m11380f() {
        m11366c(4);
        m11356a(false, true, false);
    }

    /* renamed from: f */
    private void m11381f(C2141F c2141f) {
        c2141f.m8548c().post(new Runnable() { // from class: d.c.a.a.a

            /* renamed from: b */
            private final /* synthetic */ C2141F f7717b;

            public /* synthetic */ RunnableC2152a(C2141F c2141f2) {
                r2 = c2141f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2673p.this.m11404b(r2);
            }
        });
    }

    /* renamed from: f */
    private void m11382f(boolean z) {
        this.f11157z = false;
        this.f11156y = z;
        if (!z) {
            m11395q();
            m11397s();
            return;
        }
        int i = this.f11152u.f7633g;
        if (i == 3) {
            m11394p();
        } else if (i != 2) {
            return;
        }
        this.f11138g.mo11006a(2);
    }

    /* renamed from: g */
    private void m11383g(boolean z) {
        this.f11127B = z;
        if (!this.f11150s.m11489b(z)) {
            m11376d(true);
        }
        m11370c(false);
    }

    /* renamed from: g */
    private boolean m11384g() {
        C2680w c2680w;
        C2680w m11492e = this.f11150s.m11492e();
        long j = m11492e.f11212g.f11224d;
        return j == -9223372036854775807L || this.f11152u.f7640n < j || ((c2680w = m11492e.f11213h) != null && (c2680w.f11210e || c2680w.f11212g.f11221a.m10487a()));
    }

    /* renamed from: h */
    private void m11385h() {
        C2680w m11491d = this.f11150s.m11491d();
        long m11455b = m11491d.m11455b();
        if (m11455b == Long.MIN_VALUE) {
            m11379e(false);
            return;
        }
        boolean mo9700a = this.f11136e.mo9700a(m11341a(m11455b), this.f11146o.mo8788b().f7642b);
        m11379e(mo9700a);
        if (mo9700a) {
            m11491d.m11454a(this.f11130E);
        }
    }

    /* renamed from: h */
    private boolean m11386h(boolean z) {
        if (this.f11154w.length == 0) {
            return m11384g();
        }
        if (!z) {
            return false;
        }
        if (!this.f11152u.f7634h) {
            return true;
        }
        C2680w m11491d = this.f11150s.m11491d();
        return (m11491d.m11462e() && m11491d.f11212g.f11226f) || this.f11136e.mo9701a(m11377e(), this.f11146o.mo8788b().f7642b, this.f11157z);
    }

    /* renamed from: i */
    private void m11387i() {
        if (this.f11147p.m11414a(this.f11152u)) {
            this.f11140i.obtainMessage(0, this.f11147p.f11166b, this.f11147p.f11167c ? this.f11147p.f11168d : -1, this.f11152u).sendToTarget();
            this.f11147p.m11416b(this.f11152u);
        }
    }

    /* renamed from: j */
    private void m11388j() {
        C2680w m11491d = this.f11150s.m11491d();
        C2680w m11493f = this.f11150s.m11493f();
        if (m11491d == null || m11491d.f11210e) {
            return;
        }
        if (m11493f == null || m11493f.f11213h == m11491d) {
            for (InterfaceC2143H interfaceC2143H : this.f11154w) {
                if (!interfaceC2143H.mo8569g()) {
                    return;
                }
            }
            m11491d.f11206a.mo9884d();
        }
    }

    /* renamed from: k */
    private void m11389k() {
        if (this.f11150s.m11491d() != null) {
            for (InterfaceC2143H interfaceC2143H : this.f11154w) {
                if (!interfaceC2143H.mo8569g()) {
                    return;
                }
            }
        }
        this.f11153v.mo9891a();
    }

    /* renamed from: l */
    private void m11390l() {
        this.f11150s.m11481a(this.f11130E);
        if (this.f11150s.m11495h()) {
            C2681x m11479a = this.f11150s.m11479a(this.f11130E, this.f11152u);
            if (m11479a == null) {
                m11389k();
                return;
            }
            this.f11150s.m11476a(this.f11133b, this.f11134c, this.f11136e.mo9705e(), this.f11153v, m11479a).mo9879a(this, m11479a.f11222b);
            m11379e(true);
            m11370c(false);
        }
    }

    /* renamed from: m */
    private void m11391m() {
        m11356a(true, true, true);
        this.f11136e.mo9704d();
        m11366c(1);
        this.f11139h.quit();
        synchronized (this) {
            this.f11155x = true;
            notifyAll();
        }
    }

    /* renamed from: n */
    private void m11392n() {
        if (this.f11150s.m11494g()) {
            float f = this.f11146o.mo8788b().f7642b;
            C2680w m11493f = this.f11150s.m11493f();
            boolean z = true;
            for (C2680w m11492e = this.f11150s.m11492e(); m11492e != null && m11492e.f11210e; m11492e = m11492e.f11213h) {
                if (m11492e.m11457b(f)) {
                    if (z) {
                        C2680w m11492e2 = this.f11150s.m11492e();
                        boolean m11487a = this.f11150s.m11487a(m11492e2);
                        boolean[] zArr = new boolean[this.f11132a.length];
                        long m11452a = m11492e2.m11452a(this.f11152u.f7640n, m11487a, zArr);
                        C2136A c2136a = this.f11152u;
                        if (c2136a.f7633g != 4 && m11452a != c2136a.f7640n) {
                            C2136A c2136a2 = this.f11152u;
                            this.f11152u = c2136a2.m8506a(c2136a2.f7630d, m11452a, c2136a2.f7632f, m11377e());
                            this.f11147p.m11415b(4);
                            m11362b(m11452a);
                        }
                        boolean[] zArr2 = new boolean[this.f11132a.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            InterfaceC2143H[] interfaceC2143HArr = this.f11132a;
                            if (i >= interfaceC2143HArr.length) {
                                break;
                            }
                            InterfaceC2143H interfaceC2143H = interfaceC2143HArr[i];
                            zArr2[i] = interfaceC2143H.getState() != 0;
                            InterfaceC2404E interfaceC2404E = m11492e2.f11208c[i];
                            if (interfaceC2404E != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (interfaceC2404E != interfaceC2143H.mo8572j()) {
                                    m11349a(interfaceC2143H);
                                } else if (zArr[i]) {
                                    interfaceC2143H.mo8561a(this.f11130E);
                                }
                            }
                            i++;
                        }
                        this.f11152u = this.f11152u.m8503a(m11492e2.f11214i, m11492e2.f11215j);
                        m11357a(zArr2, i2);
                    } else {
                        this.f11150s.m11487a(m11492e);
                        if (m11492e.f11210e) {
                            m11492e.m11451a(Math.max(m11492e.f11212g.f11222b, m11492e.m11459c(this.f11130E)), false);
                        }
                    }
                    m11370c(true);
                    if (this.f11152u.f7633g != 4) {
                        m11385h();
                        m11397s();
                        this.f11138g.mo11006a(2);
                        return;
                    }
                    return;
                }
                if (m11492e == m11493f) {
                    z = false;
                }
            }
        }
    }

    /* renamed from: o */
    private void m11393o() {
        for (int size = this.f11148q.size() - 1; size >= 0; size--) {
            if (!m11358a(this.f11148q.get(size))) {
                this.f11148q.get(size).f11161a.m8545a(false);
                this.f11148q.remove(size);
            }
        }
        Collections.sort(this.f11148q);
    }

    /* renamed from: p */
    private void m11394p() {
        this.f11157z = false;
        this.f11146o.m9802c();
        for (InterfaceC2143H interfaceC2143H : this.f11154w) {
            interfaceC2143H.start();
        }
    }

    /* renamed from: q */
    private void m11395q() {
        this.f11146o.m9803d();
        for (InterfaceC2143H interfaceC2143H : this.f11154w) {
            m11364b(interfaceC2143H);
        }
    }

    /* renamed from: r */
    private void m11396r() {
        InterfaceC2515y interfaceC2515y = this.f11153v;
        if (interfaceC2515y == null) {
            return;
        }
        if (this.f11128C > 0) {
            interfaceC2515y.mo9891a();
            return;
        }
        m11390l();
        C2680w m11491d = this.f11150s.m11491d();
        int i = 0;
        if (m11491d == null || m11491d.m11462e()) {
            m11379e(false);
        } else if (!this.f11152u.f7634h) {
            m11385h();
        }
        if (!this.f11150s.m11494g()) {
            return;
        }
        C2680w m11492e = this.f11150s.m11492e();
        C2680w m11493f = this.f11150s.m11493f();
        boolean z = false;
        while (this.f11156y && m11492e != m11493f && this.f11130E >= m11492e.f11213h.m11460d()) {
            if (z) {
                m11387i();
            }
            int i2 = m11492e.f11212g.f11225e ? 0 : 3;
            C2680w m11478a = this.f11150s.m11478a();
            m11354a(m11492e);
            C2136A c2136a = this.f11152u;
            C2681x c2681x = m11478a.f11212g;
            this.f11152u = c2136a.m8506a(c2681x.f11221a, c2681x.f11222b, c2681x.f11223c, m11377e());
            this.f11147p.m11415b(i2);
            m11397s();
            m11492e = m11478a;
            z = true;
        }
        if (m11493f.f11212g.f11226f) {
            while (true) {
                InterfaceC2143H[] interfaceC2143HArr = this.f11132a;
                if (i >= interfaceC2143HArr.length) {
                    return;
                }
                InterfaceC2143H interfaceC2143H = interfaceC2143HArr[i];
                InterfaceC2404E interfaceC2404E = m11493f.f11208c[i];
                if (interfaceC2404E != null && interfaceC2143H.mo8572j() == interfaceC2404E && interfaceC2143H.mo8569g()) {
                    interfaceC2143H.mo8570h();
                }
                i++;
            }
        } else {
            if (m11493f.f11213h == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                InterfaceC2143H[] interfaceC2143HArr2 = this.f11132a;
                if (i3 < interfaceC2143HArr2.length) {
                    InterfaceC2143H interfaceC2143H2 = interfaceC2143HArr2[i3];
                    InterfaceC2404E interfaceC2404E2 = m11493f.f11208c[i3];
                    if (interfaceC2143H2.mo8572j() != interfaceC2404E2) {
                        return;
                    }
                    if (interfaceC2404E2 != null && !interfaceC2143H2.mo8569g()) {
                        return;
                    } else {
                        i3++;
                    }
                } else {
                    if (!m11493f.f11213h.f11210e) {
                        m11388j();
                        return;
                    }
                    C2580n c2580n = m11493f.f11215j;
                    C2680w m11488b = this.f11150s.m11488b();
                    C2580n c2580n2 = m11488b.f11215j;
                    boolean z2 = m11488b.f11206a.mo9885e() != -9223372036854775807L;
                    int i4 = 0;
                    while (true) {
                        InterfaceC2143H[] interfaceC2143HArr3 = this.f11132a;
                        if (i4 >= interfaceC2143HArr3.length) {
                            return;
                        }
                        InterfaceC2143H interfaceC2143H3 = interfaceC2143HArr3[i4];
                        if (c2580n.m10893a(i4)) {
                            if (!z2) {
                                if (!interfaceC2143H3.mo8574l()) {
                                    InterfaceC2577k m10887a = c2580n2.f10733c.m10887a(i4);
                                    boolean m10893a = c2580n2.m10893a(i4);
                                    boolean z3 = this.f11133b[i4].mo8568f() == 6;
                                    C2145J c2145j = c2580n.f10732b[i4];
                                    C2145J c2145j2 = c2580n2.f10732b[i4];
                                    if (m10893a && c2145j2.equals(c2145j) && !z3) {
                                        interfaceC2143H3.mo8564a(m11359a(m10887a), m11488b.f11208c[i4], m11488b.m11458c());
                                    }
                                }
                            }
                            interfaceC2143H3.mo8570h();
                        }
                        i4++;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private void m11397s() {
        if (this.f11150s.m11494g()) {
            C2680w m11492e = this.f11150s.m11492e();
            long mo9885e = m11492e.f11206a.mo9885e();
            if (mo9885e != -9223372036854775807L) {
                m11362b(mo9885e);
                if (mo9885e != this.f11152u.f7640n) {
                    C2136A c2136a = this.f11152u;
                    this.f11152u = c2136a.m8506a(c2136a.f7630d, mo9885e, c2136a.f7632f, m11377e());
                    this.f11147p.m11415b(4);
                }
            } else {
                this.f11130E = this.f11146o.m9804e();
                long m11459c = m11492e.m11459c(this.f11130E);
                m11348a(this.f11152u.f7640n, m11459c);
                this.f11152u.f7640n = m11459c;
            }
            C2680w m11491d = this.f11150s.m11491d();
            this.f11152u.f7638l = m11491d.m11450a();
            this.f11152u.f7639m = m11377e();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p268l.AbstractC2579m.a
    /* renamed from: a */
    public void mo10892a() {
        this.f11138g.mo11006a(11);
    }

    /* renamed from: a */
    public void m11398a(int i) {
        this.f11138g.mo11003a(12, i, 0).sendToTarget();
    }

    @Override // p139d.p225c.p226a.p227a.C2347h.a
    /* renamed from: a */
    public void mo9805a(C2137B c2137b) {
        this.f11138g.mo11005a(16, c2137b).sendToTarget();
    }

    @Override // p139d.p225c.p226a.p227a.C2141F.a
    /* renamed from: a */
    public synchronized void mo8557a(C2141F c2141f) {
        if (!this.f11155x) {
            this.f11138g.mo11005a(14, c2141f).sendToTarget();
        } else {
            C2638o.m11160d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c2141f.m8545a(false);
        }
    }

    /* renamed from: a */
    public void m11399a(AbstractC2151P abstractC2151P, int i, long j) {
        this.f11138g.mo11005a(3, new d(abstractC2151P, i, j)).sendToTarget();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x.a
    /* renamed from: a */
    public void mo10485a(InterfaceC2514x interfaceC2514x) {
        this.f11138g.mo11005a(9, interfaceC2514x).sendToTarget();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y.b
    /* renamed from: a */
    public void mo9979a(InterfaceC2515y interfaceC2515y, AbstractC2151P abstractC2151P, Object obj) {
        this.f11138g.mo11005a(8, new a(interfaceC2515y, abstractC2151P, obj)).sendToTarget();
    }

    /* renamed from: a */
    public void m11400a(InterfaceC2515y interfaceC2515y, boolean z, boolean z2) {
        this.f11138g.mo11004a(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC2515y).sendToTarget();
    }

    /* renamed from: a */
    public void m11401a(boolean z) {
        this.f11138g.mo11003a(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: b */
    public Looper m11402b() {
        return this.f11139h.getLooper();
    }

    /* renamed from: b */
    public void m11403b(C2137B c2137b) {
        this.f11138g.mo11005a(4, c2137b).sendToTarget();
    }

    /* renamed from: b */
    public /* synthetic */ void m11404b(C2141F c2141f) {
        try {
            m11368c(c2141f);
        } catch (C2399j e2) {
            C2638o.m11156a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F.a
    /* renamed from: b */
    public void mo9878a(InterfaceC2514x interfaceC2514x) {
        this.f11138g.mo11005a(10, interfaceC2514x).sendToTarget();
    }

    /* renamed from: b */
    public void m11406b(boolean z) {
        this.f11138g.mo11003a(13, z ? 1 : 0, 0).sendToTarget();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    public synchronized void m11407c() {
        if (this.f11155x) {
            return;
        }
        this.f11138g.mo11006a(7);
        boolean z = false;
        while (!this.f11155x) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Handler handler;
        C2399j e2;
        try {
            switch (message.what) {
                case 0:
                    m11365b((InterfaceC2515y) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    m11382f(message.arg1 != 0);
                    break;
                case 2:
                    m11372d();
                    break;
                case 3:
                    m11353a((d) message.obj);
                    break;
                case 4:
                    m11373d((C2137B) message.obj);
                    break;
                case 5:
                    m11350a((C2147L) message.obj);
                    break;
                case 6:
                    m11355a(message.arg1 != 0, true);
                    break;
                case 7:
                    m11391m();
                    return true;
                case 8:
                    m11352a((a) message.obj);
                    break;
                case 9:
                    m11375d((InterfaceC2514x) message.obj);
                    break;
                case 10:
                    m11369c((InterfaceC2514x) message.obj);
                    break;
                case 11:
                    m11392n();
                    break;
                case 12:
                    m11361b(message.arg1);
                    break;
                case 13:
                    m11383g(message.arg1 != 0);
                    break;
                case 14:
                    m11374d((C2141F) message.obj);
                    break;
                case 15:
                    m11381f((C2141F) message.obj);
                    break;
                case 16:
                    m11367c((C2137B) message.obj);
                    break;
                default:
                    return false;
            }
            m11387i();
        } catch (C2399j e3) {
            e2 = e3;
            C2638o.m11156a("ExoPlayerImplInternal", "Playback error.", e2);
            m11355a(false, false);
            handler = this.f11140i;
            handler.obtainMessage(2, e2).sendToTarget();
            m11387i();
            return true;
        } catch (IOException e4) {
            C2638o.m11156a("ExoPlayerImplInternal", "Source error.", e4);
            m11355a(false, false);
            handler = this.f11140i;
            e2 = C2399j.m9869a(e4);
            handler.obtainMessage(2, e2).sendToTarget();
            m11387i();
            return true;
        } catch (RuntimeException e5) {
            C2638o.m11156a("ExoPlayerImplInternal", "Internal runtime error.", e5);
            m11355a(false, false);
            handler = this.f11140i;
            e2 = C2399j.m9871a(e5);
            handler.obtainMessage(2, e2).sendToTarget();
            m11387i();
            return true;
        }
        return true;
    }
}
