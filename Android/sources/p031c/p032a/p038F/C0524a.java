package p031c.p032a.p038F;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p039G.C0526a;
import p031c.p032a.p040H.C0527a;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.F.a */
/* loaded from: classes.dex */
public class C0524a extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0524a f2616a;

    /* renamed from: b */
    private Context f2617b;

    /* renamed from: c */
    private JSONObject f2618c;

    /* renamed from: d */
    private String f2619d;

    /* renamed from: e */
    private boolean f2620e;

    /* renamed from: a */
    private void m2756a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<C0526a> list) {
        try {
            if (this.f2618c == null) {
                this.f2618c = new JSONObject();
            }
            this.f2618c.put("ssid", str);
            this.f2618c.put("bssid", str2);
            this.f2618c.put("local_ip", str3);
            this.f2618c.put("local_mac", str4);
            this.f2618c.put("netmask", str5);
            this.f2618c.put("gateway", str8);
            this.f2618c.put("dhcp", str9);
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.isEmpty(str6)) {
                jSONArray.put(str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                jSONArray.put(str7);
            }
            this.f2618c.put("dns", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C0526a c0526a : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ip", c0526a.f2624a);
                jSONObject.put("mac", c0526a.f2627d);
                jSONArray2.put(jSONObject);
            }
            this.f2618c.put("data", jSONArray2);
        } catch (JSONException e2) {
            C0675a.m3475g("JArp", "packageJson exception: " + e2.getMessage());
        }
    }

    /* renamed from: d */
    public static C0524a m2757d() {
        if (f2616a == null) {
            synchronized (C0524a.class) {
                f2616a = new C0524a();
            }
        }
        return f2616a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final void mo2672a(JSONObject jSONObject) {
        this.f2620e = true;
        JSONObject optJSONObject = jSONObject.optJSONObject("content");
        boolean z = !optJSONObject.optBoolean("disable");
        C0511f.m2690a(this.f2617b, "JArp", z);
        if (z) {
            long optLong = optJSONObject.optLong("frequency", 0L) * 1000;
            if (optLong == 0) {
                C0511f.m2691a(this.f2617b, true);
            } else {
                C0511f.m2691a(this.f2617b, false);
                C0511f.m2696b(this.f2617b, "JArp", optLong);
            }
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final boolean mo2674a(Context context, String str) {
        return true;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    protected final boolean mo2677b() {
        return C0511f.m2709h(this.f2617b, "JArp");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    public final boolean mo2678b(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f2619d)) {
            this.f2619d = "";
        }
        StringBuilder sb = new StringBuilder("JArp");
        sb.append(this.f2619d);
        return currentTimeMillis - C0511f.m2705f(context, sb.toString()) > C0511f.m2707g(context, "JArp");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        String str2;
        String str3;
        if (!C0812a.m3939a(context, "android.permission.ACCESS_WIFI_STATE")) {
            C0675a.m3475g("JArp", "collect arp failed because has no permission Manifest.permission.ACCESS_WIFI_STATE");
            return;
        }
        if (!C0812a.m3956i(context).toUpperCase().startsWith("WIFI")) {
            C0675a.m3475g("JArp", "collect arp failed because networkType is not wifi");
            return;
        }
        if (TextUtils.isEmpty(C0557c.m2913g(context))) {
            C0675a.m3475g("JArp", "collect arp failed because can't get registerId");
            return;
        }
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            C0675a.m3469c("JArp", "collect arp failed because get wifiManager failed");
            return;
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo != null) {
            str3 = C0819h.m3992b(connectionInfo.getSSID());
            str2 = connectionInfo.getBSSID();
        } else {
            str2 = "";
            str3 = str2;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        this.f2619d = TextUtils.isEmpty(str2) ? str3 : str2;
        if (C0511f.m2700c(context) && C0511f.m2713l(context, this.f2619d)) {
            C0675a.m3475g("JArp", "collect arp failed because this wifi 【" + this.f2619d + "】 can't report twice");
            return;
        }
        boolean mo2678b = mo2678b(context, "JArp");
        if (!this.f2620e && !mo2678b) {
            C0675a.m3475g("JArp", "collect arp failed because this wifi 【" + this.f2619d + "】 is not in report time");
            return;
        }
        this.f2620e = false;
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return;
        }
        int i = dhcpInfo.ipAddress;
        long j = i;
        byte[] bArr = {(byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255)};
        String m2759a = C0527a.m2759a(i);
        if (TextUtils.equals(m2759a, "0.0.0.0")) {
            m2759a = "";
        }
        String m3948d = C0812a.m3948d(context, "");
        String m2759a2 = C0527a.m2759a(dhcpInfo.netmask);
        String str4 = TextUtils.equals(m2759a2, "0.0.0.0") ? "" : m2759a2;
        String m2759a3 = C0527a.m2759a(dhcpInfo.dns1);
        String str5 = TextUtils.equals(m2759a3, "0.0.0.0") ? "" : m2759a3;
        String m2759a4 = C0527a.m2759a(dhcpInfo.dns2);
        String str6 = TextUtils.equals(m2759a4, "0.0.0.0") ? "" : m2759a4;
        String m2759a5 = C0527a.m2759a(dhcpInfo.gateway);
        String str7 = TextUtils.equals(m2759a5, "0.0.0.0") ? "" : m2759a5;
        String m2759a6 = C0527a.m2759a(dhcpInfo.serverAddress);
        String str8 = TextUtils.equals(m2759a6, "0.0.0.0") ? "" : m2759a6;
        C0527a.m2762a(str8, bArr);
        List<C0526a> m2761a = C0527a.m2761a(str8);
        if (m2761a == null || m2761a.isEmpty()) {
            C0675a.m3475g("JArp", "collect arp failed because can't get arp info");
        } else {
            C0675a.m3469c("JArp", "collect arp success");
            m2756a(str3, str2, m2759a, m3948d, str4, str5, str6, str7, str8, m2761a);
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    protected final String mo2682d(Context context) {
        this.f2617b = context;
        return "JArp";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        JSONObject jSONObject = this.f2618c;
        if (jSONObject == null) {
            C0675a.m3469c("JArp", "there are no data to report");
            return;
        }
        C0513h.m2719a(context, jSONObject, "mac_list");
        C0513h.m2721a(context, this.f2618c, new C0525b(this, context, str));
        this.f2618c = null;
    }
}
