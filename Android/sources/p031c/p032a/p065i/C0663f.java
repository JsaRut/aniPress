package p031c.p032a.p065i;

/* renamed from: c.a.i.f */
/* loaded from: classes.dex */
public final class C0663f extends Exception {

    /* renamed from: a */
    public final int f3069a;

    public C0663f(int i, String str) {
        super(str);
        this.f3069a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "JException(" + this.f3069a + "):" + getLocalizedMessage();
    }
}
