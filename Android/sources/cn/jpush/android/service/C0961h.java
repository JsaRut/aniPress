package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* renamed from: cn.jpush.android.service.h */
/* loaded from: classes.dex */
public class C0961h extends BroadcastReceiver {
    /* renamed from: a */
    public void m4795a(int i) {
    }

    /* renamed from: a */
    public void m4796a(Context context, int i) {
    }

    /* renamed from: a */
    public final void m4797a(Map map) {
        try {
            Object obj = map.get("2");
            int intValue = obj != null ? ((Integer) obj).intValue() : -1;
            m4795a(intValue);
            Object obj2 = map.get("1");
            m4796a(obj2 != null ? (Context) obj2 : null, intValue);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
    }
}
