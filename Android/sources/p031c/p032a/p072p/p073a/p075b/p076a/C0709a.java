package p031c.p032a.p072p.p073a.p075b.p076a;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.ActivityC0208o;
import android.support.v4.app.ComponentCallbacksC0205l;
import android.view.View;
import p031c.p032a.p072p.p073a.p075b.C0717i;
import p031c.p032a.p072p.p073a.p078d.C0728a;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p087g.C0769k;
import p031c.p032a.p072p.p073a.p088g.C0784l;

/* renamed from: c.a.p.a.b.a.a */
/* loaded from: classes.dex */
public class C0709a {
    /* renamed from: a */
    public static void m3631a(View view) {
        if (view == null) {
            return;
        }
        C0784l.m3878a().m3886a(view, System.currentTimeMillis(), false);
    }

    /* renamed from: a */
    public static void m3632a(C0728a c0728a) {
        C0784l.m3878a().m3887a(c0728a, System.currentTimeMillis());
    }

    /* renamed from: a */
    public static void m3633a(Object obj) {
        Context activity;
        String canonicalName;
        try {
            if (obj == null) {
                C0732b.m3720c("JMMIAgent_xxx", "onPause object is null");
                return;
            }
            C0732b.m3720c("JMMIAgent_xxx", "onPause object name:" + obj.getClass().getCanonicalName());
            if (obj instanceof ActivityC0208o) {
                activity = (Context) obj;
                canonicalName = obj.getClass().getCanonicalName();
            } else if (obj instanceof Activity) {
                activity = (Context) obj;
                canonicalName = obj.getClass().getCanonicalName();
            } else {
                if (Build.VERSION.SDK_INT < 11 || !(obj instanceof Fragment)) {
                    if (C0769k.m3830d(obj) && !((ComponentCallbacksC0205l) obj).m912E() && ((ComponentCallbacksC0205l) obj).m1006z()) {
                        C0717i.m3648a(((ComponentCallbacksC0205l) obj).m968d(), obj.getClass().getCanonicalName());
                        return;
                    }
                    return;
                }
                if (((Fragment) obj).isHidden()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 15 && !((Fragment) obj).getUserVisibleHint()) {
                    return;
                }
                activity = ((Fragment) obj).getActivity();
                canonicalName = obj.getClass().getCanonicalName();
            }
            C0717i.m3648a(activity, canonicalName);
        } catch (Throwable th) {
            C0732b.m3725h("JMMIAgent_xxx", "onPause e:" + th);
        }
    }

    /* renamed from: b */
    public static void m3634b(View view) {
        if (view == null) {
            return;
        }
        C0784l.m3878a().m3886a(view, System.currentTimeMillis(), true);
    }

    /* renamed from: b */
    public static void m3635b(Object obj) {
        Context activity;
        Class<?> cls;
        if (obj == null) {
            C0732b.m3720c("JMMIAgent_xxx", "onResume object is null");
            return;
        }
        try {
            C0732b.m3720c("JMMIAgent_xxx", "onResume object name:" + obj.getClass().getCanonicalName());
            if (C0769k.m3829c(obj)) {
                activity = (Context) obj;
                cls = obj.getClass();
            } else if (obj instanceof Activity) {
                activity = (Context) obj;
                cls = obj.getClass();
            } else {
                if (Build.VERSION.SDK_INT < 11 || !(obj instanceof Fragment)) {
                    if (C0769k.m3830d(obj) && !((ComponentCallbacksC0205l) obj).m912E() && ((ComponentCallbacksC0205l) obj).m1006z()) {
                        C0717i.m3651b(((ComponentCallbacksC0205l) obj).m968d(), obj.getClass().getCanonicalName());
                        return;
                    }
                    return;
                }
                if (((Fragment) obj).isHidden()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 15 && !((Fragment) obj).getUserVisibleHint()) {
                    return;
                }
                activity = ((Fragment) obj).getActivity();
                cls = obj.getClass();
            }
            C0717i.m3651b(activity, cls.getCanonicalName());
        } catch (Throwable unused) {
        }
    }
}
