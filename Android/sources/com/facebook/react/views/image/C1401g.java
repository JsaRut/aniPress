package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1349i;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.yoga.C1553a;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p169g.p175c.InterfaceC1779g;
import p139d.p143b.p169g.p178e.C1798n;
import p139d.p143b.p169g.p178e.C1804t;
import p139d.p143b.p169g.p178e.RunnableC1787c;
import p139d.p143b.p169g.p179f.C1809a;
import p139d.p143b.p169g.p179f.C1810b;
import p139d.p143b.p169g.p179f.C1812d;
import p139d.p143b.p169g.p182i.C1822d;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p199m.C1932a;
import p139d.p143b.p184i.p201o.AbstractC2021a;
import p139d.p143b.p208m.p222j.p224b.C2116a;
import p139d.p143b.p208m.p222j.p224b.C2118c;
import p139d.p143b.p208m.p222j.p224b.C2119d;

/* renamed from: com.facebook.react.views.image.g */
/* loaded from: classes.dex */
public class C1401g extends C1822d {

    /* renamed from: g */
    private static float[] f5130g = new float[4];

    /* renamed from: h */
    private static final Matrix f5131h = new Matrix();

    /* renamed from: i */
    private static final Matrix f5132i = new Matrix();

    /* renamed from: j */
    private static final Matrix f5133j = new Matrix();

    /* renamed from: A */
    private final AbstractC1777e f5134A;

    /* renamed from: B */
    private final a f5135B;

    /* renamed from: C */
    private final b f5136C;

    /* renamed from: D */
    private C1932a f5137D;

    /* renamed from: E */
    private InterfaceC1779g f5138E;

    /* renamed from: F */
    private InterfaceC1779g f5139F;

    /* renamed from: G */
    private InterfaceC1395a f5140G;

    /* renamed from: H */
    private final Object f5141H;

    /* renamed from: I */
    private int f5142I;

    /* renamed from: J */
    private boolean f5143J;

    /* renamed from: K */
    private ReadableMap f5144K;

    /* renamed from: k */
    private EnumC1397c f5145k;

    /* renamed from: l */
    private final List<C2116a> f5146l;

    /* renamed from: m */
    private C2116a f5147m;

    /* renamed from: n */
    private C2116a f5148n;

    /* renamed from: o */
    private Drawable f5149o;

    /* renamed from: p */
    private Drawable f5150p;

    /* renamed from: q */
    private C1798n f5151q;

    /* renamed from: r */
    private int f5152r;

    /* renamed from: s */
    private int f5153s;

    /* renamed from: t */
    private int f5154t;

    /* renamed from: u */
    private float f5155u;

    /* renamed from: v */
    private float f5156v;

    /* renamed from: w */
    private float[] f5157w;

    /* renamed from: x */
    private C1804t.b f5158x;

    /* renamed from: y */
    private Shader.TileMode f5159y;

