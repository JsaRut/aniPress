package p000a.p005b.p009c.p010a.p011a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.b.c.a.a.i */
/* loaded from: classes.dex */
public class C0031i {
    /* renamed from: a */
    public static float m143a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m149a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m144a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m149a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static C0024b m145a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m149a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0024b.m98a(typedValue.data);
            }
            C0024b m100a = C0024b.m100a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m100a != null) {
                return m100a;
            }
        }
        return C0024b.m98a(i2);
    }

    /* renamed from: a */
    public static TypedArray m146a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m147a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m149a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m148a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m149a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m149a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m150b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m149a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m151b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m149a(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    /* renamed from: c */
    public static int m152c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m149a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
