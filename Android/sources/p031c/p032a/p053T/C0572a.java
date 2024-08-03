package p031c.p032a.p053T;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.T.a */
/* loaded from: classes.dex */
public final class C0572a {
    /* renamed from: a */
    public static void m2959a(Context context, int i) {
        boolean z;
        boolean z2;
        String m2703e = C0511f.m2703e(context);
        new C0572a();
        boolean m2960a = Build.VERSION.SDK_INT >= 24 ? m2960a(context) : m2961b(context);
        boolean z3 = true;
        if (!TextUtils.isEmpty(m2703e)) {
            if (TextUtils.equals("ON", m2703e)) {
                z = false;
                z2 = true;
            } else {
                z = !TextUtils.equals("OFF", m2703e);
                z2 = false;
            }
            if (z) {
                C0675a.m3469c("JNotificationState", "notification state do not changed");
                z3 = z;
            } else if (z2 == m2960a) {
                z3 = false;
            }
        }
        C0675a.m3469c("JNotificationState", "lastCacheNotificationState:" + m2703e + ",currentNotificationSate:" + m2960a + ",isNeedReport:" + z3 + ",triggerScene:" + i);
        if (!z3) {
            C0675a.m3469c("JNotificationState", "do not need report notification state");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notification_state", m2960a);
            jSONObject.put("imei", C0812a.m3943b(context, C0812a.m3943b(context, "")));
            jSONObject.put("device_id", C0557c.m2904b(context));
            jSONObject.put("trigger_scene", i);
            C0513h.m2719a(context, jSONObject, "android_notification_state");
            C0513h.m2720a(context, (Object) jSONObject);
            C0511f.m2715n(context, m2960a ? "ON" : "OFF");
        } catch (Throwable th) {
            C0675a.m3475g("JNotificationState", "report notification state failed, error:" + th.getMessage());
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    private static boolean m2960a(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled();
        } catch (Throwable th) {
            C0675a.m3475g("JNotificationState", "invoke areNotificationsEnabled method failed, error:" + th.getMessage());
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m2961b(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        } catch (Throwable th) {
            C0675a.m3475g("JNotificationState", "getNotificationStateCommon failed, other error:" + th.getMessage());
            return true;
        }
    }
}
