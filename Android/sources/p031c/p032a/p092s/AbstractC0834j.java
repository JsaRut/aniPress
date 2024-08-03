package p031c.p032a.p092s;

import java.nio.ByteBuffer;
import p031c.p032a.p092s.p093a.C0824a;

/* renamed from: c.a.s.j */
/* loaded from: classes.dex */
public abstract class AbstractC0834j extends AbstractC0833i {

    /* renamed from: d */
    public int f3568d;

    public AbstractC0834j(Object obj, ByteBuffer byteBuffer) {
        super(false, obj, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p031c.p032a.p092s.AbstractC0833i
    /* renamed from: c */
    public void mo3562c() {
        if (mo3561b()) {
            this.f3568d = C0824a.m4032a(this.f3567c, this);
        }
    }

    public String toString() {
        return "JResponse{code=" + this.f3568d + '}';
    }
}
