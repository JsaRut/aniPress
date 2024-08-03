package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.ComponentCallbacksC0205l;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.AbstractC0103r;

/* renamed from: android.support.v4.app.G */
/* loaded from: classes.dex */
public abstract class AbstractC0168G extends AbstractC0103r {

    /* renamed from: c */
    private final AbstractC0212s f637c;

    /* renamed from: d */
    private AbstractC0169H f638d;

    /* renamed from: e */
    private ArrayList<ComponentCallbacksC0205l.d> f639e;

    /* renamed from: f */
    private ArrayList<ComponentCallbacksC0205l> f640f;

    /* renamed from: g */
    private ComponentCallbacksC0205l f641g;

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public Object mo477a(ViewGroup viewGroup, int i) {
        ComponentCallbacksC0205l.d dVar;
        ComponentCallbacksC0205l componentCallbacksC0205l;
        if (this.f640f.size() > i && (componentCallbacksC0205l = this.f640f.get(i)) != null) {
            return componentCallbacksC0205l;
        }
        if (this.f638d == null) {
            this.f638d = this.f637c.mo1056a();
        }
        ComponentCallbacksC0205l m762b = m762b(i);
        if (this.f639e.size() > i && (dVar = this.f639e.get(i)) != null) {
            m762b.m945a(dVar);
        }
        while (this.f640f.size() <= i) {
            this.f640f.add(null);
        }
        m762b.m980g(false);
        m762b.m983h(false);
        this.f640f.set(i, m762b);
        this.f638d.mo764a(viewGroup.getId(), m762b);
        return m762b;
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public void mo479a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f639e.clear();
            this.f640f.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f639e.add((ComponentCallbacksC0205l.d) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    ComponentCallbacksC0205l mo1058a = this.f637c.mo1058a(bundle, str);
                    if (mo1058a != null) {
                        while (this.f640f.size() <= parseInt) {
                            this.f640f.add(null);
                        }
                        mo1058a.m980g(false);
                        this.f640f.set(parseInt, mo1058a);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public void mo482a(ViewGroup viewGroup) {
        AbstractC0169H abstractC0169H = this.f638d;
        if (abstractC0169H != null) {
            abstractC0169H.mo771c();
            this.f638d = null;
        }
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public void mo483a(ViewGroup viewGroup, int i, Object obj) {
        ComponentCallbacksC0205l componentCallbacksC0205l = (ComponentCallbacksC0205l) obj;
        if (this.f638d == null) {
            this.f638d = this.f637c.mo1056a();
        }
        while (this.f639e.size() <= i) {
            this.f639e.add(null);
        }
        this.f639e.set(i, componentCallbacksC0205l.m911D() ? this.f637c.mo1057a(componentCallbacksC0205l) : null);
        this.f640f.set(i, null);
        this.f638d.mo770c(componentCallbacksC0205l);
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public boolean mo484a(View view, Object obj) {
        return ((ComponentCallbacksC0205l) obj).m908A() == view;
    }

    /* renamed from: b */
    public abstract ComponentCallbacksC0205l m762b(int i);

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: b */
    public void mo487b(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: b */
    public void mo488b(ViewGroup viewGroup, int i, Object obj) {
        ComponentCallbacksC0205l componentCallbacksC0205l = (ComponentCallbacksC0205l) obj;
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f641g;
        if (componentCallbacksC0205l != componentCallbacksC0205l2) {
            if (componentCallbacksC0205l2 != null) {
                componentCallbacksC0205l2.m980g(false);
                this.f641g.m983h(false);
            }
            componentCallbacksC0205l.m980g(true);
            componentCallbacksC0205l.m983h(true);
            this.f641g = componentCallbacksC0205l;
        }
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: c */
    public Parcelable mo489c() {
        Bundle bundle;
        if (this.f639e.size() > 0) {
            bundle = new Bundle();
            ComponentCallbacksC0205l.d[] dVarArr = new ComponentCallbacksC0205l.d[this.f639e.size()];
            this.f639e.toArray(dVarArr);
            bundle.putParcelableArray("states", dVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f640f.size(); i++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f640f.get(i);
            if (componentCallbacksC0205l != null && componentCallbacksC0205l.m911D()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f637c.mo1061a(bundle, "f" + i, componentCallbacksC0205l);
            }
        }
        return bundle;
    }
}
