package android.support.v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.n */
/* loaded from: classes.dex */
public final class C0296n {
    /* renamed from: a */
    public static void m1685a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
