package p031c.p101b.p102a.p104b;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p092s.C0831g;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p105c.C0894f;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p109g.C0904a;
import p031c.p101b.p102a.p112j.C0916a;
import p031c.p101b.p102a.p113k.C0921c;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0929h;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p114l.C0931j;
import p031c.p101b.p102a.p115m.C0938a;

/* renamed from: c.b.a.b.f */
/* loaded from: classes.dex */
public class C0883f {

    /* renamed from: a */
    public static int f3719a = 5;

    /* renamed from: b */
    private static final Integer f3720b = 0;

    /* renamed from: c.b.a.b.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static int f3721a = 0;

        /* renamed from: b */
        public static int f3722b = 6001;

        /* renamed from: c */
        public static int f3723c = 6002;

        /* renamed from: d */
        public static int f3724d = 6003;

        /* renamed from: e */
        public static int f3725e = 6004;

        /* renamed from: f */
        public static int f3726f = 6005;

        /* renamed from: g */
        public static int f3727g = 6006;

        /* renamed from: h */
        public static int f3728h = 6007;

        /* renamed from: i */
        public static int f3729i = 6008;

        /* renamed from: j */
        public static int f3730j = 6009;

        /* renamed from: k */
        public static int f3731k = 6011;

        /* renamed from: l */
        public static int f3732l = 6012;

        /* renamed from: m */
        public static int f3733m = 6013;

        /* renamed from: n */
        public static int f3734n = 6014;

        /* renamed from: o */
        public static int f3735o = 6015;

        /* renamed from: p */
        public static int f3736p = 6016;

        /* renamed from: q */
        public static int f3737q = 6017;

        /* renamed from: r */
        public static int f3738r = 6018;

        /* renamed from: s */
        public static int f3739s = 6019;

        /* renamed from: t */
        public static int f3740t = 6020;

        /* renamed from: u */
        public static int f3741u = 6021;

        /* renamed from: v */
        public static int f3742v = 6022;

        /* renamed from: w */
        public static int f3743w = 6023;

