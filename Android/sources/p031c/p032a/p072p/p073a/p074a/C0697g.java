package p031c.p032a.p072p.p073a.p074a;

import android.os.Handler;
import android.os.HandlerThread;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.a.g */
/* loaded from: classes.dex */
public final class C0697g {

    /* renamed from: a */
    private static Handler f3202a;

    /* renamed from: b */
    private static final Object f3203b = new Object();

    /* renamed from: a */
    public static AbstractRunnableC0704n m3576a(int i) {
        if (i != 4369) {
            return null;
        }
        return new C0699i();
    }

    /* renamed from: a */
    public static void m3577a(int i, int i2) {
        if (C0707b.m3613a(null) == null) {
            C0732b.m3726i("PeriodTaskManager", "set failed, please call JAnalyticsInterface.init(context) first");
            return;
        }
        AbstractRunnableC0704n m3576a = m3576a(4369);
        if (m3576a != null) {
            boolean mo3580a = m3576a.mo3580a(i2);
            m3578a(4369, mo3580a);
            if (mo3580a) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("period", i2);
                    C0830f.m4054a(C0707b.m3613a(null), C0830f.m4050a(jSONObject, "analytics_report_period"), false);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3578a(int i, boolean z) {
        if (f3202a == null) {
            synchronized (f3203b) {
                if (f3202a == null) {
                    HandlerThread handlerThread = new HandlerThread("PeriodTask");
                    handlerThread.start();
                    f3202a = new HandlerC0698h(handlerThread.getLooper());
                }
            }
        }
        AbstractRunnableC0704n m3576a = m3576a(i);
        if (m3576a == null) {
            return;
        }
        int mo3579a = m3576a.mo3579a();
        if (!z) {
            if (mo3579a <= 0 || f3202a.hasMessages(i)) {
                return;
            }
            f3202a.sendEmptyMessageDelayed(i, mo3579a * 1000);
            return;
        }
        if (f3202a.hasMessages(i)) {
            f3202a.removeMessages(i);
        }
        if (mo3579a > 0) {
            f3202a.sendEmptyMessageDelayed(i, mo3579a * 1000);
        }
    }
}
