package p031c.p032a.p033A;

import android.content.Context;

/* renamed from: c.a.A.c */
/* loaded from: classes.dex */
public final class RunnableC0508c implements Runnable {

    /* renamed from: a */
    private Context f2574a;

    /* renamed from: b */
    private String f2575b;

    /* renamed from: c */
    final /* synthetic */ AbstractC0506a f2576c;

    public RunnableC0508c(AbstractC0506a abstractC0506a, Context context, String str) {
        this.f2576c = abstractC0506a;
        this.f2574a = context;
        this.f2575b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0506a.m2666b(this.f2576c, this.f2574a, this.f2575b);
        } catch (Throwable unused) {
        }
    }
}
