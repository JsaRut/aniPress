package p031c.p032a.p072p.p073a.p080f.p087g;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c.a.p.a.f.g.c */
/* loaded from: classes.dex */
final class C0761c extends ThreadLocal<SimpleDateFormat> {

    /* renamed from: a */
    private String f3382a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0761c(String str) {
        this.f3382a = str;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat(this.f3382a, Locale.ENGLISH);
    }
}
