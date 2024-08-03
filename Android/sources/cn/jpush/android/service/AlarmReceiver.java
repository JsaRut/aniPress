package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p092s.C0831g;

/* loaded from: classes.dex */
public class AlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C0601d.m3072b("AlarmReceiver", "onReceive");
        C0557c.m2922p(context);
        C0831g.m4072a(context, "JCore", 10, "a2", null, new Object[0]);
    }
}
