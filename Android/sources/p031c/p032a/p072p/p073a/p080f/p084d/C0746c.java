package p031c.p032a.p072p.p073a.p080f.p084d;

import android.content.Context;

/* renamed from: c.a.p.a.f.d.c */
/* loaded from: classes.dex */
public final class C0746c {
    /* renamed from: a */
    public static String m3771a(Context context, String str, String str2) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) loadClass.getMethod("get", String.class, String.class).invoke(loadClass, new String(str), new String(str2));
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception unused) {
            return str2;
        }
    }
}
