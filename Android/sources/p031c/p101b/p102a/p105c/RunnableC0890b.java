package p031c.p101b.p102a.p105c;

import android.content.Context;
import p031c.p101b.p102a.p114l.C0923b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.b.a.c.b */
/* loaded from: classes.dex */
public class RunnableC0890b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f3776a;

    /* renamed from: b */
    final /* synthetic */ C0891c f3777b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0890b(C0891c c0891c, long j) {
        this.f3777b = c0891c;
        this.f3776a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        long m4397a;
        int i;
        int i2;
        int i3;
        String m4407d;
        long m4409f;
        long m4408e;
        try {
            context = this.f3777b.f3782e;
            C0892d m4388a = C0892d.m4388a(context);
            C0893e m4394a = m4388a.m4394a(this.f3776a, 0);
            if (m4394a != null) {
                if (m4394a.m4404c() == 1) {
                    C0923b.m4642a("JPushLocalNotificationCenter", "remove ");
                    m4397a = m4394a.m4397a();
                    i = 0;
                    i2 = 1;
                    i3 = 0;
                    m4407d = m4394a.m4407d();
                    m4409f = m4394a.m4409f();
                    m4408e = m4394a.m4408e();
                } else {
                    if (m4394a.m4401b() > 1) {
                        C0923b.m4642a("JPushLocalNotificationCenter", "repeat add");
                        m4388a.m4396b(m4394a.m4397a(), m4394a.m4401b() - 1, 0, 0, m4394a.m4407d(), m4394a.m4409f(), m4394a.m4408e());
                        return;
                    }
                    if (m4394a.m4401b() != 1) {
                        C0923b.m4642a("JPushLocalNotificationCenter", "already triggered");
                        return;
                    }
                    C0923b.m4642a("JPushLocalNotificationCenter", "send broadcast");
                    if (m4394a.m4409f() > System.currentTimeMillis()) {
                        C0923b.m4642a("JPushLocalNotificationCenter", "repeat add");
                        return;
                    }
                    C0891c c0891c = this.f3777b;
                    context2 = this.f3777b.f3782e;
                    c0891c.m4379a(context2, m4394a.m4407d());
                    m4397a = m4394a.m4397a();
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    m4407d = m4394a.m4407d();
                    m4409f = m4394a.m4409f();
                    m4408e = m4394a.m4408e();
                }
                m4388a.m4396b(m4397a, i, i2, i3, m4407d, m4409f, m4408e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            C0923b.m4646c("JPushLocalNotificationCenter", "exception:" + e2.getMessage());
        }
    }
}
