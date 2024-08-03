package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import p139d.p225c.p226a.p227a.C2137B;

/* renamed from: d.c.a.a.b.q */
/* loaded from: classes.dex */
public interface InterfaceC2180q {

    /* renamed from: d.c.a.a.b.q$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: d.c.a.a.b.q$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a */
        public final int f7885a;

        public b(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.f7885a = i;
        }
    }

    /* renamed from: d.c.a.a.b.q$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo8794a();

        /* renamed from: a */
        void mo8795a(int i, long j, long j2);

        /* renamed from: c */
        void mo8796c(int i);
    }

    /* renamed from: d.c.a.a.b.q$d */
    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a */
        public final int f7886a;

        public d(int i) {
            super("AudioTrack write failed: " + i);
            this.f7886a = i;
        }
    }

    /* renamed from: a */
    long mo8896a(boolean z);

    /* renamed from: a */
    C2137B mo8897a(C2137B c2137b);

    /* renamed from: a */
    void mo8898a();

    /* renamed from: a */
    void mo8899a(float f);

    /* renamed from: a */
    void mo8900a(int i);

    /* renamed from: a */
    void mo8901a(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    /* renamed from: a */
    void mo8902a(C2173j c2173j);

    /* renamed from: a */
    void mo8903a(c cVar);

    /* renamed from: a */
    void mo8904a(C2183t c2183t);

    /* renamed from: a */
    boolean mo8905a(int i, int i2);

    /* renamed from: a */
    boolean mo8906a(ByteBuffer byteBuffer, long j);

    /* renamed from: b */
    C2137B mo8907b();

    /* renamed from: c */
    void mo8908c();

    /* renamed from: d */
    boolean mo8909d();

    /* renamed from: e */
    boolean mo8910e();

    /* renamed from: f */
    void mo8911f();

    /* renamed from: g */
    void mo8912g();

    /* renamed from: h */
    void mo8913h();

    void pause();

    void reset();
}
