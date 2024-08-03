package p031c.p101b.p102a.p116n.p117a;

import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: c.b.a.n.a.a */
/* loaded from: classes.dex */
public class C0944a extends C0946c {

    /* renamed from: d */
    private ProgressBar f3981d;

    /* renamed from: e */
    private TextView f3982e;

    public C0944a(String str, Class cls, ProgressBar progressBar, TextView textView) {
        super(str, cls);
        this.f3981d = progressBar;
        this.f3982e = textView;
        ProgressBar progressBar2 = this.f3981d;
        if (progressBar2 != null) {
            progressBar2.setMax(100);
        }
        TextView textView2 = this.f3982e;
        if (textView2 != null) {
            textView2.setSingleLine(true);
            this.f3982e.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    @Override // p031c.p101b.p102a.p116n.p117a.C0946c, android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // p031c.p101b.p102a.p116n.p117a.C0946c, android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // p031c.p101b.p102a.p116n.p117a.C0946c, android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ProgressBar progressBar = this.f3981d;
        if (progressBar != null) {
            if (100 == i) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
                this.f3981d.setProgress(i);
            }
        }
        if (this.f3982e == null || webView.getTitle() == null || webView.getTitle().equals(this.f3982e.getText())) {
            return;
        }
        this.f3982e.setText(webView.getTitle());
    }
}
