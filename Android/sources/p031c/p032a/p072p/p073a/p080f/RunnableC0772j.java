package p031c.p032a.p072p.p073a.p080f;

import android.webkit.WebView;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.j */
/* loaded from: classes.dex */
final class RunnableC0772j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f3416a;

    /* renamed from: b */
    final /* synthetic */ WebView f3417b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0772j(String str, WebView webView) {
        this.f3416a = str;
        this.f3417b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0732b.m3718b("WebUtils", "call js:" + this.f3416a);
        this.f3417b.loadUrl(this.f3416a);
    }
}