    /* renamed from: z */
    private boolean f5160z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.image.g$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2021a {
        private a() {
        }

        /* synthetic */ a(C1401g c1401g, C1400f c1400f) {
            this();
        }

        @Override // p139d.p143b.p184i.p201o.AbstractC2021a
        /* renamed from: a */
        public void mo6022a(Bitmap bitmap, Bitmap bitmap2) {
            C1401g.this.m6008a(C1401g.f5130g);
            bitmap.setHasAlpha(true);
            if (C1349i.m5842a(C1401g.f5130g[0], 0.0f) && C1349i.m5842a(C1401g.f5130g[1], 0.0f) && C1349i.m5842a(C1401g.f5130g[2], 0.0f) && C1349i.m5842a(C1401g.f5130g[3], 0.0f)) {
                super.mo6022a(bitmap, bitmap2);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            Canvas canvas = new Canvas(bitmap);
            float[] fArr = new float[8];
            m6023a(bitmap2, C1401g.f5130g, fArr);
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }

        /* renamed from: a */
        void m6023a(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C1401g.this.f5158x.mo7394a(C1401g.f5131h, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C1401g.f5131h.invert(C1401g.f5132i);
            fArr2[0] = C1401g.f5132i.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C1401g.f5132i.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C1401g.f5132i.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C1401g.f5132i.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.views.image.g$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC2021a {
        private b() {
        }

        /* synthetic */ b(C1401g c1401g, C1400f c1400f) {
            this();
        }

        @Override // p139d.p143b.p184i.p201o.AbstractC2021a, p139d.p143b.p184i.p201o.InterfaceC2025e
        /* renamed from: a */
        public C1716b<Bitmap> mo6000a(Bitmap bitmap, AbstractC1842f abstractC1842f) {
            Rect rect = new Rect(0, 0, C1401g.this.getWidth(), C1401g.this.getHeight());
            C1401g.this.f5158x.mo7394a(C1401g.f5133j, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, C1401g.this.f5159y, C1401g.this.f5159y);
            bitmapShader.setLocalMatrix(C1401g.f5133j);
            paint.setShader(bitmapShader);
            C1716b<Bitmap> m7547a = abstractC1842f.m7547a(C1401g.this.getWidth(), C1401g.this.getHeight());
            try {
                new Canvas(m7547a.m7048n()).drawRect(rect, paint);
                return m7547a.m11778clone();
            } finally {
                C1716b.m7045b(m7547a);
            }
        }
    }

    public C1401g(Context context, AbstractC1777e abstractC1777e, InterfaceC1395a interfaceC1395a, Object obj) {
        super(context, m6011b(context));
        this.f5145k = EnumC1397c.AUTO;
        this.f5152r = 0;
        this.f5156v = Float.NaN;
        this.f5159y = C1398d.m5994a();
        this.f5142I = -1;
        this.f5158x = C1398d.m5997b();
        this.f5134A = abstractC1777e;
        C1400f c1400f = null;
        this.f5135B = new a(this, c1400f);
        this.f5136C = new b(this, c1400f);
        this.f5140G = interfaceC1395a;
        this.f5141H = obj;
        this.f5146l = new LinkedList();
    }

    /* renamed from: a */
    private void m6007a(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6008a(float[] fArr) {
        float f = !C1553a.m6544a(this.f5156v) ? this.f5156v : 0.0f;
        float[] fArr2 = this.f5157w;
        fArr[0] = (fArr2 == null || C1553a.m6544a(fArr2[0])) ? f : this.f5157w[0];
        float[] fArr3 = this.f5157w;
        fArr[1] = (fArr3 == null || C1553a.m6544a(fArr3[1])) ? f : this.f5157w[1];
        float[] fArr4 = this.f5157w;
        fArr[2] = (fArr4 == null || C1553a.m6544a(fArr4[2])) ? f : this.f5157w[2];
        float[] fArr5 = this.f5157w;
        if (fArr5 != null && !C1553a.m6544a(fArr5[3])) {
            f = this.f5157w[3];
        }
        fArr[3] = f;
    }

    /* renamed from: a */
    private boolean m6009a(C2116a c2116a) {
        EnumC1397c enumC1397c = this.f5145k;
        return enumC1397c == EnumC1397c.AUTO ? C1728f.m7086f(c2116a.m8462c()) || C1728f.m7087g(c2116a.m8462c()) : enumC1397c == EnumC1397c.RESIZE;
    }

    /* renamed from: b */
    private static C1809a m6011b(Context context) {
        C1810b c1810b = new C1810b(context.getResources());
        c1810b.m7426a(C1812d.m7445a(0.0f));
        return c1810b.m7423a();
    }

    /* renamed from: j */
    private boolean m6017j() {
        return this.f5146l.size() > 1;
    }

    /* renamed from: k */
    private boolean m6018k() {
        return this.f5159y != Shader.TileMode.CLAMP;
    }

    /* renamed from: l */
    private void m6019l() {
        this.f5147m = null;
        if (this.f5146l.isEmpty()) {
            this.f5146l.add(new C2116a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (m6017j()) {
            C2118c.a m8464a = C2118c.m8464a(getWidth(), getHeight(), this.f5146l);
            this.f5147m = m8464a.m8466a();
            this.f5148n = m8464a.m8467b();
            return;
        }
        this.f5147m = this.f5146l.get(0);
    }

    /* renamed from: a */
    public void m6020a(float f, int i) {
        if (this.f5157w == null) {
            this.f5157w = new float[4];
            Arrays.fill(this.f5157w, Float.NaN);
        }
        if (C1349i.m5842a(this.f5157w[i], f)) {
            return;
        }
        this.f5157w[i] = f;
        this.f5160z = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:            if (r0 != null) goto L83;     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6021i() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.C1401g.m6021i():void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f5160z = this.f5160z || m6017j() || m6018k();
        m6021i();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.f5152r != i) {
            this.f5152r = i;
            this.f5151q = new C1798n(i);
            this.f5160z = true;
        }
    }

    public void setBlurRadius(float f) {
        int m5959b = (int) C1374w.m5959b(f);
        if (m5959b == 0) {
            this.f5137D = null;
        } else {
            this.f5137D = new C1932a(m5959b);
        }
        this.f5160z = true;
    }

    public void setBorderColor(int i) {
        this.f5153s = i;
        this.f5160z = true;
    }

    public void setBorderRadius(float f) {
        if (C1349i.m5842a(this.f5156v, f)) {
            return;
        }
        this.f5156v = f;
        this.f5160z = true;
    }

    public void setBorderWidth(float f) {
        this.f5155u = C1374w.m5959b(f);
        this.f5160z = true;
    }

    public void setControllerListener(InterfaceC1779g interfaceC1779g) {
        this.f5139F = interfaceC1779g;
        this.f5160z = true;
        m6021i();
    }

    public void setDefaultSource(String str) {
        this.f5149o = C2119d.m8468a().m8469a(getContext(), str);
        this.f5160z = true;
    }

    public void setFadeDuration(int i) {
        this.f5142I = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.f5144K = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable m8469a = C2119d.m8468a().m8469a(getContext(), str);
        this.f5150p = m8469a != null ? new RunnableC1787c(m8469a, 1000) : null;
        this.f5160z = true;
    }

    public void setOverlayColor(int i) {
        this.f5154t = i;
        this.f5160z = true;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.f5143J = z;
    }

    public void setResizeMethod(EnumC1397c enumC1397c) {
        this.f5145k = enumC1397c;
        this.f5160z = true;
    }

    public void setScaleType(C1804t.b bVar) {
        this.f5158x = bVar;
        this.f5160z = true;
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (z) {
            this.f5138E = new C1400f(this, ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher());
        } else {
            this.f5138E = null;
        }
        this.f5160z = true;
    }

    public void setSource(ReadableArray readableArray) {
        this.f5146l.clear();
        if (readableArray == null || readableArray.size() == 0) {
            this.f5146l.add(new C2116a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                C2116a c2116a = new C2116a(getContext(), string);
                this.f5146l.add(c2116a);
                if (Uri.EMPTY.equals(c2116a.m8462c())) {
                    m6007a(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString("uri");
                    C2116a c2116a2 = new C2116a(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.f5146l.add(c2116a2);
                    if (Uri.EMPTY.equals(c2116a2.m8462c())) {
                        m6007a(string2);
                    }
                }
            }
        }
        this.f5160z = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        this.f5159y = tileMode;
        this.f5160z = true;
    }
}
