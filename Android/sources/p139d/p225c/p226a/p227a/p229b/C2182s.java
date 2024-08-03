package p139d.p225c.p226a.p227a.p229b;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.b.s */
/* loaded from: classes.dex */
final class C2182s {

    /* renamed from: a */
    private final a f7898a;

    /* renamed from: b */
    private final long[] f7899b;

    /* renamed from: c */
    private AudioTrack f7900c;

    /* renamed from: d */
    private int f7901d;

    /* renamed from: e */
    private int f7902e;

    /* renamed from: f */
    private C2181r f7903f;

    /* renamed from: g */
    private int f7904g;

    /* renamed from: h */
    private boolean f7905h;

    /* renamed from: i */
    private long f7906i;

    /* renamed from: j */
    private long f7907j;

    /* renamed from: k */
    private long f7908k;

    /* renamed from: l */
    private Method f7909l;

    /* renamed from: m */
    private long f7910m;

    /* renamed from: n */
    private boolean f7911n;

    /* renamed from: o */
    private boolean f7912o;

    /* renamed from: p */
    private long f7913p;

    /* renamed from: q */
    private long f7914q;

    /* renamed from: r */
    private long f7915r;

    /* renamed from: s */
    private long f7916s;

    /* renamed from: t */
    private int f7917t;

    /* renamed from: u */
    private int f7918u;

    /* renamed from: v */
    private long f7919v;

    /* renamed from: w */
    private long f7920w;

    /* renamed from: x */
    private long f7921x;

    /* renamed from: y */
    private long f7922y;

    /* renamed from: d.c.a.a.b.s$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo8946a(int i, long j);

        /* renamed from: a */
        void mo8947a(long j);

        /* renamed from: a */
        void mo8948a(long j, long j2, long j3, long j4);

