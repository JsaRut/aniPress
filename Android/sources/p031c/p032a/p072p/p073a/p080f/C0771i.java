package p031c.p032a.p072p.p073a.p080f;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p085e.C0753a;

/* renamed from: c.a.p.a.f.i */
/* loaded from: classes.dex */
public final class C0771i {
    /* renamed from: a */
    public static void m3845a(WebView webView) {
        webView.clearCache(true);
        webView.clearHistory();
        WebSettings settings = webView.getSettings();
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("UTF-8");
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            settings.setDisplayZoomControls(false);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                C0753a.m3777a(settings, "setSafeBrowsingEnabled", new Object[]{false}, new Class[]{Boolean.TYPE});
            } catch (Exception e2) {
                C0732b.m3723f("WebUtils", "setSafeBrowsingEnabled e:" + e2);
            }
        }
        settings.setCacheMode(2);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        } catch (Throwable th) {
            C0732b.m3725h("WebUtils", "fixSecure failed, error:" + th);
        }
    }

    /* renamed from: a */
    public static void m3846a(WebView webView, String str, Object obj) {
        try {
            C0753a.m3777a(webView, "addJavascriptInterface", new Object[]{obj, str}, new Class[]{Object.class, String.class});
        } catch (Exception e2) {
            C0732b.m3725h("WebUtils", "addJavascriptInterface failed:" + e2.toString());
        }
    }
}
