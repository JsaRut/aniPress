package p031c.p032a.p096v;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c.a.v.c */
/* loaded from: classes.dex */
final class C0847c extends ThreadLocal<SimpleDateFormat> {

    /* renamed from: a */
    private String f3596a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0847c(String str) {
        this.f3596a = str;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat(this.f3596a, Locale.ENGLISH);
    }
}
