package com.google.android.exoplayer2.p135ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import p139d.p225c.p226a.p227a.p259k.C2518a;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: com.google.android.exoplayer2.ui.m */
/* loaded from: classes.dex */
final class C1574m {

    /* renamed from: A */
    private float f5942A;

    /* renamed from: B */
    private int f5943B;

    /* renamed from: C */
    private int f5944C;

    /* renamed from: D */
    private int f5945D;

    /* renamed from: E */
    private int f5946E;

    /* renamed from: F */
    private StaticLayout f5947F;

    /* renamed from: G */
    private int f5948G;

    /* renamed from: H */
    private int f5949H;

    /* renamed from: I */
    private int f5950I;

    /* renamed from: J */
    private Rect f5951J;

    /* renamed from: a */
    private final float f5952a;

    /* renamed from: b */
    private final float f5953b;

    /* renamed from: c */
    private final float f5954c;

    /* renamed from: d */
    private final float f5955d;

    /* renamed from: e */
    private final float f5956e;

    /* renamed from: f */
    private final TextPaint f5957f;

    /* renamed from: g */
    private final Paint f5958g;

    /* renamed from: h */
    private CharSequence f5959h;

    /* renamed from: i */
    private Layout.Alignment f5960i;

    /* renamed from: j */
    private Bitmap f5961j;

    /* renamed from: k */
    private float f5962k;

    /* renamed from: l */
    private int f5963l;

    /* renamed from: m */
    private int f5964m;

    /* renamed from: n */
    private float f5965n;

    /* renamed from: o */
    private int f5966o;

    /* renamed from: p */
    private float f5967p;

    /* renamed from: q */
    private float f5968q;

    /* renamed from: r */
    private boolean f5969r;

    /* renamed from: s */
    private boolean f5970s;

    /* renamed from: t */
    private int f5971t;

    /* renamed from: u */
    private int f5972u;

    /* renamed from: v */
    private int f5973v;

    /* renamed from: w */
    private int f5974w;

    /* renamed from: x */
    private int f5975x;

    /* renamed from: y */
    private float f5976y;

    /* renamed from: z */
    private float f5977z;

