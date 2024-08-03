package p031c.p032a.p065i;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0681c;
import p031c.p032a.p070n.RunnableC0686a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p092s.AbstractC0832h;

/* renamed from: c.a.i.b */
/* loaded from: classes.dex */
public final class C0659b {

    /* renamed from: a */
    private static volatile C0659b f3056a;

    /* renamed from: b */
    private static final Object f3057b = new Object();

    /* renamed from: c */
    public static HashMap<String, AbstractC0832h> f3058c = new HashMap<>();

    private C0659b() {
        Object m2887a = C0557c.m2887a();
        if (m2887a instanceof HashMap) {
            StringBuilder sb = new StringBuilder("actiom map size:");
            HashMap<String, String> hashMap = (HashMap) m2887a;
            sb.append(hashMap.size());
            C0675a.m3469c("DispatchActionManager", sb.toString());
            m3376a(hashMap);
            m3381b(C0556b.f2704d, C0662e.class.getCanonicalName());
        }
    }

    /* renamed from: a */
    public static byte m3370a(Context context) {
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null) {
                Object mo4085a = value.mo4085a(context, entry.getKey(), 23, "platformtype");
                if (mo4085a instanceof Byte) {
                    return ((Byte) mo4085a).byteValue();
                }
            }
        }
        return (byte) 0;
    }

    /* renamed from: a */
    public static C0659b m3371a() {
        if (f3056a == null) {
            synchronized (f3057b) {
                if (f3056a == null) {
                    f3056a = new C0659b();
                }
            }
        }
        return f3056a;
    }

    /* renamed from: a */
    public static String m3372a(String str, String str2) {
        String str3;
        AbstractC0832h abstractC0832h = f3058c.get(str);
        if (abstractC0832h != null) {
            String mo3396f = abstractC0832h.mo3396f(str);
            if (!TextUtils.isEmpty(mo3396f)) {
                return mo3396f;
            }
            str3 = str + " sdk action sdkversion:" + mo3396f;
        } else {
            str3 = str + " sdk action is null";
        }
        C0675a.m3465a("DispatchActionManager", str3);
        return str2;
    }

    /* renamed from: a */
    public static void m3373a(Context context, C0681c c0681c, ByteBuffer byteBuffer) {
        if (c0681c == null) {
            C0675a.m3475g("DispatchActionManager", "Action - dispatchMessage unexcepted - head was null");
            return;
        }
        C0660c m3456b = C0672o.m3448a().m3456b(c0681c.f3140e);
        if (m3456b == null) {
            for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
                AbstractC0832h value = entry.getValue();
                if (value != null && value.mo3392b(entry.getKey(), c0681c.f3138c)) {
                    value.mo3388a(context, entry.getKey(), c0681c.f3138c, c0681c.f3137b, c0681c.f3140e, -1L, byteBuffer);
                }
            }
            return;
        }
        C0675a.m3469c("DispatchActionManager", "dispacth msg with reuqest :" + m3456b);
        AbstractC0832h abstractC0832h = f3058c.get(m3456b.f3061c);
        if (abstractC0832h != null) {
            abstractC0832h.mo3388a(context, m3456b.f3061c, c0681c.f3138c, c0681c.f3137b, c0681c.f3140e, m3456b.f3060b, byteBuffer);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("rid", c0681c.f3140e);
        C0666i.m3408a().m3426a(context, "tcp_a7", bundle);
    }

    /* renamed from: a */
    public static void m3374a(Context context, String str, long j, int i) {
        if (TextUtils.isEmpty(str) || !str.equals(C0556b.f2704d)) {
            AbstractC0832h abstractC0832h = f3058c.get(str);
            if (abstractC0832h != null) {
                abstractC0832h.mo4087a(context, str, j, i);
                return;
            }
            C0675a.m3475g("DispatchActionManager", "not found dispatch action by sdktype:" + str);
            return;
        }
        if (i == 26) {
            C0674q.m3457a().m3459a(j);
        } else if (i == 30 || i == 32) {
            RunnableC0686a.m3523a().m3537a(context, i);
        }
    }

    /* renamed from: a */
    public static void m3375a(Context context, String str, Bundle bundle) {
        if (bundle == null) {
            C0675a.m3476h("DispatchActionManager", "run action bundle is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C0675a.m3476h("DispatchActionManager", "run action sdktype is empty");
            return;
        }
        if (C0556b.f2704d.contains(str)) {
            str = C0556b.f2704d;
        }
        AbstractC0832h abstractC0832h = f3058c.get(str);
        if (abstractC0832h != null) {
            abstractC0832h.mo3390a(context, str, bundle.getString("internal_action"), bundle);
            return;
        }
        C0675a.m3476h("DispatchActionManager", "dispacth action is null by sdktype:" + str);
    }

    /* renamed from: a */
    private void m3376a(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            C0675a.m3475g("DispatchActionManager", "init map is empty");
            return;
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            m3381b(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public static boolean m3377a(int i) {
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null) {
                try {
                    C0675a.m3471d("DispatchActionManager", "isAllowAction actionType:0,sdktype:" + entry.getKey() + ",action:" + value.mo4088a(entry.getKey(), 0));
                    if (!value.mo4088a(entry.getKey(), 0)) {
                        return false;
                    }
                } catch (Throwable th) {
                    C0675a.m3475g("DispatchActionManager", "isAllowAction error:" + th.getMessage());
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m3378b(int i) {
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null && value.mo3394d(entry.getKey()) == i) {
                return value.mo3396f(entry.getKey());
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m3379b(Context context) {
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null) {
                Object mo4085a = value.mo4085a(context, entry.getKey(), 23, "platformregid");
                if (mo4085a instanceof String) {
                    return (String) mo4085a;
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    public static short m3380b() {
        short mo3393c;
        short s = 0;
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null && (mo3393c = value.mo3393c(entry.getKey())) != 0) {
                s = (short) (s | mo3393c);
            }
        }
        return s;
    }

    /* renamed from: b */
    private static void m3381b(String str, String str2) {
        C0675a.m3469c("DispatchActionManager", "addAction type:" + str + ",action:" + str2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (f3058c.containsKey(str)) {
            C0675a.m3469c("DispatchActionManager", "has same type action");
            return;
        }
        try {
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance instanceof AbstractC0832h) {
                f3058c.put(str, (AbstractC0832h) newInstance);
            } else {
                C0675a.m3475g("DispatchActionManager", "this action is not a JDispatchAction,please check and extends JDispatchAction");
            }
        } catch (Throwable th) {
            C0675a.m3476h("DispatchActionManager", "#unexcepted - instance " + str2 + " class failed:" + th);
        }
    }

    /* renamed from: c */
    public static short m3382c() {
        short mo3391b;
        short s = 0;
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null && (mo3391b = value.mo3391b(entry.getKey())) != 0) {
                s = (short) (s | mo3391b);
            }
        }
        return s;
    }

    /* renamed from: d */
    public static String m3383d() {
        StringBuilder sb;
        String str;
        short s = 3;
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            short mo3394d = entry.getValue().mo3394d(entry.getKey());
            if (s < mo3394d) {
                s = mo3394d;
            }
        }
        C0675a.m3469c("DispatchActionManager", "max reg priority:" + ((int) s));
        String str2 = "";
        for (int i = 0; i <= s; i++) {
            if (i == 3) {
                sb = new StringBuilder();
                sb.append(str2);
                str = "2.1.2|";
            } else {
                Iterator<Map.Entry<String, AbstractC0832h>> it = f3058c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, AbstractC0832h> next = it.next();
                    AbstractC0832h value = next.getValue();
                    if (value.mo3394d(next.getKey()) == i) {
                        str2 = str2 + value.mo3396f(next.getKey());
                        break;
                    }
                }
                sb = new StringBuilder();
                sb.append(str2);
                str = "|";
            }
            sb.append(str);
            str2 = sb.toString();
        }
        return str2.substring(0, str2.length() - 1);
    }

    /* renamed from: e */
    public static String m3384e() {
        String str = C0812a.m3930a("2.1.2") + "|";
        short s = 0;
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            short mo3387a = entry.getValue().mo3387a(entry.getKey());
            if (s < mo3387a) {
                s = mo3387a;
            }
        }
        C0675a.m3469c("DispatchActionManager", "max login priority:" + ((int) s));
        String str2 = str;
        for (int i = 1; i <= s; i++) {
            Iterator<Map.Entry<String, AbstractC0832h>> it = f3058c.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, AbstractC0832h> next = it.next();
                    AbstractC0832h value = next.getValue();
                    if (value.mo3387a(next.getKey()) == i) {
                        str2 = str2 + C0812a.m3930a(value.mo3396f(next.getKey()));
                        break;
                    }
                }
            }
            str2 = str2 + "|";
        }
        return str2.substring(0, str2.length() - 1);
    }

    /* renamed from: a */
    public final void m3385a(Context context, int i, int i2, String str) {
        for (Map.Entry<String, AbstractC0832h> entry : f3058c.entrySet()) {
            AbstractC0832h value = entry.getValue();
            if (value != null) {
                value.mo4086a(context, entry.getKey(), i, i2, str);
            }
        }
        Intent intent = null;
        try {
            if (i == 0 && i2 == 0) {
                intent = new Intent("cn.jpush.android.intent.REGISTRATION");
                intent.putExtra("cn.jpush.android.REGISTRATION_ID", str);
            } else if (i == -1 || i == 1) {
                intent = new Intent("cn.jpush.android.intent.CONNECTION");
                if (i == -1) {
                    intent.putExtra("cn.jpush.android.CONNECTION_CHANGE", false);
                } else {
                    intent.putExtra("cn.jpush.android.CONNECTION_CHANGE", true);
                }
            }
            if (intent != null) {
                String packageName = context.getPackageName();
                intent.addCategory(packageName);
                intent.setPackage(packageName);
                C0812a.m3935a(context, intent);
            }
        } catch (Throwable th) {
            C0675a.m3475g("DispatchActionManager", "sendToOldPushUser failed:" + th.getMessage());
        }
    }
}
