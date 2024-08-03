package p139d.p225c.p226a.p227a.p250j.p253c;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2674q;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.AbstractC2503m;
import p139d.p225c.p226a.p227a.p250j.C2509s;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2508r;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p253c.C2459l;
import p139d.p225c.p226a.p227a.p250j.p253c.InterfaceC2450c;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2435a;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2436b;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2437c;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2440f;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2448n;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p269m.C2606t;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2582A;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.j.c.g */
/* loaded from: classes.dex */
public final class C2454g extends AbstractC2503m {

    /* renamed from: A */
    private Handler f9697A;

    /* renamed from: B */
    private Uri f9698B;

    /* renamed from: C */
    private Uri f9699C;

    /* renamed from: D */
    private C2436b f9700D;

    /* renamed from: E */
    private boolean f9701E;

    /* renamed from: F */
    private long f9702F;

    /* renamed from: G */
    private long f9703G;

    /* renamed from: H */
    private long f9704H;

    /* renamed from: I */
    private int f9705I;

    /* renamed from: J */
    private long f9706J;

    /* renamed from: K */
    private int f9707K;

    /* renamed from: f */
    private final boolean f9708f;

    /* renamed from: g */
    private final InterfaceC2597k.a f9709g;

    /* renamed from: h */
    private final InterfaceC2450c.a f9710h;

    /* renamed from: i */
    private final InterfaceC2508r f9711i;

    /* renamed from: j */
    private final InterfaceC2610x f9712j;

    /* renamed from: k */
    private final long f9713k;

    /* renamed from: l */
    private final boolean f9714l;

    /* renamed from: m */
    private final InterfaceC2516z.a f9715m;

    /* renamed from: n */
    private final C2583B.a<? extends C2436b> f9716n;

    /* renamed from: o */
    private final d f9717o;

    /* renamed from: p */
    private final Object f9718p;

    /* renamed from: q */
    private final SparseArray<C2452e> f9719q;

    /* renamed from: r */
    private final Runnable f9720r;

    /* renamed from: s */
    private final Runnable f9721s;

    /* renamed from: t */
    private final C2459l.b f9722t;

    /* renamed from: u */
    private final InterfaceC2582A f9723u;

    /* renamed from: v */
    private final Object f9724v;

    /* renamed from: w */
    private InterfaceC2597k f9725w;

    /* renamed from: x */
    private C2612z f9726x;

    /* renamed from: y */
    private InterfaceC2586E f9727y;

    /* renamed from: z */
    private IOException f9728z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC2151P {

        /* renamed from: b */
        private final long f9729b;

        /* renamed from: c */
        private final long f9730c;

        /* renamed from: d */
        private final int f9731d;

        /* renamed from: e */
        private final long f9732e;

        /* renamed from: f */
        private final long f9733f;

        /* renamed from: g */
        private final long f9734g;

        /* renamed from: h */
        private final C2436b f9735h;

        /* renamed from: i */
        private final Object f9736i;

        public a(long j, long j2, int i, long j3, long j4, long j5, C2436b c2436b, Object obj) {
            this.f9729b = j;
            this.f9730c = j2;
            this.f9731d = i;
            this.f9732e = j3;
            this.f9733f = j4;
            this.f9734g = j5;
            this.f9735h = c2436b;
            this.f9736i = obj;
        }

        /* renamed from: a */
        private long m10173a(long j) {
            InterfaceC2455h mo10104d;
            long j2 = this.f9734g;
            if (!this.f9735h.f9593d) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f9733f) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.f9732e + j2;
            long m10040c = this.f9735h.m10040c(0);
            long j4 = j3;
            int i = 0;
            while (i < this.f9735h.m10037a() - 1 && j4 >= m10040c) {
                j4 -= m10040c;
                i++;
                m10040c = this.f9735h.m10040c(i);
            }
            C2440f m10038a = this.f9735h.m10038a(i);
            int m10097a = m10038a.m10097a(2);
            return (m10097a == -1 || (mo10104d = m10038a.f9624c.get(m10097a).f9587c.get(0).mo10104d()) == null || mo10104d.mo10113c(m10040c) == 0) ? j2 : (j2 + mo10104d.mo10107a(mo10104d.mo10111b(j4, m10040c))) - j4;
        }

