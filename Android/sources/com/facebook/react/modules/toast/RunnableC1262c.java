package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: com.facebook.react.modules.toast.c */
/* loaded from: classes.dex */
class RunnableC1262c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4724a;

    /* renamed from: b */
    final /* synthetic */ int f4725b;

    /* renamed from: c */
    final /* synthetic */ int f4726c;

    /* renamed from: d */
    final /* synthetic */ int f4727d;

    /* renamed from: e */
    final /* synthetic */ int f4728e;

    /* renamed from: f */
    final /* synthetic */ ToastModule f4729f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1262c(ToastModule toastModule, String str, int i, int i2, int i3, int i4) {
        this.f4729f = toastModule;
        this.f4724a = str;
        this.f4725b = i;
        this.f4726c = i2;
        this.f4727d = i3;
        this.f4728e = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        ReactApplicationContext reactApplicationContext;
        reactApplicationContext = this.f4729f.getReactApplicationContext();
        Toast makeText = Toast.makeText(reactApplicationContext, this.f4724a, this.f4725b);
        makeText.setGravity(this.f4726c, this.f4727d, this.f4728e);
        makeText.show();
    }
}
