package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f2281a;

    /* renamed from: b */
    private int f2282b;

    /* renamed from: c */
    private WeakReference<View> f2283c;

    /* renamed from: d */
    private LayoutInflater f2284d;

    /* renamed from: e */
    private InterfaceC0431a f2285e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0431a {
        /* renamed from: a */
        void m2417a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2281a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.ViewStubCompat, i, 0);
        this.f2282b = obtainStyledAttributes.getResourceId(C0121j.ViewStubCompat_android_inflatedId, -1);
        this.f2281a = obtainStyledAttributes.getResourceId(C0121j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0121j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m2416a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f2281a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f2284d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f2281a, viewGroup, false);
        int i = this.f2282b;
        if (i != -1) {
            inflate.setId(i);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f2283c = new WeakReference<>(inflate);
        InterfaceC0431a interfaceC0431a = this.f2285e;
        if (interfaceC0431a != null) {
            interfaceC0431a.m2417a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2282b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2284d;
    }

    public int getLayoutResource() {
        return this.f2281a;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2282b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2284d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2281a = i;
    }

    public void setOnInflateListener(InterfaceC0431a interfaceC0431a) {
        this.f2285e = interfaceC0431a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2283c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m2416a();
        }
    }
}
