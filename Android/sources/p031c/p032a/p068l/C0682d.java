package p031c.p032a.p068l;

import android.content.Context;
import java.nio.ByteBuffer;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.l.d */
/* loaded from: classes.dex */
public final class C0682d {

    /* renamed from: a */
    private final C0681c f3144a;

    /* renamed from: b */
    private ByteBuffer f3145b;

    /* renamed from: c */
    public int f3146c;

    /* renamed from: d */
    public int f3147d;

    /* renamed from: e */
    private int f3148e;

    /* renamed from: f */
    private String f3149f;

    /* renamed from: g */
    public int f3150g;

    /* renamed from: h */
    public int f3151h;

    /* renamed from: i */
    private String f3152i;

    public C0682d(C0681c c0681c, ByteBuffer byteBuffer) {
        String str;
        this.f3144a = c0681c;
        if (byteBuffer != null) {
            this.f3145b = byteBuffer;
            try {
                this.f3146c = this.f3145b.getShort();
            } catch (Throwable unused) {
                this.f3146c = 10000;
            }
            if (this.f3146c > 0) {
                C0675a.m3477i("LoginResponse", "Response error - code:" + this.f3146c);
            }
            ByteBuffer byteBuffer2 = this.f3145b;
            this.f3151h = -1;
            int i = this.f3146c;
            if (i != 0) {
                if (i == 1012) {
                    try {
                        this.f3152i = C0680b.m3493a(byteBuffer2);
                    } catch (Throwable unused2) {
                        this.f3146c = 10000;
                    }
                    C0616a.m3148a(C0831g.m4071a((Context) null), this.f3152i);
                    return;
                }
                return;
            }
            try {
                this.f3147d = byteBuffer2.getInt();
                this.f3148e = byteBuffer2.getShort();
                this.f3149f = C0680b.m3493a(byteBuffer2);
                this.f3150g = byteBuffer2.getInt();
            } catch (Throwable unused3) {
                this.f3146c = 10000;
            }
            try {
                this.f3151h = byteBuffer2.get();
                C0675a.m3469c("LoginResponse", "idc parse success, value:" + this.f3151h);
                return;
            } catch (Throwable th) {
                str = "parse idc failed, error:" + th;
            }
        } else {
            str = "No body to parse.";
        }
        C0675a.m3475g("LoginResponse", str);
    }

    public final String toString() {
        return "[LoginResponse] - code:" + this.f3146c + ",sid:" + this.f3147d + ", serverVersion:" + this.f3148e + ", sessionKey:" + this.f3149f + ", serverTime:" + this.f3150g + ", idc:" + this.f3151h + ", connectInfo:" + this.f3152i;
    }
}
