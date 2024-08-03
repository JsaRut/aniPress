package p031c.p032a.p070n;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import cn.jpush.android.service.C0957d;
import java.io.File;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p065i.C0659b;
import p031c.p032a.p065i.C0661d;
import p031c.p032a.p065i.C0666i;
import p031c.p032a.p065i.C0672o;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0679a;
import p031c.p032a.p068l.C0680b;
import p031c.p032a.p068l.C0681c;
import p031c.p032a.p069m.C0684a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0815d;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.n.a */
/* loaded from: classes.dex */
public final class RunnableC0686a implements Runnable {

    /* renamed from: a */
    private static final String f3165a = ".jpush" + File.separator + ".shareinfo" + File.separator;

    /* renamed from: b */
    private static final Object f3166b = new Object();

    /* renamed from: c */
    private static Boolean f3167c;

    /* renamed from: d */
    private static Boolean f3168d;

    /* renamed from: e */
    private static RunnableC0686a f3169e;

    /* renamed from: f */
    private int f3170f;

    /* renamed from: g */
    private long[] f3171g;

    /* renamed from: h */
    private String f3172h;

    /* renamed from: i */
    private volatile boolean f3173i;

    /* renamed from: j */
    Context f3174j;

    /* renamed from: k */
    private boolean f3175k;

    private RunnableC0686a() {
        C0557c.m2900a("share_process_executor");
    }

    /* renamed from: a */
    private static ActivityInfo m3522a(String str, Context context) {
        String str2;
        try {
            Intent intent = new Intent();
            intent.setAction("cn.jpush.android.intent.DownloadActivity");
            intent.addCategory(str);
            intent.setPackage(str);
            ActivityInfo activityInfo = context.getPackageManager().resolveActivity(intent, 0).activityInfo;
            if ((activityInfo instanceof ActivityInfo) && ((ComponentInfo) activityInfo).exported && ((ComponentInfo) activityInfo).enabled) {
                if (!"jpush.custom".equals(activityInfo.taskAffinity)) {
                    str2 = "download activity need config taskAffinity is jpush.custom";
                } else {
                    if (activityInfo.theme == 16973840) {
                        return activityInfo;
                    }
                    str2 = "download activity theme must config as @android:style/Theme.Translucent.NoTitleBar";
                }
                C0675a.m3469c("ShareProcessManager", str2);
            }
        } catch (Throwable th) {
            C0675a.m3475g("ShareProcessManager", "check downloadActivity error:" + th.getMessage());
        }
        C0675a.m3469c("ShareProcessManager", "DownloadActivity is invalid in " + str);
        return null;
    }

    /* renamed from: a */
    public static RunnableC0686a m3523a() {
        if (f3169e == null) {
            synchronized (f3166b) {
                if (f3169e == null) {
                    f3169e = new RunnableC0686a();
                }
            }
        }
        return f3169e;
    }

