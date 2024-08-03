package p031c.p032a.p072p.p073a.p080f;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p075b.p076a.C0709a;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p088g.C0784l;
import p031c.p032a.p072p.p073a.p088g.C0789q;
import p031c.p032a.p072p.p073a.p089h.C0804o;

/* renamed from: c.a.p.a.f.a */
/* loaded from: classes.dex */
public final class C0730a {

    /* renamed from: a */
    private static final Object f3311a = new Object();

    /* renamed from: b */
    private static C0730a f3312b;

    /* renamed from: c */
    private final AtomicInteger f3313c = new AtomicInteger(0);

    /* renamed from: d */
    private WeakReference<Activity> f3314d = new WeakReference<>(null);

    /* renamed from: e */
    private boolean f3315e = false;

    /* renamed from: f */
    private int f3316f;

    private C0730a() {
    }

    /* renamed from: a */
    public static C0730a m3703a() {
        if (f3312b == null) {
            synchronized (f3311a) {
                if (f3312b == null) {
                    f3312b = new C0730a();
                }
            }
        }
        return f3312b;
    }

    /* renamed from: a */
    public static void m3704a(Activity activity) {
        C0732b.m3718b("ActivityLifeManager", activity + " onActivityCreated");
        if (!C0789q.m3898b()) {
            C0732b.m3724g("ActivityLifeManager", "janalytics-visual-bury is not work");
            return;
        }
        try {
            View m3794b = C0758g.m3794b(activity);
            if (m3794b instanceof ViewGroup) {
                m3794b.setTag(-16769024, C0758g.m3790a(activity));
                m3794b.setTag(-16769023, 0);
                m3794b.setTag(-16769022, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m3705a(Activity activity, Bundle bundle) {
        C0732b.m3718b("ActivityLifeManager", activity + " onActivityCreate, bundle=" + bundle);
        if (C0789q.m3898b()) {
            C0707b.m3614a(activity.getIntent(), activity);
        } else {
            C0732b.m3724g("ActivityLifeManager", "janalytics-visual-bury is not work");
        }
    }

    /* renamed from: b */
    public static void m3706b(Activity activity, Bundle bundle) {
        C0732b.m3718b("ActivityLifeManager", activity + " onActivitySaveInstanceState, bundle=" + bundle);
    }

    /* renamed from: d */
    public static void m3707d(Activity activity) {
        C0732b.m3718b("ActivityLifeManager", activity + " onActivityPaused");
        C0709a.m3633a(activity);
    }

    /* renamed from: f */
    public static void m3708f(Activity activity) {
        C0732b.m3718b("ActivityLifeManager", activity + " onActivityDestroyed");
    }

    /* renamed from: b */
    public final void m3709b(Activity activity) {
        C0732b.m3718b("ActivityLifeManager", activity + " onActivityStarted");
        this.f3313c.incrementAndGet();
    }

    /* renamed from: b */
    public final boolean m3710b() {
        return this.f3313c.get() > 0;
    }

    /* renamed from: c */
    public final Activity m3711c() {
        return this.f3314d.get();
    }

    /* renamed from: c */
    public final void m3712c(Activity activity) {
        try {
            C0732b.m3718b("ActivityLifeManager", activity + " onActivityResumed");
            this.f3314d = new WeakReference<>(activity);
            this.f3316f = activity.getWindow().getDecorView().hashCode();
            C0732b.m3718b("ActivityLifeManager", "rootActivityViewCode:" + this.f3316f);
            C0709a.m3635b(activity);
            if (C0789q.m3898b()) {
                C0758g.m3796c(activity);
                if (!this.f3315e) {
                    C0804o.m3915a(activity, true, false);
                }
            }
            this.f3315e = true;
        } catch (Throwable th) {
            C0732b.m3725h("ActivityLifeManager", "onActivityResumed e:" + th);
        }
    }

    /* renamed from: d */
    public final int m3713d() {
        return this.f3316f;
    }

    /* renamed from: e */
    public final void m3714e(Activity activity) {
        try {
            C0732b.m3718b("ActivityLifeManager", activity + " onActivityStopped");
            this.f3313c.decrementAndGet();
            boolean m3898b = C0789q.m3898b();
            if (m3898b) {
                C0784l.m3878a().m3885a(C0758g.m3794b(activity), System.currentTimeMillis());
            }
            if (m3710b()) {
                return;
            }
            this.f3315e = false;
            if (m3898b) {
                C0804o.m3920c();
            }
        } catch (Throwable th) {
            C0732b.m3725h("ActivityLifeManager", "onActivityStopped e:" + th);
        }
    }
}
