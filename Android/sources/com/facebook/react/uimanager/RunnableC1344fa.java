package com.facebook.react.uimanager;

import android.os.SystemClock;
import com.facebook.react.uimanager.C1348ha;
import com.facebook.react.uimanager.p128b.InterfaceC1298a;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.C1552c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.fa */
/* loaded from: classes.dex */
public class RunnableC1344fa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f4907a;

    /* renamed from: b */
    final /* synthetic */ ArrayDeque f4908b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f4909c;

    /* renamed from: d */
    final /* synthetic */ long f4910d;

    /* renamed from: e */
    final /* synthetic */ long f4911e;

    /* renamed from: f */
    final /* synthetic */ long f4912f;

    /* renamed from: g */
    final /* synthetic */ long f4913g;

    /* renamed from: h */
    final /* synthetic */ C1348ha f4914h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1344fa(C1348ha c1348ha, int i, ArrayDeque arrayDeque, ArrayList arrayList, long j, long j2, long j3, long j4) {
        this.f4914h = c1348ha;
        this.f4907a = i;
        this.f4908b = arrayDeque;
        this.f4909c = arrayList;
        this.f4910d = j;
        this.f4911e = j2;
        this.f4912f = j3;
        this.f4913g = j4;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        InterfaceC1298a interfaceC1298a;
        InterfaceC1298a interfaceC1298a2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        C1552c.a m6467a = C1552c.m6467a(0L, "DispatchUI");
        m6467a.mo6468a("BatchId", this.f4907a);
        m6467a.mo6470a();
        try {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f4908b != null) {
                    Iterator it = this.f4908b.iterator();
                    while (it.hasNext()) {
                        ((C1348ha.u) it.next()).execute();
                    }
                }
                if (this.f4909c != null) {
                    Iterator it2 = this.f4909c.iterator();
                    while (it2.hasNext()) {
                        ((C1348ha.u) it2.next()).execute();
                    }
                }
                z = this.f4914h.f4934n;
                if (z) {
                    j = this.f4914h.f4936p;
                    if (j == 0) {
                        this.f4914h.f4936p = this.f4910d;
                        this.f4914h.f4937q = this.f4911e;
                        this.f4914h.f4938r = this.f4912f;
                        this.f4914h.f4939s = uptimeMillis;
                        this.f4914h.f4942v = this.f4913g;
                        j2 = this.f4914h.f4936p;
                        C1550a.m6456a(0L, "delayBeforeDispatchViewUpdates", 0, j2 * 1000000);
                        j3 = this.f4914h.f4938r;
                        C1550a.m6460b(0L, "delayBeforeDispatchViewUpdates", 0, j3 * 1000000);
                        j4 = this.f4914h.f4938r;
                        C1550a.m6456a(0L, "delayBeforeBatchRunStart", 0, j4 * 1000000);
                        j5 = this.f4914h.f4939s;
                        C1550a.m6460b(0L, "delayBeforeBatchRunStart", 0, j5 * 1000000);
                    }
                }
                this.f4914h.f4922b.m5931b();
                interfaceC1298a = this.f4914h.f4931k;
                if (interfaceC1298a != null) {
                    interfaceC1298a2 = this.f4914h.f4931k;
                    interfaceC1298a2.mo5311b();
                }
            } catch (Exception e2) {
                this.f4914h.f4933m = true;
                throw e2;
            }
        } finally {
            C1550a.m6453a(0L);
        }
    }
}
