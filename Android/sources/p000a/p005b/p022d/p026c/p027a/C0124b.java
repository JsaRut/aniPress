package p000a.p005b.p022d.p026c.p027a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.util.C0262h;
import android.support.v4.util.C0270p;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p007b.p008a.C0014d;
import p000a.p005b.p009c.p010a.p011a.C0031i;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p026c.p027a.C0126d;
import p000a.p005b.p022d.p026c.p027a.C0128f;

/* renamed from: a.b.d.c.a.b */
/* loaded from: classes.dex */
public class C0124b extends C0128f {

    /* renamed from: p */
    private b f419p;

    /* renamed from: q */
    private f f420q;

    /* renamed from: r */
    private int f421r;

    /* renamed from: s */
    private int f422s;

    /* renamed from: t */
    private boolean f423t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.d.c.a.b$a */
    /* loaded from: classes.dex */
    public static class a extends f {

        /* renamed from: a */
        private final Animatable f424a;

        a(Animatable animatable) {
            super();
            this.f424a = animatable;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: c */
        public void mo564c() {
            this.f424a.start();
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: d */
        public void mo565d() {
            this.f424a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.d.c.a.b$b */
    /* loaded from: classes.dex */
    public static class b extends C0128f.a {

        /* renamed from: K */
        C0262h<Long> f425K;

        /* renamed from: L */
        C0270p<Integer> f426L;

        b(b bVar, C0124b c0124b, Resources resources) {
            super(bVar, c0124b, resources);
            C0270p<Integer> c0270p;
            if (bVar != null) {
                this.f425K = bVar.f425K;
                c0270p = bVar.f426L;
            } else {
                this.f425K = new C0262h<>();
                c0270p = new C0270p<>();
            }
            this.f426L = c0270p;
        }

        /* renamed from: f */
        private static long m566f(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: a */
        int m567a(int i, int i2, Drawable drawable, boolean z) {
            int m590a = super.m590a(drawable);
            long m566f = m566f(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = m590a;
            this.f425K.m1359a(m566f, Long.valueOf(j2 | j));
            if (z) {
                this.f425K.m1359a(m566f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m590a;
        }

        /* renamed from: a */
        int m568a(int[] iArr, Drawable drawable, int i) {
            int m616a = super.m616a(iArr, drawable);
            this.f426L.m1406c(m616a, Integer.valueOf(i));
            return m616a;
        }

        /* renamed from: b */
        int m569b(int[] iArr) {
            int m615a = super.m615a(iArr);
            return m615a >= 0 ? m615a : super.m615a(StateSet.WILD_CARD);
        }

        /* renamed from: c */
        int m570c(int i, int i2) {
            return (int) this.f425K.m1363b(m566f(i, i2), -1L).longValue();
        }

        /* renamed from: d */
        int m571d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f426L.m1404b(i, 0).intValue();
        }

        /* renamed from: d */
        boolean m572d(int i, int i2) {
            return (this.f425K.m1363b(m566f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: e */
        boolean m573e(int i, int i2) {
            return (this.f425K.m1363b(m566f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0128f.a, p000a.p005b.p022d.p026c.p027a.C0126d.b
        /* renamed from: m */
        void mo574m() {
            this.f425K = this.f425K.m11775clone();
            this.f426L = this.f426L.m11776clone();
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0128f.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0124b(this, null);
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0128f.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0124b(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.d.c.a.b$c */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: a */
        private final C0014d f427a;

        c(C0014d c0014d) {
            super();
            this.f427a = c0014d;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: c */
        public void mo564c() {
            this.f427a.start();
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: d */
        public void mo565d() {
            this.f427a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.d.c.a.b$d */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: a */
        private final ObjectAnimator f428a;

        /* renamed from: b */
        private final boolean f429b;

        d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(eVar.m577a());
            ofInt.setInterpolator(eVar);
            this.f429b = z2;
            this.f428a = ofInt;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: a */
        public boolean mo575a() {
            return this.f429b;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: b */
        public void mo576b() {
            this.f428a.reverse();
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: c */
        public void mo564c() {
            this.f428a.start();
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0124b.f
        /* renamed from: d */
        public void mo565d() {
            this.f428a.cancel();
        }
    }

    /* renamed from: a.b.d.c.a.b$e */
    /* loaded from: classes.dex */
    private static class e implements TimeInterpolator {

        /* renamed from: a */
        private int[] f430a;

        /* renamed from: b */
        private int f431b;

        /* renamed from: c */
        private int f432c;

        e(AnimationDrawable animationDrawable, boolean z) {
            m578a(animationDrawable, z);
        }

        /* renamed from: a */
        int m577a() {
            return this.f432c;
        }

        /* renamed from: a */
        int m578a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f431b = numberOfFrames;
            int[] iArr = this.f430a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f430a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f430a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f432c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f432c) + 0.5f);
            int i2 = this.f431b;
            int[] iArr = this.f430a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f432c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.d.c.a.b$f */
    /* loaded from: classes.dex */
    public static abstract class f {
        private f() {
        }

        /* renamed from: a */
        public boolean mo575a() {
            return false;
        }

        /* renamed from: b */
        public void mo576b() {
        }

        /* renamed from: c */
        public abstract void mo564c();

        /* renamed from: d */
        public abstract void mo565d();
    }

    public C0124b() {
        this(null, null);
    }

    C0124b(b bVar, Resources resources) {
        super(null);
        this.f421r = -1;
        this.f422s = -1;
        mo562a(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0124b m554a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0124b c0124b = new C0124b();
            c0124b.m563b(context, resources, xmlPullParser, attributeSet, theme);
            return c0124b;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: a */
    private void m555a(TypedArray typedArray) {
        b bVar = this.f419p;
        if (Build.VERSION.SDK_INT >= 21) {
            bVar.f460d |= typedArray.getChangingConfigurations();
        }
        bVar.m599b(typedArray.getBoolean(C0121j.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f465i));
        bVar.m595a(typedArray.getBoolean(C0121j.AnimatedStateListDrawableCompat_android_constantSize, bVar.f468l));
        bVar.m598b(typedArray.getInt(C0121j.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f448A));
        bVar.m602c(typedArray.getInt(C0121j.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.f449B));
        setDither(typedArray.getBoolean(C0121j.AnimatedStateListDrawableCompat_android_dither, bVar.f480x));
    }

    /* renamed from: b */
    private boolean m556b(int i) {
        int m585b;
        int m570c;
        f aVar;
        f fVar = this.f420q;
        if (fVar == null) {
            m585b = m585b();
        } else {
            if (i == this.f421r) {
                return true;
            }
            if (i == this.f422s && fVar.mo575a()) {
                fVar.mo576b();
                this.f421r = this.f422s;
                this.f422s = i;
                return true;
            }
            m585b = this.f421r;
            fVar.mo565d();
        }
        this.f420q = null;
        this.f422s = -1;
        this.f421r = -1;
        b bVar = this.f419p;
        int m571d = bVar.m571d(m585b);
        int m571d2 = bVar.m571d(i);
        if (m571d2 == 0 || m571d == 0 || (m570c = bVar.m570c(m571d, m571d2)) < 0) {
            return false;
        }
        boolean m573e = bVar.m573e(m571d, m571d2);
        m584a(m570c);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            aVar = new d((AnimationDrawable) current, bVar.m572d(m571d, m571d2), m573e);
        } else {
            if (!(current instanceof C0014d)) {
                if (current instanceof Animatable) {
                    aVar = new a((Animatable) current);
                }
                return false;
            }
            aVar = new c((C0014d) current);
        }
        aVar.mo564c();
        this.f420q = aVar;
        this.f422s = m585b;
        this.f421r = i;
        return true;
    }

    /* renamed from: c */
    private void m557c() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m558c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m559d(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m560e(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:            if (r5 != 2) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:            if (r7.getName().equals("vector") == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:            r5 = p000a.p005b.p007b.p008a.C0021k.createFromXmlInner(r6, r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:            if (android.os.Build.VERSION.SDK_INT < 21) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:            r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:            r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:            if (r5 == null) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:            return r4.f419p.m568a(r0, r5, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:            if (r5 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:            r5 = r7.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:            if (r5 != 4) goto L28;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m559d(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            int[] r0 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = p000a.p005b.p009c.p010a.p011a.C0031i.m146a(r6, r9, r8, r0)
            int r1 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1b
            android.graphics.drawable.Drawable r5 = p000a.p005b.p022d.p024b.p025a.C0122a.m550b(r5, r2)
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r0.recycle()
            int[] r0 = r4.m614a(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L6c
        L27:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L2f
            goto L27
        L2f:
            r3 = 2
            if (r5 != r3) goto L53
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L43
            a.b.b.a.k r5 = p000a.p005b.p007b.p008a.C0021k.createFromXmlInner(r6, r7, r8, r9)
            goto L6c
        L43:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L4e
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8, r9)
            goto L6c
        L4e:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L6c
        L53:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L6c:
            if (r5 == 0) goto L75
            a.b.d.c.a.b$b r6 = r4.f419p
            int r5 = r6.m568a(r0, r5, r1)
            return r5
        L75:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p022d.p026c.p027a.C0124b.m559d(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:            if (r4 != 2) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:            if (r10.getName().equals("animated-vector") == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:            r4 = p000a.p005b.p007b.p008a.C0014d.m16a(r8, r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:            if (android.os.Build.VERSION.SDK_INT < 21) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:            r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:            r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:            if (r4 == null) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:            if (r1 == (-1)) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:            if (r3 == (-1)) goto L27;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:            return r7.f419p.m567a(r1, r3, r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:            if (r4 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:            r4 = r10.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:            if (r4 != 4) goto L32;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m560e(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = p000a.p005b.p009c.p010a.p011a.C0031i.m146a(r9, r12, r11, r0)
            int r1 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L20
            android.graphics.drawable.Drawable r4 = p000a.p005b.p022d.p024b.p025a.C0122a.m550b(r8, r4)
            goto L21
        L20:
            r4 = 0
        L21:
            int r5 = p000a.p005b.p022d.p023a.C0121j.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L74
        L2f:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L37
            goto L2f
        L37:
            r6 = 2
            if (r4 != r6) goto L5b
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4b
            a.b.b.a.d r4 = p000a.p005b.p007b.p008a.C0014d.m16a(r8, r9, r10, r11, r12)
            goto L74
        L4b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L56
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11, r12)
            goto L74
        L56:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L74
        L5b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L74:
            if (r4 == 0) goto L9c
            if (r1 == r2) goto L81
            if (r3 == r2) goto L81
            a.b.d.c.a.b$b r8 = r7.f419p
            int r8 = r8.m567a(r1, r3, r4, r5)
            return r8
        L81:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L9c:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p022d.p026c.p027a.C0124b.m560e(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000a.p005b.p022d.p026c.p027a.C0128f, p000a.p005b.p022d.p026c.p027a.C0126d
    /* renamed from: a */
    public b mo561a() {
        return new b(this.f419p, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p005b.p022d.p026c.p027a.C0128f, p000a.p005b.p022d.p026c.p027a.C0126d
    /* renamed from: a */
    public void mo562a(C0126d.b bVar) {
        super.mo562a(bVar);
        if (bVar instanceof b) {
            this.f419p = (b) bVar;
        }
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0128f, p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* renamed from: b */
    public void m563b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0121j.AnimatedStateListDrawableCompat);
        setVisible(m146a.getBoolean(C0121j.AnimatedStateListDrawableCompat_android_visible, true), true);
        m555a(m146a);
        m582a(resources);
        m146a.recycle();
        m558c(context, resources, xmlPullParser, attributeSet, theme);
        m557c();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0128f, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f420q;
        if (fVar != null) {
            fVar.mo565d();
            this.f420q = null;
            m584a(this.f421r);
            this.f421r = -1;
            this.f422s = -1;
        }
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0128f, p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f423t) {
            super.mutate();
            if (this == this) {
                this.f419p.mo574m();
                this.f423t = true;
            }
        }
        return this;
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p005b.p022d.p026c.p027a.C0128f, p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m569b = this.f419p.m569b(iArr);
        boolean z = m569b != m585b() && (m556b(m569b) || m584a(m569b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f420q != null && (visible || z2)) {
            if (z) {
                this.f420q.mo564c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // p000a.p005b.p022d.p026c.p027a.C0126d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
