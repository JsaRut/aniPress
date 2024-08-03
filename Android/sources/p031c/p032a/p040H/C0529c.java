package p031c.p032a.p040H;

import android.os.Handler;
import android.os.Message;

/* renamed from: c.a.H.c */
/* loaded from: classes.dex */
public final class C0529c implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C0528b f2632a;

    public C0529c(C0528b c0528b) {
        this.f2632a = c0528b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Thread thread;
        if (message == null || message.what != 1 || (thread = (Thread) message.obj) == null) {
            return false;
        }
        thread.interrupt();
        return false;
    }
}
