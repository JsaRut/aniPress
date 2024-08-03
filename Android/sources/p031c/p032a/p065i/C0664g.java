package p031c.p032a.p065i;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import cn.jpush.android.service.AlarmReceiver;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p090q.AbstractC0808a;
import p031c.p032a.p090q.C0809b;

/* renamed from: c.a.i.g */
/* loaded from: classes.dex */
public final class C0664g {

    /* renamed from: a */
    private static volatile C0664g f3070a;

    /* renamed from: b */
    private static final Object f3071b = new Object();

    /* renamed from: c */
    private Context f3072c;

    /* renamed from: d */
    private AbstractC0808a f3073d = new C0665h(this);

    /* renamed from: e */
    private long f3074e;

    private C0664g() {
    }

    /* renamed from: a */
    public static C0664g m3399a() {
        if (f3070a == null) {
            synchronized (f3071b) {
                if (f3070a == null) {
                    f3070a = new C0664g();
                }
            }
        }
        return f3070a;
    }

    /* renamed from: a */
    private void m3400a(Context context) {
        this.f3072c = context;
        C0809b.m3924a().m3925a(8000, C0556b.f2702b * 1000, this.f3073d);
    }

    /* renamed from: b */
    private void m3402b(Context context) {
        this.f3074e = SystemClock.elapsedRealtime();
        if (!((Boolean) C0618c.m3190a(context, C0617b.m3153a())).booleanValue()) {
            C0658a.m3369a(context);
            return;
        }
        try {
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) AlarmReceiver.class), 0));
        } catch (Throwable unused) {
            C0675a.m3475g("AlarmHelper", "Cancel heartbeat alarm failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3403c(Context context) {
        C0675a.m3469c("PeriodWorker", "periodTask...");
        m3402b(context);
        C0557c.m2897a(context, false, 0L);
        C0659b.m3371a().m3385a(context, 19, 0, "periodTask");
        C0661d.m3386a(context, "periodtask", null);
    }

    /* renamed from: a */
    public final void m3404a(Context context, boolean z) {
        C0675a.m3473e("PeriodWorker", "PeriodWorker resume");
        if (this.f3074e > 0 && SystemClock.elapsedRealtime() > this.f3074e + ((C0556b.f2702b + 5) * 1000)) {
            C0675a.m3473e("PeriodWorker", "schedule time is expired, execute now");
            m3400a(context);
            m3403c(context);
        } else if (!z) {
            C0675a.m3469c("PeriodWorker", "need not change period task");
        } else {
            m3400a(context);
            m3402b(context);
        }
    }
}
