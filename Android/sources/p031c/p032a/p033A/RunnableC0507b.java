package p031c.p032a.p033A;

import android.content.Context;
import android.os.Bundle;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.A.b */
/* loaded from: classes.dex */
public final class RunnableC0507b implements Runnable {

    /* renamed from: a */
    private Context f2570a;

    /* renamed from: b */
    private String f2571b;

    /* renamed from: c */
    private Bundle f2572c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0506a f2573d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0507b(AbstractC0506a abstractC0506a, Context context, String str, Bundle bundle) {
        this.f2573d = abstractC0506a;
        this.f2570a = context;
        this.f2571b = str;
        this.f2572c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0506a.m2664a(this.f2573d, this.f2570a, this.f2571b, this.f2572c);
        } catch (Throwable th) {
            C0675a.m3475g("JCommon", "BundleAction failed:" + th.getMessage());
        }
    }
}
