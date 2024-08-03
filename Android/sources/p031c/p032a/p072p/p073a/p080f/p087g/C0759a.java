package p031c.p032a.p072p.p073a.p080f.p087g;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.Locale;
import java.util.regex.Pattern;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.g.a */
/* loaded from: classes.dex */
public final class C0759a {
    /* renamed from: a */
    public static String m3797a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "unknow";
        }
    }

    /* renamed from: a */
    public static String m3798a(Context context, String str) {
        String m3803c = m3803c(context);
        String m3804d = TextUtils.isEmpty(m3803c) ? m3804d(context) : m3803c;
        return TextUtils.isEmpty(m3804d) ? str : m3804d;
    }

    /* renamed from: a */
    public static String m3799a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                bArr[i] = (byte) charArray[i];
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (Throwable unused) {
            C0732b.m3718b("AndroidUtil", "Get MD5 error");
            return "";
        }
    }

    /* renamed from: a */
    private static boolean m3800a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        try {
            return Pattern.compile("[\\x20-\\x7E]+").matcher(charSequence).matches();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static String m3801b(Context context) {
        String str;
        if (m3802b(context, "android.permission.READ_PHONE_STATE")) {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            if (m3800a((CharSequence) deviceId)) {
                C0732b.m3718b("AndroidUtil", "Imei:" + deviceId);
                return deviceId;
            }
            str = "Imei " + deviceId + " is invalid ";
        } else {
            str = "lost permissioin : android.permission.READ_PHONE_STATE";
        }
        C0732b.m3718b("AndroidUtil", str);
        return "";
    }

    /* renamed from: b */
    private static boolean m3802b(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private static String m3803c(Context context) {
        String str = "";
        if (Build.VERSION.SDK_INT >= 23 || !m3802b(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        try {
            str = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
            C0732b.m3718b("AndroidUtil", "android mac address:" + str);
            return str;
        } catch (Exception e2) {
            C0732b.m3717a("AndroidUtil", "get mac from wifiManager failed ", e2);
            return str;
        }
    }

    /* renamed from: d */
    private static String m3804d(Context context) {
        byte[] hardwareAddress;
        String str = "";
        if (!(m3802b(context, "android.permission.ACCESS_WIFI_STATE") ? ((WifiManager) context.getApplicationContext().getSystemService("wifi")).isWifiEnabled() : false)) {
            return "";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ("wlan0".equalsIgnoreCase(nextElement.getName()) && (hardwareAddress = nextElement.getHardwareAddress()) != null && hardwareAddress.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format(Locale.ENGLISH, "%02x:", Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    str = sb.toString();
                    C0732b.m3718b("AndroidUtil", "mac address from NetworkInterface:" + str);
                    return str;
                }
            }
            return "";
        } catch (Exception e2) {
            C0732b.m3717a("AndroidUtil", "get mac from NetworkInterface failed", e2);
            return str;
        }
    }
}
