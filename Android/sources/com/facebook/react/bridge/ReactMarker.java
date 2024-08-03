package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class ReactMarker {
    private static final List<MarkerListener> sListeners = new ArrayList();

    /* loaded from: classes.dex */
    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    @InterfaceC2039a
    public static void addListener(MarkerListener markerListener) {
        synchronized (sListeners) {
            if (!sListeners.contains(markerListener)) {
                sListeners.add(markerListener);
            }
        }
    }

    @InterfaceC2039a
    public static void clearMarkerListeners() {
        synchronized (sListeners) {
            sListeners.clear();
        }
    }

    @InterfaceC2039a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @InterfaceC2039a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @InterfaceC2039a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @InterfaceC2039a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        synchronized (sListeners) {
            Iterator<MarkerListener> it = sListeners.iterator();
            while (it.hasNext()) {
                it.next().logMarker(reactMarkerConstants, str, i);
            }
        }
    }

    @InterfaceC2039a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @InterfaceC2039a
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @InterfaceC2039a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @InterfaceC2039a
    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @InterfaceC2039a
    public static void removeListener(MarkerListener markerListener) {
        synchronized (sListeners) {
            sListeners.remove(markerListener);
        }
    }
}
