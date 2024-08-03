package p139d.p225c.p226a.p227a.p229b;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.b.r */
/* loaded from: classes.dex */
final class C2181r {

    /* renamed from: a */
    private final a f7887a;

    /* renamed from: b */
    private int f7888b;

    /* renamed from: c */
    private long f7889c;

    /* renamed from: d */
    private long f7890d;

    /* renamed from: e */
    private long f7891e;

    /* renamed from: f */
    private long f7892f;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: d.c.a.a.b.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final AudioTrack f7893a;

        /* renamed from: b */
        private final AudioTimestamp f7894b = new AudioTimestamp();

        /* renamed from: c */
        private long f7895c;

        /* renamed from: d */
        private long f7896d;

        /* renamed from: e */
        private long f7897e;

        public a(AudioTrack audioTrack) {
            this.f7893a = audioTrack;
        }

        /* renamed from: a */
        public long m8923a() {
            return this.f7897e;
        }

        /* renamed from: b */
        public long m8924b() {
            return this.f7894b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m8925c() {
            boolean timestamp = this.f7893a.getTimestamp(this.f7894b);
            if (timestamp) {
                long j = this.f7894b.framePosition;
                if (this.f7896d > j) {
                    this.f7895c++;
                }
                this.f7896d = j;
                this.f7897e = j + (this.f7895c << 32);
            }
            return timestamp;
        }
    }

    public C2181r(AudioTrack audioTrack) {
        if (C2622I.f10916a >= 19) {
            this.f7887a = new a(audioTrack);
            m8922g();
        } else {
            this.f7887a = null;
            m8914a(3);
        }
    }

    /* renamed from: a */
    private void m8914a(int i) {
        this.f7888b = i;
        long j = 5000;
        if (i == 0) {
            this.f7891e = 0L;
            this.f7892f = -1L;
            this.f7889c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                j = 500000;
            }
        }
        this.f7890d = j;
    }

    /* renamed from: a */
    public void m8915a() {
        if (this.f7888b == 4) {
            m8922g();
        }
    }

    /* renamed from: a */
    public boolean m8916a(long j) {
        a aVar = this.f7887a;
        if (aVar == null || j - this.f7891e < this.f7890d) {
            return false;
        }
        this.f7891e = j;
        boolean m8925c = aVar.m8925c();
        int i = this.f7888b;
        if (i == 0) {
            if (!m8925c) {
                if (j - this.f7889c <= 500000) {
                    return m8925c;
                }
                m8914a(3);
                return m8925c;
            }
            if (this.f7887a.m8924b() < this.f7889c) {
                return false;
            }
            this.f7892f = this.f7887a.m8923a();
            m8914a(1);
            return m8925c;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return m8925c;
                    }
                    throw new IllegalStateException();
                }
                if (!m8925c) {
                    return m8925c;
                }
            } else if (m8925c) {
                return m8925c;
            }
        } else if (m8925c) {
            if (this.f7887a.m8923a() <= this.f7892f) {
                return m8925c;
            }
            m8914a(2);
            return m8925c;
        }
        m8922g();
        return m8925c;
    }

    /* renamed from: b */
    public long m8917b() {
        a aVar = this.f7887a;
        if (aVar != null) {
            return aVar.m8923a();
        }
        return -1L;
    }

    /* renamed from: c */
    public long m8918c() {
        a aVar = this.f7887a;
        if (aVar != null) {
            return aVar.m8924b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m8919d() {
        int i = this.f7888b;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    public boolean m8920e() {
        return this.f7888b == 2;
    }

    /* renamed from: f */
    public void m8921f() {
        m8914a(4);
    }

    /* renamed from: g */
    public void m8922g() {
        if (this.f7887a != null) {
            m8914a(0);
        }
    }
}