        /* renamed from: b */
        void mo8949b(long j, long j2, long j3, long j4);
    }

    public C2182s(a aVar) {
        C2628e.m11110a(aVar);
        this.f7898a = aVar;
        if (C2622I.f10916a >= 18) {
            try {
                this.f7909l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7899b = new long[10];
    }

    /* renamed from: a */
    private void m8926a(long j, long j2) {
        C2181r c2181r = this.f7903f;
        C2628e.m11110a(c2181r);
        C2181r c2181r2 = c2181r;
        if (c2181r2.m8916a(j)) {
            long m8918c = c2181r2.m8918c();
            long m8917b = c2181r2.m8917b();
            if (Math.abs(m8918c - j) > 5000000) {
                this.f7898a.mo8949b(m8917b, m8918c, j, j2);
            } else {
                if (Math.abs(m8930f(m8917b) - j2) <= 5000000) {
                    c2181r2.m8915a();
                    return;
                }
                this.f7898a.mo8948a(m8917b, m8918c, j, j2);
            }
            c2181r2.m8921f();
        }
    }

    /* renamed from: a */
    private static boolean m8927a(int i) {
        return C2622I.f10916a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: e */
    private boolean m8928e() {
        if (this.f7905h) {
            AudioTrack audioTrack = this.f7900c;
            C2628e.m11110a(audioTrack);
            if (audioTrack.getPlayState() == 2 && m8929f() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private long m8929f() {
        AudioTrack audioTrack = this.f7900c;
        C2628e.m11110a(audioTrack);
        AudioTrack audioTrack2 = audioTrack;
        if (this.f7919v != -9223372036854775807L) {
            return Math.min(this.f7922y, this.f7921x + ((((SystemClock.elapsedRealtime() * 1000) - this.f7919v) * this.f7904g) / 1000000));
        }
        int playState = audioTrack2.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack2.getPlaybackHeadPosition();
        if (this.f7905h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f7916s = this.f7914q;
            }
            playbackHeadPosition += this.f7916s;
        }
        if (C2622I.f10916a <= 28) {
            if (playbackHeadPosition == 0 && this.f7914q > 0 && playState == 3) {
                if (this.f7920w == -9223372036854775807L) {
                    this.f7920w = SystemClock.elapsedRealtime();
                }
                return this.f7914q;
            }
            this.f7920w = -9223372036854775807L;
        }
        if (this.f7914q > playbackHeadPosition) {
            this.f7915r++;
        }
        this.f7914q = playbackHeadPosition;
        return playbackHeadPosition + (this.f7915r << 32);
    }

    /* renamed from: f */
    private long m8930f(long j) {
        return (j * 1000000) / this.f7904g;
    }

    /* renamed from: g */
    private long m8931g() {
        return m8930f(m8929f());
    }

    /* renamed from: g */
    private void m8932g(long j) {
        Method method;
        if (!this.f7912o || (method = this.f7909l) == null || j - this.f7913p < 500000) {
            return;
        }
        try {
            AudioTrack audioTrack = this.f7900c;
            C2628e.m11110a(audioTrack);
            C2622I.m11050a((Integer) method.invoke(audioTrack, new Object[0]));
            this.f7910m = (r0.intValue() * 1000) - this.f7906i;
            this.f7910m = Math.max(this.f7910m, 0L);
            if (this.f7910m > 5000000) {
                this.f7898a.mo8947a(this.f7910m);
                this.f7910m = 0L;
            }
        } catch (Exception unused) {
            this.f7909l = null;
        }
        this.f7913p = j;
    }

    /* renamed from: h */
    private void m8933h() {
        long m8931g = m8931g();
        if (m8931g == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f7908k >= 30000) {
            long[] jArr = this.f7899b;
            int i = this.f7917t;
            jArr[i] = m8931g - nanoTime;
            this.f7917t = (i + 1) % 10;
            int i2 = this.f7918u;
            if (i2 < 10) {
                this.f7918u = i2 + 1;
            }
            this.f7908k = nanoTime;
            this.f7907j = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.f7918u;
                if (i3 >= i4) {
                    break;
                }
                this.f7907j += this.f7899b[i3] / i4;
                i3++;
            }
        }
        if (this.f7905h) {
            return;
        }
        m8926a(nanoTime, m8931g);
        m8932g(nanoTime);
    }

    /* renamed from: i */
    private void m8934i() {
        this.f7907j = 0L;
        this.f7918u = 0;
        this.f7917t = 0;
        this.f7908k = 0L;
    }

    /* renamed from: a */
    public int m8935a(long j) {
        return this.f7902e - ((int) (j - (m8929f() * this.f7901d)));
    }

    /* renamed from: a */
    public long m8936a(boolean z) {
        AudioTrack audioTrack = this.f7900c;
        C2628e.m11110a(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            m8933h();
        }
        long nanoTime = System.nanoTime() / 1000;
        C2181r c2181r = this.f7903f;
        C2628e.m11110a(c2181r);
        C2181r c2181r2 = c2181r;
        if (c2181r2.m8919d()) {
            long m8930f = m8930f(c2181r2.m8917b());
            return !c2181r2.m8920e() ? m8930f : m8930f + (nanoTime - c2181r2.m8918c());
        }
        long m8931g = this.f7918u == 0 ? m8931g() : nanoTime + this.f7907j;
        return !z ? m8931g - this.f7910m : m8931g;
    }

    /* renamed from: a */
    public void m8937a(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f7900c = audioTrack;
        this.f7901d = i2;
        this.f7902e = i3;
        this.f7903f = new C2181r(audioTrack);
        this.f7904g = audioTrack.getSampleRate();
        this.f7905h = m8927a(i);
        this.f7912o = C2622I.m11093f(i);
        this.f7906i = this.f7912o ? m8930f(i3 / i2) : -9223372036854775807L;
        this.f7914q = 0L;
        this.f7915r = 0L;
        this.f7916s = 0L;
        this.f7911n = false;
        this.f7919v = -9223372036854775807L;
        this.f7920w = -9223372036854775807L;
        this.f7910m = 0L;
    }

    /* renamed from: a */
    public boolean m8938a() {
        AudioTrack audioTrack = this.f7900c;
        C2628e.m11110a(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: b */
    public void m8939b(long j) {
        this.f7921x = m8929f();
        this.f7919v = SystemClock.elapsedRealtime() * 1000;
        this.f7922y = j;
    }

    /* renamed from: b */
    public boolean m8940b() {
        m8934i();
        if (this.f7919v != -9223372036854775807L) {
            return false;
        }
        C2181r c2181r = this.f7903f;
        C2628e.m11110a(c2181r);
        c2181r.m8922g();
        return true;
    }

    /* renamed from: c */
    public void m8941c() {
        m8934i();
        this.f7900c = null;
        this.f7903f = null;
    }

    /* renamed from: c */
    public boolean m8942c(long j) {
        return j > m8929f() || m8928e();
    }

    /* renamed from: d */
    public void m8943d() {
        C2181r c2181r = this.f7903f;
        C2628e.m11110a(c2181r);
        c2181r.m8922g();
    }

    /* renamed from: d */
    public boolean m8944d(long j) {
        return this.f7920w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f7920w >= 200;
    }

    /* renamed from: e */
    public boolean m8945e(long j) {
        a aVar;
        AudioTrack audioTrack = this.f7900c;
        C2628e.m11110a(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f7905h) {
            if (playState == 2) {
                this.f7911n = false;
                return false;
            }
            if (playState == 1 && m8929f() == 0) {
                return false;
            }
        }
        boolean z = this.f7911n;
        this.f7911n = m8942c(j);
        if (z && !this.f7911n && playState != 1 && (aVar = this.f7898a) != null) {
            aVar.mo8946a(this.f7902e, C2200d.m9048b(this.f7906i));
        }
        return true;
    }
}
