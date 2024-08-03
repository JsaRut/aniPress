package p031c.p032a.p098x;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.x.f */
/* loaded from: classes.dex */
public final class RunnableC0862f implements Runnable {

    /* renamed from: a */
    boolean f3633a;

    /* renamed from: b */
    Context f3634b;

    /* renamed from: c */
    C0858b f3635c;

    public RunnableC0862f(boolean z, Context context, C0858b c0858b) {
        this.f3633a = z;
        this.f3634b = context;
        this.f3635c = c0858b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f3633a) {
                C0858b.m4182a(this.f3635c, this.f3634b);
            } else {
                C0858b.m4184b(this.f3635c, this.f3634b);
            }
        } catch (Throwable unused) {
        }
    }
}
