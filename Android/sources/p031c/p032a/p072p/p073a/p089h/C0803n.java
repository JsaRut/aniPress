package p031c.p032a.p072p.p073a.p089h;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p031c.p032a.p072p.p073a.p080f.C0770h;

/* renamed from: c.a.p.a.h.n */
/* loaded from: classes.dex */
public final class C0803n extends FrameLayout {
    public C0803n(Context context) {
        super(context);
        setBackgroundColor(-1090519040);
        View c0802m = new C0802m(getContext());
        int m3841b = C0770h.m3841b(getContext(), 42.0f);
        int m3841b2 = C0770h.m3841b(getContext(), 80.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m3841b, m3841b2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = ((C0797h.f3475b / 2) - C0797h.f3476c) - m3841b2;
        addView(c0802m, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setTextColor(-723724);
        textView.setTextSize(2, 18.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = (layoutParams.topMargin - (C0797h.f3476c / 2)) - C0770h.m3834a(getContext(), 18.0f);
        addView(textView, layoutParams2);
    }
}
