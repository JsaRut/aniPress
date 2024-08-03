package p031c.p032a.p100z;

import android.content.Context;
import android.text.TextUtils;
import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.z.c */
/* loaded from: classes.dex */
public final class C0868c {

    /* renamed from: a */
    private static volatile Long f3644a;

    /* renamed from: b */
    private static volatile Long f3645b;

    /* renamed from: a */
    public static long m4232a(Context context, long j) {
        return (j + m4236c(context)) / 1000;
    }

    /* renamed from: a */
    public static boolean m4233a(Context context) {
        String str;
        if (((Long) C0867b.m4225a(context, C0866a.m4202c())).longValue() <= 0) {
            str = "isValidRegistered uid <= 0";
        } else {
            if (!TextUtils.isEmpty((String) C0867b.m4225a(context, C0866a.m4203d()))) {
                return true;
            }
            str = "isValidRegistered regId is empty";
        }
        C0601d.m3070a("SpHelper", str);
        return false;
    }

    /* renamed from: b */
    public static long m4234b(Context context) {
        return m4232a(context, System.currentTimeMillis());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Long] */
    /* renamed from: b */
    public static void m4235b(Context context, long j) {
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            f3644a = Long.valueOf(j);
            f3645b = Long.valueOf(currentTimeMillis);
            C0866a<Long> m4207h = C0866a.m4207h();
            m4207h.f3641e = Long.valueOf(j);
            C0866a<Long> m4206g = C0866a.m4206g();
            m4206g.f3641e = Long.valueOf(currentTimeMillis);
            C0867b.m4229a(context, (C0866a<?>[]) new C0866a[]{m4207h, m4206g});
        }
    }

    /* renamed from: c */
    public static long m4236c(Context context) {
        if (f3644a != null && f3645b != null) {
            return f3644a.longValue() - f3645b.longValue();
        }
        long longValue = ((Long) C0867b.m4225a(context, C0866a.m4206g())).longValue();
        long longValue2 = ((Long) C0867b.m4225a(context, C0866a.m4207h())).longValue();
        if (longValue == 0 || longValue2 == 0) {
            return 0L;
        }
        f3644a = Long.valueOf(longValue2);
        f3645b = Long.valueOf(longValue);
        return longValue2 - longValue;
    }
}
