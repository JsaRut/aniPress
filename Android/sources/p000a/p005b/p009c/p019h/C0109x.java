package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.view.ViewGroup;
import p000a.p005b.p006a.C0009b;

/* renamed from: a.b.c.h.x */
/* loaded from: classes.dex */
public final class C0109x {
    /* renamed from: a */
    public static boolean m545a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0009b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0107v.m524l(viewGroup) == null) ? false : true;
    }
}
