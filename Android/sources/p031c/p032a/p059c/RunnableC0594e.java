package p031c.p032a.p059c;

import android.content.Context;
import android.os.Bundle;

/* renamed from: c.a.c.e */
/* loaded from: classes.dex */
public final class RunnableC0594e implements Runnable {

    /* renamed from: a */
    private String f2841a;

    /* renamed from: b */
    private Bundle f2842b;

    /* renamed from: c */
    private Context f2843c;

    /* renamed from: d */
    final /* synthetic */ C0593d f2844d;

    public RunnableC0594e(C0593d c0593d, Context context, String str, Bundle bundle) {
        this.f2844d = c0593d;
        this.f2841a = str;
        this.f2842b = bundle;
        this.f2843c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0593d.f2838c.mo2885a(this.f2843c, this.f2841a, this.f2842b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
