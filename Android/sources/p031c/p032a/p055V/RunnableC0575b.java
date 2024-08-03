package p031c.p032a.p055V;

import android.content.Context;
import p031c.p032a.p033A.C0511f;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.V.b */
/* loaded from: classes.dex */
public final class RunnableC0575b implements Runnable {

    /* renamed from: a */
    private Context f2764a;

    /* renamed from: b */
    final /* synthetic */ C0574a f2765b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0575b(C0574a c0574a, Context context) {
        this.f2765b = c0574a;
        this.f2764a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2765b.mo2682d(this.f2764a);
            if (C0511f.m2709h(this.f2764a, "JWake")) {
                this.f2765b.mo2680c(this.f2764a, "JWake");
            } else {
                C0675a.m3475g("JWake", "can't wake because wakeConfig not allow");
            }
            if (this.f2765b.mo2678b(this.f2764a, "JWake")) {
                this.f2765b.mo2683d(this.f2764a, "JWake");
            }
        } catch (Throwable th) {
            C0675a.m3475g("JWake", "dealAction throwable:" + th.getMessage());
        }
    }
}
