package p031c.p032a.p072p.p073a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.nio.ByteBuffer;
import p031c.p032a.p072p.p073a.p074a.C0696f;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;
import p031c.p032a.p092s.InterfaceC0826b;

/* renamed from: c.a.p.a.c */
/* loaded from: classes.dex */
public class C0721c implements InterfaceC0826b {
    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public long mo3654a(Context context, long j, int i, Object obj, ByteBuffer byteBuffer) {
        if (i != 26) {
            return -1L;
        }
        C0690a c0690a = new C0690a(obj, byteBuffer);
        C0696f.m3573a(c0690a.m4089a().longValue(), c0690a.f3568d);
        return c0690a.m4089a().longValue();
    }

    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public String mo3655a() {
        return "2.0.0";
    }

    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public void mo3656a(Context context, long j, int i) {
    }

    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public void mo3657a(Context context, long j, long j2, int i) {
        if (i != 26) {
            return;
        }
        C0696f.m3572a(j2);
    }

    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public void mo3658a(Context context, long j, Bundle bundle, Object obj) {
        if (C0707b.m3616b(context)) {
            C0696f.m3574a(context, bundle);
        } else {
            C0732b.m3723f("JAnalyticsAction", "Action - onActionRun , JAnalytics init failed");
        }
    }

    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public void mo3659a(Context context, long j, Object obj) {
        if (obj instanceof Intent) {
            return;
        }
        C0732b.m3720c("JAnalyticsAction", "handleMessage unknown object ");
    }

    @Override // p031c.p032a.p092s.InterfaceC0826b
    /* renamed from: a */
    public boolean mo3660a(int i) {
        return i == 26;
    }
}
