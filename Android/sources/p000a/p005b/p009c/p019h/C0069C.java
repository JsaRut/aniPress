package p000a.p005b.p009c.p019h;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p019h.p020a.C0080a;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: a.b.c.h.C */
/* loaded from: classes.dex */
public class C0069C extends ViewGroup {

    /* renamed from: a */
    static final int[] f244a = {R.attr.layout_gravity};

    /* renamed from: b */
    private static final Comparator<b> f245b = new C0110y();

    /* renamed from: c */
    private static final Interpolator f246c = new InterpolatorC0111z();

    /* renamed from: d */
    private static final j f247d = new j();

    /* renamed from: A */
    private boolean f248A;

    /* renamed from: B */
    private int f249B;

    /* renamed from: C */
    private boolean f250C;

    /* renamed from: D */
    private boolean f251D;

    /* renamed from: E */
    private int f252E;

    /* renamed from: F */
    private int f253F;

    /* renamed from: G */
    private int f254G;

    /* renamed from: H */
    private float f255H;

    /* renamed from: I */
    private float f256I;

    /* renamed from: J */
    private float f257J;

    /* renamed from: K */
    private float f258K;

    /* renamed from: L */
    private int f259L;

    /* renamed from: M */
    private VelocityTracker f260M;

    /* renamed from: N */
    private int f261N;

    /* renamed from: O */
    private int f262O;

    /* renamed from: P */
    private int f263P;

    /* renamed from: Q */
    private int f264Q;

    /* renamed from: R */
    private boolean f265R;

    /* renamed from: S */
    private EdgeEffect f266S;

    /* renamed from: T */
    private EdgeEffect f267T;

    /* renamed from: U */
    private boolean f268U;

    /* renamed from: V */
    private boolean f269V;

    /* renamed from: W */
    private boolean f270W;

    /* renamed from: aa */
    private int f271aa;

    /* renamed from: ba */
    private List<f> f272ba;

    /* renamed from: ca */
    private f f273ca;

    /* renamed from: da */
    private f f274da;

    /* renamed from: e */
    private int f275e;

    /* renamed from: ea */
    private List<e> f276ea;

    /* renamed from: f */
    private final ArrayList<b> f277f;

    /* renamed from: fa */
    private g f278fa;

    /* renamed from: g */
    private final b f279g;

    /* renamed from: ga */
    private int f280ga;

    /* renamed from: h */
    private final Rect f281h;

    /* renamed from: ha */
    private int f282ha;

    /* renamed from: i */
    AbstractC0103r f283i;

    /* renamed from: ia */
    private ArrayList<View> f284ia;

    /* renamed from: j */
    int f285j;

    /* renamed from: ja */
    private final Runnable f286ja;

    /* renamed from: k */
    private int f287k;

    /* renamed from: ka */
    private int f288ka;

    /* renamed from: l */
    private Parcelable f289l;

    /* renamed from: m */
    private ClassLoader f290m;

    /* renamed from: n */
    private Scroller f291n;

    /* renamed from: o */
    private boolean f292o;

    /* renamed from: p */
    private h f293p;

    /* renamed from: q */
    private int f294q;

    /* renamed from: r */
    private Drawable f295r;

    /* renamed from: s */
    private int f296s;

    /* renamed from: t */
    private int f297t;

    /* renamed from: u */
    private float f298u;

    /* renamed from: v */
    private float f299v;

    /* renamed from: w */
    private int f300w;

    /* renamed from: x */
    private int f301x;

    /* renamed from: y */
    private boolean f302y;

    /* renamed from: z */
    private boolean f303z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: a.b.c.h.C$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.c.h.C$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        Object f304a;

        /* renamed from: b */
        int f305b;

        /* renamed from: c */
        boolean f306c;

        /* renamed from: d */
        float f307d;

        /* renamed from: e */
        float f308e;

