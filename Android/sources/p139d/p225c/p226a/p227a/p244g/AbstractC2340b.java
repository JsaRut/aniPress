package p139d.p225c.p226a.p227a.p244g;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p139d.p225c.p226a.p227a.AbstractC2190c;
import p139d.p225c.p226a.p227a.C2399j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2195e;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p231d.C2219s;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2214n;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p244g.C2345g;
import p139d.p225c.p226a.p227a.p270n.C2618E;
import p139d.p225c.p226a.p227a.p270n.C2620G;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2642s;

@TargetApi(16)
/* renamed from: d.c.a.a.g.b */
/* loaded from: classes.dex */
public abstract class AbstractC2340b extends AbstractC2190c {

    /* renamed from: j */
    private static final byte[] f9197j = C2622I.m11068a("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private float f9198A;

    /* renamed from: B */
    private float f9199B;

    /* renamed from: C */
    private boolean f9200C;

    /* renamed from: D */
    private ArrayDeque<C2339a> f9201D;

    /* renamed from: E */
    private a f9202E;

    /* renamed from: F */
    private C2339a f9203F;

    /* renamed from: G */
    private int f9204G;

    /* renamed from: H */
    private boolean f9205H;

    /* renamed from: I */
    private boolean f9206I;

    /* renamed from: J */
    private boolean f9207J;

    /* renamed from: K */
    private boolean f9208K;

    /* renamed from: L */
    private boolean f9209L;

    /* renamed from: M */
    private boolean f9210M;

    /* renamed from: N */
    private boolean f9211N;

    /* renamed from: O */
    private boolean f9212O;

    /* renamed from: P */
    private boolean f9213P;

    /* renamed from: Q */
    private ByteBuffer[] f9214Q;

    /* renamed from: R */
    private ByteBuffer[] f9215R;

    /* renamed from: S */
    private long f9216S;

    /* renamed from: T */
    private int f9217T;

    /* renamed from: U */
    private int f9218U;

    /* renamed from: V */
    private ByteBuffer f9219V;

    /* renamed from: W */
    private boolean f9220W;

    /* renamed from: X */
    private boolean f9221X;

    /* renamed from: Y */
    private int f9222Y;

    /* renamed from: Z */
    private int f9223Z;

    /* renamed from: aa */
    private boolean f9224aa;

    /* renamed from: ba */
    private boolean f9225ba;

    /* renamed from: ca */
    private boolean f9226ca;

    /* renamed from: da */
    private boolean f9227da;

    /* renamed from: ea */
    private boolean f9228ea;

    /* renamed from: fa */
    private boolean f9229fa;

    /* renamed from: ga */
    protected C2195e f9230ga;

    /* renamed from: k */
    private final InterfaceC2343e f9231k;

    /* renamed from: l */
    private final InterfaceC2215o<C2219s> f9232l;

    /* renamed from: m */
    private final boolean f9233m;

    /* renamed from: n */
    private final float f9234n;

    /* renamed from: o */
    private final C2196f f9235o;

    /* renamed from: p */
    private final C2196f f9236p;

    /* renamed from: q */
    private final C2677t f9237q;

    /* renamed from: r */
    private final C2618E<C2676s> f9238r;

    /* renamed from: s */
    private final List<Long> f9239s;

    /* renamed from: t */
    private final MediaCodec.BufferInfo f9240t;

    /* renamed from: u */
    private C2676s f9241u;

    /* renamed from: v */
    private C2676s f9242v;

    /* renamed from: w */
    private C2676s f9243w;

    /* renamed from: x */
    private InterfaceC2214n<C2219s> f9244x;

    /* renamed from: y */
    private InterfaceC2214n<C2219s> f9245y;

    /* renamed from: z */
    private MediaCodec f9246z;

    /* renamed from: d.c.a.a.g.b$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {

        /* renamed from: a */
        public final String f9247a;

        /* renamed from: b */
        public final boolean f9248b;

        /* renamed from: c */
        public final String f9249c;

        /* renamed from: d */
        public final String f9250d;

        /* renamed from: e */
        public final a f9251e;

        public a(C2676s c2676s, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c2676s, th, c2676s.f11182g, z, null, m9768a(i), null);
        }

