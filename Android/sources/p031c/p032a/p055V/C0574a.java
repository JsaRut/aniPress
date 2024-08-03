package p031c.p032a.p055V;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jpush.android.service.C0961h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p033A.AbstractC0506a;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p033A.C0513h;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p056W.C0580a;
import p031c.p032a.p056W.C0581b;
import p031c.p032a.p056W.C0582c;
import p031c.p032a.p058b.C0586a;
import p031c.p032a.p058b.C0587b;
import p031c.p032a.p058b.C0588c;
import p031c.p032a.p058b.C0589d;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.V.a */
/* loaded from: classes.dex */
public class C0574a extends AbstractC0506a {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C0574a f2760a;

    /* renamed from: b */
    private Context f2761b;

    /* renamed from: c */
    private C0961h f2762c;

    /* renamed from: d */
    private HashMap<String, WeakReference<ServiceConnection>> f2763d = new HashMap<>();

    private C0574a() {
        C0557c.m2900a("JWake");
    }

    /* renamed from: a */
    private List<C0581b> m2966a(Context context, List<C0582c> list) {
        Intent intent;
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.size() <= 0) {
            C0675a.m3475g("JWake", "there are no wakeTarget");
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from_package", context.getPackageName());
        ArrayList arrayList = new ArrayList();
        for (C0582c c0582c : list) {
            int i = c0582c.f2791c;
            if (i == 2) {
                C0675a.m3475g("JWake", "command this app is not allow to wake package:" + c0582c.f2789a + ",service:" + c0582c.f2790b);
            } else {
                int i2 = (Build.VERSION.SDK_INT < 26 || i < 26) ? 3 : 2;
                if (!TextUtils.isEmpty(c0582c.f2792d)) {
                    i2 |= 4;
                }
                if (!C0586a.m2992a(context) && C0586a.m2994b(context)) {
                    i2 |= 8;
                }
                int i3 = i2;
                ComponentName componentName = new ComponentName(c0582c.f2789a, c0582c.f2790b);
                C0581b c0581b = new C0581b();
                c0581b.f2787a = componentName;
                int i4 = i3 & 2;
                if (i4 == 0 && (i3 & 1) == 0) {
                    intent = null;
                } else {
                    intent = new Intent();
                    intent.setComponent(componentName);
                    if (Build.VERSION.SDK_INT >= 12) {
                        intent.setFlags(32);
                    }
                    Bundle m3000a = C0588c.m3000a((HashMap<String, String>) hashMap);
                    if (m3000a != null) {
                        intent.putExtras(m3000a);
                    }
                }
                if (i4 != 0) {
                    try {
                        ServiceConnectionC0578e serviceConnectionC0578e = new ServiceConnectionC0578e(this, (byte) 0);
                        z = context.getApplicationContext().bindService(intent, serviceConnectionC0578e, 1);
                        if (z) {
                            this.f2763d.put(c0582c.f2789a + c0582c.f2790b, new WeakReference<>(serviceConnectionC0578e));
                        }
                    } catch (Throwable th) {
                        C0675a.m3475g("JWake", "bindService throwable:" + th.getMessage());
                        z = false;
                    }
                    c0581b.f2788b.put(2, Boolean.valueOf(z));
                }
                if ((i3 & 1) != 0) {
                    try {
                    } catch (Throwable th2) {
                        C0675a.m3475g("JWake", "startService throwable:" + th2.getMessage());
                    }
                    if (context.startService(intent) != null) {
                        z3 = true;
                        c0581b.f2788b.put(1, Boolean.valueOf(z3));
                    }
                    z3 = false;
                    c0581b.f2788b.put(1, Boolean.valueOf(z3));
                }
                if ((i3 & 4) != 0) {
                    try {
                    } catch (Throwable th3) {
                        C0675a.m3475g("JWake", "getContentResolver throwable:" + th3.getMessage());
                    }
                    if (!TextUtils.isEmpty(c0582c.f2792d)) {
                        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
                        String str = c0582c.f2792d;
                        if (!str.startsWith("content://")) {
                            str = "content://" + str;
                        }
                        String m3006b = C0588c.m3006b((HashMap<String, String>) hashMap);
                        if (!TextUtils.isEmpty(m3006b)) {
                            str = str + m3006b;
                        }
                        Cursor query = contentResolver.query(Uri.parse(str), null, null, null, null);
                        if (query != null && !query.isClosed()) {
                            query.close();
                        }
                        z2 = true;
                        c0581b.f2788b.put(4, Boolean.valueOf(z2));
                    }
                    z2 = false;
                    c0581b.f2788b.put(4, Boolean.valueOf(z2));
                }
                C0675a.m3469c("JWake", "wakeResult:" + c0581b.toString());
                arrayList.add(c0581b);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m2967a(p031c.p032a.p055V.C0574a r4, android.content.Context r5, android.os.Bundle r6, int r7, boolean r8) {
        /*
            java.lang.String r0 = "JWake"
            if (r5 != 0) goto La
            java.lang.String r4 = "context is null,can not notify waked"
        L6:
            p031c.p032a.p066j.C0675a.m3475g(r0, r4)
            goto L30
        La:
            cn.jpush.android.service.h r1 = r4.m2972j(r5)
            r4.f2762c = r1
            cn.jpush.android.service.h r1 = r4.f2762c
            if (r1 != 0) goto L17
            java.lang.String r4 = "waked receiver is null"
            goto L6
        L17:
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = "1"
            r1.put(r2, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "2"
            r1.put(r3, r2)
            cn.jpush.android.service.h r4 = r4.f2762c
            r4.m4797a(r1)
        L30:
            boolean r4 = p031c.p032a.p058b.C0588c.m3007b(r5)
            if (r4 != 0) goto L3c
            java.lang.String r4 = "Not need report waked"
            p031c.p032a.p066j.C0675a.m3469c(r0, r4)
            return
        L3c:
            java.lang.String r4 = "from_package"
            java.lang.String r4 = r6.getString(r4)
            if (r4 != 0) goto L46
            java.lang.String r4 = ""
        L46:
            org.json.JSONObject r4 = p031c.p032a.p058b.C0589d.m3011a(r4, r7, r8)
            if (r4 == 0) goto L51
            java.lang.String r6 = "android_awake_target2"
            p031c.p032a.p058b.C0589d.m3013a(r5, r6, r4)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p055V.C0574a.m2967a(c.a.V.a, android.content.Context, android.os.Bundle, int, boolean):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m2968a(C0574a c0574a, Context context, JSONObject jSONObject) {
        List<C0582c> arrayList;
        try {
            String m2880b = C0552b.m2880b(context, "bwct.catch");
            C0675a.m3469c("JWake", "read cmd wakeTarget:" + m2880b);
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    int optInt = jSONObject2.optInt("type", 1);
                    String optString = jSONObject2.optString("pkgName", "");
                    String optString2 = jSONObject2.optString("serviceName", "");
                    arrayList = new ArrayList<>();
                    C0582c c0582c = new C0582c();
                    c0582c.f2789a = optString;
                    c0582c.f2790b = optString2;
                    c0582c.f2791c = optInt;
                    arrayList.add(c0582c);
                    String m3001a = C0588c.m3001a(C0589d.m3008a(m2880b, optString, optString2, optInt));
                    C0675a.m3469c("JWake", "write cmd wakeTarget:" + m3001a);
                    C0552b.m2878a(context, "bwct.catch", m3001a);
                } catch (JSONException e2) {
                    C0675a.m3475g("JWake", "stop wake,the json form cmd is illegal:" + e2.getMessage());
                    return;
                }
            } else {
                if (m2880b == null || TextUtils.isEmpty(m2880b)) {
                    C0675a.m3475g("JWake", "there are no cache cmd wakeTarget");
                    return;
                }
                arrayList = C0588c.m3004a(m2880b);
            }
            List<C0581b> m2966a = c0574a.m2966a(context, arrayList);
            if (!C0588c.m3007b(context)) {
                C0675a.m3475g("JWake", "user has set Manifest not report");
                return;
            }
            if (m2966a == null || m2966a.isEmpty()) {
                return;
            }
            JSONObject m3010a = C0589d.m3010a(context, m2966a);
            if (m3010a == null) {
                C0675a.m3475g("JWake", "there no cmd report data");
                return;
            }
            C0513h.m2719a(context, m3010a, "app_awake");
            C0513h.m2720a(context, (Object) m3010a);
            C0511f.m2699c(context, "JWakecmd");
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "parse throwable:" + th.getMessage());
        }
    }

    /* renamed from: d */
    public static C0574a m2970d() {
        if (f2760a == null) {
            synchronized (C0574a.class) {
                f2760a = new C0574a();
            }
        }
        return f2760a;
    }

    /* renamed from: i */
    public C0580a m2971i(Context context) {
        JSONObject m2997a;
        boolean m2692a = C0511f.m2692a(context, "JWakeConfigHelper");
        C0675a.m3469c("JWake", "isRequestWakeConfigEnable:" + m2692a);
        if (!m2692a || (m2997a = C0587b.m2997a(context)) == null) {
            return C0587b.m2999b(context, C0552b.m2875a(context, "bwc.catch"));
        }
        C0580a m2999b = C0587b.m2999b(context, m2997a);
        C0675a.m3469c("JWake", "wakeConfig:" + m2999b);
        C0587b.m2998a(context, m2997a);
        C0511f.m2699c(this.f2761b, "JWakeConfigHelper");
        C0511f.m2688a(this.f2761b, "JWakeConfigHelper", m2999b.f2782f);
        C0511f.m2688a(this.f2761b, "JWake", m2999b.f2781e);
        C0511f.m2696b(this.f2761b, "JWake", m2999b.f2783g);
        C0511f.m2690a(this.f2761b, "JWake", m2999b.f2777a && m2999b.f2779c);
        boolean z = m2999b.f2778b && m2999b.f2780d;
        C0511f.m2690a(this.f2761b, "JWakeComponentHelper", z);
        C0586a.m2990a(this.f2761b, z);
        return m2999b;
    }

    /* renamed from: j */
    private C0961h m2972j(Context context) {
        C0961h c0961h = this.f2762c;
        if (c0961h != null) {
            return c0961h;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("cn.jpush.android.intent.WakedReceiver");
            intent.setPackage(context.getPackageName());
            intent.addCategory(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() == 0) {
                return null;
            }
            return (C0961h) Class.forName(queryBroadcastReceivers.get(0).activityInfo.name).newInstance();
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "find waked receiver throwable:" + th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final void m2973a(Context context, Bundle bundle, int i) {
        try {
            this.f2761b = context;
            C0675a.m3469c("JWake", "executeWakedAction: [JWake] from broadcast");
            Object m4072a = C0831g.m4072a(context, "JCOMMON", 49, null, null, new Object[0]);
            C0557c.m2901a("JWake", new RunnableC0579f(this, context, bundle, i, m4072a instanceof Boolean ? ((Boolean) m4072a).booleanValue() : true));
        } catch (Throwable th) {
            C0675a.m3469c("JWake", "executeWakedAction failed:" + th.getLocalizedMessage());
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: a */
    protected final boolean mo2674a(Context context, String str) {
        boolean m2692a = C0511f.m2692a(context, "JWake");
        if (m2971i(context) == null) {
            C0675a.m3475g("JWake", "wakeConfig is null");
            return false;
        }
        boolean m2709h = C0511f.m2709h(context, "JWakeComponentHelper");
        C0675a.m3469c("JWake", "isComponentEnable:" + m2709h);
        C0586a.m2990a(context, m2709h);
        return C0511f.m2709h(context, "JWake") && m2692a;
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: b */
    public final boolean mo2678b(Context context, String str) {
        return super.mo2678b(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: c */
    public final void mo2680c(Context context, String str) {
        C0580a m2999b = C0587b.m2999b(this.f2761b, C0552b.m2875a(this.f2761b, "bwc.catch"));
        List<C0582c> m3002a = C0588c.m3002a(this.f2761b);
        if (m3002a == null || m3002a.isEmpty()) {
            m3002a = null;
        } else {
            HashMap hashMap = new HashMap();
            for (C0582c c0582c : m3002a) {
                hashMap.put(c0582c.f2789a, c0582c);
            }
            List<String> m3003a = C0588c.m3003a(m2999b, new ArrayList(hashMap.keySet()));
            m3002a.clear();
            for (String str2 : m3003a) {
                if (hashMap.containsKey(str2)) {
                    m3002a.add(hashMap.get(str2));
                }
            }
        }
        if (m3002a == null || m3002a.isEmpty()) {
            C0675a.m3469c("JWake", "there are no app need wake");
            return;
        }
        JSONObject m3012a = C0589d.m3012a(m2966a(context, (List<C0582c>) m3002a));
        C0675a.m3469c("JWake", "wake json:" + m3012a);
        C0589d.m3013a(context, "android_awake2", m3012a);
        super.mo2680c(context, str);
    }

    /* renamed from: c */
    public final void m2974c(Context context, JSONObject jSONObject) {
        StringBuilder sb;
        String str;
        this.f2761b = context;
        if (jSONObject == null) {
            sb = new StringBuilder("executeWakeAction: [");
            sb.append("JWake");
            str = "] from cmd";
        } else {
            sb = new StringBuilder("executeWakeAction: [");
            sb.append("JWake");
            str = "] from heartBeat";
        }
        sb.append(str);
        C0675a.m3469c("JWake", sb.toString());
        boolean mo2673a = mo2673a();
        C0675a.m3469c("JWake", "JWake isActionUserEnable:" + mo2673a);
        if (mo2673a) {
            C0557c.m2901a("JWake", new RunnableC0577d(this, context, jSONObject));
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final String mo2682d(Context context) {
        this.f2761b = context;
        return "JWake";
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: d */
    public final void mo2683d(Context context, String str) {
        JSONObject m2875a;
        if (!C0588c.m3007b(context)) {
            C0675a.m3475g("JWake", "user has set Manifest not report");
            return;
        }
        try {
            synchronized ("wakeup_cache_v2.json") {
                m2875a = C0552b.m2875a(context, "wakeup_cache_v2.json");
            }
            if (m2875a == null) {
                m2875a = new JSONObject();
            }
            JSONArray optJSONArray = m2875a.optJSONArray("content");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            if (optJSONArray.length() == 0) {
                C0675a.m3469c("JWake", "no report data");
                return;
            }
            super.mo2683d(context, str);
            C0513h.m2720a(context, C0589d.m3009a(context, optJSONArray));
            synchronized ("wakeup_cache_v2.json") {
                C0552b.m2878a(context, "wakeup_cache_v2.json", (String) null);
            }
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "report error:" + th.getMessage());
        }
    }

    @Override // p031c.p032a.p033A.AbstractC0506a
    /* renamed from: e */
    protected final boolean mo2684e(Context context) {
        return true;
    }

    /* renamed from: f */
    public final Object m2975f(Context context) {
        return Boolean.valueOf(C0511f.m2709h(context, "JWake"));
    }

    /* renamed from: g */
    public final void m2976g(Context context) {
        this.f2761b = context;
        C0675a.m3469c("JWake", "executeWakeAction: [JWake] from first launch");
        C0557c.m2901a("JWake", new RunnableC0575b(this, context));
    }

    /* renamed from: h */
    public final void m2977h(Context context) {
        C0557c.m2901a("JWake", new RunnableC0576c(this, context, (byte) 0));
    }
}
