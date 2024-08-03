package p031c.p032a.p072p.p073a.p074a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.a.p.a.a.h */
/* loaded from: classes.dex */
public final class HandlerC0698h extends Handler {
    public HandlerC0698h(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractRunnableC0704n m3576a = C0697g.m3576a(message.what);
        if (m3576a == null || m3576a.mo3579a() <= 0) {
            return;
        }
        m3576a.run();
        sendEmptyMessageDelayed(message.what, m3576a.mo3579a() * 1000);
    }
}
