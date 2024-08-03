package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.C1187a;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.views.text.AbstractC1475z;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p169g.p179f.C1809a;
import p139d.p143b.p169g.p179f.C1810b;
import p139d.p143b.p169g.p182i.C1820b;
import p139d.p143b.p184i.p201o.C2024d;

/* renamed from: com.facebook.react.views.text.frescosupport.b */
/* loaded from: classes.dex */
public class C1455b extends AbstractC1475z {

    /* renamed from: a */
    private Drawable f5349a;

    /* renamed from: b */
    private final AbstractC1777e f5350b;

    /* renamed from: c */
    private final C1820b<C1809a> f5351c;

    /* renamed from: d */
    private final Object f5352d;

    /* renamed from: e */
    private int f5353e;

    /* renamed from: f */
    private int f5354f;

    /* renamed from: g */
    private Uri f5355g;

    /* renamed from: h */
    private int f5356h;

    /* renamed from: i */
    private ReadableMap f5357i;

    /* renamed from: j */
    private TextView f5358j;

    public C1455b(Resources resources, int i, int i2, int i3, Uri uri, ReadableMap readableMap, AbstractC1777e abstractC1777e, Object obj) {
        this.f5351c = new C1820b<>(C1810b.m7420a(resources).m7423a());
        this.f5350b = abstractC1777e;
        this.f5352d = obj;
        this.f5354f = i3;
        this.f5355g = uri == null ? Uri.EMPTY : uri;
        this.f5357i = readableMap;
        this.f5356h = (int) C1374w.m5959b(i2);
        this.f5353e = (int) C1374w.m5959b(i);
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: a */
    public Drawable mo6150a() {
        return this.f5349a;
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: a */
    public void mo6151a(TextView textView) {
        this.f5358j = textView;
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: b */
    public int mo6152b() {
        return this.f5353e;
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: c */
    public void mo6153c() {
        this.f5351c.m7492d();
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: d */
    public void mo6154d() {
        this.f5351c.m7493e();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f5349a == null) {
            C1187a m5331a = C1187a.m5331a(C2024d.m8255a(this.f5355g), this.f5357i);
            AbstractC1777e abstractC1777e = this.f5350b;
            abstractC1777e.m7318k();
            abstractC1777e.mo7303a(this.f5351c.m7485a());
            abstractC1777e.m7304a(this.f5352d);
            abstractC1777e.m7307b((AbstractC1777e) m5331a);
            this.f5351c.m7487a(abstractC1777e.build());
            this.f5350b.m7318k();
            this.f5349a = this.f5351c.m7491c();
            this.f5349a.setBounds(0, 0, this.f5356h, this.f5353e);
            int i6 = this.f5354f;
            if (i6 != 0) {
                this.f5349a.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            this.f5349a.setCallback(this.f5358j);
        }
        canvas.save();
        canvas.translate(f, ((i4 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f5349a.getBounds().bottom - this.f5349a.getBounds().top) / 2));
        this.f5349a.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: e */
    public void mo6155e() {
        this.f5351c.m7492d();
    }

    @Override // com.facebook.react.views.text.AbstractC1475z
    /* renamed from: f */
    public void mo6156f() {
        this.f5351c.m7493e();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.f5353e;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.f5356h;
    }
}
