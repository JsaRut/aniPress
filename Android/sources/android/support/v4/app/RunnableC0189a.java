package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.C0191b;

/* renamed from: android.support.v4.app.a */
/* loaded from: classes.dex */
public class RunnableC0189a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f717a;

    /* renamed from: b */
    final /* synthetic */ Activity f718b;

    /* renamed from: c */
    final /* synthetic */ int f719c;

    public RunnableC0189a(String[] strArr, Activity activity, int i) {
        this.f717a = strArr;
        this.f718b = activity;
        this.f719c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[this.f717a.length];
        PackageManager packageManager = this.f718b.getPackageManager();
        String packageName = this.f718b.getPackageName();
        int length = this.f717a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f717a[i], packageName);
        }
        ((C0191b.a) this.f718b).onRequestPermissionsResult(this.f719c, this.f717a, iArr);
    }
}
