package p031c.p032a.p059c;

import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.c.c */
/* loaded from: classes.dex */
public final class C0592c {

    /* renamed from: a */
    private static volatile C0592c f2826a;

    /* renamed from: b */
    private static final Object f2827b = new Object();

    /* renamed from: c */
    private boolean f2828c;

    /* renamed from: d */
    private boolean f2829d;

    /* renamed from: e */
    private boolean f2830e;

    /* renamed from: f */
    private boolean f2831f;

    /* renamed from: g */
    private boolean f2832g;

    /* renamed from: h */
    private boolean f2833h;

    /* renamed from: i */
    private boolean f2834i;

    /* renamed from: j */
    private boolean f2835j;

    private C0592c() {
        this.f2828c = false;
        this.f2829d = false;
        this.f2830e = false;
        this.f2831f = false;
        this.f2832g = false;
        this.f2833h = false;
        this.f2834i = false;
        this.f2835j = false;
        this.f2828c = m3026e();
        this.f2829d = m3027f();
        this.f2830e = m3028g();
        this.f2831f = m3029h();
        this.f2832g = m3030i();
        this.f2833h = m3032k();
        this.f2834i = m3031j();
        this.f2835j = m3033l();
    }

    /* renamed from: a */
    public static C0592c m3025a() {
        if (f2826a == null) {
            synchronized (f2827b) {
                if (f2826a == null) {
                    f2826a = new C0592c();
                }
            }
        }
        return f2826a;
    }

    /* renamed from: e */
    private static boolean m3026e() {
        boolean z;
        try {
            Class.forName("c.b.a.b.f");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJpushSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJpushSDK:" + z);
        return z;
    }

    /* renamed from: f */
    private static boolean m3027f() {
        boolean z;
        try {
            Class.forName("cn.jpush.im.android.api.JMessageClient");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJMessageSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJMessageSDK:" + z);
        return z;
    }

    /* renamed from: g */
    private static boolean m3028g() {
        boolean z;
        try {
            Class.forName("c.a.p.a.b.i");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJanalyticsSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJanalyticsSDK:" + z);
        return z;
    }

    /* renamed from: h */
    private static boolean m3029h() {
        boolean z;
        try {
            Class.forName("cn.jiguang.share.android.api.JShareInterface");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJshareSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJshareSDK:" + z);
        return z;
    }

    /* renamed from: i */
    private static boolean m3030i() {
        boolean z;
        try {
            Class.forName("cn.jiguang.adsdk.api.JSSPInterface");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJSspSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJSspSDK:" + z);
        return z;
    }

    /* renamed from: j */
    private static boolean m3031j() {
        boolean z;
        try {
            Class.forName("c.a.B.a");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJCommonSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJCommonSDK:" + z);
        return z;
    }

    /* renamed from: k */
    private static boolean m3032k() {
        boolean z;
        try {
            Class.forName("cn.jiguang.verifysdk.api.JVerificationInterface");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJVerificationSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJVerificationSDK:" + z);
        return z;
    }

    /* renamed from: l */
    private static boolean m3033l() {
        boolean z;
        try {
            Class.forName("cn.jiguang.jmlinksdk.core.JMlinkInterfaceImpl");
            z = true;
        } catch (ClassNotFoundException e2) {
            C0601d.m3070a("JClientsHelper", "isPluginJMLinkSDK:" + e2.getMessage());
            z = false;
        }
        C0601d.m3070a("JClientsHelper", "isPluginJMLinkSDK:" + z);
        return z;
    }

    /* renamed from: b */
    public final boolean m3034b() {
        return this.f2829d;
    }

    /* renamed from: c */
    public final boolean m3035c() {
        return this.f2828c;
    }

    /* renamed from: d */
    public final boolean m3036d() {
        return this.f2829d || this.f2828c;
    }
}
