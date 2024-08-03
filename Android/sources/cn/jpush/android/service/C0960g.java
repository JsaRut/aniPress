package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p031c.p101b.p102a.p112j.C0918c;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: cn.jpush.android.service.g */
/* loaded from: classes.dex */
public class C0960g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C0923b.m4654j("TagAliasReceiver", "TagAliasOperator onReceive intent is null");
            return;
        }
        long longExtra = intent.getLongExtra("tagalias_seqid", -1L);
        int intExtra = intent.getIntExtra("tagalias_errorcode", 0);
        if (longExtra == -1) {
            C0923b.m4653i("TagAliasReceiver", "TagAliasOperator onReceive rid is invalide");
        } else {
            C0918c.m4592a().m4601a(context.getApplicationContext(), longExtra, intExtra, intent);
        }
    }
}
