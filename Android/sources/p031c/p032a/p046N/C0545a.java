package p031c.p032a.p046N;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p045M.C0544b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0659b;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0814c;
import p031c.p032a.p092s.C0831g;
import p031c.p032a.p096v.C0854j;

/* renamed from: c.a.N.a */
/* loaded from: classes.dex */
public final class C0545a {

    /* renamed from: a */
    private static String f2686a = "";

    /* renamed from: b */
    private static String f2687b = "";

    /* renamed from: c */
    private static final FileFilter f2688c = new C0546b();

    /* renamed from: a */
    public static int m2824a(String str) {
        if (C0854j.m4161a(str)) {
            return -1;
        }
        if (str.equalsIgnoreCase("ChinaTelecom")) {
            return 2;
        }
        if (str.equalsIgnoreCase("ChinaMobile")) {
            return 0;
        }
        return str.equalsIgnoreCase("ChinaUnicom") ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0063, code lost:            continue;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m2825a(java.lang.String r10, java.io.FileInputStream r11) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            r2 = -1
            int r11 = r11.read(r1)     // Catch: java.lang.Throwable -> L66
            r3 = 0
            r4 = 0
        Lb:
            if (r4 >= r11) goto L66
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L66
            r6 = 10
            if (r5 == r6) goto L15
            if (r4 != 0) goto L63
        L15:
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L66
            if (r5 != r6) goto L1b
            int r4 = r4 + 1
        L1b:
            r5 = r4
        L1c:
            if (r5 >= r11) goto L63
            int r7 = r5 - r4
            r8 = r1[r5]     // Catch: java.lang.Throwable -> L66
            char r9 = r10.charAt(r7)     // Catch: java.lang.Throwable -> L66
            if (r8 != r9) goto L63
            int r8 = r10.length()     // Catch: java.lang.Throwable -> L66
            int r8 = r8 + (-1)
            if (r7 != r8) goto L60
        L30:
            if (r5 >= r0) goto L5f
            r10 = r1[r5]     // Catch: java.lang.Throwable -> L66
            if (r10 == r6) goto L5f
            r10 = r1[r5]     // Catch: java.lang.Throwable -> L66
            r11 = 48
            if (r10 < r11) goto L5c
            r10 = r1[r5]     // Catch: java.lang.Throwable -> L66
            r4 = 57
            if (r10 > r4) goto L5c
            int r10 = r5 + 1
        L44:
            if (r10 >= r0) goto L51
            r6 = r1[r10]     // Catch: java.lang.Throwable -> L66
            if (r6 < r11) goto L51
            r6 = r1[r10]     // Catch: java.lang.Throwable -> L66
            if (r6 > r4) goto L51
            int r10 = r10 + 1
            goto L44
        L51:
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L66
            int r10 = r10 - r5
            r11.<init>(r1, r3, r5, r10)     // Catch: java.lang.Throwable -> L66
            int r10 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Throwable -> L66
            return r10
        L5c:
            int r5 = r5 + 1
            goto L30
        L5f:
            return r2
        L60:
            int r5 = r5 + 1
            goto L1c
        L63:
            int r4 = r4 + 1
            goto Lb
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p046N.C0545a.m2825a(java.lang.String, java.io.FileInputStream):int");
    }

    /* renamed from: a */
    public static String m2826a() {
        if (!TextUtils.isEmpty(f2686a)) {
            return f2686a;
        }
        m2839f();
        return f2686a;
    }

