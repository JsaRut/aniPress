package p031c.p032a.p072p.p073a.p074a;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p077c.C0724c;
import p031c.p032a.p072p.p073a.p077c.C0725d;
import p031c.p032a.p072p.p073a.p077c.C0726e;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p082b.C0734a;
import p031c.p032a.p072p.p073a.p080f.p087g.C0759a;
import p031c.p032a.p072p.p073a.p080f.p087g.C0763e;
import p031c.p032a.p072p.p073a.p080f.p087g.C0766h;
import p031c.p032a.p072p.p073a.p088g.C0776d;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.a.j */
/* loaded from: classes.dex */
public final class C0700j extends AbstractC0692b {

    /* renamed from: a */
    private static C0700j f3204a;

    /* renamed from: b */
    private C0726e f3205b;

    /* renamed from: c */
    private C0725d f3206c;

    /* renamed from: d */
    private Context f3207d;

    /* renamed from: e */
    private AtomicBoolean f3208e = new AtomicBoolean();

    /* renamed from: f */
    private boolean f3209f;

    private C0700j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C0725d m3583a(C0700j c0700j, String str) {
        C0732b.m3716a("SessionManager", "Action - generatePageEntity pageName:" + str);
        if (c0700j.f3205b == null) {
            C0732b.m3723f("SessionManager", "please check something about session...");
            c0700j.m3587b(c0700j.f3207d);
        }
        C0725d c0725d = new C0725d();
        c0725d.m3676a(System.currentTimeMillis());
        c0725d.m3681b(System.currentTimeMillis());
        c0725d.m3679a(str);
        C0725d m3689b = c0700j.f3205b.m3689b();
        if (m3689b != null) {
            c0725d.m3678a(m3689b);
        }
        c0725d.m3675a(c0700j.f3205b.m3692c());
        return c0725d;
    }

    /* renamed from: b */
    public static C0700j m3585b() {
        if (f3204a == null) {
            f3204a = new C0700j();
        }
        return f3204a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m3587b(Context context) {
        m3588c();
        this.f3205b = new C0726e();
        long m3739b = C0734a.m3728a(context).m3739b("lastresumetime", System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        String m4048a = C0830f.m4048a();
        if (!C0766h.m3815a(m4048a)) {
            sb.append(m4048a);
        }
        String m4049a = C0830f.m4049a(context);
        if (!C0766h.m3815a(m4049a)) {
            sb.append(m4049a);
        }
        sb.append(m3739b);
        String m3799a = C0759a.m3799a(sb.toString());
        this.f3205b.m3685a(System.currentTimeMillis());
        this.f3205b.m3690b(System.currentTimeMillis());
        this.f3205b.m3688a(m3799a);
        C0724c c0724c = new C0724c();
        c0724c.m3669a(context);
        this.f3205b.m3691b(c0724c);
        this.f3206c = null;
        C0776d.m3862a(C0707b.m3613a(context), true);
    }

    /* renamed from: c */
    private synchronized void m3588c() {
        if (this.f3207d != null) {
            Object m3729a = C0734a.m3729a(this.f3207d, "keycursession");
            if (m3729a != null && (m3729a instanceof C0726e)) {
                C0734a.m3735b(this.f3207d, "keycursession");
                C0726e c0726e = (C0726e) m3729a;
                ArrayList m3736c = C0734a.m3736c(this.f3207d, "keysession");
                if (m3736c == null) {
                    m3736c = new ArrayList();
                } else if (m3736c.remove(c0726e)) {
                    C0732b.m3721d("SessionManager", "have same session...");
                }
                c0726e.m3694e();
                m3736c.add(c0726e);
                C0734a.m3732a(this.f3207d, "keysession", m3736c);
                return;
            }
            C0732b.m3721d("SessionManager", "last session is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m3589c(C0700j c0700j) {
        C0732b.m3716a("SessionManager", "Action - flushSessionWithResume");
        C0734a.m3728a(c0700j.f3207d).m3738a("lastresumetime", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m3590d() {
        if (this.f3205b != null && this.f3207d != null) {
            C0732b.m3716a("SessionManager", "save cur session :" + this.f3205b.mo3661a().toString());
            this.f3205b.m3690b(System.currentTimeMillis());
            C0724c c0724c = new C0724c();
            c0724c.m3669a(this.f3207d);
            this.f3205b.m3686a(c0724c);
            C0734a.m3731a(this.f3207d, "keycursession", this.f3205b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ void m3591d(C0700j c0700j) {
        C0732b.m3716a("SessionManager", "Action - flushSessionWithPause");
        C0734a.m3728a(c0700j.f3207d).m3738a("lastpausetime", System.currentTimeMillis());
    }

    @Override // p031c.p032a.p072p.p073a.p074a.AbstractC0692b
    /* renamed from: a */
    public final Object mo3566a() {
        Object m3729a;
        Context context = this.f3207d;
        if (context == null) {
            C0732b.m3724g("SessionManager", "context is null,can not load data");
            return null;
        }
        JSONArray m3565a = AbstractC0692b.m3565a(C0734a.m3736c(context, "keysession"));
        C0734a.m3735b(this.f3207d, "keysession");
        if (this.f3205b == null && (m3729a = C0734a.m3729a(this.f3207d, "keycursession")) != null && (m3729a instanceof C0726e)) {
            this.f3205b = (C0726e) m3729a;
        }
        C0726e c0726e = this.f3205b;
        if (c0726e != null) {
            boolean isEmpty = c0726e.m3693d().isEmpty();
            if (!isEmpty || this.f3205b.m3695f()) {
                if (m3565a == null) {
                    m3565a = new JSONArray();
                }
                JSONObject mo3661a = this.f3205b.mo3661a();
                C0732b.m3718b("SessionManager", "current session=" + this.f3205b);
                m3565a.put(mo3661a);
            }
            if (!isEmpty) {
                this.f3205b.m3696g();
                C0734a.m3731a(this.f3207d, "keycursession", this.f3205b);
            }
        }
        if (C0763e.m3809a(m3565a)) {
            return null;
        }
        return m3565a;
    }

    /* renamed from: a */
    public final void m3595a(Context context) {
        if (this.f3208e.get()) {
            return;
        }
        if (context == null) {
            C0732b.m3724g("SessionManager", "context is null,init failed");
            return;
        }
        this.f3207d = context.getApplicationContext();
        C0830f.m4055a(new C0703m(this));
        C0705o.m3605b().m3608a(this);
        this.f3208e.set(true);
    }

    /* renamed from: a */
    public final void m3596a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C0732b.m3723f("SessionManager", "onPageStart pageName is null");
        } else {
            C0830f.m4059a("ANALYTICS", new RunnableC0702l(this, C0701k.f3212c, C0707b.m3613a(context), str), new int[0]);
        }
    }

    /* renamed from: b */
    public final void m3597b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C0732b.m3723f("SessionManager", "onPageEnd pageName is null");
        } else {
            C0830f.m4059a("ANALYTICS", new RunnableC0702l(this, C0701k.f3213d, context.getApplicationContext(), str), new int[0]);
        }
    }
}
