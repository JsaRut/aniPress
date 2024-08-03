package com.facebook.react.modules.debug;

import com.facebook.react.modules.core.C1163b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.debug.b */
/* loaded from: classes.dex */
public class RunnableC1180b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1181c f4532a;

    /* renamed from: b */
    final /* synthetic */ C1181c f4533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1180b(C1181c c1181c, C1181c c1181c2) {
        this.f4533b = c1181c;
        this.f4532a = c1181c2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1163b c1163b;
        this.f4533b.f4534b = C1163b.m5278a();
        c1163b = this.f4533b.f4534b;
        c1163b.m5282a(this.f4532a);
    }
}
