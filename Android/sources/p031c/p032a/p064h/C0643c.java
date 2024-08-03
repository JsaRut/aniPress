package p031c.p032a.p064h;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: c.a.h.c */
/* loaded from: classes.dex */
public final class C0643c {

    /* renamed from: a */
    private ByteBuffer f2995a;

    /* renamed from: b */
    private int f2996b = -1;

    /* renamed from: c */
    private int f2997c = -1;

    public C0643c(byte[] bArr) {
        this.f2995a = ByteBuffer.wrap(bArr);
    }

    /* renamed from: c */
    private void m3269c(int i) {
        if (i > this.f2995a.remaining()) {
            throw new IOException("end of input");
        }
    }

    /* renamed from: a */
    public final int m3270a() {
        return this.f2995a.position();
    }

    /* renamed from: a */
    public final void m3271a(int i) {
        if (i > this.f2995a.capacity() - this.f2995a.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        ByteBuffer byteBuffer = this.f2995a;
        byteBuffer.limit(byteBuffer.position() + i);
    }

    /* renamed from: a */
    public final void m3272a(byte[] bArr, int i, int i2) {
        m3269c(i2);
        this.f2995a.get(bArr, 1, i2);
    }

    /* renamed from: b */
    public final int m3273b() {
        return this.f2995a.remaining();
    }

    /* renamed from: b */
    public final void m3274b(int i) {
        if (i >= this.f2995a.capacity()) {
            throw new IllegalArgumentException("cannot jump past end of input");
        }
        this.f2995a.position(i);
        ByteBuffer byteBuffer = this.f2995a;
        byteBuffer.limit(byteBuffer.capacity());
    }

    /* renamed from: c */
    public final void m3275c() {
        ByteBuffer byteBuffer = this.f2995a;
        byteBuffer.limit(byteBuffer.capacity());
    }

    /* renamed from: d */
    public final void m3276d() {
        this.f2996b = this.f2995a.position();
        this.f2997c = this.f2995a.limit();
    }

    /* renamed from: e */
    public final void m3277e() {
        int i = this.f2996b;
        if (i < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.f2995a.position(i);
        this.f2995a.limit(this.f2997c);
        this.f2996b = -1;
        this.f2997c = -1;
    }

    /* renamed from: f */
    public final int m3278f() {
        m3269c(1);
        return this.f2995a.get() & 255;
    }

    /* renamed from: g */
    public final int m3279g() {
        m3269c(2);
        return this.f2995a.getShort() & 65535;
    }

    /* renamed from: h */
    public final long m3280h() {
        m3269c(4);
        return this.f2995a.getInt() & 4294967295L;
    }
}
