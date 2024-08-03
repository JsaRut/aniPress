package p031c.p032a.p092s;

import java.nio.ByteBuffer;
import p031c.p032a.p094t.C0840c;
import p031c.p032a.p094t.C0841d;

/* renamed from: c.a.s.i */
/* loaded from: classes.dex */
public abstract class AbstractC0833i {

    /* renamed from: a */
    private boolean f3565a;

    /* renamed from: b */
    protected C0840c f3566b;

    /* renamed from: c */
    protected ByteBuffer f3567c;

    public AbstractC0833i(boolean z, Object obj, ByteBuffer byteBuffer) {
        this.f3565a = z;
        this.f3566b = (C0840c) obj;
        if (byteBuffer == null) {
            C0841d.m4106c("JProtocol", "No body to parse.");
        } else {
            this.f3567c = byteBuffer;
            mo3562c();
        }
    }

    /* renamed from: a */
    public Long m4089a() {
        return this.f3566b.m4101b();
    }

    /* renamed from: b */
    public abstract boolean mo3561b();

    /* renamed from: c */
    protected abstract void mo3562c();
}
