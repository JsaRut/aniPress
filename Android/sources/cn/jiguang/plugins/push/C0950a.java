package cn.jiguang.plugins.push;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import cn.jiguang.plugins.push.p119a.C0951a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cn.jiguang.plugins.push.a */
/* loaded from: classes.dex */
public class C0950a implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C0951a.m4763a("onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C0951a.m4763a("onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0951a.m4763a("onActivityPaused");
        JPushModule.isAppForeground = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C0951a.m4763a("onActivityResumed");
        JPushModule.isAppForeground = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C0951a.m4763a("onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C0951a.m4763a("onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0951a.m4763a("onActivityStopped");
    }
}
