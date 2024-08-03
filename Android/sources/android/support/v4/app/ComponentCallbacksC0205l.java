package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.AbstractC0144d;
import android.arch.lifecycle.C0148h;
import android.arch.lifecycle.C0153m;
import android.arch.lifecycle.C0159s;
import android.arch.lifecycle.InterfaceC0146f;
import android.arch.lifecycle.InterfaceC0160t;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.C0260f;
import android.support.v4.util.C0269o;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p000a.p005b.p009c.p019h.C0093h;

/* renamed from: android.support.v4.app.l */
/* loaded from: classes.dex */
public class ComponentCallbacksC0205l implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0146f, InterfaceC0160t {

    /* renamed from: a */
    private static final C0269o<String, Class<?>> f781a = new C0269o<>();

    /* renamed from: b */
    static final Object f782b = new Object();

    /* renamed from: A */
    int f783A;

    /* renamed from: B */
    String f784B;

    /* renamed from: C */
    boolean f785C;

    /* renamed from: D */
    boolean f786D;

    /* renamed from: E */
    boolean f787E;

    /* renamed from: F */
    boolean f788F;

    /* renamed from: G */
    boolean f789G;

    /* renamed from: I */
    boolean f791I;

    /* renamed from: J */
    ViewGroup f792J;

    /* renamed from: K */
    View f793K;

    /* renamed from: L */
    View f794L;

    /* renamed from: M */
    boolean f795M;

    /* renamed from: O */
    a f797O;

    /* renamed from: P */
    boolean f798P;

    /* renamed from: Q */
    boolean f799Q;

    /* renamed from: R */
    float f800R;

    /* renamed from: S */
    LayoutInflater f801S;

    /* renamed from: T */
    boolean f802T;

    /* renamed from: V */
    C0148h f804V;

    /* renamed from: W */
    InterfaceC0146f f805W;

    /* renamed from: d */
    Bundle f808d;

    /* renamed from: e */
    SparseArray<Parcelable> f809e;

    /* renamed from: f */
    Boolean f810f;

    /* renamed from: h */
    String f812h;

    /* renamed from: i */
    Bundle f813i;

    /* renamed from: j */
    ComponentCallbacksC0205l f814j;

    /* renamed from: l */
    int f816l;

    /* renamed from: m */
    boolean f817m;

    /* renamed from: n */
    boolean f818n;

    /* renamed from: o */
    boolean f819o;

    /* renamed from: p */
    boolean f820p;

    /* renamed from: q */
    boolean f821q;

    /* renamed from: r */
    boolean f822r;

    /* renamed from: s */
    int f823s;

    /* renamed from: t */
    LayoutInflaterFactory2C0219z f824t;

    /* renamed from: u */
    AbstractC0211r f825u;

    /* renamed from: v */
    LayoutInflaterFactory2C0219z f826v;

    /* renamed from: w */
    C0161A f827w;

    /* renamed from: x */
    C0159s f828x;

    /* renamed from: y */
    ComponentCallbacksC0205l f829y;

    /* renamed from: z */
    int f830z;

    /* renamed from: c */
    int f807c = 0;

    /* renamed from: g */
    int f811g = -1;

    /* renamed from: k */
    int f815k = -1;

    /* renamed from: H */
    boolean f790H = true;

    /* renamed from: N */
    boolean f796N = true;

    /* renamed from: U */
    C0148h f803U = new C0148h(this);

    /* renamed from: X */
    C0153m<InterfaceC0146f> f806X = new C0153m<>();

    /* renamed from: android.support.v4.app.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        View f831a;

        /* renamed from: b */
        Animator f832b;

        /* renamed from: c */
        int f833c;

        /* renamed from: d */
        int f834d;

        /* renamed from: e */
        int f835e;

        /* renamed from: f */
        int f836f;

        /* renamed from: g */
        Object f837g = null;

        /* renamed from: h */
        Object f838h;

        /* renamed from: i */
        Object f839i;

        /* renamed from: j */
        Object f840j;

        /* renamed from: k */
        Object f841k;

        /* renamed from: l */
        Object f842l;

        /* renamed from: m */
        Boolean f843m;

        /* renamed from: n */
        Boolean f844n;

        /* renamed from: o */
        AbstractC0192ba f845o;

        /* renamed from: p */
        AbstractC0192ba f846p;

        /* renamed from: q */
        boolean f847q;

        /* renamed from: r */
        c f848r;

        /* renamed from: s */
        boolean f849s;

