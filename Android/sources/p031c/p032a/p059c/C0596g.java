package p031c.p032a.p059c;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jpush.android.service.BinderC0956c;
import cn.jpush.android.service.PushReceiver;
import cn.jpush.android.service.ServiceC0958e;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p096v.C0845a;
import p031c.p032a.p099y.InterfaceC0863a;

/* renamed from: c.a.c.g */
/* loaded from: classes.dex */
public class C0596g {

    /* renamed from: a */
    private static C0596g f2846a;

    /* renamed from: b */
    private static Map<String, String> f2847b = new HashMap();

    private C0596g() {
    }

    /* renamed from: a */
    private static Bundle m3054a(String str, String str2, Bundle bundle, String str3) {
        String str4 = str + "." + str2;
        try {
            InterfaceC0863a m4788a = BinderC0956c.m4788a(str3);
            if (m4788a == null) {
                C0601d.m3072b("JMessenger", str3 + "'s aidl not found, " + str4);
                return null;
            }
            C0601d.m3072b("JMessenger", "sendByAidl, " + str4);
            if ("INTERNAL_API".equals(str)) {
                return m4788a.mo4194a(str, str2, bundle);
            }
            m4788a.mo4197b(str, str2, bundle);
            return new Bundle();
        } catch (Throwable th) {
            C0601d.m3077f("JMessenger", "sendByAidl, " + str4 + ", e=" + th);
            return null;
        }
    }

    /* renamed from: a */
    public static C0596g m3055a() {
        if (f2846a == null) {
            synchronized (C0596g.class) {
                if (f2846a == null) {
                    f2846a = new C0596g();
                }
            }
        }
        return f2846a;
    }

    /* renamed from: a */
    private static boolean m3056a(Context context, Class cls, String str, Bundle bundle) {
        Intent intent;
        if (cls == null) {
            return false;
        }
        String str2 = cls.getName() + "." + str;
        try {
            intent = new Intent();
            intent.setClass(context, cls);
            intent.setAction(str);
            intent.setPackage(context.getPackageName());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        } catch (Throwable th) {
            C0601d.m3077f("JMessenger", "sendByComponent, " + str2 + " e=" + th);
        }
        if (BroadcastReceiver.class.isAssignableFrom(cls)) {
            context.sendBroadcast(intent);
            C0601d.m3072b("JMessenger", "sendByReceiver, " + str2);
            return true;
        }
        if (Service.class.isAssignableFrom(cls)) {
            if (context.startService(intent) != null) {
                C0601d.m3072b("JMessenger", "sendByService, " + str2);
                return true;
            }
            C0601d.m3077f("JMessenger", "startService, " + str2 + ", can't find component");
        }
        return false;
    }

    /* renamed from: b */
    public static Bundle m3057b(Context context, String str, String str2, Bundle bundle) {
        try {
            C0601d.m3072b("JMessenger", "directHandle, " + str + "." + str2);
            if ("INTERNAL_API".equals(str)) {
                if (str2.equals("isTcpLoggedIn")) {
                    boolean m2908b = C0557c.m2908b();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("state", m2908b);
                    return bundle2;
                }
                C0601d.m3079h("JMessenger", "directHandle, not support " + str + "." + str2);
                return null;
            }
            Class<?> cls = Class.forName(str);
            if (!BroadcastReceiver.class.isAssignableFrom(cls) && !Service.class.isAssignableFrom(cls)) {
                C0601d.m3079h("JMessenger", "directHandle, not support " + str + "." + str2);
                return null;
            }
            if (ServiceC0958e.class.isAssignableFrom(cls)) {
                C0601d.m3072b("JMessenger", "JCommonService handle succeed," + str + "." + str2);
                C0595f.m3046a(context, str2, bundle);
                return new Bundle();
            }
            Intent intent = new Intent(str2);
            intent.setClass(context, cls);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.setPackage(context.getPackageName());
            intent.addCategory(context.getPackageName());
            if (PushReceiver.class.isAssignableFrom(cls)) {
                C0601d.m3072b("JMessenger", "PushReceiver handle succeed," + str + "." + str2);
                String string = bundle != null ? bundle.getString("sdktype") : null;
                C0590a.m3014a();
                C0590a.m3015a(context, string, intent);
            } else if (BroadcastReceiver.class.isAssignableFrom(cls)) {
                C0601d.m3072b("JMessenger", "Receiver onReceive," + str + "." + str2);
                ((BroadcastReceiver) cls.newInstance()).onReceive(context, intent);
            } else {
                C0601d.m3072b("JMessenger", "Service onStartCommand," + str + "." + str2);
                ((Service) cls.newInstance()).onStartCommand(intent, 0, 0);
            }
            return new Bundle();
        } catch (Throwable th) {
            C0601d.m3079h("JMessenger", "directHandle e:" + th);
            return null;
        }
    }

