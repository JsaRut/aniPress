package p031c.p032a.p068l;

import android.content.Context;
import java.nio.ByteBuffer;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.l.e */
/* loaded from: classes.dex */
public final class C0683e {

    /* renamed from: a */
    private final C0681c f3153a;

    /* renamed from: b */
    private ByteBuffer f3154b;

    /* renamed from: c */
    public int f3155c;

    /* renamed from: d */
    public long f3156d;

    /* renamed from: e */
    public String f3157e;

    /* renamed from: f */
    public String f3158f;

    /* renamed from: g */
    public String f3159g;

    /* renamed from: h */
    private String f3160h;

    /* renamed from: i */
    private String f3161i;

    public C0683e(C0681c c0681c, ByteBuffer byteBuffer) {
        this.f3153a = c0681c;
        if (byteBuffer == null) {
            C0675a.m3475g("RegisterResponse", "No body to parse.");
            return;
        }
        this.f3154b = byteBuffer;
        try {
            this.f3155c = this.f3154b.getShort();
        } catch (Throwable unused) {
            this.f3155c = 10000;
        }
        if (this.f3155c > 0) {
            C0675a.m3477i("RegisterResponse", "Response error - code:" + this.f3155c);
        }
        ByteBuffer byteBuffer2 = this.f3154b;
        int i = this.f3155c;
        try {
            if (i == 0) {
                this.f3156d = byteBuffer2.getLong();
                this.f3157e = C0680b.m3493a(byteBuffer2);
                this.f3158f = C0680b.m3493a(byteBuffer2);
            } else {
                if (i != 1007) {
                    if (i == 1012) {
                        try {
                            this.f3161i = C0680b.m3493a(byteBuffer2);
                        } catch (Throwable unused2) {
                            this.f3155c = 10000;
                        }
                        C0616a.m3148a(C0831g.m4071a((Context) null), this.f3161i);
                        return;
                    }
                    return;
                }
                this.f3160h = C0680b.m3493a(byteBuffer2);
            }
        } catch (Throwable unused3) {
            this.f3155c = 10000;
        }
    }

    public final String toString() {
        return "[RegisterResponse] - code:" + this.f3155c + ", juid:" + this.f3156d + ", password:" + this.f3157e + ", regId:" + this.f3158f + ", deviceId:" + this.f3159g + ", connectInfo:" + this.f3161i;
    }
}
