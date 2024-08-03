package p031c.p032a.p072p.p073a.p074a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.p.a.a.p */
/* loaded from: classes.dex */
public final class HandlerC0706p extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0705o f3227a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0706p(C0705o c0705o, Looper looper) {
        super(looper);
        this.f3227a = c0705o;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AtomicBoolean atomicBoolean;
        int i = message.what;
        if (i == 1) {
            C0705o.m3604a(this.f3227a);
        } else {
            if (i != 2) {
                return;
            }
            atomicBoolean = this.f3227a.f3224d;
            atomicBoolean.set(true);
            C0705o.m3604a(this.f3227a);
        }
    }
}
