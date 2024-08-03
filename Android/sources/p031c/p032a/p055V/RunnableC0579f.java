package p031c.p032a.p055V;

import android.content.Context;
import android.os.Bundle;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.V.f */
/* loaded from: classes.dex */
public final class RunnableC0579f implements Runnable {

    /* renamed from: a */
    private Context f2772a;

    /* renamed from: b */
    private Bundle f2773b;

    /* renamed from: c */
    private int f2774c;

    /* renamed from: d */
    private boolean f2775d;

    /* renamed from: e */
    final /* synthetic */ C0574a f2776e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0579f(C0574a c0574a, Context context, Bundle bundle, int i, boolean z) {
        this.f2776e = c0574a;
        this.f2772a = context;
        this.f2773b = bundle;
        this.f2774c = i;
        this.f2775d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (new Object()) {
                C0574a.m2967a(this.f2776e, this.f2772a, this.f2773b, this.f2774c, this.f2775d);
            }
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "dealAction throwable:" + th.getMessage());
        }
    }
}
