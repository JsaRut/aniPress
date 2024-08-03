package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.C0274D;
import android.support.v4.widget.InterfaceC0284b;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p005b.p009c.p018g.C0065b;
import p000a.p005b.p009c.p019h.InterfaceC0105t;

/* renamed from: android.support.v7.widget.I */
/* loaded from: classes.dex */
public class C0405I extends TextView implements InterfaceC0105t, InterfaceC0284b {

    /* renamed from: a */
    private final C0454j f2062a;

    /* renamed from: b */
    private final C0403H f2063b;

    /* renamed from: c */
    private Future<C0065b> f2064c;

    public C0405I(Context context) {
        this(context, null);
    }

    public C0405I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0405I(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        this.f2062a = new C0454j(this);
        this.f2062a.m2470a(attributeSet, i);
        this.f2063b = new C0403H(this);
        this.f2063b.m2211a(attributeSet, i);
        this.f2063b.m2206a();
    }

    /* renamed from: d */
    private void m2228d() {
        Future<C0065b> future = this.f2064c;
        if (future != null) {
            try {
                this.f2064c = null;
                C0274D.m1436a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            c0454j.m2465a();
        }
        C0403H c0403h = this.f2063b;
        if (c0403h != null) {
            c0403h.m2206a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0403H c0403h = this.f2063b;
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
        C0403H c0403h = this.f2063b;
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
        C0403H c0403h = this.f2063b;
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
        C0403H c0403h = this.f2063b;
        return c0403h != null ? c0403h.m2220f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0284b.f1253a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0403H c0403h = this.f2063b;
        if (c0403h != null) {
            return c0403h.m2221g();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0274D.m1432a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0274D.m1437b(this);
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public ColorStateList getSupportBackgroundTintList() {
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            return c0454j.m2471b();
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            return c0454j.m2473c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2228d();
        return super.getText();
    }

    public C0065b.a getTextMetricsParamsCompat() {
        return C0274D.m1439c(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0468q.m2548a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0403H c0403h = this.f2063b;
        if (c0403h != null) {
            c0403h.m2214a(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m2228d();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0403H c0403h = this.f2063b;
        if (c0403h == null || InterfaceC0284b.f1253a || !c0403h.m2222h()) {
            return;
        }
        this.f2063b.m2216b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0284b.f1253a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0403H c0403h = this.f2063b;
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
        C0403H c0403h = this.f2063b;
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
        C0403H c0403h = this.f2063b;
        if (c0403h != null) {
            c0403h.m2207a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            c0454j.m2469a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            c0454j.m2466a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0274D.m1433a(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0274D.m1434a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0274D.m1438b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0274D.m1440c(this, i);
    }

    public void setPrecomputedText(C0065b c0065b) {
        C0274D.m1436a(this, c0065b);
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            c0454j.m2472b(colorStateList);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0454j c0454j = this.f2062a;
        if (c0454j != null) {
            c0454j.m2468a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0403H c0403h = this.f2063b;
        if (c0403h != null) {
            c0403h.m2210a(context, i);
        }
    }

    public void setTextFuture(Future<C0065b> future) {
        this.f2064c = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C0065b.a aVar) {
        C0274D.m1435a(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0284b.f1253a) {
            super.setTextSize(i, f);
            return;
        }
        C0403H c0403h = this.f2063b;
        if (c0403h != null) {
            c0403h.m2208a(i, f);
        }
    }
}
