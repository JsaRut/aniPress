package android.support.v7.view.menu;

import android.support.v7.view.menu.InterfaceC0377w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.k */
/* loaded from: classes.dex */
public class C0365k extends BaseAdapter {

    /* renamed from: a */
    C0366l f1806a;

    /* renamed from: b */
    private int f1807b = -1;

    /* renamed from: c */
    private boolean f1808c;

    /* renamed from: d */
    private final boolean f1809d;

    /* renamed from: e */
    private final LayoutInflater f1810e;

    /* renamed from: f */
    private final int f1811f;

    public C0365k(C0366l c0366l, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1809d = z;
        this.f1810e = layoutInflater;
        this.f1806a = c0366l;
        this.f1811f = i;
        m1996a();
    }

    /* renamed from: a */
    void m1996a() {
        C0370p m2036f = this.f1806a.m2036f();
        if (m2036f != null) {
            ArrayList<C0370p> m2040j = this.f1806a.m2040j();
            int size = m2040j.size();
            for (int i = 0; i < size; i++) {
                if (m2040j.get(i) == m2036f) {
                    this.f1807b = i;
                    return;
                }
            }
        }
        this.f1807b = -1;
    }

    /* renamed from: a */
    public void m1997a(boolean z) {
        this.f1808c = z;
    }

    /* renamed from: b */
    public C0366l m1998b() {
        return this.f1806a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1807b < 0 ? (this.f1809d ? this.f1806a.m2040j() : this.f1806a.m2043n()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public C0370p getItem(int i) {
        ArrayList<C0370p> m2040j = this.f1809d ? this.f1806a.m2040j() : this.f1806a.m2043n();
        int i2 = this.f1807b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m2040j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1810e.inflate(this.f1811f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1806a.mo1951o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0377w.a aVar = (InterfaceC0377w.a) view;
        if (this.f1808c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1920a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m1996a();
        super.notifyDataSetChanged();
    }
}
