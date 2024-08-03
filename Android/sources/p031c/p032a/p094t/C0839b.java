package p031c.p032a.p094t;

import android.content.Context;
import android.os.Bundle;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.t.b */
/* loaded from: classes.dex */
public final class C0839b {
    /* renamed from: a */
    public static Bundle m4099a(Context context, int i, Bundle bundle) {
        Object obj;
        try {
            Bundle bundle2 = new Bundle();
            if (i == 4096) {
                if (bundle != null && (obj = bundle.get("arg1")) != null) {
                    C0831g.m4072a(context, null, 9, obj.toString(), null, new Object[0]);
                }
                return bundle2;
            }
            if (i == 4098) {
                C0831g.m4080c(context);
                return bundle2;
            }
            if (i != 36864) {
                return null;
            }
            C0831g.m4072a(context, null, 52, null, bundle, new Object[0]);
            return null;
        } catch (Throwable th) {
            C0841d.m4108e("JCoreInterface", "si e:" + th);
            return null;
        }
    }
}