        a() {
            Object obj = ComponentCallbacksC0205l.f782b;
            this.f838h = obj;
            this.f839i = null;
            this.f840j = obj;
            this.f841k = null;
            this.f842l = obj;
            this.f845o = null;
            this.f846p = null;
        }
    }

    /* renamed from: android.support.v4.app.l$b */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo1007a();

        /* renamed from: b */
        void mo1008b();
    }

    /* renamed from: android.support.v4.app.l$d */
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new C0206m();

        /* renamed from: a */
        final Bundle f850a;

        public d(Bundle bundle) {
            this.f850a = bundle;
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle;
            this.f850a = parcel.readBundle();
            if (classLoader == null || (bundle = this.f850a) == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f850a);
        }
    }

    /* renamed from: a */
    public static ComponentCallbacksC0205l m905a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f781a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f781a.put(str, cls);
            }
            ComponentCallbacksC0205l componentCallbacksC0205l = (ComponentCallbacksC0205l) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC0205l.getClass().getClassLoader());
                componentCallbacksC0205l.m993m(bundle);
            }
            return componentCallbacksC0205l;
        } catch (ClassNotFoundException e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    /* renamed from: a */
    public static boolean m906a(Context context, String str) {
        try {
            Class<?> cls = f781a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f781a.put(str, cls);
            }
            return ComponentCallbacksC0205l.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ea */
    private a m907ea() {
        if (this.f797O == null) {
            this.f797O = new a();
        }
        return this.f797O;
    }

    /* renamed from: A */
    public View m908A() {
        return this.f793K;
    }

    /* renamed from: B */
    public void m909B() {
        this.f811g = -1;
        this.f812h = null;
        this.f817m = false;
        this.f818n = false;
        this.f819o = false;
        this.f820p = false;
        this.f821q = false;
        this.f823s = 0;
        this.f824t = null;
        this.f826v = null;
        this.f825u = null;
        this.f830z = 0;
        this.f783A = 0;
        this.f784B = null;
        this.f785C = false;
        this.f786D = false;
        this.f788F = false;
    }

    /* renamed from: C */
    void m910C() {
        if (this.f825u == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f826v = new LayoutInflaterFactory2C0219z();
        this.f826v.m1122a(this.f825u, new C0203j(this), this);
    }

    /* renamed from: D */
    public final boolean m911D() {
        return this.f825u != null && this.f817m;
    }

    /* renamed from: E */
    public final boolean m912E() {
        return this.f785C;
    }

    /* renamed from: F */
    public boolean m913F() {
        a aVar = this.f797O;
        if (aVar == null) {
            return false;
        }
        return aVar.f849s;
    }

    /* renamed from: G */
    public final boolean m914G() {
        return this.f823s > 0;
    }

    /* renamed from: H */
    public boolean m915H() {
        a aVar = this.f797O;
        if (aVar == null) {
            return false;
        }
        return aVar.f847q;
    }

    /* renamed from: I */
    public final boolean m916I() {
        return this.f807c >= 4;
    }

    /* renamed from: J */
    public final boolean m917J() {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f824t;
        if (layoutInflaterFactory2C0219z == null) {
            return false;
        }
        return layoutInflaterFactory2C0219z.mo1064c();
    }

    /* renamed from: K */
    public void m918K() {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1176r();
        }
    }

    /* renamed from: L */
    public void m919L() {
        this.f791I = true;
        ActivityC0208o m968d = m968d();
        boolean z = m968d != null && m968d.isChangingConfigurations();
        C0159s c0159s = this.f828x;
        if (c0159s == null || z) {
            return;
        }
        c0159s.m750a();
    }

    /* renamed from: M */
    public void m920M() {
    }

    /* renamed from: N */
    public void mo886N() {
        this.f791I = true;
    }

    /* renamed from: O */
    public void mo887O() {
        this.f791I = true;
    }

    /* renamed from: P */
    public void m921P() {
        this.f791I = true;
    }

    /* renamed from: Q */
    public void m922Q() {
        this.f791I = true;
    }

    /* renamed from: R */
    public void mo888R() {
        this.f791I = true;
    }

    /* renamed from: S */
    public void mo889S() {
        this.f791I = true;
    }

    /* renamed from: T */
    public AbstractC0212s m923T() {
        return this.f826v;
    }

    /* renamed from: U */
    public void m924U() {
        this.f803U.m728b(AbstractC0144d.a.ON_DESTROY);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1153g();
        }
        this.f807c = 0;
        this.f791I = false;
        this.f802T = false;
        m919L();
        if (this.f791I) {
            this.f826v = null;
            return;
        }
        throw new C0194ca("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: V */
    public void m925V() {
        if (this.f793K != null) {
            this.f804V.m728b(AbstractC0144d.a.ON_DESTROY);
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1156h();
        }
        this.f807c = 1;
        this.f791I = false;
        mo886N();
        if (this.f791I) {
            AbstractC0186X.m837a(this).mo772a();
            this.f822r = false;
        } else {
            throw new C0194ca("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* renamed from: W */
    public void m926W() {
        this.f791I = false;
        mo887O();
        this.f801S = null;
        if (!this.f791I) {
            throw new C0194ca("Fragment " + this + " did not call through to super.onDetach()");
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            if (this.f788F) {
                layoutInflaterFactory2C0219z.m1153g();
                this.f826v = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
    }

    /* renamed from: X */
    public void m927X() {
        onLowMemory();
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1159i();
        }
    }

    /* renamed from: Y */
    public void m928Y() {
        if (this.f793K != null) {
            this.f804V.m728b(AbstractC0144d.a.ON_PAUSE);
        }
        this.f803U.m728b(AbstractC0144d.a.ON_PAUSE);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1161j();
        }
        this.f807c = 3;
        this.f791I = false;
        m921P();
        if (this.f791I) {
            return;
        }
        throw new C0194ca("Fragment " + this + " did not call through to super.onPause()");
    }

    /* renamed from: Z */
    public void m929Z() {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1176r();
            this.f826v.m1172o();
        }
        this.f807c = 4;
        this.f791I = false;
        m922Q();
        if (!this.f791I) {
            throw new C0194ca("Fragment " + this + " did not call through to super.onResume()");
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z2 = this.f826v;
        if (layoutInflaterFactory2C0219z2 != null) {
            layoutInflaterFactory2C0219z2.m1163k();
            this.f826v.m1172o();
        }
        this.f803U.m728b(AbstractC0144d.a.ON_RESUME);
        if (this.f793K != null) {
            this.f804V.m728b(AbstractC0144d.a.ON_RESUME);
        }
    }

    @Override // android.arch.lifecycle.InterfaceC0146f
    /* renamed from: a */
    public AbstractC0144d mo714a() {
        return this.f803U;
    }

    /* renamed from: a */
    public ComponentCallbacksC0205l m930a(String str) {
        if (str.equals(this.f812h)) {
            return this;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            return layoutInflaterFactory2C0219z.m1130b(str);
        }
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater m931a(Bundle bundle) {
        AbstractC0211r abstractC0211r = this.f825u;
        if (abstractC0211r == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo1022f = abstractC0211r.mo1022f();
        m986j();
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        layoutInflaterFactory2C0219z.m1173p();
        C0093h.m437a(mo1022f, layoutInflaterFactory2C0219z);
        return mo1022f;
    }

    /* renamed from: a */
    public View m932a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation m933a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public void m934a(int i) {
        if (this.f797O == null && i == 0) {
            return;
        }
        m907ea().f834d = i;
    }

    /* renamed from: a */
    public void m935a(int i, int i2) {
        if (this.f797O == null && i == 0 && i2 == 0) {
            return;
        }
        m907ea();
        a aVar = this.f797O;
        aVar.f835e = i;
        aVar.f836f = i2;
    }

    /* renamed from: a */
    public void m936a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public final void m937a(int i, ComponentCallbacksC0205l componentCallbacksC0205l) {
        StringBuilder sb;
        String str;
        this.f811g = i;
        if (componentCallbacksC0205l != null) {
            sb = new StringBuilder();
            sb.append(componentCallbacksC0205l.f812h);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f811g);
        this.f812h = sb.toString();
    }

    /* renamed from: a */
    public void m938a(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: a */
    public void m939a(Animator animator) {
        m907ea().f832b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void m940a(Activity activity) {
        this.f791I = true;
    }

    @Deprecated
    /* renamed from: a */
    public void m941a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f791I = true;
    }

    /* renamed from: a */
    public void mo891a(Context context) {
        this.f791I = true;
        AbstractC0211r abstractC0211r = this.f825u;
        Activity m1052b = abstractC0211r == null ? null : abstractC0211r.m1052b();
        if (m1052b != null) {
            this.f791I = false;
            m940a(m1052b);
        }
    }

    /* renamed from: a */
    public void m942a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f791I = true;
        AbstractC0211r abstractC0211r = this.f825u;
        Activity m1052b = abstractC0211r == null ? null : abstractC0211r.m1052b();
        if (m1052b != null) {
            this.f791I = false;
            m941a(m1052b, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void m943a(Configuration configuration) {
        onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1113a(configuration);
        }
    }

    /* renamed from: a */
    public void m944a(c cVar) {
        m907ea();
        c cVar2 = this.f797O.f848r;
        if (cVar == cVar2) {
            return;
        }
        if (cVar != null && cVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        a aVar = this.f797O;
        if (aVar.f847q) {
            aVar.f848r = cVar;
        }
        if (cVar != null) {
            cVar.mo1007a();
        }
    }

    /* renamed from: a */
    public void m945a(d dVar) {
        Bundle bundle;
        if (this.f811g >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        if (dVar == null || (bundle = dVar.f850a) == null) {
            bundle = null;
        }
        this.f808d = bundle;
    }

    /* renamed from: a */
    public void m946a(ComponentCallbacksC0205l componentCallbacksC0205l) {
    }

    /* renamed from: a */
    public void m947a(Menu menu) {
    }

    /* renamed from: a */
    public void m948a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public void m949a(View view) {
        m907ea().f831a = view;
    }

    /* renamed from: a */
    public void m950a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void m951a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f830z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f783A));
        printWriter.print(" mTag=");
        printWriter.println(this.f784B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f807c);
        printWriter.print(" mIndex=");
        printWriter.print(this.f811g);
        printWriter.print(" mWho=");
        printWriter.print(this.f812h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f823s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f817m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f818n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f819o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f820p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f785C);
        printWriter.print(" mDetached=");
        printWriter.print(this.f786D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f790H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f789G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f787E);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f788F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f796N);
        if (this.f824t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f824t);
        }
        if (this.f825u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f825u);
        }
        if (this.f829y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f829y);
        }
        if (this.f813i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f813i);
        }
        if (this.f808d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f808d);
        }
        if (this.f809e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f809e);
        }
        if (this.f814j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f814j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f816l);
        }
        if (m997q() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m997q());
        }
        if (this.f792J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f792J);
        }
        if (this.f793K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f793K);
        }
        if (this.f794L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f793K);
        }
        if (m978g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m978g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m1005y());
        }
        if (m988k() != null) {
            AbstractC0186X.m837a(this).mo773a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f826v != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f826v + ":");
            this.f826v.mo1062a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void m952a(boolean z) {
    }

    /* renamed from: a */
    public boolean m953a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: aa */
    public void m954aa() {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1176r();
            this.f826v.m1172o();
        }
        this.f807c = 3;
        this.f791I = false;
        mo888R();
        if (!this.f791I) {
            throw new C0194ca("Fragment " + this + " did not call through to super.onStart()");
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z2 = this.f826v;
        if (layoutInflaterFactory2C0219z2 != null) {
            layoutInflaterFactory2C0219z2.m1165l();
        }
        this.f803U.m728b(AbstractC0144d.a.ON_START);
        if (this.f793K != null) {
            this.f804V.m728b(AbstractC0144d.a.ON_START);
        }
    }

    /* renamed from: b */
    public Animator m955b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    public void m956b() {
        a aVar = this.f797O;
        c cVar = null;
        if (aVar != null) {
            aVar.f847q = false;
            c cVar2 = aVar.f848r;
            aVar.f848r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.mo1008b();
        }
    }

    /* renamed from: b */
    public void m957b(int i) {
        m907ea().f833c = i;
    }

    /* renamed from: b */
    public void mo893b(Bundle bundle) {
        this.f791I = true;
    }

    /* renamed from: b */
    public void m958b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1176r();
        }
        this.f822r = true;
        this.f805W = new C0204k(this);
        this.f804V = null;
        this.f793K = m932a(layoutInflater, viewGroup, bundle);
        if (this.f793K != null) {
            this.f805W.mo714a();
            this.f806X.mo694a((C0153m<InterfaceC0146f>) this.f805W);
        } else {
            if (this.f804V != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f805W = null;
        }
    }

    /* renamed from: b */
    public void m959b(Menu menu) {
    }

    /* renamed from: b */
    public void m960b(boolean z) {
    }

    /* renamed from: b */
    public boolean m961b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f785C) {
            return false;
        }
        if (this.f789G && this.f790H) {
            m948a(menu, menuInflater);
            z = true;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        return layoutInflaterFactory2C0219z != null ? z | layoutInflaterFactory2C0219z.m1126a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean m962b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: ba */
    public void m963ba() {
        if (this.f793K != null) {
            this.f804V.m728b(AbstractC0144d.a.ON_STOP);
        }
        this.f803U.m728b(AbstractC0144d.a.ON_STOP);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1168m();
        }
        this.f807c = 2;
        this.f791I = false;
        mo889S();
        if (this.f791I) {
            return;
        }
        throw new C0194ca("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // android.arch.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public C0159s mo752c() {
        if (m988k() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f828x == null) {
            this.f828x = new C0159s();
        }
        return this.f828x;
    }

    /* renamed from: c */
    public void mo894c(Bundle bundle) {
        this.f791I = true;
        m989k(bundle);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z == null || layoutInflaterFactory2C0219z.m1143c(1)) {
            return;
        }
        this.f826v.m1150f();
    }

    /* renamed from: c */
    public void m964c(Menu menu) {
        if (this.f785C) {
            return;
        }
        if (this.f789G && this.f790H) {
            m947a(menu);
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1124a(menu);
        }
    }

    /* renamed from: c */
    public void m965c(boolean z) {
    }

    /* renamed from: c */
    public boolean m966c(MenuItem menuItem) {
        if (this.f785C) {
            return false;
        }
        if (m953a(menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        return layoutInflaterFactory2C0219z != null && layoutInflaterFactory2C0219z.m1127a(menuItem);
    }

    /* renamed from: ca */
    public final Context m967ca() {
        Context m988k = m988k();
        if (m988k != null) {
            return m988k;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: d */
    public final ActivityC0208o m968d() {
        AbstractC0211r abstractC0211r = this.f825u;
        if (abstractC0211r == null) {
            return null;
        }
        return (ActivityC0208o) abstractC0211r.m1052b();
    }

    /* renamed from: d */
    public LayoutInflater mo895d(Bundle bundle) {
        return m931a(bundle);
    }

    /* renamed from: d */
    public void m969d(boolean z) {
        m960b(z);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1125a(z);
        }
    }

    /* renamed from: d */
    public boolean m970d(Menu menu) {
        boolean z = false;
        if (this.f785C) {
            return false;
        }
        if (this.f789G && this.f790H) {
            m959b(menu);
            z = true;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        return layoutInflaterFactory2C0219z != null ? z | layoutInflaterFactory2C0219z.m1138b(menu) : z;
    }

    /* renamed from: d */
    public boolean m971d(MenuItem menuItem) {
        if (this.f785C) {
            return false;
        }
        if (this.f789G && this.f790H && m962b(menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        return layoutInflaterFactory2C0219z != null && layoutInflaterFactory2C0219z.m1139b(menuItem);
    }

    /* renamed from: da */
    public void m972da() {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f824t;
        if (layoutInflaterFactory2C0219z == null || layoutInflaterFactory2C0219z.f915s == null) {
            m907ea().f847q = false;
        } else if (Looper.myLooper() != this.f824t.f915s.m1055e().getLooper()) {
            this.f824t.f915s.m1055e().postAtFrontOfQueue(new RunnableC0202i(this));
        } else {
            m956b();
        }
    }

    /* renamed from: e */
    public void mo896e(Bundle bundle) {
    }

    /* renamed from: e */
    public void m973e(boolean z) {
        m965c(z);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1137b(z);
        }
    }

    /* renamed from: e */
    public boolean m974e() {
        Boolean bool;
        a aVar = this.f797O;
        if (aVar == null || (bool = aVar.f844n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void m975f(Bundle bundle) {
        this.f791I = true;
    }

    /* renamed from: f */
    public void m976f(boolean z) {
        m907ea().f849s = z;
    }

    /* renamed from: f */
    public boolean m977f() {
        Boolean bool;
        a aVar = this.f797O;
        if (aVar == null || (bool = aVar.f843m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: g */
    public View m978g() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f831a;
    }

    /* renamed from: g */
    public void m979g(Bundle bundle) {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1176r();
        }
        this.f807c = 2;
        this.f791I = false;
        mo893b(bundle);
        if (this.f791I) {
            LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z2 = this.f826v;
            if (layoutInflaterFactory2C0219z2 != null) {
                layoutInflaterFactory2C0219z2.m1147e();
                return;
            }
            return;
        }
        throw new C0194ca("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: g */
    public void m980g(boolean z) {
        if (this.f790H != z) {
            this.f790H = z;
            if (this.f789G && m911D() && !m912E()) {
                this.f825u.mo1025i();
            }
        }
    }

    /* renamed from: h */
    public Animator m981h() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f832b;
    }

    /* renamed from: h */
    public void m982h(Bundle bundle) {
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z != null) {
            layoutInflaterFactory2C0219z.m1176r();
        }
        this.f807c = 1;
        this.f791I = false;
        mo894c(bundle);
        this.f802T = true;
        if (this.f791I) {
            this.f803U.m728b(AbstractC0144d.a.ON_CREATE);
            return;
        }
        throw new C0194ca("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: h */
    public void m983h(boolean z) {
        if (!this.f796N && z && this.f807c < 3 && this.f824t != null && m911D() && this.f802T) {
            this.f824t.m1164k(this);
        }
        this.f796N = z;
        this.f795M = this.f807c < 3 && !z;
        if (this.f808d != null) {
            this.f810f = Boolean.valueOf(z);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final Bundle m984i() {
        return this.f813i;
    }

    /* renamed from: i */
    public LayoutInflater m985i(Bundle bundle) {
        this.f801S = mo895d(bundle);
        return this.f801S;
    }

    /* renamed from: j */
    public final AbstractC0212s m986j() {
        if (this.f826v == null) {
            m910C();
            int i = this.f807c;
            if (i >= 4) {
                this.f826v.m1163k();
            } else if (i >= 3) {
                this.f826v.m1165l();
            } else if (i >= 2) {
                this.f826v.m1147e();
            } else if (i >= 1) {
                this.f826v.m1150f();
            }
        }
        return this.f826v;
    }

    /* renamed from: j */
    public void m987j(Bundle bundle) {
        Parcelable m1179u;
        mo896e(bundle);
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f826v;
        if (layoutInflaterFactory2C0219z == null || (m1179u = layoutInflaterFactory2C0219z.m1179u()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", m1179u);
    }

    /* renamed from: k */
    public Context m988k() {
        AbstractC0211r abstractC0211r = this.f825u;
        if (abstractC0211r == null) {
            return null;
        }
        return abstractC0211r.m1053c();
    }

    /* renamed from: k */
    public void m989k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f826v == null) {
            m910C();
        }
        this.f826v.m1114a(parcelable, this.f827w);
        this.f827w = null;
        this.f826v.m1150f();
    }

    /* renamed from: l */
    public Object m990l() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f837g;
    }

    /* renamed from: l */
    public final void m991l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f809e;
        if (sparseArray != null) {
            this.f794L.restoreHierarchyState(sparseArray);
            this.f809e = null;
        }
        this.f791I = false;
        m975f(bundle);
        if (this.f791I) {
            if (this.f793K != null) {
                this.f804V.m728b(AbstractC0144d.a.ON_CREATE);
            }
        } else {
            throw new C0194ca("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* renamed from: m */
    public AbstractC0192ba m992m() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f845o;
    }

    /* renamed from: m */
    public void m993m(Bundle bundle) {
        if (this.f811g >= 0 && m917J()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.f813i = bundle;
    }

    /* renamed from: n */
    public Object m994n() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f839i;
    }

    /* renamed from: o */
    public AbstractC0192ba m995o() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f846p;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f791I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m968d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f791I = true;
    }

    /* renamed from: p */
    public final AbstractC0212s m996p() {
        return this.f824t;
    }

    /* renamed from: q */
    public int m997q() {
        a aVar = this.f797O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f834d;
    }

    /* renamed from: r */
    public int m998r() {
        a aVar = this.f797O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f835e;
    }

    /* renamed from: s */
    public int m999s() {
        a aVar = this.f797O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f836f;
    }

    /* renamed from: t */
    public Object m1000t() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f840j;
        return obj == f782b ? m994n() : obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0260f.m1353a(this, sb);
        if (this.f811g >= 0) {
            sb.append(" #");
            sb.append(this.f811g);
        }
        if (this.f830z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f830z));
        }
        if (this.f784B != null) {
            sb.append(" ");
            sb.append(this.f784B);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final Resources m1001u() {
        return m967ca().getResources();
    }

    /* renamed from: v */
    public Object m1002v() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f838h;
        return obj == f782b ? m990l() : obj;
    }

    /* renamed from: w */
    public Object m1003w() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        return aVar.f841k;
    }

    /* renamed from: x */
    public Object m1004x() {
        a aVar = this.f797O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f842l;
        return obj == f782b ? m1003w() : obj;
    }

    /* renamed from: y */
    public int m1005y() {
        a aVar = this.f797O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f833c;
    }

    /* renamed from: z */
    public boolean m1006z() {
        return this.f796N;
    }
}
