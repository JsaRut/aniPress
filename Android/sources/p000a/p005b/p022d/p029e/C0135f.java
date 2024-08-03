package p000a.p005b.p022d.p029e;

import android.content.Context;
import android.support.v4.util.C0269o;
import android.support.v7.view.menu.C0378x;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuC0046a;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p022d.p029e.AbstractC0131b;

/* renamed from: a.b.d.e.f */
/* loaded from: classes.dex */
public class C0135f extends ActionMode {

    /* renamed from: a */
    final Context f503a;

    /* renamed from: b */
    final AbstractC0131b f504b;

    /* renamed from: a.b.d.e.f$a */
    /* loaded from: classes.dex */
    public static class a implements AbstractC0131b.a {

        /* renamed from: a */
        final ActionMode.Callback f505a;

        /* renamed from: b */
        final Context f506b;

        /* renamed from: c */
        final ArrayList<C0135f> f507c = new ArrayList<>();

        /* renamed from: d */
        final C0269o<Menu, Menu> f508d = new C0269o<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f506b = context;
            this.f505a = callback;
        }

        /* renamed from: a */
        private Menu m652a(Menu menu) {
            Menu menu2 = this.f508d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu m2093a = C0378x.m2093a(this.f506b, (InterfaceMenuC0046a) menu);
            this.f508d.put(menu, m2093a);
            return m2093a;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: a */
        public void mo642a(AbstractC0131b abstractC0131b) {
            this.f505a.onDestroyActionMode(m653b(abstractC0131b));
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: a */
        public boolean mo643a(AbstractC0131b abstractC0131b, Menu menu) {
            return this.f505a.onCreateActionMode(m653b(abstractC0131b), m652a(menu));
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: a */
        public boolean mo644a(AbstractC0131b abstractC0131b, MenuItem menuItem) {
            return this.f505a.onActionItemClicked(m653b(abstractC0131b), C0378x.m2094a(this.f506b, (InterfaceMenuItemC0047b) menuItem));
        }

        /* renamed from: b */
        public ActionMode m653b(AbstractC0131b abstractC0131b) {
            int size = this.f507c.size();
            for (int i = 0; i < size; i++) {
                C0135f c0135f = this.f507c.get(i);
                if (c0135f != null && c0135f.f504b == abstractC0131b) {
                    return c0135f;
                }
            }
            C0135f c0135f2 = new C0135f(this.f506b, abstractC0131b);
            this.f507c.add(c0135f2);
            return c0135f2;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b.a
        /* renamed from: b */
        public boolean mo645b(AbstractC0131b abstractC0131b, Menu menu) {
            return this.f505a.onPrepareActionMode(m653b(abstractC0131b), m652a(menu));
        }
    }

    public C0135f(Context context, AbstractC0131b abstractC0131b) {
        this.f503a = context;
        this.f504b = abstractC0131b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f504b.mo625a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f504b.mo631b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0378x.m2093a(this.f503a, (InterfaceMenuC0046a) this.f504b.mo634c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f504b.mo635d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f504b.mo636e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f504b.m637f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f504b.mo638g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f504b.m639h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f504b.mo640i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f504b.mo641j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f504b.mo627a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f504b.mo626a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f504b.mo628a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f504b.m629a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f504b.mo632b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f504b.mo633b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f504b.mo630a(z);
    }
}
