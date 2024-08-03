package p000a.p005b.p022d.p029e;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.b.d.e.b */
/* loaded from: classes.dex */
public abstract class AbstractC0131b {

    /* renamed from: a */
    private Object f489a;

    /* renamed from: b */
    private boolean f490b;

    /* renamed from: a.b.d.e.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo642a(AbstractC0131b abstractC0131b);

        /* renamed from: a */
        boolean mo643a(AbstractC0131b abstractC0131b, Menu menu);

        /* renamed from: a */
        boolean mo644a(AbstractC0131b abstractC0131b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo645b(AbstractC0131b abstractC0131b, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo625a();

    /* renamed from: a */
    public abstract void mo626a(int i);

    /* renamed from: a */
    public abstract void mo627a(View view);

    /* renamed from: a */
    public abstract void mo628a(CharSequence charSequence);

    /* renamed from: a */
    public void m629a(Object obj) {
        this.f489a = obj;
    }

    /* renamed from: a */
    public void mo630a(boolean z) {
        this.f490b = z;
    }

    /* renamed from: b */
    public abstract View mo631b();

    /* renamed from: b */
    public abstract void mo632b(int i);

    /* renamed from: b */
    public abstract void mo633b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo634c();

    /* renamed from: d */
    public abstract MenuInflater mo635d();

    /* renamed from: e */
    public abstract CharSequence mo636e();

    /* renamed from: f */
    public Object m637f() {
        return this.f489a;
    }

    /* renamed from: g */
    public abstract CharSequence mo638g();

    /* renamed from: h */
    public boolean m639h() {
        return this.f490b;
    }

    /* renamed from: i */
    public abstract void mo640i();

    /* renamed from: j */
    public abstract boolean mo641j();
}
