package p031c.p032a.p063g;

import android.content.Context;
import p031c.p032a.p065i.C0666i;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0679a;

/* renamed from: c.a.g.v */
/* loaded from: classes.dex */
final class RunnableC0640v implements Runnable {

    /* renamed from: a */
    private byte[] f2989a;

    /* renamed from: b */
    private Context f2990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0640v(Context context, byte[] bArr) {
        this.f2990b = context;
        this.f2989a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0666i.m3408a().m3426a(this.f2990b, "tcp_a22", null);
            C0679a.m3492a(this.f2990b, this.f2989a);
        } catch (Throwable th) {
            C0675a.m3475g("TcpRecvAction", "TcpRecvAction failed:" + th.getMessage());
        }
    }
}
