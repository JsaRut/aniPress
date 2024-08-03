package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.widget.C0301s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.v */
/* loaded from: classes.dex */
class C0478v extends PopupWindow {

    /* renamed from: a */
    private static final boolean f2507a;

    /* renamed from: b */
    private boolean f2508b;

    static {
        f2507a = Build.VERSION.SDK_INT < 21;
    }

    public C0478v(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2567a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2567a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0479va m2571a = C0479va.m2571a(context, attributeSet, C0121j.PopupWindow, i, i2);
        if (m2571a.m2589g(C0121j.PopupWindow_overlapAnchor)) {
            m2568a(m2571a.m2577a(C0121j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(m2571a.m2579b(C0121j.PopupWindow_android_popupBackground));
        m2571a.m2576a();
    }

    /* renamed from: a */
    private void m2568a(boolean z) {
        if (f2507a) {
            this.f2508b = z;
        } else {
            C0301s.m1694a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f2507a && this.f2508b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2507a && this.f2508b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2507a && this.f2508b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
