package p031c.p032a.p098x;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p061e.C0612k;
import p031c.p032a.p092s.C0831g;

@TargetApi(14)
/* renamed from: c.a.x.a */
/* loaded from: classes.dex */
public final class C0857a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static int f3611a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C0601d.m3072b("ActivityLifecycle", "onActivityCreated:" + activity.getClass().getCanonicalName());
        try {
            if (C0583a.f2795b != null) {
                C0583a.f2795b.mo3601a(activity, "onCreate");
            }
        } catch (Throwable unused) {
            C0601d.m3072b("ActivityLifecycle", "onActivityCreated failed");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            C0601d.m3075d("ActivityLifecycle", "onActivityPaused:" + activity.getClass().getCanonicalName());
            if (C0583a.f2795b != null) {
                C0583a.f2795b.mo3600a(activity);
            }
            if (C0583a.f2802i) {
                return;
            }
            C0858b.m4180a().m4193c(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            C0601d.m3075d("ActivityLifecycle", "onActivityResumed:" + activity.getClass().getCanonicalName());
            if (C0583a.f2795b != null) {
                C0583a.f2795b.mo3602b(activity);
            }
            if (C0583a.f2802i) {
                return;
            }
            C0858b.m4180a().m4191b(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C0601d.m3072b("ActivityLifecycle", "onActivityStarted:" + activity.getClass().getCanonicalName());
        try {
            if (f3611a == 0) {
                C0601d.m3072b("ActivityLifecycle", "isForeground");
                if (activity != null) {
                    C0583a.m2980a(activity.getApplicationContext(), false, 0L);
                    C0831g.m4072a(activity.getApplicationContext(), C0583a.f2797d, 29, null, null, 1);
                    C0595f.m3049a(activity.getApplicationContext(), true);
                }
                if (C0583a.f2795b != null) {
                    C0583a.f2795b.mo3601a(activity, "onStart");
                }
            }
            f3611a++;
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            C0601d.m3072b("ActivityLifecycle", "onActivityStopped:" + activity.getClass().getCanonicalName());
            if (f3611a > 0) {
                f3611a--;
            }
            if (f3611a == 0) {
                C0601d.m3072b("ActivityLifecycle", "is not Foreground");
                Context m2978a = C0583a.m2978a(activity);
                C0612k.m3134a(m2978a, (Object) null);
                C0612k.m3135a(m2978a, C0583a.f2797d, (Object) null);
                C0595f.m3049a(m2978a, false);
            }
        } catch (Throwable unused) {
        }
    }
}
