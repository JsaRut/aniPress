package p000a.p005b.p022d.p029e;

import android.content.Context;
import android.support.v7.view.menu.C0366l;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p000a.p005b.p022d.p029e.AbstractC0131b;

/* renamed from: a.b.d.e.e */
/* loaded from: classes.dex */
public class C0134e extends AbstractC0131b implements C0366l.a {

    /* renamed from: c */
    private Context f496c;

    /* renamed from: d */
    private ActionBarContextView f497d;

    /* renamed from: e */
    private AbstractC0131b.a f498e;

    /* renamed from: f */
    private WeakReference<View> f499f;

    /* renamed from: g */
    private boolean f500g;

    /* renamed from: h */
    private boolean f501h;

    /* renamed from: i */
    private C0366l f502i;

    public C0134e(Context context, ActionBarContextView actionBarContextView, AbstractC0131b.a aVar, boolean z) {
        this.f496c = context;
        this.f497d = actionBarContextView;
        this.f498e = aVar;
        C0366l c0366l = new C0366l(actionBarContextView.getContext());
        c0366l.m2028c(1);
        this.f502i = c0366l;
        this.f502i.mo1945a(this);
        this.f501h = z;
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: a */
    public void mo625a() {
        if (this.f500g) {
            return;
        }
        this.f500g = true;
        this.f497d.sendAccessibilityEvent(32);
        this.f498e.mo642a(this);
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: a */
    public void mo626a(int i) {
        mo628a((CharSequence) this.f496c.getString(i));
    }

    @Override // android.support.v7.view.menu.C0366l.a
    /* renamed from: a */
    public void mo650a(C0366l c0366l) {
        mo640i();
        this.f497d.m2110d();
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: a */
    public void mo627a(View view) {
        this.f497d.setCustomView(view);
        this.f499f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: a */
    public void mo628a(CharSequence charSequence) {
        this.f497d.setSubtitle(charSequence);
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: a */
    public void mo630a(boolean z) {
        super.mo630a(z);
        this.f497d.setTitleOptional(z);
    }

    @Override // android.support.v7.view.menu.C0366l.a
    /* renamed from: a */
    public boolean mo651a(C0366l c0366l, MenuItem menuItem) {
        return this.f498e.mo644a(this, menuItem);
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: b */
    public View mo631b() {
        WeakReference<View> weakReference = this.f499f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: b */
    public void mo632b(int i) {
        mo633b(this.f496c.getString(i));
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: b */
    public void mo633b(CharSequence charSequence) {
        this.f497d.setTitle(charSequence);
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: c */
    public Menu mo634c() {
        return this.f502i;
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: d */
    public MenuInflater mo635d() {
        return new C0136g(this.f497d.getContext());
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: e */
    public CharSequence mo636e() {
        return this.f497d.getSubtitle();
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: g */
    public CharSequence mo638g() {
        return this.f497d.getTitle();
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: i */
    public void mo640i() {
        this.f498e.mo645b(this, this.f502i);
    }

    @Override // p000a.p005b.p022d.p029e.AbstractC0131b
    /* renamed from: j */
    public boolean mo641j() {
        return this.f497d.m2108b();
    }
}
