package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.modules.core.b */
/* loaded from: classes.dex */
public class C1163b {

    /* renamed from: a */
    private static C1163b f4492a;

    /* renamed from: b */
    private Choreographer f4493b = m5280b();

    /* renamed from: com.facebook.react.modules.core.b$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        private Choreographer.FrameCallback f4494a;

        /* renamed from: a */
        Choreographer.FrameCallback m5284a() {
            if (this.f4494a == null) {
                this.f4494a = new ChoreographerFrameCallbackC1162a(this);
            }
            return this.f4494a;
        }

        /* renamed from: a */
        public abstract void mo5272a(long j);
    }

    private C1163b() {
    }

    /* renamed from: a */
    public static C1163b m5278a() {
        UiThreadUtil.assertOnUiThread();
        if (f4492a == null) {
            f4492a = new C1163b();
        }
        return f4492a;
    }

    /* renamed from: a */
    private void m5279a(Choreographer.FrameCallback frameCallback) {
        this.f4493b.postFrameCallback(frameCallback);
    }

    /* renamed from: b */
    private Choreographer m5280b() {
        return Choreographer.getInstance();
    }

    /* renamed from: b */
    private void m5281b(Choreographer.FrameCallback frameCallback) {
        this.f4493b.removeFrameCallback(frameCallback);
    }

    /* renamed from: a */
    public void m5282a(a aVar) {
        m5279a(aVar.m5284a());
    }

    /* renamed from: b */
    public void m5283b(a aVar) {
        m5281b(aVar.m5284a());
    }
}
