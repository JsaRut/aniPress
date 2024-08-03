package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.widget.C0274D;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p024b.p025a.C0122a;
import p000a.p005b.p022d.p028d.C0129a;

/* renamed from: android.support.v7.widget.pa */
/* loaded from: classes.dex */
public class C0467pa extends CompoundButton {

    /* renamed from: a */
    private static final Property<C0467pa, Float> f2437a = new C0465oa(Float.class, "thumbPos");

    /* renamed from: b */
    private static final int[] f2438b = {R.attr.state_checked};

    /* renamed from: A */
    private int f2439A;

    /* renamed from: B */
    private int f2440B;

    /* renamed from: C */
    private int f2441C;

    /* renamed from: D */
    private int f2442D;

    /* renamed from: E */
    private int f2443E;

    /* renamed from: F */
    private int f2444F;

    /* renamed from: G */
    private int f2445G;

    /* renamed from: H */
    private final TextPaint f2446H;

    /* renamed from: I */
    private ColorStateList f2447I;

    /* renamed from: J */
    private Layout f2448J;

    /* renamed from: K */
    private Layout f2449K;

    /* renamed from: L */
    private TransformationMethod f2450L;

    /* renamed from: M */
    ObjectAnimator f2451M;

    /* renamed from: N */
    private final Rect f2452N;

    /* renamed from: c */
    private Drawable f2453c;

    /* renamed from: d */
    private ColorStateList f2454d;

    /* renamed from: e */
    private PorterDuff.Mode f2455e;

    /* renamed from: f */
    private boolean f2456f;

    /* renamed from: g */
    private boolean f2457g;

    /* renamed from: h */
    private Drawable f2458h;

    /* renamed from: i */
    private ColorStateList f2459i;

    /* renamed from: j */
    private PorterDuff.Mode f2460j;

    /* renamed from: k */
    private boolean f2461k;

    /* renamed from: l */
    private boolean f2462l;

    /* renamed from: m */
    private int f2463m;

    /* renamed from: n */
    private int f2464n;

    /* renamed from: o */
    private int f2465o;

    /* renamed from: p */
    private boolean f2466p;

    /* renamed from: q */
    private CharSequence f2467q;

    /* renamed from: r */
    private CharSequence f2468r;

    /* renamed from: s */
    private boolean f2469s;

    /* renamed from: t */
    private int f2470t;

    /* renamed from: u */
    private int f2471u;

    /* renamed from: v */
    private float f2472v;

    /* renamed from: w */
    private float f2473w;

    /* renamed from: x */
    private VelocityTracker f2474x;

    /* renamed from: y */
    private int f2475y;

    /* renamed from: z */
    float f2476z;

    public C0467pa(Context context) {
        this(context, null);
    }

