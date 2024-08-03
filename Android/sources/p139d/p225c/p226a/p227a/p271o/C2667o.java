package p139d.p225c.p226a.p227a.p271o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import p139d.p225c.p226a.p227a.AbstractC2190c;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p230c.C2195e;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p231d.C2219s;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p244g.AbstractC2340b;
import p139d.p225c.p226a.p227a.p244g.C2339a;
import p139d.p225c.p226a.p227a.p244g.C2345g;
import p139d.p225c.p226a.p227a.p244g.C2346h;
import p139d.p225c.p226a.p227a.p244g.InterfaceC2343e;
import p139d.p225c.p226a.p227a.p270n.C2620G;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;
import p139d.p225c.p226a.p227a.p271o.InterfaceC2672t;

@TargetApi(16)
/* renamed from: d.c.a.a.o.o */
/* loaded from: classes.dex */
public class C2667o extends AbstractC2340b {

    /* renamed from: ha */
    private static final int[] f11059ha = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: ia */
    private static boolean f11060ia;

    /* renamed from: ja */
    private static boolean f11061ja;

    /* renamed from: Aa */
    private long f11062Aa;

    /* renamed from: Ba */
    private int f11063Ba;

    /* renamed from: Ca */
    private int f11064Ca;

    /* renamed from: Da */
    private int f11065Da;

    /* renamed from: Ea */
    private long f11066Ea;

    /* renamed from: Fa */
    private int f11067Fa;

    /* renamed from: Ga */
    private float f11068Ga;

    /* renamed from: Ha */
    private int f11069Ha;

    /* renamed from: Ia */
    private int f11070Ia;

    /* renamed from: Ja */
    private int f11071Ja;

    /* renamed from: Ka */
    private float f11072Ka;

    /* renamed from: La */
    private int f11073La;

    /* renamed from: Ma */
    private int f11074Ma;

    /* renamed from: Na */
    private int f11075Na;

    /* renamed from: Oa */
    private float f11076Oa;

    /* renamed from: Pa */
    private boolean f11077Pa;

    /* renamed from: Qa */
    private int f11078Qa;

    /* renamed from: Ra */
    b f11079Ra;

    /* renamed from: Sa */
    private long f11080Sa;

    /* renamed from: Ta */
    private long f11081Ta;

    /* renamed from: Ua */
    private int f11082Ua;

    /* renamed from: Va */
    private InterfaceC2668p f11083Va;

    /* renamed from: ka */
    private final Context f11084ka;

    /* renamed from: la */
    private final C2669q f11085la;

    /* renamed from: ma */
    private final InterfaceC2672t.a f11086ma;

    /* renamed from: na */
    private final long f11087na;

    /* renamed from: oa */
    private final int f11088oa;

    /* renamed from: pa */
    private final boolean f11089pa;

    /* renamed from: qa */
    private final long[] f11090qa;

    /* renamed from: ra */
    private final long[] f11091ra;

    /* renamed from: sa */
    private a f11092sa;

    /* renamed from: ta */
    private boolean f11093ta;

    /* renamed from: ua */
    private Surface f11094ua;

    /* renamed from: va */
    private Surface f11095va;

    /* renamed from: wa */
    private int f11096wa;

    /* renamed from: xa */
    private boolean f11097xa;

    /* renamed from: ya */
    private long f11098ya;

    /* renamed from: za */
    private long f11099za;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.o.o$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f11100a;

        /* renamed from: b */
        public final int f11101b;

        /* renamed from: c */
        public final int f11102c;

        public a(int i, int i2, int i3) {
            this.f11100a = i;
            this.f11101b = i2;
            this.f11102c = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: d.c.a.a.o.o$b */
    /* loaded from: classes.dex */
    public final class b implements MediaCodec.OnFrameRenderedListener {
        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            C2667o c2667o = C2667o.this;
            if (this != c2667o.f11079Ra) {
                return;
            }
            c2667o.m11308e(j);
        }
    }

