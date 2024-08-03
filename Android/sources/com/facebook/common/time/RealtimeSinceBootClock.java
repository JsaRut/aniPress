package com.facebook.common.time;

import android.os.SystemClock;
import p139d.p143b.p148c.p152d.InterfaceC1685d;

@InterfaceC1685d
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements InterfaceC0986b {

    /* renamed from: a */
    private static final RealtimeSinceBootClock f4118a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @InterfaceC1685d
    public static RealtimeSinceBootClock get() {
        return f4118a;
    }

    @Override // com.facebook.common.time.InterfaceC0986b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
