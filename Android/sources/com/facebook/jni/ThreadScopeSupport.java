package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class ThreadScopeSupport {
    static {
        SoLoader.m6388a("fb");
    }

    @InterfaceC2039a
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
