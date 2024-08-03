package android.support.v4.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0159s;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.AbstractC0212s;
import android.support.v4.app.ComponentCallbacksC0205l;
import android.support.v4.util.C0258d;
import android.support.v4.util.C0260f;
import android.support.v4.util.C0261g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v4.app.z */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0219z extends AbstractC0212s implements LayoutInflater.Factory2 {

    /* renamed from: a */
    static boolean f887a = false;

    /* renamed from: b */
    static Field f888b;

    /* renamed from: c */
    static final Interpolator f889c = new DecelerateInterpolator(2.5f);

    /* renamed from: d */
    static final Interpolator f890d = new DecelerateInterpolator(1.5f);

    /* renamed from: e */
    static final Interpolator f891e = new AccelerateInterpolator(2.5f);

    /* renamed from: f */
    static final Interpolator f892f = new AccelerateInterpolator(1.5f);

    /* renamed from: A */
    String f893A;

    /* renamed from: B */
    boolean f894B;

    /* renamed from: C */
    ArrayList<C0195d> f895C;

    /* renamed from: D */
    ArrayList<Boolean> f896D;

    /* renamed from: E */
    ArrayList<ComponentCallbacksC0205l> f897E;

    /* renamed from: H */
    ArrayList<j> f900H;

    /* renamed from: I */
    C0161A f901I;

    /* renamed from: g */
    ArrayList<h> f903g;

    /* renamed from: h */
    boolean f904h;

    /* renamed from: k */
    SparseArray<ComponentCallbacksC0205l> f907k;

    /* renamed from: l */
    ArrayList<C0195d> f908l;

    /* renamed from: m */
    ArrayList<ComponentCallbacksC0205l> f909m;

    /* renamed from: n */
    ArrayList<C0195d> f910n;

    /* renamed from: o */
    ArrayList<Integer> f911o;

    /* renamed from: p */
    ArrayList<AbstractC0212s.c> f912p;

    /* renamed from: s */
    AbstractC0211r f915s;

    /* renamed from: t */
    AbstractC0209p f916t;

    /* renamed from: u */
    ComponentCallbacksC0205l f917u;

    /* renamed from: v */
    ComponentCallbacksC0205l f918v;

    /* renamed from: w */
    boolean f919w;

    /* renamed from: x */
    boolean f920x;

    /* renamed from: y */
    boolean f921y;

    /* renamed from: z */
    boolean f922z;

    /* renamed from: i */
    int f905i = 0;

    /* renamed from: j */
    final ArrayList<ComponentCallbacksC0205l> f906j = new ArrayList<>();

    /* renamed from: q */
    private final CopyOnWriteArrayList<f> f913q = new CopyOnWriteArrayList<>();

    /* renamed from: r */
    int f914r = 0;

    /* renamed from: F */
    Bundle f898F = null;

    /* renamed from: G */
    SparseArray<Parcelable> f899G = null;

    /* renamed from: J */
    Runnable f902J = new RunnableC0213t(this);

    /* renamed from: android.support.v4.app.z$a */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: b */
        View f923b;

        a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f923b = view;
        }

        @Override // android.support.v4.app.LayoutInflaterFactory2C0219z.b, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C0107v.m529q(this.f923b) || Build.VERSION.SDK_INT >= 24) {
                this.f923b.post(new RunnableC0218y(this));
            } else {
                this.f923b.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.z$b */
    /* loaded from: classes.dex */
    public static class b implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f924a;

        public b(Animation.AnimationListener animationListener) {
            this.f924a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f924a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f924a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f924a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.z$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final Animation f925a;

        /* renamed from: b */
        public final Animator f926b;

        c(Animator animator) {
            this.f925a = null;
            this.f926b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        c(Animation animation) {
            this.f925a = animation;
            this.f926b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.z$d */
    /* loaded from: classes.dex */
    public static class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f927a;

        d(View view) {
            this.f927a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f927a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f927a.setLayerType(2, null);
        }
    }

    /* renamed from: android.support.v4.app.z$e */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f928a;

        /* renamed from: b */
        private final View f929b;

        /* renamed from: c */
        private boolean f930c;

        /* renamed from: d */
        private boolean f931d;

        /* renamed from: e */
        private boolean f932e;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f932e = true;
            this.f928a = viewGroup;
            this.f929b = view;
            addAnimation(animation);
            this.f928a.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f932e = true;
            if (this.f930c) {
                return !this.f931d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f930c = true;
                ViewTreeObserverOnPreDrawListenerC0190aa.m844a(this.f928a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f932e = true;
            if (this.f930c) {
                return !this.f931d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f930c = true;
                ViewTreeObserverOnPreDrawListenerC0190aa.m844a(this.f928a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f930c || !this.f932e) {
                this.f928a.endViewTransition(this.f929b);
                this.f931d = true;
            } else {
                this.f932e = false;
                this.f928a.post(this);
            }
        }
    }

    /* renamed from: android.support.v4.app.z$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        final AbstractC0212s.b f933a;

        /* renamed from: b */
        final boolean f934b;
    }

    /* renamed from: android.support.v4.app.z$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public static final int[] f935a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* renamed from: android.support.v4.app.z$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        boolean mo867a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.z$i */
    /* loaded from: classes.dex */
    private class i implements h {

        /* renamed from: a */
        final String f936a;

        /* renamed from: b */
        final int f937b;

        /* renamed from: c */
        final int f938c;

        i(String str, int i, int i2) {
            this.f936a = str;
            this.f937b = i;
            this.f938c = i2;
        }

        @Override // android.support.v4.app.LayoutInflaterFactory2C0219z.h
        /* renamed from: a */
        public boolean mo867a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2) {
            AbstractC0212s m923T;
            ComponentCallbacksC0205l componentCallbacksC0205l = LayoutInflaterFactory2C0219z.this.f918v;
            if (componentCallbacksC0205l == null || this.f937b >= 0 || this.f936a != null || (m923T = componentCallbacksC0205l.m923T()) == null || !m923T.mo1065d()) {
                return LayoutInflaterFactory2C0219z.this.m1128a(arrayList, arrayList2, this.f936a, this.f937b, this.f938c);
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.app.z$j */
    /* loaded from: classes.dex */
    public static class j implements ComponentCallbacksC0205l.c {

        /* renamed from: a */
        final boolean f940a;

        /* renamed from: b */
        final C0195d f941b;

        /* renamed from: c */
        private int f942c;

        j(C0195d c0195d, boolean z) {
            this.f940a = z;
            this.f941b = c0195d;
        }

        @Override // android.support.v4.app.ComponentCallbacksC0205l.c
        /* renamed from: a */
        public void mo1007a() {
            this.f942c++;
        }

        @Override // android.support.v4.app.ComponentCallbacksC0205l.c
        /* renamed from: b */
        public void mo1008b() {
            this.f942c--;
            if (this.f942c != 0) {
                return;
            }
            this.f941b.f724a.m1181w();
        }

        /* renamed from: c */
        public void m1183c() {
            C0195d c0195d = this.f941b;
            c0195d.f724a.m1116a(c0195d, this.f940a, false, false);
        }

        /* renamed from: d */
        public void m1184d() {
            boolean z = this.f942c > 0;
            LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f941b.f724a;
            int size = layoutInflaterFactory2C0219z.f906j.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0205l componentCallbacksC0205l = layoutInflaterFactory2C0219z.f906j.get(i);
                componentCallbacksC0205l.m944a((ComponentCallbacksC0205l.c) null);
                if (z && componentCallbacksC0205l.m915H()) {
                    componentCallbacksC0205l.m972da();
                }
            }
            C0195d c0195d = this.f941b;
            c0195d.f724a.m1116a(c0195d, this.f940a, !z, true);
        }

        /* renamed from: e */
        public boolean m1185e() {
            return this.f942c == 0;
        }
    }

    /* renamed from: A */
    private void m1080A() {
        this.f904h = false;
        this.f896D.clear();
        this.f895C.clear();
    }

    /* renamed from: B */
    private void m1081B() {
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.m978g() != null) {
                    int m1005y = valueAt.m1005y();
                    View m978g = valueAt.m978g();
                    Animation animation = m978g.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m978g.clearAnimation();
                    }
                    valueAt.m949a((View) null);
                    m1117a(valueAt, m1005y, 0, 0, false);
                } else if (valueAt.m981h() != null) {
                    valueAt.m981h().end();
                }
            }
        }
    }

    /* renamed from: C */
    private void m1082C() {
        if (this.f900H != null) {
            while (!this.f900H.isEmpty()) {
                this.f900H.remove(0).m1184d();
            }
        }
    }

    /* renamed from: a */
    private int m1083a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, C0258d<ComponentCallbacksC0205l> c0258d) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0195d c0195d = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (c0195d.m874g() && !c0195d.m866a(arrayList, i5 + 1, i3)) {
                if (this.f900H == null) {
                    this.f900H = new ArrayList<>();
                }
                j jVar = new j(c0195d, booleanValue);
                this.f900H.add(jVar);
                c0195d.m863a(jVar);
                if (booleanValue) {
                    c0195d.m872e();
                } else {
                    c0195d.m869b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, c0195d);
                }
                m1089a(c0258d);
            }
        }
        return i4;
    }

    /* renamed from: a */
    static c m1084a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(f890d);
        alphaAnimation.setDuration(220L);
        return new c(alphaAnimation);
    }

    /* renamed from: a */
    static c m1085a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f889c);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f890d);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new c(animationSet);
    }

    /* renamed from: a */
    private static Animation.AnimationListener m1086a(Animation animation) {
        String str;
        try {
            if (f888b == null) {
                f888b = Animation.class.getDeclaredField("mListener");
                f888b.setAccessible(true);
            }
            return (Animation.AnimationListener) f888b.get(animation);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m1087a(C0161A c0161a) {
        if (c0161a == null) {
            return;
        }
        List<ComponentCallbacksC0205l> m754b = c0161a.m754b();
        if (m754b != null) {
            Iterator<ComponentCallbacksC0205l> it = m754b.iterator();
            while (it.hasNext()) {
                it.next().f788F = true;
            }
        }
        List<C0161A> m753a = c0161a.m753a();
        if (m753a != null) {
            Iterator<C0161A> it2 = m753a.iterator();
            while (it2.hasNext()) {
                m1087a(it2.next());
            }
        }
    }

    /* renamed from: a */
    private void m1088a(ComponentCallbacksC0205l componentCallbacksC0205l, c cVar, int i2) {
        View view = componentCallbacksC0205l.f793K;
        ViewGroup viewGroup = componentCallbacksC0205l.f792J;
        viewGroup.startViewTransition(view);
        componentCallbacksC0205l.m957b(i2);
        Animation animation = cVar.f925a;
        if (animation != null) {
            e eVar = new e(animation, viewGroup, view);
            componentCallbacksC0205l.m949a(componentCallbacksC0205l.f793K);
            eVar.setAnimationListener(new C0215v(this, m1086a(eVar), viewGroup, componentCallbacksC0205l));
            m1099b(view, cVar);
            componentCallbacksC0205l.f793K.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f926b;
        componentCallbacksC0205l.m939a(animator);
        animator.addListener(new C0216w(this, viewGroup, view, componentCallbacksC0205l));
        animator.setTarget(componentCallbacksC0205l.f793K);
        m1099b(componentCallbacksC0205l.f793K, cVar);
        animator.start();
    }

    /* renamed from: a */
    private void m1089a(C0258d<ComponentCallbacksC0205l> c0258d) {
        int i2 = this.f914r;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.f906j.size();
        for (int i3 = 0; i3 < size; i3++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i3);
            if (componentCallbacksC0205l.f807c < min) {
                m1117a(componentCallbacksC0205l, min, componentCallbacksC0205l.m997q(), componentCallbacksC0205l.m998r(), false);
                if (componentCallbacksC0205l.f793K != null && !componentCallbacksC0205l.f785C && componentCallbacksC0205l.f798P) {
                    c0258d.add(componentCallbacksC0205l);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1090a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0261g("FragmentManager"));
        AbstractC0211r abstractC0211r = this.f915s;
        try {
            if (abstractC0211r != null) {
                abstractC0211r.mo1020a("  ", null, printWriter, new String[0]);
            } else {
                mo1062a("  ", (FileDescriptor) null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* renamed from: a */
    private void m1091a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.f900H;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.f900H.get(i2);
            if (arrayList == null || jVar.f940a || (indexOf2 = arrayList.indexOf(jVar.f941b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (jVar.m1185e() || (arrayList != null && jVar.f941b.m866a(arrayList, 0, arrayList.size()))) {
                    this.f900H.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || jVar.f940a || (indexOf = arrayList.indexOf(jVar.f941b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.m1184d();
                    }
                }
                i2++;
            }
            jVar.m1183c();
            i2++;
        }
    }

    /* renamed from: a */
    private static void m1092a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0195d c0195d = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                c0195d.m861a(-1);
                c0195d.m869b(i2 == i3 + (-1));
            } else {
                c0195d.m861a(1);
                c0195d.m872e();
            }
            i2++;
        }
    }

    /* renamed from: a */
    static boolean m1093a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (m1093a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1094a(c cVar) {
        Animation animation = cVar.f925a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m1093a(cVar.f926b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i2 = 0; i2 < animations.size(); i2++) {
            if (animations.get(i2) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1095a(View view, c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0107v.m528p(view) && m1094a(cVar);
    }

    /* renamed from: a */
    private boolean m1096a(String str, int i2, int i3) {
        AbstractC0212s m923T;
        m1172o();
        m1103c(true);
        ComponentCallbacksC0205l componentCallbacksC0205l = this.f918v;
        if (componentCallbacksC0205l != null && i2 < 0 && str == null && (m923T = componentCallbacksC0205l.m923T()) != null && m923T.mo1065d()) {
            return true;
        }
        boolean m1128a = m1128a(this.f895C, this.f896D, str, i2, i3);
        if (m1128a) {
            this.f904h = true;
            try {
                m1102c(this.f895C, this.f896D);
            } finally {
                m1080A();
            }
        }
        m1169n();
        m1107y();
        return m1128a;
    }

    /* renamed from: b */
    public static int m1097b(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private void m1098b(C0258d<ComponentCallbacksC0205l> c0258d) {
        int size = c0258d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0205l m1346c = c0258d.m1346c(i2);
            if (!m1346c.f817m) {
                View m908A = m1346c.m908A();
                m1346c.f800R = m908A.getAlpha();
                m908A.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private static void m1099b(View view, c cVar) {
        if (view == null || cVar == null || !m1095a(view, cVar)) {
            return;
        }
        Animator animator = cVar.f926b;
        if (animator != null) {
            animator.addListener(new d(view));
            return;
        }
        Animation.AnimationListener m1086a = m1086a(cVar.f925a);
        view.setLayerType(2, null);
        cVar.f925a.setAnimationListener(new a(view, m1086a));
    }

    /* renamed from: b */
    private void m1100b(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z = arrayList.get(i6).f743t;
        ArrayList<ComponentCallbacksC0205l> arrayList3 = this.f897E;
        if (arrayList3 == null) {
            this.f897E = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f897E.addAll(this.f906j);
        ComponentCallbacksC0205l m1175q = m1175q();
        boolean z2 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            C0195d c0195d = arrayList.get(i7);
            m1175q = !arrayList2.get(i7).booleanValue() ? c0195d.m860a(this.f897E, m1175q) : c0195d.m868b(this.f897E, m1175q);
            z2 = z2 || c0195d.f732i;
        }
        this.f897E.clear();
        if (!z) {
            C0176M.m799a(this, arrayList, arrayList2, i2, i3, false);
        }
        m1092a(arrayList, arrayList2, i2, i3);
        if (z) {
            C0258d<ComponentCallbacksC0205l> c0258d = new C0258d<>();
            m1089a(c0258d);
            int m1083a = m1083a(arrayList, arrayList2, i2, i3, c0258d);
            m1098b(c0258d);
            i4 = m1083a;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z) {
            C0176M.m799a(this, arrayList, arrayList2, i2, i4, true);
            m1112a(this.f914r, true);
        }
        while (i6 < i3) {
            C0195d c0195d2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = c0195d2.f736m) >= 0) {
                m1131b(i5);
                c0195d2.f736m = -1;
            }
            c0195d2.m875h();
            i6++;
        }
        if (z2) {
            m1177s();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private boolean m1101b(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f903g != null && this.f903g.size() != 0) {
                int size = this.f903g.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.f903g.get(i2).mo867a(arrayList, arrayList2);
                }
                this.f903g.clear();
                this.f915s.m1055e().removeCallbacks(this.f902J);
                return z;
            }
            return false;
        }
    }

    /* renamed from: c */
    private void m1102c(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m1091a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f743t) {
                if (i3 != i2) {
                    m1100b(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f743t) {
                        i3++;
                    }
                }
                m1100b(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m1100b(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: c */
    private void m1103c(boolean z) {
        if (this.f904h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f915s == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f915s.m1055e().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m1108z();
        }
        if (this.f895C == null) {
            this.f895C = new ArrayList<>();
            this.f896D = new ArrayList<>();
        }
        this.f904h = true;
        try {
            m1091a((ArrayList<C0195d>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f904h = false;
        }
    }

    /* renamed from: d */
    public static int m1104d(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: e */
    private void m1105e(int i2) {
        try {
            this.f904h = true;
            m1112a(i2, false);
            this.f904h = false;
            m1172o();
        } catch (Throwable th) {
            this.f904h = false;
            throw th;
        }
    }

    /* renamed from: q */
    private ComponentCallbacksC0205l m1106q(ComponentCallbacksC0205l componentCallbacksC0205l) {
        ViewGroup viewGroup = componentCallbacksC0205l.f792J;
        View view = componentCallbacksC0205l.f793K;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f906j.indexOf(componentCallbacksC0205l) - 1; indexOf >= 0; indexOf--) {
                ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f906j.get(indexOf);
                if (componentCallbacksC0205l2.f792J == viewGroup && componentCallbacksC0205l2.f793K != null) {
                    return componentCallbacksC0205l2;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m1107y() {
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f907k.valueAt(size) == null) {
                    SparseArray<ComponentCallbacksC0205l> sparseArray2 = this.f907k;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: z */
    private void m1108z() {
        if (mo1064c()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f893A == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.f893A);
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public AbstractC0169H mo1056a() {
        return new C0195d(this);
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public ComponentCallbacksC0205l.d mo1057a(ComponentCallbacksC0205l componentCallbacksC0205l) {
        Bundle m1167m;
        if (componentCallbacksC0205l.f811g >= 0) {
            if (componentCallbacksC0205l.f807c <= 0 || (m1167m = m1167m(componentCallbacksC0205l)) == null) {
                return null;
            }
            return new ComponentCallbacksC0205l.d(m1167m);
        }
        m1090a(new IllegalStateException("Fragment " + componentCallbacksC0205l + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: a */
    public ComponentCallbacksC0205l m1109a(int i2) {
        for (int size = this.f906j.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(size);
            if (componentCallbacksC0205l != null && componentCallbacksC0205l.f830z == i2) {
                return componentCallbacksC0205l;
            }
        }
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0205l valueAt = this.f907k.valueAt(size2);
            if (valueAt != null && valueAt.f830z == i2) {
                return valueAt;
            }
        }
        return null;
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public ComponentCallbacksC0205l mo1058a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        ComponentCallbacksC0205l componentCallbacksC0205l = this.f907k.get(i2);
        if (componentCallbacksC0205l != null) {
            return componentCallbacksC0205l;
        }
        m1090a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        throw null;
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public ComponentCallbacksC0205l mo1059a(String str) {
        if (str != null) {
            for (int size = this.f906j.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(size);
                if (componentCallbacksC0205l != null && str.equals(componentCallbacksC0205l.f784B)) {
                    return componentCallbacksC0205l;
                }
            }
        }
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0205l valueAt = this.f907k.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f784B)) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    c m1110a(ComponentCallbacksC0205l componentCallbacksC0205l, int i2, boolean z, int i3) {
        int m1097b;
        int m997q = componentCallbacksC0205l.m997q();
        Animation m933a = componentCallbacksC0205l.m933a(i2, z, m997q);
        if (m933a != null) {
            return new c(m933a);
        }
        Animator m955b = componentCallbacksC0205l.m955b(i2, z, m997q);
        if (m955b != null) {
            return new c(m955b);
        }
        if (m997q != 0) {
            boolean equals = "anim".equals(this.f915s.m1053c().getResources().getResourceTypeName(m997q));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f915s.m1053c(), m997q);
                    if (loadAnimation != null) {
                        return new c(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f915s.m1053c(), m997q);
                    if (loadAnimator != null) {
                        return new c(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f915s.m1053c(), m997q);
                    if (loadAnimation2 != null) {
                        return new c(loadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (m1097b = m1097b(i2, z)) < 0) {
            return null;
        }
        switch (m1097b) {
            case 1:
                return m1085a(this.f915s.m1053c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1085a(this.f915s.m1053c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1085a(this.f915s.m1053c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1085a(this.f915s.m1053c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1084a(this.f915s.m1053c(), 0.0f, 1.0f);
            case 6:
                return m1084a(this.f915s.m1053c(), 1.0f, 0.0f);
            default:
                if (i3 == 0 && this.f915s.mo1024h()) {
                    i3 = this.f915s.mo1023g();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public void mo1060a(int i2, int i3) {
        if (i2 >= 0) {
            m1123a((h) new i(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m1111a(int i2, C0195d c0195d) {
        synchronized (this) {
            if (this.f910n == null) {
                this.f910n = new ArrayList<>();
            }
            int size = this.f910n.size();
            if (i2 < size) {
                if (f887a) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + c0195d);
                }
                this.f910n.set(i2, c0195d);
            } else {
                while (size < i2) {
                    this.f910n.add(null);
                    if (this.f911o == null) {
                        this.f911o = new ArrayList<>();
                    }
                    if (f887a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f911o.add(Integer.valueOf(size));
                    size++;
                }
                if (f887a) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + c0195d);
                }
                this.f910n.add(c0195d);
            }
        }
    }

    /* renamed from: a */
    public void m1112a(int i2, boolean z) {
        AbstractC0211r abstractC0211r;
        if (this.f915s == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f914r) {
            this.f914r = i2;
            if (this.f907k != null) {
                int size = this.f906j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    m1160i(this.f906j.get(i3));
                }
                int size2 = this.f907k.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i4);
                    if (valueAt != null && ((valueAt.f818n || valueAt.f786D) && !valueAt.f798P)) {
                        m1160i(valueAt);
                    }
                }
                m1182x();
                if (this.f919w && (abstractC0211r = this.f915s) != null && this.f914r == 4) {
                    abstractC0211r.mo1025i();
                    this.f919w = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void m1113a(Configuration configuration) {
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m943a(configuration);
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public void mo1061a(Bundle bundle, String str, ComponentCallbacksC0205l componentCallbacksC0205l) {
        int i2 = componentCallbacksC0205l.f811g;
        if (i2 >= 0) {
            bundle.putInt(str, i2);
            return;
        }
        m1090a(new IllegalStateException("Fragment " + componentCallbacksC0205l + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: a */
    public void m1114a(Parcelable parcelable, C0161A c0161a) {
        List<C0161A> list;
        List<C0159s> list2;
        if (parcelable == null) {
            return;
        }
        C0163C c0163c = (C0163C) parcelable;
        if (c0163c.f617a == null) {
            return;
        }
        if (c0161a != null) {
            List<ComponentCallbacksC0205l> m754b = c0161a.m754b();
            list = c0161a.m753a();
            list2 = c0161a.m755c();
            int size = m754b != null ? m754b.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0205l componentCallbacksC0205l = m754b.get(i2);
                if (f887a) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + componentCallbacksC0205l);
                }
                int i3 = 0;
                while (true) {
                    C0167F[] c0167fArr = c0163c.f617a;
                    if (i3 >= c0167fArr.length || c0167fArr[i3].f626b == componentCallbacksC0205l.f811g) {
                        break;
                    } else {
                        i3++;
                    }
                }
                C0167F[] c0167fArr2 = c0163c.f617a;
                if (i3 == c0167fArr2.length) {
                    m1090a(new IllegalStateException("Could not find active fragment with index " + componentCallbacksC0205l.f811g));
                    throw null;
                }
                C0167F c0167f = c0167fArr2[i3];
                c0167f.f636l = componentCallbacksC0205l;
                componentCallbacksC0205l.f809e = null;
                componentCallbacksC0205l.f823s = 0;
                componentCallbacksC0205l.f820p = false;
                componentCallbacksC0205l.f817m = false;
                componentCallbacksC0205l.f814j = null;
                Bundle bundle = c0167f.f635k;
                if (bundle != null) {
                    bundle.setClassLoader(this.f915s.m1053c().getClassLoader());
                    componentCallbacksC0205l.f809e = c0167f.f635k.getSparseParcelableArray("android:view_state");
                    componentCallbacksC0205l.f808d = c0167f.f635k;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f907k = new SparseArray<>(c0163c.f617a.length);
        int i4 = 0;
        while (true) {
            C0167F[] c0167fArr3 = c0163c.f617a;
            if (i4 >= c0167fArr3.length) {
                break;
            }
            C0167F c0167f2 = c0167fArr3[i4];
            if (c0167f2 != null) {
                ComponentCallbacksC0205l m761a = c0167f2.m761a(this.f915s, this.f916t, this.f917u, (list == null || i4 >= list.size()) ? null : list.get(i4), (list2 == null || i4 >= list2.size()) ? null : list2.get(i4));
                if (f887a) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + m761a);
                }
                this.f907k.put(m761a.f811g, m761a);
                c0167f2.f636l = null;
            }
            i4++;
        }
        if (c0161a != null) {
            List<ComponentCallbacksC0205l> m754b2 = c0161a.m754b();
            int size2 = m754b2 != null ? m754b2.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                ComponentCallbacksC0205l componentCallbacksC0205l2 = m754b2.get(i5);
                int i6 = componentCallbacksC0205l2.f815k;
                if (i6 >= 0) {
                    componentCallbacksC0205l2.f814j = this.f907k.get(i6);
                    if (componentCallbacksC0205l2.f814j == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + componentCallbacksC0205l2 + " target no longer exists: " + componentCallbacksC0205l2.f815k);
                    }
                }
            }
        }
        this.f906j.clear();
        if (c0163c.f618b != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = c0163c.f618b;
                if (i7 >= iArr.length) {
                    break;
                }
                ComponentCallbacksC0205l componentCallbacksC0205l3 = this.f907k.get(iArr[i7]);
                if (componentCallbacksC0205l3 == null) {
                    m1090a(new IllegalStateException("No instantiated fragment for index #" + c0163c.f618b[i7]));
                    throw null;
                }
                componentCallbacksC0205l3.f817m = true;
                if (f887a) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i7 + ": " + componentCallbacksC0205l3);
                }
                if (this.f906j.contains(componentCallbacksC0205l3)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f906j) {
                    this.f906j.add(componentCallbacksC0205l3);
                }
                i7++;
            }
        }
        C0199f[] c0199fArr = c0163c.f619c;
        if (c0199fArr != null) {
            this.f908l = new ArrayList<>(c0199fArr.length);
            int i8 = 0;
            while (true) {
                C0199f[] c0199fArr2 = c0163c.f619c;
                if (i8 >= c0199fArr2.length) {
                    break;
                }
                C0195d m883a = c0199fArr2[i8].m883a(this);
                if (f887a) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + m883a.f736m + "): " + m883a);
                    PrintWriter printWriter = new PrintWriter(new C0261g("FragmentManager"));
                    m883a.m865a("  ", printWriter, false);
                    printWriter.close();
                }
                this.f908l.add(m883a);
                int i9 = m883a.f736m;
                if (i9 >= 0) {
                    m1111a(i9, m883a);
                }
                i8++;
            }
        } else {
            this.f908l = null;
        }
        int i10 = c0163c.f620d;
        if (i10 >= 0) {
            this.f918v = this.f907k.get(i10);
        }
        this.f905i = c0163c.f621e;
    }

    /* renamed from: a */
    public void m1115a(C0195d c0195d) {
        if (this.f908l == null) {
            this.f908l = new ArrayList<>();
        }
        this.f908l.add(c0195d);
    }

    /* renamed from: a */
    void m1116a(C0195d c0195d, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0195d.m869b(z3);
        } else {
            c0195d.m872e();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0195d);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0176M.m799a(this, (ArrayList<C0195d>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m1112a(this.f914r, true);
        }
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i2);
                if (valueAt != null && valueAt.f793K != null && valueAt.f798P && c0195d.m870b(valueAt.f783A)) {
                    float f2 = valueAt.f800R;
                    if (f2 > 0.0f) {
                        valueAt.f793K.setAlpha(f2);
                    }
                    if (z3) {
                        valueAt.f800R = 0.0f;
                    } else {
                        valueAt.f800R = -1.0f;
                        valueAt.f798P = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:            if (r0 != 3) goto L670;     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0294  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1117a(android.support.v4.app.ComponentCallbacksC0205l r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LayoutInflaterFactory2C0219z.m1117a(android.support.v4.app.l, int, int, int, boolean):void");
    }

    /* renamed from: a */
    void m1118a(ComponentCallbacksC0205l componentCallbacksC0205l, Context context, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1118a(componentCallbacksC0205l, context, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1067a(this, componentCallbacksC0205l, context);
            }
        }
    }

    /* renamed from: a */
    void m1119a(ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1119a(componentCallbacksC0205l, bundle, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1068a(this, componentCallbacksC0205l, bundle);
            }
        }
    }

    /* renamed from: a */
    void m1120a(ComponentCallbacksC0205l componentCallbacksC0205l, View view, Bundle bundle, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1120a(componentCallbacksC0205l, view, bundle, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1069a(this, componentCallbacksC0205l, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void m1121a(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        if (f887a) {
            Log.v("FragmentManager", "add: " + componentCallbacksC0205l);
        }
        m1154g(componentCallbacksC0205l);
        if (componentCallbacksC0205l.f786D) {
            return;
        }
        if (this.f906j.contains(componentCallbacksC0205l)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0205l);
        }
        synchronized (this.f906j) {
            this.f906j.add(componentCallbacksC0205l);
        }
        componentCallbacksC0205l.f817m = true;
        componentCallbacksC0205l.f818n = false;
        if (componentCallbacksC0205l.f793K == null) {
            componentCallbacksC0205l.f799Q = false;
        }
        if (componentCallbacksC0205l.f789G && componentCallbacksC0205l.f790H) {
            this.f919w = true;
        }
        if (z) {
            m1162j(componentCallbacksC0205l);
        }
    }

    /* renamed from: a */
    public void m1122a(AbstractC0211r abstractC0211r, AbstractC0209p abstractC0209p, ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (this.f915s != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f915s = abstractC0211r;
        this.f916t = abstractC0209p;
        this.f917u = componentCallbacksC0205l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:            return;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1123a(android.support.v4.app.LayoutInflaterFactory2C0219z.h r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.m1108z()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.f922z     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            android.support.v4.app.r r0 = r1.f915s     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<android.support.v4.app.z$h> r3 = r1.f903g     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f903g = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<android.support.v4.app.z$h> r3 = r1.f903g     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.m1181w()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.LayoutInflaterFactory2C0219z.m1123a(android.support.v4.app.z$h, boolean):void");
    }

    /* renamed from: a */
    public void m1124a(Menu menu) {
        if (this.f914r < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m964c(menu);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: a */
    public void mo1062a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.m951a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f906j.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0205l.toString());
            }
        }
        ArrayList<ComponentCallbacksC0205l> arrayList = this.f909m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f909m.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0205l2.toString());
            }
        }
        ArrayList<C0195d> arrayList2 = this.f908l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                C0195d c0195d = this.f908l.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0195d.toString());
                c0195d.m864a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f910n != null && (size2 = this.f910n.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (C0195d) this.f910n.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.f911o != null && this.f911o.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f911o.toArray()));
            }
        }
        ArrayList<h> arrayList3 = this.f903g;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (h) this.f903g.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f915s);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f916t);
        if (this.f917u != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f917u);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f914r);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f920x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f921y);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f922z);
        if (this.f919w) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f919w);
        }
        if (this.f893A != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f893A);
        }
    }

    /* renamed from: a */
    public void m1125a(boolean z) {
        for (int size = this.f906j.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(size);
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m969d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean m1126a(Menu menu, MenuInflater menuInflater) {
        if (this.f914r < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0205l> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null && componentCallbacksC0205l.m961b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC0205l);
                z = true;
            }
        }
        if (this.f909m != null) {
            for (int i3 = 0; i3 < this.f909m.size(); i3++) {
                ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f909m.get(i3);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0205l2)) {
                    componentCallbacksC0205l2.m920M();
                }
            }
        }
        this.f909m = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m1127a(MenuItem menuItem) {
        if (this.f914r < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null && componentCallbacksC0205l.m966c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m1128a(ArrayList<C0195d> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int size;
        ArrayList<C0195d> arrayList3 = this.f908l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f908l.remove(size2));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                size = this.f908l.size() - 1;
                while (size >= 0) {
                    C0195d c0195d = this.f908l.get(size);
                    if ((str != null && str.equals(c0195d.m873f())) || (i2 >= 0 && i2 == c0195d.f736m)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C0195d c0195d2 = this.f908l.get(size);
                        if (str == null || !str.equals(c0195d2.m873f())) {
                            if (i2 < 0 || i2 != c0195d2.f736m) {
                                break;
                            }
                        }
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.f908l.size() - 1) {
                return false;
            }
            for (int size3 = this.f908l.size() - 1; size3 > size; size3--) {
                arrayList.add(this.f908l.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public int m1129b(C0195d c0195d) {
        synchronized (this) {
            if (this.f911o != null && this.f911o.size() > 0) {
                int intValue = this.f911o.remove(this.f911o.size() - 1).intValue();
                if (f887a) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + c0195d);
                }
                this.f910n.set(intValue, c0195d);
                return intValue;
            }
            if (this.f910n == null) {
                this.f910n = new ArrayList<>();
            }
            int size = this.f910n.size();
            if (f887a) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0195d);
            }
            this.f910n.add(c0195d);
            return size;
        }
    }

    /* renamed from: b */
    public ComponentCallbacksC0205l m1130b(String str) {
        ComponentCallbacksC0205l m930a;
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0205l valueAt = this.f907k.valueAt(size);
            if (valueAt != null && (m930a = valueAt.m930a(str)) != null) {
                return m930a;
            }
        }
        return null;
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: b */
    public List<ComponentCallbacksC0205l> mo1063b() {
        List<ComponentCallbacksC0205l> list;
        if (this.f906j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f906j) {
            list = (List) this.f906j.clone();
        }
        return list;
    }

    /* renamed from: b */
    public void m1131b(int i2) {
        synchronized (this) {
            this.f910n.set(i2, null);
            if (this.f911o == null) {
                this.f911o = new ArrayList<>();
            }
            if (f887a) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.f911o.add(Integer.valueOf(i2));
        }
    }

    /* renamed from: b */
    public void m1132b(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (f887a) {
            Log.v("FragmentManager", "attach: " + componentCallbacksC0205l);
        }
        if (componentCallbacksC0205l.f786D) {
            componentCallbacksC0205l.f786D = false;
            if (componentCallbacksC0205l.f817m) {
                return;
            }
            if (this.f906j.contains(componentCallbacksC0205l)) {
                throw new IllegalStateException("Fragment already added: " + componentCallbacksC0205l);
            }
            if (f887a) {
                Log.v("FragmentManager", "add from attach: " + componentCallbacksC0205l);
            }
            synchronized (this.f906j) {
                this.f906j.add(componentCallbacksC0205l);
            }
            componentCallbacksC0205l.f817m = true;
            if (componentCallbacksC0205l.f789G && componentCallbacksC0205l.f790H) {
                this.f919w = true;
            }
        }
    }

    /* renamed from: b */
    void m1133b(ComponentCallbacksC0205l componentCallbacksC0205l, Context context, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1133b(componentCallbacksC0205l, context, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1071b(this, componentCallbacksC0205l, context);
            }
        }
    }

    /* renamed from: b */
    void m1134b(ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1134b(componentCallbacksC0205l, bundle, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1072b(this, componentCallbacksC0205l, bundle);
            }
        }
    }

    /* renamed from: b */
    void m1135b(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1135b(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1066a(this, componentCallbacksC0205l);
            }
        }
    }

    /* renamed from: b */
    public void m1136b(h hVar, boolean z) {
        if (z && (this.f915s == null || this.f922z)) {
            return;
        }
        m1103c(z);
        if (hVar.mo867a(this.f895C, this.f896D)) {
            this.f904h = true;
            try {
                m1102c(this.f895C, this.f896D);
            } finally {
                m1080A();
            }
        }
        m1169n();
        m1107y();
    }

    /* renamed from: b */
    public void m1137b(boolean z) {
        for (int size = this.f906j.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(size);
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m973e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean m1138b(Menu menu) {
        if (this.f914r < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null && componentCallbacksC0205l.m970d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m1139b(MenuItem menuItem) {
        if (this.f914r < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null && componentCallbacksC0205l.m971d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    void m1140c(ComponentCallbacksC0205l componentCallbacksC0205l) {
        Animator animator;
        if (componentCallbacksC0205l.f793K != null) {
            c m1110a = m1110a(componentCallbacksC0205l, componentCallbacksC0205l.m998r(), !componentCallbacksC0205l.f785C, componentCallbacksC0205l.m999s());
            if (m1110a == null || (animator = m1110a.f926b) == null) {
                if (m1110a != null) {
                    m1099b(componentCallbacksC0205l.f793K, m1110a);
                    componentCallbacksC0205l.f793K.startAnimation(m1110a.f925a);
                    m1110a.f925a.start();
                }
                componentCallbacksC0205l.f793K.setVisibility((!componentCallbacksC0205l.f785C || componentCallbacksC0205l.m913F()) ? 0 : 8);
                if (componentCallbacksC0205l.m913F()) {
                    componentCallbacksC0205l.m976f(false);
                }
            } else {
                animator.setTarget(componentCallbacksC0205l.f793K);
                if (!componentCallbacksC0205l.f785C) {
                    componentCallbacksC0205l.f793K.setVisibility(0);
                } else if (componentCallbacksC0205l.m913F()) {
                    componentCallbacksC0205l.m976f(false);
                } else {
                    ViewGroup viewGroup = componentCallbacksC0205l.f792J;
                    View view = componentCallbacksC0205l.f793K;
                    viewGroup.startViewTransition(view);
                    m1110a.f926b.addListener(new C0217x(this, viewGroup, view, componentCallbacksC0205l));
                }
                m1099b(componentCallbacksC0205l.f793K, m1110a);
                m1110a.f926b.start();
            }
        }
        if (componentCallbacksC0205l.f817m && componentCallbacksC0205l.f789G && componentCallbacksC0205l.f790H) {
            this.f919w = true;
        }
        componentCallbacksC0205l.f799Q = false;
        componentCallbacksC0205l.m952a(componentCallbacksC0205l.f785C);
    }

    /* renamed from: c */
    void m1141c(ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1141c(componentCallbacksC0205l, bundle, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1074c(this, componentCallbacksC0205l, bundle);
            }
        }
    }

    /* renamed from: c */
    void m1142c(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1142c(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1070b(this, componentCallbacksC0205l);
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: c */
    public boolean mo1064c() {
        return this.f920x || this.f921y;
    }

    /* renamed from: c */
    public boolean m1143c(int i2) {
        return this.f914r >= i2;
    }

    /* renamed from: d */
    public void m1144d(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (f887a) {
            Log.v("FragmentManager", "detach: " + componentCallbacksC0205l);
        }
        if (componentCallbacksC0205l.f786D) {
            return;
        }
        componentCallbacksC0205l.f786D = true;
        if (componentCallbacksC0205l.f817m) {
            if (f887a) {
                Log.v("FragmentManager", "remove from detach: " + componentCallbacksC0205l);
            }
            synchronized (this.f906j) {
                this.f906j.remove(componentCallbacksC0205l);
            }
            if (componentCallbacksC0205l.f789G && componentCallbacksC0205l.f790H) {
                this.f919w = true;
            }
            componentCallbacksC0205l.f817m = false;
        }
    }

    /* renamed from: d */
    void m1145d(ComponentCallbacksC0205l componentCallbacksC0205l, Bundle bundle, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1145d(componentCallbacksC0205l, bundle, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1076d(this, componentCallbacksC0205l, bundle);
            }
        }
    }

    /* renamed from: d */
    void m1146d(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1146d(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1073c(this, componentCallbacksC0205l);
            }
        }
    }

    @Override // android.support.v4.app.AbstractC0212s
    /* renamed from: d */
    public boolean mo1065d() {
        m1108z();
        return m1096a((String) null, -1, 0);
    }

    /* renamed from: e */
    public void m1147e() {
        this.f920x = false;
        this.f921y = false;
        m1105e(2);
    }

    /* renamed from: e */
    void m1148e(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (!componentCallbacksC0205l.f819o || componentCallbacksC0205l.f822r) {
            return;
        }
        componentCallbacksC0205l.m958b(componentCallbacksC0205l.m985i(componentCallbacksC0205l.f808d), (ViewGroup) null, componentCallbacksC0205l.f808d);
        View view = componentCallbacksC0205l.f793K;
        if (view == null) {
            componentCallbacksC0205l.f794L = null;
            return;
        }
        componentCallbacksC0205l.f794L = view;
        view.setSaveFromParentEnabled(false);
        if (componentCallbacksC0205l.f785C) {
            componentCallbacksC0205l.f793K.setVisibility(8);
        }
        componentCallbacksC0205l.m950a(componentCallbacksC0205l.f793K, componentCallbacksC0205l.f808d);
        m1120a(componentCallbacksC0205l, componentCallbacksC0205l.f793K, componentCallbacksC0205l.f808d, false);
    }

    /* renamed from: e */
    void m1149e(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1149e(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1075d(this, componentCallbacksC0205l);
            }
        }
    }

    /* renamed from: f */
    public void m1150f() {
        this.f920x = false;
        this.f921y = false;
        m1105e(1);
    }

    /* renamed from: f */
    public void m1151f(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (f887a) {
            Log.v("FragmentManager", "hide: " + componentCallbacksC0205l);
        }
        if (componentCallbacksC0205l.f785C) {
            return;
        }
        componentCallbacksC0205l.f785C = true;
        componentCallbacksC0205l.f799Q = true ^ componentCallbacksC0205l.f799Q;
    }

    /* renamed from: f */
    void m1152f(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1152f(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1077e(this, componentCallbacksC0205l);
            }
        }
    }

    /* renamed from: g */
    public void m1153g() {
        this.f922z = true;
        m1172o();
        m1105e(0);
        this.f915s = null;
        this.f916t = null;
        this.f917u = null;
    }

    /* renamed from: g */
    public void m1154g(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (componentCallbacksC0205l.f811g >= 0) {
            return;
        }
        int i2 = this.f905i;
        this.f905i = i2 + 1;
        componentCallbacksC0205l.m937a(i2, this.f917u);
        if (this.f907k == null) {
            this.f907k = new SparseArray<>();
        }
        this.f907k.put(componentCallbacksC0205l.f811g, componentCallbacksC0205l);
        if (f887a) {
            Log.v("FragmentManager", "Allocated fragment index " + componentCallbacksC0205l);
        }
    }

    /* renamed from: g */
    void m1155g(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1155g(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1078f(this, componentCallbacksC0205l);
            }
        }
    }

    /* renamed from: h */
    public void m1156h() {
        m1105e(1);
    }

    /* renamed from: h */
    void m1157h(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (componentCallbacksC0205l.f811g < 0) {
            return;
        }
        if (f887a) {
            Log.v("FragmentManager", "Freeing fragment index " + componentCallbacksC0205l);
        }
        this.f907k.put(componentCallbacksC0205l.f811g, null);
        componentCallbacksC0205l.m909B();
    }

    /* renamed from: h */
    void m1158h(ComponentCallbacksC0205l componentCallbacksC0205l, boolean z) {
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f917u;
        if (componentCallbacksC0205l2 != null) {
            AbstractC0212s m996p = componentCallbacksC0205l2.m996p();
            if (m996p instanceof LayoutInflaterFactory2C0219z) {
                ((LayoutInflaterFactory2C0219z) m996p).m1158h(componentCallbacksC0205l, true);
            }
        }
        Iterator<f> it = this.f913q.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f934b) {
                next.f933a.m1079g(this, componentCallbacksC0205l);
            }
        }
    }

    /* renamed from: i */
    public void m1159i() {
        for (int i2 = 0; i2 < this.f906j.size(); i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m927X();
            }
        }
    }

    /* renamed from: i */
    public void m1160i(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (componentCallbacksC0205l == null) {
            return;
        }
        int i2 = this.f914r;
        if (componentCallbacksC0205l.f818n) {
            i2 = componentCallbacksC0205l.m914G() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        m1117a(componentCallbacksC0205l, i2, componentCallbacksC0205l.m998r(), componentCallbacksC0205l.m999s(), false);
        if (componentCallbacksC0205l.f793K != null) {
            ComponentCallbacksC0205l m1106q = m1106q(componentCallbacksC0205l);
            if (m1106q != null) {
                View view = m1106q.f793K;
                ViewGroup viewGroup = componentCallbacksC0205l.f792J;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(componentCallbacksC0205l.f793K);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(componentCallbacksC0205l.f793K, indexOfChild);
                }
            }
            if (componentCallbacksC0205l.f798P && componentCallbacksC0205l.f792J != null) {
                float f2 = componentCallbacksC0205l.f800R;
                if (f2 > 0.0f) {
                    componentCallbacksC0205l.f793K.setAlpha(f2);
                }
                componentCallbacksC0205l.f800R = 0.0f;
                componentCallbacksC0205l.f798P = false;
                c m1110a = m1110a(componentCallbacksC0205l, componentCallbacksC0205l.m998r(), true, componentCallbacksC0205l.m999s());
                if (m1110a != null) {
                    m1099b(componentCallbacksC0205l.f793K, m1110a);
                    Animation animation = m1110a.f925a;
                    if (animation != null) {
                        componentCallbacksC0205l.f793K.startAnimation(animation);
                    } else {
                        m1110a.f926b.setTarget(componentCallbacksC0205l.f793K);
                        m1110a.f926b.start();
                    }
                }
            }
        }
        if (componentCallbacksC0205l.f799Q) {
            m1140c(componentCallbacksC0205l);
        }
    }

    /* renamed from: j */
    public void m1161j() {
        m1105e(3);
    }

    /* renamed from: j */
    void m1162j(ComponentCallbacksC0205l componentCallbacksC0205l) {
        m1117a(componentCallbacksC0205l, this.f914r, 0, 0, false);
    }

    /* renamed from: k */
    public void m1163k() {
        this.f920x = false;
        this.f921y = false;
        m1105e(4);
    }

    /* renamed from: k */
    public void m1164k(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (componentCallbacksC0205l.f795M) {
            if (this.f904h) {
                this.f894B = true;
            } else {
                componentCallbacksC0205l.f795M = false;
                m1117a(componentCallbacksC0205l, this.f914r, 0, 0, false);
            }
        }
    }

    /* renamed from: l */
    public void m1165l() {
        this.f920x = false;
        this.f921y = false;
        m1105e(3);
    }

    /* renamed from: l */
    public void m1166l(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (f887a) {
            Log.v("FragmentManager", "remove: " + componentCallbacksC0205l + " nesting=" + componentCallbacksC0205l.f823s);
        }
        boolean z = !componentCallbacksC0205l.m914G();
        if (!componentCallbacksC0205l.f786D || z) {
            synchronized (this.f906j) {
                this.f906j.remove(componentCallbacksC0205l);
            }
            if (componentCallbacksC0205l.f789G && componentCallbacksC0205l.f790H) {
                this.f919w = true;
            }
            componentCallbacksC0205l.f817m = false;
            componentCallbacksC0205l.f818n = true;
        }
    }

    /* renamed from: m */
    Bundle m1167m(ComponentCallbacksC0205l componentCallbacksC0205l) {
        Bundle bundle;
        if (this.f898F == null) {
            this.f898F = new Bundle();
        }
        componentCallbacksC0205l.m987j(this.f898F);
        m1145d(componentCallbacksC0205l, this.f898F, false);
        if (this.f898F.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f898F;
            this.f898F = null;
        }
        if (componentCallbacksC0205l.f793K != null) {
            m1170n(componentCallbacksC0205l);
        }
        if (componentCallbacksC0205l.f809e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", componentCallbacksC0205l.f809e);
        }
        if (!componentCallbacksC0205l.f796N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", componentCallbacksC0205l.f796N);
        }
        return bundle;
    }

    /* renamed from: m */
    public void m1168m() {
        this.f921y = true;
        m1105e(2);
    }

    /* renamed from: n */
    void m1169n() {
        if (this.f894B) {
            this.f894B = false;
            m1182x();
        }
    }

    /* renamed from: n */
    void m1170n(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (componentCallbacksC0205l.f794L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.f899G;
        if (sparseArray == null) {
            this.f899G = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        componentCallbacksC0205l.f794L.saveHierarchyState(this.f899G);
        if (this.f899G.size() > 0) {
            componentCallbacksC0205l.f809e = this.f899G;
            this.f899G = null;
        }
    }

    /* renamed from: o */
    public void m1171o(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (componentCallbacksC0205l == null || (this.f907k.get(componentCallbacksC0205l.f811g) == componentCallbacksC0205l && (componentCallbacksC0205l.f825u == null || componentCallbacksC0205l.m996p() == this))) {
            this.f918v = componentCallbacksC0205l;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0205l + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: o */
    public boolean m1172o() {
        m1103c(true);
        boolean z = false;
        while (m1101b(this.f895C, this.f896D)) {
            this.f904h = true;
            try {
                m1102c(this.f895C, this.f896D);
                m1080A();
                z = true;
            } catch (Throwable th) {
                m1080A();
                throw th;
            }
        }
        m1169n();
        m1107y();
        return z;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ComponentCallbacksC0205l componentCallbacksC0205l;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f935a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!ComponentCallbacksC0205l.m906a(this.f915s.m1053c(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        ComponentCallbacksC0205l m1109a = resourceId != -1 ? m1109a(resourceId) : null;
        if (m1109a == null && string != null) {
            m1109a = mo1059a(string);
        }
        if (m1109a == null && id != -1) {
            m1109a = m1109a(id);
        }
        if (f887a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + m1109a);
        }
        if (m1109a == null) {
            ComponentCallbacksC0205l mo902a = this.f916t.mo902a(context, str2, null);
            mo902a.f819o = true;
            mo902a.f830z = resourceId != 0 ? resourceId : id;
            mo902a.f783A = id;
            mo902a.f784B = string;
            mo902a.f820p = true;
            mo902a.f824t = this;
            AbstractC0211r abstractC0211r = this.f915s;
            mo902a.f825u = abstractC0211r;
            mo902a.m942a(abstractC0211r.m1053c(), attributeSet, mo902a.f808d);
            m1121a(mo902a, true);
            componentCallbacksC0205l = mo902a;
        } else {
            if (m1109a.f820p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            m1109a.f820p = true;
            AbstractC0211r abstractC0211r2 = this.f915s;
            m1109a.f825u = abstractC0211r2;
            if (!m1109a.f788F) {
                m1109a.m942a(abstractC0211r2.m1053c(), attributeSet, m1109a.f808d);
            }
            componentCallbacksC0205l = m1109a;
        }
        if (this.f914r >= 1 || !componentCallbacksC0205l.f819o) {
            m1162j(componentCallbacksC0205l);
        } else {
            m1117a(componentCallbacksC0205l, 1, 0, 0, false);
        }
        View view2 = componentCallbacksC0205l.f793K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (componentCallbacksC0205l.f793K.getTag() == null) {
                componentCallbacksC0205l.f793K.setTag(string);
            }
            return componentCallbacksC0205l.f793K;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public LayoutInflater.Factory2 m1173p() {
        return this;
    }

    /* renamed from: p */
    public void m1174p(ComponentCallbacksC0205l componentCallbacksC0205l) {
        if (f887a) {
            Log.v("FragmentManager", "show: " + componentCallbacksC0205l);
        }
        if (componentCallbacksC0205l.f785C) {
            componentCallbacksC0205l.f785C = false;
            componentCallbacksC0205l.f799Q = !componentCallbacksC0205l.f799Q;
        }
    }

    /* renamed from: q */
    public ComponentCallbacksC0205l m1175q() {
        return this.f918v;
    }

    /* renamed from: r */
    public void m1176r() {
        this.f901I = null;
        this.f920x = false;
        this.f921y = false;
        int size = this.f906j.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0205l componentCallbacksC0205l = this.f906j.get(i2);
            if (componentCallbacksC0205l != null) {
                componentCallbacksC0205l.m918K();
            }
        }
    }

    /* renamed from: s */
    void m1177s() {
        if (this.f912p != null) {
            for (int i2 = 0; i2 < this.f912p.size(); i2++) {
                this.f912p.get(i2).onBackStackChanged();
            }
        }
    }

    /* renamed from: t */
    public C0161A m1178t() {
        m1087a(this.f901I);
        return this.f901I;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f917u;
        if (obj == null) {
            obj = this.f915s;
        }
        C0260f.m1353a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public Parcelable m1179u() {
        int[] iArr;
        int size;
        m1082C();
        m1081B();
        m1172o();
        this.f920x = true;
        C0199f[] c0199fArr = null;
        this.f901I = null;
        SparseArray<ComponentCallbacksC0205l> sparseArray = this.f907k;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f907k.size();
        C0167F[] c0167fArr = new C0167F[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.f811g < 0) {
                    m1090a(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f811g));
                    throw null;
                }
                C0167F c0167f = new C0167F(valueAt);
                c0167fArr[i2] = c0167f;
                if (valueAt.f807c <= 0 || c0167f.f635k != null) {
                    c0167f.f635k = valueAt.f808d;
                } else {
                    c0167f.f635k = m1167m(valueAt);
                    ComponentCallbacksC0205l componentCallbacksC0205l = valueAt.f814j;
                    if (componentCallbacksC0205l != null) {
                        if (componentCallbacksC0205l.f811g < 0) {
                            m1090a(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f814j));
                            throw null;
                        }
                        if (c0167f.f635k == null) {
                            c0167f.f635k = new Bundle();
                        }
                        mo1061a(c0167f.f635k, "android:target_state", valueAt.f814j);
                        int i3 = valueAt.f816l;
                        if (i3 != 0) {
                            c0167f.f635k.putInt("android:target_req_state", i3);
                        }
                    }
                }
                if (f887a) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + c0167f.f635k);
                }
                z = true;
            }
        }
        if (!z) {
            if (f887a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f906j.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i4 = 0; i4 < size3; i4++) {
                iArr[i4] = this.f906j.get(i4).f811g;
                if (iArr[i4] < 0) {
                    m1090a(new IllegalStateException("Failure saving state: active " + this.f906j.get(i4) + " has cleared index: " + iArr[i4]));
                    throw null;
                }
                if (f887a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i4 + ": " + this.f906j.get(i4));
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0195d> arrayList = this.f908l;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c0199fArr = new C0199f[size];
            for (int i5 = 0; i5 < size; i5++) {
                c0199fArr[i5] = new C0199f(this.f908l.get(i5));
                if (f887a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f908l.get(i5));
                }
            }
        }
        C0163C c0163c = new C0163C();
        c0163c.f617a = c0167fArr;
        c0163c.f618b = iArr;
        c0163c.f619c = c0199fArr;
        ComponentCallbacksC0205l componentCallbacksC0205l2 = this.f918v;
        if (componentCallbacksC0205l2 != null) {
            c0163c.f620d = componentCallbacksC0205l2.f811g;
        }
        c0163c.f621e = this.f905i;
        m1180v();
        return c0163c;
    }

    /* renamed from: v */
    void m1180v() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0161A c0161a;
        if (this.f907k != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f907k.size(); i2++) {
                ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.f787E) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        ComponentCallbacksC0205l componentCallbacksC0205l = valueAt.f814j;
                        valueAt.f815k = componentCallbacksC0205l != null ? componentCallbacksC0205l.f811g : -1;
                        if (f887a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = valueAt.f826v;
                    if (layoutInflaterFactory2C0219z != null) {
                        layoutInflaterFactory2C0219z.m1180v();
                        c0161a = valueAt.f826v.f901I;
                    } else {
                        c0161a = valueAt.f827w;
                    }
                    if (arrayList2 == null && c0161a != null) {
                        arrayList2 = new ArrayList(this.f907k.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(c0161a);
                    }
                    if (arrayList3 == null && valueAt.f828x != null) {
                        arrayList3 = new ArrayList(this.f907k.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.f828x);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.f901I = null;
        } else {
            this.f901I = new C0161A(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: w */
    void m1181w() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.f900H == null || this.f900H.isEmpty()) ? false : true;
            if (this.f903g != null && this.f903g.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f915s.m1055e().removeCallbacks(this.f902J);
                this.f915s.m1055e().post(this.f902J);
            }
        }
    }

    /* renamed from: x */
    void m1182x() {
        if (this.f907k == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f907k.size(); i2++) {
            ComponentCallbacksC0205l valueAt = this.f907k.valueAt(i2);
            if (valueAt != null) {
                m1164k(valueAt);
            }
        }
    }
}
