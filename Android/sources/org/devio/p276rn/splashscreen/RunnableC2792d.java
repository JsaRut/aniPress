package org.devio.p276rn.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.devio.rn.splashscreen.d */
/* loaded from: classes.dex */
public class RunnableC2792d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f11452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2792d(Activity activity) {
        this.f11452a = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        dialog = C2793e.f11453a;
        if (dialog != null) {
            dialog2 = C2793e.f11453a;
            if (dialog2.isShowing()) {
                boolean isDestroyed = Build.VERSION.SDK_INT >= 17 ? this.f11452a.isDestroyed() : false;
                if (!this.f11452a.isFinishing() && !isDestroyed) {
                    dialog3 = C2793e.f11453a;
                    dialog3.dismiss();
                }
                Dialog unused = C2793e.f11453a = null;
            }
        }
    }
}
