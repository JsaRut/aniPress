package p139d.p225c.p226a.p227a.p229b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.AbstractC2190c;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2179p;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2180q;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p231d.C2219s;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p244g.AbstractC2340b;
import p139d.p225c.p226a.p227a.p244g.C2339a;
import p139d.p225c.p226a.p227a.p244g.C2346h;
import p139d.p225c.p226a.p227a.p244g.InterfaceC2343e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2640q;

@TargetApi(16)
/* renamed from: d.c.a.a.b.B */
/* loaded from: classes.dex */
public class C2157B extends AbstractC2340b implements InterfaceC2640q {

    /* renamed from: ha */
    private final Context f7741ha;

    /* renamed from: ia */
    private final InterfaceC2179p.a f7742ia;

    /* renamed from: ja */
    private final InterfaceC2180q f7743ja;

    /* renamed from: ka */
    private final long[] f7744ka;

    /* renamed from: la */
    private int f7745la;

    /* renamed from: ma */
    private boolean f7746ma;

    /* renamed from: na */
    private boolean f7747na;

    /* renamed from: oa */
    private boolean f7748oa;

    /* renamed from: pa */
    private MediaFormat f7749pa;

    /* renamed from: qa */
    private int f7750qa;

    /* renamed from: ra */
    private int f7751ra;

    /* renamed from: sa */
    private int f7752sa;

    /* renamed from: ta */
    private int f7753ta;

    /* renamed from: ua */
    private long f7754ua;

    /* renamed from: va */
    private boolean f7755va;

    /* renamed from: wa */
    private boolean f7756wa;

    /* renamed from: xa */
    private long f7757xa;

    /* renamed from: ya */
    private int f7758ya;

