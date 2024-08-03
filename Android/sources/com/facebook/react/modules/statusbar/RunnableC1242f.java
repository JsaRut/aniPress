package com.facebook.react.modules.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;

/* renamed from: com.facebook.react.modules.statusbar.f */
/* loaded from: classes.dex */
class RunnableC1242f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f4678a;

    /* renamed from: b */
    final /* synthetic */ String f4679b;

    /* renamed from: c */
    final /* synthetic */ StatusBarModule f4680c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1242f(StatusBarModule statusBarModule, Activity activity, String str) {
        this.f4680c = statusBarModule;
        this.f4678a = activity;
        this.f4679b = str;
    }

    @Override // java.lang.Runnable
    @TargetApi(23)
    public void run() {
        View decorView = this.f4678a.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility("dark-content".equals(this.f4679b) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }
}
