package p031c.p032a.p043K;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c.a.K.b */
/* loaded from: classes.dex */
final class C0540b extends ThreadLocal<SimpleDateFormat> {

    /* renamed from: a */
    private String f2672a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0540b(String str) {
        this.f2672a = str;
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SimpleDateFormat initialValue() {
        return new SimpleDateFormat(this.f2672a, Locale.ENGLISH);
    }
}
