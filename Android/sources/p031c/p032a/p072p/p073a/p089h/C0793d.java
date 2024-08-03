package p031c.p032a.p072p.p073a.p089h;

import android.os.Build;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: c.a.p.a.h.d */
/* loaded from: classes.dex */
final class C0793d extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ ActivityC0790a f3467a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0793d(ActivityC0790a activityC0790a) {
        this.f3467a = activityC0790a;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if (str.startsWith("http://localhost/img") && Build.VERSION.SDK_INT >= 11) {
                return new WebResourceResponse("image/jpg", "UTF-8", new FileInputStream(new File(str.replaceFirst("http://localhost/img", ""))));
            }
        } catch (Throwable unused) {
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebView webView2;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        webView.loadUrl(str);
        webView2 = this.f3467a.f3462a;
        webView2.stopLoading();
        return true;
    }
}
