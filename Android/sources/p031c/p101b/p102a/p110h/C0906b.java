package p031c.p101b.p102a.p110h;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import cn.jpush.android.p121ui.PopWinActivity;
import cn.jpush.android.p121ui.PushActivity;
import cn.jpush.android.service.JNotifyActivity;
import java.io.File;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;
import java.util.UUID;
import java.util.zip.Adler32;
import p031c.p032a.p092s.C0831g;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p104b.C0886i;
import p031c.p101b.p102a.p104b.InterfaceC0887j;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p108f.C0903a;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;
import p031c.p101b.p102a.p115m.C0940c;

/* renamed from: c.b.a.h.b */
/* loaded from: classes.dex */
public class C0906b {

    /* renamed from: c.b.a.h.b$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private Context f3884a;

        /* renamed from: b */
        private C0899d f3885b;

        public a(Context context, C0899d c0899d) {
            this.f3884a = context;
            this.f3885b = c0899d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0906b.m4527i(this.f3884a, this.f3885b);
                if (this.f3885b.f3824R != 0 && this.f3885b.f3824R != 4) {
                    C0906b.m4526h(this.f3884a, this.f3885b);
                }
                C0930i.m4674a(this.f3885b.f3837c, 995, this.f3884a);
                C0906b.m4525g(this.f3884a, this.f3885b);
            } catch (Throwable th) {
                C0923b.m4653i("NotificationHelper", "run NotifyAction failed:" + th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private static int m4488a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 1 : 32;
        }
        return 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.TargetApi(11)
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4489a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4489a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):int");
    }

    /* renamed from: a */
    public static int m4490a(String str) {
        if (TextUtils.isEmpty(str)) {
            C0923b.m4642a("NotificationHelper", "action:getNofiticationID - empty messageId");
            return 0;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception unused) {
            C0923b.m4653i("NotificationHelper", "Ths msgId is not a integer");
            Adler32 adler32 = new Adler32();
            adler32.update(str.getBytes());
            int value = (int) adler32.getValue();
            if (value < 0) {
                value = Math.abs(value);
            }
            return value < 0 ? Math.abs(value) : value;
        }
    }

    /* renamed from: a */
    static Notification m4491a(Notification.Builder builder) {
        try {
            return Build.VERSION.SDK_INT >= 16 ? builder.build() : builder.getNotification();
        } catch (Throwable th) {
            C0923b.m4654j("NotificationHelper", "Build notification error:" + th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.app.Notification m4492a(android.content.Context r9, p031c.p101b.p102a.p106d.C0899d r10, android.widget.RemoteViews r11, boolean r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4492a(android.content.Context, c.b.a.d.d, android.widget.RemoteViews, boolean, java.util.Map):android.app.Notification");
    }

    /* renamed from: a */
    public static Intent m4493a(Context context, String str, C0899d c0899d) {
        Intent intent = new Intent(str);
        intent.setClass(context, PushActivity.class);
        intent.putExtra("msg_data", c0899d);
        if (!C0938a.m4730h(context) && Build.VERSION.SDK_INT >= 11) {
            intent.addFlags(32768);
        }
        return intent;
    }

    /* renamed from: a */
    private static InterfaceC0887j m4494a(Context context, C0886i c0886i) {
        try {
            Class<?> cls = Class.forName("c.b.a.o.a");
            return (InterfaceC0887j) cls.getDeclaredMethod("getNotificationBuilder", Context.class, C0886i.class).invoke(cls, context, c0886i);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03bb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object m4495a(android.content.Context r22, p031c.p101b.p102a.p106d.C0899d r23, java.util.Map<java.lang.String, java.lang.Object> r24) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4495a(android.content.Context, c.b.a.d.d, java.util.Map):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x003b -> B:15:0x0053). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m4496a(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4496a(android.content.Context, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    private static String m4497a(Context context, String str, String str2) {
        if (!str.endsWith(".jpg") && !str.endsWith(".png")) {
            C0923b.m4649e("NotificationHelper", "The url is not a picture resources.");
            return "";
        }
        C0923b.m4649e("NotificationHelper", "The url is a picture resources.");
        String str3 = C0940c.m4744c(context, str2) + (str2 + str.substring(str.lastIndexOf(".")));
        C0923b.m4649e("NotificationHelper", "Big picture notification resource path: " + str3);
        byte[] m4471a = C0903a.m4471a(str, 5, 5000L, 4);
        return (m4471a == null || !C0940c.m4738a(str3, m4471a)) ? "" : str3;
    }

    /* renamed from: a */
    public static void m4498a(Notification notification, Context context, String str, String str2, PendingIntent pendingIntent) {
        try {
            Class.forName("android.app.Notification").getDeclaredMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification, context, str, str2, pendingIntent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m4499a(Context context) {
        while (true) {
            Integer valueOf = Integer.valueOf(C0907c.m4528a());
            if (valueOf.intValue() == 0) {
                return;
            } else {
                m4517c(context, valueOf.intValue());
            }
        }
    }

    /* renamed from: a */
    public static void m4500a(Context context, int i) {
        int m4528a;
        if (!C0907c.m4531b(i)) {
            C0907c.m4529a(i);
        }
        C0923b.m4642a("NotificationHelper", "queueSize:" + C0907c.m4530b() + ",max num:" + C0902c.m4464h(context));
        if (C0907c.m4530b() <= C0902c.m4464h(context) || (m4528a = C0907c.m4528a()) == 0) {
            return;
        }
        m4517c(context, m4528a);
    }

    /* renamed from: a */
    public static void m4501a(Context context, Intent intent) {
        C0899d m4508b = m4508b(context, intent);
        C0923b.m4649e("NotificationHelper", "handleNotificationIntent:" + m4508b);
        if ("cn.jpush.android.intent.NOTIFICATION_OPENED".equals(intent.getAction()) && m4508b.f3849k != 1) {
            byte b2 = m4508b.f3829W;
            if (b2 == 0) {
                C0930i.m4674a(m4508b.f3837c, 1000, context);
            } else {
                C0883f.m4317a(context, m4508b.f3837c, b2);
            }
            if (m4513c(context, m4508b) == 2) {
                return;
            }
        }
        m4503a(context, intent.getAction(), m4508b, intent);
    }

    /* renamed from: a */
    public static void m4502a(Context context, C0899d c0899d) {
        C0923b.m4642a("NotificationHelper", "[processMessage] pushEntity:" + c0899d);
        if (c0899d.f3825S == 0) {
            C0831g.m4072a(context, "JPUSH", 12, null, null, new a(context, c0899d));
            return;
        }
        C0923b.m4642a("NotificationHelper", "Unexpected: unknown show  mode - " + c0899d.f3825S);
    }

    /* renamed from: a */
    public static void m4503a(Context context, String str, C0899d c0899d, Intent intent) {
        try {
            Intent intent2 = new Intent(context, Class.forName(C0869a.m4243b(context)));
            if (intent != null) {
                String string = intent.getExtras().getString("cn.jpush.android.NOTIFIACATION_ACTION_EXTRA");
                if (!TextUtils.isEmpty(string)) {
                    intent2.putExtra("cn.jpush.android.NOTIFIACATION_ACTION_EXTRA", string);
                }
            }
            intent2.setAction(str);
            if (c0899d != null) {
                intent2.putExtra("msg_data", c0899d);
            }
            if (C0869a.m4241a(context) && C0869a.m4237a() != null) {
                if (str.equals("cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION_PROXY")) {
                    intent2.setAction("cn.jpush.android.intent.NOTIFICATION_CLICK_ACTION");
                    C0869a.m4237a().m4794a(context, intent2);
                    return;
                }
                C0886i m4431b = c0899d.m4431b();
                if (TextUtils.isEmpty(m4431b.f3753a)) {
                    m4431b.f3753a = C0922a.m4630a(context);
                }
                if (str.equals("cn.jpush.android.intent.NOTIFICATION_ARRIVED")) {
                    C0869a.m4237a().mo4782b(context, m4431b);
                    return;
                } else if (str.equals("cn.jpush.android.intent.NOTIFICATION_DISMISS")) {
                    C0869a.m4237a().mo4784c(context, m4431b);
                    return;
                } else if (str.equals("cn.jpush.android.intent.NOTIFICATION_OPENED")) {
                    C0869a.m4237a().mo4786d(context, m4431b);
                    return;
                }
            }
            context.sendBroadcast(intent2);
        } catch (Throwable th) {
            C0923b.m4653i("NotificationHelper", "sendToUserReceiver failed:" + th.getMessage());
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    public static void m4504a(Context context, String str, Map<String, Object> map) {
        String str2;
        Object m4496a = m4496a(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            if (!(m4496a instanceof Icon)) {
                return;
            } else {
                str2 = "cn.jpush.android.NOTIFICATION_LARGE_ICON_OBJ";
            }
        } else if (!(m4496a instanceof Bitmap)) {
            return;
        } else {
            str2 = "cn.jpush.android.NOTIFICATION_LARGE_ICON_BITMAP";
        }
        map.put(str2, m4496a);
    }

    @TargetApi(11)
    /* renamed from: a */
    private static boolean m4505a(Context context, Notification.Builder builder, Map<String, Object> map) {
        boolean z;
        boolean z2;
        Object obj = map.get("cn.jpush.android.NOTIFICATION_SMALL_ICON_RESOURCE_ID");
        Object obj2 = map.get("cn.jpush.android.NOTIFICATION_SMALL_ICON_OBJ");
        Object obj3 = map.get("cn.jpush.android.NOTIFICATION_SMALL_ICON_BITMAP");
        if (obj2 == null || Build.VERSION.SDK_INT < 23) {
            z = false;
        } else {
            builder.setSmallIcon((Icon) obj2);
            z = true;
        }
        if (!z && obj3 != null && Build.VERSION.SDK_INT >= 23) {
            builder.setSmallIcon(Icon.createWithBitmap((Bitmap) obj3));
            z = true;
        }
        if (!z && obj != null) {
            try {
                context.getResources().getDrawable(((Integer) obj).intValue());
                z2 = true;
            } catch (Throwable unused) {
                C0923b.m4653i("NotificationHelper", "resource not found with local app");
                z2 = false;
            }
            if (z2) {
                C0923b.m4642a("NotificationHelper", "set small icon by local resId:" + obj);
                builder.setSmallIcon(((Integer) obj).intValue());
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        Object obj4 = map.get("cn.jpush.android.NOTIFICATION_LARGE_ICON_OBJ");
        Object obj5 = map.get("cn.jpush.android.NOTIFICATION_LARGE_ICON_BITMAP");
        if (obj4 != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                builder.setLargeIcon((Icon) obj4);
            }
        } else if (obj5 != null) {
            builder.setLargeIcon((Bitmap) obj5);
        } else {
            C0923b.m4642a("NotificationHelper", "not set large icon");
        }
        return true;
    }

    /* renamed from: b */
    public static Intent m4506b(Context context, String str, C0899d c0899d) {
        Intent intent = new Intent(str);
        intent.setClass(context, PopWinActivity.class);
        intent.putExtra("msg_data", c0899d);
        return intent;
    }

    @TargetApi(23)
    /* renamed from: b */
    private static Icon m4507b(String str) {
        try {
            if (new File(str).exists()) {
                return Icon.createWithFilePath(str);
            }
            C0923b.m4653i("NotificationHelper", "icon file doesn't exist, path=" + str);
            return null;
        } catch (Throwable th) {
            C0923b.m4653i("NotificationHelper", "createIcon err:" + th);
            return null;
        }
    }

    /* renamed from: b */
    public static C0899d m4508b(Context context, Intent intent) {
        Serializable serializableExtra = intent.getSerializableExtra("msg_data");
        if (serializableExtra == null || !(serializableExtra instanceof C0899d)) {
            return null;
        }
        return (C0899d) serializableExtra;
    }

    /* renamed from: b */
    public static String m4509b(Context context, String str) {
        if (!str.endsWith(".jpg") && !str.endsWith(".png") && !str.endsWith(".jpeg")) {
            C0923b.m4649e("NotificationHelper", "The url is not a picture resources.");
            return "";
        }
        C0923b.m4649e("NotificationHelper", "The url is a picture resources.");
        String m4720b = C0938a.m4720b(str);
        if (TextUtils.isEmpty(m4720b)) {
            m4720b = UUID.randomUUID().toString();
        }
        String str2 = C0940c.m4744c(context, "noti_res") + (m4720b + str.substring(str.lastIndexOf(".")));
        C0923b.m4649e("NotificationHelper", "picture notification resource path: " + str2);
        if (!new File(str2).exists()) {
            byte[] m4470a = C0903a.m4470a(str, 2);
            return (m4470a == null || !C0940c.m4738a(str2, m4470a)) ? "" : str2;
        }
        C0923b.m4642a("NotificationHelper", "need not download again with same url:" + str);
        return str2;
    }

    /* renamed from: b */
    public static void m4510b(Context context, int i) {
        if (i <= 0) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Integer valueOf = Integer.valueOf(C0907c.m4528a());
            if (valueOf.intValue() != 0) {
                m4517c(context, valueOf.intValue());
            }
        }
    }

    /* renamed from: b */
    public static void m4511b(Context context, C0899d c0899d) {
        if (c0899d != null) {
            m4517c(context, m4490a(TextUtils.isEmpty(c0899d.f3843f) ? c0899d.f3837c : c0899d.f3843f));
        }
    }

    /* renamed from: b */
    public static boolean m4512b(Context context) {
        try {
            if (!C0902c.m4461e(context)) {
                C0923b.m4650f("NotificationHelper", "Notification was disabled by JPushInterface.setPushTime !");
                return false;
            }
            String m4462f = C0902c.m4462f(context);
            if (TextUtils.isEmpty(m4462f)) {
                C0923b.m4649e("NotificationHelper", "no time limited");
                return true;
            }
            C0923b.m4649e("NotificationHelper", "push time is ：" + m4462f);
            String[] split = m4462f.split("_");
            String str = split[0];
            String str2 = split[1];
            char[] charArray = str.toCharArray();
            String[] split2 = str2.split("\\^");
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(7);
            int i2 = calendar.get(11);
            for (char c2 : charArray) {
                if (i == Integer.valueOf(String.valueOf(c2)).intValue() + 1) {
                    int intValue = Integer.valueOf(split2[0]).intValue();
                    int intValue2 = Integer.valueOf(split2[1]).intValue();
                    if (i2 >= intValue && i2 <= intValue2) {
                        return true;
                    }
                }
            }
            C0923b.m4650f("NotificationHelper", "Current time is out of the push time - " + m4462f);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m4513c(android.content.Context r6, p031c.p101b.p102a.p106d.C0899d r7) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4513c(android.content.Context, c.b.a.d.d):int");
    }

    /* renamed from: c */
    private static Intent m4514c(Context context, String str, C0899d c0899d) {
        Intent intent = new Intent(str);
        intent.setClass(context, JNotifyActivity.class);
        intent.setFlags(1073741824);
        intent.putExtra("msg_data", c0899d);
        return intent;
    }

    /* renamed from: c */
    public static synchronized Bitmap m4515c(Context context, String str) {
        Bitmap bitmap;
        synchronized (C0906b.class) {
            try {
                PackageManager packageManager = context.getApplicationContext().getPackageManager();
                bitmap = ((BitmapDrawable) packageManager.getApplicationIcon(packageManager.getApplicationInfo(str, 0))).getBitmap();
            } catch (Throwable th) {
                C0923b.m4653i("NotificationHelper", "getTargetAppBitmap failed:" + th.getMessage());
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: c */
    public static C0886i m4516c(Context context, Intent intent) {
        C0886i m4431b = m4508b(context, intent).m4431b();
        if (TextUtils.isEmpty(m4431b.f3753a)) {
            m4431b.f3753a = C0922a.m4630a(context);
        }
        return m4431b;
    }

    /* renamed from: c */
    public static void m4517c(Context context, int i) {
        try {
            C0923b.m4642a("NotificationHelper", "action:cleanNotification - notificationId:" + i);
            ((NotificationManager) context.getSystemService("notification")).cancel(i);
        } catch (Throwable th) {
            C0923b.m4653i("NotificationHelper", "cancelNotification failed:" + th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:            if (r8 <= 23) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:            if (r8 < r6) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:            if (r7 >= r5) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c3, code lost:            if (r7 <= r2) goto L155;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m4518c(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4518c(android.content.Context):boolean");
    }

    /* renamed from: d */
    private static String m4519d(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return null;
        }
        if (C0938a.m4714a()) {
            String m4509b = m4509b(context, str);
            if (!TextUtils.isEmpty(m4509b)) {
                return m4509b;
            }
            str2 = "Get network picture failed.";
        } else {
            str2 = "SDCard is not mounted,need not download pic";
        }
        C0923b.m4654j("NotificationHelper", str2);
        return null;
    }

    /* renamed from: e */
    private static boolean m4522e(Context context, String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            C0923b.m4642a("NotificationHelper", "link uri is empty");
            return false;
        }
        try {
            if (str.startsWith("http")) {
                z = m4524f(context, str);
            } else {
                Intent parseUri = Intent.parseUri(str, 0);
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                z = true;
            }
        } catch (Throwable th) {
            C0923b.m4642a("NotificationHelper", "[handleSSP] start fail uri error:" + th.getMessage());
        }
        return z;
    }

    /* renamed from: f */
    private static boolean m4524f(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C0923b.m4642a("NotificationHelper", "link uri is empty");
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            C0923b.m4642a("NotificationHelper", "start default browser failed");
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                return true;
            } catch (Throwable th) {
                C0923b.m4642a("NotificationHelper", "[openWebUri] start fail uri error:" + th.getMessage());
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x018d A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0 A[Catch: Throwable -> 0x025a, TRY_ENTER, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1 A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01da A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01de A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f2 A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024c A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0225 A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0216 A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e3 A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190 A[Catch: Throwable -> 0x025a, TryCatch #0 {Throwable -> 0x025a, blocks: (B:41:0x0185, B:43:0x018d, B:44:0x0192, B:47:0x01a0, B:49:0x01a4, B:50:0x01b2, B:52:0x01c1, B:53:0x01d6, B:55:0x01da, B:57:0x01de, B:58:0x01ec, B:60:0x01f2, B:61:0x01f4, B:63:0x01fe, B:64:0x021b, B:67:0x0221, B:69:0x024c, B:71:0x0250, B:73:0x0254, B:75:0x0225, B:78:0x022b, B:79:0x022e, B:80:0x0236, B:81:0x0216, B:82:0x01e3, B:83:0x01a9, B:84:0x01ae, B:85:0x0190), top: B:40:0x0185 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4525g(android.content.Context r18, p031c.p101b.p102a.p106d.C0899d r19) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p110h.C0906b.m4525g(android.content.Context, c.b.a.d.d):void");
    }

    /* renamed from: h */
    public static void m4526h(Context context, C0899d c0899d) {
        String str;
        boolean z;
        String str2 = c0899d.f3837c;
        String str3 = c0899d.f3820N;
        str = "";
        if (TextUtils.isEmpty(str3)) {
            C0923b.m4653i("NotificationHelper", "Show url is Empty! Give up to download!");
            z = false;
        } else {
            String m4467a = C0903a.m4467a(str3, 5, 5000L);
            boolean isEmpty = TextUtils.isEmpty(m4467a);
            str = isEmpty ? "" : m4467a;
            z = !isEmpty;
        }
        String m4744c = C0940c.m4744c(context, str2);
        if (!z) {
            C0923b.m4653i("NotificationHelper", "NOTE: failed to download html page. Give up this.");
            C0930i.m4674a(str2, 1014, context);
            C0930i.m4675a(str2, 1021, null, context);
            return;
        }
        String str4 = m4744c + str2 + ".html";
        String substring = str3.substring(0, str3.lastIndexOf("/") + 1);
        if (c0899d.f3826T.isEmpty()) {
            c0899d.f3822P = c0899d.f3820N;
        } else {
            if (!C0909e.m4533a(c0899d.f3826T, context, substring, str2, true)) {
                C0923b.m4642a("NotificationHelper", "Loads rich push resources failed, webView will open url!");
                C0930i.m4674a(str2, 1014, context);
                m4525g(context, c0899d);
                return;
            }
            C0923b.m4642a("NotificationHelper", "Loads rich push resources succeed, webView will open cache!");
            if (!C0940c.m4742b(str4, str.replaceAll("img src=\"" + substring, "img src=\"" + m4744c))) {
                C0930i.m4674a(str2, 1014, context);
                return;
            }
            c0899d.f3822P = "file://" + str4;
            C0930i.m4674a(str2, 995, context);
        }
        m4525g(context, c0899d);
    }

    /* renamed from: i */
    public static void m4527i(Context context, C0899d c0899d) {
        String m4497a;
        String str;
        String str2 = c0899d.f3862x;
        c0899d.f3862x = "";
        if (c0899d.f3860v != 3 || TextUtils.isEmpty(str2)) {
            return;
        }
        if (str2.startsWith("http://") || str2.startsWith("https://")) {
            m4497a = m4497a(context, str2, c0899d.f3837c);
            if (TextUtils.isEmpty(m4497a)) {
                str = "Get network picture failed, show basic notification only.";
                C0923b.m4654j("NotificationHelper", str);
                return;
            }
            c0899d.f3862x = m4497a;
        }
        m4497a = C0940c.m4746d(context, str2);
        if (TextUtils.isEmpty(m4497a)) {
            str = "Get developer picture failed, show basic notification only.";
            C0923b.m4654j("NotificationHelper", str);
            return;
        }
        c0899d.f3862x = m4497a;
    }
}
