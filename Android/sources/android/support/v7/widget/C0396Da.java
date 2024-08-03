package android.support.v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.Da */
/* loaded from: classes.dex */
public class C0396Da {
    /* renamed from: a */
    public static void m2193a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC0402Ga.m2195a(view, charSequence);
        }
    }
}
