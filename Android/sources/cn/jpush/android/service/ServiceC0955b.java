package cn.jpush.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p055V.C0574a;
import p031c.p032a.p060d.C0601d;

/* renamed from: cn.jpush.android.service.b */
/* loaded from: classes.dex */
public class ServiceC0955b extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C0574a.m2970d().m2973a(this, intent != null ? intent.getExtras() : null, 2);
        return new BinderC0954a(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C0601d.m3072b("DaemonService", "action onCreate");
        C0557c.m2902a(true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C0601d.m3072b("DaemonService", "action onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C0574a.m2970d().m2973a(this, intent != null ? intent.getExtras() : null, 1);
        return super.onStartCommand(intent, i, i2);
    }
}
