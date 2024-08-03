package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.n */
/* loaded from: classes.dex */
public class HandlerC0207n extends Handler {

    /* renamed from: a */
    final /* synthetic */ ActivityC0208o f851a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC0207n(ActivityC0208o activityC0208o) {
        this.f851a = activityC0208o;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 2) {
            super.handleMessage(message);
        } else {
            this.f851a.m1016f();
            this.f851a.f853d.m1047i();
        }
    }
}
