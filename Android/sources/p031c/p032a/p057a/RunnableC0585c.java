package p031c.p032a.p057a;

import android.content.Context;
import android.os.Bundle;
import p031c.p032a.p059c.C0593d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.a.c */
/* loaded from: classes.dex */
public final class RunnableC0585c implements Runnable {

    /* renamed from: a */
    Context f2806a;

    /* renamed from: b */
    boolean f2807b;

    /* renamed from: c */
    String f2808c;

    /* renamed from: d */
    Bundle f2809d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0585c(Context context, boolean z, String str, Bundle bundle) {
        this.f2806a = context;
        this.f2807b = z;
        this.f2808c = str;
        this.f2809d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f2807b) {
                if (C0583a.m2986c(this.f2806a)) {
                    C0593d.m3037a().m3041b(this.f2806a, this.f2808c, this.f2809d);
                }
            } else if (C0583a.m2985b(this.f2806a)) {
                C0593d.m3037a();
                C0593d.m3039a(this.f2806a, this.f2808c, this.f2809d);
            }
        } catch (Throwable unused) {
        }
    }
}
