package com.facebook.react.views.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.views.webview.p134a.C1525a;
import com.facebook.react.views.webview.p134a.C1526b;
import com.facebook.react.views.webview.p134a.C1527c;
import com.facebook.react.views.webview.p134a.C1528d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactWebViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    protected static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    private static final String INTENT_URL_PREFIX = "intent://";
    public static final String REACT_CLASS = "RCTWebView";
    protected WebView.PictureListener mPictureListener;
    protected InterfaceC1531d mWebViewConfig;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$a */
    /* loaded from: classes.dex */
    public static class C1522a extends WebView implements LifecycleEventListener {

        /* renamed from: a */
        protected String f5638a;

        /* renamed from: b */
        protected boolean f5639b;

        /* renamed from: c */
        protected C1523b f5640c;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$a$a */
        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            C1522a f5641a;

            a(C1522a c1522a) {
                this.f5641a = c1522a;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f5641a.m6371b(str);
            }
        }

        public C1522a(C1278N c1278n) {
            super(c1278n);
            this.f5639b = false;
        }

        /* renamed from: a */
        protected a m6367a(C1522a c1522a) {
            return new a(c1522a);
        }

        /* renamed from: a */
        public void m6368a() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f5638a) == null || TextUtils.isEmpty(str)) {
                return;
            }
            m6369a("(function() {\n" + this.f5638a + ";\n})();");
        }

        /* renamed from: a */
        protected void m6369a(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING));
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: b */
        protected void m6370b() {
            setWebViewClient(null);
            destroy();
        }

        /* renamed from: b */
        public void m6371b(String str) {
            ReactWebViewManager.dispatchEvent(this, new C1528d(getId(), str));
        }

        /* renamed from: c */
        public void m6372c() {
            if (this.f5639b) {
                m6369a("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})");
            }
        }

        public C1523b getReactWebViewClient() {
            return this.f5640c;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            m6370b();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        public void setInjectedJavaScript(String str) {
            this.f5638a = str;
        }

        public void setMessagingEnabled(boolean z) {
            if (this.f5639b == z) {
                return;
            }
            this.f5639b = z;
            if (!z) {
                removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
            } else {
                addJavascriptInterface(m6367a(this), ReactWebViewManager.BRIDGE_NAME);
                m6372c();
            }
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f5640c = (C1523b) webViewClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$b */
    /* loaded from: classes.dex */
    public static class C1523b extends WebViewClient {

        /* renamed from: a */
        protected boolean f5643a = false;

        /* renamed from: b */
        protected ReadableArray f5644b;

        /* renamed from: c */
        protected List<Pattern> f5645c;

        protected C1523b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m6373a(android.content.Context r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "intent://"
                boolean r0 = r8.startsWith(r0)
                java.lang.String r1 = "ReactNative"
                r2 = 0
                if (r0 == 0) goto L17
                r0 = 1
                android.content.Intent r0 = android.content.Intent.parseUri(r8, r0)     // Catch: java.net.URISyntaxException -> L11
                goto L18
            L11:
                r0 = move-exception
                java.lang.String r3 = "Can't parse intent:// URI"
                p139d.p143b.p148c.p153e.C1700a.m6998a(r1, r3, r0)
            L17:
                r0 = r2
            L18:
                java.lang.String r3 = "android.intent.category.BROWSABLE"
                java.lang.String r4 = "android.intent.action.VIEW"
                if (r0 == 0) goto L48
                r0.addCategory(r3)
                r0.setComponent(r2)
                r0.setSelector(r2)
                android.content.pm.PackageManager r2 = r7.getPackageManager()
                r5 = 65536(0x10000, float:9.1835E-41)
                android.content.pm.ResolveInfo r2 = r2.resolveActivity(r0, r5)
                if (r2 == 0) goto L37
                r7.startActivity(r0)
                goto L51
            L37:
                java.lang.String r2 = "browser_fallback_url"
                java.lang.String r0 = r0.getStringExtra(r2)
                android.content.Intent r2 = new android.content.Intent
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r2.<init>(r4, r0)
                r0 = r2
                goto L51
            L48:
                android.content.Intent r0 = new android.content.Intent
                android.net.Uri r2 = android.net.Uri.parse(r8)
                r0.<init>(r4, r2)
            L51:
                r2 = 268435456(0x10000000, float:2.524355E-29)
                r0.setFlags(r2)     // Catch: android.content.ActivityNotFoundException -> L5d
                r0.addCategory(r3)     // Catch: android.content.ActivityNotFoundException -> L5d
                r7.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L5d
                goto L72
            L5d:
                r7 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "activity not found to handle uri scheme for: "
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                p139d.p143b.p148c.p153e.C1700a.m7007b(r1, r8, r7)
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.webview.ReactWebViewManager.C1523b.m6373a(android.content.Context, java.lang.String):void");
        }

        /* renamed from: a */
        private boolean m6374a(List<Pattern> list, String str) {
            Uri parse = Uri.parse(str);
            String str2 = (parse.getScheme() != null ? parse.getScheme() : "") + "://" + (parse.getAuthority() != null ? parse.getAuthority() : "");
            Iterator<Pattern> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().matcher(str2).matches()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        protected WritableMap m6375a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", (this.f5643a || webView.getProgress() == 100) ? false : true);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        /* renamed from: a */
        public void m6376a(ReadableArray readableArray) {
            this.f5644b = readableArray;
        }

        /* renamed from: a */
        public void m6377a(List<Pattern> list) {
            this.f5645c = list;
        }

        /* renamed from: b */
        protected void m6378b(WebView webView, String str) {
            ReactWebViewManager.dispatchEvent(webView, new C1526b(webView.getId(), m6375a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f5643a) {
                return;
            }
            C1522a c1522a = (C1522a) webView;
            c1522a.m6368a();
            c1522a.m6372c();
            m6378b(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f5643a = false;
            ReactWebViewManager.dispatchEvent(webView, new C1527c(webView.getId(), m6375a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f5643a = true;
            m6378b(webView, str2);
            WritableMap m6375a = m6375a(webView, str2);
            m6375a.putDouble("code", i);
            m6375a.putString("description", str);
            ReactWebViewManager.dispatchEvent(webView, new C1525a(webView.getId(), m6375a));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.equals(ReactWebViewManager.BLANK_URL)) {
                return false;
            }
            ReadableArray readableArray = this.f5644b;
            if (readableArray != null && readableArray.size() > 0) {
                Iterator<Object> it = this.f5644b.toArrayList().iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        break;
                    }
                }
            }
            List<Pattern> list = this.f5645c;
            if (list != null && m6374a(list, str)) {
                return false;
            }
            m6373a(webView.getContext(), str);
            return true;
        }
    }

    public ReactWebViewManager() {
        this.mWebViewConfig = new C1524a(this);
    }

    public ReactWebViewManager(InterfaceC1531d interfaceC1531d) {
        this.mWebViewConfig = interfaceC1531d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void dispatchEvent(WebView webView, AbstractC1330c abstractC1330c) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(abstractC1330c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, WebView webView) {
        webView.setWebViewClient(new C1523b());
    }

    protected C1522a createReactWebViewInstance(C1278N c1278n) {
        return new C1522a(c1278n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(C1278N c1278n) {
        C1522a createReactWebViewInstance = createReactWebViewInstance(c1278n);
        createReactWebViewInstance.setWebChromeClient(new C1529b(this));
        c1278n.addLifecycleEventListener(createReactWebViewInstance);
        this.mWebViewConfig.mo6379a(createReactWebViewInstance);
        WebSettings settings = createReactWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs(createReactWebViewInstance, false);
        setMixedContentMode(createReactWebViewInstance, "never");
        createReactWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setGeolocationEnabled(createReactWebViewInstance, false);
        return createReactWebViewInstance;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return C1104f.m5181a("goBack", 1, "goForward", 2, "reload", 3, "stopLoading", 4, "postMessage", 5, "injectJavaScript", 6);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    protected WebView.PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new C1530c(this);
        }
        return this.mPictureListener;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((ReactWebViewManager) webView);
        C1278N c1278n = (C1278N) webView.getContext();
        C1522a c1522a = (C1522a) webView;
        c1278n.removeLifecycleEventListener(c1522a);
        c1522a.m6370b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    ((C1522a) webView).m6369a("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                ((C1522a) webView).m6369a(readableArray.getString(0));
                return;
            default:
                return;
        }
    }

    @InterfaceC1294a(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @InterfaceC1294a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @InterfaceC1294a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @InterfaceC1294a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @InterfaceC1294a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((C1522a) webView).setInjectedJavaScript(str);
    }

    @InterfaceC1294a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @InterfaceC1294a(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @InterfaceC1294a(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((C1522a) webView).setMessagingEnabled(z);
    }

    @InterfaceC1294a(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        WebSettings settings;
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                settings = webView.getSettings();
                i = 1;
            } else if ("always".equals(str)) {
                settings = webView.getSettings();
                i = 0;
            } else {
                if (!"compatibility".equals(str)) {
                    return;
                }
                settings = webView.getSettings();
                i = 2;
            }
            settings.setMixedContentMode(i);
        }
    }

    @InterfaceC1294a(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        webView.setPictureListener(z ? getPictureListener() : null);
    }

    @InterfaceC1294a(name = "originWhitelist")
    public void setOriginWhitelist(WebView webView, ReadableArray readableArray) {
        C1523b reactWebViewClient = ((C1522a) webView).getReactWebViewClient();
        if (reactWebViewClient == null || readableArray == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < readableArray.size(); i++) {
            linkedList.add(Pattern.compile(readableArray.getString(i)));
        }
        reactWebViewClient.m6377a(linkedList);
    }

    @InterfaceC1294a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @InterfaceC1294a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @InterfaceC1294a(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                if (readableMap.hasKey("baseUrl")) {
                    webView.loadDataWithBaseURL(readableMap.getString("baseUrl"), string, HTML_MIME_TYPE, HTML_ENCODING, null);
                    return;
                } else {
                    webView.loadData(string, HTML_MIME_TYPE, HTML_ENCODING);
                    return;
                }
            }
            if (readableMap.hasKey("uri")) {
                String string2 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !url.equals(string2)) {
                    if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                        byte[] bArr = null;
                        if (readableMap.hasKey("body")) {
                            String string3 = readableMap.getString("body");
                            try {
                                bArr = string3.getBytes(HTML_ENCODING);
                            } catch (UnsupportedEncodingException unused) {
                                bArr = string3.getBytes();
                            }
                        }
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        webView.postUrl(string2, bArr);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                hashMap.put(nextKey, map.getString(nextKey));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map.getString(nextKey));
                            }
                        }
                    }
                    webView.loadUrl(string2, hashMap);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @InterfaceC1294a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @InterfaceC1294a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        C1523b reactWebViewClient = ((C1522a) webView).getReactWebViewClient();
        if (reactWebViewClient == null || readableArray == null) {
            return;
        }
        reactWebViewClient.m6376a(readableArray);
    }

    @InterfaceC1294a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    @InterfaceC1294a(defaultBoolean = true, name = "hardwareAccelerationEnabledExperimental")
    public void sethardwareAccelerationEnabledExperimental(WebView webView, boolean z) {
        if (z) {
            return;
        }
        webView.setLayerType(1, null);
    }
}
