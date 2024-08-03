package p031c.p101b.p102a.p114l;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.b.a.l.p */
/* loaded from: classes.dex */
public class C0937p {

    /* renamed from: a */
    private static List<String> f3962a;

    /* renamed from: b */
    private static List<String> f3963b;

    /* renamed from: c */
    private static Map<String, Integer> f3964c = new HashMap();

    /* renamed from: d */
    private static Map<String, Integer> f3965d;

    /* renamed from: e */
    private static List<String> f3966e;

    /* renamed from: f */
    private static String f3967f;

    /* renamed from: g */
    private static String f3968g;

    /* renamed from: h */
    private static String f3969h;

    static {
        f3964c.put("xiaomi", 1);
        f3964c.put("meizu", 1);
        f3964c.put("vivo", 1);
        f3964c.put("lge", 1);
        f3962a = new ArrayList();
        f3962a.add("Smartisan");
        f3963b = new ArrayList();
        f3963b.add("MI 5C");
        f3966e = new ArrayList();
        f3966e.add("nubia");
        f3965d = new HashMap();
        f3965d.put("galaxy nexus", 1);
        f3967f = "";
        f3968g = "";
        f3969h = "";
    }

    /* renamed from: a */
    private static String m4701a(String str) {
        try {
            Class<?>[] clsArr = {String.class};
            Object[] objArr = {str};
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str2 = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            C0923b.m4649e("SSPHelper", "get " + str + " version is:" + str2);
            return str2;
        } catch (Throwable th) {
            C0923b.m4646c("SSPHelper", " get " + str + "wrong error:" + th.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m4702a() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str) && f3962a != null && !f3962a.isEmpty()) {
                Iterator<String> it = f3962a.iterator();
                while (it.hasNext()) {
                    if (it.next().toLowerCase().equals(str.toLowerCase())) {
                        C0923b.m4642a("SSPHelper", "black manufacturer:" + str);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            C0923b.m4642a("SSPHelper", "manufacturer fiflter failed:" + th.getMessage());
        }
        try {
            String str2 = Build.MODEL;
            if (!TextUtils.isEmpty(str2) && f3963b != null && !f3963b.isEmpty()) {
                Iterator<String> it2 = f3963b.iterator();
                while (it2.hasNext()) {
                    if (it2.next().toLowerCase().equals(str2.toLowerCase())) {
                        C0923b.m4642a("SSPHelper", "black model:" + str2);
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
            C0923b.m4642a("SSPHelper", "model fiflter failed:" + th2.getMessage());
        }
        String m4705d = m4705d();
        if (!TextUtils.isEmpty(m4705d) && m4705d.startsWith("EmotionUI_4.0")) {
            C0923b.m4642a("SSPHelper", "emuiVersion is in black:" + m4705d);
            return true;
        }
        try {
            String m4706e = m4706e();
            if (TextUtils.isEmpty(m4706e)) {
                return false;
            }
            if (!m4706e.startsWith("Funtouch OS_4.0") && !m4706e.startsWith("Funtouch OS_3.1") && !m4706e.startsWith("Funtouch OS_9")) {
                return false;
            }
            C0923b.m4642a("SSPHelper", "vivoVersion is in black:" + m4706e);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m4703b() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str) && f3964c != null && !f3964c.isEmpty() && f3964c.containsKey(str.toLowerCase())) {
                C0923b.m4642a("SSPHelper", "found notify style by manufacturer:" + str);
                return f3964c.get(str.toLowerCase()).intValue();
            }
        } catch (Throwable th) {
            C0923b.m4642a("SSPHelper", "manufacturer fiflter failed:" + th.getMessage());
        }
        try {
            String str2 = Build.MODEL;
            if (!TextUtils.isEmpty(str2) && f3965d != null && !f3965d.isEmpty() && f3965d.containsKey(str2.toLowerCase())) {
                C0923b.m4642a("SSPHelper", "found notify style by model:" + str2);
                return f3965d.get(str2.toLowerCase()).intValue();
            }
        } catch (Throwable th2) {
            C0923b.m4642a("SSPHelper", "model fiflter failed:" + th2.getMessage());
        }
        String m4707f = m4707f();
        if (TextUtils.isEmpty(m4707f)) {
            return 0;
        }
        if (!m4707f.startsWith("V3.0") && !m4707f.startsWith("V2.")) {
            return 0;
        }
        C0923b.m4642a("SSPHelper", "oppo V2.X/V3.0 version use left-right notify style :" + m4707f);
        return 1;
    }

    /* renamed from: c */
    public static boolean m4704c() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str) && f3966e != null && !f3966e.isEmpty()) {
                Iterator<String> it = f3966e.iterator();
                while (it.hasNext()) {
                    if (it.next().toLowerCase().equals(str.toLowerCase())) {
                        C0923b.m4642a("SSPHelper", "one line manufacturer:" + str);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            C0923b.m4642a("SSPHelper", "manufacturer fiflter failed:" + th.getMessage());
        }
        String m4707f = m4707f();
        if (TextUtils.isEmpty(m4707f)) {
            return false;
        }
        if (!m4707f.startsWith("V3.2") && !m4707f.startsWith("V3.1")) {
            return false;
        }
        C0923b.m4642a("SSPHelper", "oppo V3.1/V3.2 version use one line  qnotify style :" + m4707f);
        return true;
    }

    /* renamed from: d */
    private static String m4705d() {
        if (!TextUtils.isEmpty(f3967f)) {
            return f3967f;
        }
        f3967f = m4701a("ro.build.version.emui");
        return f3967f;
    }

    /* renamed from: e */
    private static String m4706e() {
        if (!TextUtils.isEmpty(f3969h)) {
            return f3969h;
        }
        f3969h = m4701a("ro.vivo.os.build.display.id");
        return f3969h;
    }

    /* renamed from: f */
    private static String m4707f() {
        if (!TextUtils.isEmpty(f3968g)) {
            return f3968g;
        }
        f3968g = m4701a("ro.build.version.opporom");
        return f3968g;
    }
}
