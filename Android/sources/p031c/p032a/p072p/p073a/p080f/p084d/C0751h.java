package p031c.p032a.p072p.p073a.p080f.p084d;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: c.a.p.a.f.d.h */
/* loaded from: classes.dex */
public final class C0751h extends AbstractC0747d {

    /* renamed from: b */
    private static Pattern f3375b = Pattern.compile("^[+|(|0-9][0-9|\\-|(|)| ]{1,19}$");

    public C0751h() {
        super("is NOT a phone number");
    }

    @Override // p031c.p032a.p072p.p073a.p080f.p084d.AbstractC0747d
    /* renamed from: a */
    public final boolean mo3773a(Serializable serializable) {
        if (serializable instanceof String) {
            return f3375b.matcher((String) serializable).matches();
        }
        return false;
    }
}
