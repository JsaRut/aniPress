package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000a.p005b.p009c.p019h.C0107v;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f2014a;

    /* renamed from: b */
    private TypedValue f2015b;

    /* renamed from: c */
    private TypedValue f2016c;

    /* renamed from: d */
    private TypedValue f2017d;

    /* renamed from: e */
    private TypedValue f2018e;

    /* renamed from: f */
    private TypedValue f2019f;

    /* renamed from: g */
    private final Rect f2020g;

    /* renamed from: h */
    private InterfaceC0394a f2021h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0394a {
        /* renamed from: a */
        void mo1856a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2020g = new Rect();
    }

    /* renamed from: a */
    public void m2191a(int i, int i2, int i3, int i4) {
        this.f2020g.set(i, i2, i3, i4);
        if (C0107v.m530r(this)) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m2192a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2018e == null) {
            this.f2018e = new TypedValue();
        }
        return this.f2018e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2019f == null) {
            this.f2019f = new TypedValue();
        }
        return this.f2019f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2016c == null) {
            this.f2016c = new TypedValue();
        }
        return this.f2016c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2017d == null) {
            this.f2017d = new TypedValue();
        }
        return this.f2017d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2014a == null) {
            this.f2014a = new TypedValue();
        }
        return this.f2014a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2015b == null) {
            this.f2015b = new TypedValue();
        }
        return this.f2015b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0394a interfaceC0394a = this.f2021h;
        if (interfaceC0394a != null) {
            interfaceC0394a.mo1856a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0394a interfaceC0394a = this.f2021h;
        if (interfaceC0394a != null) {
            interfaceC0394a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0394a interfaceC0394a) {
        this.f2021h = interfaceC0394a;
    }
}
