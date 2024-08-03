package p139d.p225c.p226a.p227a.p269m;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2614A;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2635l;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;

/* renamed from: d.c.a.a.m.q */
/* loaded from: classes.dex */
public final class C2603q implements InterfaceC2592f, InterfaceC2586E {

    /* renamed from: a */
    public static final Map<String, int[]> f10799a = m10936c();

    /* renamed from: b */
    public static final long[] f10800b = {5700000, 3400000, 1900000, 1000000, 400000};

    /* renamed from: c */
    public static final long[] f10801c = {169000, 129000, 114000, 102000, 87000};

    /* renamed from: d */
    public static final long[] f10802d = {2100000, 1300000, 950000, 700000, 400000};

    /* renamed from: e */
    public static final long[] f10803e = {6900000, 4300000, 2700000, 1600000, 450000};

    /* renamed from: f */
    private final C2635l<InterfaceC2592f.a> f10804f;

    /* renamed from: g */
    private final C2614A f10805g;

    /* renamed from: h */
    private final InterfaceC2629f f10806h;

    /* renamed from: i */
    private int f10807i;

    /* renamed from: j */
    private long f10808j;

    /* renamed from: k */
    private long f10809k;

    /* renamed from: l */
    private long f10810l;

    /* renamed from: m */
    private long f10811m;

    /* renamed from: n */
    private long f10812n;

    /* renamed from: d.c.a.a.m.q$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Context f10813a;

        /* renamed from: b */
        private Handler f10814b;

        /* renamed from: c */
        private InterfaceC2592f.a f10815c;

        /* renamed from: d */
        private SparseArray<Long> f10816d;

        /* renamed from: e */
        private int f10817e;

        /* renamed from: f */
        private InterfaceC2629f f10818f;

        @Deprecated
        public a() {
            this(null);
        }

        public a(Context context) {
            this.f10813a = context == null ? null : context.getApplicationContext();
            this.f10816d = m10938b(C2622I.m11051a(context));
            this.f10817e = 2000;
            this.f10818f = InterfaceC2629f.f10943a;
        }

        /* renamed from: a */
        private static int[] m10937a(String str) {
            int[] iArr = C2603q.f10799a.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }

        /* renamed from: b */
        private static SparseArray<Long> m10938b(String str) {
            int[] m10937a = m10937a(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            sparseArray.append(2, Long.valueOf(C2603q.f10800b[m10937a[0]]));
            sparseArray.append(3, Long.valueOf(C2603q.f10801c[m10937a[1]]));
            sparseArray.append(4, Long.valueOf(C2603q.f10802d[m10937a[2]]));
            sparseArray.append(5, Long.valueOf(C2603q.f10803e[m10937a[3]]));
            sparseArray.append(7, Long.valueOf(C2603q.f10800b[m10937a[0]]));
            return sparseArray;
        }

        /* renamed from: a */
        public C2603q m10939a() {
            InterfaceC2592f.a aVar;
            Long l = this.f10816d.get(C2622I.m11077b(this.f10813a));
            if (l == null) {
                l = this.f10816d.get(0);
            }
            C2603q c2603q = new C2603q(l.longValue(), this.f10817e, this.f10818f);
            Handler handler = this.f10814b;
            if (handler != null && (aVar = this.f10815c) != null) {
                c2603q.mo10915a(handler, aVar);
            }
            return c2603q;
        }
    }

    public C2603q() {
        this(1000000L, 2000, InterfaceC2629f.f10943a);
    }

    private C2603q(long j, int i, InterfaceC2629f interfaceC2629f) {
        this.f10804f = new C2635l<>();
        this.f10805g = new C2614A(i);
        this.f10806h = interfaceC2629f;
        this.f10812n = j;
    }

    /* renamed from: a */
    private void m10934a(final int i, final long j, final long j2) {
        this.f10804f.m11146a(new C2635l.a() { // from class: d.c.a.a.m.a
            @Override // p139d.p225c.p226a.p227a.p270n.C2635l.a
            /* renamed from: a */
            public final void mo9049a(Object obj) {
                ((InterfaceC2592f.a) obj).mo4921a(i, j, j2);
            }
        });
    }

