package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.g */
/* loaded from: classes.dex */
public final class C0200g {

    /* renamed from: android.support.v4.app.g$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static Method f767a;

        /* renamed from: b */
        private static boolean f768b;

        /* renamed from: a */
        public static IBinder m885a(Bundle bundle, String str) {
            if (!f768b) {
                try {
                    f767a = Bundle.class.getMethod("getIBinder", String.class);
                    f767a.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e2);
                }
                f768b = true;
            }
            Method method = f767a;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e3);
                    f767a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m884a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.m885a(bundle, str);
    }
}
