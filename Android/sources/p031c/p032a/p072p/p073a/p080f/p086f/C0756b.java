package p031c.p032a.p072p.p073a.p080f.p086f;

import android.content.SharedPreferences;
import android.os.Build;
import java.io.Serializable;
import java.util.HashSet;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.f.b */
/* loaded from: classes.dex */
public final class C0756b {
    /* renamed from: a */
    private static Serializable m3780a(SharedPreferences sharedPreferences, String str, int i) {
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        try {
            switch (i) {
                case 0:
                    try {
                        return sharedPreferences.getString(str, null);
                    } catch (ClassCastException unused) {
                        return C0755a.m3779a(sharedPreferences, str);
                    }
                case 1:
                    return sharedPreferences.getString(str, null);
                case 2:
                    try {
                        return Integer.valueOf(sharedPreferences.getInt(str, 0));
                    } catch (ClassCastException e2) {
                        long j = sharedPreferences.getLong(str, 0L);
                        int i2 = (int) j;
                        if (i2 == j) {
                            return Integer.valueOf(i2);
                        }
                        throw e2;
                    }
                case 3:
                    return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                case 4:
                    try {
                        return Long.valueOf(sharedPreferences.getLong(str, 0L));
                    } catch (ClassCastException unused2) {
                        return Long.valueOf(sharedPreferences.getInt(str, 0));
                    }
                case 5:
                    return Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                case 6:
                    return C0755a.m3779a(sharedPreferences, str);
                default:
                    throw new IllegalArgumentException("[SpHelper], action - readInternal , unsupport type");
            }
        } catch (Throwable th) {
            C0732b.m3726i("SpHelper", th.getMessage() + ",logThrowable:" + th);
            return null;
        }
        C0732b.m3726i("SpHelper", th.getMessage() + ",logThrowable:" + th);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.io.Serializable> T m3781a(android.content.SharedPreferences r1, java.lang.String r2, T r3) {
        /*
            if (r3 == 0) goto L28
            boolean r0 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L8
            r0 = 1
            goto L29
        L8:
            boolean r0 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto Le
            r0 = 2
            goto L29
        Le:
            boolean r0 = r3 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L14
            r0 = 4
            goto L29
        L14:
            boolean r0 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1a
            r0 = 3
            goto L29
        L1a:
            boolean r0 = r3 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L20
            r0 = 5
            goto L29
        L20:
            boolean r0 = r3 instanceof java.util.HashSet     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L28
            r0 = 6
            goto L29
        L26:
            r1 = move-exception
            goto L31
        L28:
            r0 = 0
        L29:
            java.io.Serializable r1 = m3780a(r1, r2, r0)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L30
            return r3
        L30:
            return r1
        L31:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r1.getMessage()
            r2.append(r0)
            java.lang.String r0 = ",logThrowable:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "SpHelper"
            p031c.p032a.p072p.p073a.p080f.p081a.C0732b.m3726i(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p072p.p073a.p080f.p086f.C0756b.m3781a(android.content.SharedPreferences, java.lang.String, java.io.Serializable):java.io.Serializable");
    }

    /* renamed from: b */
    public static <T extends Serializable> boolean m3782b(SharedPreferences sharedPreferences, String str, T t) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (t == null) {
            edit.remove(str);
        } else if (t instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Integer) {
            edit.putInt(str, ((Integer) t).intValue());
        } else if (t instanceof Long) {
            edit.putLong(str, ((Long) t).longValue());
        } else if (t instanceof Float) {
            edit.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof String) {
            edit.putString(str, (String) t);
        } else if ((t instanceof HashSet) && Build.VERSION.SDK_INT >= 11) {
            try {
                edit.putStringSet(str, (HashSet) t);
            } catch (ClassCastException unused) {
            }
        }
        return edit.commit();
    }
}
