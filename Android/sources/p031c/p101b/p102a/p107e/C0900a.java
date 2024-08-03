package p031c.p101b.p102a.p107e;

/* renamed from: c.b.a.e.a */
/* loaded from: classes.dex */
public class C0900a<T> {

    /* renamed from: a */
    String f3865a;

    /* renamed from: b */
    String f3866b;

    /* renamed from: c */
    T f3867c;

    /* renamed from: d */
    boolean f3868d;

    private C0900a(String str, String str2, T t) {
        this.f3865a = str;
        this.f3866b = str2;
        if (t == null) {
            throw new IllegalArgumentException("default value can not be null");
        }
        this.f3867c = t;
    }

    /* renamed from: a */
    public static C0900a<Integer> m4432a() {
        C0900a<Integer> c0900a = new C0900a<>("cn.jpush.config", "versionCode", 0);
        c0900a.m4434b();
        return c0900a;
    }

    /* renamed from: a */
    public static C0900a<String> m4433a(byte b2) {
        C0900a<String> c0900a = new C0900a<>("cn.jpush.config", "pluginPlatformRegid_v2" + ((int) b2), "");
        c0900a.m4434b();
        return c0900a;
    }

    /* renamed from: b */
    private C0900a<T> m4434b() {
        this.f3868d = true;
        return this;
    }

    /* renamed from: b */
    public static C0900a<Boolean> m4435b(byte b2) {
        C0900a<Boolean> c0900a = new C0900a<>("cn.jpush.config", "pluginPlatformRegidupload" + ((int) b2), false);
        c0900a.m4434b();
        return c0900a;
    }

    /* renamed from: a */
    public C0900a<T> m4436a(T t) {
        this.f3867c = t;
        return this;
    }
}
