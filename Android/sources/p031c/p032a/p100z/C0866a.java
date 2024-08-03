package p031c.p032a.p100z;

/* renamed from: c.a.z.a */
/* loaded from: classes.dex */
public final class C0866a<T> {

    /* renamed from: a */
    public static String f3637a = "cn.jiguang.sdk.share.profile";

    /* renamed from: b */
    public static String f3638b = "cn.jpush.preferences.v2";

    /* renamed from: c */
    String f3639c;

    /* renamed from: d */
    String f3640d;

    /* renamed from: e */
    T f3641e;

    /* renamed from: f */
    boolean f3642f;

    private C0866a(String str, String str2, T t) {
        this.f3639c = str;
        this.f3640d = str2;
        if (t == null) {
            throw new IllegalArgumentException("default value can not be null");
        }
        this.f3641e = t;
    }

    /* renamed from: a */
    public static C0866a<String> m4199a() {
        return new C0866a<>("cn.jpush.android.user.profile", "devcie_id_generated", "");
    }

    /* renamed from: a */
    public static C0866a<String> m4200a(boolean z) {
        C0866a<String> c0866a = new C0866a<>("cn.jiguang.sdk.address", "default_https_report", "");
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: b */
    public static C0866a<Boolean> m4201b() {
        return new C0866a<>("cn.jpush.android.user.profile", "upload_crash", true);
    }

    /* renamed from: c */
    public static C0866a<Long> m4202c() {
        C0866a<Long> c0866a = new C0866a<>("cn.jiguang.sdk.user.profile", "key_uid", 0L);
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: d */
    public static C0866a<String> m4203d() {
        C0866a<String> c0866a = new C0866a<>("cn.jiguang.sdk.user.profile", "key_rid", "");
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: e */
    public static C0866a<String> m4204e() {
        C0866a<String> c0866a = new C0866a<>("cn.jiguang.sdk.user.profile", "key_pwd", "");
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: f */
    public static C0866a<Integer> m4205f() {
        C0866a<Integer> c0866a = new C0866a<>("cn.jiguang.sdk.user.profile", "idc", -1);
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: g */
    public static C0866a<Long> m4206g() {
        return new C0866a<>("cn.jiguang.sdk.user.profile", "login_local_time", -1L);
    }

    /* renamed from: h */
    public static C0866a<Long> m4207h() {
        return new C0866a<>("cn.jiguang.sdk.user.profile", "login_server_time", -1L);
    }

    /* renamed from: i */
    public static C0866a<String> m4208i() {
        C0866a<String> c0866a = new C0866a<>(f3637a, "key_share_process_uuid", "");
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: j */
    public static C0866a<Long> m4209j() {
        C0866a<Long> c0866a = new C0866a<>(f3637a, "key_share_process_uuid_creattime", -1L);
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: k */
    public static C0866a<Integer> m4210k() {
        C0866a<Integer> c0866a = new C0866a<>(f3637a, "sp_state", -1);
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: l */
    public static C0866a<String> m4211l() {
        return new C0866a<>("cn.jiguang.sdk.user.set.profile", "option_channel", "");
    }

    /* renamed from: m */
    public static C0866a<String> m4212m() {
        return new C0866a<>("cn.jiguang.sdk.user.set.profile", "analytics_account_id", "");
    }

    /* renamed from: n */
    public static C0866a<Long> m4213n() {
        return new C0866a<>("Push_Page_Config", "css", 0L);
    }

    /* renamed from: o */
    public static C0866a<Long> m4214o() {
        return new C0866a<>("Push_Page_Config", "cse", 0L);
    }

    /* renamed from: p */
    public static C0866a<Long> m4215p() {
        return new C0866a<>("Push_Page_Config", "last_pause", -1L);
    }

    /* renamed from: q */
    public static C0866a<String> m4216q() {
        return new C0866a<>("Push_Page_Config", "session_id", "");
    }

    /* renamed from: r */
    public static C0866a<String> m4217r() {
        return new C0866a<>("cn.jiguang.sdk.report", "report_urls", "");
    }

    /* renamed from: s */
    public static C0866a<String> m4218s() {
        return new C0866a<>("cn.jiguang.sdk.report", "report_sis_urls", "");
    }

    /* renamed from: t */
    public static C0866a<Long> m4219t() {
        return new C0866a<>("cn.jiguang.sdk.report", "last_update_report_urls", 0L);
    }

    /* renamed from: u */
    public static C0866a<Long> m4220u() {
        return new C0866a<>("cn.jiguang.sdk.report", "report_urls_ttl_millis", 3600000L);
    }

    /* renamed from: v */
    public static C0866a<String> m4221v() {
        C0866a<String> c0866a = new C0866a<>(f3638b, "sdk_version", "");
        c0866a.f3642f = true;
        return c0866a;
    }

    /* renamed from: w */
    public static C0866a<Long> m4222w() {
        return new C0866a<>(f3638b, "first_init", 0L);
    }

    /* renamed from: x */
    public static C0866a<Long> m4223x() {
        return new C0866a<>(f3638b, "lbs_delay", 0L);
    }

    /* renamed from: a */
    public final C0866a<T> m4224a(T t) {
        this.f3641e = t;
        return this;
    }
}
