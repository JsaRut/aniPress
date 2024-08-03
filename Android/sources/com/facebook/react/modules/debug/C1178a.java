package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.C1102d;
import com.facebook.react.uimanager.p128b.InterfaceC1298a;

/* renamed from: com.facebook.react.modules.debug.a */
/* loaded from: classes.dex */
public class C1178a implements NotThreadSafeBridgeIdleDebugListener, InterfaceC1298a {

    /* renamed from: a */
    private final C1102d f4527a = C1102d.m5168a(20);

    /* renamed from: b */
    private final C1102d f4528b = C1102d.m5168a(20);

    /* renamed from: c */
    private final C1102d f4529c = C1102d.m5168a(20);

    /* renamed from: d */
    private final C1102d f4530d = C1102d.m5168a(20);

    /* renamed from: e */
    private volatile boolean f4531e = true;

    /* renamed from: a */
    private static long m5305a(C1102d c1102d, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < c1102d.m5170a(); i++) {
            long m5174c = c1102d.m5174c(i);
            if (m5174c < j || m5174c >= j2) {
                if (m5174c >= j2) {
                    break;
                }
            } else {
                j3 = m5174c;
            }
        }
        return j3;
    }

    /* renamed from: a */
    private static void m5306a(C1102d c1102d, long j) {
        int m5170a = c1102d.m5170a();
        int i = 0;
        for (int i2 = 0; i2 < m5170a; i2++) {
            if (c1102d.m5174c(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < m5170a - i; i3++) {
                c1102d.m5171a(i3, c1102d.m5174c(i3 + i));
            }
            c1102d.m5173b(i);
        }
    }

    /* renamed from: b */
    private boolean m5307b(long j, long j2) {
        long m5305a = m5305a(this.f4527a, j, j2);
        long m5305a2 = m5305a(this.f4528b, j, j2);
        return (m5305a == -1 && m5305a2 == -1) ? this.f4531e : m5305a > m5305a2;
    }

    /* renamed from: b */
    private static boolean m5308b(C1102d c1102d, long j, long j2) {
        for (int i = 0; i < c1102d.m5170a(); i++) {
            long m5174c = c1102d.m5174c(i);
            if (m5174c >= j && m5174c < j2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.p128b.InterfaceC1298a
    /* renamed from: a */
    public synchronized void mo5309a() {
        this.f4529c.m5172a(System.nanoTime());
    }

    /* renamed from: a */
    public synchronized boolean m5310a(long j, long j2) {
        boolean z;
        boolean m5308b = m5308b(this.f4530d, j, j2);
        boolean m5307b = m5307b(j, j2);
        z = true;
        if (!m5308b && (!m5307b || m5308b(this.f4529c, j, j2))) {
            z = false;
        }
        m5306a(this.f4527a, j2);
        m5306a(this.f4528b, j2);
        m5306a(this.f4529c, j2);
        m5306a(this.f4530d, j2);
        this.f4531e = m5307b;
        return z;
    }

    @Override // com.facebook.react.uimanager.p128b.InterfaceC1298a
    /* renamed from: b */
    public synchronized void mo5311b() {
        this.f4530d.m5172a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f4528b.m5172a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f4527a.m5172a(System.nanoTime());
    }
}
