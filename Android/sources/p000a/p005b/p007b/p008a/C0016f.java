package p000a.p005b.p007b.p008a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p009c.p010a.p011a.C0031i;
import p000a.p005b.p009c.p012b.C0036b;

/* renamed from: a.b.b.a.f */
/* loaded from: classes.dex */
public class C0016f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.b.a.f$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0036b.b[]> {

        /* renamed from: a */
        private C0036b.b[] f47a;

        a() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0036b.b[] evaluate(float f, C0036b.b[] bVarArr, C0036b.b[] bVarArr2) {
            if (!C0036b.m177a(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            C0036b.b[] bVarArr3 = this.f47a;
            if (bVarArr3 == null || !C0036b.m177a(bVarArr3, bVarArr)) {
                this.f47a = C0036b.m180a(bVarArr);
            }
            for (int i = 0; i < bVarArr.length; i++) {
                this.f47a[i].m188a(bVarArr[i], bVarArr2[i], f);
            }
            return this.f47a;
        }
    }

    /* renamed from: a */
    private static int m22a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f31j);
        int i = 0;
        TypedValue m151b = C0031i.m151b(m146a, xmlPullParser, "value", 0);
        if ((m151b != null) && m39a(m151b.type)) {
            i = 3;
        }
        m146a.recycle();
        return i;
    }

    /* renamed from: a */
    private static int m23a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m39a(i3)) || (z2 && m39a(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: a */
    public static Animator m24a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m25a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    public static Animator m25a(Context context, Resources resources, Resources.Theme theme, int i) {
        return m26a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m26a(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m27a(context, resources, theme, xmlResourceParser, f);
                } catch (IOException e2) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e2);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: a */
    private static Animator m27a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m28a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m28a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p007b.p008a.C0016f.m28a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m29a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static Keyframe m30a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f31j);
        float m143a = C0031i.m143a(m146a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m151b = C0031i.m151b(m146a, xmlPullParser, "value", 0);
        boolean z = m151b != null;
        if (i == 4) {
            i = (z && m39a(m151b.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(m143a, C0031i.m150b(m146a, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m143a, C0031i.m143a(m146a, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(m143a) : Keyframe.ofInt(m143a);
        int m152c = C0031i.m152c(m146a, xmlPullParser, "interpolator", 1, 0);
        if (m152c > 0) {
            ofInt.setInterpolator(C0015e.m20a(context, m152c));
        }
        m146a.recycle();
        return ofInt;
    }

    /* renamed from: a */
    private static ObjectAnimator m31a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m34a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m32a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        int i2 = i;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = m22a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m30a = m30a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (m30a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m30a);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m29a(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m29a(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < 0.0f; i6++) {
                                i5 = i6;
                            }
                            m38a(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolder.setEvaluator(C0017g.m42a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m33a(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        Object[] objArr;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m39a(i4)) || (z2 && m39a(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C0017g m42a = i == 3 ? C0017g.m42a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m39a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m39a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m39a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null || m42a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m42a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0036b.b[] m179a = C0036b.m179a(string);
        C0036b.b[] m179a2 = C0036b.m179a(string2);
        if (m179a == null && m179a2 == null) {
            return null;
        }
        if (m179a == null) {
            if (m179a2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m179a2);
            }
            return null;
        }
        a aVar = new a();
        if (m179a2 == null) {
            objArr = new Object[]{m179a};
        } else {
            if (!C0036b.m177a(m179a, m179a2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            objArr = new Object[]{m179a, m179a2};
        }
        return PropertyValuesHolder.ofObject(str, aVar, objArr);
    }

    /* renamed from: a */
    private static ValueAnimator m34a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f28g);
        TypedArray m146a2 = C0031i.m146a(resources, theme, attributeSet, C0011a.f32k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m36a(valueAnimator, m146a, m146a2, f, xmlPullParser);
        int m152c = C0031i.m152c(m146a, xmlPullParser, "interpolator", 0, 0);
        if (m152c > 0) {
            valueAnimator.setInterpolator(C0015e.m20a(context, m152c));
        }
        m146a.recycle();
        if (m146a2 != null) {
            m146a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m35a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m147a = C0031i.m147a(typedArray, xmlPullParser, "pathData", 1);
        if (m147a == null) {
            objectAnimator.setPropertyName(C0031i.m147a(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m147a2 = C0031i.m147a(typedArray, xmlPullParser, "propertyXName", 2);
        String m147a3 = C0031i.m147a(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (m147a2 != null || m147a3 != null) {
            m37a(C0036b.m181b(m147a), objectAnimator, f * 0.5f, m147a2, m147a3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: a */
    private static void m36a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m150b = C0031i.m150b(typedArray, xmlPullParser, "duration", 1, 300);
        long m150b2 = C0031i.m150b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m150b3 = C0031i.m150b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0031i.m149a(xmlPullParser, "valueFrom") && C0031i.m149a(xmlPullParser, "valueTo")) {
            if (m150b3 == 4) {
                m150b3 = m23a(typedArray, 5, 6);
            }
            PropertyValuesHolder m33a = m33a(typedArray, m150b3, 5, 6, "");
            if (m33a != null) {
                valueAnimator.setValues(m33a);
            }
        }
        valueAnimator.setDuration(m150b);
        valueAnimator.setStartDelay(m150b2);
        valueAnimator.setRepeatCount(C0031i.m150b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0031i.m150b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m35a(valueAnimator, typedArray2, m150b3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m37a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / (min - 1);
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    /* renamed from: a */
    private static void m38a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m39a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m40a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m146a = C0031i.m146a(resources, theme, attributeSet, C0011a.f30i);
                String m147a = C0031i.m147a(m146a, xmlPullParser, "propertyName", 3);
                int m150b = C0031i.m150b(m146a, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m32a = m32a(context, resources, theme, xmlPullParser, m147a, m150b);
                if (m32a == null) {
                    m32a = m33a(m146a, m150b, 0, 1, m147a);
                }
                if (m32a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m32a);
                }
                m146a.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }
}
