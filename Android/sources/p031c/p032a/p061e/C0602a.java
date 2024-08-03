package p031c.p032a.p061e;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p096v.C0846b;
import p031c.p032a.p100z.C0866a;
import p031c.p032a.p100z.C0867b;

/* renamed from: c.a.e.a */
/* loaded from: classes.dex */
public final class C0602a {

    /* renamed from: a */
    private static volatile C0602a f2857a;

    /* renamed from: b */
    private static final Object f2858b = new Object();

    /* renamed from: c */
    private long f2859c;

    /* renamed from: d */
    private Map<String, Set<String>> f2860d = new HashMap();

    private C0602a() {
    }

    /* renamed from: a */
    public static C0602a m3081a() {
        if (f2857a == null) {
            synchronized (f2858b) {
                if (f2857a == null) {
                    f2857a = new C0602a();
                }
            }
        }
        return f2857a;
    }

    /* renamed from: a */
    private String m3082a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "normal";
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1245458676:
                if (str.equals("active_launch")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1177318867:
                if (str.equals("account")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1091230153:
                if (str.equals("android_awake_target2")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1051289244:
                if (str.equals("active_user")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c2 = 11;
                    break;
                }
                break;
            case -820729752:
                if (str.equals("active_terminate")) {
                    c2 = 6;
                    break;
                }
                break;
            case -693746763:
                if (str.equals("android_awake")) {
                    c2 = 1;
                    break;
                }
                break;
            case -31313123:
                if (str.equals("android_awake2")) {
                    c2 = 0;
                    break;
                }
                break;
            case 93223301:
                if (str.equals("awake")) {
                    c2 = 4;
                    break;
                }
                break;
            case 907150721:
                if (str.equals("detach_account")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1350272347:
                if (str.equals("android_awake_target")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1973539834:
                if (str.equals("identify_account")) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "awake";
            case 5:
            case 6:
            case 7:
                return "active_user";
            case '\b':
            case '\t':
            case '\n':
                return "account";
            case 11:
                return "normal";
            default:
                return !this.f2860d.containsKey(str) ? "normal" : str;
        }
    }

    /* renamed from: a */
    private void m3083a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            linkedHashSet.add(optJSONArray.getString(i));
                        }
                    }
                    hashMap.put(next, linkedHashSet);
                }
                if (!hashMap.isEmpty()) {
                    this.f2860d = hashMap;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final C0602a m3084a(Context context) {
        try {
            long longValue = ((Long) C0867b.m4225a(context, C0866a.m4219t())).longValue();
            if (this.f2859c == 0 || this.f2859c != longValue) {
                this.f2859c = longValue;
                String str = (String) C0867b.m4225a(context, C0866a.m4217r());
                if (!TextUtils.isEmpty(str)) {
                    m3083a(new JSONObject(str));
                }
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final String m3085a(Set<String> set) {
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    String str = null;
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        String m3082a = m3082a(it.next());
                        if (str == null) {
                            str = m3082a;
                        } else if (!str.equals(m3082a)) {
                            C0601d.m3077f("AddressGroupManager", "Report JSONArray belong more than one space, using normal-space");
                            return "normal";
                        }
                    }
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return "normal";
    }

    /* renamed from: a */
    public final void m3086a(Context context, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("sis_ips");
        long j = 3600000;
        try {
            long j2 = jSONObject.getLong("ttl");
            if (j2 >= 0) {
                j = j2;
            }
        } catch (JSONException unused) {
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("ips");
        C0866a[] c0866aArr = new C0866a[4];
        C0866a<String> m4218s = C0866a.m4218s();
        m4218s.m4224a((C0866a<String>) optJSONArray.toString());
        c0866aArr[0] = m4218s;
        C0866a<Long> m4220u = C0866a.m4220u();
        m4220u.m4224a((C0866a<Long>) Long.valueOf(j * 1000));
        c0866aArr[1] = m4220u;
        C0866a<Long> m4219t = C0866a.m4219t();
        m4219t.m4224a((C0866a<Long>) Long.valueOf(System.currentTimeMillis()));
        c0866aArr[2] = m4219t;
        C0866a<String> m4217r = C0866a.m4217r();
        m4217r.m4224a((C0866a<String>) (optJSONObject != null ? optJSONObject.toString() : ""));
        c0866aArr[3] = m4217r;
        C0867b.m4229a(context, (C0866a<?>[]) c0866aArr);
        m3083a(optJSONObject);
    }

    /* renamed from: b */
    public final C0602a m3087b(Context context) {
        boolean z;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            m3084a(context);
            long longValue = ((Long) C0867b.m4225a(context, C0866a.m4220u())).longValue();
            if (longValue < 0) {
                longValue = 3600000;
            } else if (longValue < 60000) {
                longValue = 60000;
            }
            if (longValue > 604800000) {
                longValue = 604800000;
            }
            SimpleDateFormat m4124a = C0846b.m4124a("yyyy-MM-dd HH:mm:ss");
            C0601d.m3072b("AddressGroupManager", "lastUpdateTime=" + m4124a.format(new Date(this.f2859c)) + " now=" + m4124a.format(new Date(currentTimeMillis)) + " expire=" + (longValue / 1000));
            if (this.f2859c == 0 || this.f2859c + longValue < currentTimeMillis) {
                C0601d.m3072b("AddressGroupManager", "cache invalid, fetch new urls");
                if (this.f2860d != null && !this.f2860d.isEmpty()) {
                    z = false;
                    C0610i.m3114a(context, z);
                }
                z = true;
                C0610i.m3114a(context, z);
            }
        } catch (Throwable th) {
            C0601d.m3077f("AddressGroupManager", "refresh e" + th);
        }
        return this;
    }

    /* renamed from: b */
    public final Set<String> m3088b(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            Set<String> set2 = null;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                Set<String> set3 = this.f2860d.get(m3082a(it.next()));
                if (set3 != null && !set3.isEmpty()) {
                    if (set2 == null) {
                        set2 = set3;
                    } else {
                        set2.retainAll(set3);
                    }
                    if (set2.isEmpty()) {
                    }
                }
            }
            return set2;
        }
        return this.f2860d.get("normal");
    }
}
