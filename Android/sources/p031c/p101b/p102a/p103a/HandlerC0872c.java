package p031c.p101b.p102a.p103a;

import android.annotation.SuppressLint;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p101b.p102a.p114l.C0923b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.b.a.a.c */
/* loaded from: classes.dex */
public class HandlerC0872c extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0873d f3657a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0872c(C0873d c0873d, Looper looper) {
        super(looper);
        this.f3657a = c0873d;
    }

    @Override // android.os.Handler
    @SuppressLint({"MissingPermission"})
    public void handleMessage(Message message) {
        long j;
        AtomicBoolean atomicBoolean;
        String str;
        String str2;
        String str3;
        LocationManager locationManager;
        String str4;
        LocationManager locationManager2;
        String str5;
        LocationListener locationListener;
        Handler handler;
        long j2;
        switch (message.what) {
            case 1000:
                C0923b.m4642a("CustomGeofenAction", "period task tid " + Thread.currentThread().getId());
                C0873d c0873d = this.f3657a;
                j = c0873d.f3661g;
                c0873d.m4255b(j);
                break;
            case 1001:
                this.f3657a.m4259e();
                try {
                    str = this.f3657a.f3663i;
                } catch (Throwable th) {
                    C0923b.m4644b("CustomGeofenAction", "request location error#" + th);
                }
                if (str != null) {
                    str3 = this.f3657a.f3663i;
                    if (str3.equals("gps")) {
                        C0923b.m4644b("CustomGeofenAction", "GPS provider time out!");
                        this.f3657a.f3663i = "network";
                        locationManager = this.f3657a.f3659e;
                        str4 = this.f3657a.f3663i;
                        if (!locationManager.isProviderEnabled(str4)) {
                            str2 = "Network provider is disabled";
                            C0923b.m4644b("CustomGeofenAction", str2);
                            atomicBoolean = this.f3657a.f3666l;
                            atomicBoolean.set(false);
                            return;
                        }
                        locationManager2 = this.f3657a.f3659e;
                        str5 = this.f3657a.f3663i;
                        locationListener = this.f3657a.f3665k;
                        locationManager2.requestLocationUpdates(str5, 2000L, 0.0f, locationListener);
                        handler = this.f3657a.f3660f;
                        j2 = this.f3657a.f3662h;
                        handler.sendEmptyMessageDelayed(1001, j2 / 2);
                        return;
                    }
                }
                str2 = "Network provider time out!";
                C0923b.m4644b("CustomGeofenAction", str2);
                atomicBoolean = this.f3657a.f3666l;
                atomicBoolean.set(false);
                return;
            case 1002:
                break;
            default:
                return;
        }
        this.f3657a.m4263f();
    }
}
