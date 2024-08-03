package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.s */
/* loaded from: classes.dex */
public abstract class AbstractC0373s implements InterfaceC0380z, InterfaceC0376v, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1883a;

    /* renamed from: a */
    public static int m2074a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static C0365k m2075a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0365k) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0365k) listAdapter;
    }

    /* renamed from: b */
    public static boolean m2076b(C0366l c0366l) {
        int size = c0366l.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0366l.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo1929a(int i);

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1968a(Context context, C0366l c0366l) {
    }

    /* renamed from: a */
    public void m2077a(Rect rect) {
        this.f1883a = rect;
    }

    /* renamed from: a */
    public abstract void mo1930a(C0366l c0366l);

    /* renamed from: a */
    public abstract void mo1933a(View view);

    /* renamed from: a */
    public abstract void mo1934a(PopupWindow.OnDismissListener onDismissListener);

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1972a(C0366l c0366l, C0370p c0370p) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1938b(int i);

    /* renamed from: b */
    public abstract void mo1939b(boolean z);

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: b */
    public boolean mo1976b(C0366l c0366l, C0370p c0370p) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo1942c(int i);

    /* renamed from: c */
    public abstract void mo1943c(boolean z);

    /* renamed from: e */
    protected boolean mo1991e() {
        return true;
    }

    /* renamed from: f */
    public Rect m2078f() {
        return this.f1883a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m2075a(listAdapter).f1806a.m2022a((MenuItem) listAdapter.getItem(i), this, mo1991e() ? 0 : 4);
    }
}
