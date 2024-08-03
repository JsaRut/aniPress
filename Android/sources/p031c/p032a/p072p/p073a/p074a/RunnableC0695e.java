package p031c.p032a.p072p.p073a.p074a;

import p031c.p032a.p072p.p073a.p077c.C0723b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.p.a.a.e */
/* loaded from: classes.dex */
public final class RunnableC0695e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0723b f3198a;

    /* renamed from: b */
    final /* synthetic */ long f3199b;

    /* renamed from: c */
    final /* synthetic */ C0694d f3200c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0695e(C0694d c0694d, C0723b c0723b, long j) {
        this.f3200c = c0694d;
        this.f3198a = c0723b;
        this.f3199b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            c.a.p.a.c.b r0 = r8.f3198a
            if (r0 == 0) goto Lc9
            c.a.p.a.a.d r0 = r8.f3200c
            android.content.Context r0 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r0)
            if (r0 == 0) goto Lc9
            c.a.p.a.a.d r0 = r8.f3200c
            android.content.Context r0 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r0)
            p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3728a(r0)
            c.a.p.a.a.d r0 = r8.f3200c
            android.content.Context r0 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r0)
            java.lang.String r1 = "keyevent"
            java.util.ArrayList r0 = p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3736c(r0, r1)
            if (r0 != 0) goto L28
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L28:
            c.a.p.a.c.b r2 = r8.f3198a
            r0.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "new event json info:"
            r2.<init>(r3)
            c.a.p.a.c.b r3 = r8.f3198a
            org.json.JSONObject r3 = r3.mo3661a()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "EventManager"
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3716a(r3, r2)
            r2 = 0
            r4 = 4369(0x1111, float:6.122E-42)
            c.a.p.a.a.n r4 = p031c.p032a.p072p.p073a.p074a.C0697g.m3576a(r4)
            r5 = 1
            if (r4 == 0) goto L5d
            int r4 = r4.mo3579a()
            if (r4 <= 0) goto L5d
            java.lang.String r2 = "cache data, wait for period upload"
            goto L67
        L5d:
            long r6 = r8.f3199b
            boolean r4 = p031c.p032a.p072p.p073a.p080f.p087g.C0767i.m3820b(r6)
            if (r4 == 0) goto L6b
            java.lang.String r2 = "upload data too busy, give up this time"
        L67:
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3718b(r3, r2)
            goto L6c
        L6b:
            r5 = 0
        L6c:
            if (r5 == 0) goto La4
            c.a.p.a.a.d r2 = r8.f3200c
            android.content.Context r2 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r2)
            p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3728a(r2)
            c.a.p.a.a.d r2 = r8.f3200c
            android.content.Context r2 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r2)
            p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3732a(r2, r1, r0)
            c.a.p.a.c.b r0 = r8.f3198a
            c.a.p.a.b.h r0 = r0.m3664b()
            if (r0 == 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Event record success \n"
            r0.<init>(r1)
            c.a.p.a.c.b r1 = r8.f3198a
            c.a.p.a.b.h r1 = r1.m3664b()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3720c(r3, r0)
            return
        La4:
            org.json.JSONArray r0 = p031c.p032a.p072p.p073a.p074a.AbstractC0692b.m3565a(r0)
            c.a.p.a.a.d r2 = r8.f3200c
            android.content.Context r2 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r2)
            p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3728a(r2)
            c.a.p.a.a.d r2 = r8.f3200c
            android.content.Context r2 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r2)
            p031c.p032a.p072p.p073a.p080f.p082b.C0734a.m3735b(r2, r1)
            c.a.p.a.a.d r1 = r8.f3200c
            android.content.Context r1 = p031c.p032a.p072p.p073a.p074a.C0694d.m3568a(r1)
            c.a.s.m r2 = p031c.p032a.p092s.EnumC0837m.JANALYTICS
            java.lang.String r2 = r2.name()
            p031c.p032a.p092s.C0830f.m4061a(r1, r0, r2)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p074a.RunnableC0695e.run():void");
    }
}
