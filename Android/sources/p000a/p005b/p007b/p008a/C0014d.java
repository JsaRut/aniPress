package p000a.p005b.p007b.p008a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.util.C0256b;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p000a.p005b.p009c.p010a.p011a.C0031i;

/* renamed from: a.b.b.a.d */
/* loaded from: classes.dex */
public class C0014d extends AbstractC0019i implements InterfaceC0012b {

    /* renamed from: b */
    private a f35b;

    /* renamed from: c */
    private Context f36c;

    /* renamed from: d */
    private ArgbEvaluator f37d;

    /* renamed from: e */
    private Animator.AnimatorListener f38e;

    /* renamed from: f */
    ArrayList<Object> f39f;

    /* renamed from: g */
    final Drawable.Callback f40g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.b.a.d$a */
    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a */
        int f41a;

        /* renamed from: b */
        C0021k f42b;

        /* renamed from: c */
        AnimatorSet f43c;

        /* renamed from: d */
        ArrayList<Animator> f44d;

        /* renamed from: e */
        C0256b<Animator, String> f45e;

        public a(Context context, a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f41a = aVar.f41a;
                C0021k c0021k = aVar.f42b;
                if (c0021k != null) {
                    Drawable.ConstantState constantState = c0021k.getConstantState();
                    this.f42b = (C0021k) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C0021k c0021k2 = this.f42b;
                    c0021k2.mutate();
                    this.f42b = c0021k2;
                    this.f42b.setCallback(callback);
                    this.f42b.setBounds(aVar.f42b.getBounds());
                    this.f42b.m55a(false);
                }
                ArrayList<Animator> arrayList = aVar.f44d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f44d = new ArrayList<>(size);
                    this.f45e = new C0256b<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f44d.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f45e.get(animator);
                        clone.setTarget(this.f42b.m54a(str));
                        this.f44d.add(clone);
                        this.f45e.put(clone, str);
                    }
                    m19a();
                }
            }
        }

        /* renamed from: a */
        public void m19a() {
            if (this.f43c == null) {
                this.f43c = new AnimatorSet();
            }
            this.f43c.playTogether(this.f44d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f41a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.b.b.a.d$b */
    /* loaded from: classes.dex */
    private static class b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f46a;

        public b(Drawable.ConstantState constantState) {
            this.f46a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f46a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f46a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0014d c0014d = new C0014d();
            c0014d.f51a = this.f46a.newDrawable();
            c0014d.f51a.setCallback(c0014d.f40g);
            return c0014d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0014d c0014d = new C0014d();
            c0014d.f51a = this.f46a.newDrawable(resources);
            c0014d.f51a.setCallback(c0014d.f40g);
            return c0014d;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0014d c0014d = new C0014d();
            c0014d.f51a = this.f46a.newDrawable(resources, theme);
            c0014d.f51a.setCallback(c0014d.f40g);
            return c0014d;
        }
    }

    C0014d() {
        this(null, null, null);
    }

    private C0014d(Context context) {
        this(context, null, null);
    }

    private C0014d(Context context, a aVar, Resources resources) {
        this.f37d = null;
        this.f38e = null;
        this.f39f = null;
        this.f40g = new C0013c(this);
        this.f36c = context;
        if (aVar != null) {
            this.f35b = aVar;
        } else {
            this.f35b = new a(context, aVar, this.f40g, resources);
        }
    }

    /* renamed from: a */
    public static C0014d m16a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0014d c0014d = new C0014d(context);
        c0014d.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0014d;
    }

    /* renamed from: a */
    private void m17a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m17a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f37d == null) {
                    this.f37d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f37d);
            }
        }
    }

    /* renamed from: a */
    private void m18a(String str, Animator animator) {
        animator.setTarget(this.f35b.f42b.m54a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m17a(animator);
        }
        a aVar = this.f35b;
        if (aVar.f44d == null) {
            aVar.f44d = new ArrayList<>();
            this.f35b.f45e = new C0256b<>();
        }
        this.f35b.f44d.add(animator);
        this.f35b.f45e.put(animator, str);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1196a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return C0220a.m1200a(drawable);
        }
        return false;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f35b.f42b.draw(canvas);
        if (this.f35b.f43c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0220a.m1202b(drawable) : this.f35b.f42b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f35b.f41a;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f51a;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(drawable.getConstantState());
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f35b.f42b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f35b.f42b.getIntrinsicWidth();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getOpacity() : this.f35b.f42b.getOpacity();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1197a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0031i.m146a(resources, theme, attributeSet, C0011a.f26e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0021k m48a = C0021k.m48a(resources, resourceId, theme);
                        m48a.m55a(false);
                        m48a.setCallback(this.f40g);
                        C0021k c0021k = this.f35b.f42b;
                        if (c0021k != null) {
                            c0021k.setCallback(null);
                        }
                        this.f35b.f42b = m48a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0011a.f27f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f36c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m18a(string, C0016f.m24a(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f35b.m19a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0220a.m1206e(drawable) : this.f35b.f42b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f51a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f35b.f43c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.isStateful() : this.f35b.f42b.isStateful();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f35b.f42b.setBounds(rect);
        }
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setLevel(i) : this.f35b.f42b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setState(iArr) : this.f35b.f42b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f35b.f42b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1199a(drawable, z);
        } else {
            this.f35b.f42b.setAutoMirrored(z);
        }
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f35b.f42b.setColorFilter(colorFilter);
        }
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTint(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1203b(drawable, i);
        } else {
            this.f35b.f42b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1195a(drawable, colorStateList);
        } else {
            this.f35b.f42b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1198a(drawable, mode);
        } else {
            this.f35b.f42b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f35b.f42b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f35b.f43c.isStarted()) {
                return;
            }
            this.f35b.f43c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f35b.f43c.end();
        }
    }
}
