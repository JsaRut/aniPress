package p000a.p005b.p009c.p010a;

import android.content.Context;
import android.os.Process;
import android.support.v4.app.C0193c;

/* renamed from: a.b.c.a.d */
/* loaded from: classes.dex */
public final class C0034d {
    /* renamed from: a */
    public static int m168a(Context context, String str) {
        return m169a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m169a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m856a = C0193c.m856a(str);
        if (m856a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0193c.m855a(context, m856a, str2) != 0 ? -2 : 0;
    }
}
