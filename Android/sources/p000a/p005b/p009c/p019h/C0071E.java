package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.h.E */
/* loaded from: classes.dex */
public final class C0071E {
    /* renamed from: a */
    public static void m330a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0099n) {
            ((InterfaceC0099n) viewParent).mo464a(view, i);
            return;
        }
        if (i == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0100o) {
                    ((InterfaceC0100o) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m331a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof InterfaceC0099n) {
            ((InterfaceC0099n) viewParent).mo465a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0100o) {
                    ((InterfaceC0100o) viewParent).onNestedScroll(view, i, i2, i3, i4);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m332a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0099n) {
            ((InterfaceC0099n) viewParent).mo466a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0100o) {
                    ((InterfaceC0100o) viewParent).onNestedPreScroll(view, i, i2, iArr);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m333a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0099n) {
            ((InterfaceC0099n) viewParent).mo468b(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0100o) {
                    ((InterfaceC0100o) viewParent).onNestedScrollAccepted(view, view2, i);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m334a(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0100o) {
                return ((InterfaceC0100o) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m335a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0100o) {
                return ((InterfaceC0100o) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m336b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0099n) {
            return ((InterfaceC0099n) viewParent).mo467a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0100o) {
                return ((InterfaceC0100o) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }
}
