package p031c.p101b.p102a.p105c;

import android.content.Context;
import android.os.Bundle;
import p031c.p101b.p102a.p109g.C0904a;
import p031c.p101b.p102a.p114l.C0922a;

/* renamed from: c.b.a.c.f */
/* loaded from: classes.dex */
public class C0894f {
    /* renamed from: a */
    public static void m4410a(Context context) {
        C0922a.m4637a(context, "JPUSH", "clear_local_notify", new Bundle());
    }

    /* renamed from: a */
    public static void m4411a(Context context, long j) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_notify_ID", Long.valueOf(j));
        C0922a.m4637a(context, "JPUSH", "rm_local_notify", bundle);
    }

    /* renamed from: a */
    public static void m4412a(Context context, C0904a c0904a) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_notify", c0904a);
        C0922a.m4637a(context, "JPUSH", "add_local_notify", bundle);
    }
}
