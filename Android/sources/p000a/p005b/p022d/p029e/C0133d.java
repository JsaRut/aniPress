package p000a.p005b.p022d.p029e;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p000a.p005b.p022d.p023a.C0120i;

/* renamed from: a.b.d.e.d */
/* loaded from: classes.dex */
public class C0133d extends ContextWrapper {

    /* renamed from: a */
    private int f491a;

    /* renamed from: b */
    private Resources.Theme f492b;

    /* renamed from: c */
    private LayoutInflater f493c;

    /* renamed from: d */
    private Configuration f494d;

    /* renamed from: e */
    private Resources f495e;

    public C0133d() {
        super(null);
    }

    public C0133d(Context context, int i) {
        super(context);
        this.f491a = i;
    }

    public C0133d(Context context, Resources.Theme theme) {
        super(context);
        this.f492b = theme;
    }

    /* renamed from: b */
    private Resources m646b() {
        Resources resources;
        if (this.f495e == null) {
            Configuration configuration = this.f494d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f495e = resources;
        }
        return this.f495e;
    }

    /* renamed from: c */
    private void m647c() {
        boolean z = this.f492b == null;
        if (z) {
            this.f492b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f492b.setTo(theme);
            }
        }
        m649a(this.f492b, this.f491a, z);
    }

    /* renamed from: a */
    public int m648a() {
        return this.f491a;
    }

    /* renamed from: a */
    protected void m649a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m646b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f493c == null) {
            this.f493c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f493c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f492b;
        if (theme != null) {
            return theme;
        }
        if (this.f491a == 0) {
            this.f491a = C0120i.Theme_AppCompat_Light;
        }
        m647c();
        return this.f492b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f491a != i) {
            this.f491a = i;
            m647c();
        }
    }
}
