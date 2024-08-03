package p031c.p101b.p102a.p111i;

import java.nio.ByteBuffer;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.i.d */
/* loaded from: classes.dex */
public class C0913d extends C0912c {

    /* renamed from: e */
    int f3892e;

    /* renamed from: f */
    long f3893f;

    /* renamed from: g */
    String f3894g;

    public C0913d(int i, long j, long j2, ByteBuffer byteBuffer) {
        super(i, j, j2, byteBuffer);
        m4545e();
    }

    public C0913d(C0912c c0912c) {
        this(c0912c.m4541a(), c0912c.m4542b(), c0912c.f3890c, c0912c.m4543c());
    }

    /* renamed from: e */
    protected void m4545e() {
        try {
            this.f3892e = this.f3891d.get();
            this.f3893f = this.f3891d.getLong();
            byte[] bArr = new byte[this.f3891d.getShort()];
            this.f3891d.get(bArr);
            this.f3894g = new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            C0923b.m4654j("MessagePush", "parse msg content failed");
        }
    }

    /* renamed from: f */
    public int m4546f() {
        return this.f3892e;
    }

    /* renamed from: g */
    public long m4547g() {
        return this.f3893f;
    }

    /* renamed from: h */
    public String m4548h() {
        return this.f3894g;
    }

    @Override // p031c.p101b.p102a.p111i.C0912c
    public String toString() {
        return "[MessagePush] - msgType:" + this.f3892e + ", msgId:" + this.f3893f + ", msgContent:" + this.f3894g + " - " + super.toString();
    }
}
