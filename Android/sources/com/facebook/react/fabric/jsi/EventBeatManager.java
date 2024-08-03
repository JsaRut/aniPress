package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.InterfaceC1328a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class EventBeatManager implements InterfaceC1328a {

    /* renamed from: a */
    private final ReactApplicationContext f4407a;

    @InterfaceC2039a
    private final HybridData mHybridData;

    static {
        C1128b.m5242a();
    }

    /* renamed from: b */
    private void m5240b() {
        if (this.f4407a.isOnJSQueueThread()) {
            beat();
        } else {
            this.f4407a.runOnJSQueueThread(new RunnableC1127a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void beat();

    private static native HybridData initHybrid(long j);

    @Override // com.facebook.react.uimanager.events.InterfaceC1328a
    /* renamed from: a */
    public void mo5241a() {
        m5240b();
    }
}
