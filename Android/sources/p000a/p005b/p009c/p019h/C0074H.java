package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: a.b.c.h.H */
/* loaded from: classes.dex */
public final class C0074H {

    /* renamed from: a */
    private WeakReference<View> f326a;

    /* renamed from: b */
    Runnable f327b = null;

    /* renamed from: c */
    Runnable f328c = null;

    /* renamed from: d */
    int f329d = -1;

    /* renamed from: a.b.c.h.H$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC0075I {

        /* renamed from: a */
        C0074H f330a;

        /* renamed from: b */
        boolean f331b;

        a(C0074H c0074h) {
            this.f330a = c0074h;
        }

        @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
        /* renamed from: a */
        public void mo348a(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC0075I interfaceC0075I = tag instanceof InterfaceC0075I ? (InterfaceC0075I) tag : null;
            if (interfaceC0075I != null) {
                interfaceC0075I.mo348a(view);
            }
        }

        @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
        /* renamed from: b */
        public void mo349b(View view) {
            int i = this.f330a.f329d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f330a.f329d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f331b) {
                C0074H c0074h = this.f330a;
                Runnable runnable = c0074h.f328c;
                if (runnable != null) {
                    c0074h.f328c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC0075I interfaceC0075I = tag instanceof InterfaceC0075I ? (InterfaceC0075I) tag : null;
                if (interfaceC0075I != null) {
                    interfaceC0075I.mo349b(view);
                }
                this.f331b = true;
            }
        }

        @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
        /* renamed from: c */
        public void mo350c(View view) {
            this.f331b = false;
            if (this.f330a.f329d > -1) {
                view.setLayerType(2, null);
            }
            C0074H c0074h = this.f330a;
            Runnable runnable = c0074h.f327b;
            if (runnable != null) {
                c0074h.f327b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC0075I interfaceC0075I = tag instanceof InterfaceC0075I ? (InterfaceC0075I) tag : null;
            if (interfaceC0075I != null) {
                interfaceC0075I.mo350c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0074H(View view) {
        this.f326a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m337a(View view, InterfaceC0075I interfaceC0075I) {
        if (interfaceC0075I != null) {
            view.animate().setListener(new C0072F(this, interfaceC0075I, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0074H m338a(float f) {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0074H m339a(long j) {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0074H m340a(InterfaceC0075I interfaceC0075I) {
        View view = this.f326a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, interfaceC0075I);
                interfaceC0075I = new a(this);
            }
            m337a(view, interfaceC0075I);
        }
        return this;
    }

    /* renamed from: a */
    public C0074H m341a(InterfaceC0077K interfaceC0077K) {
        View view = this.f326a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC0077K != null ? new C0073G(this, interfaceC0077K, view) : null);
        }
        return this;
    }

    /* renamed from: a */
    public C0074H m342a(Interpolator interpolator) {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public void m343a() {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long m344b() {
        View view = this.f326a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: b */
    public C0074H m345b(float f) {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0074H m346b(long j) {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void m347c() {
        View view = this.f326a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
