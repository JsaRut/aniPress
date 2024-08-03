package p031c.p101b.p102a.p105c;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.b.a.c.a */
/* loaded from: classes.dex */
public class RunnableC0889a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f3774a;

    /* renamed from: b */
    final /* synthetic */ C0891c f3775b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0889a(C0891c c0891c, Context context) {
        this.f3775b = c0891c;
        this.f3774a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3775b.m4382e(this.f3774a);
        this.f3775b.m4386c(this.f3774a);
    }
}
