package p031c.p101b.p102a.p114l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p031c.p101b.p102a.C0869a;

@TargetApi(14)
/* renamed from: c.b.a.l.d */
/* loaded from: classes.dex */
public class C0925d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static int f3940a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (f3940a == 0) {
            C0923b.m4642a("ActivityLifeCallBack", "is Foreground");
            if (activity != null) {
                C0869a.m4239a(activity.getApplicationContext(), true);
            }
        }
        f3940a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = f3940a;
        if (i > 0) {
            f3940a = i - 1;
        }
        if (f3940a == 0) {
            C0923b.m4642a("ActivityLifeCallBack", "is not Foreground");
            if (activity != null) {
                C0869a.m4239a(activity.getApplicationContext(), false);
            }
        }
    }
}
