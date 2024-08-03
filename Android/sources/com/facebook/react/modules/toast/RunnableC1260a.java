package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: com.facebook.react.modules.toast.a */
/* loaded from: classes.dex */
class RunnableC1260a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4717a;

    /* renamed from: b */
    final /* synthetic */ int f4718b;

    /* renamed from: c */
    final /* synthetic */ ToastModule f4719c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1260a(ToastModule toastModule, String str, int i) {
        this.f4719c = toastModule;
        this.f4717a = str;
        this.f4718b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        ReactApplicationContext reactApplicationContext;
        reactApplicationContext = this.f4719c.getReactApplicationContext();
        Toast.makeText(reactApplicationContext, this.f4717a, this.f4718b).show();
    }
}
