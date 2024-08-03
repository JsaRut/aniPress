package p031c.p032a.p072p.p073a.p080f.p087g;

import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.a.p.a.f.g.b */
/* loaded from: classes.dex */
public final class C0760b {

    /* renamed from: a */
    private static final Object f3380a = new Object();

    /* renamed from: b */
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> f3381b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static SimpleDateFormat m3805a(String str) {
        ThreadLocal<SimpleDateFormat> threadLocal = f3381b.get(str);
        if (threadLocal == null) {
            synchronized (f3380a) {
                threadLocal = f3381b.get(str);
                if (threadLocal == null) {
                    threadLocal = new C0761c(str);
                    f3381b.put(str, threadLocal);
                }
            }
        }
        return threadLocal.get();
    }
}
