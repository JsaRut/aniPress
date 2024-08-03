package p031c.p032a.p072p.p073a.p080f.p084d;

import java.io.Serializable;

/* renamed from: c.a.p.a.f.d.g */
/* loaded from: classes.dex */
public final class C0750g extends AbstractC0747d {

    /* renamed from: b */
    private final int f3373b;

    /* renamed from: c */
    private final int f3374c;

    public C0750g(int i, int i2) {
        super("should be in [0,2]");
        this.f3374c = 0;
        this.f3373b = 2;
    }

    @Override // p031c.p032a.p072p.p073a.p080f.p084d.AbstractC0747d
    /* renamed from: a */
    public final boolean mo3773a(Serializable serializable) {
        if (serializable instanceof Integer) {
            Integer num = (Integer) serializable;
            if (num.intValue() >= this.f3374c && num.intValue() <= this.f3373b) {
                return true;
            }
        }
        return false;
    }
}
