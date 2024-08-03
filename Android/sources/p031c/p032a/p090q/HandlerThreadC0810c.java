package p031c.p032a.p090q;

import android.os.HandlerThread;
import p031c.p032a.p066j.C0675a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.q.c */
/* loaded from: classes.dex */
public final class HandlerThreadC0810c extends HandlerThread {

    /* renamed from: a */
    final /* synthetic */ C0809b f3525a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC0810c(C0809b c0809b, String str) {
        super(str);
        this.f3525a = c0809b;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            super.run();
        } catch (RuntimeException e2) {
            C0675a.m3477i("TaskHandlerManager_xxx", "handler thread run e:" + e2 + "  t=" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId());
        }
    }
}
