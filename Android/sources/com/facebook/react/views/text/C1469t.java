package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.C0405I;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.react.uimanager.InterfaceC1265A;
import com.facebook.react.views.view.C1514f;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.views.text.t */
/* loaded from: classes.dex */
public class C1469t extends C0405I implements InterfaceC1265A {

    /* renamed from: d */
    private static final ViewGroup.LayoutParams f5406d = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: e */
    private boolean f5407e;

    /* renamed from: f */
    private int f5408f;

    /* renamed from: g */
    private int f5409g;

    /* renamed from: h */
    private int f5410h;

    /* renamed from: i */
    private int f5411i;

    /* renamed from: j */
    private TextUtils.TruncateAt f5412j;

    /* renamed from: k */
    private C1514f f5413k;

    /* renamed from: l */
    private Spannable f5414l;

    public C1469t(Context context) {
        super(context);
        this.f5410h = 0;
        this.f5411i = Integer.MAX_VALUE;
        this.f5412j = TextUtils.TruncateAt.END;
        this.f5413k = new C1514f(this);
        this.f5408f = getGravity() & 8388615;
        this.f5409g = getGravity() & C0121j.AppCompatTheme_windowActionBarOverlay;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1265A
    /* renamed from: a */
    public int mo5472a(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                C1464o[] c1464oArr = (C1464o[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C1464o.class);
                if (c1464oArr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < c1464oArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(c1464oArr[i4]);
                        int spanEnd = spanned.getSpanEnd(c1464oArr[i4]);
                        if (spanEnd > offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = c1464oArr[i4].m6167a();
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                C1700a.m7006b("ReactNative", "Crash in HorizontalMeasurementProvider: " + e2.getMessage());
            }
        }
        return id;
    }

    /* renamed from: a */
    public void m6184a(float f, int i) {
        this.f5413k.m6330a(f, i);
    }

    /* renamed from: a */
    public void m6185a(int i, float f) {
        this.f5413k.m6332a(i, f);
    }

    /* renamed from: a */
    public void m6186a(int i, float f, float f2) {
        this.f5413k.m6333a(i, f, f2);
    }

    /* renamed from: d */
    public void m6187d() {
        setEllipsize(this.f5411i == Integer.MAX_VALUE ? null : this.f5412j);
    }

    public Spannable getSpanned() {
        return this.f5414l;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f5407e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spanned.getSpans(0, spanned.length(), AbstractC1475z.class)) {
                if (abstractC1475z.mo6150a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5407e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spanned.getSpans(0, spanned.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6153c();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5407e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spanned.getSpans(0, spanned.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6154d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f5407e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spanned.getSpans(0, spanned.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6155e();
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f5407e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spanned.getSpans(0, spanned.length(), AbstractC1475z.class)) {
                abstractC1475z.mo6156f();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5413k.m6331a(i);
    }

    public void setBorderRadius(float f) {
        this.f5413k.m6329a(f);
    }

    public void setBorderStyle(String str) {
        this.f5413k.m6334a(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f5412j = truncateAt;
    }

    void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f5408f;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f5409g;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.f5411i = i;
        setSingleLine(this.f5411i == 1);
        setMaxLines(this.f5411i);
    }

    public void setSpanned(Spannable spannable) {
        this.f5414l = spannable;
    }

    public void setText(C1468s c1468s) {
        this.f5407e = c1468s.m6174a();
        if (getLayoutParams() == null) {
            setLayoutParams(f5406d);
        }
        setText(c1468s.m6181h());
        setPadding((int) Math.floor(c1468s.m6178e()), (int) Math.floor(c1468s.m6180g()), (int) Math.floor(c1468s.m6179f()), (int) Math.floor(c1468s.m6177d()));
        int m6182i = c1468s.m6182i();
        if (this.f5410h != m6182i) {
            this.f5410h = m6182i;
        }
        setGravityHorizontal(this.f5410h);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != c1468s.m6183j()) {
            setBreakStrategy(c1468s.m6183j());
        }
        if (Build.VERSION.SDK_INT < 26 || getJustificationMode() == c1468s.m6176c()) {
            return;
        }
        setJustificationMode(c1468s.m6176c());
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f5407e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1475z abstractC1475z : (AbstractC1475z[]) spanned.getSpans(0, spanned.length(), AbstractC1475z.class)) {
                if (abstractC1475z.mo6150a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
