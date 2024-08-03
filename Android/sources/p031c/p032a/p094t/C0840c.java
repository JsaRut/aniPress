package p031c.p032a.p094t;

import java.nio.ByteBuffer;

/* renamed from: c.a.t.c */
/* loaded from: classes.dex */
public final class C0840c {

    /* renamed from: a */
    int f3583a;

    /* renamed from: b */
    int f3584b;

    /* renamed from: c */
    int f3585c;

    /* renamed from: d */
    Long f3586d;

    /* renamed from: e */
    int f3587e;

    /* renamed from: f */
    long f3588f;

    /* renamed from: g */
    private boolean f3589g;

    public C0840c(boolean z, int i, int i2, int i3, long j, int i4, long j2) {
        this.f3589g = false;
        this.f3589g = z;
        this.f3583a = i;
        this.f3584b = i2;
        this.f3585c = i3;
        this.f3586d = Long.valueOf(j);
        this.f3587e = i4;
        this.f3588f = j2;
    }

    public C0840c(boolean z, int i, int i2, long j) {
        this(z, 0, i, i2, j, 0, 0L);
    }

    public C0840c(boolean z, byte[] bArr) {
        this.f3589g = false;
        this.f3589g = z;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f3583a = wrap.getShort();
        this.f3583a &= 32767;
        this.f3584b = wrap.get();
        this.f3585c = wrap.get();
        this.f3586d = Long.valueOf(wrap.getLong());
        this.f3586d = Long.valueOf(this.f3586d.longValue() & 65535);
        if (z) {
            this.f3587e = wrap.getInt();
        }
        this.f3588f = wrap.getLong();
    }

    /* renamed from: a */
    public final int m4100a() {
        return this.f3585c;
    }

    /* renamed from: b */
    public final Long m4101b() {
        return this.f3586d;
    }

    /* renamed from: c */
    public final int m4102c() {
        return this.f3584b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[JHead] - len:");
        sb.append(this.f3583a);
        sb.append(", version:");
        sb.append(this.f3584b);
        sb.append(", command:");
        sb.append(this.f3585c);
        sb.append(", rid:");
        sb.append(this.f3586d);
        if (this.f3589g) {
            str = ", sid:" + this.f3587e;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", juid:");
        sb.append(this.f3588f);
        return sb.toString();
    }
}