    public C2667o(Context context, InterfaceC2343e interfaceC2343e, long j, InterfaceC2215o<C2219s> interfaceC2215o, boolean z, Handler handler, InterfaceC2672t interfaceC2672t, int i) {
        super(2, interfaceC2343e, interfaceC2215o, z, 30.0f);
        this.f11087na = j;
        this.f11088oa = i;
        this.f11084ka = context.getApplicationContext();
        this.f11085la = new C2669q(this.f11084ka);
        this.f11086ma = new InterfaceC2672t.a(handler, interfaceC2672t);
        this.f11089pa = m11278G();
        this.f11090qa = new long[10];
        this.f11091ra = new long[10];
        this.f11081Ta = -9223372036854775807L;
        this.f11080Sa = -9223372036854775807L;
        this.f11099za = -9223372036854775807L;
        this.f11069Ha = -1;
        this.f11070Ia = -1;
        this.f11072Ka = -1.0f;
        this.f11068Ga = -1.0f;
        this.f11096wa = 1;
        m11277F();
    }

    /* renamed from: E */
    private void m11276E() {
        MediaCodec m9762w;
        this.f11097xa = false;
        if (C2622I.f10916a < 23 || !this.f11077Pa || (m9762w = m9762w()) == null) {
            return;
        }
        this.f11079Ra = new b(m9762w);
    }

    /* renamed from: F */
    private void m11277F() {
        this.f11073La = -1;
        this.f11074Ma = -1;
        this.f11076Oa = -1.0f;
        this.f11075Na = -1;
    }

    /* renamed from: G */
    private static boolean m11278G() {
        return "NVIDIA".equals(C2622I.f10918c);
    }

    /* renamed from: H */
    private void m11279H() {
        if (this.f11063Ba > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f11086ma.m11328a(this.f11063Ba, elapsedRealtime - this.f11062Aa);
            this.f11063Ba = 0;
            this.f11062Aa = elapsedRealtime;
        }
    }

    /* renamed from: I */
    private void m11280I() {
        if (this.f11069Ha == -1 && this.f11070Ia == -1) {
            return;
        }
        if (this.f11073La == this.f11069Ha && this.f11074Ma == this.f11070Ia && this.f11075Na == this.f11071Ja && this.f11076Oa == this.f11072Ka) {
            return;
        }
        this.f11086ma.m11333b(this.f11069Ha, this.f11070Ia, this.f11071Ja, this.f11072Ka);
        this.f11073La = this.f11069Ha;
        this.f11074Ma = this.f11070Ia;
        this.f11075Na = this.f11071Ja;
        this.f11076Oa = this.f11072Ka;
    }

    /* renamed from: J */
    private void m11281J() {
        if (this.f11097xa) {
            this.f11086ma.m11335b(this.f11094ua);
        }
    }

    /* renamed from: K */
    private void m11282K() {
        if (this.f11073La == -1 && this.f11074Ma == -1) {
            return;
        }
        this.f11086ma.m11333b(this.f11073La, this.f11074Ma, this.f11075Na, this.f11076Oa);
    }

