package p031c.p032a.p072p.p073a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p032a.p072p.p073a.p074a.C0694d;
import p031c.p032a.p072p.p073a.p074a.C0700j;
import p031c.p032a.p072p.p073a.p074a.C0705o;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p072p.p073a.p080f.p084d.C0744a;
import p031c.p032a.p072p.p073a.p080f.p087g.C0764f;
import p031c.p032a.p072p.p073a.p088g.C0776d;
import p031c.p032a.p072p.p073a.p088g.C0789q;
import p031c.p032a.p092s.C0830f;

/* renamed from: c.a.p.a.b */
/* loaded from: classes.dex */
public final class C0707b {

    /* renamed from: b */
    private static Context f3229b;

    /* renamed from: a */
    private static AtomicBoolean f3228a = new AtomicBoolean(false);

    /* renamed from: c */
    private static boolean f3230c = true;

    /* renamed from: a */
    public static Context m3613a(Context context) {
        if (f3229b == null && context != null) {
            f3229b = context.getApplicationContext();
        }
        return f3229b;
    }

    /* renamed from: a */
    public static void m3614a(Intent intent, Context context) {
        try {
            Uri data = intent.getData();
            C0732b.m3718b("JAnalytics", "intent data=" + data);
            if (data != null && context != null) {
                String path = data.getPath();
                if (TextUtils.isEmpty(path)) {
                    return;
                }
                C0732b.m3718b("JAnalytics", "intent path=" + path);
                if (path.startsWith("/visual_bury")) {
                    C0789q.m3896a(context, data);
                }
            }
        } catch (Throwable th) {
            C0732b.m3725h("JAnalytics", "handleActivityIntent e" + th);
        }
    }

    /* renamed from: a */
    public static boolean m3615a() {
        return f3228a.get();
    }

    /* renamed from: b */
    public static boolean m3616b(Context context) {
        if (f3228a.get()) {
            return true;
        }
        try {
            C0830f.m4057a("ANALYTICS");
            Context m3613a = m3613a(context);
            if (m3613a == null) {
                C0732b.m3723f("JAnalytics", "unexcepted - context was null");
                return false;
            }
            C0789q.m3899c();
            C0700j.m3585b().m3595a(m3613a);
            C0705o.m3605b().m3607a(m3613a);
            C0694d.m3569b().m3570a(m3613a);
            C0830f.m4066c(m3613a);
            C0744a.m3764a().m3768a(f3229b);
            C0776d.m3862a(m3613a, false);
            if ((m3613a instanceof Application) && Build.VERSION.SDK_INT >= 14) {
                ((Application) m3613a).registerActivityLifecycleCallbacks(new C0764f());
                f3230c = false;
            }
            f3228a.set(true);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
