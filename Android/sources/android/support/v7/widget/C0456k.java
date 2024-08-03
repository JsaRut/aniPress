package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.C0274D;
import android.support.v4.widget.InterfaceC0284b;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p000a.p005b.p009c.p019h.InterfaceC0105t;
import p000a.p005b.p022d.p023a.C0112a;

/* renamed from: android.support.v7.widget.k */
/* loaded from: classes.dex */
public class C0456k extends Button implements InterfaceC0105t, InterfaceC0284b {

    /* renamed from: a */
    private final C0454j f2387a;

    /* renamed from: b */
    private final C0403H f2388b;

    public C0456k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.buttonStyle);
    }

    public C0456k(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        this.f2387a = new C0454j(this);
        this.f2387a.m2470a(attributeSet, i);
        this.f2388b = new C0403H(this);
        this.f2388b.m2211a(attributeSet, i);
        this.f2388b.m2206a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            c0454j.m2465a();
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2206a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            return c0403h.m2217c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeMinTextSize();
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            return c0403h.m2218d();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeStepGranularity();
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            return c0403h.m2219e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0403H c0403h = this.f2388b;
        return c0403h != null ? c0403h.m2220f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            return c0403h.m2221g();
        }
        return 0;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public ColorStateList getSupportBackgroundTintList() {
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            return c0454j.m2471b();
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            return c0454j.m2473c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2214a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0403H c0403h = this.f2388b;
        if (c0403h == null || InterfaceC0284b.f1253a || !c0403h.m2222h()) {
            return;
        }
        this.f2388b.m2216b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0284b.f1253a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2209a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0284b.f1253a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2215a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0284b.f1253a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2207a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            c0454j.m2469a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            c0454j.m2466a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0274D.m1433a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2213a(z);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            c0454j.m2472b(colorStateList);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0454j c0454j = this.f2387a;
        if (c0454j != null) {
            c0454j.m2468a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2210a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0284b.f1253a) {
            super.setTextSize(i, f);
            return;
        }
        C0403H c0403h = this.f2388b;
        if (c0403h != null) {
            c0403h.m2208a(i, f);
        }
    }
}
