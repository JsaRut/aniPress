package com.facebook.react.views.webview;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;

/* renamed from: com.facebook.react.views.webview.b */
/* loaded from: classes.dex */
public class C1529b extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ ReactWebViewManager f5651a;

    public C1529b(ReactWebViewManager reactWebViewManager) {
        this.f5651a = reactWebViewManager;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, true, false);
    }
}
