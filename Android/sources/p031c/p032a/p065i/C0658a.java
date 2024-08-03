package p031c.p032a.p065i;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import cn.jpush.android.service.AlarmReceiver;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.i.a */
/* loaded from: classes.dex */
public final class C0658a {
    /* renamed from: a */
    public static void m3369a(Context context) {
        long j = C0556b.f2703c * 1000;
        long currentTimeMillis = System.currentTimeMillis() + j;
        C0675a.m3473e("AlarmHelper", "Reset heartbeat alarm, wait " + j + "ms.");
        try {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) AlarmReceiver.class), 0);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setWindow(0, currentTimeMillis, 0L, broadcast);
            } else {
                alarmManager.setInexactRepeating(0, currentTimeMillis, j, broadcast);
            }
        } catch (Throwable th) {
            C0675a.m3476h("AlarmHelper", "can't trigger alarm cause by exception:" + th);
        }
    }
}
