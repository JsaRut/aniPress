package p000a.p005b.p009c.p010a.p011a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p006a.C0010c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.c.a.a.d */
/* loaded from: classes.dex */
public final class C0026d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.c.a.a.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int[] f136a;

        /* renamed from: b */
        final float[] f137b;

        a(int i, int i2) {
            this.f136a = new int[]{i, i2};
            this.f137b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f136a = new int[]{i, i2, i3};
            this.f137b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f136a = new int[size];
            this.f137b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f136a[i] = list.get(i).intValue();
                this.f137b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static a m128a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    /* renamed from: a */
    private static Shader.TileMode m129a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Shader m130a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0010c.GradientColor);
        float m143a = C0031i.m143a(m146a, xmlPullParser, "startX", C0010c.GradientColor_android_startX, 0.0f);
        float m143a2 = C0031i.m143a(m146a, xmlPullParser, "startY", C0010c.GradientColor_android_startY, 0.0f);
        float m143a3 = C0031i.m143a(m146a, xmlPullParser, "endX", C0010c.GradientColor_android_endX, 0.0f);
        float m143a4 = C0031i.m143a(m146a, xmlPullParser, "endY", C0010c.GradientColor_android_endY, 0.0f);
        float m143a5 = C0031i.m143a(m146a, xmlPullParser, "centerX", C0010c.GradientColor_android_centerX, 0.0f);
        float m143a6 = C0031i.m143a(m146a, xmlPullParser, "centerY", C0010c.GradientColor_android_centerY, 0.0f);
        int m150b = C0031i.m150b(m146a, xmlPullParser, "type", C0010c.GradientColor_android_type, 0);
        int m144a = C0031i.m144a(m146a, xmlPullParser, "startColor", C0010c.GradientColor_android_startColor, 0);
        boolean m149a = C0031i.m149a(xmlPullParser, "centerColor");
        int m144a2 = C0031i.m144a(m146a, xmlPullParser, "centerColor", C0010c.GradientColor_android_centerColor, 0);
        int m144a3 = C0031i.m144a(m146a, xmlPullParser, "endColor", C0010c.GradientColor_android_endColor, 0);
        int m150b2 = C0031i.m150b(m146a, xmlPullParser, "tileMode", C0010c.GradientColor_android_tileMode, 0);
        float m143a7 = C0031i.m143a(m146a, xmlPullParser, "gradientRadius", C0010c.GradientColor_android_gradientRadius, 0.0f);
        m146a.recycle();
        a m128a = m128a(m131b(resources, xmlPullParser, attributeSet, theme), m144a, m144a3, m149a, m144a2);
        if (m150b != 1) {
            return m150b != 2 ? new LinearGradient(m143a, m143a2, m143a3, m143a4, m128a.f136a, m128a.f137b, m129a(m150b2)) : new SweepGradient(m143a5, m143a6, m128a.f136a, m128a.f137b);
        }
        if (m143a7 > 0.0f) {
            return new RadialGradient(m143a5, m143a6, m143a7, m128a.f136a, m128a.f137b, m129a(m150b2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p000a.p005b.p009c.p010a.p011a.C0026d.a m131b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L8a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L8a
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p000a.p005b.p006a.C0010c.GradientColorItem
            android.content.res.TypedArray r3 = p000a.p005b.p009c.p010a.p011a.C0031i.m146a(r8, r11, r10, r3)
            int r5 = p000a.p005b.p006a.C0010c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p000a.p005b.p006a.C0010c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = p000a.p005b.p006a.C0010c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p000a.p005b.p006a.C0010c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r10.append(r9)
            java.lang.String r9 = "attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L8a:
            int r8 = r4.size()
            if (r8 <= 0) goto L96
            a.b.c.a.a.d$a r8 = new a.b.c.a.a.d$a
            r8.<init>(r4, r2)
            return r8
        L96:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p010a.p011a.C0026d.m131b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.b.c.a.a.d$a");
    }
}
