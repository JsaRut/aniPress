package p031c.p101b.p102a.p111i;

import java.nio.ByteBuffer;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.i.a */
/* loaded from: classes.dex */
public class C0910a extends C0912c {

    /* renamed from: e */
    private int f3887e;

    public C0910a(int i, long j, long j2, ByteBuffer byteBuffer) {
        super(i, j, j2, byteBuffer);
        m4534e();
    }

    public C0910a(C0912c c0912c) {
        this(c0912c.m4541a(), c0912c.m4542b(), c0912c.f3890c, c0912c.m4543c());
    }

    /* renamed from: e */
    protected void m4534e() {
        try {
            this.f3887e = this.f3891d.getShort();
        } catch (Throwable th) {
            C0923b.m4654j("CommonResponse", "parse code failed :" + th.getMessage());
        }
    }

    /* renamed from: f */
    public int m4535f() {
        return this.f3887e;
    }

    @Override // p031c.p101b.p102a.p111i.C0912c
    public String toString() {
        return "[CommonResponse] - " + this.f3887e;
    }
}
