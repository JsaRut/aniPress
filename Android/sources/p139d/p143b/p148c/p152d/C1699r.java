package p139d.p143b.p148c.p152d;

/* renamed from: d.b.c.d.r */
/* loaded from: classes.dex */
public final class C1699r {
    /* renamed from: a */
    public static RuntimeException m6984a(Throwable th) {
        C1691j.m6971a(th);
        m6986b(th);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public static <X extends Throwable> void m6985a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    /* renamed from: b */
    public static void m6986b(Throwable th) {
        m6985a(th, Error.class);
        m6985a(th, RuntimeException.class);
    }
}
