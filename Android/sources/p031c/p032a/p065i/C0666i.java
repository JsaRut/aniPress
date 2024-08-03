package p031c.p032a.p065i;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p063g.C0621c;
import p031c.p032a.p063g.RunnableC0627i;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0680b;
import p031c.p032a.p070n.RunnableC0686a;
import p031c.p032a.p090q.AbstractC0808a;
import p031c.p032a.p090q.C0809b;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0816e;

/* renamed from: c.a.i.i */
/* loaded from: classes.dex */
public final class C0666i {

    /* renamed from: a */
    private static volatile C0666i f3076a;

    /* renamed from: b */
    private static final Object f3077b = new Object();

    /* renamed from: c */
    private RunnableC0627i f3078c;

    /* renamed from: d */
    private int f3079d;

    /* renamed from: e */
    private int f3080e;

    /* renamed from: h */
    private long f3083h;

    /* renamed from: i */
    private boolean f3084i;

    /* renamed from: k */
    private Context f3086k;

    /* renamed from: f */
    private int f3081f = 0;

    /* renamed from: g */
    private int f3082g = 0;

    /* renamed from: l */
    private boolean f3087l = false;

    /* renamed from: m */
    private final AtomicBoolean f3088m = new AtomicBoolean(false);

    /* renamed from: n */
    private AbstractC0808a f3089n = new C0667j(this);

    /* renamed from: j */
    private boolean f3085j = true;

    private C0666i() {
    }

    /* renamed from: a */
    public static C0666i m3408a() {
        if (f3076a == null) {
            synchronized (f3077b) {
                if (f3076a == null) {
                    f3076a = new C0666i();
                }
            }
        }
        return f3076a;
    }

