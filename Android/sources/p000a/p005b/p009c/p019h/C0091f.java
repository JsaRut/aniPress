package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.view.Gravity;

/* renamed from: a.b.c.h.f */
/* loaded from: classes.dex */
public final class C0091f {
    /* renamed from: a */
    public static int m429a(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }
}
