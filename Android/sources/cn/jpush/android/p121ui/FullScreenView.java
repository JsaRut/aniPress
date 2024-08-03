package cn.jpush.android.p121ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p115m.C0938a;
import p031c.p101b.p102a.p115m.C0942e;
import p031c.p101b.p102a.p116n.p117a.C0944a;
import p031c.p101b.p102a.p116n.p117a.C0945b;
import p031c.p101b.p102a.p116n.p117a.C0948e;

/* loaded from: classes.dex */
public class FullScreenView extends LinearLayout {

    /* renamed from: a */
    public static C0948e f3999a;

    /* renamed from: b */
    private final Context f4000b;

    /* renamed from: c */
    private WebView f4001c;

    /* renamed from: d */
    private RelativeLayout f4002d;

    /* renamed from: e */
    private TextView f4003e;

    /* renamed from: f */
    private ImageButton f4004f;

    /* renamed from: g */
    private ProgressBar f4005g;

    /* renamed from: h */
    private View.OnClickListener f4006h;

    public FullScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4006h = new ViewOnClickListenerC0963a(this);
        this.f4000b = context;
    }

    /* renamed from: g */
    private void m4800g() {
        try {
            WindowManager.LayoutParams attributes = ((Activity) this.f4000b).getWindow().getAttributes();
            attributes.flags &= -1025;
            ((Activity) this.f4000b).getWindow().setAttributes(attributes);
            ((Activity) this.f4000b).getWindow().clearFlags(512);
        } catch (Exception unused) {
            C0923b.m4653i("FullScreenView", "quitFullScreen errno");
        }
    }

    /* renamed from: h */
    private void m4801h() {
        try {
            C0942e.m4751a(this.f4001c, "addJavascriptInterface", new Class[]{Object.class, String.class}, new Object[]{f3999a, "JPushWeb"});
        } catch (Exception e2) {
            e2.printStackTrace();
            C0923b.m4646c("FullScreenView", "addJavascriptInterface failed:" + e2.toString());
        }
    }

    /* renamed from: a */
    public void m4802a() {
        removeAllViews();
        WebView webView = this.f4001c;
        if (webView != null) {
            webView.removeAllViews();
            this.f4001c.clearSslPreferences();
            this.f4001c.destroy();
            this.f4001c = null;
        }
    }

    /* renamed from: a */
    public void m4803a(Context context, C0899d c0899d) {
        String str = c0899d.f3821O;
        setFocusable(true);
        this.f4001c = (WebView) findViewById(getResources().getIdentifier("fullWebView", "id", context.getPackageName()));
        this.f4002d = (RelativeLayout) findViewById(getResources().getIdentifier("rlRichpushTitleBar", "id", context.getPackageName()));
        this.f4003e = (TextView) findViewById(getResources().getIdentifier("tvRichpushTitle", "id", context.getPackageName()));
        this.f4004f = (ImageButton) findViewById(getResources().getIdentifier("imgRichpushBtnBack", "id", context.getPackageName()));
        this.f4005g = (ProgressBar) findViewById(getResources().getIdentifier("pushPrograssBar", "id", context.getPackageName()));
        if (this.f4001c == null || this.f4002d == null || this.f4003e == null || this.f4004f == null) {
            C0923b.m4648d("FullScreenView", "Please use default code in jpush_webview_layout.xml!");
            ((Activity) this.f4000b).finish();
        }
        if (1 == c0899d.f3824R) {
            this.f4002d.setVisibility(8);
            ((Activity) context).getWindow().setFlags(1024, 1024);
        } else {
            this.f4003e.setText(str);
            this.f4004f.setOnClickListener(this.f4006h);
        }
        this.f4001c.setScrollbarFadingEnabled(true);
        this.f4001c.setScrollBarStyle(33554432);
        WebSettings settings = this.f4001c.getSettings();
        C0938a.m4711a(settings);
        C0938a.m4712a(this.f4001c);
        settings.setSavePassword(false);
        f3999a = new C0948e(context, c0899d);
        if (Build.VERSION.SDK_INT >= 17) {
            C0923b.m4644b("FullScreenView", "Android sdk version greater than or equal to 17, Java—Js interact by annotation!");
            m4801h();
        }
        this.f4001c.setWebChromeClient(new C0944a("JPushWeb", C0945b.class, this.f4005g, this.f4003e));
        this.f4001c.setWebViewClient(new C0968f(c0899d, context));
        C0945b.m4758a(f3999a);
    }

    /* renamed from: a */
    public void m4804a(String str) {
        if (this.f4001c != null) {
            C0923b.m4642a("FullScreenView", "loadUrl:" + str);
            this.f4001c.loadUrl(str);
        }
    }

    /* renamed from: b */
    public void m4805b() {
        WebView webView = this.f4001c;
        if (webView == null || Build.VERSION.SDK_INT < 11) {
            return;
        }
        webView.onPause();
    }

    /* renamed from: c */
    public void m4806c() {
        WebView webView = this.f4001c;
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                webView.onResume();
            }
            C0945b.m4758a(f3999a);
        }
    }

    /* renamed from: d */
    public void m4807d() {
        RelativeLayout relativeLayout = this.f4002d;
        if (relativeLayout == null || relativeLayout.getVisibility() != 8) {
            return;
        }
        this.f4002d.setVisibility(0);
        m4800g();
        this.f4004f.setOnClickListener(this.f4006h);
        WebView webView = this.f4001c;
        if (webView != null) {
            webView.postDelayed(new RunnableC0964b(this), 1000L);
        }
    }

    /* renamed from: e */
    public boolean m4808e() {
        WebView webView = this.f4001c;
        if (webView != null) {
            return webView.canGoBack();
        }
        return false;
    }

    /* renamed from: f */
    public void m4809f() {
        WebView webView = this.f4001c;
        if (webView != null) {
            webView.goBack();
        }
    }
}