    public C0467pa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.switchStyle);
    }

    public C0467pa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2454d = null;
        this.f2455e = null;
        this.f2456f = false;
        this.f2457g = false;
        this.f2459i = null;
        this.f2460j = null;
        this.f2461k = false;
        this.f2462l = false;
        this.f2474x = VelocityTracker.obtain();
        this.f2452N = new Rect();
        this.f2446H = new TextPaint(1);
        Resources resources = getResources();
        this.f2446H.density = resources.getDisplayMetrics().density;
        C0479va m2571a = C0479va.m2571a(context, attributeSet, C0121j.SwitchCompat, i, 0);
        this.f2453c = m2571a.m2579b(C0121j.SwitchCompat_android_thumb);
        Drawable drawable = this.f2453c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f2458h = m2571a.m2579b(C0121j.SwitchCompat_track);
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f2467q = m2571a.m2585e(C0121j.SwitchCompat_android_textOn);
        this.f2468r = m2571a.m2585e(C0121j.SwitchCompat_android_textOff);
        this.f2469s = m2571a.m2577a(C0121j.SwitchCompat_showText, true);
        this.f2463m = m2571a.m2580c(C0121j.SwitchCompat_thumbTextPadding, 0);
        this.f2464n = m2571a.m2580c(C0121j.SwitchCompat_switchMinWidth, 0);
        this.f2465o = m2571a.m2580c(C0121j.SwitchCompat_switchPadding, 0);
        this.f2466p = m2571a.m2577a(C0121j.SwitchCompat_splitTrack, false);
        ColorStateList m2574a = m2571a.m2574a(C0121j.SwitchCompat_thumbTint);
        if (m2574a != null) {
            this.f2454d = m2574a;
            this.f2456f = true;
        }
        PorterDuff.Mode m2262a = C0412M.m2262a(m2571a.m2582d(C0121j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f2455e != m2262a) {
            this.f2455e = m2262a;
            this.f2457g = true;
        }
        if (this.f2456f || this.f2457g) {
            m2538a();
        }
        ColorStateList m2574a2 = m2571a.m2574a(C0121j.SwitchCompat_trackTint);
        if (m2574a2 != null) {
            this.f2459i = m2574a2;
            this.f2461k = true;
        }
        PorterDuff.Mode m2262a2 = C0412M.m2262a(m2571a.m2582d(C0121j.SwitchCompat_trackTintMode, -1), null);
        if (this.f2460j != m2262a2) {
            this.f2460j = m2262a2;
            this.f2462l = true;
        }
        if (this.f2461k || this.f2462l) {
            m2543b();
        }
        int m2588g = m2571a.m2588g(C0121j.SwitchCompat_switchTextAppearance, 0);
        if (m2588g != 0) {
            m2546a(context, m2588g);
        }
        m2571a.m2576a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2471u = viewConfiguration.getScaledTouchSlop();
        this.f2475y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m2536a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m2537a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f2450L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f2446H, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private void m2538a() {
        if (this.f2453c != null) {
            if (this.f2456f || this.f2457g) {
                this.f2453c = this.f2453c.mutate();
                if (this.f2456f) {
                    C0220a.m1195a(this.f2453c, this.f2454d);
                }
                if (this.f2457g) {
                    C0220a.m1198a(this.f2453c, this.f2455e);
                }
                if (this.f2453c.isStateful()) {
                    this.f2453c.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    private void m2539a(int i, int i2) {
        m2547a(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: a */
    private void m2540a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m2541a(boolean z) {
        this.f2451M = ObjectAnimator.ofFloat(this, f2437a, z ? 1.0f : 0.0f);
        this.f2451M.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f2451M.setAutoCancel(true);
        }
        this.f2451M.start();
    }

    /* renamed from: a */
    private boolean m2542a(float f, float f2) {
        if (this.f2453c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2453c.getPadding(this.f2452N);
        int i = this.f2443E;
        int i2 = this.f2471u;
        int i3 = i - i2;
        int i4 = (this.f2442D + thumbOffset) - i2;
        int i5 = this.f2441C + i4;
        Rect rect = this.f2452N;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f2445G + i2));
    }

    /* renamed from: b */
    private void m2543b() {
        if (this.f2458h != null) {
            if (this.f2461k || this.f2462l) {
                this.f2458h = this.f2458h.mutate();
                if (this.f2461k) {
                    C0220a.m1195a(this.f2458h, this.f2459i);
                }
                if (this.f2462l) {
                    C0220a.m1198a(this.f2458h, this.f2460j);
                }
                if (this.f2458h.isStateful()) {
                    this.f2458h.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    private void m2544b(MotionEvent motionEvent) {
        boolean z;
        this.f2470t = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f2474x.computeCurrentVelocity(1000);
            float xVelocity = this.f2474x.getXVelocity();
            if (Math.abs(xVelocity) > this.f2475y) {
                if (!C0408Ja.m2259a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m2540a(motionEvent);
    }

    /* renamed from: c */
    private void m2545c() {
        ObjectAnimator objectAnimator = this.f2451M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f2476z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0408Ja.m2259a(this) ? 1.0f - this.f2476z : this.f2476z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2458h;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f2452N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2453c;
        Rect m2265c = drawable2 != null ? C0412M.m2265c(drawable2) : C0412M.f2080a;
        return ((((this.f2439A - this.f2441C) - rect.left) - rect.right) - m2265c.left) - m2265c.right;
    }

    /* renamed from: a */
    public void m2546a(Context context, int i) {
        C0479va m2569a = C0479va.m2569a(context, i, C0121j.TextAppearance);
        ColorStateList m2574a = m2569a.m2574a(C0121j.TextAppearance_android_textColor);
        if (m2574a == null) {
            m2574a = getTextColors();
        }
        this.f2447I = m2574a;
        int m2580c = m2569a.m2580c(C0121j.TextAppearance_android_textSize, 0);
        if (m2580c != 0) {
            float f = m2580c;
            if (f != this.f2446H.getTextSize()) {
                this.f2446H.setTextSize(f);
                requestLayout();
            }
        }
        m2539a(m2569a.m2582d(C0121j.TextAppearance_android_typeface, -1), m2569a.m2582d(C0121j.TextAppearance_android_textStyle, -1));
        this.f2450L = m2569a.m2577a(C0121j.TextAppearance_textAllCaps, false) ? new C0129a(getContext()) : null;
        m2569a.m2576a();
    }

    /* renamed from: a */
    public void m2547a(Typeface typeface, int i) {
        if (i <= 0) {
            this.f2446H.setFakeBoldText(false);
            this.f2446H.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i;
            this.f2446H.setFakeBoldText((style & 1) != 0);
            this.f2446H.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f2452N;
        int i3 = this.f2442D;
        int i4 = this.f2443E;
        int i5 = this.f2444F;
        int i6 = this.f2445G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f2453c;
        Rect m2265c = drawable != null ? C0412M.m2265c(drawable) : C0412M.f2080a;
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (m2265c != null) {
                int i8 = m2265c.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = m2265c.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = m2265c.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = m2265c.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f2458h.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f2458h.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f2453c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f2441C + rect.right;
            this.f2453c.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0220a.m1194a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f2453c;
        if (drawable != null) {
            C0220a.m1193a(drawable, f, f2);
        }
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null) {
            C0220a.m1193a(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2453c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0408Ja.m2259a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2439A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2465o : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0408Ja.m2259a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2439A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2465o : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2469s;
    }

    public boolean getSplitTrack() {
        return this.f2466p;
    }

    public int getSwitchMinWidth() {
        return this.f2464n;
    }

    public int getSwitchPadding() {
        return this.f2465o;
    }

    public CharSequence getTextOff() {
        return this.f2468r;
    }

    public CharSequence getTextOn() {
        return this.f2467q;
    }

    public Drawable getThumbDrawable() {
        return this.f2453c;
    }

    public int getThumbTextPadding() {
        return this.f2463m;
    }

    public ColorStateList getThumbTintList() {
        return this.f2454d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2455e;
    }

    public Drawable getTrackDrawable() {
        return this.f2458h;
    }

    public ColorStateList getTrackTintList() {
        return this.f2459i;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2460j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2453c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2451M;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f2451M.end();
        this.f2451M = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f2438b);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f2452N;
        Drawable drawable = this.f2458h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f2443E;
        int i2 = this.f2445G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f2453c;
        if (drawable != null) {
            if (!this.f2466p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m2265c = C0412M.m2265c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m2265c.left;
                rect.right -= m2265c.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f2448J : this.f2449K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2447I;
            if (colorStateList != null) {
                this.f2446H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f2446H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f2467q : this.f2468r;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f2453c != null) {
            Rect rect = this.f2452N;
            Drawable drawable = this.f2458h;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m2265c = C0412M.m2265c(this.f2453c);
            i5 = Math.max(0, m2265c.left - rect.left);
            i10 = Math.max(0, m2265c.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0408Ja.m2259a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f2439A + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.f2439A) + i5 + i10;
        }
        int gravity = getGravity() & C0121j.AppCompatTheme_windowActionBarOverlay;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.f2440B;
            i8 = paddingTop - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.f2440B;
                this.f2442D = i6;
                this.f2443E = i8;
                this.f2445G = i9;
                this.f2444F = width;
            }
            i8 = getPaddingTop();
            i7 = this.f2440B;
        }
        i9 = i7 + i8;
        this.f2442D = i6;
        this.f2443E = i8;
        this.f2445G = i9;
        this.f2444F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f2469s) {
            if (this.f2448J == null) {
                this.f2448J = m2537a(this.f2467q);
            }
            if (this.f2449K == null) {
                this.f2449K = m2537a(this.f2468r);
            }
        }
        Rect rect = this.f2452N;
        Drawable drawable = this.f2453c;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f2453c.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f2453c.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f2441C = Math.max(this.f2469s ? Math.max(this.f2448J.getWidth(), this.f2449K.getWidth()) + (this.f2463m * 2) : 0, i3);
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f2458h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f2453c;
        if (drawable3 != null) {
            Rect m2265c = C0412M.m2265c(drawable3);
            i6 = Math.max(i6, m2265c.left);
            i7 = Math.max(i7, m2265c.right);
        }
        int max = Math.max(this.f2464n, (this.f2441C * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.f2439A = max;
        this.f2440B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2467q : this.f2468r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:            if (r0 != 3) goto L45;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f2474x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto La1
            r2 = 2
            if (r0 == r1) goto L8d
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8d
            goto Lbb
        L16:
            int r0 = r6.f2470t
            if (r0 == 0) goto Lbb
            if (r0 == r1) goto L59
            if (r0 == r2) goto L20
            goto Lbb
        L20:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f2472v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L34
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3f
        L34:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3f
        L3b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3f:
            boolean r0 = android.support.v7.widget.C0408Ja.m2259a(r6)
            if (r0 == 0) goto L46
            float r2 = -r2
        L46:
            float r0 = r6.f2476z
            float r0 = r0 + r2
            float r0 = m2536a(r0, r4, r3)
            float r2 = r6.f2476z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L58
            r6.f2472v = r7
            r6.setThumbPosition(r0)
        L58:
            return r1
        L59:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f2472v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2471u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7f
            float r4 = r6.f2473w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2471u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lbb
        L7f:
            r6.f2470t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f2472v = r0
            r6.f2473w = r3
            return r1
        L8d:
            int r0 = r6.f2470t
            if (r0 != r2) goto L98
            r6.m2544b(r7)
            super.onTouchEvent(r7)
            return r1
        L98:
            r0 = 0
            r6.f2470t = r0
            android.view.VelocityTracker r0 = r6.f2474x
            r0.clear()
            goto Lbb
        La1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lbb
            boolean r3 = r6.m2542a(r0, r2)
            if (r3 == 0) goto Lbb
            r6.f2470t = r1
            r6.f2472v = r0
            r6.f2473w = r2
        Lbb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0467pa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && C0107v.m530r(this)) {
            m2541a(isChecked);
        } else {
            m2545c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0274D.m1433a(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f2469s != z) {
            this.f2469s = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f2466p = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f2464n = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f2465o = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f2446H.getTypeface() == null || this.f2446H.getTypeface().equals(typeface)) && (this.f2446H.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f2446H.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2468r = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2467q = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2453c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2453c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f2476z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0122a.m550b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f2463m = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2454d = colorStateList;
        this.f2456f = true;
        m2538a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2455e = mode;
        this.f2457g = true;
        m2538a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2458h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2458h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0122a.m550b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2459i = colorStateList;
        this.f2461k = true;
        m2543b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2460j = mode;
        this.f2462l = true;
        m2543b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2453c || drawable == this.f2458h;
    }
}
