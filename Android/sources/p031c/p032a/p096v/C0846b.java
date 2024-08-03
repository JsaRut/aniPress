package p031c.p032a.p096v;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.v.b */
/* loaded from: classes.dex */
public final class C0846b {

    /* renamed from: a */
    private static final Object f3593a = new Object();

    /* renamed from: b */
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> f3594b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static String f3595c = "yyyyMMdd_HHmm";

    /* renamed from: a */
    public static String m4123a() {
        return m4124a("yyyy-MM-dd_HH:mm:ss").format(new Date());
    }

    /* renamed from: a */
    public static SimpleDateFormat m4124a(String str) {
        ThreadLocal<SimpleDateFormat> threadLocal = f3594b.get(str);
        if (threadLocal == null) {
            synchronized (f3593a) {
                threadLocal = f3594b.get(str);
                if (threadLocal == null) {
                    threadLocal = new C0847c(str);
                    f3594b.put(str, threadLocal);
                }
            }
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public static boolean m4125a(Date date, int i) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(date.getTime());
        calendar.roll(6, -2);
        return calendar.after(calendar2);
    }

    /* renamed from: b */
    public static String m4126b() {
        return m4124a(f3595c).format(new Date());
    }

    /* renamed from: b */
    public static Date m4127b(String str) {
        try {
            return m4124a(f3595c).parse(str);
        } catch (ParseException e2) {
            C0601d.m3071a("DateUtil", "parse filename datetime error - " + str, e2);
            return null;
        }
    }
}
