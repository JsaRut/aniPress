package p031c.p032a.p091r;

import android.content.Context;
import android.widget.Toast;

/* renamed from: c.a.r.b */
/* loaded from: classes.dex */
final class RunnableC0813b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f3528a;

    /* renamed from: b */
    final /* synthetic */ String f3529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0813b(Context context, String str) {
        this.f3528a = context;
        this.f3529b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f3528a, this.f3529b, 0).show();
    }
}
