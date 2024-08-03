package p000a.p005b.p009c.p017f;

import android.os.Handler;
import android.os.Message;

/* renamed from: a.b.c.f.g */
/* loaded from: classes.dex */
public class C0059g implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C0063k f203a;

    public C0059g(C0063k c0063k) {
        this.f203a = c0063k;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f203a.m261a();
            return true;
        }
        if (i != 1) {
            return true;
        }
        this.f203a.m262a((Runnable) message.obj);
        return true;
    }
}
