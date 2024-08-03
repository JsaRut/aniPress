package cn.jpush.android.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p099y.AbstractBinderC0864b;

/* renamed from: cn.jpush.android.service.e */
/* loaded from: classes.dex */
public class ServiceC0958e extends Service {

    /* renamed from: a */
    private static AbstractBinderC0864b f3998a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return f3998a;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (f3998a == null) {
            f3998a = new BinderC0956c();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            C0601d.m3077f("JCommonService", "onStartCommand intent is empty or action is empty");
        } else {
            C0595f.m3046a(this, intent.getAction(), intent.getExtras());
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
