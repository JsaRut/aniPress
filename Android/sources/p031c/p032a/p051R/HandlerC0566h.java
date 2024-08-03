package p031c.p032a.p051R;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p031c.p032a.p066j.C0675a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.R.h */
/* loaded from: classes.dex */
public final class HandlerC0566h extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0564f f2730a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0566h(C0564f c0564f, Looper looper) {
        super(looper);
        this.f2730a = c0564f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        LocationManager locationManager;
        String str2;
        LocationListener locationListener;
        String str3;
        String str4;
        String str5;
        String str6;
        LocationManager locationManager2;
        String str7;
        LocationListener locationListener2;
        String str8;
        String str9;
        int i = 1001;
        switch (message.what) {
            case 1001:
                try {
                    str4 = this.f2730a.f2727h;
                    if (str4 != null) {
                        str6 = this.f2730a.f2727h;
                        if (str6.equals("network")) {
                            C0675a.m3475g("JLocationGps", "get gps with network time out ");
                            this.f2730a.f2727h = "gps";
                            this.f2730a.m2952f();
                            locationManager2 = this.f2730a.f2723d;
                            str7 = this.f2730a.f2727h;
                            locationListener2 = this.f2730a.f2728i;
                            locationManager2.requestLocationUpdates(str7, 2000L, 0.0f, locationListener2);
                            StringBuilder sb = new StringBuilder("request ");
                            str8 = this.f2730a.f2727h;
                            sb.append(str8);
                            sb.append(" location");
                            C0675a.m3469c("JLocationGps", sb.toString());
                            this.f2730a.f2725f.sendEmptyMessageDelayed(1001, 10000L);
                            return;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("get ");
                    str5 = this.f2730a.f2727h;
                    sb2.append(str5);
                    sb2.append(" time out ");
                    C0675a.m3475g("JLocationGps", sb2.toString());
                    C0564f.m2948b(this.f2730a);
                    return;
                } catch (Throwable th) {
                    str = "when location time out " + th.getMessage();
                    break;
                }
            case 1002:
            default:
                return;
            case 1003:
                break;
            case 1004:
                C0675a.m3469c("JLocationGps", "LOAD_GPS_ACTION_REQUEST_ONLY_NETWORK");
                i = 1005;
                break;
            case 1005:
                StringBuilder sb3 = new StringBuilder("get only network ");
                str9 = this.f2730a.f2727h;
                sb3.append(str9);
                sb3.append(" time out ");
                str = sb3.toString();
                C0675a.m3475g("JLocationGps", str);
                C0564f.m2948b(this.f2730a);
                return;
        }
        try {
            locationManager = this.f2730a.f2723d;
            str2 = this.f2730a.f2727h;
            locationListener = this.f2730a.f2728i;
            locationManager.requestLocationUpdates(str2, 2000L, 0.0f, locationListener);
            StringBuilder sb4 = new StringBuilder("request ");
            str3 = this.f2730a.f2727h;
            sb4.append(str3);
            sb4.append(" location");
            C0675a.m3469c("JLocationGps", sb4.toString());
            this.f2730a.f2725f.sendEmptyMessageDelayed(i, 20000L);
        } catch (SecurityException unused) {
            str = "No suitable permission when get last known location!";
        } catch (Throwable unused2) {
            C0675a.m3475g("JLocationGps", "The provider is illegal argument!");
            C0564f.m2948b(this.f2730a);
        }
    }
}
