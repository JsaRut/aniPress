package p031c.p032a.p094t;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Random;

/* renamed from: c.a.t.e */
/* loaded from: classes.dex */
public final class C0842e {

    /* renamed from: a */
    private static SharedPreferences f3590a;

    /* renamed from: a */
    private static long m4110a(long j) {
        return (j + (j % 2 == 0 ? 1L : 2L)) % 32767;
    }

    /* renamed from: a */
    public static synchronized long m4111a(Context context) {
        long j;
        synchronized (C0842e.class) {
            j = m4112b(context).getLong("next_rid", -1L);
            if (j != -1) {
                j = m4110a(j);
                m4112b(context).edit().putLong("next_rid", j).apply();
            }
            if (j == -1) {
                j = m4110a(Math.abs(new Random().nextInt(32767)));
                m4112b(context).edit().putLong("next_rid", j).apply();
            }
        }
        return j;
    }

    /* renamed from: b */
    private static SharedPreferences m4112b(Context context) {
        if (f3590a == null) {
            f3590a = context.getSharedPreferences("cn.jpush.preferences.support.rid", 0);
        }
        return f3590a;
    }
}
