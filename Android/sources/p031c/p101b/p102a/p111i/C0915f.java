package p031c.p101b.p102a.p111i;

import java.nio.ByteBuffer;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.i.f */
/* loaded from: classes.dex */
public class C0915f extends C0912c {

    /* renamed from: e */
    int f3899e;

    /* renamed from: f */
    String f3900f;

    public C0915f(int i, long j, long j2, ByteBuffer byteBuffer) {
        super(i, j, j2, byteBuffer);
        m4557e();
    }

    public C0915f(C0912c c0912c) {
        this(c0912c.m4541a(), c0912c.m4542b(), c0912c.f3890c, c0912c.m4543c());
    }

    /* renamed from: e */
    protected void m4557e() {
        try {
            if (this.f3888a == 10) {
                this.f3899e = this.f3891d.getShort();
            }
            if (this.f3899e <= 0) {
                byte[] bArr = new byte[this.f3891d.getShort()];
                this.f3891d.get(bArr);
                this.f3900f = new String(bArr, "UTF-8");
            } else {
                C0923b.m4646c("TagaliasResponse", "Response error - code:" + this.f3899e);
            }
        } catch (Throwable th) {
            C0923b.m4654j("TagaliasResponse", "parse failed:" + th.getMessage());
        }
    }

    /* renamed from: f */
    public String m4558f() {
        return this.f3900f;
    }

    @Override // p031c.p101b.p102a.p111i.C0912c
    public String toString() {
        return "[TagaliasResponse] - action:" + this.f3900f + " - " + super.toString();
    }
}