        public a(C2676s c2676s, Throwable th, boolean z, String str) {
            this("Decoder init failed: " + str + ", " + c2676s, th, c2676s.f11182g, z, str, C2622I.f10916a >= 21 ? m9769a(th) : null, null);
        }

        private a(String str, Throwable th, String str2, boolean z, String str3, String str4, a aVar) {
            super(str, th);
            this.f9247a = str2;
            this.f9248b = z;
            this.f9249c = str3;
            this.f9250d = str4;
            this.f9251e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public a m9766a(a aVar) {
            return new a(getMessage(), getCause(), this.f9247a, this.f9248b, this.f9249c, this.f9250d, aVar);
        }

        /* renamed from: a */
        private static String m9768a(int i) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        @TargetApi(21)
        /* renamed from: a */
        private static String m9769a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public AbstractC2340b(int i, InterfaceC2343e interfaceC2343e, InterfaceC2215o<C2219s> interfaceC2215o, boolean z, float f) {
        super(i);
        C2628e.m11113b(C2622I.f10916a >= 16);
        C2628e.m11110a(interfaceC2343e);
        this.f9231k = interfaceC2343e;
        this.f9232l = interfaceC2215o;
        this.f9233m = z;
        this.f9234n = f;
        this.f9235o = new C2196f(0);
        this.f9236p = C2196f.m9026i();
        this.f9237q = new C2677t();
        this.f9238r = new C2618E<>();
        this.f9239s = new ArrayList();
        this.f9240t = new MediaCodec.BufferInfo();
        this.f9222Y = 0;
        this.f9223Z = 0;
        this.f9199B = -1.0f;
        this.f9198A = 1.0f;
    }

    /* renamed from: D */
    private boolean m9728D() {
        return "Amazon".equals(C2622I.f10918c) && ("AFTM".equals(C2622I.f10919d) || "AFTB".equals(C2622I.f10919d));
    }

    /* renamed from: E */
    private boolean m9729E() {
        int position;
        int m9000a;
        MediaCodec mediaCodec = this.f9246z;
        if (mediaCodec == null || this.f9223Z == 2 || this.f9226ca) {
            return false;
        }
        if (this.f9217T < 0) {
            this.f9217T = mediaCodec.dequeueInputBuffer(0L);
            int i = this.f9217T;
            if (i < 0) {
                return false;
            }
            this.f9235o.f8040c = m9741a(i);
            this.f9235o.mo9006b();
        }
        if (this.f9223Z == 1) {
            if (!this.f9213P) {
                this.f9225ba = true;
                this.f9246z.queueInputBuffer(this.f9217T, 0, 0, 0L, 4);
                m9736L();
            }
            this.f9223Z = 2;
            return false;
        }
        if (this.f9211N) {
            this.f9211N = false;
            this.f9235o.f8040c.put(f9197j);
            this.f9246z.queueInputBuffer(this.f9217T, 0, f9197j.length, 0L, 0);
            m9736L();
            this.f9224aa = true;
            return true;
        }
        if (this.f9228ea) {
            m9000a = -4;
            position = 0;
        } else {
            if (this.f9222Y == 1) {
                for (int i2 = 0; i2 < this.f9241u.f11184i.size(); i2++) {
                    this.f9235o.f8040c.put(this.f9241u.f11184i.get(i2));
                }
                this.f9222Y = 2;
            }
            position = this.f9235o.f8040c.position();
            m9000a = m9000a(this.f9237q, this.f9235o, false);
        }
        if (m9000a == -3) {
            return false;
        }
        if (m9000a == -5) {
            if (this.f9222Y == 2) {
                this.f9235o.mo9006b();
                this.f9222Y = 1;
            }
            mo8789b(this.f9237q.f11202a);
            return true;
        }
        if (this.f9235o.m9010d()) {
            if (this.f9222Y == 2) {
                this.f9235o.mo9006b();
                this.f9222Y = 1;
            }
            this.f9226ca = true;
            if (!this.f9224aa) {
                m9731G();
                return false;
            }
            try {
                if (!this.f9213P) {
                    this.f9225ba = true;
                    this.f9246z.queueInputBuffer(this.f9217T, 0, 0, 0L, 4);
                    m9736L();
                }
                return false;
            } catch (MediaCodec.CryptoException e2) {
                throw C2399j.m9870a(e2, m9003p());
            }
        }
        if (this.f9229fa && !this.f9235o.m9013e()) {
            this.f9235o.mo9006b();
            if (this.f9222Y == 2) {
                this.f9222Y = 1;
            }
            return true;
        }
        this.f9229fa = false;
        boolean m9029g = this.f9235o.m9029g();
        this.f9228ea = m9753c(m9029g);
        if (this.f9228ea) {
            return false;
        }
        if (this.f9206I && !m9029g) {
            C2642s.m11182a(this.f9235o.f8040c);
            if (this.f9235o.f8040c.position() == 0) {
                return true;
            }
            this.f9206I = false;
        }
        try {
            long j = this.f9235o.f8041d;
            if (this.f9235o.m9009c()) {
                this.f9239s.add(Long.valueOf(j));
            }
            if (this.f9242v != null) {
                this.f9238r.m11016a(j, (long) this.f9242v);
                this.f9242v = null;
            }
            this.f9235o.m9027f();
            mo8781a(this.f9235o);
            if (m9029g) {
                this.f9246z.queueSecureInputBuffer(this.f9217T, 0, m9740a(this.f9235o, position), j, 0);
            } else {
                this.f9246z.queueInputBuffer(this.f9217T, 0, this.f9235o.f8040c.limit(), j, 0);
            }
            m9736L();
            this.f9224aa = true;
            this.f9222Y = 0;
            this.f9230ga.f8032c++;
            return true;
        } catch (MediaCodec.CryptoException e3) {
            throw C2399j.m9870a(e3, m9003p());
        }
    }

    /* renamed from: F */
    private boolean m9730F() {
        return this.f9218U >= 0;
    }

    /* renamed from: G */
    private void m9731G() {
        if (this.f9223Z == 2) {
            mo9758B();
            m9757A();
        } else {
            this.f9227da = true;
            mo8767C();
        }
    }

    /* renamed from: H */
    private void m9732H() {
        if (C2622I.f10916a < 21) {
            this.f9215R = this.f9246z.getOutputBuffers();
        }
    }

    /* renamed from: I */
    private void m9733I() {
        MediaFormat outputFormat = this.f9246z.getOutputFormat();
        if (this.f9204G != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f9212O = true;
            return;
        }
        if (this.f9210M) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo8780a(this.f9246z, outputFormat);
    }

    /* renamed from: J */
    private void m9734J() {
        this.f9201D = null;
        if (this.f9224aa) {
            this.f9223Z = 1;
        } else {
            mo9758B();
            m9757A();
        }
    }

    /* renamed from: K */
    private void m9735K() {
        if (C2622I.f10916a < 21) {
            this.f9214Q = null;
            this.f9215R = null;
        }
    }

    /* renamed from: L */
    private void m9736L() {
        this.f9217T = -1;
        this.f9235o.f8040c = null;
    }

    /* renamed from: M */
    private void m9737M() {
        this.f9218U = -1;
        this.f9219V = null;
    }

    /* renamed from: N */
    private void m9738N() {
        C2676s c2676s = this.f9241u;
        if (c2676s == null || C2622I.f10916a < 23) {
            return;
        }
        float mo8769a = mo8769a(this.f9198A, c2676s, m9004q());
        if (this.f9199B == mo8769a) {
            return;
        }
        this.f9199B = mo8769a;
        if (this.f9246z == null || this.f9223Z != 0) {
            return;
        }
        if (mo8769a == -1.0f && this.f9200C) {
            m9734J();
            return;
        }
        if (mo8769a != -1.0f) {
            if (this.f9200C || mo8769a > this.f9234n) {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", mo8769a);
                this.f9246z.setParameters(bundle);
                this.f9200C = true;
            }
        }
    }

    /* renamed from: a */
    private int m9739a(String str) {
        if (C2622I.f10916a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (C2622I.f10919d.startsWith("SM-T585") || C2622I.f10919d.startsWith("SM-A510") || C2622I.f10919d.startsWith("SM-A520") || C2622I.f10919d.startsWith("SM-J700"))) {
            return 2;
        }
        if (C2622I.f10916a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(C2622I.f10917b) || "flounder_lte".equals(C2622I.f10917b) || "grouper".equals(C2622I.f10917b) || "tilapia".equals(C2622I.f10917b)) ? 1 : 0;
        }
        return 0;
    }

