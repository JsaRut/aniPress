package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import p000a.p005b.p009c.p010a.C0022a;

/* renamed from: android.support.v4.app.b */
/* loaded from: classes.dex */
public class C0191b extends C0022a {

    /* renamed from: c */
    private static b f723c;

    /* renamed from: android.support.v4.app.b$a */
    /* loaded from: classes.dex */
    public interface a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean m850a(Activity activity, String[] strArr, int i);

        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: android.support.v4.app.b$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo851a(int i);
    }

    /* renamed from: a */
    public static b m846a() {
        return f723c;
    }

    /* renamed from: a */
    public static void m847a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m848a(Activity activity, String[] strArr, int i) {
        b bVar = f723c;
        if (bVar == null || !bVar.m850a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof c) {
                    ((c) activity).mo851a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof a) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0189a(strArr, activity, i));
            }
        }
    }

    /* renamed from: a */
    public static boolean m849a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
