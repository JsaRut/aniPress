package p031c.p032a.p072p.p073a.p080f.p084d;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: c.a.p.a.f.d.f */
/* loaded from: classes.dex */
public final class C0749f extends AbstractC0747d {

    /* renamed from: b */
    private static Pattern f3372b = Pattern.compile("^.+@.+\\..+$");

    public C0749f() {
        super("is NOT email address");
    }

    @Override // p031c.p032a.p072p.p073a.p080f.p084d.AbstractC0747d
    /* renamed from: a */
    public final boolean mo3773a(Serializable serializable) {
        if (serializable instanceof String) {
            String str = (String) serializable;
            if (f3372b.matcher(str).matches() && str.length() <= 100) {
                return true;
            }
        }
        return false;
    }
}
