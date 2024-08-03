package p031c.p032a.p096v;

import android.content.Context;
import android.content.Intent;
import p031c.p032a.p091r.C0812a;

/* renamed from: c.a.v.g */
/* loaded from: classes.dex */
public final class C0851g {
    /* renamed from: a */
    public static boolean m4144a(Context context, Class<?> cls) {
        boolean z;
        try {
            z = !context.getPackageManager().queryBroadcastReceivers(new Intent(context, cls), 0).isEmpty();
        } catch (Throwable unused) {
        }
        if (z) {
            return z;
        }
        try {
            return C0812a.m3944c(context, context.getPackageName(), cls) != null;
        } catch (Throwable unused2) {
            return z;
        }
    }
}
