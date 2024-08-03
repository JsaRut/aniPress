package com.google.android.exoplayer2.p135ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.C2518a;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2564l;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* loaded from: classes.dex */
public final class SubtitleView extends View implements InterfaceC2564l {

    /* renamed from: a */
    private final List<C1574m> f5873a;

    /* renamed from: b */
    private List<C2527b> f5874b;

    /* renamed from: c */
    private int f5875c;

    /* renamed from: d */
    private float f5876d;

    /* renamed from: e */
    private boolean f5877e;

    /* renamed from: f */
    private boolean f5878f;

    /* renamed from: g */
    private C2518a f5879g;

    /* renamed from: h */
    private float f5880h;

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5873a = new ArrayList();
        this.f5875c = 0;
        this.f5876d = 0.0533f;
        this.f5877e = true;
        this.f5878f = true;
        this.f5879g = C2518a.f10295a;
        this.f5880h = 0.08f;
    }

    /* renamed from: a */
    private float m6571a(int i, float f, int i2, int i3) {
        float f2;
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return Float.MIN_VALUE;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    /* renamed from: a */
    private float m6572a(C2527b c2527b, int i, int i2) {
        int i3 = c2527b.f10401m;
        if (i3 != Integer.MIN_VALUE) {
            float f = c2527b.f10402n;
            if (f != Float.MIN_VALUE) {
                return Math.max(m6571a(i3, f, i, i2), 0.0f);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m6573a(int i, float f) {
        if (this.f5875c == i && this.f5876d == f) {
            return;
        }
        this.f5875c = i;
        this.f5876d = f;
        invalidate();
    }

    @TargetApi(19)
    /* renamed from: c */
    private boolean m6574c() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private C2518a getUserCaptionStyleV19() {
        return C2518a.m10521a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    /* renamed from: a */
    public void m6575a() {
        setStyle((C2622I.f10916a < 19 || !m6574c() || isInEditMode()) ? C2518a.f10295a : getUserCaptionStyleV19());
    }

    /* renamed from: a */
    public void m6576a(float f, boolean z) {
        m6573a(z ? 1 : 0, f);
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2564l
    /* renamed from: a */
    public void mo4851a(List<C2527b> list) {
        setCues(list);
    }

    /* renamed from: b */
    public void m6577b() {
        setFractionalTextSize(((C2622I.f10916a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C2527b> list = this.f5874b;
        int i = 0;
        int size = list == null ? 0 : list.size();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i2 = paddingBottom - paddingTop;
        float m6571a = m6571a(this.f5875c, this.f5876d, height, i2);
        if (m6571a <= 0.0f) {
            return;
        }
        while (i < size) {
            C2527b c2527b = this.f5874b.get(i);
            int i3 = paddingBottom;
            int i4 = width;
            this.f5873a.get(i).m6658a(c2527b, this.f5877e, this.f5878f, this.f5879g, m6571a, m6572a(c2527b, height, i2), this.f5880h, canvas, paddingLeft, paddingTop, i4, i3);
            i++;
            i2 = i2;
            paddingBottom = i3;
            width = i4;
            paddingLeft = paddingLeft;
        }
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.f5878f == z) {
            return;
        }
        this.f5878f = z;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.f5877e == z && this.f5878f == z) {
            return;
        }
        this.f5877e = z;
        this.f5878f = z;
        invalidate();
    }

    public void setBottomPaddingFraction(float f) {
        if (this.f5880h == f) {
            return;
        }
        this.f5880h = f;
        invalidate();
    }

    public void setCues(List<C2527b> list) {
        if (this.f5874b == list) {
            return;
        }
        this.f5874b = list;
        int size = list == null ? 0 : list.size();
        while (this.f5873a.size() < size) {
            this.f5873a.add(new C1574m(getContext()));
        }
        invalidate();
    }

    public void setFractionalTextSize(float f) {
        m6576a(f, false);
    }

    public void setStyle(C2518a c2518a) {
        if (this.f5879g == c2518a) {
            return;
        }
        this.f5879g = c2518a;
        invalidate();
    }
}
