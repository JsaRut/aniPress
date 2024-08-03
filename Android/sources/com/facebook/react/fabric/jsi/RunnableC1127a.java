package com.facebook.react.fabric.jsi;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.fabric.jsi.a */
/* loaded from: classes.dex */
public class RunnableC1127a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventBeatManager f4408a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1127a(EventBeatManager eventBeatManager) {
        this.f4408a = eventBeatManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4408a.beat();
    }
}
