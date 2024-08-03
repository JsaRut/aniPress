package p139d.p143b.p184i.p187b.p188a;

import android.os.Looper;
import java.util.concurrent.Executor;
import okhttp3.Call;
import p139d.p143b.p184i.p200n.C1979f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.b.a.c */
/* loaded from: classes.dex */
public class C1834c extends C1979f {

    /* renamed from: a */
    final /* synthetic */ Call f6759a;

    /* renamed from: b */
    final /* synthetic */ C1836e f6760b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1834c(C1836e c1836e, Call call) {
        this.f6760b = c1836e;
        this.f6759a = call;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2000pa
    /* renamed from: a */
    public void mo7534a() {
        Executor executor;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f6759a.cancel();
        } else {
            executor = this.f6760b.f6765b;
            executor.execute(new RunnableC1833b(this));
        }
    }
}
