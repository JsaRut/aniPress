package com.facebook.react.views.webview;

import android.graphics.Picture;
import android.webkit.WebView;
import com.facebook.react.uimanager.events.C1329b;

/* renamed from: com.facebook.react.views.webview.c */
/* loaded from: classes.dex */
public class C1530c implements WebView.PictureListener {

    /* renamed from: a */
    final /* synthetic */ ReactWebViewManager f5652a;

    public C1530c(ReactWebViewManager reactWebViewManager) {
        this.f5652a = reactWebViewManager;
    }

    @Override // android.webkit.WebView.PictureListener
    public void onNewPicture(WebView webView, Picture picture) {
        ReactWebViewManager.dispatchEvent(webView, new C1329b(webView.getId(), webView.getWidth(), webView.getContentHeight()));
    }
}
