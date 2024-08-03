package org.devio.p276rn.splashscreen;

import android.app.Activity;
import android.app.Dialog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.devio.rn.splashscreen.c */
/* loaded from: classes.dex */
public class RunnableC2791c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f11450a;

    /* renamed from: b */
    final /* synthetic */ int f11451b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2791c(Activity activity, int i) {
        this.f11450a = activity;
        this.f11451b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        Dialog dialog4;
        if (this.f11450a.isFinishing()) {
            return;
        }
        Dialog unused = C2793e.f11453a = new Dialog(this.f11450a, this.f11451b);
        dialog = C2793e.f11453a;
        dialog.setContentView(C2789a.launch_screen);
        dialog2 = C2793e.f11453a;
        dialog2.setCancelable(false);
        dialog3 = C2793e.f11453a;
        if (dialog3.isShowing()) {
            return;
        }
        dialog4 = C2793e.f11453a;
        dialog4.show();
    }
}
