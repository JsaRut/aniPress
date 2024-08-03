package p031c.p032a.p072p.p073a.p080f.p086f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p072p.p073a.C0707b;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.f.c */
/* loaded from: classes.dex */
public final class C0757c {

    /* renamed from: a */
    private static Map<String, C0757c> f3376a = new HashMap();

    /* renamed from: b */
    private static final Object f3377b = new Object();

    /* renamed from: c */
    private final String f3378c;

    /* renamed from: d */
    private SharedPreferences f3379d;

    private C0757c(Context context, String str) {
        this.f3378c = str;
        Context m3613a = C0707b.m3613a(context);
        if (m3613a != null) {
            this.f3379d = m3613a.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public static C0757c m3783a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C0732b.m3725h("SpResolver", "content provider name is empty");
            return null;
        }
        C0757c c0757c = f3376a.get(str);
        if (c0757c == null) {
            synchronized (f3377b) {
                c0757c = f3376a.get(str);
                if (c0757c == null) {
                    c0757c = new C0757c(context, str);
                    f3376a.put(str, c0757c);
                }
            }
        }
        return c0757c;
    }

    /* renamed from: a */
    public final SharedPreferences m3784a() {
        return this.f3379d;
    }

    /* renamed from: a */
    public final <T extends Serializable> T m3785a(String str, T t) {
        SharedPreferences sharedPreferences = this.f3379d;
        if (sharedPreferences != null) {
            return (T) C0756b.m3781a(sharedPreferences, str, t);
        }
        C0732b.m3723f("SpResolver", "can't get SharedPref when read " + str);
        return t;
    }

    /* renamed from: b */
    public final boolean m3786b() {
        SharedPreferences sharedPreferences = this.f3379d;
        if (sharedPreferences != null) {
            return sharedPreferences.edit().clear().commit();
        }
        C0732b.m3723f("SpResolver", "can't get SharedPref when clear");
        return false;
    }

    /* renamed from: b */
    public final <T extends Serializable> boolean m3787b(String str, T t) {
        SharedPreferences sharedPreferences = this.f3379d;
        if (sharedPreferences != null) {
            return C0756b.m3782b(sharedPreferences, str, t);
        }
        C0732b.m3723f("SpResolver", "can't get SharedPref when write " + str + "=" + t);
        return false;
    }
}
