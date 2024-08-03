package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.InterfaceC0377w;
import android.support.v7.widget.AbstractViewOnTouchListenerC0415P;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.C0396Da;
import android.support.v7.widget.C0405I;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0405I implements InterfaceC0377w.a, View.OnClickListener, ActionMenuView.InterfaceC0385a {

    /* renamed from: d */
    C0370p f1665d;

    /* renamed from: e */
    private CharSequence f1666e;

    /* renamed from: f */
    private Drawable f1667f;

    /* renamed from: g */
    C0366l.b f1668g;

    /* renamed from: h */
    private AbstractViewOnTouchListenerC0415P f1669h;

    /* renamed from: i */
    AbstractC0350b f1670i;

    /* renamed from: j */
    private boolean f1671j;

    /* renamed from: k */
    private boolean f1672k;

    /* renamed from: l */
    private int f1673l;

    /* renamed from: m */
    private int f1674m;

    /* renamed from: n */
    private int f1675n;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0349a extends AbstractViewOnTouchListenerC0415P {
        public C0349a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
        /* renamed from: a */
        public InterfaceC0380z mo1925a() {
            AbstractC0350b abstractC0350b = ActionMenuItemView.this.f1670i;
            if (abstractC0350b != null) {
                return abstractC0350b.mo1927a();
            }
            return null;
        }

        @Override // android.support.v7.widget.AbstractViewOnTouchListenerC0415P
        /* renamed from: b */
        protected boolean mo1926b() {
            InterfaceC0380z mo1925a;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0366l.b bVar = actionMenuItemView.f1668g;
            return bVar != null && bVar.mo1957a(actionMenuItemView.f1665d) && (mo1925a = mo1925a()) != null && mo1925a.mo1940b();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0350b {
        /* renamed from: a */
        public abstract InterfaceC0380z mo1927a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1671j = m1918e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.ActionMenuItemView, i, 0);
        this.f1673l = obtainStyledAttributes.getDimensionPixelSize(C0121j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1675n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1674m = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m1918e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m1919f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1666e);
        if (this.f1667f != null && (!this.f1665d.m2070n() || (!this.f1671j && !this.f1672k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1666e : null);
        CharSequence contentDescription = this.f1665d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1665d.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1665d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0396Da.m2193a(this, z3 ? null : this.f1665d.getTitle());
        } else {
            C0396Da.m2193a(this, tooltipText);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w.a
    /* renamed from: a */
    public void mo1920a(C0370p c0370p, int i) {
        this.f1665d = c0370p;
        setIcon(c0370p.getIcon());
        setTitle(c0370p.m2050a(this));
        setId(c0370p.getItemId());
        setVisibility(c0370p.isVisible() ? 0 : 8);
        setEnabled(c0370p.isEnabled());
        if (c0370p.hasSubMenu() && this.f1669h == null) {
            this.f1669h = new C0349a();
        }
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0385a
    /* renamed from: a */
    public boolean mo1921a() {
        return m1924d();
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0385a
    /* renamed from: b */
    public boolean mo1922b() {
        return m1924d() && this.f1665d.getIcon() == null;
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w.a
    /* renamed from: c */
    public boolean mo1923c() {
        return true;
    }

    /* renamed from: d */
    public boolean m1924d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w.a
    public C0370p getItemData() {
        return this.f1665d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0366l.b bVar = this.f1668g;
        if (bVar != null) {
            bVar.mo1957a(this.f1665d);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1671j = m1918e();
        m1919f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.C0405I, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m1924d = m1924d();
        if (m1924d && (i3 = this.f1674m) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1673l) : this.f1673l;
        if (mode != 1073741824 && this.f1673l > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m1924d || this.f1667f == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1667f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0415P abstractViewOnTouchListenerC0415P;
        if (this.f1665d.hasSubMenu() && (abstractViewOnTouchListenerC0415P = this.f1669h) != null && abstractViewOnTouchListenerC0415P.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1672k != z) {
            this.f1672k = z;
            C0370p c0370p = this.f1665d;
            if (c0370p != null) {
                c0370p.m2054b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1667f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1675n;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.f1675n;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1919f();
    }

    public void setItemInvoker(C0366l.b bVar) {
        this.f1668g = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1674m = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0350b abstractC0350b) {
        this.f1670i = abstractC0350b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1666e = charSequence;
        m1919f();
    }
}
