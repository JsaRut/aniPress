package p031c.p101b.p102a.p110h;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p115m.C0938a;

/* renamed from: c.b.a.h.a */
/* loaded from: classes.dex */
public class C0905a {
    /* renamed from: a */
    private static int m4483a(int i) {
        if (i == -2) {
            return 1;
        }
        if (i != -1) {
            return (i == 1 || i == 2) ? 4 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    private static String m4484a(Context context, int i) {
        boolean z;
        String str;
        String str2 = "";
        try {
            String str3 = "jg_channel_name_p_" + (i != -2 ? i != -1 ? (i == 1 || i == 2) ? "HIGH" : "DEFAULT" : "LOW" : "MIN").toLowerCase();
            int identifier = context.getResources().getIdentifier(str3, "string", context.getPackageName());
            if (identifier != 0) {
                str2 = context.getResources().getString(identifier);
                str = "found " + str2 + " from resource by name:" + str3;
            } else {
                str = "not found string value from resource by name:" + str3;
            }
            C0923b.m4644b("ChannelHelper", str);
        } catch (Throwable th) {
            C0923b.m4654j("ChannelHelper", "get resource channel ID failed:" + th.getMessage());
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            z = Locale.getDefault().getLanguage().contains("zh");
        } catch (Throwable th2) {
            C0923b.m4654j("ChannelHelper", "get language failed:" + th2.getMessage());
            z = true;
        }
        if (i == -2 || i == -1) {
            return z ? "不重要" : "LOW";
        }
        if (i == 1 || i == 2) {
            return z ? "重要" : "HIGH";
        }
        return z ? "普通" : "NORMAL";
    }

    /* renamed from: a */
    private static void m4485a(Context context, Notification.Builder builder, String str, CharSequence charSequence, int i, int i2) {
        if (m4487a(context, str, charSequence, i, i2)) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    builder.setChannelId(str);
                }
            } catch (Throwable th) {
                C0923b.m4654j("ChannelHelper", "setChannelId error" + th);
            }
        }
    }

    /* renamed from: a */
    public static void m4486a(Context context, Notification.Builder builder, String str, String str2, int i, int i2) {
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT < 26) {
            C0923b.m4642a("ChannelHelper", "sdkVersion < 26, no need use notificationChannel!");
            return;
        }
        if (context.getApplicationInfo().targetSdkVersion < 26) {
            C0923b.m4642a("ChannelHelper", "targetSdkVersion < 26, no need use notificationChannel!");
            return;
        }
        String str3 = "";
        if (C0906b.m4518c(context)) {
            C0923b.m4642a("ChannelHelper", "in silence push time,change defaults to 0");
            i2 = 0;
        } else {
            try {
                if (TextUtils.isEmpty(str)) {
                    str3 = str;
                } else {
                    if (((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str) != null) {
                        C0923b.m4644b("ChannelHelper", "channel has created by user:" + str);
                        builder.setChannelId(str);
                        return;
                    }
                    C0923b.m4644b("ChannelHelper", "not found channed id from user set,will use sdk default channel ID");
                }
            } catch (Throwable th) {
                C0923b.m4646c("ChannelHelper", "config channelID error,will use sdk default channel ID:" + th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = m4484a(context, i);
        }
        String str4 = str2;
        if (i == -2 || i == -1) {
            i3 = i;
            i4 = 0;
        } else if (i < 0 || i2 != 0) {
            i3 = i;
            i4 = i2 & 7;
        } else {
            i4 = i2;
            i3 = -1;
        }
        int m4483a = m4483a(i3);
        if (TextUtils.isEmpty(str3)) {
            str3 = "JPush_" + m4483a + "_" + i4;
        }
        String str5 = str3;
        C0923b.m4649e("ChannelHelper", "channelId:" + str5 + ",channelName:" + str4);
        m4485a(context, builder, str5, (CharSequence) str4, i3, i4);
    }

    /* renamed from: a */
    private static boolean m4487a(Context context, String str, CharSequence charSequence, int i, int i2) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            C0923b.m4642a("ChannelHelper", "sdkversion < 26, no need use notificationChannel!");
            return false;
        }
        try {
            notificationManager = (NotificationManager) context.getSystemService("notification");
        } catch (Throwable th) {
            C0923b.m4648d("ChannelHelper", "new NotificationChannel fail:" + th);
        }
        if (notificationManager == null) {
            C0923b.m4648d("ChannelHelper", "NotificationManager is null!");
            return false;
        }
        C0923b.m4644b("ChannelHelper", "prepare NotificationChannel, channelId=" + str + "");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
                if (notificationChannel != null) {
                    notificationChannel.setName(charSequence);
                    notificationManager.createNotificationChannel(notificationChannel);
                    return true;
                }
            } catch (Throwable th2) {
                C0923b.m4653i("ChannelHelper", "check channelID failed:" + th2.getMessage());
            }
            NotificationChannel notificationChannel2 = new NotificationChannel(str, charSequence, m4483a(i));
            try {
                if (Build.VERSION.SDK_INT < 28 || notificationManager.getNotificationChannelGroup("JIGUANG_CHANNEL_GROUP") == null) {
                    notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("JIGUANG_CHANNEL_GROUP", C0938a.m4719b(context)));
                }
                notificationChannel2.setGroup("JIGUANG_CHANNEL_GROUP");
            } catch (Throwable th3) {
                C0923b.m4654j("ChannelHelper", "config channel group failed:" + th3.getMessage());
            }
            try {
                notificationChannel2.enableLights((i2 & 4) != 0);
            } catch (Throwable th4) {
                C0923b.m4654j("ChannelHelper", "enableLights fail:" + th4);
            }
            try {
                notificationChannel2.enableVibration((i2 & 2) != 0);
            } catch (Throwable th5) {
                C0923b.m4654j("ChannelHelper", "enableVibration fail:" + th5);
            }
            if (!((i2 & 1) != 0)) {
                try {
                    notificationChannel2.setSound(null, null);
                } catch (Throwable th6) {
                    C0923b.m4654j("ChannelHelper", "setSound fail:" + th6);
                }
            }
            notificationManager.createNotificationChannel(notificationChannel2);
            return true;
        }
        return false;
    }
}
