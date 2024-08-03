package com.google.android.exoplayer2.p135ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.p135ui.InterfaceC1575n;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements InterfaceC1575n {

    /* renamed from: A */
    private long f5837A;

    /* renamed from: B */
    private int f5838B;

    /* renamed from: C */
    private boolean f5839C;

    /* renamed from: D */
    private long f5840D;

    /* renamed from: E */
    private long f5841E;

    /* renamed from: F */
    private long f5842F;

    /* renamed from: G */
    private long f5843G;

    /* renamed from: H */
    private int f5844H;

    /* renamed from: I */
    private long[] f5845I;

    /* renamed from: J */
    private boolean[] f5846J;

    /* renamed from: a */
    private final Rect f5847a;

    /* renamed from: b */
    private final Rect f5848b;

    /* renamed from: c */
    private final Rect f5849c;

    /* renamed from: d */
    private final Rect f5850d;

    /* renamed from: e */
    private final Paint f5851e;

    /* renamed from: f */
    private final Paint f5852f;

    /* renamed from: g */
    private final Paint f5853g;

    /* renamed from: h */
    private final Paint f5854h;

    /* renamed from: i */
    private final Paint f5855i;

    /* renamed from: j */
    private final Paint f5856j;

    /* renamed from: k */
    private final Drawable f5857k;

    /* renamed from: l */
    private final int f5858l;

    /* renamed from: m */
    private final int f5859m;

    /* renamed from: n */
    private final int f5860n;

    /* renamed from: o */
    private final int f5861o;

    /* renamed from: p */
    private final int f5862p;

    /* renamed from: q */
    private final int f5863q;

    /* renamed from: r */
    private final int f5864r;

    /* renamed from: s */
    private final int f5865s;

    /* renamed from: t */
    private final StringBuilder f5866t;

    /* renamed from: u */
    private final Formatter f5867u;

    /* renamed from: v */
    private final Runnable f5868v;

    /* renamed from: w */
    private final CopyOnWriteArraySet<InterfaceC1575n.a> f5869w;

    /* renamed from: x */
    private final int[] f5870x;

    /* renamed from: y */
    private final Point f5871y;

    /* renamed from: z */
    private int f5872z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5847a = new Rect();
        this.f5848b = new Rect();
        this.f5849c = new Rect();
        this.f5850d = new Rect();
        this.f5851e = new Paint();
        this.f5852f = new Paint();
        this.f5853g = new Paint();
        this.f5854h = new Paint();
        this.f5855i = new Paint();
        this.f5856j = new Paint();
        this.f5856j.setAntiAlias(true);
        this.f5869w = new CopyOnWriteArraySet<>();
        this.f5870x = new int[2];
        this.f5871y = new Point();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5865s = m6551a(displayMetrics, -50);
        int m6551a = m6551a(displayMetrics, 4);
        int m6551a2 = m6551a(displayMetrics, 26);
        int m6551a3 = m6551a(displayMetrics, 4);
        int m6551a4 = m6551a(displayMetrics, 12);
        int m6551a5 = m6551a(displayMetrics, 0);
        int m6551a6 = m6551a(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1573l.DefaultTimeBar, 0, 0);
            try {
                this.f5857k = obtainStyledAttributes.getDrawable(C1573l.DefaultTimeBar_scrubber_drawable);
                if (this.f5857k != null) {
                    m6558a(this.f5857k);
                    m6551a2 = Math.max(this.f5857k.getMinimumHeight(), m6551a2);
                }
                this.f5858l = obtainStyledAttributes.getDimensionPixelSize(C1573l.DefaultTimeBar_bar_height, m6551a);
                this.f5859m = obtainStyledAttributes.getDimensionPixelSize(C1573l.DefaultTimeBar_touch_target_height, m6551a2);
                this.f5860n = obtainStyledAttributes.getDimensionPixelSize(C1573l.DefaultTimeBar_ad_marker_width, m6551a3);
                this.f5861o = obtainStyledAttributes.getDimensionPixelSize(C1573l.DefaultTimeBar_scrubber_enabled_size, m6551a4);
                this.f5862p = obtainStyledAttributes.getDimensionPixelSize(C1573l.DefaultTimeBar_scrubber_disabled_size, m6551a5);
                this.f5863q = obtainStyledAttributes.getDimensionPixelSize(C1573l.DefaultTimeBar_scrubber_dragged_size, m6551a6);
                int i = obtainStyledAttributes.getInt(C1573l.DefaultTimeBar_played_color, -1);
                int i2 = obtainStyledAttributes.getInt(C1573l.DefaultTimeBar_scrubber_color, m6563c(i));
                int i3 = obtainStyledAttributes.getInt(C1573l.DefaultTimeBar_buffered_color, m6550a(i));
                int i4 = obtainStyledAttributes.getInt(C1573l.DefaultTimeBar_unplayed_color, m6565d(i));
                int i5 = obtainStyledAttributes.getInt(C1573l.DefaultTimeBar_ad_marker_color, -1291845888);
                int i6 = obtainStyledAttributes.getInt(C1573l.DefaultTimeBar_played_ad_marker_color, m6560b(i5));
                this.f5851e.setColor(i);
                this.f5856j.setColor(i2);
                this.f5852f.setColor(i3);
                this.f5853g.setColor(i4);
                this.f5854h.setColor(i5);
                this.f5855i.setColor(i6);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f5858l = m6551a;
            this.f5859m = m6551a2;
            this.f5860n = m6551a3;
            this.f5861o = m6551a4;
            this.f5862p = m6551a5;
            this.f5863q = m6551a6;
            this.f5851e.setColor(-1);
            this.f5856j.setColor(m6563c(-1));
            this.f5852f.setColor(m6550a(-1));
            this.f5853g.setColor(m6565d(-1));
            this.f5854h.setColor(-1291845888);
            this.f5857k = null;
        }
        this.f5866t = new StringBuilder();
        this.f5867u = new Formatter(this.f5866t, Locale.getDefault());
        this.f5868v = new Runnable() { // from class: com.google.android.exoplayer2.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.m6568a();
            }
        };
        Drawable drawable = this.f5857k;
        this.f5864r = ((drawable != null ? drawable.getMinimumWidth() : Math.max(this.f5862p, Math.max(this.f5861o, this.f5863q))) + 1) / 2;
        this.f5841E = -9223372036854775807L;
        this.f5837A = -9223372036854775807L;
        this.f5872z = 20;
        setFocusable(true);
        if (C2622I.f10916a >= 16) {
            m6561b();
        }
    }

    /* renamed from: a */
    public static int m6550a(int i) {
        return (i & 16777215) | (-872415232);
    }

    /* renamed from: a */
    private static int m6551a(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5f);
    }

    /* renamed from: a */
    private Point m6552a(MotionEvent motionEvent) {
        getLocationOnScreen(this.f5870x);
        this.f5871y.set(((int) motionEvent.getRawX()) - this.f5870x[0], ((int) motionEvent.getRawY()) - this.f5870x[1]);
        return this.f5871y;
    }

    /* renamed from: a */
    private void m6553a(float f) {
        Rect rect = this.f5850d;
        Rect rect2 = this.f5848b;
        rect.right = C2622I.m11038a((int) f, rect2.left, rect2.right);
    }

    /* renamed from: a */
    private void m6554a(Canvas canvas) {
        if (this.f5841E <= 0) {
            return;
        }
        Rect rect = this.f5850d;
        int m11038a = C2622I.m11038a(rect.right, rect.left, this.f5848b.right);
        int centerY = this.f5850d.centerY();
        Drawable drawable = this.f5857k;
        if (drawable == null) {
            canvas.drawCircle(m11038a, centerY, ((this.f5839C || isFocused()) ? this.f5863q : isEnabled() ? this.f5861o : this.f5862p) / 2, this.f5856j);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.f5857k.getIntrinsicHeight() / 2;
        this.f5857k.setBounds(m11038a - intrinsicWidth, centerY - intrinsicHeight, m11038a + intrinsicWidth, centerY + intrinsicHeight);
        this.f5857k.draw(canvas);
    }

    /* renamed from: a */
    private void m6555a(boolean z) {
        this.f5839C = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC1575n.a> it = this.f5869w.iterator();
        while (it.hasNext()) {
            it.next().mo6649a(this, getScrubberPosition(), z);
        }
    }

    /* renamed from: a */
    private boolean m6556a(float f, float f2) {
        return this.f5847a.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private boolean m6557a(long j) {
        if (this.f5841E <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        this.f5840D = C2622I.m11081b(scrubberPosition + j, 0L, this.f5841E);
        if (this.f5840D == scrubberPosition) {
            return false;
        }
        if (!this.f5839C) {
            m6564c();
        }
        Iterator<InterfaceC1575n.a> it = this.f5869w.iterator();
        while (it.hasNext()) {
            it.next().mo6648a(this, this.f5840D);
        }
        m6566d();
        return true;
    }

    /* renamed from: a */
    private boolean m6558a(Drawable drawable) {
        return C2622I.f10916a >= 23 && m6559a(drawable, getLayoutDirection());
    }

    /* renamed from: a */
    private static boolean m6559a(Drawable drawable, int i) {
        return C2622I.f10916a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: b */
    public static int m6560b(int i) {
        return (i & 16777215) | 855638016;
    }

    @TargetApi(16)
    /* renamed from: b */
    private void m6561b() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: b */
    private void m6562b(Canvas canvas) {
        int height = this.f5848b.height();
        int centerY = this.f5848b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f5841E <= 0) {
            Rect rect = this.f5848b;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.f5853g);
            return;
        }
        Rect rect2 = this.f5849c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f5848b.left, i3), this.f5850d.right);
        int i4 = this.f5848b.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.f5853g);
        }
        int max2 = Math.max(i2, this.f5850d.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f5852f);
        }
        if (this.f5850d.width() > 0) {
            Rect rect3 = this.f5850d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f5851e);
        }
        if (this.f5844H == 0) {
            return;
        }
        long[] jArr = this.f5845I;
        C2628e.m11110a(jArr);
        long[] jArr2 = jArr;
        boolean[] zArr = this.f5846J;
        C2628e.m11110a(zArr);
        boolean[] zArr2 = zArr;
        int i5 = this.f5860n / 2;
        for (int i6 = 0; i6 < this.f5844H; i6++) {
            int width = ((int) ((this.f5848b.width() * C2622I.m11081b(jArr2[i6], 0L, this.f5841E)) / this.f5841E)) - i5;
            Rect rect4 = this.f5848b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f5860n, Math.max(0, width)), centerY, r10 + this.f5860n, i, zArr2[i6] ? this.f5855i : this.f5854h);
        }
    }

    /* renamed from: c */
    public static int m6563c(int i) {
        return i | (-16777216);
    }

    /* renamed from: c */
    private void m6564c() {
        this.f5839C = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC1575n.a> it = this.f5869w.iterator();
        while (it.hasNext()) {
            it.next().mo6650b(this, getScrubberPosition());
        }
    }

    /* renamed from: d */
    public static int m6565d(int i) {
        return (i & 16777215) | 855638016;
    }

    /* renamed from: d */
    private void m6566d() {
        this.f5849c.set(this.f5848b);
        this.f5850d.set(this.f5848b);
        long j = this.f5839C ? this.f5840D : this.f5842F;
        if (this.f5841E > 0) {
            int width = (int) ((this.f5848b.width() * this.f5843G) / this.f5841E);
            Rect rect = this.f5849c;
            Rect rect2 = this.f5848b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f5848b.width() * j) / this.f5841E);
            Rect rect3 = this.f5850d;
            Rect rect4 = this.f5848b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f5849c;
            int i = this.f5848b.left;
            rect5.right = i;
            this.f5850d.right = i;
        }
        invalidate(this.f5847a);
    }

    /* renamed from: e */
    private void m6567e() {
        Drawable drawable = this.f5857k;
        if (drawable != null && drawable.isStateful() && this.f5857k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private long getPositionIncrement() {
        long j = this.f5837A;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f5841E;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.f5872z;
    }

    private String getProgressText() {
        return C2622I.m11055a(this.f5866t, this.f5867u, this.f5842F);
    }

    private long getScrubberPosition() {
        if (this.f5848b.width() <= 0 || this.f5841E == -9223372036854775807L) {
            return 0L;
        }
        return (this.f5850d.width() * this.f5841E) / this.f5848b.width();
    }

    /* renamed from: a */
    public /* synthetic */ void m6568a() {
        m6555a(false);
    }

    @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n
    /* renamed from: a */
    public void mo6569a(InterfaceC1575n.a aVar) {
        this.f5869w.add(aVar);
    }

    @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n
    /* renamed from: a */
    public void mo6570a(long[] jArr, boolean[] zArr, int i) {
        C2628e.m11111a(i == 0 || !(jArr == null || zArr == null));
        this.f5844H = i;
        this.f5845I = jArr;
        this.f5846J = zArr;
        m6566d();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m6567e();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5857k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m6562b(canvas);
        m6554a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f5841E <= 0) {
            return;
        }
        int i = C2622I.f10916a;
        if (i >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (i >= 16) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L36
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L36
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m6557a(r0)
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.f5868v
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f5868v
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f5839C
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.f5868v
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f5868v
            r5.run()
            return r3
        L36:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.f5859m) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.f5859m;
        int i7 = ((i6 - this.f5858l) / 2) + i5;
        this.f5847a.set(paddingLeft, i5, paddingRight, i6 + i5);
        Rect rect = this.f5848b;
        Rect rect2 = this.f5847a;
        int i8 = rect2.left;
        int i9 = this.f5864r;
        rect.set(i8 + i9, i7, rect2.right - i9, this.f5858l + i7);
        m6566d();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f5859m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f5859m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m6567e();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f5857k;
        if (drawable == null || !m6559a(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:            if (r3 != 3) goto L37;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L87
            long r2 = r7.f5841E
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L87
        L11:
            android.graphics.Point r0 = r7.m6552a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L72
            r5 = 3
            if (r3 == r4) goto L63
            r6 = 2
            if (r3 == r6) goto L29
            if (r3 == r5) goto L63
            goto L87
        L29:
            boolean r8 = r7.f5839C
            if (r8 == 0) goto L87
            int r8 = r7.f5865s
            if (r0 >= r8) goto L38
            int r8 = r7.f5838B
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L3b
        L38:
            r7.f5838B = r2
            float r8 = (float) r2
        L3b:
            r7.m6553a(r8)
            long r0 = r7.getScrubberPosition()
            r7.f5840D = r0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.n$a> r8 = r7.f5869w
            java.util.Iterator r8 = r8.iterator()
        L4a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r8.next()
            com.google.android.exoplayer2.ui.n$a r0 = (com.google.android.exoplayer2.p135ui.InterfaceC1575n.a) r0
            long r1 = r7.f5840D
            r0.mo6648a(r7, r1)
            goto L4a
        L5c:
            r7.m6566d()
            r7.invalidate()
            return r4
        L63:
            boolean r0 = r7.f5839C
            if (r0 == 0) goto L87
            int r8 = r8.getAction()
            if (r8 != r5) goto L6e
            r1 = 1
        L6e:
            r7.m6555a(r1)
            return r4
        L72:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m6556a(r8, r0)
            if (r0 == 0) goto L87
            r7.m6553a(r8)
            r7.m6564c()
            long r0 = r7.getScrubberPosition()
            r7.f5840D = r0
            goto L5c
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:            if (m6557a(-getPositionIncrement()) != false) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:            m6555a(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:            sendAccessibilityEvent(4);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:            if (m6557a(getPositionIncrement()) != false) goto L12;     */
    @Override // android.view.View
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L8
            return r0
        L8:
            long r1 = r6.f5841E
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            return r8
        L12:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r7 != r1) goto L25
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.m6557a(r1)
            if (r7 == 0) goto L34
        L21:
            r6.m6555a(r8)
            goto L34
        L25:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L39
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.m6557a(r1)
            if (r7 == 0) goto L34
            goto L21
        L34:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L39:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(int i) {
        this.f5854h.setColor(i);
        invalidate(this.f5847a);
    }

    public void setBufferedColor(int i) {
        this.f5852f.setColor(i);
        invalidate(this.f5847a);
    }

    @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n
    public void setBufferedPosition(long j) {
        this.f5843G = j;
        m6566d();
    }

    @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n
    public void setDuration(long j) {
        this.f5841E = j;
        if (this.f5839C && j == -9223372036854775807L) {
            m6555a(true);
        }
        m6566d();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p135ui.InterfaceC1575n
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f5839C || z) {
            return;
        }
        m6555a(true);
    }

    public void setKeyCountIncrement(int i) {
        C2628e.m11111a(i > 0);
        this.f5872z = i;
        this.f5837A = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        C2628e.m11111a(j > 0);
        this.f5872z = -1;
        this.f5837A = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f5855i.setColor(i);
        invalidate(this.f5847a);
    }

    public void setPlayedColor(int i) {
        this.f5851e.setColor(i);
        invalidate(this.f5847a);
    }

    @Override // com.google.android.exoplayer2.p135ui.InterfaceC1575n
    public void setPosition(long j) {
        this.f5842F = j;
        setContentDescription(getProgressText());
        m6566d();
    }

    public void setScrubberColor(int i) {
        this.f5856j.setColor(i);
        invalidate(this.f5847a);
    }

    public void setUnplayedColor(int i) {
        this.f5853g.setColor(i);
        invalidate(this.f5847a);
    }
}
