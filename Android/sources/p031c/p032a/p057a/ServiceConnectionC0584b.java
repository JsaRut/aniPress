package p031c.p032a.p057a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import cn.jpush.android.service.BinderC0956c;
import p031c.p032a.p059c.C0593d;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p092s.C0831g;
import p031c.p032a.p099y.AbstractBinderC0864b;

/* renamed from: c.a.a.b */
/* loaded from: classes.dex */
final class ServiceConnectionC0584b implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0601d.m3072b("JCoreGobal", "action - onServiceConnected, ComponentName:" + componentName);
        C0601d.m3075d("JCoreGobal", "Remote Service bind success.");
        try {
            BinderC0956c.m4791b(AbstractBinderC0864b.m4198a(iBinder), C0593d.m3038a(C0583a.m2978a(null)));
            if (C0583a.f2794a != null) {
                C0831g.m4080c(C0583a.f2794a);
            }
        } catch (Throwable th) {
            C0601d.m3079h("JCoreGobal", "onServiceConnected e:" + th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0601d.m3072b("JCoreGobal", "action - onServiceDisconnected, ComponentName:" + componentName);
    }
}
