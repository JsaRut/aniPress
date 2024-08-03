package p031c.p101b.p102a.p116n.p117a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import cn.jpush.android.p121ui.PopWinActivity;
import cn.jpush.android.p121ui.PushActivity;
import java.lang.ref.WeakReference;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;

/* renamed from: c.b.a.n.a.e */
/* loaded from: classes.dex */
public class C0948e {

    /* renamed from: a */
    private final WeakReference<Activity> f3990a;

    /* renamed from: b */
    private final C0899d f3991b;

    public C0948e(Context context, C0899d c0899d) {
        this.f3990a = new WeakReference<>((Activity) context);
        this.f3991b = c0899d;
    }

    @JavascriptInterface
    private void userClick(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            C0923b.m4646c("WebViewHelper", "Invalid actionId from Web - " + str);
            i = 1100;
        }
        C0930i.m4674a(this.f3991b.f3837c, i, this.f3990a.get());
    }

    @JavascriptInterface
    public void click(String str, String str2, String str3) {
        boolean z;
        if (this.f3990a.get() != null) {
            C0923b.m4642a("WebViewHelper", "Web callback:click - actionId:" + str + ", shouldClose:" + str2 + ", shouldCancelNotification:" + str3);
            userClick(str);
            boolean z2 = false;
            try {
                z = Boolean.parseBoolean(str2);
                try {
                    z2 = Boolean.parseBoolean(str3);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                z = false;
            }
            if (z2) {
                C0906b.m4511b(this.f3990a.get(), this.f3991b);
            }
            if (z) {
                this.f3990a.get().finish();
            }
        }
    }

    @JavascriptInterface
    public void close() {
        if (this.f3990a.get() != null) {
            C0923b.m4642a("WebViewHelper", "Web callback:close");
            this.f3990a.get().finish();
        }
    }

    @JavascriptInterface
    public void createShortcut(String str, String str2, String str3) {
    }

    @JavascriptInterface
    public void download(String str) {
        if (this.f3990a.get() == null) {
            return;
        }
        C0923b.m4642a("WebViewHelper", "Web callback:download - " + str);
    }

    @JavascriptInterface
    public void download(String str, String str2) {
        if (this.f3990a.get() == null) {
            return;
        }
        userClick(str);
        download(str2);
        C0906b.m4511b(this.f3990a.get(), this.f3991b);
        this.f3990a.get().finish();
    }

    @JavascriptInterface
    public void download(String str, String str2, String str3) {
        C0923b.m4651g("WebViewHelper", "msgType from web: " + str3);
        download(str, str2);
    }

    @JavascriptInterface
    public void executeMsgMessage(String str) {
    }

    @JavascriptInterface
    public void showTitleBar() {
        if (this.f3990a.get() == null || !(this.f3990a.get() instanceof PushActivity)) {
            return;
        }
        ((PushActivity) this.f3990a.get()).m4822a();
    }

    @JavascriptInterface
    public void showToast(String str) {
        if (this.f3990a.get() != null) {
            C0923b.m4642a("WebViewHelper", "Web callback:showToast - " + str);
            Toast.makeText(this.f3990a.get(), str, 0).show();
        }
    }

    @JavascriptInterface
    public void startActivityByIntent(String str, String str2) {
        Activity activity = this.f3990a.get();
        if (activity == null) {
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.addCategory(activity.getPackageName());
            intent.putExtra("cn.jpush.android.EXTRA", str2);
            intent.setFlags(268435456);
            activity.startActivity(intent);
        } catch (Exception unused) {
            C0923b.m4648d("WebViewHelper", "Unhandle intent : " + str);
        }
    }

    @JavascriptInterface
    public void startActivityByName(String str, String str2) {
        C0923b.m4642a("WebViewHelper", "activityName = " + str);
        if (TextUtils.isEmpty(str)) {
            C0923b.m4648d("WebViewHelper", "The activity name is null or empty, Give up..");
        }
        Activity activity = this.f3990a.get();
        if (activity == null) {
            return;
        }
        try {
            Intent intent = new Intent(activity, Class.forName(str));
            intent.putExtra("cn.jpush.android.ACTIVITY_PARAM", str2);
            intent.setFlags(268435456);
            activity.startActivity(intent);
        } catch (Exception unused) {
            C0923b.m4648d("WebViewHelper", "The activity name is invalid, Give up..");
        }
    }

    @JavascriptInterface
    public void startMainActivity(String str) {
        Activity activity = this.f3990a.get();
        if (activity == null) {
            return;
        }
        try {
            activity.finish();
            C0938a.m4722b(activity, str);
        } catch (Exception unused) {
            C0923b.m4648d("WebViewHelper", "startMainActivity failed");
        }
    }

    @JavascriptInterface
    public void startPushActivity(String str) {
        if (this.f3990a.get() == null || !(this.f3990a.get() instanceof PopWinActivity)) {
            return;
        }
        ((PopWinActivity) this.f3990a.get()).m4815a(str);
    }

    @JavascriptInterface
    public void triggerNativeAction(String str) {
        if (this.f3990a.get() == null) {
        }
    }
}
