package com.facebook.react.modules.network;

import android.webkit.CookieSyncManager;
import com.facebook.react.modules.network.C1217i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.h */
/* loaded from: classes.dex */
public class RunnableC1216h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1217i.a f4619a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1216h(C1217i.a aVar) {
        this.f4619a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1217i.f4620a) {
            CookieSyncManager.getInstance().sync();
        } else {
            this.f4619a.m5418c();
        }
    }
}
