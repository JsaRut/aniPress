package p031c.p101b.p102a.p111i;

import java.nio.ByteBuffer;

/* renamed from: c.b.a.i.c */
/* loaded from: classes.dex */
public class C0912c {

    /* renamed from: a */
    int f3888a;

    /* renamed from: b */
    long f3889b;

    /* renamed from: c */
    long f3890c;

    /* renamed from: d */
    ByteBuffer f3891d;

    public C0912c(int i, long j, long j2, ByteBuffer byteBuffer) {
        this.f3888a = i;
        this.f3889b = j;
        this.f3891d = byteBuffer;
        this.f3890c = j2;
    }

    /* renamed from: a */
    public int m4541a() {
        return this.f3888a;
    }

    /* renamed from: b */
    public long m4542b() {
        return this.f3889b;
    }

    /* renamed from: c */
    public ByteBuffer m4543c() {
        return this.f3891d;
    }

    /* renamed from: d */
    public long m4544d() {
        return this.f3890c;
    }

    public String toString() {
        return "JPushResponse{cmd=" + this.f3888a + ", rid=" + this.f3889b + ", rquestId=" + this.f3890c + '}';
    }
}
