package p031c.p032a.p072p.p073a.p080f.p087g;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p031c.p032a.p072p.p073a.p080f.C0730a;

/* renamed from: c.a.p.a.f.g.f */
/* loaded from: classes.dex */
public final class C0764f implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C0730a.m3703a();
        C0730a.m3705a(activity, bundle);
        C0730a.m3703a();
        C0730a.m3704a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C0730a.m3703a();
        C0730a.m3708f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0730a.m3703a();
        C0730a.m3707d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0730a.m3703a().m3712c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C0730a.m3703a();
        C0730a.m3706b(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C0730a.m3703a().m3709b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C0730a.m3703a().m3714e(activity);
    }
}
