package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.b.c.h.i */
/* loaded from: classes.dex */
public final class C0094i {
    /* renamed from: a */
    public static int m439a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m440b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }
}
