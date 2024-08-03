package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public class NativeDeltaClient {
    private final HybridData mHybridData = initHybrid();

    static {
        ReactBridge.staticInit();
    }

    private static native HybridData initHybrid();

    public native void processDelta(ReadableByteChannel readableByteChannel);

    public native void reset();
}
