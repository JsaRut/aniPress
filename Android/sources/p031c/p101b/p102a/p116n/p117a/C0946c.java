package p031c.p101b.p102a.p116n.p117a;

import android.os.Build;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.n.a.c */
/* loaded from: classes.dex */
public class C0946c extends WebChromeClient {

    /* renamed from: a */
    private final String f3984a = "InjectedChromeClient";

    /* renamed from: b */
    private C0947d f3985b;

    /* renamed from: c */
    private boolean f3986c;

    public C0946c(String str, Class cls) {
        this.f3985b = new C0947d(str, cls);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (Build.VERSION.SDK_INT >= 17) {
            return true;
        }
        jsPromptResult.confirm(this.f3985b.m4762a(webView, str2));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        webView.getSettings().setSavePassword(false);
        if (Build.VERSION.SDK_INT < 17) {
            if (i <= 25) {
                this.f3986c = false;
            } else if (!this.f3986c) {
                C0923b.m4644b("InjectedChromeClient", "Android sdk version lesser than 17, Java—Js interact by injection!");
                webView.loadUrl(this.f3985b.m4761a());
                this.f3986c = true;
                C0923b.m4642a("InjectedChromeClient", " inject js interface completely on progress " + i);
            }
        }
        super.onProgressChanged(webView, i);
    }
}
