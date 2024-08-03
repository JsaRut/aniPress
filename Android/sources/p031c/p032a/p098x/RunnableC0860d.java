package p031c.p032a.p098x;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.x.d */
/* loaded from: classes.dex */
public final class RunnableC0860d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f3629a;

    /* renamed from: b */
    final /* synthetic */ C0858b f3630b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0860d(C0858b c0858b, Context context) {
        this.f3630b = c0858b;
        this.f3629a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0858b.m4184b(this.f3630b, this.f3629a);
        } catch (Throwable unused) {
        }
    }
}
