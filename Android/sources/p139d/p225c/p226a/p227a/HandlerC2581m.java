package p139d.p225c.p226a.p227a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: d.c.a.a.m */
/* loaded from: classes.dex */
public class HandlerC2581m extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2613n f10735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2581m(C2613n c2613n, Looper looper) {
        super(looper);
        this.f10735a = c2613n;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.f10735a.m10981a(message);
    }
}
