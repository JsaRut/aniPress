package p031c.p032a.p063g;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p065i.C0666i;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p071o.AbstractC0688a;
import p031c.p032a.p071o.C0689b;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0814c;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.g.i */
/* loaded from: classes.dex */
public final class RunnableC0627i implements Runnable {

    /* renamed from: a */
    private Context f2925a;

    /* renamed from: b */
    public boolean f2926b;

    /* renamed from: c */
    private AbstractC0688a f2927c = new C0689b(8128, 20);

    /* renamed from: d */
    private ExecutorService f2928d;

    static {
        C0557c.m2900a("NetworkingClient");
    }

    public RunnableC0627i(Context context) {
        this.f2925a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m3222a(int r10) {
        /*
            r9 = this;
        L0:
            boolean r0 = r9.f2926b
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "NetworkingClient"
            if (r10 > 0) goto L16
            java.lang.String r10 = "login error,retry login too many times"
            p031c.p032a.p066j.C0675a.m3471d(r0, r10)
            r9.m3225e()
            r9.m3224d()
            return r1
        L16:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "loginTimes:"
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            p031c.p032a.p066j.C0675a.m3469c(r0, r2)
            android.content.Context r2 = r9.f2925a
            boolean r2 = p031c.p032a.p048P.p049a.C0557c.m2914h(r2)
            r3 = 1
            java.lang.String r4 = "resCode"
            r5 = 0
            if (r2 == 0) goto L3f
            android.content.Context r2 = r9.f2925a
            java.lang.String r2 = p031c.p032a.p048P.p049a.C0557c.m2912f(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L6f
        L3f:
            android.content.Context r2 = r9.f2925a
            c.a.o.a r6 = r9.f2927c
            int r2 = p031c.p032a.p063g.C0621c.m3202b(r2, r6)
            if (r2 == 0) goto L64
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putInt(r4, r2)
            c.a.i.i r2 = p031c.p032a.p065i.C0666i.m3408a()
            android.content.Context r7 = r9.f2925a
            java.lang.String r8 = "tcp_a13"
            r2.m3426a(r7, r8, r6)
            r9.m3225e()
            r9.m3224d()
            r2 = 0
            goto L70
        L64:
            c.a.i.i r2 = p031c.p032a.p065i.C0666i.m3408a()
            android.content.Context r6 = r9.f2925a
            java.lang.String r7 = "tcp_a11"
            r2.m3426a(r6, r7, r5)
        L6f:
            r2 = 1
        L70:
            if (r2 != 0) goto L73
            return r1
        L73:
            android.content.Context r2 = r9.f2925a
            c.a.o.a r6 = r9.f2927c
            int r2 = p031c.p032a.p063g.C0621c.m3196a(r2, r6)
            if (r2 >= 0) goto L81
            r9.m3224d()
            return r1
        L81:
            if (r2 <= 0) goto Lb8
            r9.m3225e()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L93
            android.content.Context r0 = r9.f2925a
            p031c.p032a.p048P.p049a.C0557c.m2917k(r0)
            int r10 = r10 + (-1)
            goto L0
        L93:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "Action - onLoginFailed - respCode:"
            r10.<init>(r3)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            p031c.p032a.p066j.C0675a.m3465a(r0, r10)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r10.putInt(r4, r2)
            c.a.i.i r10 = p031c.p032a.p065i.C0666i.m3408a()
            android.content.Context r0 = r9.f2925a
            java.lang.String r2 = "tcp_a12"
            r10.m3426a(r0, r2, r5)
            return r1
        Lb8:
            c.a.i.i r10 = p031c.p032a.p065i.C0666i.m3408a()
            android.content.Context r0 = r9.f2925a
            java.lang.String r1 = "tcp_a10"
            r10.m3426a(r0, r1, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p063g.RunnableC0627i.m3222a(int):boolean");
    }

    /* renamed from: a */
    private boolean m3223a(Context context) {
        String str;
        C0675a.m3469c("NetworkingClient", "google:false");
        C0814c.m3962a(context);
        try {
            this.f2927c = new C0629k(C0630l.m3237a(context)).m3236a(this);
        } catch (Exception e2) {
            m3224d();
            str = "sis and connect failed:" + e2;
        }
        if (m3222a(2)) {
            return true;
        }
        str = "login failed";
        C0675a.m3475g("NetworkingClient", str);
        return false;
    }

    /* renamed from: d */
    private void m3224d() {
        C0675a.m3471d("NetworkingClient", "Action - closeConnection");
        C0822k.m4013a(this.f2927c);
        C0666i.m3408a().m3426a(this.f2925a, "tcp_a19", null);
    }

    /* renamed from: e */
    private void m3225e() {
        Context context = this.f2925a;
        C0617b<String> m3158b = C0617b.m3158b(true);
        m3158b.m3188a((C0617b<String>) null);
        C0617b<String> m3158b2 = C0617b.m3158b(false);
        m3158b2.m3188a((C0617b<String>) null);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3158b, m3158b2});
    }

    /* renamed from: a */
    public final synchronized void m3226a() {
        this.f2928d = Executors.newSingleThreadExecutor();
        try {
            this.f2928d.execute(this);
        } catch (Throwable th) {
            C0675a.m3476h("NetworkingClient", "execute networkingClient exception :" + th);
        }
    }

    /* renamed from: b */
    public final synchronized void m3227b() {
        C0675a.m3471d("NetworkingClient", "Action - stop");
        C0822k.m4013a(this.f2927c);
        this.f2926b = true;
        ExecutorService executorService = this.f2928d;
        if (executorService != null) {
            try {
                executorService.shutdown();
                if (!executorService.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                    if (!executorService.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                        C0675a.m3465a("NetworkingClient", "executor did not terminate");
                    }
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                C0675a.m3465a("NetworkingClient", "current thread is interrupted by self");
                Thread.currentThread().interrupt();
            } catch (Throwable th) {
                C0675a.m3475g("NetworkingClient", "shutDown e:" + th);
            }
        }
    }

    /* renamed from: c */
    public final AbstractC0688a m3228c() {
        return this.f2927c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0675a.m3474f("NetworkingClient", "Begin to run in ConnectingThread - id:" + Thread.currentThread().getId());
        try {
        } catch (Throwable th) {
            C0675a.m3472d("NetworkingClient", "run exception", th);
        }
        if (!m3223a(this.f2925a)) {
            C0675a.m3471d("NetworkingClient", "prepare Push Channel failed , returned");
            return;
        }
        while (!this.f2926b) {
            C0675a.m3471d("NetworkingClient", "Network listening...");
            try {
                ByteBuffer mo3556b = this.f2927c.mo3556b(0);
                C0557c.m2901a("NetworkingClient", new RunnableC0640v(this.f2925a, mo3556b.array()));
                C0675a.m3471d("NetworkingClient", "Received bytes - len:" + mo3556b.array().length + ", pkg:" + C0812a.m3932a(this.f2925a));
            } catch (C0663f e2) {
                C0675a.m3475g("NetworkingClient", " recv failed with error:" + e2 + " ,No Break!!");
            }
        }
        if (this.f2926b) {
            C0675a.m3471d("NetworkingClient", "Break receiving by wantStop");
        }
        m3224d();
    }
}
