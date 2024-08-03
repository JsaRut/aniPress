package p031c.p032a.p059c;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Method;
import p031c.p032a.p057a.C0583a;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p092s.C0831g;
import p031c.p032a.p096v.C0854j;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.c.f */
/* loaded from: classes.dex */
public final class C0595f {

    /* renamed from: a */
    public static boolean f2845a = false;

    /* renamed from: a */
    private static Bundle m3042a(Context context, int i, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            if (i == 4096) {
                if (bundle != null) {
                    C0591b.m3021a(context, C0591b.m3020a(bundle, "arg1"));
                }
                return bundle2;
            }
            if (i == 4098) {
                C0831g.m4080c(context);
                return bundle2;
            }
            switch (i) {
                case 36865:
                    if (C0831g.m4078b()) {
                        C0583a.m2983b();
                    }
                case 36864:
                    return null;
                default:
                    return null;
            }
        } catch (Throwable th) {
            C0601d.m3079h("JCoreHelper", "si e:" + th);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:            if (r11 <= 0) goto L707;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m3043a(android.content.Context r10, java.lang.String r11, int r12, java.lang.String r13, android.os.Bundle r14, java.lang.Object... r15) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p059c.C0595f.m3043a(android.content.Context, java.lang.String, int, java.lang.String, android.os.Bundle, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: a */
    public static String m3044a(Context context) {
        return (String) C0867b.m4231b(context, C0866a.m4211l());
    }

    /* renamed from: a */
    public static void m3045a(Context context, Intent intent) {
        Method declaredMethod;
        Boolean bool;
        boolean z;
        C0661d.m3386a(context, "get_receiver", intent);
        String action = intent.getAction();
        if (action == null) {
            C0601d.m3077f("JCoreHelper", "onReceive empty action");
            return;
        }
        if (action.equals("android.intent.action.USER_PRESENT")) {
            C0601d.m3075d("JCoreHelper", "onReceiveandroid.intent.action.USER_PRESENT");
            C0583a.m2980a(context, true, 0L);
            return;
        }
        if (action.equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null) {
                C0601d.m3077f("JCoreHelper", "Not found networkInfo");
                return;
            }
            C0601d.m3072b("JCoreHelper", "Connection state changed to - " + networkInfo.toString());
            if (2 == networkInfo.getType() || 3 == networkInfo.getType()) {
                C0601d.m3072b("JCoreHelper", "MMS or SUPL network state change, to do nothing!");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (booleanExtra) {
                C0601d.m3072b("JCoreHelper", "No any network is connected");
                extras.putBoolean("connected", false);
            } else {
                try {
                    if (NetworkInfo.State.CONNECTED == networkInfo.getState()) {
                        C0601d.m3072b("JCoreHelper", "Network is connected.");
                        extras.putBoolean("connected", true);
                    } else if (NetworkInfo.State.DISCONNECTED == networkInfo.getState()) {
                        C0601d.m3072b("JCoreHelper", "Network is disconnected.");
                        extras.putBoolean("connected", false);
                    } else {
                        C0601d.m3072b("JCoreHelper", "other network state - " + networkInfo.getState() + ". Do nothing.");
                    }
                } catch (Throwable unused) {
                    extras.putBoolean("connected", C0812a.m3947c(context));
                }
            }
            C0583a.m2979a(context, "tcp_a15", extras);
            return;
        }
        if (!action.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED") && !action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
            if (action.equals("noti_open_proxy") && intent.getBooleanExtra("debug_notification", false)) {
                String stringExtra = intent.getStringExtra("toastText");
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                Toast makeText = Toast.makeText(context, stringExtra, 0);
                try {
                    View view = makeText.getView();
                    if (view instanceof LinearLayout) {
                        View childAt = ((LinearLayout) view).getChildAt(0);
                        if (childAt instanceof TextView) {
                            TextView textView = (TextView) childAt;
                            if (!C0854j.m4161a(stringExtra)) {
                                textView.setText(stringExtra);
                            }
                            textView.setTextSize(13.0f);
                        }
                    }
                } catch (Exception unused2) {
                }
                makeText.show();
                return;
            }
            return;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            try {
                Class<?> cls = Class.forName("android.os.PowerManager");
                if (cls != null) {
                    if (action.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                        Method declaredMethod2 = cls.getDeclaredMethod("isDeviceIdleMode", new Class[0]);
                        if (declaredMethod2 != null) {
                            bool = (Boolean) declaredMethod2.invoke(powerManager, new Object[0]);
                            z = bool.booleanValue();
                        }
                        z = true;
                    } else {
                        if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED") && (declaredMethod = cls.getDeclaredMethod("isPowerSaveMode", new Class[0])) != null) {
                            bool = (Boolean) declaredMethod.invoke(powerManager, new Object[0]);
                            z = bool.booleanValue();
                        }
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                    C0601d.m3072b("JCoreHelper", "doze or powersave mode exit.");
                    C0583a.m2980a(context, true, 0L);
                }
            } catch (Throwable th) {
                C0601d.m3079h("JCoreHelper", "handle DEVICE_IDLE_MODE_CHANGED or POWER_SAVE_MODE_CHANGED fail:" + th);
            }
        }
    }

    /* renamed from: a */
    public static void m3046a(Context context, String str, Bundle bundle) {
        C0583a.m2984b(context, str, bundle);
    }

    /* renamed from: a */
    private static void m3047a(Context context, String str, Bundle bundle, String str2) {
        if (bundle != null) {
            bundle.putString("sdk_type", str);
            C0583a.m2979a(context, str2, bundle);
        }
    }

    /* renamed from: a */
    public static void m3048a(Context context, String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0601d.m3074c("JCoreHelper", "runActionWithService action:" + str2);
        bundle.putString("sdk_type", str);
        bundle.putString("internal_action", str2);
        C0583a.m2979a(context, "a3", bundle);
    }

    /* renamed from: a */
    public static void m3049a(Context context, boolean z) {
        C0601d.m3072b("JCoreHelper", "changeForegroudStat:" + z);
        f2845a = z;
        Bundle bundle = new Bundle();
        bundle.putBoolean("foreground", f2845a);
        C0583a.m2979a(context, "a4", bundle);
    }

    /* renamed from: b */
    public static String m3050b(Context context) {
        return C0591b.m3019a(context);
    }

    /* renamed from: c */
    public static String m3051c(Context context) {
        return C0591b.m3022b(context);
    }

    /* renamed from: d */
    public static Object m3052d(Context context) {
        return C0661d.m3386a(context, "deviceinfo", null);
    }

    /* renamed from: e */
    public static Pair<String, Integer> m3053e(Context context) {
        return C0591b.m3023c(context);
    }
}