    /* renamed from: c */
    private static Map<String, int[]> m10936c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 0, 0, 0});
        hashMap.put("AE", new int[]{1, 3, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 2});
        hashMap.put("AG", new int[]{3, 2, 1, 2});
        hashMap.put("AI", new int[]{1, 0, 0, 2});
        hashMap.put("AL", new int[]{1, 1, 1, 1});
        hashMap.put("AM", new int[]{2, 2, 4, 3});
        hashMap.put("AO", new int[]{2, 4, 2, 0});
        hashMap.put("AR", new int[]{2, 3, 2, 3});
        hashMap.put("AS", new int[]{3, 4, 4, 1});
        hashMap.put("AT", new int[]{0, 1, 0, 0});
        hashMap.put("AU", new int[]{0, 3, 0, 0});
        hashMap.put("AW", new int[]{1, 1, 0, 4});
        hashMap.put("AX", new int[]{0, 1, 0, 0});
        hashMap.put("AZ", new int[]{3, 3, 2, 2});
        hashMap.put("BA", new int[]{1, 1, 1, 2});
        hashMap.put("BB", new int[]{0, 1, 0, 0});
        hashMap.put("BD", new int[]{2, 1, 3, 2});
        hashMap.put("BE", new int[]{0, 0, 0, 0});
        hashMap.put("BF", new int[]{4, 4, 4, 1});
        hashMap.put("BG", new int[]{0, 0, 0, 1});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 3, 4, 4});
        hashMap.put("BJ", new int[]{4, 3, 4, 3});
        hashMap.put("BL", new int[]{1, 0, 1, 2});
        hashMap.put("BM", new int[]{1, 0, 0, 0});
        hashMap.put("BN", new int[]{4, 3, 3, 3});
        hashMap.put("BO", new int[]{2, 2, 1, 2});
        hashMap.put("BQ", new int[]{1, 1, 2, 4});
        hashMap.put("BR", new int[]{2, 3, 2, 2});
        hashMap.put("BS", new int[]{1, 1, 0, 2});
        hashMap.put("BT", new int[]{3, 0, 2, 1});
        hashMap.put("BW", new int[]{4, 4, 2, 3});
        hashMap.put("BY", new int[]{1, 1, 1, 1});
        hashMap.put("BZ", new int[]{2, 3, 3, 1});
        hashMap.put("CA", new int[]{0, 2, 2, 3});
        hashMap.put("CD", new int[]{4, 4, 2, 1});
        hashMap.put("CF", new int[]{4, 4, 3, 3});
        hashMap.put("CG", new int[]{4, 4, 4, 4});
        hashMap.put("CH", new int[]{0, 0, 0, 0});
        hashMap.put("CI", new int[]{4, 4, 4, 4});
        hashMap.put("CK", new int[]{2, 4, 2, 0});
        hashMap.put("CL", new int[]{2, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 3, 1});
        hashMap.put("CN", new int[]{2, 0, 1, 2});
        hashMap.put("CO", new int[]{2, 3, 2, 1});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 4, 1});
        hashMap.put("CV", new int[]{2, 2, 2, 4});
        hashMap.put("CW", new int[]{1, 1, 0, 0});
        hashMap.put("CX", new int[]{1, 2, 2, 2});
        hashMap.put("CY", new int[]{1, 1, 0, 0});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 2, 2, 2});
        hashMap.put("DJ", new int[]{3, 4, 4, 0});
        hashMap.put("DK", new int[]{0, 0, 0, 0});
        hashMap.put("DM", new int[]{2, 0, 3, 4});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 3, 3, 1});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 3, 1, 1});
        hashMap.put("EH", new int[]{2, 0, 2, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 2});
        hashMap.put("ES", new int[]{0, 0, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 2, 3, 3});
        hashMap.put("FK", new int[]{3, 4, 2, 1});
        hashMap.put("FM", new int[]{4, 2, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 1});
        hashMap.put("FR", new int[]{1, 0, 2, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 1});
        hashMap.put("GB", new int[]{0, 1, 3, 2});
        hashMap.put("GD", new int[]{2, 0, 3, 0});
        hashMap.put("GE", new int[]{1, 1, 0, 3});
        hashMap.put("GF", new int[]{1, 2, 4, 4});
        hashMap.put("GG", new int[]{0, 1, 0, 0});
        hashMap.put("GH", new int[]{3, 2, 2, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 4, 1, 4});
        hashMap.put("GM", new int[]{4, 3, 3, 0});
        hashMap.put("GN", new int[]{4, 4, 3, 4});
        hashMap.put("GP", new int[]{2, 2, 1, 3});
        hashMap.put("GQ", new int[]{4, 4, 3, 1});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 2, 3, 4});
        hashMap.put("GU", new int[]{1, 0, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 0});
        hashMap.put("GY", new int[]{3, 4, 1, 0});
        hashMap.put("HK", new int[]{0, 2, 3, 4});
        hashMap.put("HN", new int[]{3, 3, 2, 2});
        hashMap.put("HR", new int[]{1, 0, 0, 2});
        hashMap.put("HT", new int[]{3, 3, 3, 3});
        hashMap.put("HU", new int[]{0, 0, 1, 0});
        hashMap.put("ID", new int[]{2, 3, 3, 4});
        hashMap.put("IE", new int[]{0, 0, 1, 1});
        hashMap.put("IL", new int[]{0, 1, 1, 3});
        hashMap.put("IM", new int[]{0, 1, 0, 1});
        hashMap.put("IN", new int[]{2, 3, 3, 4});
        hashMap.put("IO", new int[]{4, 2, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 3});
        hashMap.put("IR", new int[]{3, 2, 4, 4});
        hashMap.put("IS", new int[]{0, 0, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 3});
        hashMap.put("JE", new int[]{0, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 3, 3, 2});
        hashMap.put("JO", new int[]{1, 1, 1, 2});
        hashMap.put("JP", new int[]{0, 1, 1, 2});
        hashMap.put("KE", new int[]{3, 3, 3, 3});
        hashMap.put("KG", new int[]{2, 2, 3, 3});
        hashMap.put("KH", new int[]{1, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 4, 2, 2});
        hashMap.put("KN", new int[]{1, 0, 1, 3});
        hashMap.put("KP", new int[]{1, 2, 2, 2});
        hashMap.put("KR", new int[]{0, 4, 0, 2});
        hashMap.put("KW", new int[]{1, 2, 1, 2});
        hashMap.put("KY", new int[]{1, 1, 0, 2});
        hashMap.put("KZ", new int[]{1, 2, 2, 3});
        hashMap.put("LA", new int[]{3, 2, 2, 2});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{2, 2, 1, 0});
        hashMap.put("LI", new int[]{0, 0, 1, 2});
        hashMap.put("LK", new int[]{1, 1, 2, 2});
        hashMap.put("LR", new int[]{3, 4, 3, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 1});
        hashMap.put("LU", new int[]{0, 0, 1, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 4, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 2});
        hashMap.put("MC", new int[]{1, 0, 1, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 2, 3});
        hashMap.put("MF", new int[]{1, 4, 3, 3});
        hashMap.put("MG", new int[]{3, 4, 1, 2});
        hashMap.put("MH", new int[]{4, 0, 2, 3});
        hashMap.put("MK", new int[]{1, 0, 0, 1});
        hashMap.put("ML", new int[]{4, 4, 4, 4});
        hashMap.put("MM", new int[]{2, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 2, 2, 4});
        hashMap.put("MO", new int[]{0, 1, 4, 4});
        hashMap.put("MP", new int[]{0, 0, 4, 4});
        hashMap.put("MQ", new int[]{1, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 2, 4, 2});
        hashMap.put("MS", new int[]{1, 2, 1, 2});
        hashMap.put("MT", new int[]{0, 0, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 4, 4});
        hashMap.put("MV", new int[]{4, 2, 0, 1});
        hashMap.put("MW", new int[]{3, 2, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 1});
        hashMap.put("MY", new int[]{2, 3, 3, 3});
        hashMap.put("MZ", new int[]{3, 3, 2, 4});
        hashMap.put("NA", new int[]{4, 2, 1, 1});
        hashMap.put("NC", new int[]{2, 1, 3, 3});
        hashMap.put("NE", new int[]{4, 4, 4, 4});
        hashMap.put("NF", new int[]{0, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 2, 2});
        hashMap.put("NI", new int[]{3, 4, 3, 3});
        hashMap.put("NL", new int[]{0, 1, 3, 2});
        hashMap.put("NO", new int[]{0, 0, 1, 0});
        hashMap.put("NP", new int[]{2, 3, 2, 2});
        hashMap.put("NR", new int[]{4, 3, 4, 1});
        hashMap.put("NU", new int[]{4, 2, 2, 2});
        hashMap.put("NZ", new int[]{0, 0, 0, 1});
        hashMap.put("OM", new int[]{2, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 2, 3});
        hashMap.put("PE", new int[]{2, 2, 4, 4});
        hashMap.put("PF", new int[]{2, 2, 0, 1});
        hashMap.put("PG", new int[]{4, 4, 4, 4});
        hashMap.put("PH", new int[]{3, 0, 4, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 0, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 2, 3});
        hashMap.put("PR", new int[]{2, 3, 4, 3});
        hashMap.put("PS", new int[]{2, 3, 0, 4});
        hashMap.put("PT", new int[]{1, 1, 1, 1});
        hashMap.put("PW", new int[]{3, 2, 3, 0});
        hashMap.put("PY", new int[]{2, 1, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 1, 2});
        hashMap.put("RE", new int[]{1, 1, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 3});
        hashMap.put("RS", new int[]{1, 1, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{3, 4, 3, 1});
        hashMap.put("SA", new int[]{3, 2, 2, 3});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{3, 4, 4, 4});
        hashMap.put("SE", new int[]{0, 0, 0, 0});
        hashMap.put("SG", new int[]{1, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 2, 2, 2});
        hashMap.put("SI", new int[]{0, 1, 0, 0});
        hashMap.put("SJ", new int[]{3, 2, 0, 2});
        hashMap.put("SK", new int[]{0, 1, 0, 1});
        hashMap.put("SL", new int[]{4, 3, 2, 4});
        hashMap.put("SM", new int[]{1, 0, 1, 1});
        hashMap.put("SN", new int[]{4, 4, 4, 2});
        hashMap.put("SO", new int[]{4, 4, 4, 3});
        hashMap.put("SR", new int[]{3, 2, 2, 3});
        hashMap.put("SS", new int[]{4, 3, 4, 2});
        hashMap.put("ST", new int[]{3, 2, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 2, 3});
        hashMap.put("SX", new int[]{2, 4, 2, 0});
        hashMap.put("SY", new int[]{4, 4, 2, 0});
        hashMap.put("SZ", new int[]{3, 4, 1, 1});
        hashMap.put("TC", new int[]{2, 1, 2, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 2, 2, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 3, 3});
        hashMap.put("TN", new int[]{2, 2, 1, 2});
        hashMap.put("TO", new int[]{2, 3, 3, 1});
        hashMap.put("TR", new int[]{1, 2, 0, 2});
        hashMap.put("TT", new int[]{2, 1, 1, 0});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 1});
        hashMap.put("TZ", new int[]{3, 3, 3, 2});
        hashMap.put("UA", new int[]{0, 2, 1, 3});
        hashMap.put("UG", new int[]{4, 3, 2, 2});
        hashMap.put("US", new int[]{0, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 1, 2, 2});
        hashMap.put("UZ", new int[]{4, 3, 2, 4});
        hashMap.put("VA", new int[]{1, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 0, 3, 2});
        hashMap.put("VE", new int[]{3, 4, 4, 3});
        hashMap.put("VG", new int[]{3, 1, 3, 4});
        hashMap.put("VI", new int[]{1, 0, 2, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 2});
        hashMap.put("WS", new int[]{3, 2, 3, 0});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 2});
        hashMap.put("YT", new int[]{3, 1, 1, 2});
        hashMap.put("ZA", new int[]{2, 3, 1, 2});
        hashMap.put("ZM", new int[]{3, 3, 3, 1});
        hashMap.put("ZW", new int[]{3, 3, 2, 1});
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2592f
    /* renamed from: a */
    public InterfaceC2586E mo10914a() {
        return this;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2592f
    /* renamed from: a */
    public void mo10915a(Handler handler, InterfaceC2592f.a aVar) {
        this.f10804f.m11145a(handler, aVar);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2592f
    /* renamed from: a */
    public void mo10916a(InterfaceC2592f.a aVar) {
        this.f10804f.m11147a((C2635l<InterfaceC2592f.a>) aVar);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2586E
    /* renamed from: a */
    public synchronized void mo10905a(InterfaceC2597k interfaceC2597k, C2600n c2600n, boolean z) {
        if (z) {
            C2628e.m11113b(this.f10807i > 0);
            long mo11001b = this.f10806h.mo11001b();
            int i = (int) (mo11001b - this.f10808j);
            long j = i;
            this.f10810l += j;
            this.f10811m += this.f10809k;
            if (i > 0) {
                this.f10805g.m10995a((int) Math.sqrt(this.f10809k), (float) ((this.f10809k * 8000) / j));
                if (this.f10810l >= 2000 || this.f10811m >= 524288) {
                    this.f10812n = this.f10805g.m10994a(0.5f);
                }
            }
            m10934a(i, this.f10809k, this.f10812n);
            int i2 = this.f10807i - 1;
            this.f10807i = i2;
            if (i2 > 0) {
                this.f10808j = mo11001b;
            }
            this.f10809k = 0L;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2586E
    /* renamed from: a */
    public synchronized void mo10906a(InterfaceC2597k interfaceC2597k, C2600n c2600n, boolean z, int i) {
        if (z) {
            this.f10809k += i;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2592f
    /* renamed from: b */
    public synchronized long mo10917b() {
        return this.f10812n;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2586E
    /* renamed from: b */
    public synchronized void mo10907b(InterfaceC2597k interfaceC2597k, C2600n c2600n, boolean z) {
        if (z) {
            if (this.f10807i == 0) {
                this.f10808j = this.f10806h.mo11001b();
            }
            this.f10807i++;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2586E
    /* renamed from: c */
    public void mo10908c(InterfaceC2597k interfaceC2597k, C2600n c2600n, boolean z) {
    }
}
