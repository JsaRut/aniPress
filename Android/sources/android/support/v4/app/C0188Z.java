package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: android.support.v4.app.Z */
/* loaded from: classes.dex */
public final class C0188Z {
    /* renamed from: a */
    public static Intent m838a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String m841b = m841b(activity);
        if (m841b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m841b);
        try {
            return m842b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m841b + "' in manifest");
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m839a(Context context, ComponentName componentName) {
        String m842b = m842b(context, componentName);
        if (m842b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m842b);
        return m842b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: a */
    public static void m840a(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: b */
    public static String m841b(Activity activity) {
        try {
            return m842b(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: b */
    public static String m842b(Context context, ComponentName componentName) {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: b */
    public static boolean m843b(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }
}
