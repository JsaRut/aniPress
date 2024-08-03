package cn.jiguang.plugins.push.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cn.jiguang.plugins.push.p119a.C0951a;
import cn.jiguang.plugins.push.p120b.C0953a;

/* loaded from: classes.dex */
public class JPushBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static Bundle f3994a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("cn.jpush.android.intent.NOTIFICATION_OPENED".equals(intent.getAction())) {
            C0951a.m4763a("JPushBroadcastReceiver ACTION_NOTIFICATION_OPENED");
            try {
                f3994a = intent.getExtras();
                C0953a.m4773a(context);
            } catch (Throwable th) {
                C0951a.m4765b("JPushBroadcastReceiver ACTION_NOTIFICATION_OPENED error:" + th.getMessage());
            }
        }
    }
}
