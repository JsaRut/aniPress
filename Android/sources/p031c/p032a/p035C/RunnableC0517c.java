package p031c.p032a.p035C;

import android.content.Context;
import android.content.Intent;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.C.c */
/* loaded from: classes.dex */
public final class RunnableC0517c implements Runnable {

    /* renamed from: a */
    private Context f2595a;

    /* renamed from: b */
    private Intent f2596b;

    /* renamed from: c */
    final /* synthetic */ C0516b f2597c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0517c(C0516b c0516b, Context context, Intent intent) {
        this.f2597c = c0516b;
        this.f2595a = context;
        this.f2596b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0516b.m2726a(this.f2597c, this.f2595a, this.f2596b);
        } catch (Throwable th) {
            C0675a.m3475g("JAppMovement", "dealMovementAction throwable:" + th.getMessage());
        }
    }
}
