package p031c.p032a.p098x;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.x.c */
/* loaded from: classes.dex */
public final class RunnableC0859c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f3627a;

    /* renamed from: b */
    final /* synthetic */ C0858b f3628b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0859c(C0858b c0858b, Context context) {
        this.f3628b = c0858b;
        this.f3627a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0858b.m4182a(this.f3628b, this.f3627a);
        } catch (Throwable unused) {
        }
    }
}