    /* renamed from: L */
    private void m11283L() {
        this.f11099za = this.f11087na > 0 ? SystemClock.elapsedRealtime() + this.f11087na : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m11284a(C2339a c2339a, String str, int i, int i2) {
        char c2;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 == 2) {
                if ("BRAVIA 4K 2015".equals(C2622I.f10919d) || ("Amazon".equals(C2622I.f10918c) && ("KFSOWI".equals(C2622I.f10919d) || ("AFTS".equals(C2622I.f10919d) && c2339a.f9194f)))) {
                    return -1;
                }
                i3 = C2622I.m11037a(i, 16) * C2622I.m11037a(i2, 16) * 16 * 16;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            }
            if (c2 != 3) {
                if (c2 != 4 && c2 != 5) {
                    return -1;
                }
                i3 = i * i2;
                return (i3 * 3) / (i4 * 2);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    /* renamed from: a */
    private static Point m11285a(C2339a c2339a, C2676s c2676s) {
        boolean z = c2676s.f11188m > c2676s.f11187l;
        int i = z ? c2676s.f11188m : c2676s.f11187l;
        int i2 = z ? c2676s.f11187l : c2676s.f11188m;
        float f = i2 / i;
        for (int i3 : f11059ha) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (C2622I.f10916a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point m9719a = c2339a.m9719a(i5, i3);
                if (c2339a.m9721a(m9719a.x, m9719a.y, c2676s.f11189n)) {
                    return m9719a;
                }
            } else {
                int m11037a = C2622I.m11037a(i3, 16) * 16;
                int m11037a2 = C2622I.m11037a(i4, 16) * 16;
                if (m11037a * m11037a2 <= C2345g.m9780b()) {
                    int i6 = z ? m11037a2 : m11037a;
                    if (z) {
                        m11037a2 = m11037a;
                    }
                    return new Point(i6, m11037a2);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m11286a(long j, long j2, C2676s c2676s) {
        InterfaceC2668p interfaceC2668p = this.f11083Va;
        if (interfaceC2668p != null) {
            interfaceC2668p.m11309a(j, j2, c2676s);
        }
    }

    /* renamed from: a */
    private void m11287a(MediaCodec mediaCodec, int i, int i2) {
        this.f11069Ha = i;
        this.f11070Ia = i2;
        this.f11072Ka = this.f11068Ga;
        if (C2622I.f10916a >= 21) {
            int i3 = this.f11067Fa;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f11069Ha;
                this.f11069Ha = this.f11070Ia;
                this.f11070Ia = i4;
                this.f11072Ka = 1.0f / this.f11072Ka;
            }
        } else {
            this.f11071Ja = this.f11067Fa;
        }
        mediaCodec.setVideoScalingMode(this.f11096wa);
    }

    @TargetApi(23)
    /* renamed from: a */
    private static void m11288a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m11289a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: a */
    private void m11290a(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f11095va;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C2339a m9763x = m9763x();
                if (m9763x != null && m11292b(m9763x)) {
                    this.f11095va = C2664l.m11267a(this.f11084ka, m9763x.f9194f);
                    surface = this.f11095va;
                }
            }
        }
        if (this.f11094ua == surface) {
            if (surface == null || surface == this.f11095va) {
                return;
            }
            m11282K();
            m11281J();
            return;
        }
        this.f11094ua = surface;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec m9762w = m9762w();
            if (C2622I.f10916a < 23 || m9762w == null || surface == null || this.f11093ta) {
                mo9758B();
                m9757A();
            } else {
                m11288a(m9762w, surface);
            }
        }
        if (surface == null || surface == this.f11095va) {
            m11277F();
            m11276E();
            return;
        }
        m11282K();
        m11276E();
        if (state == 2) {
            m11283L();
        }
    }

    /* renamed from: b */
    private static int m11291b(C2339a c2339a, C2676s c2676s) {
        if (c2676s.f11183h == -1) {
            return m11284a(c2339a, c2676s.f11182g, c2676s.f11187l, c2676s.f11188m);
        }
        int size = c2676s.f11184i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += c2676s.f11184i.get(i2).length;
        }
        return c2676s.f11183h + i;
    }

    /* renamed from: b */
    private boolean m11292b(C2339a c2339a) {
        return C2622I.f10916a >= 23 && !this.f11077Pa && !m11301a(c2339a.f9189a) && (!c2339a.f9194f || C2664l.m11269a(this.f11084ka));
    }

    /* renamed from: f */
    private static boolean m11293f(long j) {
        return j < -30000;
    }

