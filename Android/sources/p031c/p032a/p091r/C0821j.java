package p031c.p032a.p091r;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.j */
/* loaded from: classes.dex */
public final class C0821j {

    /* renamed from: a */
    private static List<String> f3558a;

    static {
        ArrayList arrayList = new ArrayList();
        f3558a = arrayList;
        arrayList.add("358673013795895");
        f3558a.add("004999010640000");
        f3558a.add("00000000000000");
        f3558a.add("000000000000000");
    }

    /* renamed from: a */
    public static String m4006a(Context context) {
        String str = (String) C0618c.m3190a(context, C0617b.m3171i());
        if (!TextUtils.isEmpty(str)) {
            str = new String(Base64.decode(str, 2));
        }
        if (m4007a(str)) {
            return str;
        }
        String m4008b = m4008b(context);
        if (!TextUtils.isEmpty(m4008b)) {
            C0617b<String> m3171i = C0617b.m3171i();
            m3171i.m3188a((C0617b<String>) Base64.encodeToString(m4008b.getBytes(), 2));
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3171i});
        }
        return m4008b;
    }

    /* renamed from: a */
    private static boolean m4007a(String str) {
        if (!C0819h.m3998h(str) || str.length() < 10) {
            return false;
        }
        Iterator<String> it = f3558a.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static String m4008b(Context context) {
        try {
            String str = C0814c.m3962a(context).f3550u;
            if (m4007a(str)) {
                return str;
            }
            String str2 = C0814c.m3962a(context).f3542m;
            if (m4007a(str2) && !"9774d56d682e549c".equals(str2.toLowerCase(Locale.getDefault()))) {
                return str2;
            }
            String m3954g = C0557c.m2924r(context) ? C0812a.m3954g(context) : "";
            if (!m4007a(m3954g) && (m3954g = m4009c(context)) == null) {
                m3954g = " ";
            }
            return m4007a(m3954g) ? m3954g : "";
        } catch (Exception e2) {
            C0675a.m3468b("UDIDUtils", "", e2);
            String m4009c = m4009c(context);
            return m4007a(m4009c) ? m4009c : "";
        }
    }

    /* renamed from: c */
    private static String m4009c(Context context) {
        C0675a.m3469c("UDIDUtils", "Action:getSavedUuid");
        String str = (String) C0618c.m3194b(context, C0617b.m3187y());
        if (!C0819h.m3990a(str)) {
            return str;
        }
        if (!C0812a.m3937a()) {
            return m4011e(context);
        }
        String str2 = (String) C0618c.m3190a(context, C0617b.m3172j());
        return TextUtils.isEmpty(str2) ? (Build.VERSION.SDK_INT < 23 || (C0812a.m3939a(context, "android.permission.WRITE_EXTERNAL_STORAGE") && C0812a.m3939a(context, "android.permission.READ_EXTERNAL_STORAGE"))) ? m4010d(context) : m4011e(context) : str2;
    }

    /* renamed from: d */
    private static String m4010d(Context context) {
        String str;
        String m3942b = C0812a.m3942b();
        if (m3942b == null) {
            str = null;
        } else {
            str = m3942b + ".push_udid";
        }
        File file = C0819h.m3990a(str) ? null : new File(str);
        String m3968b = C0815d.m3968b(file);
        if (!TextUtils.isEmpty(m3968b)) {
            C0617b<String> m3172j = C0617b.m3172j();
            m3172j.m3188a((C0617b<String>) m3968b);
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3172j});
            C0675a.m3473e("UDIDUtils", "Got sdcard file saved udid - " + m3968b);
            return m3968b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        String m4001k = C0819h.m4001k(UUID.nameUUIDFromBytes(sb.toString().getBytes()).toString());
        C0617b<String> m3172j2 = C0617b.m3172j();
        m3172j2.m3188a((C0617b<String>) m4001k);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3172j2});
        C0815d.m3966a(file, m4001k);
        return m4001k;
    }

    /* renamed from: e */
    private static String m4011e(Context context) {
        C0617b<String> m3187y = C0617b.m3187y();
        String str = (String) C0618c.m3194b(context, m3187y);
        if (str != null) {
            return str;
        }
        String uuid = UUID.randomUUID().toString();
        m3187y.m3188a((C0617b<String>) uuid);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3187y});
        return uuid;
    }
}
