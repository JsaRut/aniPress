package p139d.p225c.p226a.p227a.p270n;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: d.c.a.a.n.J */
/* loaded from: classes.dex */
public final class C2623J {
    /* renamed from: a */
    private static String m11100a(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }

    /* renamed from: a */
    public static String m11101a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m11102a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: b */
    public static String m11103b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m11100a(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m11104b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: c */
    public static boolean m11105c(XmlPullParser xmlPullParser, String str) {
        return m11102a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: d */
    public static boolean m11106d(XmlPullParser xmlPullParser, String str) {
        return m11104b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m11107e(XmlPullParser xmlPullParser, String str) {
        return m11104b(xmlPullParser) && m11100a(xmlPullParser.getName()).equals(str);
    }
}
