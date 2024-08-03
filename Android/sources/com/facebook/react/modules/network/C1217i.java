package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.modules.network.i */
/* loaded from: classes.dex */
public class C1217i extends CookieHandler {

    /* renamed from: a */
    private static final boolean f4620a;

    /* renamed from: b */
    private final a f4621b = new a();

    /* renamed from: c */
    private final ReactContext f4622c;

    /* renamed from: d */
    private CookieManager f4623d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.network.i$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        private final Handler f4624a;

        public a() {
            this.f4624a = new Handler(Looper.getMainLooper(), new C1215g(this, C1217i.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(21)
        /* renamed from: c */
        public void m5418c() {
            CookieManager m5414c = C1217i.this.m5414c();
            if (m5414c != null) {
                m5414c.flush();
            }
        }

        /* renamed from: a */
        public void m5419a() {
            if (C1217i.f4620a) {
                this.f4624a.sendEmptyMessageDelayed(1, 30000L);
            }
        }

        /* renamed from: b */
        public void m5420b() {
            this.f4624a.removeMessages(1);
            C1217i.this.m5407a(new RunnableC1216h(this));
        }
    }

    static {
        f4620a = Build.VERSION.SDK_INT < 21;
    }

    public C1217i(ReactContext reactContext) {
        this.f4622c = reactContext;
    }

    /* renamed from: a */
    private static void m5405a(Context context) {
        if (f4620a) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5407a(Runnable runnable) {
        new AsyncTaskC1214f(this, this.f4622c, runnable).execute(new Void[0]);
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m5408a(String str, String str2) {
        CookieManager m5414c = m5414c();
        if (m5414c != null) {
            m5414c.setCookie(str, str2, null);
        }
    }

    /* renamed from: a */
    private void m5409a(String str, List<String> list) {
        CookieManager m5414c = m5414c();
        if (m5414c == null) {
            return;
        }
        if (f4620a) {
            m5407a(new RunnableC1213e(this, list, m5414c, str));
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m5408a(str, it.next());
        }
        m5414c.flush();
        this.f4621b.m5419a();
    }

    /* renamed from: a */
    private static boolean m5411a(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    /* renamed from: b */
    private void m5413b(Callback callback) {
        CookieManager m5414c = m5414c();
        if (m5414c != null) {
            m5414c.removeAllCookies(new C1212d(this, callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public CookieManager m5414c() {
        if (this.f4623d == null) {
            m5405a(this.f4622c);
            try {
                this.f4623d = CookieManager.getInstance();
                if (f4620a) {
                    this.f4623d.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null || !message.contains("No WebView installed")) {
                    throw e2;
                }
                return null;
            }
        }
        return this.f4623d;
    }

    /* renamed from: a */
    public void m5415a(Callback callback) {
        if (f4620a) {
            new AsyncTaskC1211c(this, this.f4622c, callback).execute(new Void[0]);
        } else {
            m5413b(callback);
        }
    }

    /* renamed from: b */
    public void m5416b() {
        if (f4620a) {
            CookieManager m5414c = m5414c();
            if (m5414c != null) {
                m5414c.removeExpiredCookie();
            }
            this.f4621b.m5420b();
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        CookieManager m5414c = m5414c();
        if (m5414c == null) {
            return Collections.emptyMap();
        }
        String cookie = m5414c.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && m5411a(key)) {
                m5409a(uri2, entry.getValue());
            }
        }
    }
}
