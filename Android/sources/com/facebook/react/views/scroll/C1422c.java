package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.react.modules.i18nmanager.C1190a;

/* renamed from: com.facebook.react.views.scroll.c */
/* loaded from: classes.dex */
public class C1422c extends ViewGroup {

    /* renamed from: a */
    private int f5214a;

    /* renamed from: b */
    private int f5215b;

    public C1422c(Context context) {
        super(context);
        this.f5214a = C1190a.m5346a().m5355b(context) ? 1 : 0;
        this.f5215b = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5214a == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.f5215b, horizontalScrollView.getScrollY());
        }
        this.f5215b = getWidth();
    }
}
