package cn.jpush.android.p121ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import p031c.p101b.p102a.p106d.C0899d;
import p031c.p101b.p102a.p110h.C0906b;
import p031c.p101b.p102a.p113k.C0920b;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0930i;
import p031c.p101b.p102a.p115m.C0938a;

/* loaded from: classes.dex */
public class PushActivity extends Activity {

    /* renamed from: c */
    private String f4013c;

    /* renamed from: e */
    private Handler f4015e;

    /* renamed from: a */
    private int f4011a = 0;

    /* renamed from: b */
    private boolean f4012b = false;

    /* renamed from: d */
    private FullScreenView f4014d = null;

    /* renamed from: cn.jpush.android.ui.PushActivity$a */
    /* loaded from: classes.dex */
    private static class HandlerC0962a extends Handler {

        /* renamed from: a */
        private final WeakReference<PushActivity> f4016a;

        public HandlerC0962a(PushActivity pushActivity) {
            this.f4016a = new WeakReference<>(pushActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C0899d c0899d = (C0899d) message.obj;
            PushActivity pushActivity = this.f4016a.get();
            if (pushActivity == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                pushActivity.setRequestedOrientation(1);
                pushActivity.m4820b(c0899d);
            } else {
                if (i != 2) {
                    return;
                }
                pushActivity.m4823b();
            }
        }
    }

    /* renamed from: a */
    private C0899d m4816a(Intent intent) {
        C0899d m4508b = C0906b.m4508b(this, getIntent());
        if (m4508b != null) {
            return m4508b;
        }
        C0923b.m4644b("PushActivity", "parse entity form plugin plateform");
        String uri = intent.getData() != null ? intent.getData().toString() : null;
        if (TextUtils.isEmpty(uri) && intent.getExtras() != null) {
            uri = intent.getExtras().getString("JMessageExtra");
        }
        return C0920b.m4614a(this, uri, "");
    }

    /* renamed from: a */
    private void m4818a(C0899d c0899d) {
        if (c0899d == null) {
            C0923b.m4654j("PushActivity", "Null message entity! Close PushActivity!");
        } else {
            if (c0899d.f3854p == 0) {
                Message message = new Message();
                message.what = 1;
                message.obj = c0899d;
                this.f4015e.sendMessageDelayed(message, 500L);
                return;
            }
            C0923b.m4653i("PushActivity", "Invalid msg type to show - " + c0899d.f3854p);
            C0906b.m4511b(this, c0899d);
        }
        finish();
    }

    /* renamed from: b */
    public void m4820b(C0899d c0899d) {
        String str;
        C0923b.m4649e("PushActivity", "Action: processShow");
        if (c0899d != null) {
            if (c0899d.f3825S == 0) {
                this.f4011a = c0899d.f3823Q;
                int identifier = getResources().getIdentifier("jpush_webview_layout", "layout", getPackageName());
                if (identifier == 0) {
                    str = "Please add layout resource jpush_webview_layout.xml to res/layout !";
                } else {
                    setContentView(identifier);
                    String str2 = c0899d.f3820N;
                    if (C0938a.m4718a(str2)) {
                        String str3 = c0899d.f3822P;
                        if (c0899d.f3855q) {
                            int identifier2 = getResources().getIdentifier("actionbarLayoutId", "id", getPackageName());
                            if (identifier2 == 0) {
                                str = "Please use default code in jpush_webview_layout.xml!";
                            } else {
                                this.f4014d = (FullScreenView) findViewById(identifier2);
                                this.f4014d.m4803a(this, c0899d);
                                if (TextUtils.isEmpty(str3) || !new File(str3.replace("file://", "")).exists() || this.f4012b) {
                                    this.f4014d.m4804a(str2);
                                } else {
                                    this.f4014d.m4804a(str3);
                                }
                            }
                        }
                        if (!this.f4012b) {
                            C0930i.m4674a(this.f4013c, 1000, this);
                        }
                    } else {
                        C0906b.m4511b(this, c0899d);
                    }
                }
                C0923b.m4648d("PushActivity", str);
            }
            int i = c0899d.f3824R;
            return;
        }
        C0923b.m4654j("PushActivity", "Null message entity! Close PushActivity!");
        finish();
    }

    /* renamed from: c */
    private void m4821c() {
        if (getIntent() != null) {
            try {
                this.f4012b = getIntent().getBooleanExtra("from_way", false);
                C0899d m4816a = m4816a(getIntent());
                if (m4816a != null) {
                    this.f4013c = m4816a.f3837c;
                    m4818a(m4816a);
                } else {
                    C0923b.m4654j("PushActivity", "Warning，null message entity! Close PushActivity!");
                    finish();
                }
                return;
            } catch (Exception e2) {
                C0923b.m4648d("PushActivity", "Extra data is not serializable!");
                e2.printStackTrace();
            }
        } else {
            C0923b.m4654j("PushActivity", "PushActivity get NULL intent!");
        }
        finish();
    }

    /* renamed from: a */
    public void m4822a() {
        runOnUiThread(new RunnableC0965c(this));
    }

    /* renamed from: b */
    public void m4823b() {
        finish();
        if (1 == this.f4011a) {
            try {
                ActivityManager activityManager = (ActivityManager) getSystemService("activity");
                ComponentName componentName = activityManager.getRunningTasks(1).get(0).baseActivity;
                ComponentName componentName2 = activityManager.getRunningTasks(1).get(0).topActivity;
                C0923b.m4642a("PushActivity", "baseActivity  = " + componentName.toString());
                C0923b.m4642a("PushActivity", "topActivity  = " + componentName2.toString());
                if (componentName == null || componentName2 == null || !componentName2.toString().equals(componentName.toString())) {
                    return;
                }
                C0938a.m4727e(this);
            } catch (Exception unused) {
                C0923b.m4654j("PushActivity", "Get running tasks failed.");
                C0938a.m4727e(this);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        FullScreenView fullScreenView = this.f4014d;
        if (fullScreenView != null && fullScreenView.m4808e()) {
            this.f4014d.m4809f();
        } else {
            C0930i.m4674a(this.f4013c, 1006, this);
            m4823b();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0938a.m4725d(this);
        this.f4015e = new HandlerC0962a(this);
        m4821c();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        FullScreenView fullScreenView = this.f4014d;
        if (fullScreenView != null) {
            fullScreenView.m4802a();
        }
        if (this.f4015e.hasMessages(2)) {
            this.f4015e.removeMessages(2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m4821c();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        FullScreenView fullScreenView = this.f4014d;
        if (fullScreenView != null) {
            fullScreenView.m4805b();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FullScreenView fullScreenView = this.f4014d;
        if (fullScreenView != null) {
            fullScreenView.m4806c();
        }
    }
}