    /* renamed from: a */
    public static String m2827a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return "0*0";
        }
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static String m2828a(Context context, int i) {
        String str;
        if (i != 53) {
            return null;
        }
        try {
            String str2 = (String) C0618c.m3194b(context, new C0617b("cn.jpush.preferences.v2", "n_udp_report_device_info", ""));
            if (TextUtils.isEmpty(str2)) {
                str = (String) C0618c.m3194b(context, new C0617b("cn.jpush.preferences.v2", "udp_report_device_info", ""));
                if (!TextUtils.isEmpty(str)) {
                    m2829a(context, str);
                }
            } else {
                str = new String(Base64.decode(str2, 2));
            }
            C0675a.m3469c("JDeviceHelper", "read deviceinfo:" + str);
            if (TextUtils.isEmpty(str)) {
                str = m2838e(context);
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            C0659b.m3371a();
            jSONObject2.put("rom_type", (int) C0659b.m3370a(context));
            C0659b.m3371a();
            jSONObject2.put("regid", C0659b.m3379b(context));
            jSONObject.put("rom_info", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cmd", 53);
            jSONObject3.put("content", jSONObject);
            return jSONObject3.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m2829a(Context context, String str) {
        String encodeToString = Base64.encodeToString(str.getBytes(), 2);
        C0617b c0617b = new C0617b("cn.jpush.preferences.v2", "n_udp_report_device_info", "");
        c0617b.m3188a((C0617b) encodeToString);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{c0617b});
        C0675a.m3469c("JDeviceHelper", "save device info:" + str);
    }

    /* renamed from: b */
    public static double m2830b(Context context) {
        double pow;
        int i;
        Point point = new Point();
        boolean z = context instanceof Activity;
        if (z) {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 17) {
                defaultDisplay.getRealSize(point);
            } else if (i2 >= 13) {
                defaultDisplay.getSize(point);
            } else {
                point.x = defaultDisplay.getWidth();
                point.y = defaultDisplay.getHeight();
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            pow = Math.pow(point.x / displayMetrics.xdpi, 2.0d);
            i = point.y;
        } else {
            pow = Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d);
            i = displayMetrics.heightPixels;
        }
        return Math.sqrt(pow + Math.pow(i / displayMetrics.ydpi, 2.0d));
    }

    /* renamed from: b */
    private static long m2831b(String str) {
        String readLine;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 4096);
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
            } while (!readLine.contains(str));
            bufferedReader.close();
            return Integer.valueOf(readLine.split("\\s+")[1]).intValue();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: b */
    public static String m2832b() {
        if (!TextUtils.isEmpty(f2687b)) {
            return f2687b;
        }
        m2839f();
        return f2687b;
    }

    /* renamed from: c */
    public static long m2833c() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getBlockCount() * statFs.getBlockSize()) / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: c */
    public static long m2834c(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                activityManager.getProcessMemoryInfo(new int[]{0});
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo.totalMem / 1024;
            }
        } catch (Throwable unused) {
        }
        return m2831b("MemTotal");
    }

    /* renamed from: d */
    public static int m2835d() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f2688c).length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static JSONArray m2836d(Context context) {
        JSONObject m2822a;
        List<C0544b> m2859a = C0549e.m2859a(context.getApplicationContext());
        if (m2859a == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C0544b c0544b : m2859a) {
            if (c0544b != null && (m2822a = c0544b.m2822a()) != null) {
                jSONArray.put(m2822a);
            }
        }
        return jSONArray;
    }

    /* renamed from: e */
    public static int m2837e() {
        int i = -1;
        for (int i2 = 0; i2 < m2835d(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i3 = 0;
                        while (bArr[i3] >= 48 && bArr[i3] <= 57 && i3 < 128) {
                            i3++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                        if (valueOf.intValue() > i) {
                            i = valueOf.intValue();
                        }
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (Throwable unused) {
                return -1;
            }
        }
        if (i != -1) {
            return i;
        }
        FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
        try {
            int m2825a = m2825a("cpu MHz", fileInputStream2) * 1000;
            if (m2825a <= i) {
                m2825a = i;
            }
            fileInputStream2.close();
            return m2825a;
        } catch (Throwable th2) {
            fileInputStream2.close();
            throw th2;
        }
    }

    /* renamed from: e */
    public static String m2838e(Context context) {
        try {
            C0814c m3962a = C0814c.m3962a(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sim_slots", m2836d(context));
            jSONObject.put("packagename", context.getPackageName());
            jSONObject.put("appkey", C0557c.m2915i(context));
            jSONObject.put("platform", 0);
            jSONObject.put("apkversion", m3962a.f3534e);
            jSONObject.put("systemversion", m3962a.f3535f);
            jSONObject.put("modelnumber", m3962a.f3536g);
            jSONObject.put("basebandversion", m3962a.f3537h);
            jSONObject.put("buildnumber", m3962a.f3538i);
            jSONObject.put("channel", m3962a.f3539j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("PushSDKVer", C0513h.m2718a(0));
            jSONObject2.put("StatisticSDKVer", C0513h.m2718a(1));
            jSONObject2.put("ShareSDKVer", C0513h.m2718a(2));
            jSONObject2.put("CoreSDKVer", C0513h.m2718a(3));
            jSONObject2.put("SspSDKVer", C0513h.m2718a(4));
            jSONObject2.put("VerificationSDKVer", C0513h.m2718a(5));
            jSONObject.put("sdkver", jSONObject2);
            jSONObject.put("installation", m3962a.f3540k);
            jSONObject.put("resolution", m3962a.f3541l);
            C0659b.m3371a();
            jSONObject.put("business", C0659b.m3380b());
            jSONObject.put("device_id_status", ((Integer) C0831g.m4072a(context, "JCOMMON", 33, null, null, new Object[0])).intValue());
            jSONObject.put("device_id", C0557c.m2904b(context));
            jSONObject.put("android_id", m3962a.f3542m);
            jSONObject.put("mac_address", C0812a.m3948d(context, ""));
            jSONObject.put("serial_number", m3962a.f3543n);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static void m2839f() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            if (new File("/proc/cpuinfo").exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/cpuinfo")));
                String str = null;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.contains("Processor")) {
                        int indexOf = readLine.indexOf(":");
                        if (indexOf >= 0 && indexOf < readLine.length() - 1) {
                            str = readLine.substring(indexOf + 1).trim();
                        }
                        if (str != null && !stringBuffer.toString().contains(str)) {
                            stringBuffer.append(str);
                        }
                    }
                    if (readLine.contains("Hardware")) {
                        try {
                            String trim = readLine.substring(readLine.indexOf(":") + 1).trim();
                            if (!TextUtils.isEmpty(trim)) {
                                f2687b = trim;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                bufferedReader.close();
            }
        } catch (Throwable unused2) {
        }
        f2686a = stringBuffer.toString();
    }
}
