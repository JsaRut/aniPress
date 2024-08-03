package p000a.p005b.p007b.p008a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.util.C0256b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009c.p010a.p011a.C0024b;
import p000a.p005b.p009c.p010a.p011a.C0030h;
import p000a.p005b.p009c.p010a.p011a.C0031i;
import p000a.p005b.p009c.p012b.C0036b;

/* renamed from: a.b.b.a.k */
/* loaded from: classes.dex */
public class C0021k extends AbstractC0019i {

    /* renamed from: b */
    static final PorterDuff.Mode f52b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private g f53c;

    /* renamed from: d */
    private PorterDuffColorFilter f54d;

    /* renamed from: e */
    private ColorFilter f55e;

    /* renamed from: f */
    private boolean f56f;

    /* renamed from: g */
    private boolean f57g;

    /* renamed from: h */
    private Drawable.ConstantState f58h;

    /* renamed from: i */
    private final float[] f59i;

    /* renamed from: j */
    private final Matrix f60j;

    /* renamed from: k */
    private final Rect f61k;

    /* renamed from: a.b.b.a.k$a */
    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m56a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f89b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f88a = C0036b.m179a(string2);
            }
        }

        /* renamed from: a */
        public void m57a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0031i.m149a(xmlPullParser, "pathData")) {
                TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f25d);
                m56a(m146a);
                m146a.recycle();
            }
        }

        @Override // p000a.p005b.p007b.p008a.C0021k.e
        /* renamed from: b */
        public boolean mo58b() {
            return true;
        }
    }

    /* renamed from: a.b.b.a.k$b */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: d */
        private int[] f62d;

        /* renamed from: e */
        C0024b f63e;

        /* renamed from: f */
        float f64f;

        /* renamed from: g */
        C0024b f65g;

        /* renamed from: h */
        float f66h;

        /* renamed from: i */
        int f67i;

        /* renamed from: j */
        float f68j;

        /* renamed from: k */
        float f69k;

        /* renamed from: l */
        float f70l;

        /* renamed from: m */
        float f71m;

        /* renamed from: n */
        Paint.Cap f72n;

        /* renamed from: o */
        Paint.Join f73o;

        /* renamed from: p */
        float f74p;

        public b() {
            this.f64f = 0.0f;
            this.f66h = 1.0f;
            this.f67i = 0;
            this.f68j = 1.0f;
            this.f69k = 0.0f;
            this.f70l = 1.0f;
            this.f71m = 0.0f;
            this.f72n = Paint.Cap.BUTT;
            this.f73o = Paint.Join.MITER;
            this.f74p = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f64f = 0.0f;
            this.f66h = 1.0f;
            this.f67i = 0;
            this.f68j = 1.0f;
            this.f69k = 0.0f;
            this.f70l = 1.0f;
            this.f71m = 0.0f;
            this.f72n = Paint.Cap.BUTT;
            this.f73o = Paint.Join.MITER;
            this.f74p = 4.0f;
            this.f62d = bVar.f62d;
            this.f63e = bVar.f63e;
            this.f64f = bVar.f64f;
            this.f66h = bVar.f66h;
            this.f65g = bVar.f65g;
            this.f67i = bVar.f67i;
            this.f68j = bVar.f68j;
            this.f69k = bVar.f69k;
            this.f70l = bVar.f70l;
            this.f71m = bVar.f71m;
            this.f72n = bVar.f72n;
            this.f73o = bVar.f73o;
            this.f74p = bVar.f74p;
        }

        /* renamed from: a */
        private Paint.Cap m59a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: a */
        private Paint.Join m60a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: a */
        private void m61a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f62d = null;
            if (C0031i.m149a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f89b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f88a = C0036b.m179a(string2);
                }
                this.f65g = C0031i.m145a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f68j = C0031i.m143a(typedArray, xmlPullParser, "fillAlpha", 12, this.f68j);
                this.f72n = m59a(C0031i.m150b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f72n);
                this.f73o = m60a(C0031i.m150b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f73o);
                this.f74p = C0031i.m143a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f74p);
                this.f63e = C0031i.m145a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f66h = C0031i.m143a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f66h);
                this.f64f = C0031i.m143a(typedArray, xmlPullParser, "strokeWidth", 4, this.f64f);
                this.f70l = C0031i.m143a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f70l);
                this.f71m = C0031i.m143a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f71m);
                this.f69k = C0031i.m143a(typedArray, xmlPullParser, "trimPathStart", 5, this.f69k);
                this.f67i = C0031i.m150b(typedArray, xmlPullParser, "fillType", 13, this.f67i);
            }
        }

        /* renamed from: a */
        public void m62a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f24c);
            m61a(m146a, xmlPullParser, theme);
            m146a.recycle();
        }

        @Override // p000a.p005b.p007b.p008a.C0021k.d
        /* renamed from: a */
        public boolean mo63a() {
            return this.f65g.m108d() || this.f63e.m108d();
        }

        @Override // p000a.p005b.p007b.p008a.C0021k.d
        /* renamed from: a */
        public boolean mo64a(int[] iArr) {
            return this.f63e.m104a(iArr) | this.f65g.m104a(iArr);
        }

        float getFillAlpha() {
            return this.f68j;
        }

        int getFillColor() {
            return this.f65g.m103a();
        }

        float getStrokeAlpha() {
            return this.f66h;
        }

        int getStrokeColor() {
            return this.f63e.m103a();
        }

        float getStrokeWidth() {
            return this.f64f;
        }

        float getTrimPathEnd() {
            return this.f70l;
        }

        float getTrimPathOffset() {
            return this.f71m;
        }

        float getTrimPathStart() {
            return this.f69k;
        }

        void setFillAlpha(float f) {
            this.f68j = f;
        }

        void setFillColor(int i) {
            this.f65g.m106b(i);
        }

        void setStrokeAlpha(float f) {
            this.f66h = f;
        }

        void setStrokeColor(int i) {
            this.f63e.m106b(i);
        }

        void setStrokeWidth(float f) {
            this.f64f = f;
        }

        void setTrimPathEnd(float f) {
            this.f70l = f;
        }

        void setTrimPathOffset(float f) {
            this.f71m = f;
        }

        void setTrimPathStart(float f) {
            this.f69k = f;
        }
    }

    /* renamed from: a.b.b.a.k$c */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a */
        final Matrix f75a;

        /* renamed from: b */
        final ArrayList<d> f76b;

        /* renamed from: c */
        float f77c;

        /* renamed from: d */
        private float f78d;

        /* renamed from: e */
        private float f79e;

        /* renamed from: f */
        private float f80f;

        /* renamed from: g */
        private float f81g;

        /* renamed from: h */
        private float f82h;

        /* renamed from: i */
        private float f83i;

        /* renamed from: j */
        final Matrix f84j;

        /* renamed from: k */
        int f85k;

        /* renamed from: l */
        private int[] f86l;

        /* renamed from: m */
        private String f87m;

        public c() {
            super();
            this.f75a = new Matrix();
            this.f76b = new ArrayList<>();
            this.f77c = 0.0f;
            this.f78d = 0.0f;
            this.f79e = 0.0f;
            this.f80f = 1.0f;
            this.f81g = 1.0f;
            this.f82h = 0.0f;
            this.f83i = 0.0f;
            this.f84j = new Matrix();
            this.f87m = null;
        }

        public c(c cVar, C0256b<String, Object> c0256b) {
            super();
            e aVar;
            this.f75a = new Matrix();
            this.f76b = new ArrayList<>();
            this.f77c = 0.0f;
            this.f78d = 0.0f;
            this.f79e = 0.0f;
            this.f80f = 1.0f;
            this.f81g = 1.0f;
            this.f82h = 0.0f;
            this.f83i = 0.0f;
            this.f84j = new Matrix();
            this.f87m = null;
            this.f77c = cVar.f77c;
            this.f78d = cVar.f78d;
            this.f79e = cVar.f79e;
            this.f80f = cVar.f80f;
            this.f81g = cVar.f81g;
            this.f82h = cVar.f82h;
            this.f83i = cVar.f83i;
            this.f86l = cVar.f86l;
            this.f87m = cVar.f87m;
            this.f85k = cVar.f85k;
            String str = this.f87m;
            if (str != null) {
                c0256b.put(str, this);
            }
            this.f84j.set(cVar.f84j);
            ArrayList<d> arrayList = cVar.f76b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.f76b.add(new c((c) dVar, c0256b));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else {
                        if (!(dVar instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) dVar);
                    }
                    this.f76b.add(aVar);
                    String str2 = aVar.f89b;
                    if (str2 != null) {
                        c0256b.put(str2, aVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m65a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f86l = null;
            this.f77c = C0031i.m143a(typedArray, xmlPullParser, "rotation", 5, this.f77c);
            this.f78d = typedArray.getFloat(1, this.f78d);
            this.f79e = typedArray.getFloat(2, this.f79e);
            this.f80f = C0031i.m143a(typedArray, xmlPullParser, "scaleX", 3, this.f80f);
            this.f81g = C0031i.m143a(typedArray, xmlPullParser, "scaleY", 4, this.f81g);
            this.f82h = C0031i.m143a(typedArray, xmlPullParser, "translateX", 6, this.f82h);
            this.f83i = C0031i.m143a(typedArray, xmlPullParser, "translateY", 7, this.f83i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f87m = string;
            }
            m66b();
        }

        /* renamed from: b */
        private void m66b() {
            this.f84j.reset();
            this.f84j.postTranslate(-this.f78d, -this.f79e);
            this.f84j.postScale(this.f80f, this.f81g);
            this.f84j.postRotate(this.f77c, 0.0f, 0.0f);
            this.f84j.postTranslate(this.f82h + this.f78d, this.f83i + this.f79e);
        }

        /* renamed from: a */
        public void m67a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f23b);
            m65a(m146a, xmlPullParser);
            m146a.recycle();
        }

        @Override // p000a.p005b.p007b.p008a.C0021k.d
        /* renamed from: a */
        public boolean mo63a() {
            for (int i = 0; i < this.f76b.size(); i++) {
                if (this.f76b.get(i).mo63a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.p005b.p007b.p008a.C0021k.d
        /* renamed from: a */
        public boolean mo64a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f76b.size(); i++) {
                z |= this.f76b.get(i).mo64a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f87m;
        }

        public Matrix getLocalMatrix() {
            return this.f84j;
        }

        public float getPivotX() {
            return this.f78d;
        }

        public float getPivotY() {
            return this.f79e;
        }

        public float getRotation() {
            return this.f77c;
        }

        public float getScaleX() {
            return this.f80f;
        }

        public float getScaleY() {
            return this.f81g;
        }

        public float getTranslateX() {
            return this.f82h;
        }

        public float getTranslateY() {
            return this.f83i;
        }

        public void setPivotX(float f) {
            if (f != this.f78d) {
                this.f78d = f;
                m66b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f79e) {
                this.f79e = f;
                m66b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f77c) {
                this.f77c = f;
                m66b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f80f) {
                this.f80f = f;
                m66b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f81g) {
                this.f81g = f;
                m66b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f82h) {
                this.f82h = f;
                m66b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f83i) {
                this.f83i = f;
                m66b();
            }
        }
    }

    /* renamed from: a.b.b.a.k$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        private d() {
        }

        /* synthetic */ d(C0020j c0020j) {
            this();
        }

        /* renamed from: a */
        public boolean mo63a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo64a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a.b.b.a.k$e */
    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a */
        protected C0036b.b[] f88a;

        /* renamed from: b */
        String f89b;

        /* renamed from: c */
        int f90c;

        public e() {
            super();
            this.f88a = null;
        }

        public e(e eVar) {
            super();
            this.f88a = null;
            this.f89b = eVar.f89b;
            this.f90c = eVar.f90c;
            this.f88a = C0036b.m180a(eVar.f88a);
        }

        /* renamed from: a */
        public void m68a(Path path) {
            path.reset();
            C0036b.b[] bVarArr = this.f88a;
            if (bVarArr != null) {
                C0036b.b.m187a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo58b() {
            return false;
        }

        public C0036b.b[] getPathData() {
            return this.f88a;
        }

        public String getPathName() {
            return this.f89b;
        }

        public void setPathData(C0036b.b[] bVarArr) {
            if (C0036b.m177a(this.f88a, bVarArr)) {
                C0036b.m182b(this.f88a, bVarArr);
            } else {
                this.f88a = C0036b.m180a(bVarArr);
            }
        }
    }

    /* renamed from: a.b.b.a.k$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private static final Matrix f91a = new Matrix();

        /* renamed from: b */
        private final Path f92b;

        /* renamed from: c */
        private final Path f93c;

        /* renamed from: d */
        private final Matrix f94d;

        /* renamed from: e */
        Paint f95e;

        /* renamed from: f */
        Paint f96f;

        /* renamed from: g */
        private PathMeasure f97g;

        /* renamed from: h */
        private int f98h;

        /* renamed from: i */
        final c f99i;

        /* renamed from: j */
        float f100j;

        /* renamed from: k */
        float f101k;

        /* renamed from: l */
        float f102l;

        /* renamed from: m */
        float f103m;

        /* renamed from: n */
        int f104n;

        /* renamed from: o */
        String f105o;

        /* renamed from: p */
        Boolean f106p;

        /* renamed from: q */
        final C0256b<String, Object> f107q;

        public f() {
            this.f94d = new Matrix();
            this.f100j = 0.0f;
            this.f101k = 0.0f;
            this.f102l = 0.0f;
            this.f103m = 0.0f;
            this.f104n = 255;
            this.f105o = null;
            this.f106p = null;
            this.f107q = new C0256b<>();
            this.f99i = new c();
            this.f92b = new Path();
            this.f93c = new Path();
        }

        public f(f fVar) {
            this.f94d = new Matrix();
            this.f100j = 0.0f;
            this.f101k = 0.0f;
            this.f102l = 0.0f;
            this.f103m = 0.0f;
            this.f104n = 255;
            this.f105o = null;
            this.f106p = null;
            this.f107q = new C0256b<>();
            this.f99i = new c(fVar.f99i, this.f107q);
            this.f92b = new Path(fVar.f92b);
            this.f93c = new Path(fVar.f93c);
            this.f100j = fVar.f100j;
            this.f101k = fVar.f101k;
            this.f102l = fVar.f102l;
            this.f103m = fVar.f103m;
            this.f98h = fVar.f98h;
            this.f104n = fVar.f104n;
            this.f105o = fVar.f105o;
            String str = fVar.f105o;
            if (str != null) {
                this.f107q.put(str, this);
            }
            this.f106p = fVar.f106p;
        }

        /* renamed from: a */
        private static float m69a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m70a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m69a = m69a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(m69a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m71a(c cVar, e eVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f102l;
            float f2 = i2 / this.f103m;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f75a;
            this.f94d.set(matrix);
            this.f94d.postScale(f, f2);
            float m70a = m70a(matrix);
            if (m70a == 0.0f) {
                return;
            }
            eVar.m68a(this.f92b);
            Path path = this.f92b;
            this.f93c.reset();
            if (eVar.mo58b()) {
                this.f93c.addPath(path, this.f94d);
                canvas.clipPath(this.f93c);
                return;
            }
            b bVar = (b) eVar;
            if (bVar.f69k != 0.0f || bVar.f70l != 1.0f) {
                float f3 = bVar.f69k;
                float f4 = bVar.f71m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (bVar.f70l + f4) % 1.0f;
                if (this.f97g == null) {
                    this.f97g = new PathMeasure();
                }
                this.f97g.setPath(this.f92b, false);
                float length = this.f97g.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f97g.getSegment(f7, length, path, true);
                    this.f97g.getSegment(0.0f, f8, path, true);
                } else {
                    this.f97g.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f93c.addPath(path, this.f94d);
            if (bVar.f65g.m109e()) {
                C0024b c0024b = bVar.f65g;
                if (this.f96f == null) {
                    this.f96f = new Paint(1);
                    this.f96f.setStyle(Paint.Style.FILL);
                }
                Paint paint = this.f96f;
                if (c0024b.m107c()) {
                    Shader m105b = c0024b.m105b();
                    m105b.setLocalMatrix(this.f94d);
                    paint.setShader(m105b);
                    paint.setAlpha(Math.round(bVar.f68j * 255.0f));
                } else {
                    paint.setColor(C0021k.m47a(c0024b.m103a(), bVar.f68j));
                }
                paint.setColorFilter(colorFilter);
                this.f93c.setFillType(bVar.f67i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f93c, paint);
            }
            if (bVar.f63e.m109e()) {
                C0024b c0024b2 = bVar.f63e;
                if (this.f95e == null) {
                    this.f95e = new Paint(1);
                    this.f95e.setStyle(Paint.Style.STROKE);
                }
                Paint paint2 = this.f95e;
                Paint.Join join = bVar.f73o;
                if (join != null) {
                    paint2.setStrokeJoin(join);
                }
                Paint.Cap cap = bVar.f72n;
                if (cap != null) {
                    paint2.setStrokeCap(cap);
                }
                paint2.setStrokeMiter(bVar.f74p);
                if (c0024b2.m107c()) {
                    Shader m105b2 = c0024b2.m105b();
                    m105b2.setLocalMatrix(this.f94d);
                    paint2.setShader(m105b2);
                    paint2.setAlpha(Math.round(bVar.f66h * 255.0f));
                } else {
                    paint2.setColor(C0021k.m47a(c0024b2.m103a(), bVar.f66h));
                }
                paint2.setColorFilter(colorFilter);
                paint2.setStrokeWidth(bVar.f64f * min * m70a);
                canvas.drawPath(this.f93c, paint2);
            }
        }

        /* renamed from: a */
        private void m72a(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f75a.set(matrix);
            cVar.f75a.preConcat(cVar.f84j);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f76b.size(); i3++) {
                d dVar = cVar.f76b.get(i3);
                if (dVar instanceof c) {
                    m72a((c) dVar, cVar.f75a, canvas, i, i2, colorFilter);
                } else if (dVar instanceof e) {
                    m71a(cVar, (e) dVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        public void m73a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m72a(this.f99i, f91a, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean m74a() {
            if (this.f106p == null) {
                this.f106p = Boolean.valueOf(this.f99i.mo63a());
            }
            return this.f106p.booleanValue();
        }

        /* renamed from: a */
        public boolean m75a(int[] iArr) {
            return this.f99i.mo64a(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f104n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f104n = i;
        }
    }

    /* renamed from: a.b.b.a.k$g */
    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a */
        int f108a;

        /* renamed from: b */
        f f109b;

        /* renamed from: c */
        ColorStateList f110c;

        /* renamed from: d */
        PorterDuff.Mode f111d;

        /* renamed from: e */
        boolean f112e;

        /* renamed from: f */
        Bitmap f113f;

        /* renamed from: g */
        ColorStateList f114g;

        /* renamed from: h */
        PorterDuff.Mode f115h;

        /* renamed from: i */
        int f116i;

        /* renamed from: j */
        boolean f117j;

        /* renamed from: k */
        boolean f118k;

        /* renamed from: l */
        Paint f119l;

        public g() {
            this.f110c = null;
            this.f111d = C0021k.f52b;
            this.f109b = new f();
        }

        public g(g gVar) {
            this.f110c = null;
            this.f111d = C0021k.f52b;
            if (gVar != null) {
                this.f108a = gVar.f108a;
                this.f109b = new f(gVar.f109b);
                Paint paint = gVar.f109b.f96f;
                if (paint != null) {
                    this.f109b.f96f = new Paint(paint);
                }
                Paint paint2 = gVar.f109b.f95e;
                if (paint2 != null) {
                    this.f109b.f95e = new Paint(paint2);
                }
                this.f110c = gVar.f110c;
                this.f111d = gVar.f111d;
                this.f112e = gVar.f112e;
            }
        }

        /* renamed from: a */
        public Paint m76a(ColorFilter colorFilter) {
            if (!m82b() && colorFilter == null) {
                return null;
            }
            if (this.f119l == null) {
                this.f119l = new Paint();
                this.f119l.setFilterBitmap(true);
            }
            this.f119l.setAlpha(this.f109b.getRootAlpha());
            this.f119l.setColorFilter(colorFilter);
            return this.f119l;
        }

        /* renamed from: a */
        public void m77a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f113f, (Rect) null, rect, m76a(colorFilter));
        }

        /* renamed from: a */
        public boolean m78a() {
            return !this.f118k && this.f114g == this.f110c && this.f115h == this.f111d && this.f117j == this.f112e && this.f116i == this.f109b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean m79a(int i, int i2) {
            return i == this.f113f.getWidth() && i2 == this.f113f.getHeight();
        }

        /* renamed from: a */
        public boolean m80a(int[] iArr) {
            boolean m75a = this.f109b.m75a(iArr);
            this.f118k |= m75a;
            return m75a;
        }

        /* renamed from: b */
        public void m81b(int i, int i2) {
            if (this.f113f == null || !m79a(i, i2)) {
                this.f113f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f118k = true;
            }
        }

        /* renamed from: b */
        public boolean m82b() {
            return this.f109b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void m83c(int i, int i2) {
            this.f113f.eraseColor(0);
            this.f109b.m73a(new Canvas(this.f113f), i, i2, (ColorFilter) null);
        }

        /* renamed from: c */
        public boolean m84c() {
            return this.f109b.m74a();
        }

        /* renamed from: d */
        public void m85d() {
            this.f114g = this.f110c;
            this.f115h = this.f111d;
            this.f116i = this.f109b.getRootAlpha();
            this.f117j = this.f112e;
            this.f118k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f108a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0021k(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0021k(this);
        }
    }

    /* renamed from: a.b.b.a.k$h */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f120a;

        public h(Drawable.ConstantState constantState) {
            this.f120a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f120a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f120a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0021k c0021k = new C0021k();
            c0021k.f51a = (VectorDrawable) this.f120a.newDrawable();
            return c0021k;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0021k c0021k = new C0021k();
            c0021k.f51a = (VectorDrawable) this.f120a.newDrawable(resources);
            return c0021k;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0021k c0021k = new C0021k();
            c0021k.f51a = (VectorDrawable) this.f120a.newDrawable(resources, theme);
            return c0021k;
        }
    }

    C0021k() {
        this.f57g = true;
        this.f59i = new float[9];
        this.f60j = new Matrix();
        this.f61k = new Rect();
        this.f53c = new g();
    }

    C0021k(g gVar) {
        this.f57g = true;
        this.f59i = new float[9];
        this.f60j = new Matrix();
        this.f61k = new Rect();
        this.f53c = gVar;
        this.f54d = m53a(this.f54d, gVar.f110c, gVar.f111d);
    }

    /* renamed from: a */
    static int m47a(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    /* renamed from: a */
    public static C0021k m48a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0021k c0021k = new C0021k();
            c0021k.f51a = C0030h.m138a(resources, i, theme);
            c0021k.f58h = new h(c0021k.f51a.getConstantState());
            return c0021k;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static PorterDuff.Mode m49a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m50a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        a aVar;
        g gVar = this.f53c;
        f fVar = gVar.f109b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f99i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.m62a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f76b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f107q.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    aVar = bVar;
                } else if ("clip-path".equals(name)) {
                    a aVar2 = new a();
                    aVar2.m57a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f76b.add(aVar2);
                    String pathName = aVar2.getPathName();
                    aVar = aVar2;
                    if (pathName != null) {
                        fVar.f107q.put(aVar2.getPathName(), aVar2);
                        aVar = aVar2;
                    }
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    cVar2.m67a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f76b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f107q.put(cVar2.getGroupName(), cVar2);
                    }
                    i = gVar.f108a;
                    i2 = cVar2.f85k;
                    gVar.f108a = i2 | i;
                }
                i = gVar.f108a;
                i2 = aVar.f90c;
                gVar.f108a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: a */
    private void m51a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        g gVar = this.f53c;
        f fVar = gVar.f109b;
        gVar.f111d = m49a(C0031i.m150b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f110c = colorStateList;
        }
        gVar.f112e = C0031i.m148a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f112e);
        fVar.f102l = C0031i.m143a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.f102l);
        fVar.f103m = C0031i.m143a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.f103m);
        if (fVar.f102l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fVar.f103m <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        fVar.f100j = typedArray.getDimension(3, fVar.f100j);
        fVar.f101k = typedArray.getDimension(2, fVar.f101k);
        if (fVar.f100j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (fVar.f101k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        fVar.setAlpha(C0031i.m143a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            fVar.f105o = string;
            fVar.f107q.put(string, fVar);
        }
    }

    /* renamed from: a */
    private boolean m52a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0220a.m1205d(this) == 1;
    }

    public static C0021k createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0021k c0021k = new C0021k();
        c0021k.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0021k;
    }

    /* renamed from: a */
    PorterDuffColorFilter m53a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public Object m54a(String str) {
        return this.f53c.f109b.f107q.get(str);
    }

    /* renamed from: a */
    public void m55a(boolean z) {
        this.f57g = z;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f51a;
        if (drawable == null) {
            return false;
        }
        C0220a.m1200a(drawable);
        return false;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f61k);
        if (this.f61k.width() <= 0 || this.f61k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f55e;
        if (colorFilter == null) {
            colorFilter = this.f54d;
        }
        canvas.getMatrix(this.f60j);
        this.f60j.getValues(this.f59i);
        float abs = Math.abs(this.f59i[0]);
        float abs2 = Math.abs(this.f59i[4]);
        float abs3 = Math.abs(this.f59i[1]);
        float abs4 = Math.abs(this.f59i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f61k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f61k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f61k;
        canvas.translate(rect.left, rect.top);
        if (m52a()) {
            canvas.translate(this.f61k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f61k.offsetTo(0, 0);
        this.f53c.m81b(min, min2);
        if (!this.f57g) {
            this.f53c.m83c(min, min2);
        } else if (!this.f53c.m78a()) {
            this.f53c.m83c(min, min2);
            this.f53c.m85d();
        }
        this.f53c.m77a(canvas, colorFilter, this.f61k);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0220a.m1202b(drawable) : this.f53c.f109b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f53c.getChangingConfigurations();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f51a;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new h(drawable.getConstantState());
        }
        this.f53c.f108a = getChangingConfigurations();
        return this.f53c;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f53c.f109b.f101k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f53c.f109b.f100j;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1197a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f53c;
        gVar.f109b = new f();
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f22a);
        m51a(m146a, xmlPullParser);
        m146a.recycle();
        gVar.f108a = getChangingConfigurations();
        gVar.f118k = true;
        m50a(resources, xmlPullParser, attributeSet, theme);
        this.f54d = m53a(this.f54d, gVar.f110c, gVar.f111d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f51a;
        return drawable != null ? C0220a.m1206e(drawable) : this.f53c.f112e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        g gVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((gVar = this.f53c) != null && (gVar.m84c() || ((colorStateList = this.f53c.f110c) != null && colorStateList.isStateful())));
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f56f && super.mutate() == this) {
            this.f53c = new g(this.f53c);
            this.f56f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f51a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        g gVar = this.f53c;
        ColorStateList colorStateList = gVar.f110c;
        if (colorStateList != null && (mode = gVar.f111d) != null) {
            this.f54d = m53a(this.f54d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!gVar.m84c() || !gVar.m80a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f53c.f109b.getRootAlpha() != i) {
            this.f53c.f109b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1199a(drawable, z);
        } else {
            this.f53c.f112e = z;
        }
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f55e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000a.p005b.p007b.p008a.AbstractC0019i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTint(int i) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1203b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1195a(drawable, colorStateList);
            return;
        }
        g gVar = this.f53c;
        if (gVar.f110c != colorStateList) {
            gVar.f110c = colorStateList;
            this.f54d = m53a(this.f54d, colorStateList, gVar.f111d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            C0220a.m1198a(drawable, mode);
            return;
        }
        g gVar = this.f53c;
        if (gVar.f111d != mode) {
            gVar.f111d = mode;
            this.f54d = m53a(this.f54d, gVar.f110c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f51a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f51a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
