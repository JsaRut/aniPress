package p031c.p032a.p043K;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.a.K.a */
/* loaded from: classes.dex */
public final class C0539a {

    /* renamed from: a */
    private static final Object f2670a = new Object();

    /* renamed from: b */
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> f2671b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String m2807a() {
        return m2808a("yyyyMMddHHmmss").format(new Date());
    }

    /* renamed from: a */
    private static SimpleDateFormat m2808a(String str) {
        ThreadLocal<SimpleDateFormat> threadLocal = f2671b.get(str);
        if (threadLocal == null) {
            synchronized (f2670a) {
                threadLocal = f2671b.get(str);
                if (threadLocal == null) {
                    threadLocal = new C0540b(str);
                    f2671b.put(str, threadLocal);
                }
            }
        }
        return threadLocal.get();
    }
}