    /* renamed from: a */
    private static MediaCodec.CryptoInfo m9740a(C2196f c2196f, int i) {
        MediaCodec.CryptoInfo m9016a = c2196f.f8039b.m9016a();
        if (i == 0) {
            return m9016a;
        }
        if (m9016a.numBytesOfClearData == null) {
            m9016a.numBytesOfClearData = new int[1];
        }
        int[] iArr = m9016a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return m9016a;
    }

    /* renamed from: a */
    private ByteBuffer m9741a(int i) {
        return C2622I.f10916a >= 21 ? this.f9246z.getInputBuffer(i) : this.f9214Q[i];
    }

    /* renamed from: a */
    private void m9742a(MediaCodec mediaCodec) {
        if (C2622I.f10916a < 21) {
            this.f9214Q = mediaCodec.getInputBuffers();
            this.f9215R = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: a */
    private void m9743a(C2339a c2339a, MediaCrypto mediaCrypto) {
        String str = c2339a.f9189a;
        m9738N();
        boolean z = this.f9199B > this.f9234n;
        MediaCodec mediaCodec = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C2620G.m11028a("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            C2620G.m11027a();
            C2620G.m11028a("configureCodec");
            mo8782a(c2339a, mediaCodec, this.f9241u, mediaCrypto, z ? this.f9199B : -1.0f);
            this.f9200C = z;
            C2620G.m11027a();
            C2620G.m11028a("startCodec");
            mediaCodec.start();
            C2620G.m11027a();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            m9742a(mediaCodec);
            this.f9246z = mediaCodec;
            this.f9203F = c2339a;
            mo8783a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Exception e2) {
            if (mediaCodec != null) {
                m9735K();
                mediaCodec.release();
            }
            throw e2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private boolean m9744a(MediaCrypto mediaCrypto, boolean z) {
        if (this.f9201D == null) {
            try {
                this.f9201D = new ArrayDeque<>(m9747b(z));
                this.f9202E = null;
            } catch (C2345g.b e2) {
                throw new a(this.f9241u, e2, z, -49998);
            }
        }
        if (this.f9201D.isEmpty()) {
            throw new a(this.f9241u, (Throwable) null, z, -49999);
        }
        do {
            C2339a peekFirst = this.f9201D.peekFirst();
            if (!mo9759a(peekFirst)) {
                return false;
            }
            try {
                m9743a(peekFirst, mediaCrypto);
                return true;
            } catch (Exception e3) {
                C2638o.m11158b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e3);
                this.f9201D.removeFirst();
                a aVar = new a(this.f9241u, e3, z, peekFirst.f9189a);
                a aVar2 = this.f9202E;
                if (aVar2 == null) {
                    this.f9202E = aVar;
                } else {
                    this.f9202E = aVar2.m9766a(aVar);
                }
            }
        } while (!this.f9201D.isEmpty());
        throw this.f9202E;
    }

    /* renamed from: a */
    private static boolean m9745a(String str, C2676s c2676s) {
        return C2622I.f10916a < 21 && c2676s.f11184i.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: b */
    private ByteBuffer m9746b(int i) {
        return C2622I.f10916a >= 21 ? this.f9246z.getOutputBuffer(i) : this.f9215R[i];
    }

    /* renamed from: b */
    private List<C2339a> m9747b(boolean z) {
        List<C2339a> mo8776a = mo8776a(this.f9231k, this.f9241u, z);
        if (mo8776a.isEmpty() && z) {
            mo8776a = mo8776a(this.f9231k, this.f9241u, false);
            if (!mo8776a.isEmpty()) {
                C2638o.m11160d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f9241u.f11182g + ", but no secure decoder available. Trying to proceed with " + mo8776a + ".");
            }
        }
        return mo8776a;
    }

    /* renamed from: b */
    private boolean m9748b(long j, long j2) {
        boolean mo8787a;
        int dequeueOutputBuffer;
        if (!m9730F()) {
            if (this.f9209L && this.f9225ba) {
                try {
                    dequeueOutputBuffer = this.f9246z.dequeueOutputBuffer(this.f9240t, m9765z());
                } catch (IllegalStateException unused) {
                    m9731G();
                    if (this.f9227da) {
                        mo9758B();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.f9246z.dequeueOutputBuffer(this.f9240t, m9765z());
            }
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    m9733I();
                    return true;
                }
                if (dequeueOutputBuffer == -3) {
                    m9732H();
                    return true;
                }
                if (this.f9213P && (this.f9226ca || this.f9223Z == 2)) {
                    m9731G();
                }
                return false;
            }
            if (this.f9212O) {
                this.f9212O = false;
                this.f9246z.releaseOutputBuffer(dequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f9240t;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m9731G();
                return false;
            }
            this.f9218U = dequeueOutputBuffer;
            this.f9219V = m9746b(dequeueOutputBuffer);
            ByteBuffer byteBuffer = this.f9219V;
            if (byteBuffer != null) {
                byteBuffer.position(this.f9240t.offset);
                ByteBuffer byteBuffer2 = this.f9219V;
                MediaCodec.BufferInfo bufferInfo2 = this.f9240t;
                byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.f9220W = m9755e(this.f9240t.presentationTimeUs);
            m9760d(this.f9240t.presentationTimeUs);
        }
        if (this.f9209L && this.f9225ba) {
            try {
                mo8787a = mo8787a(j, j2, this.f9246z, this.f9219V, this.f9218U, this.f9240t.flags, this.f9240t.presentationTimeUs, this.f9220W, this.f9243w);
            } catch (IllegalStateException unused2) {
                m9731G();
                if (this.f9227da) {
                    mo9758B();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.f9246z;
            ByteBuffer byteBuffer3 = this.f9219V;
            int i = this.f9218U;
            MediaCodec.BufferInfo bufferInfo3 = this.f9240t;
            mo8787a = mo8787a(j, j2, mediaCodec, byteBuffer3, i, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f9220W, this.f9243w);
        }
        if (mo8787a) {
            mo8790c(this.f9240t.presentationTimeUs);
            boolean z = (this.f9240t.flags & 4) != 0;
            m9737M();
            if (!z) {
                return true;
            }
            m9731G();
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m9749b(C2339a c2339a) {
        String str = c2339a.f9189a;
        return (C2622I.f10916a <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) || ("Amazon".equals(C2622I.f10918c) && "AFTS".equals(C2622I.f10919d) && c2339a.f9194f);
    }

    /* renamed from: b */
    private static boolean m9750b(String str) {
        return (C2622I.f10916a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (C2622I.f10916a <= 19 && (("hb2000".equals(C2622I.f10917b) || "stvm8".equals(C2622I.f10917b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    /* renamed from: b */
    private static boolean m9751b(String str, C2676s c2676s) {
        return C2622I.f10916a <= 18 && c2676s.f11195t == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: c */
    private static boolean m9752c(String str) {
        return C2622I.f10916a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: c */
    private boolean m9753c(boolean z) {
        if (this.f9244x == null || (!z && this.f9233m)) {
            return false;
        }
        int state = this.f9244x.getState();
        if (state != 1) {
            return state != 4;
        }
        throw C2399j.m9870a(this.f9244x.mo9070c(), m9003p());
    }

    /* renamed from: d */
    private static boolean m9754d(String str) {
        int i = C2622I.f10916a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (C2622I.f10916a == 19 && C2622I.f10919d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: e */
    private boolean m9755e(long j) {
        int size = this.f9239s.size();
        for (int i = 0; i < size; i++) {
            if (this.f9239s.get(i).longValue() == j) {
                this.f9239s.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m9756e(String str) {
        return C2622I.f10919d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final void m9757A() {
        C2676s c2676s;
        boolean z;
        if (this.f9246z != null || (c2676s = this.f9241u) == null) {
            return;
        }
        this.f9244x = this.f9245y;
        String str = c2676s.f11182g;
        MediaCrypto mediaCrypto = null;
        InterfaceC2214n<C2219s> interfaceC2214n = this.f9244x;
        if (interfaceC2214n != null) {
            C2219s mo9069b = interfaceC2214n.mo9069b();
            if (mo9069b != null) {
                mediaCrypto = mo9069b.m9107a();
                z = mo9069b.m9108a(str);
            } else if (this.f9244x.mo9070c() == null) {
                return;
            } else {
                z = false;
            }
            if (m9728D()) {
                int state = this.f9244x.getState();
                if (state == 1) {
                    throw C2399j.m9870a(this.f9244x.mo9070c(), m9003p());
                }
                if (state != 4) {
                    return;
                }
            }
        } else {
            z = false;
        }
        try {
            if (m9744a(mediaCrypto, z)) {
                String str2 = this.f9203F.f9189a;
                this.f9204G = m9739a(str2);
                this.f9205H = m9756e(str2);
                this.f9206I = m9745a(str2, this.f9241u);
                this.f9207J = m9754d(str2);
                this.f9208K = m9750b(str2);
                this.f9209L = m9752c(str2);
                this.f9210M = m9751b(str2, this.f9241u);
                this.f9213P = m9749b(this.f9203F) || mo9764y();
                this.f9216S = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                m9736L();
                m9737M();
                this.f9229fa = true;
                this.f9230ga.f8030a++;
            }
        } catch (a e2) {
            throw C2399j.m9870a(e2, m9003p());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void mo9758B() {
        this.f9216S = -9223372036854775807L;
        m9736L();
        m9737M();
        this.f9228ea = false;
        this.f9220W = false;
        this.f9239s.clear();
        m9735K();
        this.f9203F = null;
        this.f9221X = false;
        this.f9224aa = false;
        this.f9206I = false;
        this.f9207J = false;
        this.f9204G = 0;
        this.f9205H = false;
        this.f9208K = false;
        this.f9210M = false;
        this.f9211N = false;
        this.f9212O = false;
        this.f9213P = false;
        this.f9225ba = false;
        this.f9222Y = 0;
        this.f9223Z = 0;
        this.f9200C = false;
        MediaCodec mediaCodec = this.f9246z;
        if (mediaCodec != null) {
            this.f9230ga.f8031b++;
            try {
                mediaCodec.stop();
                try {
                    this.f9246z.release();
                    this.f9246z = null;
                    InterfaceC2214n<C2219s> interfaceC2214n = this.f9244x;
                    if (interfaceC2214n == null || this.f9245y == interfaceC2214n) {
                        return;
                    }
                    try {
                        this.f9232l.mo9086a(interfaceC2214n);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f9246z = null;
                    InterfaceC2214n<C2219s> interfaceC2214n2 = this.f9244x;
                    if (interfaceC2214n2 != null && this.f9245y != interfaceC2214n2) {
                        try {
                            this.f9232l.mo9086a(interfaceC2214n2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f9246z.release();
                    this.f9246z = null;
                    InterfaceC2214n<C2219s> interfaceC2214n3 = this.f9244x;
                    if (interfaceC2214n3 != null && this.f9245y != interfaceC2214n3) {
                        try {
                            this.f9232l.mo9086a(interfaceC2214n3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.f9246z = null;
                    InterfaceC2214n<C2219s> interfaceC2214n4 = this.f9244x;
                    if (interfaceC2214n4 != null && this.f9245y != interfaceC2214n4) {
                        try {
                            this.f9232l.mo9086a(interfaceC2214n4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    /* renamed from: C */
    protected void mo8767C() {
    }

    /* renamed from: a */
    protected abstract float mo8769a(float f, C2676s c2676s, C2676s[] c2676sArr);

    /* renamed from: a */
    protected abstract int mo8770a(MediaCodec mediaCodec, C2339a c2339a, C2676s c2676s, C2676s c2676s2);

    /* renamed from: a */
    protected abstract int mo8772a(InterfaceC2343e interfaceC2343e, InterfaceC2215o<C2219s> interfaceC2215o, C2676s c2676s);

    @Override // p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: a */
    public final int mo8576a(C2676s c2676s) {
        try {
            return mo8772a(this.f9231k, this.f9232l, c2676s);
        } catch (C2345g.b e2) {
            throw C2399j.m9870a(e2, m9003p());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public List<C2339a> mo8776a(InterfaceC2343e interfaceC2343e, C2676s c2676s, boolean z) {
        return interfaceC2343e.mo9771a(c2676s.f11182g, z);
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c, p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public final void mo8560a(float f) {
        this.f9198A = f;
        m9738N();
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: a */
    public void mo8562a(long j, long j2) {
        if (this.f9227da) {
            mo8767C();
            return;
        }
        if (this.f9241u == null) {
            this.f9236p.mo9006b();
            int m9000a = m9000a(this.f9237q, this.f9236p, true);
            if (m9000a != -5) {
                if (m9000a == -4) {
                    C2628e.m11113b(this.f9236p.m9010d());
                    this.f9226ca = true;
                    m9731G();
                    return;
                }
                return;
            }
            mo8789b(this.f9237q.f11202a);
        }
        m9757A();
        if (this.f9246z != null) {
            C2620G.m11028a("drainAndFeed");
            do {
            } while (m9748b(j, j2));
            do {
            } while (m9729E());
            C2620G.m11027a();
        } else {
            this.f9230ga.f8033d += m9001b(j);
            this.f9236p.mo9006b();
            int m9000a2 = m9000a(this.f9237q, this.f9236p, false);
            if (m9000a2 == -5) {
                mo8789b(this.f9237q.f11202a);
            } else if (m9000a2 == -4) {
                C2628e.m11113b(this.f9236p.m9010d());
                this.f9226ca = true;
                m9731G();
            }
        }
        this.f9230ga.m9024a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8779a(long j, boolean z) {
        this.f9226ca = false;
        this.f9227da = false;
        if (this.f9246z != null) {
            mo9761v();
        }
        this.f9238r.m11015a();
    }

    /* renamed from: a */
    protected abstract void mo8780a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: a */
    protected abstract void mo8781a(C2196f c2196f);

    /* renamed from: a */
    protected abstract void mo8782a(C2339a c2339a, MediaCodec mediaCodec, C2676s c2676s, MediaCrypto mediaCrypto, float f);

    /* renamed from: a */
    protected abstract void mo8783a(String str, long j, long j2);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: a */
    public void mo8784a(boolean z) {
        this.f9230ga = new C2195e();
    }

    /* renamed from: a */
    protected abstract boolean mo8787a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, C2676s c2676s);

    /* renamed from: a */
    protected boolean mo9759a(C2339a c2339a) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:            if (r6.f11188m == r0.f11188m) goto L36;     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo8789b(p139d.p225c.p226a.p227a.C2676s r6) {
        /*
            r5 = this;
            d.c.a.a.s r0 = r5.f9241u
            r5.f9241u = r6
            r5.f9242v = r6
            d.c.a.a.s r6 = r5.f9241u
            d.c.a.a.d.m r6 = r6.f11185j
            r1 = 0
            if (r0 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            d.c.a.a.d.m r2 = r0.f11185j
        L11:
            boolean r6 = p139d.p225c.p226a.p227a.p270n.C2622I.m11067a(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L4f
            d.c.a.a.s r6 = r5.f9241u
            d.c.a.a.d.m r6 = r6.f11185j
            if (r6 == 0) goto L4d
            d.c.a.a.d.o<d.c.a.a.d.s> r6 = r5.f9232l
            if (r6 == 0) goto L3d
            android.os.Looper r1 = android.os.Looper.myLooper()
            d.c.a.a.s r3 = r5.f9241u
            d.c.a.a.d.m r3 = r3.f11185j
            d.c.a.a.d.n r6 = r6.mo9084a(r1, r3)
            r5.f9245y = r6
            d.c.a.a.d.n<d.c.a.a.d.s> r6 = r5.f9245y
            d.c.a.a.d.n<d.c.a.a.d.s> r1 = r5.f9244x
            if (r6 != r1) goto L4f
            d.c.a.a.d.o<d.c.a.a.d.s> r1 = r5.f9232l
            r1.mo9086a(r6)
            goto L4f
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.m9003p()
            d.c.a.a.j r6 = p139d.p225c.p226a.p227a.C2399j.m9870a(r6, r0)
            throw r6
        L4d:
            r5.f9245y = r1
        L4f:
            d.c.a.a.d.n<d.c.a.a.d.s> r6 = r5.f9245y
            d.c.a.a.d.n<d.c.a.a.d.s> r1 = r5.f9244x
            r3 = 0
            if (r6 != r1) goto L90
            android.media.MediaCodec r6 = r5.f9246z
            if (r6 == 0) goto L90
            d.c.a.a.g.a r1 = r5.f9203F
            d.c.a.a.s r4 = r5.f9241u
            int r6 = r5.mo8770a(r6, r1, r0, r4)
            if (r6 == 0) goto L90
            if (r6 == r2) goto L91
            r1 = 3
            if (r6 != r1) goto L8a
            boolean r6 = r5.f9205H
            if (r6 != 0) goto L90
            r5.f9221X = r2
            r5.f9222Y = r2
            int r6 = r5.f9204G
            r1 = 2
            if (r6 == r1) goto L86
            if (r6 != r2) goto L87
            d.c.a.a.s r6 = r5.f9241u
            int r1 = r6.f11187l
            int r4 = r0.f11187l
            if (r1 != r4) goto L87
            int r6 = r6.f11188m
            int r0 = r0.f11188m
            if (r6 != r0) goto L87
        L86:
            r3 = 1
        L87:
            r5.f9211N = r3
            goto L91
        L8a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L90:
            r2 = 0
        L91:
            if (r2 != 0) goto L97
            r5.m9734J()
            goto L9a
        L97:
            r5.m9738N()
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p244g.AbstractC2340b.mo8789b(d.c.a.a.s):void");
    }

    /* renamed from: c */
    protected abstract void mo8790c(long j);

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: c */
    public boolean mo8565c() {
        return (this.f9241u == null || this.f9228ea || (!m9005r() && !m9730F() && (this.f9216S == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f9216S))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final C2676s m9760d(long j) {
        C2676s m11014a = this.f9238r.m11014a(j);
        if (m11014a != null) {
            this.f9243w = m11014a;
        }
        return m11014a;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2143H
    /* renamed from: d */
    public boolean mo8566d() {
        return this.f9227da;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2190c, p139d.p225c.p226a.p227a.InterfaceC2144I
    /* renamed from: n */
    public final int mo8577n() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: s */
    public void mo8791s() {
        this.f9241u = null;
        this.f9201D = null;
        try {
            mo9758B();
            try {
                if (this.f9244x != null) {
                    this.f9232l.mo9086a(this.f9244x);
                }
                try {
                    if (this.f9245y != null && this.f9245y != this.f9244x) {
                        this.f9232l.mo9086a(this.f9245y);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.f9245y != null && this.f9245y != this.f9244x) {
                        this.f9232l.mo9086a(this.f9245y);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f9244x != null) {
                    this.f9232l.mo9086a(this.f9244x);
                }
                try {
                    if (this.f9245y != null && this.f9245y != this.f9244x) {
                        this.f9232l.mo9086a(this.f9245y);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.f9245y != null && this.f9245y != this.f9244x) {
                        this.f9232l.mo9086a(this.f9245y);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: t */
    public void mo8792t() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.AbstractC2190c
    /* renamed from: u */
    public void mo8793u() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public void mo9761v() {
        this.f9216S = -9223372036854775807L;
        m9736L();
        m9737M();
        this.f9229fa = true;
        this.f9228ea = false;
        this.f9220W = false;
        this.f9239s.clear();
        this.f9211N = false;
        this.f9212O = false;
        if (this.f9207J || ((this.f9208K && this.f9225ba) || this.f9223Z != 0)) {
            mo9758B();
            m9757A();
        } else {
            this.f9246z.flush();
            this.f9224aa = false;
        }
        if (!this.f9221X || this.f9241u == null) {
            return;
        }
        this.f9222Y = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final MediaCodec m9762w() {
        return this.f9246z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final C2339a m9763x() {
        return this.f9203F;
    }

    /* renamed from: y */
    protected boolean mo9764y() {
        return false;
    }

    /* renamed from: z */
    protected long m9765z() {
        return 0L;
    }
}