    /* renamed from: g */
    private static boolean m11294g(long j) {
        return j < -500000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: B */
    public void mo9758B() {
        try {
            super.mo9758B();
        } finally {
            this.f11065Da = 0;
            Surface surface = this.f11095va;
            if (surface != null) {
                if (this.f11094ua == surface) {
                    this.f11094ua = null;
                }
                this.f11095va.release();
                this.f11095va = null;
            }
        }
    }

    /* renamed from: D */
    void m11295D() {
        if (this.f11097xa) {
            return;
        }
        this.f11097xa = true;
        this.f11086ma.m11335b(this.f11094ua);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected float mo8769a(float f, C2676s c2676s, C2676s[] c2676sArr) {
        float f2 = -1.0f;
        for (C2676s c2676s2 : c2676sArr) {
            float f3 = c2676s2.f11189n;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected int mo8770a(MediaCodec mediaCodec, C2339a c2339a, C2676s c2676s, C2676s c2676s2) {
        if (!c2339a.m9723a(c2676s, c2676s2, true)) {
            return 0;
        }
        int i = c2676s2.f11187l;
        a aVar = this.f11092sa;
        if (i > aVar.f11100a || c2676s2.f11188m > aVar.f11101b || m11291b(c2339a, c2676s2) > this.f11092sa.f11102c) {
            return 0;
        }
        return c2676s.m11444b(c2676s2) ? 1 : 3;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected int mo8772a(InterfaceC2343e interfaceC2343e, InterfaceC2215o<C2219s> interfaceC2215o, C2676s c2676s) {
        boolean z;
        if (!C2641r.m11174i(c2676s.f11182g)) {
            return 0;
        }
        C2213m c2213m = c2676s.f11185j;
        if (c2213m != null) {
            z = false;
            for (int i = 0; i < c2213m.f8109d; i++) {
                z |= c2213m.m9091a(i).f8115f;
            }
        } else {
            z = false;
        }
        List<C2339a> mo9771a = interfaceC2343e.mo9771a(c2676s.f11182g, z);
        if (mo9771a.isEmpty()) {
            return (!z || interfaceC2343e.mo9771a(c2676s.f11182g, false).isEmpty()) ? 1 : 2;
        }
        if (!AbstractC2190c.m8999a(interfaceC2215o, c2213m)) {
            return 2;
        }
        C2339a c2339a = mo9771a.get(0);
        return (c2339a.m9722a(c2676s) ? 4 : 3) | (c2339a.m9727b(c2676s) ? 16 : 8) | (c2339a.f9193e ? 32 : 0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    protected MediaFormat m11296a(C2676s c2676s, a aVar, float f, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c2676s.f11182g);
        mediaFormat.setInteger("width", c2676s.f11187l);
        mediaFormat.setInteger("height", c2676s.f11188m);
        C2346h.m9796a(mediaFormat, c2676s.f11184i);
        C2346h.m9793a(mediaFormat, "frame-rate", c2676s.f11189n);
        C2346h.m9794a(mediaFormat, "rotation-degrees", c2676s.f11190o);
        C2346h.m9792a(mediaFormat, c2676s.f11194s);
        mediaFormat.setInteger("max-width", aVar.f11100a);
        mediaFormat.setInteger("max-height", aVar.f11101b);
        C2346h.m9794a(mediaFormat, "max-input-size", aVar.f11102c);
        if (C2622I.f10916a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m11289a(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* renamed from: a */
    protected a m11297a(C2339a c2339a, C2676s c2676s, C2676s[] c2676sArr) {
        int m11284a;
        int i = c2676s.f11187l;
        int i2 = c2676s.f11188m;
        int m11291b = m11291b(c2339a, c2676s);
        if (c2676sArr.length == 1) {
            if (m11291b != -1 && (m11284a = m11284a(c2339a, c2676s.f11182g, c2676s.f11187l, c2676s.f11188m)) != -1) {
                m11291b = Math.min((int) (m11291b * 1.5f), m11284a);
            }
            return new a(i, i2, m11291b);
        }
        int i3 = i2;
        int i4 = m11291b;
        boolean z = false;
        int i5 = i;
        for (C2676s c2676s2 : c2676sArr) {
            if (c2339a.m9723a(c2676s, c2676s2, false)) {
                z |= c2676s2.f11187l == -1 || c2676s2.f11188m == -1;
                i5 = Math.max(i5, c2676s2.f11187l);
                i3 = Math.max(i3, c2676s2.f11188m);
                i4 = Math.max(i4, m11291b(c2339a, c2676s2));
            }
        }
        if (z) {
            C2638o.m11160d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i5 + "x" + i3);
            Point m11285a = m11285a(c2339a, c2676s);
            if (m11285a != null) {
                i5 = Math.max(i5, m11285a.x);
                i3 = Math.max(i3, m11285a.y);
                i4 = Math.max(i4, m11284a(c2339a, c2676s.f11182g, i5, i3));
                C2638o.m11160d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i5 + "x" + i3);
            }
        }
        return new a(i5, i3, i4);
    }

    /* renamed from: a */
    protected void m11298a(int i) {
        C2195e c2195e = this.f9230ga;
        c2195e.f8036g += i;
        this.f11063Ba += i;
        this.f11064Ca += i;
        c2195e.f8037h = Math.max(this.f11064Ca, c2195e.f8037h);
        int i2 = this.f11088oa;
        if (i2 <= 0 || this.f11063Ba < i2) {
            return;
        }
        m11279H();
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c, p139d.p225c.p226a.p227a.C2141F.b
    /* renamed from: a */
    public void mo8558a(int i, Object obj) {
        if (i == 1) {
            m11290a((Surface) obj);
            return;
        }
        if (i != 4) {
            if (i == 6) {
                this.f11083Va = (InterfaceC2668p) obj;
                return;
            } else {
                super.mo8558a(i, obj);
                return;
            }
        }
        this.f11096wa = ((Integer) obj).intValue();
        MediaCodec m9762w = m9762w();
        if (m9762w != null) {
            m9762w.setVideoScalingMode(this.f11096wa);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8779a(long j, boolean z) {
        super.mo8779a(j, z);
        m11276E();
        this.f11098ya = -9223372036854775807L;
        this.f11064Ca = 0;
        this.f11080Sa = -9223372036854775807L;
        int i = this.f11082Ua;
        if (i != 0) {
            this.f11081Ta = this.f11090qa[i - 1];
            this.f11082Ua = 0;
        }
        if (z) {
            m11283L();
        } else {
            this.f11099za = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    protected void m11299a(MediaCodec mediaCodec, int i, long j) {
        C2620G.m11028a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2620G.m11027a();
        m11298a(1);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8780a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        m11287a(mediaCodec, z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width"), z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height"));
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8781a(C2196f c2196f) {
        this.f11065Da++;
        this.f11080Sa = Math.max(c2196f.f8041d, this.f11080Sa);
        if (C2622I.f10916a >= 23 || !this.f11077Pa) {
            return;
        }
        m11308e(c2196f.f8041d);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8782a(C2339a c2339a, MediaCodec mediaCodec, C2676s c2676s, MediaCrypto mediaCrypto, float f) {
        this.f11092sa = m11297a(c2339a, c2676s, m9004q());
        MediaFormat m11296a = m11296a(c2676s, this.f11092sa, f, this.f11089pa, this.f11078Qa);
        if (this.f11094ua == null) {
            C2628e.m11113b(m11292b(c2339a));
            if (this.f11095va == null) {
                this.f11095va = C2664l.m11267a(this.f11084ka, c2339a.f9194f);
            }
            this.f11094ua = this.f11095va;
        }
        mediaCodec.configure(m11296a, this.f11094ua, mediaCrypto, 0);
        if (C2622I.f10916a < 23 || !this.f11077Pa) {
            return;
        }
        this.f11079Ra = new b(mediaCodec);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8783a(String str, long j, long j2) {
        this.f11086ma.m11332a(str, j, j2);
        this.f11093ta = m11301a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8784a(boolean z) {
        super.mo8784a(z);
        this.f11078Qa = m9002o().f7660b;
        this.f11077Pa = this.f11078Qa != 0;
        this.f11086ma.m11336b(this.f9230ga);
        this.f11085la.m11317b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8785a(C2676s[] c2676sArr, long j) {
        if (this.f11081Ta == -9223372036854775807L) {
            this.f11081Ta = j;
        } else {
            int i = this.f11082Ua;
            if (i == this.f11090qa.length) {
                C2638o.m11160d("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.f11090qa[this.f11082Ua - 1]);
            } else {
                this.f11082Ua = i + 1;
            }
            long[] jArr = this.f11090qa;
            int i2 = this.f11082Ua;
            jArr[i2 - 1] = j;
            this.f11091ra[i2 - 1] = this.f11080Sa;
        }
        super.mo8785a(c2676sArr, j);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected boolean mo8787a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, C2676s c2676s) {
        if (this.f11098ya == -9223372036854775807L) {
            this.f11098ya = j;
        }
        long j4 = j3 - this.f11081Ta;
        if (z) {
            m11305c(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.f11094ua == this.f11095va) {
            if (!m11293f(j5)) {
                return false;
            }
            m11305c(mediaCodec, i, j4);
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z2 = getState() == 2;
        if (!this.f11097xa || (z2 && m11307d(j5, elapsedRealtime - this.f11066Ea))) {
            long nanoTime = System.nanoTime();
            m11286a(j4, nanoTime, c2676s);
            if (C2622I.f10916a >= 21) {
                m11303b(mediaCodec, i, j4, nanoTime);
                return true;
            }
            m11302b(mediaCodec, i, j4);
            return true;
        }
        if (z2 && j != this.f11098ya) {
            long nanoTime2 = System.nanoTime();
            long m11315a = this.f11085la.m11315a(j3, ((j5 - (elapsedRealtime - j2)) * 1000) + nanoTime2);
            long j6 = (m11315a - nanoTime2) / 1000;
            if (m11304b(j6, j2) && m11300a(mediaCodec, i, j4, j)) {
                return false;
            }
            if (m11306c(j6, j2)) {
                m11299a(mediaCodec, i, j4);
                return true;
            }
            if (C2622I.f10916a >= 21) {
                if (j6 < 50000) {
                    m11286a(j4, m11315a, c2676s);
                    m11303b(mediaCodec, i, j4, m11315a);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                m11286a(j4, m11315a, c2676s);
                m11302b(mediaCodec, i, j4);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected boolean m11300a(MediaCodec mediaCodec, int i, long j, long j2) {
        int m9001b = m9001b(j2);
        if (m9001b == 0) {
            return false;
        }
        this.f9230ga.f8038i++;
        m11298a(this.f11065Da + m9001b);
        mo9761v();
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected boolean mo9759a(C2339a c2339a) {
        return this.f11094ua != null || m11292b(c2339a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0619, code lost:            if (r0 != 1) goto L407;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0619  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean m11301a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p271o.C2667o.m11301a(java.lang.String):boolean");
    }

    /* renamed from: b */
    protected void m11302b(MediaCodec mediaCodec, int i, long j) {
        m11280I();
        C2620G.m11028a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2620G.m11027a();
        this.f11066Ea = SystemClock.elapsedRealtime() * 1000;
        this.f9230ga.f8034e++;
        this.f11064Ca = 0;
        m11295D();
    }

    @TargetApi(21)
    /* renamed from: b */
    protected void m11303b(MediaCodec mediaCodec, int i, long j, long j2) {
        m11280I();
        C2620G.m11028a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C2620G.m11027a();
        this.f11066Ea = SystemClock.elapsedRealtime() * 1000;
        this.f9230ga.f8034e++;
        this.f11064Ca = 0;
        m11295D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: b */
    public void mo8789b(C2676s c2676s) {
        super.mo8789b(c2676s);
        this.f11086ma.m11331a(c2676s);
        this.f11068Ga = c2676s.f11191p;
        this.f11067Fa = c2676s.f11190o;
    }

    /* renamed from: b */
    protected boolean m11304b(long j, long j2) {
        return m11294g(j);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: c */
    protected void mo8790c(long j) {
        this.f11065Da--;
        while (true) {
            int i = this.f11082Ua;
            if (i == 0 || j < this.f11091ra[0]) {
                return;
            }
            long[] jArr = this.f11090qa;
            this.f11081Ta = jArr[0];
            this.f11082Ua = i - 1;
            System.arraycopy(jArr, 1, jArr, 0, this.f11082Ua);
            long[] jArr2 = this.f11091ra;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f11082Ua);
        }
    }

    /* renamed from: c */
    protected void m11305c(MediaCodec mediaCodec, int i, long j) {
        C2620G.m11028a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2620G.m11027a();
        this.f9230ga.f8035f++;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: c */
    public boolean mo8565c() {
        Surface surface;
        if (super.mo8565c() && (this.f11097xa || (((surface = this.f11095va) != null && this.f11094ua == surface) || m9762w() == null || this.f11077Pa))) {
            this.f11099za = -9223372036854775807L;
            return true;
        }
        if (this.f11099za == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f11099za) {
            return true;
        }
        this.f11099za = -9223372036854775807L;
        return false;
    }

    /* renamed from: c */
    protected boolean m11306c(long j, long j2) {
        return m11293f(j);
    }

    /* renamed from: d */
    protected boolean m11307d(long j, long j2) {
        return m11293f(j) && j2 > 100000;
    }

    /* renamed from: e */
    protected void m11308e(long j) {
        C2676s m9760d = m9760d(j);
        if (m9760d != null) {
            m11287a(m9762w(), m9760d.f11187l, m9760d.f11188m);
        }
        m11280I();
        m11295D();
        mo8790c(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: s */
    public void mo8791s() {
        this.f11069Ha = -1;
        this.f11070Ia = -1;
        this.f11072Ka = -1.0f;
        this.f11068Ga = -1.0f;
        this.f11081Ta = -9223372036854775807L;
        this.f11080Sa = -9223372036854775807L;
        this.f11082Ua = 0;
        m11277F();
        m11276E();
        this.f11085la.m11316a();
        this.f11079Ra = null;
        this.f11077Pa = false;
        try {
            super.mo8791s();
        } finally {
            this.f9230ga.m9024a();
            this.f11086ma.m11330a(this.f9230ga);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: t */
    public void mo8792t() {
        super.mo8792t();
        this.f11063Ba = 0;
        this.f11062Aa = SystemClock.elapsedRealtime();
        this.f11066Ea = SystemClock.elapsedRealtime() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: u */
    public void mo8793u() {
        this.f11099za = -9223372036854775807L;
        m11279H();
        super.mo8793u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: v */
    public void mo9761v() {
        super.mo9761v();
        this.f11065Da = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: y */
    protected boolean mo9764y() {
        return this.f11077Pa;
    }
}
