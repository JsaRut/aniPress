package com.facebook.common.time;

import android.os.SystemClock;
import p139d.p143b.p148c.p152d.InterfaceC1685d;

@InterfaceC1685d
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements InterfaceC0986b {

    @InterfaceC1685d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @InterfaceC1685d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.InterfaceC0986b
    @InterfaceC1685d
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
