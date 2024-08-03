package p031c.p101b.p102a.p103a;

import android.os.HandlerThread;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.a.b */
/* loaded from: classes.dex */
public class HandlerThreadC0871b extends HandlerThread {

    /* renamed from: a */
    final /* synthetic */ C0873d f3656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC0871b(C0873d c0873d, String str) {
        super(str);
        this.f3656a = c0873d;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            super.run();
        } catch (RuntimeException e2) {
            C0923b.m4646c("CustomGeofenAction", "handler thread run e:" + e2 + "  t=" + Thread.currentThread().getName() + "_" + Thread.currentThread().getId());
        }
    }
}
