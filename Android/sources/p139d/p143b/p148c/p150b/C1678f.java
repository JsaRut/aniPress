package p139d.p143b.p148c.p150b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: d.b.c.b.f */
/* loaded from: classes.dex */
public class C1678f extends C1675c {

    /* renamed from: b */
    private static C1678f f6208b;

    private C1678f() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static C1678f m6945b() {
        if (f6208b == null) {
            f6208b = new C1678f();
        }
        return f6208b;
    }

    @Override // p139d.p143b.p148c.p150b.C1675c, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (m6937a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
