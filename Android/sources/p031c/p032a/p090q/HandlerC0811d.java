package p031c.p032a.p090q;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import p031c.p032a.p066j.C0675a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.q.d */
/* loaded from: classes.dex */
public final class HandlerC0811d extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0809b f3526a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0811d(C0809b c0809b, Looper looper) {
        super(looper);
        this.f3526a = c0809b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        try {
            sparseArray = this.f3526a.f3522d;
            AbstractC0808a abstractC0808a = (AbstractC0808a) sparseArray.get(message.what);
            if (abstractC0808a == null) {
                C0675a.m3475g("TaskHandlerManager_xxx", "miss task:" + message.what);
            } else {
                if (abstractC0808a.f3518b == 1) {
                    sendEmptyMessageDelayed(message.what, abstractC0808a.f3517a);
                } else {
                    sparseArray2 = this.f3526a.f3522d;
                    sparseArray2.remove(message.what);
                }
                abstractC0808a.mo3405a(message);
            }
        } catch (Throwable th) {
            C0675a.m3475g("TaskHandlerManager_xxx", "handleMessage,e:" + th);
        }
    }
}