    /* renamed from: d.c.a.a.b.B$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC2180q.c {
        private a() {
        }

        /* synthetic */ a(C2157B c2157b, C2156A c2156a) {
            this();
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.c
        /* renamed from: a */
        public void mo8794a() {
            C2157B.this.m8768D();
            C2157B.this.f7756wa = true;
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.c
        /* renamed from: a */
        public void mo8795a(int i, long j, long j2) {
            C2157B.this.f7742ia.m8885a(i, j, j2);
            C2157B.this.m8778a(i, j, j2);
        }

        @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.c
        /* renamed from: c */
        public void mo8796c(int i) {
            C2157B.this.f7742ia.m8884a(i);
            C2157B.this.m8777a(i);
        }
    }

    public C2157B(Context context, InterfaceC2343e interfaceC2343e, InterfaceC2215o<C2219s> interfaceC2215o, boolean z, Handler handler, InterfaceC2179p interfaceC2179p, C2174k c2174k, InterfaceC2178o... interfaceC2178oArr) {
        this(context, interfaceC2343e, interfaceC2215o, z, handler, interfaceC2179p, new C2187x(c2174k, interfaceC2178oArr));
    }

    public C2157B(Context context, InterfaceC2343e interfaceC2343e, InterfaceC2215o<C2219s> interfaceC2215o, boolean z, Handler handler, InterfaceC2179p interfaceC2179p, InterfaceC2180q interfaceC2180q) {
        super(1, interfaceC2343e, interfaceC2215o, z, 44100.0f);
        this.f7741ha = context.getApplicationContext();
        this.f7743ja = interfaceC2180q;
        this.f7757xa = -9223372036854775807L;
        this.f7744ka = new long[10];
        this.f7742ia = new InterfaceC2179p.a(handler, interfaceC2179p);
        interfaceC2180q.mo8903a(new a());
    }

    /* renamed from: E */
    private void m8761E() {
        long mo8896a = this.f7743ja.mo8896a(mo8566d());
        if (mo8896a != Long.MIN_VALUE) {
            if (!this.f7756wa) {
                mo8896a = Math.max(this.f7754ua, mo8896a);
            }
            this.f7754ua = mo8896a;
            this.f7756wa = false;
        }
    }

    /* renamed from: a */
    private int m8762a(C2339a c2339a, C2676s c2676s) {
        PackageManager packageManager;
        if (C2622I.f10916a < 24 && "OMX.google.raw.decoder".equals(c2339a.f9189a)) {
            boolean z = true;
            if (C2622I.f10916a == 23 && (packageManager = this.f7741ha.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return c2676s.f11183h;
    }

    /* renamed from: f */
    private static boolean m8765f(String str) {
        return C2622I.f10916a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C2622I.f10918c) && (C2622I.f10917b.startsWith("zeroflte") || C2622I.f10917b.startsWith("herolte") || C2622I.f10917b.startsWith("heroqlte"));
    }

    /* renamed from: g */
    private static boolean m8766g(String str) {
        return C2622I.f10916a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C2622I.f10918c) && (C2622I.f10917b.startsWith("baffin") || C2622I.f10917b.startsWith("grand") || C2622I.f10917b.startsWith("fortuna") || C2622I.f10917b.startsWith("gprimelte") || C2622I.f10917b.startsWith("j2y18lte") || C2622I.f10917b.startsWith("ms01"));
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: C */
    protected void mo8767C() {
        try {
            this.f7743ja.mo8908c();
        } catch (InterfaceC2180q.d e2) {
            throw C2399j.m9870a(e2, m9003p());
        }
    }

    /* renamed from: D */
    protected void m8768D() {
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected float mo8769a(float f, C2676s c2676s, C2676s[] c2676sArr) {
        int i = -1;
        for (C2676s c2676s2 : c2676sArr) {
            int i2 = c2676s2.f11196u;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected int mo8770a(MediaCodec mediaCodec, C2339a c2339a, C2676s c2676s, C2676s c2676s2) {
        return (m8762a(c2339a, c2676s2) <= this.f7745la && c2339a.m9723a(c2676s, c2676s2, true) && c2676s.f11198w == 0 && c2676s.f11199x == 0 && c2676s2.f11198w == 0 && c2676s2.f11199x == 0) ? 1 : 0;
    }

    /* renamed from: a */
    protected int m8771a(C2339a c2339a, C2676s c2676s, C2676s[] c2676sArr) {
        int m8762a = m8762a(c2339a, c2676s);
        if (c2676sArr.length == 1) {
            return m8762a;
        }
        int i = m8762a;
        for (C2676s c2676s2 : c2676sArr) {
            if (c2339a.m9723a(c2676s, c2676s2, false)) {
                i = Math.max(i, m8762a(c2339a, c2676s2));
            }
        }
        return i;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected int mo8772a(InterfaceC2343e interfaceC2343e, InterfaceC2215o<C2219s> interfaceC2215o, C2676s c2676s) {
        boolean z;
        String str = c2676s.f11182g;
        if (!C2641r.m11172g(str)) {
            return 0;
        }
        int i = C2622I.f10916a >= 21 ? 32 : 0;
        boolean m8999a = AbstractC2190c.m8999a(interfaceC2215o, c2676s.f11185j);
        int i2 = 8;
        if (m8999a && m8786a(c2676s.f11195t, str) && interfaceC2343e.mo9770a() != null) {
            return i | 8 | 4;
        }
        if (("audio/raw".equals(str) && !this.f7743ja.mo8905a(c2676s.f11195t, c2676s.f11197v)) || !this.f7743ja.mo8905a(c2676s.f11195t, 2)) {
            return 1;
        }
        C2213m c2213m = c2676s.f11185j;
        if (c2213m != null) {
            z = false;
            for (int i3 = 0; i3 < c2213m.f8109d; i3++) {
                z |= c2213m.m9091a(i3).f8115f;
            }
        } else {
            z = false;
        }
        List<C2339a> mo9771a = interfaceC2343e.mo9771a(c2676s.f11182g, z);
        if (mo9771a.isEmpty()) {
            return (!z || interfaceC2343e.mo9771a(c2676s.f11182g, false).isEmpty()) ? 1 : 2;
        }
        if (!m8999a) {
            return 2;
        }
        C2339a c2339a = mo9771a.get(0);
        boolean m9722a = c2339a.m9722a(c2676s);
        if (m9722a && c2339a.m9727b(c2676s)) {
            i2 = 16;
        }
        return i2 | i | (m9722a ? 4 : 3);
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: a */
    public long mo8773a() {
        if (getState() == 2) {
            m8761E();
        }
        return this.f7754ua;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    protected MediaFormat m8774a(C2676s c2676s, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c2676s.f11195t);
        mediaFormat.setInteger("sample-rate", c2676s.f11196u);
        C2346h.m9796a(mediaFormat, c2676s.f11184i);
        C2346h.m9794a(mediaFormat, "max-input-size", i);
        if (C2622I.f10916a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        return mediaFormat;
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: a */
    public C2137B mo8775a(C2137B c2137b) {
        return this.f7743ja.mo8897a(c2137b);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    public List<C2339a> mo8776a(InterfaceC2343e interfaceC2343e, C2676s c2676s, boolean z) {
        C2339a mo9770a;
        return (!m8786a(c2676s.f11195t, c2676s.f11182g) || (mo9770a = interfaceC2343e.mo9770a()) == null) ? super.mo8776a(interfaceC2343e, c2676s, z) : Collections.singletonList(mo9770a);
    }

    /* renamed from: a */
    protected void m8777a(int i) {
    }

    /* renamed from: a */
    protected void m8778a(int i, long j, long j2) {
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c, p139d.p225c.p226a.p227a.C2141F.b
    /* renamed from: a */
    public void mo8558a(int i, Object obj) {
        if (i == 2) {
            this.f7743ja.mo8899a(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.f7743ja.mo8902a((C2173j) obj);
        } else if (i != 5) {
            super.mo8558a(i, obj);
        } else {
            this.f7743ja.mo8904a((C2183t) obj);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8779a(long j, boolean z) {
        super.mo8779a(j, z);
        this.f7743ja.reset();
        this.f7754ua = j;
        this.f7755va = true;
        this.f7756wa = true;
        this.f7757xa = -9223372036854775807L;
        this.f7758ya = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8780a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.f7749pa;
        if (mediaFormat2 != null) {
            i = C2641r.m11167b(mediaFormat2.getString("mime"));
            mediaFormat = this.f7749pa;
        } else {
            i = this.f7750qa;
        }
        int i3 = i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f7747na && integer == 6 && (i2 = this.f7751ra) < 6) {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.f7751ra; i4++) {
                iArr[i4] = i4;
            }
        } else {
            iArr = null;
        }
        try {
            this.f7743ja.mo8901a(i3, integer, integer2, 0, iArr, this.f7752sa, this.f7753ta);
        } catch (InterfaceC2180q.a e2) {
            throw C2399j.m9870a(e2, m9003p());
        }
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8781a(C2196f c2196f) {
        if (this.f7755va && !c2196f.m9009c()) {
            if (Math.abs(c2196f.f8041d - this.f7754ua) > 500000) {
                this.f7754ua = c2196f.f8041d;
            }
            this.f7755va = false;
        }
        this.f7757xa = Math.max(c2196f.f8041d, this.f7757xa);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8782a(C2339a c2339a, MediaCodec mediaCodec, C2676s c2676s, MediaCrypto mediaCrypto, float f) {
        this.f7745la = m8771a(c2339a, c2676s, m9004q());
        this.f7747na = m8765f(c2339a.f9189a);
        this.f7748oa = m8766g(c2339a.f9189a);
        this.f7746ma = c2339a.f9195g;
        String str = c2339a.f9190b;
        if (str == null) {
            str = "audio/raw";
        }
        MediaFormat m8774a = m8774a(c2676s, str, this.f7745la, f);
        mediaCodec.configure(m8774a, (Surface) null, mediaCrypto, 0);
        if (!this.f7746ma) {
            this.f7749pa = null;
        } else {
            this.f7749pa = m8774a;
            this.f7749pa.setString("mime", c2676s.f11182g);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    protected void mo8783a(String str, long j, long j2) {
        this.f7742ia.m8888a(str, j, j2);
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8784a(boolean z) {
        super.mo8784a(z);
        this.f7742ia.m8891b(this.f9230ga);
        int i = m9002o().f7660b;
        if (i != 0) {
            this.f7743ja.mo8900a(i);
        } else {
            this.f7743ja.mo8911f();
        }
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8785a(C2676s[] c2676sArr, long j) {
        super.mo8785a(c2676sArr, j);
        if (this.f7757xa != -9223372036854775807L) {
            int i = this.f7758ya;
            if (i == this.f7744ka.length) {
                C2638o.m11160d("MediaCodecAudioRenderer", "Too many stream changes, so dropping change at " + this.f7744ka[this.f7758ya - 1]);
            } else {
                this.f7758ya = i + 1;
            }
            this.f7744ka[this.f7758ya - 1] = this.f7757xa;
        }
    }

    /* renamed from: a */
    protected boolean m8786a(int i, String str) {
        return this.f7743ja.mo8905a(i, C2641r.m11167b(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:            if (r1 != (-9223372036854775807L)) goto L78;     */
    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean mo8787a(long r1, long r3, android.media.MediaCodec r5, java.nio.ByteBuffer r6, int r7, int r8, long r9, boolean r11, p139d.p225c.p226a.p227a.C2676s r12) {
        /*
            r0 = this;
            boolean r1 = r0.f7748oa
            if (r1 == 0) goto L1a
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L1a
            r1 = r8 & 4
            if (r1 == 0) goto L1a
            long r1 = r0.f7757xa
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r9
        L1b:
            boolean r3 = r0.f7746ma
            r4 = 0
            r9 = 1
            if (r3 == 0) goto L29
            r3 = r8 & 2
            if (r3 == 0) goto L29
            r5.releaseOutputBuffer(r7, r4)
            return r9
        L29:
            if (r11 == 0) goto L3b
            r5.releaseOutputBuffer(r7, r4)
            d.c.a.a.c.e r1 = r0.f9230ga
            int r2 = r1.f8035f
            int r2 = r2 + r9
            r1.f8035f = r2
            d.c.a.a.b.q r1 = r0.f7743ja
            r1.mo8912g()
            return r9
        L3b:
            d.c.a.a.b.q r3 = r0.f7743ja     // Catch: p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.d -> L4f p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.b -> L51
            boolean r1 = r3.mo8906a(r6, r1)     // Catch: p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.d -> L4f p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.b -> L51
            if (r1 == 0) goto L4e
            r5.releaseOutputBuffer(r7, r4)     // Catch: p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.d -> L4f p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.b -> L51
            d.c.a.a.c.e r1 = r0.f9230ga     // Catch: p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.d -> L4f p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.b -> L51
            int r2 = r1.f8034e     // Catch: p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.d -> L4f p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.b -> L51
            int r2 = r2 + r9
            r1.f8034e = r2     // Catch: p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.d -> L4f p139d.p225c.p226a.p227a.p229b.InterfaceC2180q.b -> L51
            return r9
        L4e:
            return r4
        L4f:
            r1 = move-exception
            goto L52
        L51:
            r1 = move-exception
        L52:
            int r2 = r0.m9003p()
            d.c.a.a.j r1 = p139d.p225c.p226a.p227a.C2399j.m9870a(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p229b.C2157B.mo8787a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, d.c.a.a.s):boolean");
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: b */
    public C2137B mo8788b() {
        return this.f7743ja.mo8907b();
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: b */
    public void mo8789b(C2676s c2676s) {
        super.mo8789b(c2676s);
        this.f7742ia.m8887a(c2676s);
        this.f7750qa = "audio/raw".equals(c2676s.f11182g) ? c2676s.f11197v : 2;
        this.f7751ra = c2676s.f11195t;
        this.f7752sa = c2676s.f11198w;
        this.f7753ta = c2676s.f11199x;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b
    /* renamed from: c */
    protected void mo8790c(long j) {
        while (this.f7758ya != 0 && j >= this.f7744ka[0]) {
            this.f7743ja.mo8912g();
            this.f7758ya--;
            long[] jArr = this.f7744ka;
            System.arraycopy(jArr, 1, jArr, 0, this.f7758ya);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: c */
    public boolean mo8565c() {
        return this.f7743ja.mo8910e() || super.mo8565c();
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: d */
    public boolean mo8566d() {
        return super.mo8566d() && this.f7743ja.mo8909d();
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c, p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: m */
    public InterfaceC2640q mo8575m() {
        return this;
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: s */
    public void mo8791s() {
        try {
            this.f7757xa = -9223372036854775807L;
            this.f7758ya = 0;
            this.f7743ja.mo8898a();
            try {
                super.mo8791s();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo8791s();
                throw th;
            } finally {
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: t */
    public void mo8792t() {
        super.mo8792t();
        this.f7743ja.mo8913h();
    }

    @Override // p139d.p225c.p226a.p227a.p244g.AbstractC2340b, p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: u */
    public void mo8793u() {
        m8761E();
        this.f7743ja.pause();
        super.mo8793u();
    }
}
