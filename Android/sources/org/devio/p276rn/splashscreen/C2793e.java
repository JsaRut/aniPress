package org.devio.p276rn.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;

/* renamed from: org.devio.rn.splashscreen.e */
/* loaded from: classes.dex */
public class C2793e {

    /* renamed from: a */
    private static Dialog f11453a;

    /* renamed from: b */
    private static WeakReference<Activity> f11454b;

    /* renamed from: a */
    public static void m11771a(Activity activity) {
        if (activity == null) {
            WeakReference<Activity> weakReference = f11454b;
            if (weakReference == null) {
                return;
            } else {
                activity = weakReference.get();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC2792d(activity));
    }

    /* renamed from: a */
    public static void m11772a(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        f11454b = new WeakReference<>(activity);
        activity.runOnUiThread(new RunnableC2791c(activity, i));
    }

    /* renamed from: a */
    public static void m11773a(Activity activity, boolean z) {
        m11772a(activity, z ? C2790b.SplashScreen_Fullscreen : C2790b.SplashScreen_SplashTheme);
    }

    /* renamed from: b */
    public static void m11774b(Activity activity) {
        m11773a(activity, false);
    }
}
