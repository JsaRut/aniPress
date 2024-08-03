package p031c.p032a.p098x;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.x.e */
/* loaded from: classes.dex */
public final class RunnableC0861e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f3631a;

    /* renamed from: b */
    final /* synthetic */ C0858b f3632b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0861e(C0858b c0858b, Context context) {
        this.f3632b = c0858b;
        this.f3631a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0858b.m4184b(this.f3632b, this.f3631a);
        } catch (Throwable unused) {
        }
    }
}
