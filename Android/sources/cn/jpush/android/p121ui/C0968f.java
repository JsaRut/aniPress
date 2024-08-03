package cn.jpush.android.p121ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;

/* renamed from: cn.jpush.android.ui.f */
/* loaded from: classes.dex */
public class C0968f extends WebViewClient {

    /* renamed from: a */
    private final C0899d f4024a;

    /* renamed from: b */
    private final Context f4025b;

    /* renamed from: c */
    private boolean f4026c = false;

    public C0968f(C0899d c0899d, Context context) {
        this.f4024a = c0899d;
        this.f4025b = context;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f4026c) {
            sslErrorHandler.proceed();
            return;
        }
        Context context = this.f4025b;
        if (context == null || context.getClass().isAssignableFrom(Activity.class)) {
            sslErrorHandler.cancel();
            return;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f4025b);
            builder.setTitle("提示");
            builder.setMessage("SSL 证书异常，是否继续加载？");
            builder.setNegativeButton("否", new DialogInterfaceOnClickListenerC0966d(this, sslErrorHandler));
            builder.setPositiveButton("是", new DialogInterfaceOnClickListenerC0967e(this, sslErrorHandler));
            builder.setCancelable(false);
            builder.create().show();
        } catch (Throwable th) {
            sslErrorHandler.cancel();
            C0923b.m4653i("JPushWebViewClient", "show dialog error:" + th);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        StringBuilder sb;
        Context context = webView.getContext();
        C0923b.m4649e("JPushWebViewClient", "Url vaule is :" + str);
        try {
            webView.getSettings().setSavePassword(false);
            C0938a.m4712a(webView);
            String format = String.format(Locale.ENGLISH, "{\"url\":\"%s\"}", str);
            if (str.endsWith(".mp3")) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse(str), "audio/*");
                webView.getContext().startActivity(intent);
                return true;
            }
            if (!str.endsWith(".mp4") && !str.endsWith(".3gp")) {
                if (str.endsWith(".apk")) {
                    webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
                if (str.startsWith("http")) {
                    C0930i.m4675a(this.f4024a.f3837c, 1016, format, C0869a.f3646a);
                } else if (str.startsWith("mailto")) {
                    if (str.lastIndexOf("direct=") < 0 && !str.startsWith("mailto")) {
                        if (str.indexOf("?") > 0) {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("&direct=false");
                        } else {
                            sb = new StringBuilder();
                            sb.append(str);
                            sb.append("?direct=false");
                        }
                        str = sb.toString();
                        str.lastIndexOf("direct=");
                    }
                    int indexOf = str.indexOf("?");
                    String substring = str.substring(0, indexOf);
                    String substring2 = str.substring(indexOf);
                    C0923b.m4651g("JPushWebViewClient", "Uri: " + substring);
                    C0923b.m4651g("JPushWebViewClient", "QueryString: " + substring2);
                    Intent intent2 = null;
                    if (substring.startsWith("mailto")) {
                        String[] split = substring.split(":");
                        if (split.length == 2) {
                            int indexOf2 = substring2.indexOf("title=") + 6;
                            int indexOf3 = substring2.indexOf("&content=");
                            String substring3 = substring2.substring(indexOf2, indexOf3);
                            String substring4 = substring2.substring(indexOf3 + 9);
                            String[] strArr = {split[1]};
                            Intent intent3 = new Intent("android.intent.action.SEND");
                            intent3.setType("plain/text");
                            intent3.putExtra("android.intent.extra.EMAIL", strArr);
                            intent3.putExtra("android.intent.extra.SUBJECT", substring3);
                            intent3.putExtra("android.intent.extra.TEXT", substring4);
                            intent2 = intent3;
                        }
                    }
                    if (intent2 != null) {
                        context.startActivity(intent2);
                    }
                    C0930i.m4675a(this.f4024a.f3837c, 1016, format, C0869a.f3646a);
                    return true;
                }
                return false;
            }
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setDataAndType(Uri.parse(str), "video/*");
            webView.getContext().startActivity(intent4);
            return true;
        } catch (Exception unused) {
            C0923b.m4646c("JPushWebViewClient", "Invalid url");
            return true;
        }
    }
}
