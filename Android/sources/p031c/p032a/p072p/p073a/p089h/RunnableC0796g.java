package p031c.p032a.p072p.p073a.p089h;

import android.content.Intent;

/* renamed from: c.a.p.a.h.g */
/* loaded from: classes.dex */
final class RunnableC0796g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f3472a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0795f f3473b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0796g(RunnableC0795f runnableC0795f, String str) {
        this.f3473b = runnableC0795f;
        this.f3472a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = new Intent(this.f3473b.f3471c, (Class<?>) ActivityC0790a.class);
        intent.putExtra("data", this.f3472a);
        this.f3473b.f3471c.startActivity(intent);
    }
}
