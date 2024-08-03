package cn.jpush.android.p121ui;

import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cn.jpush.android.ui.b */
/* loaded from: classes.dex */
public class RunnableC0964b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FullScreenView f4018a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0964b(FullScreenView fullScreenView) {
        this.f4018a = fullScreenView;
    }

    @Override // java.lang.Runnable
    public void run() {
        WebView webView;
        WebView webView2;
        webView = this.f4018a.f4001c;
        if (webView != null) {
            webView2 = this.f4018a.f4001c;
            webView2.clearHistory();
        }
    }
}