        @Override // p139d.p225c.p226a.p227a.AbstractC2151P
        /* renamed from: a */
        public int mo8636a() {
            return this.f9735h.m10037a();
        }

        @Override // p139d.p225c.p226a.p227a.AbstractC2151P
        /* renamed from: a */
        public int mo8637a(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f9731d) >= 0 && intValue < mo8636a()) {
                return intValue;
            }
            return -1;
        }

        @Override // p139d.p225c.p226a.p227a.AbstractC2151P
        /* renamed from: a */
        public AbstractC2151P.a mo8638a(int i, AbstractC2151P.a aVar, boolean z) {
            C2628e.m11109a(i, 0, mo8636a());
            aVar.m8659a(z ? this.f9735h.m10038a(i).f9622a : null, z ? Integer.valueOf(this.f9731d + i) : null, 0, this.f9735h.m10040c(i), C2200d.m9047a(this.f9735h.m10038a(i).f9623b - this.f9735h.m10038a(0).f9623b) - this.f9732e);
            return aVar;
        }

        @Override // p139d.p225c.p226a.p227a.AbstractC2151P
        /* renamed from: a */
        public AbstractC2151P.b mo8639a(int i, AbstractC2151P.b bVar, boolean z, long j) {
            C2628e.m11109a(i, 0, 1);
            long m10173a = m10173a(j);
            Object obj = z ? this.f9736i : null;
            C2436b c2436b = this.f9735h;
            bVar.m8672a(obj, this.f9729b, this.f9730c, true, c2436b.f9593d && c2436b.f9594e != -9223372036854775807L && c2436b.f9591b == -9223372036854775807L, m10173a, this.f9733f, 0, mo8636a() - 1, this.f9732e);
            return bVar;
        }

        @Override // p139d.p225c.p226a.p227a.AbstractC2151P
        /* renamed from: a */
        public Object mo8640a(int i) {
            C2628e.m11109a(i, 0, mo8636a());
            return Integer.valueOf(this.f9731d + i);
        }

        @Override // p139d.p225c.p226a.p227a.AbstractC2151P
        /* renamed from: b */
        public int mo8641b() {
            return 1;
        }
    }

    /* renamed from: d.c.a.a.j.c.g$b */
    /* loaded from: classes.dex */
    private final class b implements C2459l.b {
        private b() {
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.C2459l.b
        /* renamed from: a */
        public void mo10174a() {
            C2454g.this.m10172d();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.C2459l.b
        /* renamed from: a */
        public void mo10175a(long j) {
            C2454g.this.m10166a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.j.c.g$c */
    /* loaded from: classes.dex */
    public static final class c implements C2583B.a<Long> {

        /* renamed from: a */
        private static final Pattern f9738a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p139d.p225c.p226a.p227a.p269m.C2583B.a
        /* renamed from: a */
        public Long mo10065a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = f9738a.matcher(readLine);
                if (!matcher.matches()) {
                    throw new C2683z("Couldn't parse timestamp: " + readLine);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e2) {
                throw new C2683z(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.g$d */
    /* loaded from: classes.dex */
    public final class d implements C2612z.a<C2583B<C2436b>> {
        private d() {
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C2612z.b mo9965a(C2583B<C2436b> c2583b, long j, long j2, IOException iOException, int i) {
            return C2454g.this.m10165a(c2583b, j, j2, iOException);
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo9967a(C2583B<C2436b> c2583b, long j, long j2) {
            C2454g.this.m10169b(c2583b, j, j2);
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo9968a(C2583B<C2436b> c2583b, long j, long j2, boolean z) {
            C2454g.this.m10167a(c2583b, j, j2);
        }
    }

    /* renamed from: d.c.a.a.j.c.g$e */
    /* loaded from: classes.dex */
    final class e implements InterfaceC2582A {
        e() {
        }

        /* renamed from: b */
        private void m10176b() {
            if (C2454g.this.f9728z != null) {
                throw C2454g.this.f9728z;
            }
        }

        @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2582A
        /* renamed from: a */
        public void mo10177a() {
            C2454g.this.f9726x.mo10177a();
            m10176b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.g$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final boolean f9741a;

        /* renamed from: b */
        public final long f9742b;

        /* renamed from: c */
        public final long f9743c;

        private f(boolean z, long j, long j2) {
            this.f9741a = z;
            this.f9742b = j;
            this.f9743c = j2;
        }

        /* renamed from: a */
        public static f m10178a(C2440f c2440f, long j) {
            boolean z;
            int i;
            boolean z2;
            C2440f c2440f2 = c2440f;
            int size = c2440f2.f9624c.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = c2440f2.f9624c.get(i3).f9586b;
                if (i4 == 1 || i4 == 2) {
                    z = true;
                    break;
                }
            }
            z = false;
            long j2 = Long.MAX_VALUE;
            int i5 = 0;
            boolean z3 = false;
            boolean z4 = false;
            long j3 = 0;
            while (i5 < size) {
                C2435a c2435a = c2440f2.f9624c.get(i5);
                if (z && c2435a.f9586b == 3) {
                    i = size;
                    z2 = z;
                } else {
                    InterfaceC2455h mo10104d = c2435a.f9587c.get(i2).mo10104d();
                    if (mo10104d == null) {
                        return new f(true, 0L, j);
                    }
                    boolean mo10109a = mo10104d.mo10109a() | z4;
                    int mo10113c = mo10104d.mo10113c(j);
                    if (mo10113c == 0) {
                        i = size;
                        z2 = z;
                        z4 = mo10109a;
                        z3 = true;
                        j3 = 0;
                        j2 = 0;
                    } else {
                        if (z3) {
                            i = size;
                            z2 = z;
                        } else {
                            z2 = z;
                            long mo10110b = mo10104d.mo10110b();
                            i = size;
                            long max = Math.max(j3, mo10104d.mo10107a(mo10110b));
                            if (mo10113c != -1) {
                                long j4 = (mo10110b + mo10113c) - 1;
                                j3 = max;
                                j2 = Math.min(j2, mo10104d.mo10107a(j4) + mo10104d.mo10108a(j4, j));
                            } else {
                                j3 = max;
                            }
                        }
                        z4 = mo10109a;
                    }
                }
                i5++;
                i2 = 0;
                c2440f2 = c2440f;
                z = z2;
                size = i;
            }
            return new f(z4, j3, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.g$g */
    /* loaded from: classes.dex */
    public final class g implements C2612z.a<C2583B<Long>> {
        private g() {
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C2612z.b mo9965a(C2583B<Long> c2583b, long j, long j2, IOException iOException, int i) {
            return C2454g.this.m10168b(c2583b, j, j2, iOException);
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo9967a(C2583B<Long> c2583b, long j, long j2) {
            C2454g.this.m10171c(c2583b, j, j2);
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo9968a(C2583B<Long> c2583b, long j, long j2, boolean z) {
            C2454g.this.m10167a(c2583b, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.g$h */
    /* loaded from: classes.dex */
    public static final class h implements C2583B.a<Long> {
        private h() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p139d.p225c.p226a.p227a.p269m.C2583B.a
        /* renamed from: a */
        public Long mo10065a(Uri uri, InputStream inputStream) {
            return Long.valueOf(C2622I.m11094g(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        C2674q.m11418a("goog.exo.dash");
    }

    @Deprecated
    public C2454g(Uri uri, InterfaceC2597k.a aVar, InterfaceC2450c.a aVar2, int i, long j, Handler handler, InterfaceC2516z interfaceC2516z) {
        this(uri, aVar, new C2437c(), aVar2, i, j, handler, interfaceC2516z);
    }

    @Deprecated
    public C2454g(Uri uri, InterfaceC2597k.a aVar, C2583B.a<? extends C2436b> aVar2, InterfaceC2450c.a aVar3, int i, long j, Handler handler, InterfaceC2516z interfaceC2516z) {
        this(null, uri, aVar, aVar2, aVar3, new C2509s(), new C2606t(i), j == -1 ? 30000L : j, j != -1, null);
        if (handler == null || interfaceC2516z == null) {
            return;
        }
        mo10433a(handler, interfaceC2516z);
    }

    private C2454g(C2436b c2436b, Uri uri, InterfaceC2597k.a aVar, C2583B.a<? extends C2436b> aVar2, InterfaceC2450c.a aVar3, InterfaceC2508r interfaceC2508r, InterfaceC2610x interfaceC2610x, long j, boolean z, Object obj) {
        this.f9698B = uri;
        this.f9700D = c2436b;
        this.f9699C = uri;
        this.f9709g = aVar;
        this.f9716n = aVar2;
        this.f9710h = aVar3;
        this.f9712j = interfaceC2610x;
        this.f9713k = j;
        this.f9714l = z;
        this.f9711i = interfaceC2508r;
        this.f9724v = obj;
        this.f9708f = c2436b != null;
        this.f9715m = m10431a((InterfaceC2515y.a) null);
        this.f9718p = new Object();
        this.f9719q = new SparseArray<>();
        this.f9722t = new b();
        this.f9706J = -9223372036854775807L;
        if (!this.f9708f) {
            this.f9717o = new d();
            this.f9723u = new e();
            this.f9720r = new Runnable() { // from class: d.c.a.a.j.c.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2454g.this.m10164g();
                }
            };
            this.f9721s = new Runnable() { // from class: d.c.a.a.j.c.b
                @Override // java.lang.Runnable
                public final void run() {
                    C2454g.this.m10170c();
                }
            };
            return;
        }
        C2628e.m11113b(!c2436b.f9593d);
        this.f9717o = null;
        this.f9720r = null;
        this.f9721s = null;
        this.f9723u = new InterfaceC2582A.a();
    }

    /* renamed from: a */
    private void m10152a(C2448n c2448n) {
        C2583B.a<Long> cVar;
        String str = c2448n.f9666a;
        if (C2622I.m11067a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2014") || C2622I.m11067a((Object) str, (Object) "urn:mpeg:dash:utc:direct:2012")) {
            m10159b(c2448n);
            return;
        }
        if (C2622I.m11067a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2014") || C2622I.m11067a((Object) str, (Object) "urn:mpeg:dash:utc:http-iso:2012")) {
            cVar = new c();
        } else {
            if (!C2622I.m11067a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2014") && !C2622I.m11067a((Object) str, (Object) "urn:mpeg:dash:utc:http-xsdate:2012")) {
                m10155a(new IOException("Unsupported UTC timing scheme"));
                return;
            }
            cVar = new h();
        }
        m10153a(c2448n, cVar);
    }

    /* renamed from: a */
    private void m10153a(C2448n c2448n, C2583B.a<Long> aVar) {
        m10154a(new C2583B(this.f9725w, Uri.parse(c2448n.f9667b), 5, aVar), new g(), 1);
    }

    /* renamed from: a */
    private <T> void m10154a(C2583B<T> c2583b, C2612z.a<C2583B<T>> aVar, int i) {
        this.f9715m.m10505a(c2583b.f10736a, c2583b.f10737b, this.f9726x.m10960a(c2583b, aVar, i));
    }

    /* renamed from: a */
    private void m10155a(IOException iOException) {
        C2638o.m11156a("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        m10156a(true);
    }

    /* renamed from: a */
    private void m10156a(boolean z) {
        long j;
        boolean z2;
        long j2;
        for (int i = 0; i < this.f9719q.size(); i++) {
            int keyAt = this.f9719q.keyAt(i);
            if (keyAt >= this.f9707K) {
                this.f9719q.valueAt(i).m10144a(this.f9700D, keyAt - this.f9707K);
            }
        }
        int m10037a = this.f9700D.m10037a() - 1;
        f m10178a = f.m10178a(this.f9700D.m10038a(0), this.f9700D.m10040c(0));
        f m10178a2 = f.m10178a(this.f9700D.m10038a(m10037a), this.f9700D.m10040c(m10037a));
        long j3 = m10178a.f9742b;
        long j4 = m10178a2.f9743c;
        if (!this.f9700D.f9593d || m10178a2.f9741a) {
            j = j3;
            z2 = false;
        } else {
            j4 = Math.min((m10163f() - C2200d.m9047a(this.f9700D.f9590a)) - C2200d.m9047a(this.f9700D.m10038a(m10037a).f9623b), j4);
            long j5 = this.f9700D.f9595f;
            if (j5 != -9223372036854775807L) {
                long m9047a = j4 - C2200d.m9047a(j5);
                while (m9047a < 0 && m10037a > 0) {
                    m10037a--;
                    m9047a += this.f9700D.m10040c(m10037a);
                }
                j3 = m10037a == 0 ? Math.max(j3, m9047a) : this.f9700D.m10040c(0);
            }
            j = j3;
            z2 = true;
        }
        long j6 = j4 - j;
        for (int i2 = 0; i2 < this.f9700D.m10037a() - 1; i2++) {
            j6 += this.f9700D.m10040c(i2);
        }
        C2436b c2436b = this.f9700D;
        if (c2436b.f9593d) {
            long j7 = this.f9713k;
            if (!this.f9714l) {
                long j8 = c2436b.f9596g;
                if (j8 != -9223372036854775807L) {
                    j7 = j8;
                }
            }
            long m9047a2 = j6 - C2200d.m9047a(j7);
            if (m9047a2 < 5000000) {
                m9047a2 = Math.min(5000000L, j6 / 2);
            }
            j2 = m9047a2;
        } else {
            j2 = 0;
        }
        C2436b c2436b2 = this.f9700D;
        long m9048b = c2436b2.f9590a + c2436b2.m10038a(0).f9623b + C2200d.m9048b(j);
        C2436b c2436b3 = this.f9700D;
        m10434a(new a(c2436b3.f9590a, m9048b, this.f9707K, j, j6, j2, c2436b3, this.f9724v), this.f9700D);
        if (this.f9708f) {
            return;
        }
        this.f9697A.removeCallbacks(this.f9721s);
        if (z2) {
            this.f9697A.postDelayed(this.f9721s, 5000L);
        }
        if (this.f9701E) {
            m10164g();
            return;
        }
        if (z) {
            C2436b c2436b4 = this.f9700D;
            if (c2436b4.f9593d) {
                long j9 = c2436b4.f9594e;
                if (j9 != -9223372036854775807L) {
                    if (j9 == 0) {
                        j9 = 5000;
                    }
                    m10160c(Math.max(0L, (this.f9702F + j9) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* renamed from: b */
    private void m10158b(long j) {
        this.f9704H = j;
        m10156a(true);
    }

    /* renamed from: b */
    private void m10159b(C2448n c2448n) {
        try {
            m10158b(C2622I.m11094g(c2448n.f9667b) - this.f9703G);
        } catch (C2683z e2) {
            m10155a(e2);
        }
    }

    /* renamed from: c */
    private void m10160c(long j) {
        this.f9697A.postDelayed(this.f9720r, j);
    }

    /* renamed from: e */
    private long m10162e() {
        return Math.min((this.f9705I - 1) * 1000, 5000);
    }

    /* renamed from: f */
    private long m10163f() {
        return C2200d.m9047a(this.f9704H != 0 ? SystemClock.elapsedRealtime() + this.f9704H : System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m10164g() {
        Uri uri;
        this.f9697A.removeCallbacks(this.f9720r);
        if (this.f9726x.m10964c()) {
            this.f9701E = true;
            return;
        }
        synchronized (this.f9718p) {
            uri = this.f9699C;
        }
        this.f9701E = false;
        m10154a(new C2583B(this.f9725w, uri, 4, this.f9716n), this.f9717o, this.f9712j.mo10948a(4));
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public InterfaceC2514x mo9889a(InterfaceC2515y.a aVar, InterfaceC2590d interfaceC2590d) {
        int intValue = ((Integer) aVar.f10271a).intValue() - this.f9707K;
        C2452e c2452e = new C2452e(this.f9707K + intValue, this.f9700D, intValue, this.f9710h, this.f9727y, this.f9712j, m10432a(aVar, this.f9700D.m10038a(intValue).f9623b), this.f9704H, this.f9723u, interfaceC2590d, this.f9711i, this.f9722t);
        this.f9719q.put(c2452e.f9669a, c2452e);
        return c2452e;
    }

    /* renamed from: a */
    C2612z.b m10165a(C2583B<C2436b> c2583b, long j, long j2, IOException iOException) {
        boolean z = iOException instanceof C2683z;
        this.f9715m.m10509a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c(), iOException, z);
        return z ? C2612z.f10850d : C2612z.f10847a;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
        this.f9723u.mo10177a();
    }

    /* renamed from: a */
    void m10166a(long j) {
        long j2 = this.f9706J;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f9706J = j;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9892a(InterfaceC2514x interfaceC2514x) {
        C2452e c2452e = (C2452e) interfaceC2514x;
        c2452e.m10146c();
        this.f9719q.remove(c2452e.f9669a);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        this.f9727y = interfaceC2586E;
        if (this.f9708f) {
            m10156a(false);
            return;
        }
        this.f9725w = this.f9709g.mo10923a();
        this.f9726x = new C2612z("Loader:DashMediaSource");
        this.f9697A = new Handler();
        m10164g();
    }

    /* renamed from: a */
    void m10167a(C2583B<?> c2583b, long j, long j2) {
        this.f9715m.m10508a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c());
    }

    /* renamed from: b */
    C2612z.b m10168b(C2583B<Long> c2583b, long j, long j2, IOException iOException) {
        this.f9715m.m10509a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c(), iOException, true);
        m10155a(iOException);
        return C2612z.f10849c;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
        this.f9701E = false;
        this.f9725w = null;
        C2612z c2612z = this.f9726x;
        if (c2612z != null) {
            c2612z.m10965d();
            this.f9726x = null;
        }
        this.f9702F = 0L;
        this.f9703G = 0L;
        this.f9700D = this.f9708f ? this.f9700D : null;
        this.f9699C = this.f9698B;
        this.f9728z = null;
        Handler handler = this.f9697A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9697A = null;
        }
        this.f9704H = 0L;
        this.f9705I = 0;
        this.f9706J = -9223372036854775807L;
        this.f9707K = 0;
        this.f9719q.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m10169b(p139d.p225c.p226a.p227a.p269m.C2583B<p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2436b> r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p253c.C2454g.m10169b(d.c.a.a.m.B, long, long):void");
    }

    /* renamed from: c */
    public /* synthetic */ void m10170c() {
        m10156a(false);
    }

    /* renamed from: c */
    void m10171c(C2583B<Long> c2583b, long j, long j2) {
        this.f9715m.m10516b(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c());
        m10158b(c2583b.m10898e().longValue() - j);
    }

    /* renamed from: d */
    void m10172d() {
        this.f9697A.removeCallbacks(this.f9721s);
        m10164g();
    }
}
