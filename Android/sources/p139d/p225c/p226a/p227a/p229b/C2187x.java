package p139d.p225c.p226a.p227a.p229b;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.p229b.C2182s;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2178o;
import p139d.p225c.p226a.p227a.p229b.InterfaceC2180q;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.b.x */
/* loaded from: classes.dex */
public final class C2187x implements InterfaceC2180q {

    /* renamed from: a */
    public static boolean f7937a = false;

    /* renamed from: b */
    public static boolean f7938b = false;

    /* renamed from: A */
    private C2137B f7939A;

    /* renamed from: B */
    private long f7940B;

    /* renamed from: C */
    private long f7941C;

    /* renamed from: D */
    private ByteBuffer f7942D;

    /* renamed from: E */
    private int f7943E;

    /* renamed from: F */
    private int f7944F;

    /* renamed from: G */
    private long f7945G;

    /* renamed from: H */
    private long f7946H;

    /* renamed from: I */
    private int f7947I;

    /* renamed from: J */
    private long f7948J;

    /* renamed from: K */
    private long f7949K;

    /* renamed from: L */
    private int f7950L;

    /* renamed from: M */
    private int f7951M;

    /* renamed from: N */
    private long f7952N;

    /* renamed from: O */
    private float f7953O;

    /* renamed from: P */
    private InterfaceC2178o[] f7954P;

    /* renamed from: Q */
    private ByteBuffer[] f7955Q;

    /* renamed from: R */
    private ByteBuffer f7956R;

    /* renamed from: S */
    private ByteBuffer f7957S;

    /* renamed from: T */
    private byte[] f7958T;

    /* renamed from: U */
    private int f7959U;

    /* renamed from: V */
    private int f7960V;

    /* renamed from: W */
    private boolean f7961W;

    /* renamed from: X */
    private boolean f7962X;

    /* renamed from: Y */
    private int f7963Y;

    /* renamed from: Z */
    private C2183t f7964Z;

    /* renamed from: aa */
    private boolean f7965aa;

    /* renamed from: ba */
    private long f7966ba;

    /* renamed from: c */
    private final C2174k f7967c;

    /* renamed from: d */
    private final a f7968d;

    /* renamed from: e */
    private final boolean f7969e;

    /* renamed from: f */
    private final C2184u f7970f;

    /* renamed from: g */
    private final C2162G f7971g;

    /* renamed from: h */
    private final InterfaceC2178o[] f7972h;

    /* renamed from: i */
    private final InterfaceC2178o[] f7973i;

    /* renamed from: j */
    private final ConditionVariable f7974j;

    /* renamed from: k */
    private final C2182s f7975k;

    /* renamed from: l */
    private final ArrayDeque<d> f7976l;

    /* renamed from: m */
    private InterfaceC2180q.c f7977m;

    /* renamed from: n */
    private AudioTrack f7978n;

    /* renamed from: o */
    private AudioTrack f7979o;

    /* renamed from: p */
    private boolean f7980p;

    /* renamed from: q */
    private boolean f7981q;

    /* renamed from: r */
    private int f7982r;

    /* renamed from: s */
    private int f7983s;

    /* renamed from: t */
    private int f7984t;

    /* renamed from: u */
    private int f7985u;

    /* renamed from: v */
    private C2173j f7986v;

    /* renamed from: w */
    private boolean f7987w;

    /* renamed from: x */
    private boolean f7988x;

    /* renamed from: y */
    private int f7989y;

    /* renamed from: z */
    private C2137B f7990z;

    /* renamed from: d.c.a.a.b.x$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        long mo8984a();

        /* renamed from: a */
        long mo8985a(long j);

        /* renamed from: a */
        C2137B mo8986a(C2137B c2137b);

