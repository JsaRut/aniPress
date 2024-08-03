package p000a.p005b.p009c.p015d;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: a.b.c.d.a */
/* loaded from: classes.dex */
public final class C0049a {
    /* renamed from: a */
    public static boolean m231a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
            case 7:
            case 9:
                return false;
            case 8:
            default:
                return true;
        }
    }
}