    /* renamed from: b */
    private static Bundle m3058b(Context context, String str, String str2, Bundle bundle, String str3) {
        Map<String, String> map;
        String str4 = str + "." + str2;
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                String str5 = f2847b.get(str3);
                if (TextUtils.isEmpty(str5)) {
                    String str6 = context.getPackageName() + ".DataProvider";
                    ProviderInfo m4117a = C0845a.m4117a(context, context.getPackageName(), str6);
                    if (str3.equals(m4117a != null ? m4117a.processName : null)) {
                        str5 = "content://" + str6 + "/";
                        map = f2847b;
                    } else {
                        String str7 = context.getPackageName() + ".DownloadProvider";
                        ProviderInfo m4117a2 = C0845a.m4117a(context, context.getPackageName(), str7);
                        if (str3.equals(m4117a2 != null ? m4117a2.processName : null)) {
                            str5 = "content://" + str7 + "/";
                            map = f2847b;
                        } else {
                            str5 = "";
                        }
                    }
                    map.put(str3, str5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    Uri parse = Uri.parse(str5);
                    C0601d.m3072b("JMessenger", "sendByProvider, uri=" + str5 + ", " + str4);
                    return context.getContentResolver().call(parse, str, str2, bundle);
                }
                C0601d.m3072b("JMessenger", "uri is null, check provider config");
            }
        } catch (Throwable th) {
            C0601d.m3077f("JMessenger", "provider call:" + th);
        }
        return null;
    }

    /* renamed from: a */
    public final Bundle m3059a(Context context, String str, String str2, Bundle bundle, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        String m4118a = C0845a.m4118a(context);
        if (TextUtils.isEmpty(m4118a)) {
            return null;
        }
        if (m4118a.equals(str3)) {
            return m3057b(context, str, str2, bundle);
        }
        Bundle m3054a = m3054a(str, str2, bundle, str3);
        if (m3054a != null) {
            return m3054a;
        }
        Bundle m3058b = m3058b(context, str, str2, bundle, str3);
        if (m3058b != null) {
            return m3058b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: Throwable -> 0x0067, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0067, blocks: (B:11:0x0058, B:15:0x0060), top: B:10:0x0058 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3060a(android.content.Context r11, java.lang.String r12, java.lang.String r13, android.os.Bundle r14) {
        /*
            r10 = this;
            java.lang.String r7 = " meet e:"
            java.lang.String r8 = "JMessenger"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r12)     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<android.app.Service> r0 = android.app.Service.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L2b
            java.lang.String r0 = p031c.p032a.p096v.C0845a.m4119a(r11, r12)     // Catch: java.lang.Throwable -> L38
            r6 = r0
            goto L52
        L2b:
            java.lang.Class<android.content.BroadcastReceiver> r0 = android.content.BroadcastReceiver.class
            boolean r0 = r0.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L51
            java.lang.String r1 = p031c.p032a.p096v.C0845a.m4122b(r11, r12)     // Catch: java.lang.Throwable -> L38
            goto L51
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            r0 = move-exception
            r2 = r1
        L3c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            p031c.p032a.p060d.C0601d.m3072b(r8, r0)
        L51:
            r6 = r1
        L52:
            r0 = r2
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            android.os.Bundle r1 = r1.m3059a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
            r2 = 1
            if (r1 == 0) goto L60
            return r2
        L60:
            boolean r0 = m3056a(r11, r0, r13, r14)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L7f
            return r2
        L67:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "send, "
            r1.<init>(r2)
            r1.append(r9)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p031c.p032a.p060d.C0601d.m3077f(r8, r0)
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "send all failed, "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            p031c.p032a.p060d.C0601d.m3079h(r8, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p059c.C0596g.m3060a(android.content.Context, java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
