package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import android.os.SystemClock;
import p031c.p032a.p072p.p073a.p077c.C0724c;
import p031c.p032a.p072p.p073a.p077c.C0725d;
import p031c.p032a.p072p.p073a.p077c.C0726e;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0767i;
import p031c.p032a.p092s.C0830f;
import p031c.p032a.p092s.EnumC0837m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.p.a.a.l */
/* loaded from: classes.dex */
public final class RunnableC0702l implements Runnable {

    /* renamed from: a */
    private int f3215a;

    /* renamed from: b */
    private Context f3216b;

    /* renamed from: c */
    private String f3217c;

    /* renamed from: d */
    private long f3218d = SystemClock.uptimeMillis();

    /* renamed from: e */
    final /* synthetic */ C0700j f3219e;

    public RunnableC0702l(C0700j c0700j, int i, Context context, String str) {
        Context context2;
        Context context3;
        this.f3219e = c0700j;
        this.f3215a = i;
        this.f3216b = context;
        this.f3217c = str;
        if (this.f3216b == null) {
            context2 = c0700j.f3207d;
            if (context2 != null) {
                context3 = c0700j.f3207d;
                this.f3216b = context3.getApplicationContext();
            }
        }
    }

    /* renamed from: a */
    private void m3598a() {
        C0726e c0726e;
        C0726e c0726e2;
        c0726e = this.f3219e.f3205b;
        if (c0726e == null) {
            C0732b.m3723f("SessionManager", "please call onResume in your activity");
            return;
        }
        C0700j.m3591d(this.f3219e);
        this.f3219e.m3590d();
        StringBuilder sb = new StringBuilder("onPause :");
        c0726e2 = this.f3219e.f3205b;
        sb.append(c0726e2.mo3661a().toString());
        C0732b.m3718b("SessionManager", sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            if (r0 == null) goto L8;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3599a(android.content.Context r6) {
        /*
            r5 = this;
            c.a.p.a.f.b.a r0 = p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3728a(r6)
            r1 = 0
            java.lang.String r3 = "lastpausetime"
            long r3 = r0.m3739b(r3, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            long r2 = p031c.p032a.p072p.p073a.C0727d.f3304e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L23
        L1b:
            c.a.p.a.a.j r0 = r5.f3219e
            c.a.p.a.c.e r0 = p031c.p032a.p072p.p073a.p074a.C0700j.m3586b(r0)
            if (r0 != 0) goto L28
        L23:
            c.a.p.a.a.j r0 = r5.f3219e
            p031c.p032a.p072p.p073a.p074a.C0700j.m3584a(r0, r6)
        L28:
            c.a.p.a.a.j r6 = r5.f3219e
            p031c.p032a.p072p.p073a.p074a.C0700j.m3589c(r6)
            c.a.p.a.a.o r6 = p031c.p032a.p072p.p073a.p074a.C0705o.m3605b()
            r6.m3609c()
            r6 = 4369(0x1111, float:6.122E-42)
            r0 = 0
            p031c.p032a.p072p.p073a.p074a.C0697g.m3578a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p074a.RunnableC0702l.m3599a(android.content.Context):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C0725d c0725d;
        C0725d c0725d2;
        C0725d c0725d3;
        C0726e c0726e;
        C0725d c0725d4;
        C0725d c0725d5;
        C0725d c0725d6;
        C0726e c0726e2;
        C0725d c0725d7;
        boolean z2;
        C0725d c0725d8;
        C0725d c0725d9;
        C0725d c0725d10;
        Context context = this.f3216b;
        if (context == null) {
            C0732b.m3726i("SessionManager", "action context is null");
            return;
        }
        int i = this.f3215a;
        if (i == C0701k.f3210a) {
            m3599a(context);
            return;
        }
        if (i == C0701k.f3211b) {
            m3598a();
            return;
        }
        if (i == C0701k.f3212c) {
            String str = this.f3217c;
            C0732b.m3718b("SessionManager", "Action - pageStart pageName:" + str);
            z2 = this.f3219e.f3209f;
            if (!z2) {
                m3599a(context);
            }
            c0725d8 = this.f3219e.f3206c;
            if (c0725d8 != null) {
                c0725d10 = this.f3219e.f3206c;
                if (str.equals(c0725d10.m3680b())) {
                    C0732b.m3721d("SessionManager", "same page,re generatePage");
                }
            }
            C0725d m3583a = C0700j.m3583a(this.f3219e, str);
            C0724c c0724c = new C0724c();
            c0724c.m3669a(context);
            if (m3583a != null) {
                m3583a.m3677a(c0724c);
                this.f3219e.f3206c = m3583a;
                StringBuilder sb = new StringBuilder("onPageStart :");
                c0725d9 = this.f3219e.f3206c;
                sb.append(c0725d9.mo3661a().toString());
                C0732b.m3720c("SessionManager", sb.toString());
                return;
            }
            return;
        }
        if (i == C0701k.f3213d) {
            String str2 = this.f3217c;
            long j = this.f3218d;
            C0732b.m3718b("SessionManager", "Action - onPageEnd pageName:" + str2);
            z = this.f3219e.f3209f;
            if (!z) {
                m3598a();
            }
            c0725d = this.f3219e.f3206c;
            if (c0725d == null) {
                C0732b.m3724g("SessionManager", "please call onPageStart in your activities or fragments with pageName :" + str2);
                return;
            }
            c0725d2 = this.f3219e.f3206c;
            if (!c0725d2.m3680b().equals(str2)) {
                C0732b.m3724g("SessionManager", "please call onPageStart in your activities or fragments with pageName :" + str2);
                return;
            }
            c0725d3 = this.f3219e.f3206c;
            int m3683c = c0725d3.m3683c();
            c0726e = this.f3219e.f3205b;
            if (m3683c != c0726e.m3692c()) {
                C0732b.m3724g("SessionManager", "please make sure not repeat call onPageEnd at one time");
                return;
            }
            c0725d4 = this.f3219e.f3206c;
            c0725d4.m3681b(System.currentTimeMillis());
            C0724c c0724c2 = new C0724c();
            c0724c2.m3669a(context);
            c0725d5 = this.f3219e.f3206c;
            c0725d5.m3682b(c0724c2);
            StringBuilder sb2 = new StringBuilder("onPageEnd :");
            c0725d6 = this.f3219e.f3206c;
            sb2.append(c0725d6.mo3661a().toString());
            C0732b.m3720c("SessionManager", sb2.toString());
            c0726e2 = this.f3219e.f3205b;
            c0725d7 = this.f3219e.f3206c;
            c0726e2.m3687a(c0725d7);
            this.f3219e.m3590d();
            AbstractRunnableC0704n m3576a = C0697g.m3576a(4369);
            if (m3576a != null && m3576a.mo3579a() > 0) {
                C0732b.m3718b("SessionManager", "cache data, wait for period upload");
            } else if (C0767i.m3820b(j)) {
                C0732b.m3718b("SessionManager", "upload data too busy, give up this time");
            } else {
                C0830f.m4061a(context, this.f3219e.mo3566a(), EnumC0837m.JANALYTICS.name());
            }
        }
    }
}
