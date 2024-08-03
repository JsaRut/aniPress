package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.C1550a;

/* loaded from: classes.dex */
public class ReactBridge {
    private static boolean sDidInit = false;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (sDidInit) {
                return;
            }
            sDidInit = true;
            sLoadStartTime = SystemClock.uptimeMillis();
            C1550a.m6454a(0L, "ReactBridge.staticInit::load:reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
            SoLoader.m6388a("reactnativejni");
            ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
            C1550a.m6453a(0L);
            sLoadEndTime = SystemClock.uptimeMillis();
        }
    }
}
