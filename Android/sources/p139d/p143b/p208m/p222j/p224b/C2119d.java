package p139d.p143b.p208m.p222j.p224b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d.b.m.j.b.d */
/* loaded from: classes.dex */
public class C2119d {

    /* renamed from: a */
    private static volatile C2119d f7599a;

    /* renamed from: b */
    private Map<String, Integer> f7600b = new HashMap();

    private C2119d() {
    }

    /* renamed from: a */
    public static C2119d m8468a() {
        if (f7599a == null) {
            synchronized (C2119d.class) {
                if (f7599a == null) {
                    f7599a = new C2119d();
                }
            }
        }
        return f7599a;
    }

    /* renamed from: a */
    public Drawable m8469a(Context context, String str) {
        int m8470b = m8470b(context, str);
        if (m8470b > 0) {
            return context.getResources().getDrawable(m8470b);
        }
        return null;
    }

    /* renamed from: b */
    public int m8470b(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f7600b.containsKey(replace)) {
                    return this.f7600b.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f7600b.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    /* renamed from: c */
    public Uri m8471c(Context context, String str) {
        int m8470b = m8470b(context, str);
        return m8470b > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(m8470b)).build() : Uri.EMPTY;
    }
}
