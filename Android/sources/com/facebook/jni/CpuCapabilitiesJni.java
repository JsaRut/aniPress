package com.facebook.jni;

import com.facebook.soloader.SoLoader;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class CpuCapabilitiesJni {
    static {
        SoLoader.m6388a("fb");
    }

    @InterfaceC2039a
    public static native boolean nativeDeviceSupportsNeon();

    @InterfaceC2039a
    public static native boolean nativeDeviceSupportsVFPFP16();

    @InterfaceC2039a
    public static native boolean nativeDeviceSupportsX86();
}
