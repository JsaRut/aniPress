package p000a.p005b.p009c.p010a.p011a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p006a.C0010c;
import p000a.p005b.p009c.p017f.C0053a;

/* renamed from: a.b.c.a.a.c */
/* loaded from: classes.dex */
public class C0025c {

    /* renamed from: a.b.c.a.a.c$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: a.b.c.a.a.c$b */
    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final c[] f126a;

        public b(c[] cVarArr) {
            this.f126a = cVarArr;
        }

        /* renamed from: a */
        public c[] m118a() {
            return this.f126a;
        }
    }

    /* renamed from: a.b.c.a.a.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final String f127a;

        /* renamed from: b */
        private int f128b;

        /* renamed from: c */
        private boolean f129c;

        /* renamed from: d */
        private String f130d;

        /* renamed from: e */
        private int f131e;

        /* renamed from: f */
        private int f132f;

        public c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f127a = str;
            this.f128b = i;
            this.f129c = z;
            this.f130d = str2;
            this.f131e = i2;
            this.f132f = i3;
        }

        /* renamed from: a */
        public String m119a() {
            return this.f127a;
        }

        /* renamed from: b */
        public int m120b() {
            return this.f132f;
        }

        /* renamed from: c */
        public int m121c() {
            return this.f131e;
        }

        /* renamed from: d */
        public String m122d() {
            return this.f130d;
        }

        /* renamed from: e */
        public int m123e() {
            return this.f128b;
        }

        /* renamed from: f */
        public boolean m124f() {
            return this.f129c;
        }
    }

    /* renamed from: a.b.c.a.a.c$d */
    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final C0053a f133a;

        /* renamed from: b */
        private final int f134b;

        /* renamed from: c */
        private final int f135c;

        public d(C0053a c0053a, int i, int i2) {
            this.f133a = c0053a;
            this.f135c = i;
            this.f134b = i2;
        }

        /* renamed from: a */
        public int m125a() {
            return this.f135c;
        }

        /* renamed from: b */
        public C0053a m126b() {
            return this.f133a;
        }

        /* renamed from: c */
        public int m127c() {
            return this.f134b;
        }
    }

    /* renamed from: a */
    private static int m110a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static a m111a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m115b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static List<List<byte[]>> m112a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m110a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m113a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m113a(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m113a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m114a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static a m115b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m116c(xmlPullParser, resources);
        }
        m114a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static a m116c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0010c.FontFamily);
        String string = obtainAttributes.getString(C0010c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0010c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0010c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0010c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0010c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0010c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m114a(xmlPullParser);
            }
            return new d(new C0053a(string, string2, string3, m112a(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m117d(xmlPullParser, resources));
                } else {
                    m114a(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    /* renamed from: d */
    private static c m117d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0010c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0010c.FontFamilyFont_fontWeight) ? C0010c.FontFamilyFont_fontWeight : C0010c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0010c.FontFamilyFont_fontStyle) ? C0010c.FontFamilyFont_fontStyle : C0010c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0010c.FontFamilyFont_ttcIndex) ? C0010c.FontFamilyFont_ttcIndex : C0010c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0010c.FontFamilyFont_fontVariationSettings) ? C0010c.FontFamilyFont_fontVariationSettings : C0010c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0010c.FontFamilyFont_font) ? C0010c.FontFamilyFont_font : C0010c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m114a(xmlPullParser);
        }
        return new c(string2, i, z, string, i3, resourceId);
    }
}
