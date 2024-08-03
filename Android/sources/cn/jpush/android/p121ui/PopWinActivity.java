package cn.jpush.android.p121ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p113k.C0920b;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;
import p031c.p101b.p102a.p115m.C0942e;
import p031c.p101b.p102a.p116n.p117a.C0944a;
import p031c.p101b.p102a.p116n.p117a.C0945b;
import p031c.p101b.p102a.p116n.p117a.C0948e;

/* loaded from: classes.dex */
public class PopWinActivity extends Activity {

    /* renamed from: a */
    public static C0948e f4007a;

    /* renamed from: b */
    private String f4008b;

    /* renamed from: c */
    private WebView f4009c;

    /* renamed from: d */
    private C0899d f4010d = null;

    /* renamed from: a */
    private C0899d m4810a(Intent intent) {
        C0899d m4508b = C0906b.m4508b(this, getIntent());
        if (m4508b != null) {
            return m4508b;
        }
        C0923b.m4644b("PopWinActivity", "parse entity form plugin plateform");
        String uri = intent.getData() != null ? intent.getData().toString() : null;
        if (TextUtils.isEmpty(uri) && intent.getExtras() != null) {
            uri = intent.getExtras().getString("JMessageExtra");
        }
        return C0920b.m4614a(this, uri, "");
    }

    /* renamed from: a */
    private void m4811a() {
        if (getIntent() != null) {
            try {
                this.f4010d = m4810a(getIntent());
                if (this.f4010d != null) {
                    this.f4008b = this.f4010d.f3837c;
                    m4812b();
                    m4814d();
                } else {
                    C0923b.m4654j("PopWinActivity", "Warning，null message entity! Close PopWinActivity!");
                    finish();
                }
                return;
            } catch (Exception e2) {
                C0923b.m4648d("PopWinActivity", "Extra data is not serializable!");
                e2.printStackTrace();
            }
        } else {
            C0923b.m4654j("PopWinActivity", "PopWinActivity get NULL intent!");
        }
        finish();
    }

    /* renamed from: b */
    private void m4812b() {
        int identifier = getResources().getIdentifier("jpush_popwin_layout", "layout", getPackageName());
        if (identifier == 0) {
            C0923b.m4648d("PopWinActivity", "Please add layout resource jpush_popwin_layout.xml to res/layout !");
            finish();
            return;
        }
        setContentView(identifier);
        int identifier2 = getResources().getIdentifier("wvPopwin", "id", getPackageName());
        if (identifier2 == 0) {
            C0923b.m4648d("PopWinActivity", "Please use default code in jpush_popwin_layout.xml!");
            finish();
            return;
        }
        this.f4009c = (WebView) findViewById(identifier2);
        WebView webView = this.f4009c;
        if (webView == null) {
            C0923b.m4648d("PopWinActivity", "Can not get webView in layout file!");
            finish();
            return;
        }
        webView.setScrollbarFadingEnabled(true);
        this.f4009c.setScrollBarStyle(33554432);
        WebSettings settings = this.f4009c.getSettings();
        settings.setDomStorageEnabled(true);
        C0938a.m4711a(settings);
        C0938a.m4712a(this.f4009c);
        settings.setSavePassword(false);
        this.f4009c.setBackgroundColor(0);
        f4007a = new C0948e(this, this.f4010d);
        if (Build.VERSION.SDK_INT >= 17) {
            C0923b.m4644b("PopWinActivity", "Android sdk version greater than or equal to 17, Java—Js interact by annotation!");
            m4813c();
        }
        this.f4009c.setWebChromeClient(new C0944a("JPushWeb", C0945b.class, null, null));
        this.f4009c.setWebViewClient(new C0968f(this.f4010d, this));
        C0945b.m4758a(f4007a);
    }

    /* renamed from: c */
    private void m4813c() {
        try {
            C0942e.m4751a(this.f4009c, "addJavascriptInterface", new Class[]{Object.class, String.class}, new Object[]{f4007a, "JPushWeb"});
        } catch (Exception e2) {
            e2.printStackTrace();
            C0923b.m4646c("PopWinActivity", "addJavascriptInterface failed:" + e2.toString());
        }
    }

    /* renamed from: d */
    private void m4814d() {
        C0899d c0899d = this.f4010d;
        String str = c0899d.f3822P;
        String str2 = c0899d.f3820N;
        C0923b.m4642a("PopWinActivity", "showUrl = " + str2);
        if (TextUtils.isEmpty(str) || !new File(str.replace("file://", "")).exists()) {
            this.f4009c.loadUrl(str2);
        } else {
            this.f4009c.loadUrl(str);
        }
        C0930i.m4674a(this.f4008b, 1000, this);
    }

    /* renamed from: a */
    public void m4815a(String str) {
        if (this.f4010d == null || this.f4009c == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f4010d.f3820N = str;
            Intent intent = new Intent(this, (Class<?>) PushActivity.class);
            intent.putExtra("msg_data", this.f4010d);
            intent.putExtra("from_way", true);
            intent.setFlags(335544320);
            startActivity(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C0930i.m4674a(this.f4008b, 1006, this);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0938a.m4725d(this);
        m4811a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        WebView webView = this.f4009c;
        if (webView != null) {
            webView.removeAllViews();
            this.f4009c.destroy();
            this.f4009c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        WebView webView = this.f4009c;
        if (webView == null || Build.VERSION.SDK_INT < 11) {
            return;
        }
        webView.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        WebView webView = this.f4009c;
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                webView.onResume();
            }
            C0945b.m4758a(f4007a);
        }
    }
}
