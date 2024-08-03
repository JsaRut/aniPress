package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.modules.core.C1163b;

/* renamed from: com.facebook.react.modules.core.a */
/* loaded from: classes.dex */
public class ChoreographerFrameCallbackC1162a implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ C1163b.a f4491a;

    public ChoreographerFrameCallbackC1162a(C1163b.a aVar) {
        this.f4491a = aVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.f4491a.mo5272a(j);
    }
}
