package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p092s.C0831g;

/* loaded from: classes.dex */
public class PushReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            C0601d.m3072b("PushReceiver", "onReceive:" + intent.getAction());
            C0831g.m4072a(context.getApplicationContext(), intent.getStringExtra("sdktype"), 31, null, null, intent);
            C0595f.m3045a(context.getApplicationContext(), intent);
        } catch (Throwable unused) {
        }
    }
}
