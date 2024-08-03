package android.support.v4.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import p000a.p005b.p009c.p019h.AbstractC0103r;

/* renamed from: android.support.v4.app.D */
/* loaded from: classes.dex */
public abstract class AbstractC0165D extends AbstractC0103r {

    /* renamed from: c */
    private final AbstractC0212s f622c;

    /* renamed from: d */
    private AbstractC0169H f623d;

    /* renamed from: e */
    private ComponentCallbacksC0205l f624e;

    /* renamed from: a */
    private static String m758a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public Object mo477a(ViewGroup viewGroup, int i) {
        if (this.f623d == null) {
            this.f623d = this.f622c.mo1056a();
        }
        long m760c = m760c(i);
        ComponentCallbacksC0205l mo1059a = this.f622c.mo1059a(m758a(viewGroup.getId(), m760c));
        if (mo1059a != null) {
            this.f623d.mo766a(mo1059a);
        } else {
            mo1059a = m759b(i);
            this.f623d.mo765a(viewGroup.getId(), mo1059a, m758a(viewGroup.getId(), m760c));
        }
        if (mo1059a != this.f624e) {
            mo1059a.m980g(false);
            mo1059a.m983h(false);
        }
        return mo1059a;
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public void mo479a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public void mo482a(ViewGroup viewGroup) {
        AbstractC0169H abstractC0169H = this.f623d;
        if (abstractC0169H != null) {
            abstractC0169H.mo771c();
            this.f623d = null;
        }
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public void mo483a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f623d == null) {
            this.f623d = this.f622c.mo1056a();
        }
        this.f623d.mo769b((ComponentCallbacksC0205l) obj);
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: a */
    public boolean mo484a(View view, Object obj) {
        return ((ComponentCallbacksC0205l) obj).m908A() == view;
    }

    /* renamed from: b */
    public abstract ComponentCallbacksC0205l m759b(int i);

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
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f624e;
        if (componentCallbacksC0205l != componentCallbacksC0205l2) {
            if (componentCallbacksC0205l2 != null) {
                componentCallbacksC0205l2.m980g(false);
                this.f624e.m983h(false);
            }
            componentCallbacksC0205l.m980g(true);
            componentCallbacksC0205l.m983h(true);
            this.f624e = componentCallbacksC0205l;
        }
    }

    /* renamed from: c */
    public long m760c(int i) {
        return i;
    }

    @Override // p000a.p005b.p009c.p019h.AbstractC0103r
    /* renamed from: c */
    public Parcelable mo489c() {
        return null;
    }
}