        /* renamed from: x */
        public static int f3744x = 6024;
    }

    static {
        C0831g.m4074a("JPUSH", C0929h.class.getName());
    }

    /* renamed from: a */
    public static Set<String> m4308a(Set<String> set) {
        return C0916a.m4564a(set);
    }

    /* renamed from: a */
    public static void m4309a(Context context) {
        m4350o(context);
        C0922a.m4637a(context, "JPUSH", "clear_all_notify", null);
    }

    /* renamed from: a */
    public static void m4310a(Context context, int i) {
        m4350o(context);
        C0916a.m4569a(context, i, new HashSet(), 1, 4);
    }

    /* renamed from: a */
    public static void m4311a(Context context, int i, int i2, int i3, int i4) {
        m4350o(context);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || i2 > 59 || i4 > 59 || i3 > 23 || i > 23) {
            C0923b.m4648d("JPushInterface", "Invalid parameter format, startHour and endHour should between 0 ~ 23, startMins and endMins should between 0 ~ 59. ");
            return;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("time", "");
            C0922a.m4637a(context, "JPUSH", "silenceTime", bundle);
            C0923b.m4644b("JPushInterface", "Remove the silence time!");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startHour", i);
            jSONObject.put("startMins", i2);
            jSONObject.put("endHour", i3);
            jSONObject.put("endtMins", i4);
            Bundle bundle2 = new Bundle();
            bundle2.putString("time", jSONObject.toString());
            C0922a.m4637a(context, "JPUSH", "silenceTime", bundle2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m4312a(Context context, int i, String str) {
        HashSet hashSet;
        m4350o(context);
        if (TextUtils.isEmpty(str)) {
            hashSet = null;
        } else {
            hashSet = new HashSet();
            hashSet.add(str);
        }
        C0916a.m4569a(context, i, hashSet, 1, 6);
    }

    /* renamed from: a */
    public static void m4313a(Context context, int i, Set<String> set) {
        m4350o(context);
        C0916a.m4569a(context, i, set, 1, 1);
    }

    /* renamed from: a */
    public static void m4314a(Context context, long j) {
        m4350o(context);
        C0894f.m4411a(context, j);
    }

    /* renamed from: a */
    public static void m4315a(Context context, C0904a c0904a) {
        m4350o(context);
        C0894f.m4412a(context, c0904a);
    }

    /* renamed from: a */
    public static void m4316a(Context context, String str) {
        m4350o(context);
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        C0922a.m4637a(context, "JPUSH", "delete_geo_fence", bundle);
    }

    /* renamed from: a */
    public static void m4317a(Context context, String str, byte b2) {
        m4350o(context);
        if (TextUtils.isEmpty(str)) {
            C0923b.m4648d("JPushInterface", "The msgId is not valid - " + str);
        }
        C0930i.m4676a(str, "", b2, 1000, context);
    }

    /* renamed from: a */
    public static void m4318a(Context context, Set<Integer> set, int i, int i2) {
        m4350o(context);
        if (!C0938a.m4715a(context)) {
            C0923b.m4644b("JPushInterface", "检测到当前没有网络。此动作将在有网络时自动继续执行。");
        }
        if (set == null) {
            Bundle bundle = new Bundle();
            bundle.putString("time", "0123456_0^23");
            C0922a.m4637a(context, "JPUSH", "pushtime", bundle);
            return;
        }
        if (set.size() == 0 || set.isEmpty()) {
            C0922a.m4637a(context, "JPUSH", "disable_push", null);
            return;
        }
        if (i > i2) {
            C0923b.m4648d("JPushInterface", "Invalid time format - startHour should less than endHour");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : set) {
            if (num.intValue() > 6 || num.intValue() < 0) {
                C0923b.m4648d("JPushInterface", "Invalid day format - " + num);
                return;
            }
            sb.append(num);
        }
        sb.append("_");
        sb.append(i);
        sb.append("^");
        sb.append(i2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("time", sb.toString());
        C0922a.m4637a(context, "JPUSH", "pushtime", bundle2);
    }

    /* renamed from: a */
    public static void m4319a(InterfaceC0887j interfaceC0887j) {
        if (interfaceC0887j == null) {
            throw new IllegalArgumentException("NULL notification");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("buidler_id", f3720b.intValue());
        bundle.putString("buidler_string", interfaceC0887j.toString());
        C0922a.m4637a(C0869a.f3646a, "JPUSH", "set_custom_notify", bundle);
    }

    /* renamed from: a */
    public static void m4320a(Integer num, InterfaceC0887j interfaceC0887j) {
        C0923b.m4652h("JPushInterface", "action:setPushNotificationBuilder - id:" + num);
        if (interfaceC0887j == null) {
            throw new IllegalArgumentException("NULL pushNotificationBuilder");
        }
        if (num.intValue() < 1) {
            C0923b.m4648d("JPushInterface", "id should be larger than 0");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("buidler_id", num.intValue());
        bundle.putString("buidler_string", interfaceC0887j.toString());
        C0922a.m4637a(C0869a.f3646a, "JPUSH", "set_custom_notify", bundle);
    }

    /* renamed from: a */
    public static void m4321a(boolean z) {
        C0831g.m4077b(z);
    }

    /* renamed from: b */
    public static void m4322b(Context context) {
        m4350o(context);
        C0894f.m4410a(context);
    }

    /* renamed from: b */
    public static void m4323b(Context context, int i) {
        m4350o(context);
        if (i <= 0) {
            C0923b.m4648d("JPushInterface", "Invalid notificationId, Give up action..");
        } else {
            ((NotificationManager) context.getSystemService("notification")).cancel(i);
        }
    }

    /* renamed from: b */
    public static void m4324b(Context context, int i, String str) {
        m4350o(context);
        C0916a.m4568a(context, i, str, 2, 2);
    }

    /* renamed from: b */
    public static void m4325b(Context context, int i, Set<String> set) {
        m4350o(context);
        C0916a.m4569a(context, i, set, 1, 3);
    }

    /* renamed from: b */
    public static void m4326b(Context context, long j) {
        m4350o(context);
        if (j < 180000 || j > 86400000) {
            C0923b.m4648d("JPushInterface", "Invalid interval, it should be a ms number between 3 mins and 1 day!");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("interval", j);
        C0922a.m4637a(context, "JPUSH", "geo_interval", bundle);
    }

    /* renamed from: b */
    public static void m4327b(Context context, String str) {
        C0922a.m4636a(context, "f_pause", str);
    }

    /* renamed from: c */
    public static String m4328c(Context context) {
        m4350o(context);
        return C0922a.m4639c(context);
    }

    /* renamed from: c */
    public static void m4329c(Context context, int i) {
        m4350o(context);
        C0916a.m4568a(context, i, (String) null, 2, 3);
    }

    /* renamed from: c */
    public static void m4330c(Context context, int i, String str) {
        m4350o(context);
        C0931j.m4678a().m4681a(context, i, str);
    }

    /* renamed from: c */
    public static void m4331c(Context context, int i, Set<String> set) {
        m4350o(context);
        C0916a.m4569a(context, i, set, 1, 2);
    }

    /* renamed from: c */
    public static void m4332c(Context context, String str) {
        C0922a.m4636a(context, "f_resume", str);
    }

    /* renamed from: d */
    public static String m4333d(Context context) {
        m4350o(context);
        return C0922a.m4638b(context);
    }

    /* renamed from: d */
    public static void m4334d(Context context, int i) {
        m4350o(context);
        C0916a.m4568a(context, i, (String) null, 2, 5);
    }

    /* renamed from: d */
    public static void m4335d(Context context, String str) {
        m4350o(context);
        if (TextUtils.isEmpty(str)) {
            C0923b.m4648d("JPushInterface", "The msgId is not valid - " + str);
        }
        C0930i.m4674a(str, 1028, context);
    }

    /* renamed from: e */
    public static void m4336e(Context context) {
        C0923b.m4644b("JPushInterface", "action:init - sdkVersion:3.3.4, buildId:36");
        m4350o(context);
        if (C0938a.m4729g(context)) {
            C0869a.m4246d(context);
            C0922a.m4637a(context, "JPUSH", "init", null);
            C0921c.m4615a().m4624b(context);
        }
    }

    /* renamed from: e */
    public static void m4337e(Context context, int i) {
        m4350o(context);
        C0916a.m4569a(context, i, new HashSet(), 1, 5);
    }

    /* renamed from: e */
    public static void m4338e(Context context, String str) {
        C0922a.m4632a(context, str);
    }

    /* renamed from: f */
    public static void m4339f(Context context) {
        m4350o(context);
        C0831g.m4082d(context);
    }

    /* renamed from: f */
    public static void m4340f(Context context, int i) {
        m4350o(context);
        C0923b.m4644b("JPushInterface", "action:setLatestNotificationNumber : " + i);
        if (i <= 0) {
            C0923b.m4648d("JPushInterface", "maxNum should > 0, Give up action..");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        C0922a.m4637a(context, "JPUSH", "max_num", bundle);
    }

    /* renamed from: g */
    public static void m4341g(Context context, int i) {
        m4350o(context);
        if (i < 1 || i > 100) {
            C0923b.m4648d("JPushInterface", "Invalid maxNumber,it should be a number between 1 and 100!");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        C0922a.m4637a(context, "JPUSH", "geo_fence_max_num", bundle);
    }

    /* renamed from: g */
    public static boolean m4342g(Context context) {
        m4350o(context);
        return C0902c.m4451b(context) == 1;
    }

    /* renamed from: h */
    public static void m4343h(Context context) {
        C0922a.m4636a(context, "kill", (Object) null);
    }

    /* renamed from: i */
    public static void m4344i(Context context) {
        C0922a.m4636a(context, "pause", (Object) null);
    }

    /* renamed from: j */
    public static void m4345j(Context context) {
        C0922a.m4636a(context, "resume", (Object) null);
    }

    /* renamed from: k */
    public static void m4346k(Context context) {
        if (context == null) {
            C0923b.m4654j("JPushInterface", "[requestPermission] unexcepted - context was null");
        } else {
            C0831g.m4083e(context);
        }
    }

    /* renamed from: l */
    public static void m4347l(Context context) {
        C0923b.m4644b("JPushInterface", "action:resumePush");
        m4350o(context);
        C0922a.m4637a(context, "JPUSH", "resume", null);
        C0921c.m4615a().m4625c(context);
    }

    /* renamed from: m */
    public static void m4348m(Context context) {
        m4350o(context);
        C0831g.m4084f(context);
    }

    /* renamed from: n */
    public static void m4349n(Context context) {
        C0923b.m4644b("JPushInterface", "action:stopPush");
        m4350o(context);
        C0922a.m4637a(context, "JPUSH", "stop", null);
        C0921c.m4615a().m4626d(context);
    }

    /* renamed from: o */
    private static void m4350o(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
        C0869a.f3646a = context.getApplicationContext();
    }
}
