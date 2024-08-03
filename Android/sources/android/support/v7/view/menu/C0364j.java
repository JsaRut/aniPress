package android.support.v7.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.view.menu.InterfaceC0377w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p000a.p005b.p022d.p023a.C0118g;

/* renamed from: android.support.v7.view.menu.j */
/* loaded from: classes.dex */
public class C0364j implements InterfaceC0376v, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1795a;

    /* renamed from: b */
    LayoutInflater f1796b;

    /* renamed from: c */
    C0366l f1797c;

    /* renamed from: d */
    ExpandedMenuView f1798d;

    /* renamed from: e */
    int f1799e;

    /* renamed from: f */
    int f1800f;

    /* renamed from: g */
    int f1801g;

    /* renamed from: h */
    private InterfaceC0376v.a f1802h;

    /* renamed from: i */
    a f1803i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.view.menu.j$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a */
        private int f1804a = -1;

        public a() {
            m1995a();
        }

        /* renamed from: a */
        void m1995a() {
            C0370p m2036f = C0364j.this.f1797c.m2036f();
            if (m2036f != null) {
                ArrayList<C0370p> m2040j = C0364j.this.f1797c.m2040j();
                int size = m2040j.size();
                for (int i = 0; i < size; i++) {
                    if (m2040j.get(i) == m2036f) {
                        this.f1804a = i;
                        return;
                    }
                }
            }
            this.f1804a = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0364j.this.f1797c.m2040j().size() - C0364j.this.f1799e;
            return this.f1804a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public C0370p getItem(int i) {
            ArrayList<C0370p> m2040j = C0364j.this.f1797c.m2040j();
            int i2 = i + C0364j.this.f1799e;
            int i3 = this.f1804a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m2040j.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0364j c0364j = C0364j.this;
                view = c0364j.f1796b.inflate(c0364j.f1801g, viewGroup, false);
            }
            ((InterfaceC0377w.a) view).mo1920a(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m1995a();
            super.notifyDataSetChanged();
        }
    }

    public C0364j(int i, int i2) {
        this.f1801g = i;
        this.f1800f = i2;
    }

    public C0364j(Context context, int i) {
        this(i, 0);
        this.f1795a = context;
        this.f1796b = LayoutInflater.from(this.f1795a);
    }

    /* renamed from: a */
    public InterfaceC0377w m1993a(ViewGroup viewGroup) {
        if (this.f1798d == null) {
            this.f1798d = (ExpandedMenuView) this.f1796b.inflate(C0118g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1803i == null) {
                this.f1803i = new a();
            }
            this.f1798d.setAdapter((ListAdapter) this.f1803i);
            this.f1798d.setOnItemClickListener(this);
        }
        return this.f1798d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:            if (r2.f1796b == null) goto L5;     */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1968a(android.content.Context r3, android.support.v7.view.menu.C0366l r4) {
        /*
            r2 = this;
            int r0 = r2.f1800f
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f1795a = r1
        Lb:
            android.content.Context r3 = r2.f1795a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1796b = r3
            goto L1f
        L14:
            android.content.Context r0 = r2.f1795a
            if (r0 == 0) goto L1f
            r2.f1795a = r3
            android.view.LayoutInflater r3 = r2.f1796b
            if (r3 != 0) goto L1f
            goto Lb
        L1f:
            r2.f1797c = r4
            android.support.v7.view.menu.j$a r3 = r2.f1803i
            if (r3 == 0) goto L28
            r3.notifyDataSetChanged()
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.C0364j.mo1968a(android.content.Context, android.support.v7.view.menu.l):void");
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1931a(C0366l c0366l, boolean z) {
        InterfaceC0376v.a aVar = this.f1802h;
        if (aVar != null) {
            aVar.mo1906a(c0366l, z);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1932a(InterfaceC0376v.a aVar) {
        this.f1802h = aVar;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1935a(boolean z) {
        a aVar = this.f1803i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1936a() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1937a(SubMenuC0353D subMenuC0353D) {
        if (!subMenuC0353D.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0367m(subMenuC0353D).m2047a((IBinder) null);
        InterfaceC0376v.a aVar = this.f1802h;
        if (aVar == null) {
            return true;
        }
        aVar.mo1907a(subMenuC0353D);
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1972a(C0366l c0366l, C0370p c0370p) {
        return false;
    }

    /* renamed from: b */
    public ListAdapter m1994b() {
        if (this.f1803i == null) {
            this.f1803i = new a();
        }
        return this.f1803i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: b */
    public boolean mo1976b(C0366l c0366l, C0370p c0370p) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1797c.m2022a(this.f1803i.getItem(i), this, 0);
    }
}