    /* renamed from: a */
    private C0687b m3524a(String str) {
        Throwable th;
        C0687b c0687b;
        try {
        } catch (Throwable th2) {
            th = th2;
            c0687b = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        c0687b = new C0687b(this);
        try {
            long optLong = jSONObject.optLong("u");
            String optString = jSONObject.optString("ak");
            String optString2 = jSONObject.optString("pn");
            String optString3 = jSONObject.optString("ud");
            int optInt = jSONObject.optInt("idc", -1);
            int optInt2 = jSONObject.optInt("sv");
            long optLong2 = jSONObject.optLong("uct", -1L);
            c0687b.f3178c = optLong;
            c0687b.f3177b = optString3;
            c0687b.f3180e = optString;
            c0687b.f3176a = optInt;
            c0687b.f3179d = optString2;
            c0687b.f3181f = optInt2;
            c0687b.f3182g = optLong2;
        } catch (Throwable th3) {
            th = th3;
            C0675a.m3475g("ShareProcessManager", "parse json to shareBean failed:" + th.getMessage());
            return c0687b;
        }
        return c0687b;
    }

    /* renamed from: a */
    private static String m3525a(Context context, String str, String str2, HashMap<String, String> hashMap) {
        try {
            ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
            String str3 = str + ".DownloadProvider";
            if (!str3.startsWith("content://")) {
                str3 = "content://" + str3;
            }
            Uri parse = Uri.parse(str3);
            JSONObject jSONObject = new JSONObject();
            Uri.Builder buildUpon = parse.buildUpon();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("kta", str2);
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            buildUpon.appendQueryParameter("kpgt", C0684a.m3501a(jSONObject.toString()));
            return contentResolver.getType(buildUpon.build());
        } catch (Throwable th) {
            C0675a.m3475g("ShareProcessManager", "callUriToDownloadProvider error:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m3526a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            C0675a.m3475g("ShareProcessManager", "mapToJSONObject error:" + th.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m3527a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            C0675a.m3475g("ShareProcessManager", "deletFileIfUninstall failed ,context is null or pkgname is empty");
            return;
        }
        try {
            if (C0812a.m3939a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                File m3529b = m3529b(str);
                if (m3529b.exists()) {
                    m3529b.delete();
                } else {
                    C0675a.m3469c("ShareProcessManager", "not found file in sdcard,filepath:" + m3529b.getAbsolutePath());
                }
            } else {
                C0675a.m3469c("ShareProcessManager", "no write sdcard permission when deletFileIfUninstall");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private C0687b m3528b(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        try {
            String m3525a = m3525a(context, str, "asai", null);
            C0675a.m3469c("ShareProcessManager", "get type from:" + str + ",info:" + m3525a);
            if (m3525a != null) {
                if (!TextUtils.isEmpty(m3525a) && m3525a.length() > 10) {
                    String m3506b = C0684a.m3506b(m3525a, "");
                    if (TextUtils.isEmpty(m3506b)) {
                        C0675a.m3469c("ShareProcessManager", "decrypt error");
                        return null;
                    }
                    C0675a.m3469c("ShareProcessManager", "parse success:" + m3506b);
                    return m3524a(m3506b);
                }
                str2 = "is not shareprocessbean info";
            } else {
                if (!m3533f(context) || C0557c.m2903a(context, false, "do not get share info from SD")) {
                    return null;
                }
                if (C0812a.m3939a(context, "android.permission.READ_EXTERNAL_STORAGE")) {
                    File m3529b = m3529b(str);
                    String m3968b = C0815d.m3968b(m3529b);
                    if (TextUtils.isEmpty(m3968b)) {
                        str2 = "read info is empty from :" + m3529b.getAbsolutePath();
                    } else {
                        C0687b m3524a = m3524a(C0684a.m3506b(m3968b, ""));
                        if (m3524a != null) {
                            str3 = m3524a.f3179d;
                            if (!C0812a.m3951e(context, str3)) {
                                StringBuilder sb = new StringBuilder("found target app is uninsatll when scan sdcard,pkgname:");
                                str4 = m3524a.f3179d;
                                sb.append(str4);
                                C0675a.m3469c("ShareProcessManager", sb.toString());
                                str5 = m3524a.f3179d;
                                m3527a(context, str5);
                                return null;
                            }
                            str6 = m3524a.f3179d;
                            if (m3522a(str6, context) != null) {
                                C0675a.m3469c("ShareProcessManager", "get share bean info from sdcard:" + m3524a.toString());
                                return m3524a;
                            }
                            str2 = "not config DownloadActivity in target app:" + str;
                        } else {
                            str2 = "parse share process bean with target app:" + str;
                        }
                    }
                } else {
                    str2 = "no read sdcard permission";
                }
            }
            C0675a.m3469c("ShareProcessManager", str2);
            return null;
        } catch (Throwable th) {
            C0675a.m3476h("ShareProcessManager", "scanShareProcessBean error:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private static File m3529b(String str) {
        String m3994d = C0819h.m3994d(str);
        if (!TextUtils.isEmpty(m3994d)) {
            str = m3994d;
        }
        return new File(Environment.getExternalStorageDirectory(), f3165a + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[Catch: Throwable -> 0x016d, TryCatch #0 {Throwable -> 0x016d, blocks: (B:3:0x000d, B:5:0x0022, B:8:0x002a, B:9:0x0030, B:11:0x0036, B:13:0x0048, B:15:0x004e, B:17:0x0058, B:19:0x0060, B:21:0x0064, B:23:0x0093, B:25:0x0097, B:27:0x009f, B:31:0x00e8, B:35:0x00ba, B:33:0x00eb, B:41:0x00ef, B:43:0x010e, B:44:0x0111, B:45:0x012a, B:47:0x0130, B:50:0x014d, B:55:0x0151, B:58:0x0167), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Set<p031c.p032a.p070n.C0687b> m3530c(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p070n.RunnableC0686a.m3530c(android.content.Context):java.util.Set");
    }

    /* renamed from: d */
    private void m3531d(Context context) {
        try {
            if (C0557c.m2903a(context, false, "do not save ShareInfo to SD")) {
                return;
            }
            if (!C0812a.m3939a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0675a.m3469c("ShareProcessManager", "no write sdcard permission");
                return;
            }
            File m3529b = m3529b(context.getPackageName());
            if (!m3533f(context)) {
                C0815d.m3965a(m3529b);
                return;
            }
            String m3532e = m3532e(context);
            C0675a.m3469c("ShareProcessManager", "save info to sdcard:" + m3529b.getAbsolutePath());
            if (TextUtils.isEmpty(m3532e) || m3532e.length() <= 10) {
                return;
            }
            C0815d.m3965a(m3529b);
            C0815d.m3966a(m3529b, m3532e);
        } catch (Throwable th) {
            C0675a.m3475g("ShareProcessManager", "saveShareInfoToSdCard failed:" + th.getMessage());
        }
    }

    /* renamed from: e */
    private String m3532e(Context context) {
        if (context == null) {
            return "-1";
        }
        if (!m3534g(context) || C0557c.m2919m(context) == 1) {
            C0675a.m3469c("ShareProcessManager", "[getTypeJson]share process is close by action");
            return "-4";
        }
        if (!C0557c.m2923q(context)) {
            C0675a.m3469c("ShareProcessManager", "getAttachJson,is not support jpush or jmessage ");
            return "-7";
        }
        int m2920n = C0557c.m2920n(context);
        if (m2920n < 0) {
            C0675a.m3469c("ShareProcessManager", "[getTypeJson]idc<0,need login to get it");
            return "-3";
        }
        long m2911e = C0557c.m2911e(context);
        if (m2911e <= 0) {
            C0675a.m3469c("ShareProcessManager", "[getTypeJson]uid<=0,need login to get it");
            return "-2";
        }
        Map m2918l = C0557c.m2918l(context);
        long j = -1;
        if (m2918l != null) {
            this.f3172h = (String) m2918l.get("uuid");
            j = ((Long) m2918l.get("ct")).longValue();
        }
        String m2915i = C0557c.m2915i(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("u", m2911e);
            jSONObject.put("p", C0557c.m2912f(context));
            jSONObject.put("ud", this.f3172h);
            jSONObject.put("ak", m2915i);
            jSONObject.put("idc", m2920n);
            jSONObject.put("pn", context.getPackageName());
            jSONObject.put("sv", 212);
            jSONObject.put("uct", j);
            return C0684a.m3501a(jSONObject.toString());
        } catch (JSONException unused) {
            C0675a.m3469c("ShareProcessManager", "[getTypeJson] to json error");
            return "2.1.2";
        }
    }

    /* renamed from: f */
    private static boolean m3533f(Context context) {
        Boolean bool = f3168d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            String str = Build.MANUFACTURER;
            String lowerCase = "Xiaomi".toLowerCase();
            if (!TextUtils.isEmpty(str) && TextUtils.equals(lowerCase, str.toLowerCase())) {
                C0675a.m3469c("ShareProcessManager", "xiaomi not use activity and sdcard");
                Boolean bool2 = false;
                f3168d = bool2;
                return bool2.booleanValue();
            }
        } catch (Throwable th) {
            C0675a.m3475g("ShareProcessManager", "get MANUFACTURER failed - error:" + th.getMessage());
        }
        f3168d = m3522a(context.getPackageName(), context) != null;
        return f3168d.booleanValue();
    }

    /* renamed from: g */
    private static boolean m3534g(Context context) {
        Boolean bool = f3167c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            C0675a.m3475g("ShareProcessManager", "context is null");
            return true;
        }
        try {
            ProviderInfo m3941b = C0812a.m3941b(context, context.getPackageName(), C0957d.class);
            if (m3941b == null) {
                C0675a.m3469c("ShareProcessManager", "not found download provider in manifest");
                Boolean bool2 = false;
                f3167c = bool2;
                return bool2.booleanValue();
            }
            if (((ComponentInfo) m3941b).enabled && ((ComponentInfo) m3941b).exported && !TextUtils.isEmpty(m3941b.authority)) {
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setAction("cn.jiguang.android.share.close");
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                f3167c = queryIntentServices == null || queryIntentServices.isEmpty();
                return f3167c.booleanValue();
            }
            C0675a.m3469c("ShareProcessManager", "download provider config error,enable" + ((ComponentInfo) m3941b).enabled + ",exported:" + ((ComponentInfo) m3941b).exported + ",authority:" + m3941b.authority);
            Boolean bool3 = false;
            f3167c = bool3;
            return bool3.booleanValue();
        } catch (Throwable th) {
            C0675a.m3469c("ShareProcessManager", "Get isShareProcessModeOpen error#:" + th.getMessage());
            return true;
        }
    }

    /* renamed from: a */
    public final void m3535a(int i, int i2) {
        C0675a.m3469c("ShareProcessManager", "requestsuccess,cmd:" + i2 + ",code:0");
        if (i2 == 30) {
            this.f3170f = 0;
        }
    }

    /* renamed from: a */
    public final synchronized void m3536a(Context context) {
        if (m3534g(context) && C0557c.m2919m(context) != 1) {
            if (!C0557c.m2923q(context)) {
                C0675a.m3469c("ShareProcessManager", "is not support jpush or jmessage ");
                return;
            }
            Object m3386a = C0661d.m3386a(context, "getwakeenable", null);
            if ((m3386a instanceof Boolean) && !((Boolean) m3386a).booleanValue()) {
                C0675a.m3469c("ShareProcessManager", "wake disable,not scan share app");
                return;
            }
            if (this.f3173i) {
                C0675a.m3469c("ShareProcessManager", "isAttaching");
                return;
            }
            this.f3174j = context;
            this.f3173i = true;
            C0675a.m3469c("ShareProcessManager", "scanOtherApp...");
            this.f3170f = 0;
            C0557c.m2901a("share_process_executor", this);
            return;
        }
        C0675a.m3469c("ShareProcessManager", "share process is close by action");
        m3527a(context, context.getPackageName());
    }

    /* renamed from: a */
    public final void m3537a(Context context, int i) {
        C0675a.m3469c("ShareProcessManager", "requestTimeOut,cmd:" + i + ",isAttaching:" + this.f3173i);
        if (i != 30 || this.f3173i) {
            return;
        }
        this.f3170f++;
        C0675a.m3469c("ShareProcessManager", "attachTimeoutTimes:" + this.f3170f + ",requestUIDS:" + this.f3171g + ",shareProcessUUID:" + this.f3172h);
        if (this.f3170f > 2) {
            C0675a.m3469c("ShareProcessManager", "attach too many times by once scan");
            return;
        }
        long[] jArr = this.f3171g;
        if (jArr == null || jArr.length <= 0 || TextUtils.isEmpty(this.f3172h)) {
            return;
        }
        C0675a.m3469c("ShareProcessManager", "will retry attach");
        C0557c.m2894a(context, C0556b.f2704d, 30, 0, C0672o.m3450b(), 0L, C0680b.m3494a(C0557c.m2911e(context), this.f3172h, this.f3171g));
    }

    /* renamed from: a */
    public final void m3538a(Context context, long j) {
        try {
            if (TextUtils.isEmpty(this.f3172h)) {
                C0675a.m3469c("ShareProcessManager", "dettachUid error,shareUUID is empty");
                return;
            }
            C0675a.m3469c("ShareProcessManager", "dettach uid:" + j);
            C0557c.m2894a(context, C0556b.f2704d, 32, 0, C0672o.m3450b(), 0L, C0680b.m3497a(this.f3172h, new long[]{j}));
        } catch (Throwable th) {
            C0675a.m3469c("ShareProcessManager", "dettach uid error:" + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void m3539a(Context context, long j, byte[] bArr) {
        String str;
        long j2;
        if (j == 0 || bArr == null) {
            return;
        }
        try {
            Pair<C0681c, ByteBuffer> m3491a = C0679a.m3491a(context, bArr, "");
            if (m3491a != null && ((C0681c) m3491a.first).f3138c == 3) {
                ByteBuffer byteBuffer = (ByteBuffer) m3491a.second;
                byteBuffer.get();
                long j3 = byteBuffer.getLong();
                String m3493a = C0680b.m3493a(byteBuffer);
                if (TextUtils.isEmpty(m3493a)) {
                    C0675a.m3475g("ShareProcessManager", "msgContent is empty");
                    return;
                }
                LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(m3493a));
                String readLine = lineNumberReader.readLine();
                if (TextUtils.isEmpty(readLine)) {
                    C0675a.m3477i("ShareProcessManager", "appid is empty");
                    return;
                }
                String readLine2 = lineNumberReader.readLine();
                if (TextUtils.isEmpty(readLine2)) {
                    C0675a.m3477i("ShareProcessManager", "senderId is empty");
                    return;
                }
                if (m3534g(context) && C0557c.m2919m(context) != 1) {
                    if (!C0812a.m3951e(context, readLine)) {
                        m3538a(context, ((C0681c) m3491a.first).f3142g);
                        C0675a.m3469c("ShareProcessManager", "app not installed:" + readLine);
                        m3527a(context, readLine);
                        return;
                    }
                    String encodeToString = Base64.encodeToString(bArr, 10);
                    Long valueOf = Long.valueOf(((C0681c) m3491a.first).f3140e);
                    HashMap hashMap = new HashMap();
                    hashMap.put("ktm", encodeToString);
                    hashMap.put("ktp", C0684a.m3499a(C0557c.m2911e(context)));
                    hashMap.put("ktma", readLine2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(j3);
                    hashMap.put("mtmmi", sb.toString());
                    hashMap.put("ktmfp", context.getPackageName());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(valueOf);
                    hashMap.put("ktmr", sb2.toString());
                    C0675a.m3469c("ShareProcessManager", "dispatch share msg,appkey:" + readLine2 + ",msgid:" + j3 + ",rid:" + valueOf);
                    String m3525a = m3525a(context, readLine, "asm", hashMap);
                    StringBuilder sb3 = new StringBuilder("dispatch result:");
                    sb3.append(m3525a);
                    C0675a.m3469c("ShareProcessManager", sb3.toString());
                    if (TextUtils.isEmpty(m3525a)) {
                        if (!m3533f(context)) {
                            C0675a.m3469c("ShareProcessManager", "app can not use downloadActivity dispatch msg");
                            j2 = ((C0681c) m3491a.first).f3142g;
                        } else {
                            if (!C0557c.f2707a && C0557c.m2903a(context, false, "do not startActivity in BackGround")) {
                                this.f3175k = true;
                                m3538a(context, C0557c.m2911e(context));
                                return;
                            }
                            ActivityInfo m3522a = m3522a(readLine, context);
                            if (m3522a != null) {
                                C0675a.m3469c("ShareProcessManager", "will try use downloadActivity");
                                JSONObject m3526a = m3526a(hashMap);
                                Intent intent = new Intent("asm");
                                intent.setComponent(new ComponentName(m3522a.packageName, m3522a.name));
                                intent.setFlags(268435456);
                                intent.addCategory(readLine);
                                intent.putExtra("data", m3526a.toString());
                                context.startActivity(intent);
                            } else {
                                j2 = ((C0681c) m3491a.first).f3142g;
                            }
                        }
                        m3538a(context, j2);
                    } else if (m3525a.equals("-4")) {
                        j2 = ((C0681c) m3491a.first).f3142g;
                        m3538a(context, j2);
                    } else {
                        if (m3525a.equals("0")) {
                            str = "wait the msg reponse";
                        } else {
                            str = "provider is :" + m3525a + ",app is less than jcore_v125";
                        }
                        C0675a.m3469c("ShareProcessManager", str);
                    }
                    lineNumberReader.close();
                    return;
                }
                m3538a(context, C0557c.m2911e(context));
                C0675a.m3469c("ShareProcessManager", " share process is close,will not dispatch the msg and dettach mine uid");
                return;
            }
            C0675a.m3469c("ShareProcessManager", "share msg cmd is not 3");
        } catch (Throwable th) {
            C0675a.m3475g("ShareProcessManager", "dispatchMsg error:" + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void m3540a(Context context, Bundle bundle) {
        String str;
        try {
            C0675a.m3469c("ShareProcessManager", "doMsg");
            if (bundle != null) {
                String string = bundle.getString("data");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(string);
                C0675a.m3469c("ShareProcessManager", "doMsg json:" + jSONObject.toString());
                String optString = jSONObject.optString("ktm");
                String optString2 = jSONObject.optString("ktp");
                String optString3 = jSONObject.optString("mtmmi");
                String optString4 = jSONObject.optString("ktmfp");
                String optString5 = jSONObject.optString("ktma");
                String optString6 = jSONObject.optString("ktmr");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString5)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("mtmmi", optString3);
                hashMap.put("ktmfp", optString4);
                hashMap.put("ktma", optString5);
                hashMap.put("ktmr", optString6);
                Pair<C0681c, ByteBuffer> m3491a = C0679a.m3491a(context, Base64.decode(optString, 10), optString2);
                if (m3491a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((C0681c) m3491a.first).f3142g);
                    hashMap.put("ktmu", sb.toString());
                    if (m3534g(context) && C0557c.m2919m(context) != 1) {
                        if (((C0681c) m3491a.first).f3142g != C0557c.m2911e(context)) {
                            C0675a.m3469c("ShareProcessManager", "this msg uid is :" + ((C0681c) m3491a.first).f3142g + ",is not this app msg");
                            str = "1";
                            hashMap.put("asmrc", str);
                        } else {
                            hashMap.put("asmrc", "0");
                            C0659b.m3371a();
                            C0659b.m3373a(context, (C0681c) m3491a.first, (ByteBuffer) m3491a.second);
                        }
                    }
                    C0675a.m3469c("ShareProcessManager", "share process is closed");
                    str = "3";
                    hashMap.put("asmrc", str);
                }
                m3525a(context, optString4, "asmr", hashMap);
            }
        } catch (Throwable th) {
            C0675a.m3469c("ShareProcessManager", "doMsg error:" + th.getMessage());
        }
    }

    /* renamed from: b */
    public final void m3541b(Context context) {
        if (this.f3175k) {
            this.f3175k = false;
            if (C0666i.m3408a().m3431d()) {
                C0675a.m3469c("ShareProcessManager", "attach mine while app in foreground from background");
                C0557c.m2894a(context, C0556b.f2704d, 30, 0, C0672o.m3450b(), 0L, C0680b.m3494a(C0557c.m2911e(context), this.f3172h, new long[]{C0557c.m2911e(context)}));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1 A[Catch: all -> 0x0273, Throwable -> 0x0276, TRY_ENTER, TryCatch #1 {Throwable -> 0x0276, blocks: (B:3:0x0005, B:5:0x000d, B:6:0x0026, B:12:0x0088, B:15:0x0096, B:20:0x00a1, B:21:0x00c1, B:23:0x00c7, B:26:0x00d3, B:29:0x00db, B:32:0x00eb, B:39:0x00ef, B:42:0x00f8, B:44:0x0107, B:46:0x010d, B:48:0x015e, B:50:0x016e, B:55:0x0185, B:57:0x01bc, B:65:0x01c0, B:70:0x01f7, B:71:0x01fc, B:72:0x0235, B:77:0x020a, B:78:0x022d, B:79:0x0217, B:81:0x021f, B:82:0x0230, B:83:0x0052), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p070n.RunnableC0686a.run():void");
    }
}
