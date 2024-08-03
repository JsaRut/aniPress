package p031c.p032a.p072p.p073a.p089h;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import org.json.JSONObject;
import p031c.p032a.p072p.p073a.p074a.C0693c;
import p031c.p032a.p072p.p073a.p079e.C0729a;
import p031c.p032a.p072p.p073a.p080f.C0730a;
import p031c.p032a.p072p.p073a.p080f.C0743d;
import p031c.p032a.p072p.p073a.p080f.C0770h;
import p031c.p032a.p072p.p073a.p080f.C0771i;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p088g.C0789q;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.h.a */
/* loaded from: classes.dex */
public class ActivityC0790a extends Activity {

    /* renamed from: a */
    private WebView f3462a;

    /* renamed from: b */
    private ProgressBar f3463b;

    /* renamed from: c */
    private String f3464c;

    /* renamed from: a */
    public static void m3901a(View view) {
        try {
            C0804o.m3916a(true);
            C0804o.m3920c();
            Activity m3844d = C0770h.m3844d(view);
            JSONObject m3761a = C0743d.m3761a(view, "http://localhost/img");
            C0732b.m3718b("BuryWebActivity_xxx", "bury action json = " + C0729a.m3700a(m3761a));
            C0830f.m4056a(new RunnableC0795f(m3761a, view, m3844d), new int[0]);
        } catch (Throwable th) {
            C0732b.m3725h("BuryWebActivity_xxx", "start e:" + th);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (this.f3462a.canGoBack()) {
                this.f3462a.goBack();
            } else {
                super.onBackPressed();
            }
        } catch (Throwable unused) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (C0789q.m3898b() && C0804o.m3917a()) {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.f3463b = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
                this.f3463b.setIndeterminate(false);
                this.f3463b.setProgressDrawable(new ClipDrawable(new ColorDrawable(Color.parseColor("#1b75bb")), 3, 1));
                linearLayout.addView(this.f3463b, new LinearLayout.LayoutParams(-1, C0770h.m3841b(this, 3.0f)));
                this.f3462a = new WebView(this);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                if (Build.VERSION.SDK_INT >= 11) {
                    this.f3462a.setLayerType(1, null);
                }
                linearLayout.addView(this.f3462a, layoutParams);
                if (Build.VERSION.SDK_INT >= 11) {
                    linearLayout.setLayerType(2, null);
                }
                setContentView(linearLayout);
                this.f3462a.setScrollbarFadingEnabled(true);
                this.f3462a.setScrollBarStyle(33554432);
                C0771i.m3845a(this.f3462a);
                this.f3462a.setWebChromeClient(new C0791b(this));
                this.f3462a.setWebViewClient(new C0793d(this));
                C0771i.m3846a(this.f3462a, "buryInterface", new C0794e(this, this.f3462a));
                this.f3464c = getIntent().getStringExtra("data");
                String m3567a = C0693c.m3567a("go_2_bury");
                this.f3462a.loadUrl(m3567a);
                C0732b.m3718b("BuryWebActivity_xxx", "load url=" + m3567a);
                return;
            }
            C0732b.m3724g("Visual Track", "please scan QRCode then circle a view to enter this page");
            finish();
        } catch (Throwable th) {
            C0732b.m3725h("BuryWebActivity_xxx", "onCreate e:" + th);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        try {
            if (Build.VERSION.SDK_INT < 14 || !C0730a.m3703a().m3710b()) {
                return;
            }
            C0804o.m3916a(false);
            C0804o.m3915a(this, true, false);
        } catch (Throwable th) {
            C0732b.m3725h("BuryWebActivity_xxx", "onStop e:" + th);
        }
    }
}
