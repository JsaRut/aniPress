package p000a.p005b.p009c.p019h;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p005b.p006a.C0009b;

/* renamed from: a.b.c.h.v */
/* loaded from: classes.dex */
public class C0107v {

    /* renamed from: b */
    private static Field f401b;

    /* renamed from: c */
    private static boolean f402c;

    /* renamed from: d */
    private static WeakHashMap<View, String> f403d;

    /* renamed from: f */
    private static Field f405f;

    /* renamed from: h */
    private static ThreadLocal<Rect> f407h;

    /* renamed from: a */
    private static final AtomicInteger f400a = new AtomicInteger(1);

    /* renamed from: e */
    private static WeakHashMap<View, C0074H> f404e = null;

    /* renamed from: g */
    private static boolean f406g = false;

    /* renamed from: a.b.c.h.v$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: a.b.c.h.v$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f408a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f409b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f410c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f411d = null;

        b() {
        }

        /* renamed from: a */
        static b m536a(View view) {
            b bVar = (b) view.getTag(C0009b.tag_unhandled_key_event_manager);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b();
            view.setTag(C0009b.tag_unhandled_key_event_manager, bVar2);
            return bVar2;
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m537a() {
            if (this.f410c == null) {
                this.f410c = new SparseArray<>();
            }
            return this.f410c;
        }

        /* renamed from: b */
        private View m538b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f409b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m538b = m538b(viewGroup.getChildAt(childCount), keyEvent);
                        if (m538b != null) {
                            return m538b;
                        }
                    }
                }
                if (m540c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: b */
        private void m539b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f409b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f408a.isEmpty()) {
                return;
            }
            synchronized (f408a) {
                if (this.f409b == null) {
                    this.f409b = new WeakHashMap<>();
                }
                for (int size = f408a.size() - 1; size >= 0; size--) {
                    View view = f408a.get(size).get();
                    if (view == null) {
                        f408a.remove(size);
                    } else {
                        this.f409b.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f409b.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m540c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0009b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((a) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        boolean m541a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f411d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f411d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> m537a = m537a();
            if (keyEvent.getAction() == 1 && (indexOfKey = m537a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = m537a.valueAt(indexOfKey);
                m537a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = m537a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C0107v.m529q(view)) {
                m540c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: a */
        boolean m542a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m539b();
            }
            View m538b = m538b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m538b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m537a().put(keyCode, new WeakReference<>(m538b));
                }
            }
            return m538b != null;
        }
    }

    /* renamed from: a */
    public static C0074H m490a(View view) {
        if (f404e == null) {
            f404e = new WeakHashMap<>();
        }
        C0074H c0074h = f404e.get(view);
        if (c0074h != null) {
            return c0074h;
        }
        C0074H c0074h2 = new C0074H(view);
        f404e.put(view, c0074h2);
        return c0074h2;
    }

    /* renamed from: a */
    public static C0078L m491a(View view, C0078L c0078l) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0078l;
        }
        WindowInsets windowInsets = (WindowInsets) C0078L.m353a(c0078l);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0078L.m352a(windowInsets);
    }

    /* renamed from: a */
    private static Rect m492a() {
        if (f407h == null) {
            f407h = new ThreadLocal<>();
        }
        Rect rect = f407h.get();
        if (rect == null) {
            rect = new Rect();
            f407h.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static void m493a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    public static void m494a(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        if (i2 < 21) {
            m517f(view, i);
            return;
        }
        Rect m492a = m492a();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m492a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m492a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m517f(view, i);
        if (z && m492a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m492a);
        }
    }

    /* renamed from: a */
    public static void m495a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m496a(View view, C0089d c0089d) {
        view.setAccessibilityDelegate(c0089d == null ? null : c0089d.m413a());
    }

    /* renamed from: a */
    public static void m497a(View view, InterfaceC0102q interfaceC0102q) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (interfaceC0102q == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0106u(interfaceC0102q));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m498a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC0105t) {
                ((InterfaceC0105t) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m499a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (view instanceof InterfaceC0105t) {
                ((InterfaceC0105t) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: a */
    public static void m500a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m501a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m502a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m503a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f403d == null) {
            f403d = new WeakHashMap<>();
        }
        f403d.put(view, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m504a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof InterfaceC0097l) {
            ((InterfaceC0097l) view).setNestedScrollingEnabled(z);
        }
    }

    /* renamed from: a */
    public static boolean m505a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return b.m536a(view).m542a(view, keyEvent);
    }

    /* renamed from: b */
    public static C0078L m506b(View view, C0078L c0078l) {
        if (Build.VERSION.SDK_INT < 21) {
            return c0078l;
        }
        WindowInsets windowInsets = (WindowInsets) C0078L.m353a(c0078l);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0078L.m352a(windowInsets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static ColorStateList m507b(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0105t) {
            return ((InterfaceC0105t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static void m508b(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        if (i2 < 21) {
            m519g(view, i);
            return;
        }
        Rect m492a = m492a();
        boolean z = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m492a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m492a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m519g(view, i);
        if (z && m492a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m492a);
        }
    }

    /* renamed from: b */
    public static boolean m509b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return b.m536a(view).m541a(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static PorterDuff.Mode m510c(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof InterfaceC0105t) {
            return ((InterfaceC0105t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m511c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: d */
    public static float m512d(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: d */
    public static void m513d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: e */
    public static void m514e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: e */
    public static boolean m515e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: f */
    public static int m516f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: f */
    private static void m517f(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m535w(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m535w((View) parent);
            }
        }
    }

    /* renamed from: g */
    public static int m518g(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: g */
    private static void m519g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m535w(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m535w((View) parent);
            }
        }
    }

    /* renamed from: h */
    public static int m520h(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f402c) {
            try {
                f401b = View.class.getDeclaredField("mMinHeight");
                f401b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f402c = true;
        }
        Field field = f401b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: i */
    public static int m521i(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: j */
    public static int m522j(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: k */
    public static ViewParent m523k(View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    /* renamed from: l */
    public static String m524l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f403d;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: m */
    public static int m525m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: n */
    public static boolean m526n(View view) {
        if (f406g) {
            return false;
        }
        if (f405f == null) {
            try {
                f405f = View.class.getDeclaredField("mAccessibilityDelegate");
                f405f.setAccessible(true);
            } catch (Throwable unused) {
                f406g = true;
                return false;
            }
        }
        try {
            return f405f.get(view) != null;
        } catch (Throwable unused2) {
            f406g = true;
            return false;
        }
    }

    /* renamed from: o */
    public static boolean m527o(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m528p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m529q(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: r */
    public static boolean m530r(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static boolean m531s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof InterfaceC0097l) {
            return ((InterfaceC0097l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: t */
    public static void m532t(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: u */
    public static void m533u(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static void m534v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof InterfaceC0097l) {
            ((InterfaceC0097l) view).stopNestedScroll();
        }
    }

    /* renamed from: w */
    private static void m535w(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
