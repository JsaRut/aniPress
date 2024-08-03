package com.facebook.react.fabric.jsi;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C1550a;

/* renamed from: com.facebook.react.fabric.jsi.b */
/* loaded from: classes.dex */
public class C1128b {

    /* renamed from: a */
    private static boolean f4409a = false;

    /* renamed from: a */
    public static void m5242a() {
        if (f4409a) {
            return;
        }
        f4409a = true;
        C1550a.m6454a(0L, "FabricSoLoader.staticInit::load:fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.m6388a("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        C1550a.m6453a(0L);
    }
}
