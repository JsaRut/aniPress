package p139d.p143b.p169g.p176d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p139d.p143b.p169g.p176d.p177a.InterfaceC1784b;
import p139d.p143b.p169g.p178e.C1804t;

/* renamed from: d.b.g.d.a */
/* loaded from: classes.dex */
public class C1782a extends Drawable implements InterfaceC1784b {

    /* renamed from: a */
    private String f6507a;

    /* renamed from: b */
    private String f6508b;

    /* renamed from: c */
    private int f6509c;

    /* renamed from: d */
    private int f6510d;

    /* renamed from: e */
    private int f6511e;

    /* renamed from: f */
    private String f6512f;

    /* renamed from: g */
    private C1804t.b f6513g;

    /* renamed from: h */
    private int f6514h;

    /* renamed from: i */
    private int f6515i;

    /* renamed from: j */
    private int f6516j = 80;

    /* renamed from: k */
    private final Paint f6517k = new Paint(1);

    /* renamed from: l */
    private final Matrix f6518l = new Matrix();

    /* renamed from: m */
    private final Rect f6519m = new Rect();

    /* renamed from: n */
    private final RectF f6520n = new RectF();

    /* renamed from: o */
    private int f6521o;

    /* renamed from: p */
    private int f6522p;

    /* renamed from: q */
    private int f6523q;

    /* renamed from: r */
    private int f6524r;

    /* renamed from: s */
    private int f6525s;

    /* renamed from: t */
    private long f6526t;

    public C1782a() {
        m7329a();
    }

    /* renamed from: a */
    private void m7326a(Canvas canvas, String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(str, objArr);
        }
        canvas.drawText(str, this.f6524r, this.f6525s, this.f6517k);
        this.f6525s += this.f6523q;
    }

    /* renamed from: a */
    private void m7327a(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(12, Math.min(rect.width() / i2, rect.height() / i)));
        this.f6517k.setTextSize(min);
        this.f6523q = min + 8;
        if (this.f6516j == 80) {
            this.f6523q *= -1;
        }
        this.f6521o = rect.left + 10;
        this.f6522p = this.f6516j == 80 ? rect.bottom - 10 : rect.top + 10 + 12;
    }

    /* renamed from: a */
    int m7328a(int i, int i2, C1804t.b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.f6519m;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f6518l.reset();
                bVar.mo7394a(this.f6518l, this.f6519m, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f6520n;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.f6518l.mapRect(rectF);
                int width2 = (int) this.f6520n.width();
                int height2 = (int) this.f6520n.height();
                width = Math.min(width, width2);
                height = Math.min(height, height2);
            }
            float f = width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = abs;
            if (f7 < f2 && abs2 < f5) {
                return 1716301648;
            }
            if (f7 < f3 && abs2 < f6) {
                return 1728026624;
            }
        }
        return 1727284022;
    }

    /* renamed from: a */
    public void m7329a() {
        this.f6509c = -1;
        this.f6510d = -1;
        this.f6511e = -1;
        this.f6514h = -1;
        this.f6515i = -1;
        this.f6512f = null;
        m7334a((String) null);
        this.f6526t = -1L;
        invalidateSelf();
    }

    /* renamed from: a */
    public void m7330a(int i) {
        this.f6511e = i;
    }

    /* renamed from: a */
    public void m7331a(int i, int i2) {
        this.f6509c = i;
        this.f6510d = i2;
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p176d.p177a.InterfaceC1784b
    /* renamed from: a */
    public void mo7332a(long j) {
        this.f6526t = j;
        invalidateSelf();
    }

    /* renamed from: a */
    public void m7333a(C1804t.b bVar) {
        this.f6513g = bVar;
    }

    /* renamed from: a */
    public void m7334a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f6507a = str;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f6517k.setStyle(Paint.Style.STROKE);
        this.f6517k.setStrokeWidth(2.0f);
        this.f6517k.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f6517k);
        this.f6517k.setStyle(Paint.Style.FILL);
        this.f6517k.setColor(m7328a(this.f6509c, this.f6510d, this.f6513g));
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f6517k);
        this.f6517k.setStyle(Paint.Style.FILL);
        this.f6517k.setStrokeWidth(0.0f);
        this.f6517k.setColor(-1);
        this.f6524r = this.f6521o;
        this.f6525s = this.f6522p;
        String str = this.f6508b;
        if (str != null) {
            m7326a(canvas, "IDs: %s, %s", this.f6507a, str);
        } else {
            m7326a(canvas, "ID: %s", this.f6507a);
        }
        m7326a(canvas, "D: %dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height()));
        m7326a(canvas, "I: %dx%d", Integer.valueOf(this.f6509c), Integer.valueOf(this.f6510d));
        m7326a(canvas, "I: %d KiB", Integer.valueOf(this.f6511e / 1024));
        String str2 = this.f6512f;
        if (str2 != null) {
            m7326a(canvas, "i format: %s", str2);
        }
        int i = this.f6514h;
        if (i > 0) {
            m7326a(canvas, "anim: f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f6515i));
        }
        C1804t.b bVar = this.f6513g;
        if (bVar != null) {
            m7326a(canvas, "scale: %s", bVar);
        }
        long j = this.f6526t;
        if (j >= 0) {
            m7326a(canvas, "t: %d ms", Long.valueOf(j));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m7327a(rect, 7, 7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
