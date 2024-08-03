package p031c.p032a.p055V;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.V.e */
/* loaded from: classes.dex */
final class ServiceConnectionC0578e implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0574a f2771a;

    private ServiceConnectionC0578e(C0574a c0574a) {
        this.f2771a = c0574a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC0578e(C0574a c0574a, byte b2) {
        this(c0574a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (componentName == null) {
            return;
        }
        try {
            String str = componentName.getPackageName() + componentName.getClassName();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0574a.m2965a(this.f2771a).remove(str);
            C0675a.m3469c("JWake", "cacheServiceConnectionMap remove " + str);
            C0574a.m2969b(this.f2771a).getApplicationContext().unbindService(this);
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "onServiceConnected throwable" + th.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
