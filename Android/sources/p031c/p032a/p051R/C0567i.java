package p031c.p032a.p051R;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p052S.C0571c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0819h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.R.i */
/* loaded from: classes.dex */
public final class C0567i {

    /* renamed from: a */
    private Context f2731a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0567i(Context context) {
        this.f2731a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C0571c> m2958a() {
        String str;
        if (!C0513h.m2723a(this.f2731a)) {
            return null;
        }
        WifiManager wifiManager = (WifiManager) this.f2731a.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            C0675a.m3475g("JLocationWifi", "get wifiManager failed");
            return null;
        }
        if (!wifiManager.isWifiEnabled()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        C0571c c0571c = new C0571c();
        c0571c.f2749a = C0557c.m2916j(this.f2731a);
        c0571c.f2750b = C0819h.m3992b(connectionInfo.getSSID());
        c0571c.f2751c = "connect";
        c0571c.f2752d = connectionInfo.getRssi();
        c0571c.f2753e = connectionInfo.getBSSID();
        C0675a.m3469c("JLocationWifi", "connectingWifi:" + c0571c.toString());
        arrayList.add(c0571c);
        if (Build.VERSION.SDK_INT < 23 || C0812a.m3939a(this.f2731a, "android.permission.ACCESS_COARSE_LOCATION") || C0812a.m3939a(this.f2731a, "android.permission.ACCESS_FINE_LOCATION")) {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null && scanResults.size() != 0) {
                C0675a.m3469c("JLocationWifi", "scan wifi list success:" + scanResults);
                ArrayList<ScanResult> arrayList2 = new ArrayList(scanResults);
                for (ScanResult scanResult : arrayList2) {
                    if (!(c0571c.f2750b.equals(C0819h.m3992b(scanResult.SSID)) && c0571c.f2753e.equals(scanResult.BSSID)) && scanResult.level >= -200) {
                        for (ScanResult scanResult2 : arrayList2) {
                            if (scanResult2 != scanResult && scanResult.SSID.equals(scanResult2.SSID) && scanResult.BSSID.equals(scanResult2.BSSID)) {
                                scanResults.remove(scanResult);
                            }
                        }
                    } else {
                        scanResults.remove(scanResult);
                    }
                }
                arrayList2.clear();
                Collections.sort(scanResults, new C0568j(this));
                for (int i = 0; i < scanResults.size() && i != 9; i++) {
                    ScanResult scanResult3 = scanResults.get(i);
                    String m3992b = C0819h.m3992b(scanResult3.SSID);
                    C0571c c0571c2 = new C0571c();
                    c0571c2.f2749a = C0557c.m2916j(this.f2731a);
                    c0571c2.f2750b = m3992b;
                    c0571c2.f2751c = null;
                    if (i == 0) {
                        c0571c2.f2751c = "strongest";
                    }
                    c0571c2.f2752d = scanResult3.level;
                    c0571c2.f2753e = scanResult3.BSSID;
                    arrayList.add(c0571c2);
                }
                return arrayList;
            }
            str = "scan wifi list failed";
        } else {
            str = "scan wifi list failed because has no Manifest.permission.LOCATION";
        }
        C0675a.m3475g("JLocationWifi", str);
        return arrayList;
    }
}
