package p031c.p032a.p072p.p073a.p089h;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* renamed from: c.a.p.a.h.b */
/* loaded from: classes.dex */
public final class C0791b extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ ActivityC0790a f3465a;

    public C0791b(ActivityC0790a activityC0790a) {
        this.f3465a = activityC0790a;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        ProgressBar progressBar;
        ProgressBar progressBar2;
        ProgressBar progressBar3;
        ProgressBar progressBar4;
        super.onProgressChanged(webView, i);
        try {
            if (i >= 100) {
                progressBar3 = this.f3465a.f3463b;
                progressBar3.setProgress(i);
                progressBar4 = this.f3465a.f3463b;
                progressBar4.postDelayed(new RunnableC0792c(this), 500L);
            } else {
                progressBar = this.f3465a.f3463b;
                progressBar.setVisibility(0);
                progressBar2 = this.f3465a.f3463b;
                progressBar2.setProgress(i);
            }
        } catch (Throwable unused) {
        }
    }
}
