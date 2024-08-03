package p031c.p032a.p063g;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p031c.p032a.p066j.C0675a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.g.u */
/* loaded from: classes.dex */
public final class HandlerC0639u extends Handler {

    /* renamed from: a */
    private final ExecutorService f2988a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC0639u(ExecutorService executorService) {
        super(C0636r.m3260c());
        this.f2988a = executorService;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            if (this.f2988a.isShutdown()) {
                C0675a.m3475g("Step", "executor is shutdown");
            } else {
                this.f2988a.submit((Callable) message.obj);
            }
        } catch (Throwable th) {
            C0675a.m3477i("Step", "handleMessage e:" + th);
        }
    }
}
