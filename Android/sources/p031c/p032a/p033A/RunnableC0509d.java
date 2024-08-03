package p031c.p032a.p033A;

import android.content.Context;

/* renamed from: c.a.A.d */
/* loaded from: classes.dex */
public final class RunnableC0509d implements Runnable {

    /* renamed from: a */
    private Context f2577a;

    /* renamed from: b */
    private String f2578b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0506a f2579c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0509d(AbstractC0506a abstractC0506a, Context context, String str) {
        this.f2579c = abstractC0506a;
        this.f2577a = context;
        this.f2578b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0506a.m2663a(this.f2579c, this.f2577a, this.f2578b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