        b() {
        }
    }

    /* renamed from: a.b.c.h.C$c */
    /* loaded from: classes.dex */
    public static class c extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f309a;

        /* renamed from: b */
        public int f310b;

        /* renamed from: c */
        float f311c;

        /* renamed from: d */
        boolean f312d;

        /* renamed from: e */
        int f313e;

        /* renamed from: f */
        int f314f;

        public c() {
            super(-1, -1);
            this.f311c = 0.0f;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f311c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0069C.f244a);
            this.f310b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.c.h.C$d */
    /* loaded from: classes.dex */
    public class d extends C0089d {
        d() {
        }

        /* renamed from: b */
        private boolean m320b() {
            AbstractC0103r abstractC0103r = C0069C.this.f283i;
            return abstractC0103r != null && abstractC0103r.mo475a() > 1;
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public void mo321a(View view, C0080a c0080a) {
            super.mo321a(view, c0080a);
            c0080a.m367a((CharSequence) C0069C.class.getName());
            c0080a.m390g(m320b());
            if (C0069C.this.canScrollHorizontally(1)) {
                c0080a.m364a(4096);
            }
            if (C0069C.this.canScrollHorizontally(-1)) {
                c0080a.m364a(8192);
            }
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public boolean mo322a(View view, int i, Bundle bundle) {
            C0069C c0069c;
            int i2;
            if (super.mo322a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C0069C.this.canScrollHorizontally(-1)) {
                    return false;
                }
                c0069c = C0069C.this;
                i2 = c0069c.f285j - 1;
            } else {
                if (!C0069C.this.canScrollHorizontally(1)) {
                    return false;
                }
                c0069c = C0069C.this;
                i2 = c0069c.f285j + 1;
            }
            c0069c.setCurrentItem(i2);
            return true;
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: b */
        public void mo323b(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0103r abstractC0103r;
            super.mo323b(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0069C.class.getName());
            accessibilityEvent.setScrollable(m320b());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0103r = C0069C.this.f283i) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0103r.mo475a());
            accessibilityEvent.setFromIndex(C0069C.this.f285j);
            accessibilityEvent.setToIndex(C0069C.this.f285j);
        }
    }

    /* renamed from: a.b.c.h.C$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void m324a(C0069C c0069c, AbstractC0103r abstractC0103r, AbstractC0103r abstractC0103r2);
    }

    /* renamed from: a.b.c.h.C$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo325a(int i);

        /* renamed from: a */
        void mo326a(int i, float f, int i2);

        /* renamed from: b */
        void mo327b(int i);
    }

    /* renamed from: a.b.c.h.C$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void m328a(View view, float f);
    }

    /* renamed from: a.b.c.h.C$h */
    /* loaded from: classes.dex */
    private class h extends DataSetObserver {
        h() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C0069C.this.m304a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0069C.this.m304a();
        }
    }

    /* renamed from: a.b.c.h.C$i */
    /* loaded from: classes.dex */
    public static class i extends AbstractC0088c {
        public static final Parcelable.Creator<i> CREATOR = new C0070D();

        /* renamed from: a */
        int f317a;

        /* renamed from: b */
        Parcelable f318b;

        /* renamed from: c */
        ClassLoader f319c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
            this.f317a = parcel.readInt();
            this.f318b = parcel.readParcelable(classLoader);
            this.f319c = classLoader;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f317a + "}";
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0088c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f317a);
            parcel.writeParcelable(this.f318b, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.c.h.C$j */
    /* loaded from: classes.dex */
    public static class j implements Comparator<View> {
        j() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            c cVar = (c) view.getLayoutParams();
            c cVar2 = (c) view2.getLayoutParams();
            boolean z = cVar.f309a;
            return z != cVar2.f309a ? z ? 1 : -1 : cVar.f313e - cVar2.f313e;
        }
    }

    public C0069C(Context context) {
        super(context);
        this.f277f = new ArrayList<>();
        this.f279g = new b();
        this.f281h = new Rect();
        this.f287k = -1;
        this.f289l = null;
        this.f290m = null;
        this.f298u = -3.4028235E38f;
        this.f299v = Float.MAX_VALUE;
        this.f249B = 1;
        this.f259L = -1;
        this.f268U = true;
        this.f269V = false;
        this.f286ja = new RunnableC0067A(this);
        this.f288ka = 0;
        m315b();
    }

    /* renamed from: a */
    private int m280a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.f263P || Math.abs(i3) <= this.f261N) {
            i2 += (int) (f2 + (i2 >= this.f285j ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f277f.size() <= 0) {
            return i2;
        }
        return Math.max(this.f277f.get(0).f305b, Math.min(i2, this.f277f.get(r4.size() - 1).f305b));
    }

    /* renamed from: a */
    private Rect m281a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m282a(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.f277f.isEmpty()) {
            b m313b = m313b(this.f285j);
            min = (int) ((m313b != null ? Math.min(m313b.f308e, this.f299v) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            } else {
                m286a(false);
            }
        } else if (!this.f291n.isFinished()) {
            this.f291n.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m283a(int i2, boolean z, int i3, boolean z2) {
        b m313b = m313b(i2);
        int clientWidth = m313b != null ? (int) (getClientWidth() * Math.max(this.f298u, Math.min(m313b.f308e, this.f299v))) : 0;
        if (z) {
            m306a(clientWidth, 0, i3);
            if (z2) {
                m293d(i2);
                return;
            }
            return;
        }
        if (z2) {
            m293d(i2);
        }
        m286a(false);
        scrollTo(clientWidth, 0);
        m296f(clientWidth);
    }

    /* renamed from: a */
    private void m284a(b bVar, int i2, b bVar2) {
        int i3;
        int i4;
        b bVar3;
        b bVar4;
        int mo475a = this.f283i.mo475a();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.f294q / clientWidth : 0.0f;
        if (bVar2 != null) {
            int i5 = bVar2.f305b;
            int i6 = bVar.f305b;
            if (i5 < i6) {
                float f3 = bVar2.f308e + bVar2.f307d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= bVar.f305b && i8 < this.f277f.size()) {
                    while (true) {
                        bVar4 = this.f277f.get(i8);
                        if (i7 <= bVar4.f305b || i8 >= this.f277f.size() - 1) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    while (i7 < bVar4.f305b) {
                        f3 += this.f283i.m474a(i7) + f2;
                        i7++;
                    }
                    bVar4.f308e = f3;
                    f3 += bVar4.f307d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.f277f.size() - 1;
                float f4 = bVar2.f308e;
                while (true) {
                    i5--;
                    if (i5 < bVar.f305b || size < 0) {
                        break;
                    }
                    while (true) {
                        bVar3 = this.f277f.get(size);
                        if (i5 >= bVar3.f305b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i5 > bVar3.f305b) {
                        f4 -= this.f283i.m474a(i5) + f2;
                        i5--;
                    }
                    f4 -= bVar3.f307d + f2;
                    bVar3.f308e = f4;
                }
            }
        }
        int size2 = this.f277f.size();
        float f5 = bVar.f308e;
        int i9 = bVar.f305b;
        int i10 = i9 - 1;
        this.f298u = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = mo475a - 1;
        this.f299v = bVar.f305b == i11 ? (bVar.f308e + bVar.f307d) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            b bVar5 = this.f277f.get(i12);
            while (true) {
                i4 = bVar5.f305b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.f283i.m474a(i10) + f2;
                i10--;
            }
            f5 -= bVar5.f307d + f2;
            bVar5.f308e = f5;
            if (i4 == 0) {
                this.f298u = f5;
            }
            i12--;
            i10--;
        }
        float f6 = bVar.f308e + bVar.f307d + f2;
        int i13 = bVar.f305b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            b bVar6 = this.f277f.get(i14);
            while (true) {
                i3 = bVar6.f305b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.f283i.m474a(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.f299v = (bVar6.f307d + f6) - 1.0f;
            }
            bVar6.f308e = f6;
            f6 += bVar6.f307d + f2;
            i14++;
            i13++;
        }
        this.f269V = false;
    }

    /* renamed from: a */
    private void m285a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f259L) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f255H = motionEvent.getX(i2);
            this.f259L = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f260M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m286a(boolean z) {
        boolean z2 = this.f288ka == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f291n.isFinished()) {
                this.f291n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f291n.getCurrX();
                int currY = this.f291n.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m296f(currX);
                    }
                }
            }
        }
        this.f248A = false;
        boolean z3 = z2;
        for (int i2 = 0; i2 < this.f277f.size(); i2++) {
            b bVar = this.f277f.get(i2);
            if (bVar.f306c) {
                bVar.f306c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0107v.m501a(this, this.f286ja);
            } else {
                this.f286ja.run();
            }
        }
    }

    /* renamed from: a */
    private boolean m287a(float f2, float f3) {
        return (f2 < ((float) this.f253F) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.f253F)) && f3 < 0.0f);
    }

    /* renamed from: b */
    private void m288b(int i2, float f2, int i3) {
        f fVar = this.f273ca;
        if (fVar != null) {
            fVar.mo326a(i2, f2, i3);
        }
        List<f> list = this.f272ba;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar2 = this.f272ba.get(i4);
                if (fVar2 != null) {
                    fVar2.mo326a(i2, f2, i3);
                }
            }
        }
        f fVar3 = this.f274da;
        if (fVar3 != null) {
            fVar3.mo326a(i2, f2, i3);
        }
    }

    /* renamed from: b */
    private void m289b(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.f280ga : 0, null);
        }
    }

    /* renamed from: b */
    private boolean m290b(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.f255H - f2;
        this.f255H = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.f298u * clientWidth;
        float f5 = this.f299v * clientWidth;
        boolean z3 = false;
        b bVar = this.f277f.get(0);
        ArrayList<b> arrayList = this.f277f;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f305b != 0) {
            f4 = bVar.f308e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f305b != this.f283i.mo475a() - 1) {
            f5 = bVar2.f308e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.f266S.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.f267T.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.f255H += scrollX - i2;
        scrollTo(i2, getScrollY());
        m296f(i2);
        return z3;
    }

    /* renamed from: c */
    private void m291c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private static boolean m292c(View view) {
        return view.getClass().getAnnotation(a.class) != null;
    }

    /* renamed from: d */
    private void m293d(int i2) {
        f fVar = this.f273ca;
        if (fVar != null) {
            fVar.mo327b(i2);
        }
        List<f> list = this.f272ba;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar2 = this.f272ba.get(i3);
                if (fVar2 != null) {
                    fVar2.mo327b(i2);
                }
            }
        }
        f fVar3 = this.f274da;
        if (fVar3 != null) {
            fVar3.mo327b(i2);
        }
    }

    /* renamed from: e */
    private void m294e(int i2) {
        f fVar = this.f273ca;
        if (fVar != null) {
            fVar.mo325a(i2);
        }
        List<f> list = this.f272ba;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar2 = this.f272ba.get(i3);
                if (fVar2 != null) {
                    fVar2.mo325a(i2);
                }
            }
        }
        f fVar3 = this.f274da;
        if (fVar3 != null) {
            fVar3.mo325a(i2);
        }
    }

    /* renamed from: f */
    private void m295f() {
        this.f250C = false;
        this.f251D = false;
        VelocityTracker velocityTracker = this.f260M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f260M = null;
        }
    }

    /* renamed from: f */
    private boolean m296f(int i2) {
        if (this.f277f.size() == 0) {
            if (this.f268U) {
                return false;
            }
            this.f270W = false;
            m305a(0, 0.0f, 0);
            if (this.f270W) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b m297g = m297g();
        int clientWidth = getClientWidth();
        int i3 = this.f294q;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = m297g.f305b;
        float f3 = ((i2 / f2) - m297g.f308e) / (m297g.f307d + (i3 / f2));
        this.f270W = false;
        m305a(i5, f3, (int) (i4 * f3));
        if (this.f270W) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: g */
    private b m297g() {
        int i2;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f294q / clientWidth : 0.0f;
        b bVar = null;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (i3 < this.f277f.size()) {
            b bVar2 = this.f277f.get(i3);
            if (!z && bVar2.f305b != (i2 = i4 + 1)) {
                bVar2 = this.f279g;
                bVar2.f308e = f3 + f4 + f2;
                bVar2.f305b = i2;
                bVar2.f307d = this.f283i.m474a(bVar2.f305b);
                i3--;
            }
            f3 = bVar2.f308e;
            float f5 = bVar2.f307d + f3 + f2;
            if (!z && scrollX < f3) {
                return bVar;
            }
            if (scrollX < f5 || i3 == this.f277f.size() - 1) {
                return bVar2;
            }
            i4 = bVar2.f305b;
            f4 = bVar2.f307d;
            i3++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m298h() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((c) getChildAt(i2).getLayoutParams()).f309a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: i */
    private boolean m299i() {
        this.f259L = -1;
        m295f();
        this.f266S.onRelease();
        this.f267T.onRelease();
        return this.f266S.isFinished() || this.f267T.isFinished();
    }

    /* renamed from: j */
    private void m300j() {
        if (this.f282ha != 0) {
            ArrayList<View> arrayList = this.f284ia;
            if (arrayList == null) {
                this.f284ia = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f284ia.add(getChildAt(i2));
            }
            Collections.sort(this.f284ia, f247d);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f303z != z) {
            this.f303z = z;
        }
    }

    /* renamed from: a */
    float m301a(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    /* renamed from: a */
    b m302a(int i2, int i3) {
        b bVar = new b();
        bVar.f305b = i2;
        bVar.f304a = this.f283i.mo477a(this, i2);
        bVar.f307d = this.f283i.m474a(i2);
        if (i3 < 0 || i3 >= this.f277f.size()) {
            this.f277f.add(bVar);
        } else {
            this.f277f.add(i3, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    b m303a(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m314b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: a */
    void m304a() {
        int mo475a = this.f283i.mo475a();
        this.f275e = mo475a;
        boolean z = this.f277f.size() < (this.f249B * 2) + 1 && this.f277f.size() < mo475a;
        int i2 = this.f285j;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.f277f.size()) {
            b bVar = this.f277f.get(i3);
            int mo476a = this.f283i.mo476a(bVar.f304a);
            if (mo476a != -1) {
                if (mo476a == -2) {
                    this.f277f.remove(i3);
                    i3--;
                    if (!z2) {
                        this.f283i.mo487b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f283i.mo483a((ViewGroup) this, bVar.f305b, bVar.f304a);
                    int i4 = this.f285j;
                    if (i4 == bVar.f305b) {
                        i2 = Math.max(0, Math.min(i4, mo475a - 1));
                    }
                } else {
                    int i5 = bVar.f305b;
                    if (i5 != mo476a) {
                        if (i5 == this.f285j) {
                            i2 = mo476a;
                        }
                        bVar.f305b = mo476a;
                    }
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.f283i.mo482a((ViewGroup) this);
        }
        Collections.sort(this.f277f, f245b);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                c cVar = (c) getChildAt(i6).getLayoutParams();
                if (!cVar.f309a) {
                    cVar.f311c = 0.0f;
                }
            }
            m308a(i2, false, true);
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m305a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f271aa
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L1d:
            if (r3 >= r6) goto L6d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            a.b.c.h.C$c r9 = (p000a.p005b.p009c.p019h.C0069C.c) r9
            boolean r10 = r9.f309a
            if (r10 != 0) goto L2e
            goto L6a
        L2e:
            int r9 = r9.f310b
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L3c
            r9 = r4
            goto L5e
        L3c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L5b
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L5e
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L5b:
            r11 = r9
            r9 = r4
            r4 = r11
        L5e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L69
            r8.offsetLeftAndRight(r4)
        L69:
            r4 = r9
        L6a:
            int r3 = r3 + 1
            goto L1d
        L6d:
            r12.m288b(r13, r14, r15)
            a.b.c.h.C$g r13 = r12.f278fa
            if (r13 == 0) goto La1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7c:
            if (r1 >= r14) goto La1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            a.b.c.h.C$c r0 = (p000a.p005b.p009c.p019h.C0069C.c) r0
            boolean r0 = r0.f309a
            if (r0 == 0) goto L8d
            goto L9e
        L8d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            a.b.c.h.C$g r3 = r12.f278fa
            r3.m328a(r15, r0)
        L9e:
            int r1 = r1 + 1
            goto L7c
        La1:
            r12.f270W = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p019h.C0069C.m305a(int, float, int):void");
    }

    /* renamed from: a */
    void m306a(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f291n;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f292o ? this.f291n.getCurrX() : this.f291n.getStartX();
            this.f291n.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m286a(false);
            m319e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float m301a = f3 + (m301a(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m301a / abs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.f283i.m474a(this.f285j)) + this.f294q)) + 1.0f) * 100.0f), 600);
        this.f292o = false;
        this.f291n.startScroll(i5, scrollY, i6, i7, min);
        C0107v.m532t(this);
    }

    /* renamed from: a */
    public void m307a(int i2, boolean z) {
        this.f248A = false;
        m308a(i2, z, false);
    }

    /* renamed from: a */
    void m308a(int i2, boolean z, boolean z2) {
        m309a(i2, z, z2, 0);
    }

    /* renamed from: a */
    void m309a(int i2, boolean z, boolean z2, int i3) {
        AbstractC0103r abstractC0103r = this.f283i;
        if (abstractC0103r == null || abstractC0103r.mo475a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f285j == i2 && this.f277f.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.f283i.mo475a()) {
            i2 = this.f283i.mo475a() - 1;
        }
        int i4 = this.f249B;
        int i5 = this.f285j;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.f277f.size(); i6++) {
                this.f277f.get(i6).f306c = true;
            }
        }
        boolean z3 = this.f285j != i2;
        if (!this.f268U) {
            m316c(i2);
            m283a(i2, z, i3, z3);
        } else {
            this.f285j = i2;
            if (z3) {
                m293d(i2);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    public boolean m310a(int i2) {
        boolean m318d;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    }
                    if (parent == this) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        if (findNextFocus == null || findNextFocus == view) {
            if (i2 == 17 || i2 == 1) {
                z2 = m317c();
            } else if (i2 == 66 || i2 == 2) {
                z2 = m318d();
            }
        } else if (i2 == 17) {
            int i3 = m281a(this.f281h, findNextFocus).left;
            int i4 = m281a(this.f281h, view).left;
            if (view != null && i3 >= i4) {
                m318d = m317c();
                z2 = m318d;
            }
            m318d = findNextFocus.requestFocus();
            z2 = m318d;
        } else if (i2 == 66) {
            int i5 = m281a(this.f281h, findNextFocus).left;
            int i6 = m281a(this.f281h, view).left;
            if (view != null && i5 <= i6) {
                m318d = m318d();
                z2 = m318d;
            }
            m318d = findNextFocus.requestFocus();
            z2 = m318d;
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z2;
    }

    /* renamed from: a */
    public boolean m311a(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return m310a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return m310a(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return m318d();
                    }
                    i2 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return m317c();
                }
                i2 = 17;
            }
            return m310a(i2);
        }
        return false;
    }

    /* renamed from: a */
    protected boolean m312a(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m312a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b m314b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (m314b = m314b(childAt)) != null && m314b.f305b == this.f285j) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b m314b;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m314b = m314b(childAt)) != null && m314b.f305b == this.f285j) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        cVar.f309a |= m292c(view);
        if (!this.f302y) {
            super.addView(view, i2, layoutParams);
        } else {
            if (cVar != null && cVar.f309a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            cVar.f312d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* renamed from: b */
    b m313b(int i2) {
        for (int i3 = 0; i3 < this.f277f.size(); i3++) {
            b bVar = this.f277f.get(i3);
            if (bVar.f305b == i2) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    b m314b(View view) {
        for (int i2 = 0; i2 < this.f277f.size(); i2++) {
            b bVar = this.f277f.get(i2);
            if (this.f283i.mo484a(view, bVar.f304a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    void m315b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f291n = new Scroller(context, f246c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f254G = viewConfiguration.getScaledPagingTouchSlop();
        this.f261N = (int) (400.0f * f2);
        this.f262O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f266S = new EdgeEffect(context);
        this.f267T = new EdgeEffect(context);
        this.f263P = (int) (25.0f * f2);
        this.f264Q = (int) (2.0f * f2);
        this.f252E = (int) (f2 * 16.0f);
        C0107v.m496a(this, new d());
        if (C0107v.m516f(this) == 0) {
            C0107v.m513d(this, 1);
        }
        C0107v.m497a(this, new C0068B(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d1, code lost:            if (r15 >= 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00df, code lost:            if (r15 >= 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:            if (r9 == r10) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:            r8 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:            if (r15 >= 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:            r5 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:            r5 = r17.f277f.get(r15);     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m316c(int r18) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p019h.C0069C.m316c(int):void");
    }

    /* renamed from: c */
    boolean m317c() {
        int i2 = this.f285j;
        if (i2 <= 0) {
            return false;
        }
        m307a(i2 - 1, true);
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.f283i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f298u)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.f299v));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f292o = true;
        if (this.f291n.isFinished() || !this.f291n.computeScrollOffset()) {
            m286a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f291n.getCurrX();
        int currY = this.f291n.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m296f(currX)) {
                this.f291n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0107v.m532t(this);
    }

    /* renamed from: d */
    boolean m318d() {
        AbstractC0103r abstractC0103r = this.f283i;
        if (abstractC0103r == null || this.f285j >= abstractC0103r.mo475a() - 1) {
            return false;
        }
        m307a(this.f285j + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m311a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b m314b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m314b = m314b(childAt)) != null && m314b.f305b == this.f285j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0103r abstractC0103r;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0103r = this.f283i) != null && abstractC0103r.mo475a() > 1)) {
            if (!this.f266S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f298u * width);
                this.f266S.setSize(height, width);
                z = false | this.f266S.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f267T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f299v + 1.0f)) * width2);
                this.f267T.setSize(height2, width2);
                z |= this.f267T.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f266S.finish();
            this.f267T.finish();
        }
        if (z) {
            C0107v.m532t(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f295r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m319e() {
        m316c(this.f285j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0103r getAdapter() {
        return this.f283i;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.f282ha == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.f284ia.get(i3).getLayoutParams()).f314f;
    }

    public int getCurrentItem() {
        return this.f285j;
    }

    public int getOffscreenPageLimit() {
        return this.f249B;
    }

    public int getPageMargin() {
        return this.f294q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f268U = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f286ja);
        Scroller scroller = this.f291n;
        if (scroller != null && !scroller.isFinished()) {
            this.f291n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f294q <= 0 || this.f295r == null || this.f277f.size() <= 0 || this.f283i == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.f294q / width;
        int i2 = 0;
        b bVar = this.f277f.get(0);
        float f5 = bVar.f308e;
        int size = this.f277f.size();
        int i3 = bVar.f305b;
        int i4 = this.f277f.get(size - 1).f305b;
        while (i3 < i4) {
            while (i3 > bVar.f305b && i2 < size) {
                i2++;
                bVar = this.f277f.get(i2);
            }
            if (i3 == bVar.f305b) {
                float f6 = bVar.f308e;
                float f7 = bVar.f307d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float m474a = this.f283i.m474a(i3);
                f2 = (f5 + m474a) * width;
                f5 += m474a + f4;
            }
            if (this.f294q + f2 > scrollX) {
                f3 = f4;
                this.f295r.setBounds(Math.round(f2), this.f296s, Math.round(this.f294q + f2), this.f297t);
                this.f295r.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i3++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m299i();
            return false;
        }
        if (action != 0) {
            if (this.f250C) {
                return true;
            }
            if (this.f251D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f257J = x;
            this.f255H = x;
            float y = motionEvent.getY();
            this.f258K = y;
            this.f256I = y;
            this.f259L = motionEvent.getPointerId(0);
            this.f251D = false;
            this.f292o = true;
            this.f291n.computeScrollOffset();
            if (this.f288ka != 2 || Math.abs(this.f291n.getFinalX() - this.f291n.getCurrX()) <= this.f264Q) {
                m286a(false);
                this.f250C = false;
            } else {
                this.f291n.abortAnimation();
                this.f248A = false;
                m319e();
                this.f250C = true;
                m291c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.f259L;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.f255H;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f258K);
                if (f2 != 0.0f && !m287a(this.f255H, f2) && m312a(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.f255H = x2;
                    this.f256I = y2;
                    this.f251D = true;
                    return false;
                }
                if (abs > this.f254G && abs * 0.5f > abs2) {
                    this.f250C = true;
                    m291c(true);
                    setScrollState(1);
                    this.f255H = f2 > 0.0f ? this.f257J + this.f254G : this.f257J - this.f254G;
                    this.f256I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > this.f254G) {
                    this.f251D = true;
                }
                if (this.f250C && m290b(x2)) {
                    C0107v.m532t(this);
                }
            }
        } else if (action == 6) {
            m285a(motionEvent);
        }
        if (this.f260M == null) {
            this.f260M = VelocityTracker.obtain();
        }
        this.f260M.addMovement(motionEvent);
        return this.f250C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        b m314b;
        int max;
        int max2;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = paddingBottom;
        int i9 = 0;
        int i10 = paddingTop;
        int i11 = paddingLeft;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f309a) {
                    int i13 = cVar.f310b;
                    int i14 = i13 & 7;
                    int i15 = i13 & C0121j.AppCompatTheme_windowActionBarOverlay;
                    if (i14 == 1) {
                        max = Math.max((i6 - childAt.getMeasuredWidth()) / 2, i11);
                    } else if (i14 == 3) {
                        max = i11;
                        i11 = childAt.getMeasuredWidth() + i11;
                    } else if (i14 != 5) {
                        max = i11;
                    } else {
                        max = (i6 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i15 == 16) {
                        max2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, i10);
                    } else if (i15 == 48) {
                        max2 = i10;
                        i10 = childAt.getMeasuredHeight() + i10;
                    } else if (i15 != 80) {
                        max2 = i10;
                    } else {
                        max2 = (i7 - i8) - childAt.getMeasuredHeight();
                        i8 += childAt.getMeasuredHeight();
                    }
                    int i16 = max + scrollX;
                    childAt.layout(i16, max2, childAt.getMeasuredWidth() + i16, max2 + childAt.getMeasuredHeight());
                    i9++;
                }
            }
        }
        int i17 = (i6 - i11) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.f309a && (m314b = m314b(childAt2)) != null) {
                    float f2 = i17;
                    int i19 = ((int) (m314b.f308e * f2)) + i11;
                    if (cVar2.f312d) {
                        cVar2.f312d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * cVar2.f311c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - i10) - i8, 1073741824));
                    }
                    childAt2.layout(i19, i10, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + i10);
                }
            }
        }
        this.f296s = i10;
        this.f297t = i7 - i8;
        this.f271aa = i9;
        if (this.f268U) {
            z2 = false;
            m283a(this.f285j, false, 0, false);
        } else {
            z2 = false;
        }
        this.f268U = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p019h.C0069C.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        b m314b;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (m314b = m314b(childAt)) != null && m314b.f305b == this.f285j && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.m411a());
        AbstractC0103r abstractC0103r = this.f283i;
        if (abstractC0103r != null) {
            abstractC0103r.mo479a(iVar.f318b, iVar.f319c);
            m308a(iVar.f317a, false, true);
        } else {
            this.f287k = iVar.f317a;
            this.f289l = iVar.f318b;
            this.f290m = iVar.f319c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f317a = this.f285j;
        AbstractC0103r abstractC0103r = this.f283i;
        if (abstractC0103r != null) {
            iVar.f318b = abstractC0103r.mo489c();
        }
        return iVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f294q;
            m282a(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p019h.C0069C.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f302y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC0103r abstractC0103r) {
        AbstractC0103r abstractC0103r2 = this.f283i;
        if (abstractC0103r2 != null) {
            abstractC0103r2.m478a((DataSetObserver) null);
            this.f283i.mo487b((ViewGroup) this);
            for (int i2 = 0; i2 < this.f277f.size(); i2++) {
                b bVar = this.f277f.get(i2);
                this.f283i.mo483a((ViewGroup) this, bVar.f305b, bVar.f304a);
            }
            this.f283i.mo482a((ViewGroup) this);
            this.f277f.clear();
            m298h();
            this.f285j = 0;
            scrollTo(0, 0);
        }
        AbstractC0103r abstractC0103r3 = this.f283i;
        this.f283i = abstractC0103r;
        this.f275e = 0;
        if (this.f283i != null) {
            if (this.f293p == null) {
                this.f293p = new h();
            }
            this.f283i.m478a((DataSetObserver) this.f293p);
            this.f248A = false;
            boolean z = this.f268U;
            this.f268U = true;
            this.f275e = this.f283i.mo475a();
            if (this.f287k >= 0) {
                this.f283i.mo479a(this.f289l, this.f290m);
                m308a(this.f287k, false, true);
                this.f287k = -1;
                this.f289l = null;
                this.f290m = null;
            } else if (z) {
                requestLayout();
            } else {
                m319e();
            }
        }
        List<e> list = this.f276ea;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f276ea.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f276ea.get(i3).m324a(this, abstractC0103r3, abstractC0103r);
        }
    }

    public void setCurrentItem(int i2) {
        this.f248A = false;
        m308a(i2, !this.f268U, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.f249B) {
            this.f249B = i2;
            m319e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.f273ca = fVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f294q;
        this.f294q = i2;
        int width = getWidth();
        m282a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(C0022a.m92c(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f295r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (this.f288ka == i2) {
            return;
        }
        this.f288ka = i2;
        if (this.f278fa != null) {
            m289b(i2 != 0);
        }
        m294e(i2);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f295r;
    }
}
