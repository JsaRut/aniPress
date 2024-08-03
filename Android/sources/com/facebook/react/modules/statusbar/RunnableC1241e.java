package com.facebook.react.modules.statusbar;

import android.app.Activity;

/* renamed from: com.facebook.react.modules.statusbar.e */
/* loaded from: classes.dex */
class RunnableC1241e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f4675a;

    /* renamed from: b */
    final /* synthetic */ Activity f4676b;

    /* renamed from: c */
    final /* synthetic */ StatusBarModule f4677c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1241e(StatusBarModule statusBarModule, boolean z, Activity activity) {
        this.f4677c = statusBarModule;
        this.f4675a = z;
        this.f4676b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f4675a) {
            this.f4676b.getWindow().addFlags(1024);
            this.f4676b.getWindow().clearFlags(2048);
        } else {
            this.f4676b.getWindow().addFlags(2048);
            this.f4676b.getWindow().clearFlags(1024);
        }
    }
}
