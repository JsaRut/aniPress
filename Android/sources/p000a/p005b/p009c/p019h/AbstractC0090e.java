package p000a.p005b.p009c.p019h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.b.c.h.e */
/* loaded from: classes.dex */
public abstract class AbstractC0090e {

    /* renamed from: a */
    private final Context f381a;

    /* renamed from: b */
    private a f382b;

    /* renamed from: c */
    private b f383c;

    /* renamed from: a.b.c.h.e$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: a.b.c.h.e$b */
    /* loaded from: classes.dex */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0090e(Context context) {
        this.f381a = context;
    }

    /* renamed from: a */
    public View mo419a(MenuItem menuItem) {
        return mo425c();
    }

    /* renamed from: a */
    public void m420a(a aVar) {
        this.f382b = aVar;
    }

    /* renamed from: a */
    public void mo421a(b bVar) {
        if (this.f383c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f383c = bVar;
    }

    /* renamed from: a */
    public void mo422a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public boolean mo423a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo424b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo425c();

    /* renamed from: d */
    public boolean mo426d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo427e() {
        return false;
    }

    /* renamed from: f */
    public void m428f() {
        this.f383c = null;
        this.f382b = null;
    }
}