    /* renamed from: a */
    private synchronized void m3409a(Context context) {
        if (this.f3087l) {
            return;
        }
        if (context == null) {
            C0675a.m3469c("JCoreTCPManager", "init context is null");
            return;
        }
        C0675a.m3469c("JCoreTCPManager", "init tcp manager...");
        this.f3086k = context.getApplicationContext();
        C0557c.m2900a("JCoreTCPManager");
        C0809b.m3924a().m3926a(this.f3086k);
        C0664g.m3399a().m3404a(context, true);
        this.f3087l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m3410a(C0666i c0666i, Context context) {
        String str;
        C0675a.m3469c("JCoreTCPManager", "handleResume...");
        C0617b<Boolean> m3153a = C0617b.m3153a();
        m3153a.m3188a((C0617b<Boolean>) false);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3153a});
        if (c0666i.f3084i) {
            str = "[handleResume] is loggedin";
        } else {
            if (c0666i.f3078c == null) {
                c0666i.m3424h();
                return;
            }
            str = "[handleResume] tcp is connecting...";
        }
        C0675a.m3469c("JCoreTCPManager", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m3413b(C0666i c0666i, int i) {
        c0666i.f3079d = i;
        if (i == 1012) {
            C0621c.m3197a(c0666i.f3086k);
        }
        c0666i.m3420f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m3414b(C0666i c0666i, Context context) {
        C0675a.m3469c("JCoreTCPManager", "handleStop...");
        if (((Boolean) C0618c.m3190a(context, C0617b.m3153a())).booleanValue()) {
            C0675a.m3471d("JCoreTCPManager", "tcp already stoped");
            return;
        }
        C0659b.m3371a();
        if (!C0659b.m3377a(0)) {
            C0675a.m3469c("JCoreTCPManager", "Action: handleStopPush - can't stop tcp");
            return;
        }
        C0617b<Boolean> m3153a = C0617b.m3153a();
        m3153a.m3188a((C0617b<Boolean>) true);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3153a});
        c0666i.m3420f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3415c(Bundle bundle) {
        if (this.f3088m.get()) {
            C0675a.m3469c("JCoreTCPManager", "isBeating, skip this time");
            return;
        }
        if (!(bundle != null ? bundle.getBoolean("force", false) : false)) {
            if (System.currentTimeMillis() - this.f3083h < 18000) {
                C0675a.m3469c("JCoreTCPManager", "No need to rtc, Because it have succeed recently");
                return;
            }
        }
        C0675a.m3471d("JCoreTCPManager", "Send heart beat");
        C0809b.m3924a().m3928b(1005);
        if (!this.f3084i) {
            C0675a.m3469c("JCoreTCPManager", "socket is closed or push isn't login");
            return;
        }
        this.f3088m.set(true);
        C0809b.m3924a().m3928b(1022);
        Long valueOf = Long.valueOf(C0621c.m3203b(this.f3086k));
        long m2911e = C0557c.m2911e(this.f3086k);
        C0675a.m3469c("JCoreTCPManager", "heartbeat - juid:" + m2911e + ", flag:1");
        long longValue = valueOf.longValue();
        int i = C0556b.f2706f;
        C0816e c0816e = new C0816e(20480);
        c0816e.m3979b(0);
        c0816e.m3974a(4);
        c0816e.m3974a(2);
        c0816e.m3981b(longValue);
        c0816e.m3976a(i);
        c0816e.m3981b(m2911e);
        c0816e.m3974a(1);
        c0816e.m3980b(c0816e.m3973a(), 0);
        byte[] m3496a = C0680b.m3496a(this.f3086k, c0816e.m3982b());
        if (m3496a != null) {
            this.f3078c.m3228c().mo3555a(m3496a);
        } else {
            C0675a.m3476h("JCoreTCPManager", "send hb failed:sendData is null");
        }
        C0809b.m3924a().m3929b(1022, 10000L, this.f3089n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m3417d(C0666i c0666i) {
        C0675a.m3471d("JCoreTCPManager", "Action - onDisconnected");
        if (c0666i.f3084i) {
            c0666i.f3084i = false;
            C0659b.m3371a().m3385a(c0666i.f3086k, -1, -1, "push connect break");
        }
        if (c0666i.f3078c == null && ((Boolean) C0618c.m3190a(c0666i.f3086k, C0617b.m3153a())).booleanValue()) {
            C0675a.m3469c("JCoreTCPManager", "push already stopped!!!");
            return;
        }
        c0666i.f3082g = 0;
        c0666i.m3420f();
        c0666i.m3422g();
        c0666i.f3081f++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m3418e(C0666i c0666i) {
        C0675a.m3471d("JCoreTCPManager", "Action - onLoggedIn");
        if (!c0666i.f3084i) {
            c0666i.f3084i = true;
            C0659b.m3371a().m3385a(c0666i.f3086k, 1, 0, "success");
        }
        c0666i.m3428b();
        c0666i.f3081f = 0;
        c0666i.f3082g = 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("login", true);
        C0661d.m3386a(c0666i.f3086k, "periodtask", bundle);
        if (c0666i.m3419e()) {
            C0809b.m3924a().m3929b(2000, 2000L, c0666i.f3089n);
            RunnableC0686a.m3523a().m3536a(c0666i.f3086k);
            C0672o.m3448a().m3452a(c0666i.f3086k);
            C0664g.m3399a().m3404a(c0666i.f3086k, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m3419e() {
        if (C0557c.m2923q(this.f3086k) || C0674q.m3457a().m3463b(this.f3086k)) {
            return true;
        }
        C0675a.m3469c("JCoreTCPManager", "not keep tcp");
        this.f3085j = false;
        m3420f();
        return false;
    }

    /* renamed from: f */
    private void m3420f() {
        RunnableC0627i runnableC0627i = this.f3078c;
        if (runnableC0627i == null) {
            C0675a.m3469c("JCoreTCPManager", "tcp has stopeed");
        } else {
            runnableC0627i.m3227b();
            this.f3078c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ void m3421f(C0666i c0666i) {
        c0666i.f3088m.set(false);
        c0666i.f3082g++;
        C0675a.m3471d("JCoreTCPManager", "Action - onHeartbeatTimeout - timeoutTimes:" + c0666i.f3082g);
        C0675a.m3467b("JCoreTCPManager", "============================================================");
        if (c0666i.f3078c != null && !c0666i.f3084i) {
            C0675a.m3471d("JCoreTCPManager", "Is connecting now. Give up to retry.");
            return;
        }
        if (!c0666i.f3084i || c0666i.f3082g > 1) {
            c0666i.m3420f();
            c0666i.m3422g();
        } else {
            C0675a.m3471d("JCoreTCPManager", "Already logged in. Give up to retry.");
            C0809b.m3924a().m3929b(1005, 5000L, c0666i.f3089n);
        }
    }

    /* renamed from: g */
    private void m3422g() {
        C0675a.m3471d("JCoreTCPManager", "Action - retryConnect - disconnectedTimes:" + this.f3081f);
        if (!C0812a.m3947c(this.f3086k.getApplicationContext())) {
            C0675a.m3469c("JCoreTCPManager", "[retryConnect] network is not connect");
            return;
        }
        if (this.f3080e > 0) {
            C0675a.m3469c("JCoreTCPManager", "[retryConnect] registerErrCode >0,registerErrCode:" + this.f3080e);
            return;
        }
        int m3940b = C0812a.m3940b(this.f3086k.getApplicationContext());
        int pow = (int) (Math.pow(2.0d, this.f3081f) * 3.0d * 1000.0d);
        int i = C0556b.f2702b;
        int i2 = (i * 1000) / 2;
        if (pow > i2) {
            pow = i2;
        }
        C0675a.m3469c("JCoreTCPManager", "[retryConnect] mDisconnectedTimes:" + this.f3081f + ",chargedLever:" + m3940b + ",heartbeatInterval:" + i + ",delayTime:" + pow);
        if (m3940b != 1 ? this.f3081f >= 5 : this.f3081f >= 30) {
            C0675a.m3469c("JCoreTCPManager", "Give up to retry connect.");
        } else if (C0809b.m3924a().m3927a(1011)) {
            C0675a.m3469c("JCoreTCPManager", "Already has MSG_RESTART_CONN");
        } else {
            C0809b.m3924a().m3929b(1011, pow, this.f3089n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ void m3423g(C0666i c0666i) {
        C0675a.m3471d("JCoreTCPManager", "Action - onHeartbeatSucceed");
        C0659b.m3371a().m3385a(c0666i.f3086k, 19, 0, "ack success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m3424h() {
        C0675a.m3471d("JCoreTCPManager", "Action - restartNetworkingClient, pid:" + Process.myPid());
        if (!this.f3085j) {
            C0675a.m3474f("JCoreTCPManager", "need not keep tcp,next start app will re login");
            return;
        }
        if (!C0812a.m3947c(this.f3086k.getApplicationContext())) {
            C0675a.m3474f("JCoreTCPManager", "No network connection. Give up to start connection thread.");
            return;
        }
        if (((Boolean) C0618c.m3190a(this.f3086k, C0617b.m3153a())).booleanValue()) {
            C0675a.m3471d("JCoreTCPManager", "[restartNetworkingClient] tcp has close by active");
            return;
        }
        if (this.f3080e != 1005 && this.f3080e != 1006 && this.f3080e != 1008 && this.f3080e != 1009) {
            if (this.f3079d == 102) {
                C0675a.m3476h("JCoreTCPManager", "login failed:102,give up start connection thread.reset from next app start");
                return;
            } else if (this.f3078c != null) {
                C0675a.m3471d("JCoreTCPManager", "NetworkingClient is running");
                return;
            } else {
                this.f3078c = new RunnableC0627i(this.f3086k.getApplicationContext());
                this.f3078c.m3226a();
                return;
            }
        }
        C0675a.m3469c("JCoreTCPManager", "[restartNetworkingClient] registerErrCode >0,registerErrCode:" + this.f3080e);
    }

    /* renamed from: a */
    public final void m3426a(Context context, String str, Bundle bundle) {
        m3409a(context);
        C0557c.m2901a("JCoreTCPManager", new RunnableC0668k(this, context, str, bundle));
    }

    /* renamed from: a */
    public final void m3427a(Bundle bundle) {
        long j;
        if (((Boolean) C0618c.m3190a(this.f3086k, C0617b.m3153a())).booleanValue()) {
            C0675a.m3471d("JCoreTCPManager", "[rtc] tcp has close by active");
            return;
        }
        boolean z = true;
        if (bundle != null) {
            z = bundle.getBoolean("force", true);
            j = bundle.getLong("delay_time", 0L);
        } else {
            j = 0;
        }
        if (this.f3078c == null) {
            m3424h();
            return;
        }
        if (j <= 0) {
            m3415c(bundle);
        } else {
            if (z) {
                C0809b.m3924a().m3928b(1005);
                C0809b.m3924a().m3928b(1004);
            }
            C0809b.m3924a().m3929b(z ? 1004 : 1005, j, this.f3089n);
        }
        C0675a.m3473e("JCoreTCPManager", "send rtc force=" + z + " delay=" + j);
    }

    /* renamed from: b */
    public final void m3428b() {
        C0809b.m3924a().m3928b(1022);
        this.f3083h = System.currentTimeMillis();
        this.f3082g = 0;
        this.f3088m.set(false);
        C0675a.m3473e("JCoreTCPManager", "update rtc state");
    }

    /* renamed from: b */
    public final void m3429b(Bundle bundle) {
        if (((Boolean) C0618c.m3190a(this.f3086k, C0617b.m3153a())).booleanValue()) {
            C0675a.m3475g("JCoreTCPManager", "[netWorkChanged] tcp has close by active");
            return;
        }
        C0809b.m3924a().m3928b(1006);
        C0809b.m3924a().m3928b(1007);
        if (!bundle.getBoolean("connected", false)) {
            C0675a.m3469c("JCoreTCPManager", "Handle disconnected state.");
            C0809b.m3924a().m3929b(1007, 3000L, this.f3089n);
            return;
        }
        C0675a.m3469c("JCoreTCPManager", "Handle connected state.");
        if (this.f3078c == null) {
            m3424h();
        } else {
            C0809b.m3924a().m3929b(1006, 3000L, this.f3089n);
        }
    }

    /* renamed from: c */
    public final RunnableC0627i m3430c() {
        return this.f3078c;
    }

    /* renamed from: d */
    public final boolean m3431d() {
        return this.f3084i;
    }
}
