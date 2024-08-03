package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p245h.p246a.C2350b;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p270n.C2621H;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2623J;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.j.c.a.c */
/* loaded from: classes.dex */
public class C2437c extends DefaultHandler implements C2583B.a<C2436b> {

    /* renamed from: a */
    private static final Pattern f9602a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b */
    private static final Pattern f9603b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c */
    private static final Pattern f9604c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d */
    private final String f9605d;

    /* renamed from: e */
    private final XmlPullParserFactory f9606e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.j.c.a.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C2676s f9607a;

        /* renamed from: b */
        public final String f9608b;

        /* renamed from: c */
        public final AbstractC2445k f9609c;

        /* renamed from: d */
        public final String f9610d;

        /* renamed from: e */
        public final ArrayList<C2213m.a> f9611e;

        /* renamed from: f */
        public final ArrayList<C2438d> f9612f;

        /* renamed from: g */
        public final long f9613g;

        public a(C2676s c2676s, String str, AbstractC2445k abstractC2445k, String str2, ArrayList<C2213m.a> arrayList, ArrayList<C2438d> arrayList2, long j) {
            this.f9607a = c2676s;
            this.f9608b = str;
            this.f9609c = abstractC2445k;
            this.f9610d = str2;
            this.f9611e = arrayList;
            this.f9612f = arrayList2;
            this.f9613g = j;
        }
    }

    public C2437c() {
        this(null);
    }

    public C2437c(String str) {
        this.f9605d = str;
        try {
            this.f9606e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* renamed from: a */
    protected static float m10041a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f9602a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    /* renamed from: a */
    private static int m10042a(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C2628e.m11113b(i == i2);
        return i;
    }

    /* renamed from: a */
    protected static int m10043a(List<C2438d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C2438d c2438d = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c2438d.f9614a) && (str = c2438d.f9615b) != null) {
                Matcher matcher = f9603b.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C2638o.m11160d("MpdParser", "Unable to parse CEA-608 channel number from: " + c2438d.f9615b);
            }
        }
        return -1;
    }

    /* renamed from: a */
    protected static int m10044a(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: a */
    protected static long m10045a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : C2622I.m11094g(attributeValue);
    }

    /* renamed from: a */
    protected static String m10046a(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return C2621H.m11031a(str, xmlPullParser.getText());
    }

    /* renamed from: a */
    private static void m10047a(ArrayList<C2213m.a> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2213m.a aVar = arrayList.get(size);
            if (!aVar.m9095a()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).m9097b(aVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10048a(XmlPullParser xmlPullParser) {
        if (C2623J.m11104b(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C2623J.m11104b(xmlPullParser)) {
                    i++;
                } else if (C2623J.m11102a(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m10049a(String str) {
        return C2641r.m11173h(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* renamed from: b */
    protected static int m10050b(List<C2438d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C2438d c2438d = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c2438d.f9614a) && (str = c2438d.f9615b) != null) {
                Matcher matcher = f9604c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C2638o.m11160d("MpdParser", "Unable to parse CEA-708 service block number from: " + c2438d.f9615b);
            }
        }
        return -1;
    }

    /* renamed from: b */
    protected static long m10051b(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : C2622I.m11096h(attributeValue);
    }

    /* renamed from: b */
    protected static C2438d m10052b(XmlPullParser xmlPullParser, String str) {
        String m10054b = m10054b(xmlPullParser, "schemeIdUri", "");
        String m10054b2 = m10054b(xmlPullParser, "value", (String) null);
        String m10054b3 = m10054b(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!C2623J.m11105c(xmlPullParser, str));
        return new C2438d(m10054b, m10054b2, m10054b3);
    }

    /* renamed from: b */
    private static String m10053b(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C2628e.m11113b(str.equals(str2));
        return str;
    }

    /* renamed from: b */
    protected static String m10054b(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: c */
    protected static long m10055c(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* renamed from: c */
    private static String m10056c(String str, String str2) {
        if (C2641r.m11172g(str)) {
            return C2641r.m11166a(str2);
        }
        if (C2641r.m11174i(str)) {
            return C2641r.m11171f(str2);
        }
        if (m10049a(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (str2 != null) {
                if (str2.startsWith("stpp")) {
                    return "application/ttml+xml";
                }
                if (str2.startsWith("wvtt")) {
                    return "application/x-mp4-vtt";
                }
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    /* renamed from: c */
    protected static String m10057c(List<C2438d> list) {
        for (int i = 0; i < list.size(); i++) {
            C2438d c2438d = list.get(i);
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(c2438d.f9614a) && "ec+3".equals(c2438d.f9615b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    protected static int m10058f(XmlPullParser xmlPullParser) {
        char c2;
        String m11098j = C2622I.m11098j(xmlPullParser.getAttributeValue(null, "value"));
        if (m11098j == null) {
            return -1;
        }
        switch (m11098j.hashCode()) {
            case 1596796:
                if (m11098j.equals("4000")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2937391:
                if (m11098j.equals("a000")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3094035:
                if (m11098j.equals("f801")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3133436:
                if (m11098j.equals("fa01")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 1;
        }
        if (c2 == 1) {
            return 2;
        }
        if (c2 != 2) {
            return c2 != 3 ? -1 : 8;
        }
        return 6;
    }

    /* renamed from: a */
    protected int m10059a(C2676s c2676s) {
        String str = c2676s.f11182g;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (C2641r.m11174i(str)) {
            return 2;
        }
        if (C2641r.m11172g(str)) {
            return 1;
        }
        return m10049a(str) ? 3 : -1;
    }

    /* renamed from: a */
    protected C2350b m10060a(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        return new C2350b(str, str2, j2, j, bArr, j3);
    }

    /* renamed from: a */
    protected C2350b m10061a(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        long m10055c = m10055c(xmlPullParser, "id", 0L);
        long m10055c2 = m10055c(xmlPullParser, "duration", -9223372036854775807L);
        long m10055c3 = m10055c(xmlPullParser, "presentationTime", 0L);
        long m11085c = C2622I.m11085c(m10055c2, 1000L, j);
        long m11085c2 = C2622I.m11085c(m10055c3, 1000000L, j);
        String m10054b = m10054b(xmlPullParser, "messageData", (String) null);
        byte[] m10082a = m10082a(xmlPullParser, byteArrayOutputStream);
        if (m10054b != null) {
            m10082a = C2622I.m11086c(m10054b);
        }
        return m10060a(str, str2, m10055c, m11085c, m10082a, m11085c2);
    }

    /* renamed from: a */
    protected C2435a m10062a(int i, int i2, List<AbstractC2444j> list, List<C2438d> list2, List<C2438d> list3) {
        return new C2435a(i, i2, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* renamed from: a */
    protected C2435a m10063a(XmlPullParser xmlPullParser, String str, AbstractC2445k abstractC2445k) {
        int i;
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<C2213m.a> arrayList4;
        String str4;
        String str5;
        XmlPullParser xmlPullParser2;
        ArrayList<C2438d> arrayList5;
        AbstractC2445k m10075a;
        int i2;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        int m10044a = m10044a(xmlPullParser3, "id", -1);
        int m10088e = m10088e(xmlPullParser);
        String str6 = null;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        int m10044a2 = m10044a(xmlPullParser3, "width", -1);
        int m10044a3 = m10044a(xmlPullParser3, "height", -1);
        float m10041a = m10041a(xmlPullParser3, -1.0f);
        int m10044a4 = m10044a(xmlPullParser3, "audioSamplingRate", -1);
        String str7 = "lang";
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "label");
        ArrayList arrayList6 = new ArrayList();
        ArrayList<C2438d> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str8 = str;
        AbstractC2445k abstractC2445k2 = abstractC2445k;
        int i3 = m10088e;
        String str9 = attributeValue3;
        String str10 = null;
        boolean z = false;
        int i4 = 0;
        int i5 = -1;
        ?? r11 = arrayList6;
        while (true) {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser3, "BaseURL")) {
                if (!z) {
                    str3 = m10046a(xmlPullParser3, str8);
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = r11;
                    str4 = str7;
                    str5 = str6;
                    xmlPullParser2 = xmlPullParser3;
                    z = true;
                    i2 = i3;
                }
                i = i3;
                str2 = str9;
                str3 = str8;
                arrayList = arrayList10;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                arrayList5 = arrayList7;
                arrayList4 = r11;
                str4 = str7;
                str5 = str6;
                xmlPullParser2 = xmlPullParser3;
                i2 = i;
                str9 = str2;
            } else {
                if (C2623J.m11106d(xmlPullParser3, "ContentProtection")) {
                    Pair<String, C2213m.a> m10086d = m10086d(xmlPullParser);
                    Object obj = m10086d.first;
                    if (obj != null) {
                        str10 = (String) obj;
                    }
                    Object obj2 = m10086d.second;
                    if (obj2 != null) {
                        r11.add(obj2);
                    }
                } else if (C2623J.m11106d(xmlPullParser3, "ContentComponent")) {
                    str9 = m10053b(str9, xmlPullParser3.getAttributeValue(str6, str7));
                    str3 = str8;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = r11;
                    str4 = str7;
                    str5 = str6;
                    xmlPullParser2 = xmlPullParser3;
                    i2 = m10042a(i3, m10088e(xmlPullParser));
                } else if (C2623J.m11106d(xmlPullParser3, "Role")) {
                    i4 |= m10092j(xmlPullParser);
                } else if (C2623J.m11106d(xmlPullParser3, "AudioChannelConfiguration")) {
                    i5 = m10084c(xmlPullParser);
                } else {
                    if (C2623J.m11106d(xmlPullParser3, "Accessibility")) {
                        arrayList8.add(m10052b(xmlPullParser3, "Accessibility"));
                    } else if (C2623J.m11106d(xmlPullParser3, "SupplementalProperty")) {
                        arrayList9.add(m10052b(xmlPullParser3, "SupplementalProperty"));
                    } else if (C2623J.m11106d(xmlPullParser3, "Representation")) {
                        String str11 = str9;
                        str3 = str8;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        arrayList4 = r11;
                        str4 = str7;
                        str5 = str6;
                        a m10066a = m10066a(xmlPullParser, str8, attributeValue4, attributeValue, attributeValue2, m10044a2, m10044a3, m10041a, i5, m10044a4, str11, i4, arrayList3, abstractC2445k2);
                        int m10042a = m10042a(i3, m10059a(m10066a.f9607a));
                        arrayList = arrayList10;
                        arrayList.add(m10066a);
                        i2 = m10042a;
                        str9 = str11;
                        arrayList5 = arrayList7;
                        xmlPullParser2 = xmlPullParser;
                    } else {
                        i = i3;
                        str2 = str9;
                        str3 = str8;
                        arrayList = arrayList10;
                        arrayList2 = arrayList9;
                        arrayList3 = arrayList8;
                        ArrayList<C2438d> arrayList11 = arrayList7;
                        arrayList4 = r11;
                        str4 = str7;
                        str5 = str6;
                        xmlPullParser2 = xmlPullParser;
                        if (C2623J.m11106d(xmlPullParser2, "SegmentBase")) {
                            m10075a = m10078a(xmlPullParser2, (AbstractC2445k.e) abstractC2445k2);
                        } else if (C2623J.m11106d(xmlPullParser2, "SegmentList")) {
                            m10075a = m10073a(xmlPullParser2, (AbstractC2445k.b) abstractC2445k2);
                        } else if (C2623J.m11106d(xmlPullParser2, "SegmentTemplate")) {
                            m10075a = m10075a(xmlPullParser2, (AbstractC2445k.c) abstractC2445k2);
                        } else {
                            if (C2623J.m11106d(xmlPullParser2, "InbandEventStream")) {
                                arrayList5 = arrayList11;
                                arrayList5.add(m10052b(xmlPullParser2, "InbandEventStream"));
                            } else {
                                arrayList5 = arrayList11;
                                if (C2623J.m11104b(xmlPullParser)) {
                                    m10083b(xmlPullParser);
                                }
                            }
                            i2 = i;
                            str9 = str2;
                        }
                        abstractC2445k2 = m10075a;
                        i2 = i;
                        str9 = str2;
                        arrayList5 = arrayList11;
                    }
                    i = i3;
                    str2 = str9;
                    str3 = str8;
                    arrayList = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList8;
                    arrayList5 = arrayList7;
                    arrayList4 = r11;
                    str4 = str7;
                    str5 = str6;
                    xmlPullParser2 = xmlPullParser3;
                    i2 = i;
                    str9 = str2;
                }
                str3 = str8;
                arrayList = arrayList10;
                arrayList2 = arrayList9;
                arrayList3 = arrayList8;
                arrayList5 = arrayList7;
                arrayList4 = r11;
                str4 = str7;
                str5 = str6;
                xmlPullParser2 = xmlPullParser3;
                i2 = i3;
            }
            if (C2623J.m11105c(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            xmlPullParser3 = xmlPullParser2;
            arrayList7 = arrayList5;
            i3 = i2;
            arrayList9 = arrayList2;
            arrayList8 = arrayList3;
            r11 = arrayList4;
            str7 = str4;
            str6 = str5;
            arrayList10 = arrayList;
            str8 = str3;
        }
        ArrayList arrayList12 = new ArrayList(arrayList.size());
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            arrayList12.add(m10071a((a) arrayList.get(i6), this.f9605d, str10, arrayList4, arrayList5));
        }
        return m10062a(m10044a, i2, arrayList12, arrayList3, arrayList2);
    }

    /* renamed from: a */
    protected C2436b m10064a(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C2441g c2441g, C2448n c2448n, Uri uri, List<C2440f> list) {
        return new C2436b(j, j2, j3, z, j4, j5, j6, j7, c2441g, c2448n, uri, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p225c.p226a.p227a.p269m.C2583B.a
    /* renamed from: a */
    public C2436b mo10065a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f9606e.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m10085c(newPullParser, uri.toString());
            }
            throw new C2683z("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            throw new C2683z(e2);
        }
    }

    /* renamed from: a */
    protected a m10066a(XmlPullParser xmlPullParser, String str, String str2, String str3, String str4, int i, int i2, float f, int i3, int i4, String str5, int i5, List<C2438d> list, AbstractC2445k abstractC2445k) {
        String str6;
        String str7;
        int m10084c;
        String str8;
        String str9;
        AbstractC2445k abstractC2445k2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int m10044a = m10044a(xmlPullParser, "bandwidth", -1);
        String m10054b = m10054b(xmlPullParser, "mimeType", str3);
        String m10054b2 = m10054b(xmlPullParser, "codecs", str4);
        int m10044a2 = m10044a(xmlPullParser, "width", i);
        int m10044a3 = m10044a(xmlPullParser, "height", i2);
        float m10041a = m10041a(xmlPullParser, f);
        int m10044a4 = m10044a(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        int i6 = i3;
        AbstractC2445k abstractC2445k3 = abstractC2445k;
        String str10 = null;
        String str11 = str;
        while (true) {
            xmlPullParser.next();
            str6 = m10054b2;
            if (C2623J.m11106d(xmlPullParser, "BaseURL")) {
                if (z) {
                    str7 = str11;
                    m10084c = i6;
                    str9 = str10;
                    str8 = str7;
                } else {
                    str11 = m10046a(xmlPullParser, str11);
                    z = true;
                    m10084c = i6;
                    str9 = str10;
                    str8 = str11;
                }
            } else if (C2623J.m11106d(xmlPullParser, "AudioChannelConfiguration")) {
                m10084c = m10084c(xmlPullParser);
                str8 = str11;
                str9 = str10;
            } else {
                if (C2623J.m11106d(xmlPullParser, "SegmentBase")) {
                    abstractC2445k3 = m10078a(xmlPullParser, (AbstractC2445k.e) abstractC2445k3);
                } else if (C2623J.m11106d(xmlPullParser, "SegmentList")) {
                    abstractC2445k3 = m10073a(xmlPullParser, (AbstractC2445k.b) abstractC2445k3);
                } else if (C2623J.m11106d(xmlPullParser, "SegmentTemplate")) {
                    abstractC2445k3 = m10075a(xmlPullParser, (AbstractC2445k.c) abstractC2445k3);
                } else {
                    if (C2623J.m11106d(xmlPullParser, "ContentProtection")) {
                        Pair<String, C2213m.a> m10086d = m10086d(xmlPullParser);
                        str7 = str11;
                        Object obj = m10086d.first;
                        if (obj != null) {
                            str10 = (String) obj;
                        }
                        Object obj2 = m10086d.second;
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    } else {
                        str7 = str11;
                        if (C2623J.m11106d(xmlPullParser, "InbandEventStream")) {
                            arrayList2.add(m10052b(xmlPullParser, "InbandEventStream"));
                        } else if (C2623J.m11106d(xmlPullParser, "SupplementalProperty")) {
                            arrayList3.add(m10052b(xmlPullParser, "SupplementalProperty"));
                        } else {
                            m10048a(xmlPullParser);
                        }
                    }
                    m10084c = i6;
                    str9 = str10;
                    str8 = str7;
                }
                m10084c = i6;
                str9 = str10;
                str8 = str11;
            }
            abstractC2445k2 = abstractC2445k3;
            if (C2623J.m11105c(xmlPullParser, "Representation")) {
                break;
            }
            str11 = str8;
            abstractC2445k3 = abstractC2445k2;
            str10 = str9;
            i6 = m10084c;
            m10054b2 = str6;
        }
        return new a(m10081a(attributeValue, str2, m10054b, m10044a2, m10044a3, m10041a, m10084c, m10044a4, m10044a, str5, i5, list, str6, arrayList3), str8, abstractC2445k2 != null ? abstractC2445k2 : new AbstractC2445k.e(), str9, arrayList, arrayList2, -1L);
    }

    /* renamed from: a */
    protected C2439e m10067a(String str, String str2, long j, long[] jArr, C2350b[] c2350bArr) {
        return new C2439e(str, str2, j, jArr, c2350bArr);
    }

    /* renamed from: a */
    protected C2440f m10068a(String str, long j, List<C2435a> list, List<C2439e> list2) {
        return new C2440f(str, j, list, list2);
    }

    /* renamed from: a */
    protected C2442h m10069a(String str, long j, long j2) {
        return new C2442h(str, j, j2);
    }

    /* renamed from: a */
    protected C2442h m10070a(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return m10069a(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return m10069a(attributeValue, j, j2);
    }

    /* renamed from: a */
    protected AbstractC2444j m10071a(a aVar, String str, String str2, ArrayList<C2213m.a> arrayList, ArrayList<C2438d> arrayList2) {
        C2676s c2676s = aVar.f9607a;
        String str3 = aVar.f9610d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C2213m.a> arrayList3 = aVar.f9611e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m10047a(arrayList3);
            c2676s = c2676s.m11440a(new C2213m(str2, arrayList3));
        }
        ArrayList<C2438d> arrayList4 = aVar.f9612f;
        arrayList4.addAll(arrayList2);
        return AbstractC2444j.m10101a(str, aVar.f9613g, c2676s, aVar.f9608b, aVar.f9609c, arrayList4);
    }

    /* renamed from: a */
    protected AbstractC2445k.b m10072a(C2442h c2442h, long j, long j2, long j3, long j4, List<AbstractC2445k.d> list, List<C2442h> list2) {
        return new AbstractC2445k.b(c2442h, j, j2, j3, j4, list, list2);
    }

    /* renamed from: a */
    protected AbstractC2445k.b m10073a(XmlPullParser xmlPullParser, AbstractC2445k.b bVar) {
        long m10055c = m10055c(xmlPullParser, "timescale", bVar != null ? bVar.f9649b : 1L);
        long m10055c2 = m10055c(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f9650c : 0L);
        long m10055c3 = m10055c(xmlPullParser, "duration", bVar != null ? bVar.f9652e : -9223372036854775807L);
        long m10055c4 = m10055c(xmlPullParser, "startNumber", bVar != null ? bVar.f9651d : 1L);
        List<C2442h> list = null;
        C2442h c2442h = null;
        List<AbstractC2445k.d> list2 = null;
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "Initialization")) {
                c2442h = m10090h(xmlPullParser);
            } else if (C2623J.m11106d(xmlPullParser, "SegmentTimeline")) {
                list2 = m10093k(xmlPullParser);
            } else if (C2623J.m11106d(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(m10094l(xmlPullParser));
            } else {
                m10048a(xmlPullParser);
            }
        } while (!C2623J.m11105c(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (c2442h == null) {
                c2442h = bVar.f9648a;
            }
            if (list2 == null) {
                list2 = bVar.f9653f;
            }
            if (list == null) {
                list = bVar.f9654g;
            }
        }
        return m10072a(c2442h, m10055c, m10055c2, m10055c4, m10055c3, list2, list);
    }

    /* renamed from: a */
    protected AbstractC2445k.c m10074a(C2442h c2442h, long j, long j2, long j3, long j4, List<AbstractC2445k.d> list, C2447m c2447m, C2447m c2447m2) {
        return new AbstractC2445k.c(c2442h, j, j2, j3, j4, list, c2447m, c2447m2);
    }

    /* renamed from: a */
    protected AbstractC2445k.c m10075a(XmlPullParser xmlPullParser, AbstractC2445k.c cVar) {
        long m10055c = m10055c(xmlPullParser, "timescale", cVar != null ? cVar.f9649b : 1L);
        long m10055c2 = m10055c(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f9650c : 0L);
        long m10055c3 = m10055c(xmlPullParser, "duration", cVar != null ? cVar.f9652e : -9223372036854775807L);
        long m10055c4 = m10055c(xmlPullParser, "startNumber", cVar != null ? cVar.f9651d : 1L);
        C2442h c2442h = null;
        C2447m m10079a = m10079a(xmlPullParser, "media", cVar != null ? cVar.f9656h : null);
        C2447m m10079a2 = m10079a(xmlPullParser, "initialization", cVar != null ? cVar.f9655g : null);
        List<AbstractC2445k.d> list = null;
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "Initialization")) {
                c2442h = m10090h(xmlPullParser);
            } else if (C2623J.m11106d(xmlPullParser, "SegmentTimeline")) {
                list = m10093k(xmlPullParser);
            } else {
                m10048a(xmlPullParser);
            }
        } while (!C2623J.m11105c(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (c2442h == null) {
                c2442h = cVar.f9648a;
            }
            if (list == null) {
                list = cVar.f9653f;
            }
        }
        return m10074a(c2442h, m10055c, m10055c2, m10055c4, m10055c3, list, m10079a2, m10079a);
    }

    /* renamed from: a */
    protected AbstractC2445k.d m10076a(long j, long j2) {
        return new AbstractC2445k.d(j, j2);
    }

    /* renamed from: a */
    protected AbstractC2445k.e m10077a(C2442h c2442h, long j, long j2, long j3, long j4) {
        return new AbstractC2445k.e(c2442h, j, j2, j3, j4);
    }

    /* renamed from: a */
    protected AbstractC2445k.e m10078a(XmlPullParser xmlPullParser, AbstractC2445k.e eVar) {
        long j;
        long j2;
        long m10055c = m10055c(xmlPullParser, "timescale", eVar != null ? eVar.f9649b : 1L);
        long m10055c2 = m10055c(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f9650c : 0L);
        long j3 = eVar != null ? eVar.f9659d : 0L;
        long j4 = eVar != null ? eVar.f9660e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j4;
            j2 = j3;
        }
        C2442h c2442h = eVar != null ? eVar.f9648a : null;
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "Initialization")) {
                c2442h = m10090h(xmlPullParser);
            } else {
                m10048a(xmlPullParser);
            }
        } while (!C2623J.m11105c(xmlPullParser, "SegmentBase"));
        return m10077a(c2442h, m10055c, m10055c2, j2, j);
    }

    /* renamed from: a */
    protected C2447m m10079a(XmlPullParser xmlPullParser, String str, C2447m c2447m) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C2447m.m10125a(attributeValue) : c2447m;
    }

    /* renamed from: a */
    protected C2448n m10080a(String str, String str2) {
        return new C2448n(str, str2);
    }

    /* renamed from: a */
    protected C2676s m10081a(String str, String str2, String str3, int i, int i2, float f, int i3, int i4, int i5, String str4, int i6, List<C2438d> list, String str5, List<C2438d> list2) {
        String str6;
        int i7;
        int m10050b;
        String m10056c = m10056c(str3, str5);
        if (m10056c != null) {
            if ("audio/eac3".equals(m10056c)) {
                m10056c = m10057c(list2);
            }
            str6 = m10056c;
            if (C2641r.m11174i(str6)) {
                return C2676s.m11431a(str, str2, str3, str6, str5, i5, i, i2, f, (List<byte[]>) null, i6);
            }
            if (C2641r.m11172g(str6)) {
                return C2676s.m11432a(str, str2, str3, str6, str5, i5, i3, i4, (List<byte[]>) null, i6, str4);
            }
            if (m10049a(str6)) {
                if ("application/cea-608".equals(str6)) {
                    m10050b = m10043a(list);
                } else {
                    if (!"application/cea-708".equals(str6)) {
                        i7 = -1;
                        return C2676s.m11434a(str, str2, str3, str6, str5, i5, i6, str4, i7);
                    }
                    m10050b = m10050b(list);
                }
                i7 = m10050b;
                return C2676s.m11434a(str, str2, str3, str6, str5, i5, i6, str4, i7);
            }
        } else {
            str6 = m10056c;
        }
        return C2676s.m11433a(str, str2, str3, str6, str5, i5, i6, str4);
    }

    /* renamed from: a */
    protected byte[] m10082a(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, "UTF-8");
        while (true) {
            xmlPullParser.nextToken();
            if (C2623J.m11105c(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, false);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    /* renamed from: b */
    protected void m10083b(XmlPullParser xmlPullParser) {
        m10048a(xmlPullParser);
    }

    /* renamed from: c */
    protected int m10084c(XmlPullParser xmlPullParser) {
        String m10054b = m10054b(xmlPullParser, "schemeIdUri", (String) null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(m10054b)) {
            i = m10044a(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(m10054b)) {
            i = m10058f(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!C2623J.m11105c(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2436b m10085c(org.xmlpull.v1.XmlPullParser r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2437c.m10085c(org.xmlpull.v1.XmlPullParser, java.lang.String):d.c.a.a.j.c.a.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013f A[LOOP:0: B:19:0x009d->B:26:0x013f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012e A[EDGE_INSN: B:27:0x012e->B:28:0x012e BREAK  A[LOOP:0: B:19:0x009d->B:26:0x013f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r5v17, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, p139d.p225c.p226a.p227a.p231d.C2213m.a> m10086d(org.xmlpull.v1.XmlPullParser r17) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2437c.m10086d(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: d */
    protected Pair<C2440f, Long> m10087d(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long m10051b = m10051b(xmlPullParser, "start", j);
        long m10051b2 = m10051b(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        AbstractC2445k abstractC2445k = null;
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "BaseURL")) {
                if (!z) {
                    str = m10046a(xmlPullParser, str);
                    z = true;
                }
            } else if (C2623J.m11106d(xmlPullParser, "AdaptationSet")) {
                arrayList.add(m10063a(xmlPullParser, str, abstractC2445k));
            } else if (C2623J.m11106d(xmlPullParser, "EventStream")) {
                arrayList2.add(m10089g(xmlPullParser));
            } else if (C2623J.m11106d(xmlPullParser, "SegmentBase")) {
                abstractC2445k = m10078a(xmlPullParser, (AbstractC2445k.e) null);
            } else if (C2623J.m11106d(xmlPullParser, "SegmentList")) {
                abstractC2445k = m10073a(xmlPullParser, (AbstractC2445k.b) null);
            } else if (C2623J.m11106d(xmlPullParser, "SegmentTemplate")) {
                abstractC2445k = m10075a(xmlPullParser, (AbstractC2445k.c) null);
            } else {
                m10048a(xmlPullParser);
            }
        } while (!C2623J.m11105c(xmlPullParser, "Period"));
        return Pair.create(m10068a(attributeValue, m10051b, arrayList, arrayList2), Long.valueOf(m10051b2));
    }

    /* renamed from: e */
    protected int m10088e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    /* renamed from: g */
    protected C2439e m10089g(XmlPullParser xmlPullParser) {
        String m10054b = m10054b(xmlPullParser, "schemeIdUri", "");
        String m10054b2 = m10054b(xmlPullParser, "value", "");
        long m10055c = m10055c(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "Event")) {
                arrayList.add(m10061a(xmlPullParser, m10054b, m10054b2, m10055c, byteArrayOutputStream));
            } else {
                m10048a(xmlPullParser);
            }
        } while (!C2623J.m11105c(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        C2350b[] c2350bArr = new C2350b[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            C2350b c2350b = (C2350b) arrayList.get(i);
            jArr[i] = c2350b.f9273d;
            c2350bArr[i] = c2350b;
        }
        return m10067a(m10054b, m10054b2, m10055c, jArr, c2350bArr);
    }

    /* renamed from: h */
    protected C2442h m10090h(XmlPullParser xmlPullParser) {
        return m10070a(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: i */
    protected C2441g m10091i(XmlPullParser xmlPullParser) {
        String str = null;
        String m10054b = m10054b(xmlPullParser, "moreInformationURL", (String) null);
        String m10054b2 = m10054b(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C2623J.m11106d(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C2623J.m11106d(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m10048a(xmlPullParser);
            }
            String str4 = str3;
            if (C2623J.m11105c(xmlPullParser, "ProgramInformation")) {
                return new C2441g(str, str2, str4, m10054b, m10054b2);
            }
            str3 = str4;
        }
    }

    /* renamed from: j */
    protected int m10092j(XmlPullParser xmlPullParser) {
        String m10054b = m10054b(xmlPullParser, "schemeIdUri", (String) null);
        String m10054b2 = m10054b(xmlPullParser, "value", (String) null);
        do {
            xmlPullParser.next();
        } while (!C2623J.m11105c(xmlPullParser, "Role"));
        return ("urn:mpeg:dash:role:2011".equals(m10054b) && "main".equals(m10054b2)) ? 1 : 0;
    }

    /* renamed from: k */
    protected List<AbstractC2445k.d> m10093k(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "S")) {
                j = m10055c(xmlPullParser, "t", j);
                long m10055c = m10055c(xmlPullParser, "d", -9223372036854775807L);
                int m10044a = m10044a(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < m10044a; i++) {
                    arrayList.add(m10076a(j, m10055c));
                    j += m10055c;
                }
            } else {
                m10048a(xmlPullParser);
            }
        } while (!C2623J.m11105c(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* renamed from: l */
    protected C2442h m10094l(XmlPullParser xmlPullParser) {
        return m10070a(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: m */
    protected C2448n m10095m(XmlPullParser xmlPullParser) {
        return m10080a(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }
}
