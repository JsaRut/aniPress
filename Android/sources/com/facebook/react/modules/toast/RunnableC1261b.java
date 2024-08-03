package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: com.facebook.react.modules.toast.b */
/* loaded from: classes.dex */
class RunnableC1261b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4720a;

    /* renamed from: b */
    final /* synthetic */ int f4721b;

    /* renamed from: c */
    final /* synthetic */ int f4722c;

    /* renamed from: d */
    final /* synthetic */ ToastModule f4723d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1261b(ToastModule toastModule, String str, int i, int i2) {
        this.f4723d = toastModule;
        this.f4720a = str;
        this.f4721b = i;
        this.f4722c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ReactApplicationContext reactApplicationContext;
        reactApplicationContext = this.f4723d.getReactApplicationContext();
        Toast makeText = Toast.makeText(reactApplicationContext, this.f4720a, this.f4721b);
        makeText.setGravity(this.f4722c, 0, 0);
        makeText.show();
    }
}
