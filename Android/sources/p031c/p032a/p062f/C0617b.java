package p031c.p032a.p062f;

/* renamed from: c.a.f.b */
/* loaded from: classes.dex */
public final class C0617b<T> {

    /* renamed from: a */
    public static String f2903a = "cn.jpush.preferences.v2";

    /* renamed from: b */
    String f2904b;

    /* renamed from: c */
    String f2905c;

    /* renamed from: d */
    T f2906d;

    /* renamed from: e */
    boolean f2907e;

    public C0617b(String str, String str2, T t) {
        this.f2904b = str;
        this.f2905c = str2;
        if (t == null) {
            throw new IllegalArgumentException("default value can not be null");
        }
        this.f2906d = t;
    }

    /* renamed from: a */
    public static C0617b<Boolean> m3153a() {
        return new C0617b<>("cn.jpush.android.user.profile", "is_tcp_close", false);
    }

    /* renamed from: a */
    public static C0617b<String> m3154a(String str) {
        return new C0617b<>("cn.jpush.android.user.profile", "sdk_version_" + str, "");
    }

    /* renamed from: a */
    public static C0617b<String> m3155a(boolean z) {
        StringBuilder sb = new StringBuilder("last_good_sis_address");
        sb.append(z ? "_V4" : "_V6");
        return new C0617b<>("cn.jiguang.sdk.address", sb.toString(), "");
    }

    /* renamed from: b */
    public static C0617b<Integer> m3156b() {
        C0617b<Integer> c0617b = new C0617b<>("cn.jpush.android.user.profile", "jpush_register_code", -1);
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: b */
    public static C0617b<String> m3157b(String str) {
        return new C0617b<>("cn.jiguang.sdk.address", "dns_" + str, "");
    }

    /* renamed from: b */
    public static C0617b<String> m3158b(boolean z) {
        StringBuilder sb = new StringBuilder("last_good_conn");
        sb.append(z ? "_V4" : "_V6");
        return new C0617b<>("cn.jiguang.sdk.address", sb.toString(), "");
    }

    /* renamed from: c */
    public static C0617b<Integer> m3159c() {
        C0617b<Integer> c0617b = new C0617b<>("cn.jiguang.sdk.user.profile", "idc", -1);
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: c */
    public static C0617b<Long> m3160c(String str) {
        return new C0617b<>("cn.jiguang.sdk.address", "dns_last_update_" + str, 0L);
    }

    /* renamed from: c */
    public static C0617b<String> m3161c(boolean z) {
        C0617b<String> c0617b = new C0617b<>("cn.jiguang.sdk.address", z ? "default_https_report" : "default_http_report", "");
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: d */
    public static C0617b<Long> m3162d() {
        C0617b<Long> c0617b = new C0617b<>("cn.jiguang.sdk.user.profile", "key_uid", 0L);
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: d */
    public static C0617b<String> m3163d(String str) {
        return new C0617b<>("cn.jiguang.sdk.address", "srv_" + str, "");
    }

    /* renamed from: e */
    public static C0617b<String> m3164e() {
        C0617b<String> c0617b = new C0617b<>("cn.jiguang.sdk.user.profile", "key_rid", "");
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: e */
    public static C0617b<Long> m3165e(String str) {
        return new C0617b<>("cn.jiguang.sdk.address", "srv_last_update_" + str, 0L);
    }

    /* renamed from: f */
    public static C0617b<String> m3166f() {
        C0617b<String> c0617b = new C0617b<>("cn.jiguang.sdk.user.profile", "key_pwd", "");
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: f */
    public static C0617b<String> m3167f(String str) {
        return new C0617b<>("IpInfos", str, "");
    }

    /* renamed from: g */
    public static C0617b<String> m3168g() {
        C0617b<String> c0617b = new C0617b<>(f2903a, "sdk_version", "");
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: g */
    public static C0617b<Integer> m3169g(String str) {
        return new C0617b<>("netinfo", str, 0);
    }

    /* renamed from: h */
    public static C0617b<String> m3170h() {
        return new C0617b<>(f2903a, "device_config_appkey", "");
    }

    /* renamed from: i */
    public static C0617b<String> m3171i() {
        return new C0617b<>(f2903a, "i_new", "");
    }

    /* renamed from: j */
    public static C0617b<String> m3172j() {
        return new C0617b<>(f2903a, "push_udid", "");
    }

    /* renamed from: k */
    public static C0617b<String> m3173k() {
        return new C0617b<>(f2903a, "last_connection_type", "");
    }

    /* renamed from: l */
    public static C0617b<String> m3174l() {
        return new C0617b<>(f2903a, "sis_report_history", "");
    }

    /* renamed from: m */
    public static C0617b<Long> m3175m() {
        return new C0617b<>(f2903a, "lbs_delay", 0L);
    }

    /* renamed from: n */
    public static C0617b<Long> m3176n() {
        return new C0617b<>("cn.jpush.preferences.v2.rid", "next_rid", -1L);
    }

    /* renamed from: o */
    public static C0617b<Integer> m3177o() {
        return new C0617b<>("cn.jpush.preferences.v2.rid", "seq_id", -1);
    }

    /* renamed from: p */
    public static C0617b<String> m3178p() {
        return new C0617b<>("cn.jiguang.sdk.address", "ips_in_last_good_sis", "");
    }

    /* renamed from: q */
    public static C0617b<String> m3179q() {
        return new C0617b<>("cn.jiguang.sdk.address", "ssl_ips_in_last_good_sis", "");
    }

    /* renamed from: r */
    public static C0617b<Boolean> m3180r() {
        return new C0617b<>("cn.jiguang.sdk.address", "udp_data_report", false);
    }

    /* renamed from: s */
    public static C0617b<Long> m3181s() {
        return new C0617b<>("cn.jiguang.sdk.address", "sis_last_update", 0L);
    }

    /* renamed from: t */
    public static C0617b<Long> m3182t() {
        return new C0617b<>("cn.jiguang.sdk.address", "last_sis_report_time", 0L);
    }

    /* renamed from: u */
    public static C0617b<String> m3183u() {
        return new C0617b<>("cn.jiguang.sdk.address", "default_sis_ips", "");
    }

    /* renamed from: v */
    public static C0617b<String> m3184v() {
        return new C0617b<>("cn.jiguang.sdk.address", "default_conn", "");
    }

    /* renamed from: w */
    public static C0617b<String> m3185w() {
        return new C0617b<>("cn.jiguang.sdk.address", "default_conn_srv", "");
    }

    /* renamed from: x */
    public static C0617b<String> m3186x() {
        C0617b<String> c0617b = new C0617b<>("cn.jiguang.sdk.address", "tcp_report", "");
        c0617b.f2907e = true;
        return c0617b;
    }

    /* renamed from: y */
    public static C0617b<String> m3187y() {
        return new C0617b<>("PrefsFile", "key", "");
    }

    /* renamed from: a */
    public final C0617b<T> m3188a(T t) {
        this.f2906d = t;
        return this;
    }
}
