package com.facebook.react.modules.dialog;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: com.facebook.react.modules.dialog.b */
/* loaded from: classes.dex */
class RunnableC1185b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DialogModule.C1183b f4562a;

    /* renamed from: b */
    final /* synthetic */ Bundle f4563b;

    /* renamed from: c */
    final /* synthetic */ Callback f4564c;

    /* renamed from: d */
    final /* synthetic */ DialogModule f4565d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1185b(DialogModule dialogModule, DialogModule.C1183b c1183b, Bundle bundle, Callback callback) {
        this.f4565d = dialogModule;
        this.f4562a = c1183b;
        this.f4563b = bundle;
        this.f4564c = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        DialogModule.C1183b c1183b = this.f4562a;
        z = this.f4565d.mIsInForeground;
        c1183b.m5329a(z, this.f4563b, this.f4564c);
    }
}
