package p000a.p005b.p007b.p008a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p000a.p005b.p009c.p010a.p011a.C0031i;
import p000a.p005b.p009c.p012b.C0036b;

/* renamed from: a.b.b.a.h */
/* loaded from: classes.dex */
public class InterpolatorC0018h implements Interpolator {

    /* renamed from: a */
    private float[] f49a;

    /* renamed from: b */
    private float[] f50b;

    public InterpolatorC0018h(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public InterpolatorC0018h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f33l);
        m45a(m146a, xmlPullParser);
        m146a.recycle();
    }

    /* renamed from: a */
    private void m43a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m46a(path);
    }

    /* renamed from: a */
    private void m44a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m46a(path);
    }

    /* renamed from: a */
    private void m45a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0031i.m149a(xmlPullParser, "pathData")) {
            String m147a = C0031i.m147a(typedArray, xmlPullParser, "pathData", 4);
            Path m181b = C0036b.m181b(m147a);
            if (m181b != null) {
                m46a(m181b);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m147a);
        }
        if (!C0031i.m149a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!C0031i.m149a(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float m143a = C0031i.m143a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float m143a2 = C0031i.m143a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean m149a = C0031i.m149a(xmlPullParser, "controlX2");
        if (m149a != C0031i.m149a(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (m149a) {
            m44a(m143a, m143a2, C0031i.m143a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0031i.m143a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m43a(m143a, m143a2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m46a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f49a = new float[min];
        this.f50b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f49a[i2] = fArr[0];
            this.f50b[i2] = fArr[1];
        }
        if (Math.abs(this.f49a[0]) <= 1.0E-5d && Math.abs(this.f50b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f49a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f50b[i3] - 1.0f) <= 1.0E-5d) {
                int i4 = 0;
                float f = 0.0f;
                while (i < min) {
                    float[] fArr2 = this.f49a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f49a[0]);
        sb.append(",");
        sb.append(this.f50b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f49a[i6]);
        sb.append(",");
        sb.append(this.f50b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f49a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f49a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f49a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f50b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f50b;
        float f4 = fArr2[i];
        return f4 + (f3 * (fArr2[length] - f4));
    }
}
