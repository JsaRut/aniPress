package p031c.p032a.p059c;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p092s.AbstractC0832h;

/* renamed from: c.a.c.a */
/* loaded from: classes.dex */
public final class C0590a {

    /* renamed from: a */
    private static volatile C0590a f2815a;

    /* renamed from: b */
    private static final Object f2816b = new Object();

    /* renamed from: c */
    private static HashMap<String, AbstractC0832h> f2817c = new HashMap<>();

    /* renamed from: d */
    private static HashMap<String, String> f2818d = new HashMap<>();

    /* renamed from: a */
    public static C0590a m3014a() {
        if (f2815a == null) {
            synchronized (f2816b) {
                if (f2815a == null) {
                    f2815a = new C0590a();
                }
            }
        }
        return f2815a;
    }

    /* renamed from: a */
    public static void m3015a(Context context, String str, Object obj) {
        C0601d.m3070a("ActionManager", "onSended type:" + str + ",actionMap size:" + f2817c.size());
        if (TextUtils.isEmpty(str)) {
            for (Map.Entry<String, AbstractC0832h> entry : f2817c.entrySet()) {
                entry.getValue().mo3389a(context, entry.getKey(), obj);
            }
            return;
        }
        AbstractC0832h abstractC0832h = f2817c.get(str);
        if (abstractC0832h != null) {
            abstractC0832h.mo3389a(context, str, obj);
        }
    }

    /* renamed from: a */
    public static void m3016a(String str, String str2) {
        C0601d.m3072b("ActionManager", "addAction type:" + str + ",action:" + str2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (f2817c.containsKey(str)) {
            C0601d.m3072b("ActionManager", "has same type action");
            return;
        }
        try {
            Object newInstance = Class.forName(str2).newInstance();
            if (!(newInstance instanceof AbstractC0832h)) {
                C0601d.m3077f("ActionManager", "this action is not a JDispatchAction,please check and extends JDispatchAction");
            } else {
                f2818d.put(str, str2);
                f2817c.put(str, (AbstractC0832h) newInstance);
            }
        } catch (Throwable th) {
            C0601d.m3078g("ActionManager", "#unexcepted - instance " + str2 + " class failed:" + th);
        }
    }

    /* renamed from: a */
    public static boolean m3017a(JSONObject jSONObject) {
        try {
            jSONObject.put("core_sdk_ver", "2.1.2");
            for (Map.Entry<String, AbstractC0832h> entry : f2817c.entrySet()) {
                AbstractC0832h value = entry.getValue();
                jSONObject.put(value.mo3395e(entry.getKey()), value.mo3396f(entry.getKey()));
            }
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    /* renamed from: b */
    public static HashMap<String, String> m3018b() {
        return f2818d;
    }
}
