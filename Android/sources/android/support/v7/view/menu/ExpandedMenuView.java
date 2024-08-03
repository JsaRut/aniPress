package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.support.v7.view.menu.C0366l;
import android.support.v7.widget.C0479va;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0366l.b, InterfaceC0377w, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f1701a = {R.attr.background, R.attr.divider};

    /* renamed from: b */
    private C0366l f1702b;

    /* renamed from: c */
    private int f1703c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0479va m2571a = C0479va.m2571a(context, attributeSet, f1701a, i, 0);
        if (m2571a.m2589g(0)) {
            setBackgroundDrawable(m2571a.m2579b(0));
        }
        if (m2571a.m2589g(1)) {
            setDivider(m2571a.m2579b(1));
        }
        m2571a.m2576a();
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w
    /* renamed from: a */
    public void mo1956a(C0366l c0366l) {
        this.f1702b = c0366l;
    }

    @Override // android.support.v7.view.menu.C0366l.b
    /* renamed from: a */
    public boolean mo1957a(C0370p c0370p) {
        return this.f1702b.m2021a(c0370p, 0);
    }

    public int getWindowAnimations() {
        return this.f1703c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1957a((C0370p) getAdapter().getItem(i));
    }
}
