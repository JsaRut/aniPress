package p031c.p032a.p055V;

import android.content.Context;
import p031c.p032a.p046N.C0545a;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.V.c */
/* loaded from: classes.dex */
public final class RunnableC0576c implements Runnable {

    /* renamed from: a */
    private Context f2766a;

    /* renamed from: b */
    final /* synthetic */ C0574a f2767b;

    private RunnableC0576c(C0574a c0574a, Context context) {
        this.f2767b = c0574a;
        this.f2766a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC0576c(C0574a c0574a, Context context, byte b2) {
        this(c0574a, context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0545a.m2829a(this.f2766a, C0545a.m2838e(this.f2766a));
            this.f2767b.m2971i(this.f2766a);
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "RegisterAction failed:" + th.getMessage());
        }
    }
}
