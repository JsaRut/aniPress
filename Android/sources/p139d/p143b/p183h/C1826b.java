package p139d.p143b.p183h;

/* renamed from: d.b.h.b */
/* loaded from: classes.dex */
public final class C1826b {

    /* renamed from: a */
    public static final C1827c f6739a = new C1827c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C1827c f6740b = new C1827c("PNG", "png");

    /* renamed from: c */
    public static final C1827c f6741c = new C1827c("GIF", "gif");

    /* renamed from: d */
    public static final C1827c f6742d = new C1827c("BMP", "bmp");

    /* renamed from: e */
    public static final C1827c f6743e = new C1827c("WEBP_SIMPLE", "webp");

    /* renamed from: f */
    public static final C1827c f6744f = new C1827c("WEBP_LOSSLESS", "webp");

    /* renamed from: g */
    public static final C1827c f6745g = new C1827c("WEBP_EXTENDED", "webp");

    /* renamed from: h */
    public static final C1827c f6746h = new C1827c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: i */
    public static final C1827c f6747i = new C1827c("WEBP_ANIMATED", "webp");

    /* renamed from: j */
    public static final C1827c f6748j = new C1827c("HEIF", "heif");

    /* renamed from: a */
    public static boolean m7517a(C1827c c1827c) {
        return c1827c == f6743e || c1827c == f6744f || c1827c == f6745g || c1827c == f6746h;
    }

    /* renamed from: b */
    public static boolean m7518b(C1827c c1827c) {
        return m7517a(c1827c) || c1827c == f6747i;
    }
}
