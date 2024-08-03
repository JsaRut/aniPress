package p139d.p143b.p169g.p174b;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: d.b.g.b.c */
/* loaded from: classes.dex */
public class C1771c {

    /* renamed from: a */
    private static final C1771c f6421a = new C1771c();

    /* renamed from: b */
    private static boolean f6422b = true;

    /* renamed from: c */
    private final Queue<a> f6423c = new ArrayBlockingQueue(20);

    /* renamed from: d.b.g.b.c$a */
    /* loaded from: classes.dex */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C1771c() {
    }

    /* renamed from: a */
    public static C1771c m7253a() {
        return f6422b ? new C1771c() : f6421a;
    }

    /* renamed from: a */
    public void m7254a(a aVar) {
        if (f6422b) {
            if (this.f6423c.size() + 1 > 20) {
                this.f6423c.poll();
            }
            this.f6423c.add(aVar);
        }
    }

    public String toString() {
        return this.f6423c.toString();
    }
}
