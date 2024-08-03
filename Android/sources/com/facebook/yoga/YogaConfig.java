package com.facebook.yoga;

import com.facebook.soloader.SoLoader;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class YogaConfig {

    /* renamed from: a */
    long f5727a = jni_YGConfigNew();

    /* renamed from: b */
    private YogaNodeCloneFunction f5728b;

    static {
        SoLoader.m6388a("yoga");
    }

    public YogaConfig() {
        if (this.f5727a == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    @InterfaceC2039a
    private final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
        return this.f5728b.cloneNode(yogaNode, yogaNode2, i);
    }

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    /* renamed from: a */
    public void m6472a(float f) {
        jni_YGConfigSetPointScaleFactor(this.f5727a, f);
    }

    /* renamed from: a */
    public void m6473a(boolean z) {
        jni_YGConfigSetUseLegacyStretchBehaviour(this.f5727a, z);
    }

    protected void finalize() {
        try {
            jni_YGConfigFree(this.f5727a);
        } finally {
            super.finalize();
        }
    }
}