    public C1574m(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f5956e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f5955d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f5952a = round;
        this.f5953b = round;
        this.f5954c = round;
        this.f5957f = new TextPaint();
        this.f5957f.setAntiAlias(true);
        this.f5957f.setSubpixelText(true);
        this.f5958g = new Paint();
        this.f5958g.setAntiAlias(true);
        this.f5958g.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6652a() {
        /*
            r7 = this;
            int r0 = r7.f5945D
            int r1 = r7.f5943B
            int r0 = r0 - r1
            int r2 = r7.f5946E
            int r3 = r7.f5944C
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.f5965n
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.f5962k
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.f5967p
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.f5968q
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L28
            goto L38
        L28:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.f5961j
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.f5961j
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
        L38:
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r7.f5964m
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L47
            float r4 = (float) r0
        L45:
            float r1 = r1 - r4
            goto L4d
        L47:
            if (r4 != r5) goto L4d
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L45
        L4d:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.f5966o
            if (r4 != r6) goto L58
            float r4 = (float) r2
        L56:
            float r3 = r3 - r4
            goto L5e
        L58:
            if (r4 != r5) goto L5e
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L56
        L5e:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.f5951J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.C1574m.m6652a():void");
    }

    /* renamed from: a */
    private void m6653a(Canvas canvas) {
        canvas.drawBitmap(this.f5961j, (Rect) null, this.f5951J, (Paint) null);
    }

    /* renamed from: a */
    private void m6654a(Canvas canvas, boolean z) {
        if (z) {
            m6657b(canvas);
        } else {
            m6653a(canvas);
        }
    }

    /* renamed from: a */
    private static boolean m6655a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6656b() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.C1574m.m6656b():void");
    }

    /* renamed from: b */
    private void m6657b(Canvas canvas) {
        StaticLayout staticLayout = this.f5947F;
        if (staticLayout == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f5948G, this.f5949H);
        if (Color.alpha(this.f5973v) > 0) {
            this.f5958g.setColor(this.f5973v);
            canvas.drawRect(-this.f5950I, 0.0f, staticLayout.getWidth() + this.f5950I, staticLayout.getHeight(), this.f5958g);
        }
        int i = this.f5975x;
        if (i == 1) {
            this.f5957f.setStrokeJoin(Paint.Join.ROUND);
            this.f5957f.setStrokeWidth(this.f5952a);
            this.f5957f.setColor(this.f5974w);
            this.f5957f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f5957f;
            float f = this.f5953b;
            float f2 = this.f5954c;
            textPaint.setShadowLayer(f, f2, f2, this.f5974w);
        } else if (i == 3 || i == 4) {
            boolean z = this.f5975x == 3;
            int i2 = z ? -1 : this.f5974w;
            int i3 = z ? this.f5974w : -1;
            float f3 = this.f5953b / 2.0f;
            this.f5957f.setColor(this.f5971t);
            this.f5957f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f5957f.setShadowLayer(this.f5953b, f4, f4, i2);
            staticLayout.draw(canvas);
            this.f5957f.setShadowLayer(this.f5953b, f3, f3, i3);
        }
        this.f5957f.setColor(this.f5971t);
        this.f5957f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f5957f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void m6658a(C2527b c2527b, boolean z, boolean z2, C2518a c2518a, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z3 = c2527b.f10391c == null;
        int i5 = -16777216;
        if (z3) {
            if (TextUtils.isEmpty(c2527b.f10389a)) {
                return;
            } else {
                i5 = (c2527b.f10399k && z) ? c2527b.f10400l : c2518a.f10298d;
            }
        }
        if (m6655a(this.f5959h, c2527b.f10389a) && C2622I.m11067a(this.f5960i, c2527b.f10390b) && this.f5961j == c2527b.f10391c && this.f5962k == c2527b.f10392d && this.f5963l == c2527b.f10393e && C2622I.m11067a(Integer.valueOf(this.f5964m), Integer.valueOf(c2527b.f10394f)) && this.f5965n == c2527b.f10395g && C2622I.m11067a(Integer.valueOf(this.f5966o), Integer.valueOf(c2527b.f10396h)) && this.f5967p == c2527b.f10397i && this.f5968q == c2527b.f10398j && this.f5969r == z && this.f5970s == z2 && this.f5971t == c2518a.f10296b && this.f5972u == c2518a.f10297c && this.f5973v == i5 && this.f5975x == c2518a.f10299e && this.f5974w == c2518a.f10300f && C2622I.m11067a(this.f5957f.getTypeface(), c2518a.f10301g) && this.f5976y == f && this.f5977z == f2 && this.f5942A == f3 && this.f5943B == i && this.f5944C == i2 && this.f5945D == i3 && this.f5946E == i4) {
            m6654a(canvas, z3);
            return;
        }
        this.f5959h = c2527b.f10389a;
        this.f5960i = c2527b.f10390b;
        this.f5961j = c2527b.f10391c;
        this.f5962k = c2527b.f10392d;
        this.f5963l = c2527b.f10393e;
        this.f5964m = c2527b.f10394f;
        this.f5965n = c2527b.f10395g;
        this.f5966o = c2527b.f10396h;
        this.f5967p = c2527b.f10397i;
        this.f5968q = c2527b.f10398j;
        this.f5969r = z;
        this.f5970s = z2;
        this.f5971t = c2518a.f10296b;
        this.f5972u = c2518a.f10297c;
        this.f5973v = i5;
        this.f5975x = c2518a.f10299e;
        this.f5974w = c2518a.f10300f;
        this.f5957f.setTypeface(c2518a.f10301g);
        this.f5976y = f;
        this.f5977z = f2;
        this.f5942A = f3;
        this.f5943B = i;
        this.f5944C = i2;
        this.f5945D = i3;
        this.f5946E = i4;
        if (z3) {
            m6656b();
        } else {
            m6652a();
        }
        m6654a(canvas, z3);
    }
}
