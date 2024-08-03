package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.view.menu.InterfaceC0377w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0356b implements InterfaceC0376v {

    /* renamed from: a */
    protected Context f1744a;

    /* renamed from: b */
    protected Context f1745b;

    /* renamed from: c */
    protected C0366l f1746c;

    /* renamed from: d */
    protected LayoutInflater f1747d;

    /* renamed from: e */
    protected LayoutInflater f1748e;

    /* renamed from: f */
    private InterfaceC0376v.a f1749f;

    /* renamed from: g */
    private int f1750g;

    /* renamed from: h */
    private int f1751h;

    /* renamed from: i */
    protected InterfaceC0377w f1752i;

    /* renamed from: j */
    private int f1753j;

    public AbstractC0356b(Context context, int i, int i2) {
        this.f1744a = context;
        this.f1747d = LayoutInflater.from(context);
        this.f1750g = i;
        this.f1751h = i2;
    }

    /* renamed from: a */
    public InterfaceC0377w.a m1965a(ViewGroup viewGroup) {
        return (InterfaceC0377w.a) this.f1747d.inflate(this.f1751h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public View mo1966a(C0370p c0370p, View view, ViewGroup viewGroup) {
        InterfaceC0377w.a m1965a = view instanceof InterfaceC0377w.a ? (InterfaceC0377w.a) view : m1965a(viewGroup);
        mo1969a(c0370p, m1965a);
        return (View) m1965a;
    }

    /* renamed from: a */
    public void m1967a(int i) {
        this.f1753j = i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1968a(Context context, C0366l c0366l) {
        this.f1745b = context;
        this.f1748e = LayoutInflater.from(this.f1745b);
        this.f1746c = c0366l;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1931a(C0366l c0366l, boolean z) {
        InterfaceC0376v.a aVar = this.f1749f;
        if (aVar != null) {
            aVar.mo1906a(c0366l, z);
        }
    }

    /* renamed from: a */
    public abstract void mo1969a(C0370p c0370p, InterfaceC0377w.a aVar);

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1932a(InterfaceC0376v.a aVar) {
        this.f1749f = aVar;
    }

    /* renamed from: a */
    protected void m1970a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1752i).addView(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1935a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1752i;
        if (viewGroup == null) {
            return;
        }
        C0366l c0366l = this.f1746c;
        int i = 0;
        if (c0366l != null) {
            c0366l.m2024b();
            ArrayList<C0370p> m2043n = this.f1746c.m2043n();
            int size = m2043n.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0370p c0370p = m2043n.get(i3);
                if (mo1971a(i2, c0370p)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0370p itemData = childAt instanceof InterfaceC0377w.a ? ((InterfaceC0377w.a) childAt).getItemData() : null;
                    View mo1966a = mo1966a(c0370p, childAt, viewGroup);
                    if (c0370p != itemData) {
                        mo1966a.setPressed(false);
                        mo1966a.jumpDrawablesToCurrentState();
                    }
                    if (mo1966a != childAt) {
                        m1970a(mo1966a, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo1973a(viewGroup, i)) {
                i++;
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo1971a(int i, C0370p c0370p);

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1937a(SubMenuC0353D subMenuC0353D) {
        InterfaceC0376v.a aVar = this.f1749f;
        if (aVar != null) {
            return aVar.mo1907a(subMenuC0353D);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1972a(C0366l c0366l, C0370p c0370p) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1973a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public InterfaceC0376v.a m1974b() {
        return this.f1749f;
    }

    /* renamed from: b */
    public InterfaceC0377w mo1975b(ViewGroup viewGroup) {
        if (this.f1752i == null) {
            this.f1752i = (InterfaceC0377w) this.f1747d.inflate(this.f1750g, viewGroup, false);
            this.f1752i.mo1956a(this.f1746c);
            mo1935a(true);
        }
        return this.f1752i;
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: b */
    public boolean mo1976b(C0366l c0366l, C0370p c0370p) {
        return false;
    }
}
