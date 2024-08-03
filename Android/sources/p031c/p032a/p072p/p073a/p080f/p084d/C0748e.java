package p031c.p032a.p072p.p073a.p080f.p084d;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p031c.p032a.p072p.p073a.p080f.p087g.C0760b;

/* renamed from: c.a.p.a.f.d.e */
/* loaded from: classes.dex */
public final class C0748e extends AbstractC0747d {
    public C0748e() {
        super("should be date as yyyyMMdd");
    }

    @Override // p031c.p032a.p072p.p073a.p080f.p084d.AbstractC0747d
    /* renamed from: a */
    public final boolean mo3773a(Serializable serializable) {
        if (serializable instanceof String) {
            try {
                SimpleDateFormat m3805a = C0760b.m3805a("yyyyMMdd");
                m3805a.setLenient(true);
                return serializable.equals(m3805a.format(m3805a.parse((String) serializable)));
            } catch (ParseException unused) {
            }
        }
        return false;
    }
}