        /* renamed from: b */
        InterfaceC2178o[] mo8987b();
    }

    /* renamed from: d.c.a.a.b.x$b */
    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: a */
        private final InterfaceC2178o[] f7991a;

        /* renamed from: b */
        private final C2159D f7992b = new C2159D();

        /* renamed from: c */
        private final C2161F f7993c = new C2161F();

        public b(InterfaceC2178o... interfaceC2178oArr) {
            this.f7991a = (InterfaceC2178o[]) Arrays.copyOf(interfaceC2178oArr, interfaceC2178oArr.length + 2);
            InterfaceC2178o[] interfaceC2178oArr2 = this.f7991a;
            interfaceC2178oArr2[interfaceC2178oArr.length] = this.f7992b;
            interfaceC2178oArr2[interfaceC2178oArr.length + 1] = this.f7993c;
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2187x.a
        /* renamed from: a */
        public long mo8984a() {
            return this.f7992b.m8817h();
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2187x.a
        /* renamed from: a */
        public long mo8985a(long j) {
            return this.f7993c.m8841a(j);
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2187x.a
        /* renamed from: a */
        public C2137B mo8986a(C2137B c2137b) {
            this.f7992b.m8816a(c2137b.f7644d);
            return new C2137B(this.f7993c.m8842b(c2137b.f7642b), this.f7993c.m8840a(c2137b.f7643c), c2137b.f7644d);
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2187x.a
        /* renamed from: b */
        public InterfaceC2178o[] mo8987b() {
            return this.f7991a;
        }
    }

    /* renamed from: d.c.a.a.b.x$c */
    /* loaded from: classes.dex */
    public static final class c extends RuntimeException {
        private c(String str) {
            super(str);
        }

        /* synthetic */ c(String str, C2185v c2185v) {
            this(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.b.x$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final C2137B f7994a;

        /* renamed from: b */
        private final long f7995b;

        /* renamed from: c */
        private final long f7996c;

        private d(C2137B c2137b, long j, long j2) {
            this.f7994a = c2137b;
            this.f7995b = j;
            this.f7996c = j2;
        }

        /* synthetic */ d(C2137B c2137b, long j, long j2, C2185v c2185v) {
            this(c2137b, j, j2);
        }
    }

    /* renamed from: d.c.a.a.b.x$e */
    /* loaded from: classes.dex */
    private final class e implements C2182s.a {
        private e() {
        }

        /* synthetic */ e(C2187x c2187x, C2185v c2185v) {
            this();
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2182s.a
        /* renamed from: a */
        public void mo8946a(int i, long j) {
            if (C2187x.this.f7977m != null) {
                C2187x.this.f7977m.mo8795a(i, j, SystemClock.elapsedRealtime() - C2187x.this.f7966ba);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2182s.a
        /* renamed from: a */
        public void mo8947a(long j) {
            C2638o.m11160d("AudioTrack", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2182s.a
        /* renamed from: a */
        public void mo8948a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C2187x.this.m8976n() + ", " + C2187x.this.m8977o();
            if (C2187x.f7938b) {
                throw new c(str, null);
            }
            C2638o.m11160d("AudioTrack", str);
        }

        @Override // p139d.p225c.p226a.p227a.p229b.C2182s.a
        /* renamed from: b */
        public void mo8949b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C2187x.this.m8976n() + ", " + C2187x.this.m8977o();
            if (C2187x.f7938b) {
                throw new c(str, null);
            }
            C2638o.m11160d("AudioTrack", str);
        }
    }

    public C2187x(C2174k c2174k, a aVar, boolean z) {
        this.f7967c = c2174k;
        C2628e.m11110a(aVar);
        this.f7968d = aVar;
        this.f7969e = z;
        this.f7974j = new ConditionVariable(true);
        this.f7975k = new C2182s(new e(this, null));
        this.f7970f = new C2184u();
        this.f7971g = new C2162G();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C2158C(), this.f7970f, this.f7971g);
        Collections.addAll(arrayList, aVar.mo8987b());
        this.f7972h = (InterfaceC2178o[]) arrayList.toArray(new InterfaceC2178o[arrayList.size()]);
        this.f7973i = new InterfaceC2178o[]{new C2189z()};
        this.f7953O = 1.0f;
        this.f7951M = 0;
        this.f7986v = C2173j.f7861a;
        this.f7963Y = 0;
        this.f7964Z = new C2183t(0, 0.0f);
        this.f7939A = C2137B.f7641a;
        this.f7960V = -1;
        this.f7954P = new InterfaceC2178o[0];
        this.f7955Q = new ByteBuffer[0];
        this.f7976l = new ArrayDeque<>();
    }

    public C2187x(C2174k c2174k, InterfaceC2178o[] interfaceC2178oArr) {
        this(c2174k, interfaceC2178oArr, false);
    }

    public C2187x(C2174k c2174k, InterfaceC2178o[] interfaceC2178oArr, boolean z) {
        this(c2174k, new b(interfaceC2178oArr), z);
    }

    /* renamed from: a */
    private static int m8951a(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C2188y.m8991a(byteBuffer);
        }
        if (i == 5) {
            return C2171h.m8847a();
        }
        if (i == 6) {
            return C2171h.m8854b(byteBuffer);
        }
        if (i == 14) {
            int m8849a = C2171h.m8849a(byteBuffer);
            if (m8849a == -1) {
                return 0;
            }
            return C2171h.m8850a(byteBuffer, m8849a) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    /* renamed from: a */
    private static int m8952a(int i, boolean z) {
        if (C2622I.f10916a <= 28 && !z) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (C2622I.f10916a <= 26 && "fugu".equals(C2622I.f10917b) && !z && i == 1) {
            i = 2;
        }
        return C2622I.m11036a(i);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m8953a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: a */
    private int m8954a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f7942D == null) {
            this.f7942D = ByteBuffer.allocate(16);
            this.f7942D.order(ByteOrder.BIG_ENDIAN);
            this.f7942D.putInt(1431633921);
        }
        if (this.f7943E == 0) {
            this.f7942D.putInt(4, i);
            this.f7942D.putLong(8, j * 1000);
            this.f7942D.position(0);
            this.f7943E = i;
        }
        int remaining = this.f7942D.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f7942D, remaining, 1);
            if (write < 0) {
                this.f7943E = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int m8953a = m8953a(audioTrack, byteBuffer, i);
        if (m8953a < 0) {
            this.f7943E = 0;
            return m8953a;
        }
        this.f7943E -= m8953a;
        return m8953a;
    }

    /* renamed from: a */
    private long m8955a(long j) {
        return j + m8966d(this.f7968d.mo8984a());
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m8957a(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: b */
    private static int m8958b(int i) {
        if (i == 5) {
            return 80000;
        }
        if (i == 6) {
            return 768000;
        }
        if (i == 7) {
            return 192000;
        }
        if (i == 8) {
            return 2250000;
        }
        if (i == 14) {
            return 3062500;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    private long m8959b(long j) {
        long j2;
        long m11043a;
        d dVar = null;
        while (!this.f7976l.isEmpty() && j >= this.f7976l.getFirst().f7996c) {
            dVar = this.f7976l.remove();
        }
        if (dVar != null) {
            this.f7939A = dVar.f7994a;
            this.f7941C = dVar.f7996c;
            this.f7940B = dVar.f7995b - this.f7952N;
        }
        if (this.f7939A.f7642b == 1.0f) {
            return (j + this.f7940B) - this.f7941C;
        }
        if (this.f7976l.isEmpty()) {
            j2 = this.f7940B;
            m11043a = this.f7968d.mo8985a(j - this.f7941C);
        } else {
            j2 = this.f7940B;
            m11043a = C2622I.m11043a(j - this.f7941C, this.f7939A.f7642b);
        }
        return j2 + m11043a;
    }

    /* renamed from: b */
    private static void m8961b(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: b */
    private void m8962b(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7957S;
            int i = 0;
            if (byteBuffer2 != null) {
                C2628e.m11111a(byteBuffer2 == byteBuffer);
            } else {
                this.f7957S = byteBuffer;
                if (C2622I.f10916a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f7958T;
                    if (bArr == null || bArr.length < remaining) {
                        this.f7958T = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f7958T, 0, remaining);
                    byteBuffer.position(position);
                    this.f7959U = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C2622I.f10916a < 21) {
                int m8935a = this.f7975k.m8935a(this.f7948J);
                if (m8935a > 0) {
                    i = this.f7979o.write(this.f7958T, this.f7959U, Math.min(remaining2, m8935a));
                    if (i > 0) {
                        this.f7959U += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (this.f7965aa) {
                C2628e.m11113b(j != -9223372036854775807L);
                i = m8954a(this.f7979o, byteBuffer, remaining2, j);
            } else {
                i = m8953a(this.f7979o, byteBuffer, remaining2);
            }
            this.f7966ba = SystemClock.elapsedRealtime();
            if (i < 0) {
                throw new InterfaceC2180q.d(i);
            }
            if (this.f7980p) {
                this.f7948J += i;
            }
            if (i == remaining2) {
                if (!this.f7980p) {
                    this.f7949K += this.f7950L;
                }
                this.f7957S = null;
            }
        }
    }

    /* renamed from: c */
    private long m8963c(long j) {
        return (j * this.f7983s) / 1000000;
    }

    /* renamed from: c */
    private AudioTrack m8965c(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    /* renamed from: d */
    private long m8966d(long j) {
        return (j * 1000000) / this.f7983s;
    }

    /* renamed from: e */
    private long m8968e(long j) {
        return (j * 1000000) / this.f7982r;
    }

    /* renamed from: f */
    private void m8970f(long j) {
        ByteBuffer byteBuffer;
        int length = this.f7954P.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7955Q[i - 1];
            } else {
                byteBuffer = this.f7956R;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC2178o.f7882a;
                }
            }
            if (i == length) {
                m8962b(byteBuffer, j);
            } else {
                InterfaceC2178o interfaceC2178o = this.f7954P[i];
                interfaceC2178o.mo8798a(byteBuffer);
                ByteBuffer mo8797a = interfaceC2178o.mo8797a();
                this.f7955Q[i] = mo8797a;
                if (mo8797a.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: i */
    private AudioTrack m8971i() {
        AudioAttributes build = this.f7965aa ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.f7986v.m8857a();
        AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f7984t).setEncoding(this.f7985u).setSampleRate(this.f7983s).build();
        int i = this.f7963Y;
        return new AudioTrack(build, build2, this.f7989y, 1, i != 0 ? i : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0032 -> B:6:0x0010). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m8972j() {
        /*
            r9 = this;
            int r0 = r9.f7960V
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.f7987w
            if (r0 == 0) goto Ld
            r0 = 0
            goto L10
        Ld:
            d.c.a.a.b.o[] r0 = r9.f7954P
            int r0 = r0.length
        L10:
            r9.f7960V = r0
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.f7960V
            d.c.a.a.b.o[] r5 = r9.f7954P
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L36
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.mo8804f()
        L28:
            r9.m8970f(r7)
            boolean r0 = r4.mo8802d()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.f7960V
            int r0 = r0 + r2
            goto L10
        L36:
            java.nio.ByteBuffer r0 = r9.f7957S
            if (r0 == 0) goto L42
            r9.m8962b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7957S
            if (r0 == 0) goto L42
            return r3
        L42:
            r9.f7960V = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p229b.C2187x.m8972j():boolean");
    }

    /* renamed from: k */
    private void m8973k() {
        int i = 0;
        while (true) {
            InterfaceC2178o[] interfaceC2178oArr = this.f7954P;
            if (i >= interfaceC2178oArr.length) {
                return;
            }
            InterfaceC2178o interfaceC2178o = interfaceC2178oArr[i];
            interfaceC2178o.flush();
            this.f7955Q[i] = interfaceC2178o.mo8797a();
            i++;
        }
    }

    /* renamed from: l */
    private InterfaceC2178o[] m8974l() {
        return this.f7981q ? this.f7973i : this.f7972h;
    }

    /* renamed from: m */
    private int m8975m() {
        if (this.f7980p) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f7983s, this.f7984t, this.f7985u);
            C2628e.m11113b(minBufferSize != -2);
            return C2622I.m11038a(minBufferSize * 4, ((int) m8963c(250000L)) * this.f7947I, (int) Math.max(minBufferSize, m8963c(750000L) * this.f7947I));
        }
        int m8958b = m8958b(this.f7985u);
        if (this.f7985u == 5) {
            m8958b *= 2;
        }
        return (int) ((m8958b * 250000) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public long m8976n() {
        return this.f7980p ? this.f7945G / this.f7944F : this.f7946H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public long m8977o() {
        return this.f7980p ? this.f7948J / this.f7947I : this.f7949K;
    }

    /* renamed from: p */
    private void m8978p() {
        this.f7974j.block();
        this.f7979o = m8979q();
        int audioSessionId = this.f7979o.getAudioSessionId();
        if (f7937a && C2622I.f10916a < 21) {
            AudioTrack audioTrack = this.f7978n;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                m8981s();
            }
            if (this.f7978n == null) {
                this.f7978n = m8965c(audioSessionId);
            }
        }
        if (this.f7963Y != audioSessionId) {
            this.f7963Y = audioSessionId;
            InterfaceC2180q.c cVar = this.f7977m;
            if (cVar != null) {
                cVar.mo8796c(audioSessionId);
            }
        }
        this.f7939A = this.f7988x ? this.f7968d.mo8986a(this.f7939A) : C2137B.f7641a;
        m8983u();
        this.f7975k.m8937a(this.f7979o, this.f7985u, this.f7947I, this.f7989y);
        m8982t();
        int i = this.f7964Z.f7923a;
        if (i != 0) {
            this.f7979o.attachAuxEffect(i);
            this.f7979o.setAuxEffectSendLevel(this.f7964Z.f7924b);
        }
    }

    /* renamed from: q */
    private AudioTrack m8979q() {
        AudioTrack audioTrack;
        if (C2622I.f10916a >= 21) {
            audioTrack = m8971i();
        } else {
            int m11087d = C2622I.m11087d(this.f7986v.f7864d);
            int i = this.f7963Y;
            audioTrack = i == 0 ? new AudioTrack(m11087d, this.f7983s, this.f7984t, this.f7985u, this.f7989y, 1) : new AudioTrack(m11087d, this.f7983s, this.f7984t, this.f7985u, this.f7989y, 1, i);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new InterfaceC2180q.b(state, this.f7983s, this.f7984t, this.f7989y);
    }

    /* renamed from: r */
    private boolean m8980r() {
        return this.f7979o != null;
    }

    /* renamed from: s */
    private void m8981s() {
        AudioTrack audioTrack = this.f7978n;
        if (audioTrack == null) {
            return;
        }
        this.f7978n = null;
        new C2186w(this, audioTrack).start();
    }

    /* renamed from: t */
    private void m8982t() {
        if (m8980r()) {
            if (C2622I.f10916a >= 21) {
                m8957a(this.f7979o, this.f7953O);
            } else {
                m8961b(this.f7979o, this.f7953O);
            }
        }
    }

    /* renamed from: u */
    private void m8983u() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2178o interfaceC2178o : m8974l()) {
            if (interfaceC2178o.mo8805g()) {
                arrayList.add(interfaceC2178o);
            } else {
                interfaceC2178o.flush();
            }
        }
        int size = arrayList.size();
        this.f7954P = (InterfaceC2178o[]) arrayList.toArray(new InterfaceC2178o[size]);
        this.f7955Q = new ByteBuffer[size];
        m8973k();
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public long mo8896a(boolean z) {
        if (!m8980r() || this.f7951M == 0) {
            return Long.MIN_VALUE;
        }
        return this.f7952N + m8955a(m8959b(Math.min(this.f7975k.m8936a(z), m8966d(m8977o()))));
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public C2137B mo8897a(C2137B c2137b) {
        if (m8980r() && !this.f7988x) {
            this.f7939A = C2137B.f7641a;
            return this.f7939A;
        }
        C2137B c2137b2 = this.f7990z;
        if (c2137b2 == null) {
            c2137b2 = !this.f7976l.isEmpty() ? this.f7976l.getLast().f7994a : this.f7939A;
        }
        if (!c2137b.equals(c2137b2)) {
            if (m8980r()) {
                this.f7990z = c2137b;
            } else {
                this.f7939A = this.f7968d.mo8986a(c2137b);
            }
        }
        return this.f7939A;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8898a() {
        reset();
        m8981s();
        for (InterfaceC2178o interfaceC2178o : this.f7972h) {
            interfaceC2178o.reset();
        }
        for (InterfaceC2178o interfaceC2178o2 : this.f7973i) {
            interfaceC2178o2.reset();
        }
        this.f7963Y = 0;
        this.f7962X = false;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8899a(float f) {
        if (this.f7953O != f) {
            this.f7953O = f;
            m8982t();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8900a(int i) {
        C2628e.m11113b(C2622I.f10916a >= 21);
        if (this.f7965aa && this.f7963Y == i) {
            return;
        }
        this.f7965aa = true;
        this.f7963Y = i;
        reset();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8901a(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6) {
        int i7;
        int i8;
        boolean z;
        this.f7982r = i3;
        this.f7980p = C2622I.m11093f(i);
        this.f7981q = this.f7969e && mo8905a(i2, 1073741824) && C2622I.m11091e(i);
        if (this.f7980p) {
            this.f7944F = C2622I.m11075b(i, i2);
        }
        boolean z2 = this.f7980p && i != 4;
        this.f7988x = z2 && !this.f7981q;
        if (C2622I.f10916a < 21 && i2 == 8 && iArr == null) {
            iArr = new int[6];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                iArr[i9] = i9;
            }
        }
        if (z2) {
            this.f7971g.m8843a(i5, i6);
            this.f7970f.m8950a(iArr);
            i7 = i3;
            i8 = i;
            z = false;
            for (InterfaceC2178o interfaceC2178o : m8974l()) {
                try {
                    z |= interfaceC2178o.mo8799a(i7, i2, i8);
                    if (interfaceC2178o.mo8805g()) {
                        i2 = interfaceC2178o.mo8800b();
                        i7 = interfaceC2178o.mo8801c();
                        i8 = interfaceC2178o.mo8803e();
                    }
                } catch (InterfaceC2178o.a e2) {
                    throw new InterfaceC2180q.a(e2);
                }
            }
        } else {
            i7 = i3;
            i8 = i;
            z = false;
        }
        int m8952a = m8952a(i2, this.f7980p);
        if (m8952a == 0) {
            throw new InterfaceC2180q.a("Unsupported channel count: " + i2);
        }
        if (!z && m8980r() && this.f7985u == i8 && this.f7983s == i7 && this.f7984t == m8952a) {
            return;
        }
        reset();
        this.f7987w = z2;
        this.f7983s = i7;
        this.f7984t = m8952a;
        this.f7985u = i8;
        this.f7947I = this.f7980p ? C2622I.m11075b(this.f7985u, i2) : -1;
        if (i4 == 0) {
            i4 = m8975m();
        }
        this.f7989y = i4;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8902a(C2173j c2173j) {
        if (this.f7986v.equals(c2173j)) {
            return;
        }
        this.f7986v = c2173j;
        if (this.f7965aa) {
            return;
        }
        reset();
        this.f7963Y = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8903a(InterfaceC2180q.c cVar) {
        this.f7977m = cVar;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public void mo8904a(C2183t c2183t) {
        if (this.f7964Z.equals(c2183t)) {
            return;
        }
        int i = c2183t.f7923a;
        float f = c2183t.f7924b;
        AudioTrack audioTrack = this.f7979o;
        if (audioTrack != null) {
            if (this.f7964Z.f7923a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f7979o.setAuxEffectSendLevel(f);
            }
        }
        this.f7964Z = c2183t;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public boolean mo8905a(int i, int i2) {
        if (C2622I.m11093f(i2)) {
            return i2 != 4 || C2622I.f10916a >= 21;
        }
        C2174k c2174k = this.f7967c;
        return c2174k != null && c2174k.m8862a(i2) && (i == -1 || i <= this.f7967c.m8861a());
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: a */
    public boolean mo8906a(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2 = this.f7956R;
        C2628e.m11111a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!m8980r()) {
            m8978p();
            if (this.f7962X) {
                mo8913h();
            }
        }
        if (!this.f7975k.m8945e(m8977o())) {
            return false;
        }
        if (this.f7956R == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f7980p && this.f7950L == 0) {
                this.f7950L = m8951a(this.f7985u, byteBuffer);
                if (this.f7950L == 0) {
                    return true;
                }
            }
            if (this.f7990z != null) {
                if (!m8972j()) {
                    return false;
                }
                C2137B c2137b = this.f7990z;
                this.f7990z = null;
                this.f7976l.add(new d(this.f7968d.mo8986a(c2137b), Math.max(0L, j), m8966d(m8977o()), null));
                m8983u();
            }
            if (this.f7951M == 0) {
                this.f7952N = Math.max(0L, j);
                this.f7951M = 1;
            } else {
                long m8968e = this.f7952N + m8968e(m8976n() - this.f7971g.m8844h());
                if (this.f7951M == 1 && Math.abs(m8968e - j) > 200000) {
                    C2638o.m11157b("AudioTrack", "Discontinuity detected [expected " + m8968e + ", got " + j + "]");
                    this.f7951M = 2;
                }
                if (this.f7951M == 2) {
                    long j2 = j - m8968e;
                    this.f7952N += j2;
                    this.f7951M = 1;
                    InterfaceC2180q.c cVar = this.f7977m;
                    if (cVar != null && j2 != 0) {
                        cVar.mo8794a();
                    }
                }
            }
            if (this.f7980p) {
                this.f7945G += byteBuffer.remaining();
            } else {
                this.f7946H += this.f7950L;
            }
            this.f7956R = byteBuffer;
        }
        if (this.f7987w) {
            m8970f(j);
        } else {
            m8962b(this.f7956R, j);
        }
        if (!this.f7956R.hasRemaining()) {
            this.f7956R = null;
            return true;
        }
        if (!this.f7975k.m8944d(m8977o())) {
            return false;
        }
        C2638o.m11160d("AudioTrack", "Resetting stalled audio track");
        reset();
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: b */
    public C2137B mo8907b() {
        return this.f7939A;
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: c */
    public void mo8908c() {
        if (!this.f7961W && m8980r() && m8972j()) {
            this.f7975k.m8939b(m8977o());
            this.f7979o.stop();
            this.f7943E = 0;
            this.f7961W = true;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: d */
    public boolean mo8909d() {
        return !m8980r() || (this.f7961W && !mo8910e());
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: e */
    public boolean mo8910e() {
        return m8980r() && this.f7975k.m8942c(m8977o());
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: f */
    public void mo8911f() {
        if (this.f7965aa) {
            this.f7965aa = false;
            this.f7963Y = 0;
            reset();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: g */
    public void mo8912g() {
        if (this.f7951M == 1) {
            this.f7951M = 2;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    /* renamed from: h */
    public void mo8913h() {
        this.f7962X = true;
        if (m8980r()) {
            this.f7975k.m8943d();
            this.f7979o.play();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    public void pause() {
        this.f7962X = false;
        if (m8980r() && this.f7975k.m8940b()) {
            this.f7979o.pause();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p229b.InterfaceC2180q
    public void reset() {
        if (m8980r()) {
            this.f7945G = 0L;
            this.f7946H = 0L;
            this.f7948J = 0L;
            this.f7949K = 0L;
            this.f7950L = 0;
            C2137B c2137b = this.f7990z;
            if (c2137b != null) {
                this.f7939A = c2137b;
                this.f7990z = null;
            } else if (!this.f7976l.isEmpty()) {
                this.f7939A = this.f7976l.getLast().f7994a;
            }
            this.f7976l.clear();
            this.f7940B = 0L;
            this.f7941C = 0L;
            this.f7971g.m8845i();
            this.f7956R = null;
            this.f7957S = null;
            m8973k();
            this.f7961W = false;
            this.f7960V = -1;
            this.f7942D = null;
            this.f7943E = 0;
            this.f7951M = 0;
            if (this.f7975k.m8938a()) {
                this.f7979o.pause();
            }
            AudioTrack audioTrack = this.f7979o;
            this.f7979o = null;
            this.f7975k.m8941c();
            this.f7974j.close();
            new C2185v(this, audioTrack).start();
        }
    }
}
