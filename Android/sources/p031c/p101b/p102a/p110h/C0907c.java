package p031c.p101b.p102a.p110h;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: c.b.a.h.c */
/* loaded from: classes.dex */
public class C0907c {

    /* renamed from: a */
    private static Queue<Integer> f3886a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public static int m4528a() {
        if (f3886a.size() > 0) {
            return f3886a.poll().intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m4529a(int i) {
        return f3886a.offer(Integer.valueOf(i));
    }

    /* renamed from: b */
    public static int m4530b() {
        return f3886a.size();
    }

    /* renamed from: b */
    public static boolean m4531b(int i) {
        return f3886a.contains(Integer.valueOf(i));
    }
}
