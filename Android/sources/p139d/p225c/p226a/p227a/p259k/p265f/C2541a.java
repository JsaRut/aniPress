package p139d.p225c.p226a.p227a.p259k.p265f;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2547g;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2623J;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.k.f.a */
/* loaded from: classes.dex */
public final class C2541a extends AbstractC2531c {

    /* renamed from: o */
    private static final Pattern f10491o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p */
    private static final Pattern f10492p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q */
    private static final Pattern f10493q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r */
    private static final Pattern f10494r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s */
    private static final Pattern f10495s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t */
    private static final Pattern f10496t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u */
    private static final b f10497u = new b(30.0f, 1, 1);

    /* renamed from: v */
    private static final a f10498v = new a(32, 15);

    /* renamed from: w */
    private final XmlPullParserFactory f10499w;

    /* renamed from: d.c.a.a.k.f.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final int f10500a;

        /* renamed from: b */
        final int f10501b;

        a(int i, int i2) {
            this.f10500a = i;
            this.f10501b = i2;
        }
    }

    /* renamed from: d.c.a.a.k.f.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final float f10502a;

        /* renamed from: b */
        final int f10503b;

        /* renamed from: c */
        final int f10504c;

        b(float f, int i, int i2) {
            this.f10502a = f;
            this.f10503b = i;
            this.f10504c = i2;
        }
    }

    /* renamed from: d.c.a.a.k.f.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final int f10505a;

        /* renamed from: b */
        final int f10506b;

        c(int i, int i2) {
            this.f10505a = i;
            this.f10506b = i2;
        }
    }

    public C2541a() {
        super("TtmlDecoder");
        try {
            this.f10499w = XmlPullParserFactory.newInstance();
            this.f10499w.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* renamed from: a */
    private static long m10651a(String str, b bVar) {
        char c2;
        double d2;
        double d3;
        Matcher matcher = f10491o.matcher(str);
        if (matcher.matches()) {
            double parseLong = Long.parseLong(matcher.group(1)) * 3600;
            double parseLong2 = Long.parseLong(matcher.group(2)) * 60;
            Double.isNaN(parseLong);
            Double.isNaN(parseLong2);
            double parseLong3 = Long.parseLong(matcher.group(3));
            Double.isNaN(parseLong3);
            double d4 = parseLong + parseLong2 + parseLong3;
            String group = matcher.group(4);
            double d5 = 0.0d;
            double parseDouble = d4 + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? ((float) Long.parseLong(r14)) / bVar.f10502a : 0.0d);
            String group2 = matcher.group(6);
            if (group2 != null) {
                double parseLong4 = Long.parseLong(group2);
                double d6 = bVar.f10503b;
                Double.isNaN(parseLong4);
                Double.isNaN(d6);
                double d7 = bVar.f10502a;
                Double.isNaN(d7);
                d5 = (parseLong4 / d6) / d7;
            }
            return (long) ((parseDouble + d5) * 1000000.0d);
        }
        Matcher matcher2 = f10492p.matcher(str);
        if (!matcher2.matches()) {
            throw new C2547g("Malformed time expression: " + str);
        }
        double parseDouble2 = Double.parseDouble(matcher2.group(1));
        String group3 = matcher2.group(2);
        int hashCode = group3.hashCode();
        if (hashCode == 102) {
            if (group3.equals("f")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode == 104) {
            if (group3.equals("h")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 109) {
            if (group3.equals("m")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3494) {
            if (group3.equals("ms")) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode != 115) {
            if (hashCode == 116 && group3.equals("t")) {
                c2 = 5;
            }
            c2 = 65535;
        } else {
            if (group3.equals("s")) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            d2 = 3600.0d;
        } else {
            if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 != 3) {
                        if (c2 == 4) {
                            d3 = bVar.f10502a;
                        } else if (c2 == 5) {
                            d3 = bVar.f10504c;
                        }
                        Double.isNaN(d3);
                    } else {
                        d3 = 1000.0d;
                    }
                    parseDouble2 /= d3;
                }
                return (long) (parseDouble2 * 1000000.0d);
            }
            d2 = 60.0d;
        }
        parseDouble2 *= d2;
        return (long) (parseDouble2 * 1000000.0d);
    }

    /* renamed from: a */
    private a m10652a(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f10496t.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt, parseInt2);
                }
                throw new C2547g("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        C2638o.m11160d("TtmlDecoder", sb.toString());
        return aVar;
    }

    /* renamed from: a */
    private b m10653a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (C2622I.m11073a(attributeValue2, " ").length != 2) {
                throw new C2547g("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        int i = f10497u.f10503b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f10497u.f10504c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f, i, i2);
    }

    /* renamed from: a */
    private C2542b m10654a(XmlPullParser xmlPullParser, C2542b c2542b, Map<String, C2543c> map, b bVar) {
        long j;
        long j2;
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        C2545e m10657a = m10657a(xmlPullParser, (C2545e) null);
        String str = null;
        String[] strArr = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            c2 = 65535;
            if (c2 == 0) {
                j3 = m10651a(attributeValue, bVar);
            } else if (c2 == 1) {
                j4 = m10651a(attributeValue, bVar);
            } else if (c2 == 2) {
                j5 = m10651a(attributeValue, bVar);
            } else if (c2 == 3) {
                String[] m10663b = m10663b(attributeValue);
                if (m10663b.length > 0) {
                    strArr = m10663b;
                }
            } else if (c2 != 4) {
                if (c2 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (c2542b != null) {
            long j6 = c2542b.f10510d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += c2542b.f10510d;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j5 + j7;
            } else if (c2542b != null) {
                long j8 = c2542b.f10511e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return C2542b.m10667a(xmlPullParser.getName(), j7, j2, m10657a, strArr, str2, str);
        }
        j2 = j4;
        return C2542b.m10667a(xmlPullParser.getName(), j7, j2, m10657a, strArr, str2, str);
    }

    /* renamed from: a */
    private C2543c m10655a(XmlPullParser xmlPullParser, a aVar, c cVar) {
        String str;
        StringBuilder sb;
        float parseFloat;
        float f;
        String str2;
        float parseFloat2;
        float f2;
        int i;
        String m11101a = C2623J.m11101a(xmlPullParser, "id");
        if (m11101a == null) {
            return null;
        }
        String m11101a2 = C2623J.m11101a(xmlPullParser, "origin");
        if (m11101a2 != null) {
            Matcher matcher = f10494r.matcher(m11101a2);
            Matcher matcher2 = f10495s.matcher(m11101a2);
            if (matcher.matches()) {
                try {
                    float parseFloat3 = Float.parseFloat(matcher.group(1)) / 100.0f;
                    parseFloat = Float.parseFloat(matcher.group(2)) / 100.0f;
                    f = parseFloat3;
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    sb.append("Ignoring region with malformed origin: ");
                    sb.append(m11101a2);
                    str = sb.toString();
                    C2638o.m11160d("TtmlDecoder", str);
                    return null;
                }
            } else if (!matcher2.matches()) {
                sb = new StringBuilder();
                str2 = "Ignoring region with unsupported origin: ";
                sb.append(str2);
                sb.append(m11101a2);
                str = sb.toString();
            } else if (cVar == null) {
                sb = new StringBuilder();
                sb.append("Ignoring region with missing tts:extent: ");
                sb.append(m11101a2);
                str = sb.toString();
            } else {
                try {
                    int parseInt = Integer.parseInt(matcher2.group(1));
                    f = parseInt / cVar.f10505a;
                    parseFloat = Integer.parseInt(matcher2.group(2)) / cVar.f10506b;
                } catch (NumberFormatException unused2) {
                    sb = new StringBuilder();
                    sb.append("Ignoring region with malformed origin: ");
                    sb.append(m11101a2);
                    str = sb.toString();
                    C2638o.m11160d("TtmlDecoder", str);
                    return null;
                }
            }
            String m11101a3 = C2623J.m11101a(xmlPullParser, "extent");
            if (m11101a3 != null) {
                Matcher matcher3 = f10494r.matcher(m11101a3);
                Matcher matcher4 = f10495s.matcher(m11101a3);
                if (matcher3.matches()) {
                    try {
                        float parseFloat4 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                        parseFloat2 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                        f2 = parseFloat4;
                    } catch (NumberFormatException unused3) {
                        sb = new StringBuilder();
                        sb.append("Ignoring region with malformed extent: ");
                        sb.append(m11101a2);
                        str = sb.toString();
                        C2638o.m11160d("TtmlDecoder", str);
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    sb = new StringBuilder();
                    str2 = "Ignoring region with unsupported extent: ";
                    sb.append(str2);
                    sb.append(m11101a2);
                    str = sb.toString();
                } else if (cVar == null) {
                    sb = new StringBuilder();
                    sb.append("Ignoring region with missing tts:extent: ");
                    sb.append(m11101a2);
                    str = sb.toString();
                } else {
                    try {
                        int parseInt2 = Integer.parseInt(matcher4.group(1));
                        f2 = parseInt2 / cVar.f10505a;
                        parseFloat2 = Integer.parseInt(matcher4.group(2)) / cVar.f10506b;
                    } catch (NumberFormatException unused4) {
                        sb = new StringBuilder();
                        sb.append("Ignoring region with malformed extent: ");
                        sb.append(m11101a2);
                        str = sb.toString();
                        C2638o.m11160d("TtmlDecoder", str);
                        return null;
                    }
                }
                String m11101a4 = C2623J.m11101a(xmlPullParser, "displayAlign");
                if (m11101a4 != null) {
                    String m11098j = C2622I.m11098j(m11101a4);
                    char c2 = 65535;
                    int hashCode = m11098j.hashCode();
                    if (hashCode != -1364013995) {
                        if (hashCode == 92734940 && m11098j.equals("after")) {
                            c2 = 1;
                        }
                    } else if (m11098j.equals("center")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        parseFloat += parseFloat2 / 2.0f;
                        i = 1;
                    } else if (c2 == 1) {
                        parseFloat += parseFloat2;
                        i = 2;
                    }
                    return new C2543c(m11101a, f, parseFloat, 0, i, f2, 1, 1.0f / aVar.f10501b);
                }
                i = 0;
                return new C2543c(m11101a, f, parseFloat, 0, i, f2, 1, 1.0f / aVar.f10501b);
            }
            str = "Ignoring region without an extent";
        } else {
            str = "Ignoring region without an origin";
        }
        C2638o.m11160d("TtmlDecoder", str);
        return null;
    }

    /* renamed from: a */
    private C2545e m10656a(C2545e c2545e) {
        return c2545e == null ? new C2545e() : c2545e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:            if (r7 == 0) goto L329;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:            if (r7 == 1) goto L328;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:            if (r7 == 2) goto L327;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:            if (r7 == 3) goto L326;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:            r2 = m10656a(r2);        r2.m10699d(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01c1, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:            r2 = m10656a(r2);        r2.m10699d(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:            r2 = m10656a(r2);        r2.m10696c(false);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:            r2 = m10656a(r2);        r2.m10696c(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:            if (r7 == 0) goto L356;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:            if (r7 == 1) goto L356;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:            if (r7 == 2) goto L355;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0125, code lost:            if (r7 == 3) goto L355;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0127, code lost:            if (r7 == 4) goto L354;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012b, code lost:            r2 = m10656a(r2);        r3 = android.text.Layout.Alignment.ALIGN_CENTER;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013f, code lost:            r2.m10687a(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c1, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0132, code lost:            r2 = m10656a(r2);        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:            r2 = m10656a(r2);        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p139d.p225c.p226a.p227a.p259k.p265f.C2545e m10657a(org.xmlpull.v1.XmlPullParser r12, p139d.p225c.p226a.p227a.p259k.p265f.C2545e r13) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p265f.C2541a.m10657a(org.xmlpull.v1.XmlPullParser, d.c.a.a.k.f.e):d.c.a.a.k.f.e");
    }

    /* renamed from: a */
    private Map<String, C2545e> m10658a(XmlPullParser xmlPullParser, Map<String, C2545e> map, a aVar, c cVar, Map<String, C2543c> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "style")) {
                String m11101a = C2623J.m11101a(xmlPullParser, "style");
                C2545e m10657a = m10657a(xmlPullParser, new C2545e());
                if (m11101a != null) {
                    for (String str : m10663b(m11101a)) {
                        m10657a.m10688a(map.get(str));
                    }
                }
                if (m10657a.m10701f() != null) {
                    map.put(m10657a.m10701f(), m10657a);
                }
            } else if (C2623J.m11106d(xmlPullParser, "region")) {
                C2543c m10655a = m10655a(xmlPullParser, aVar, cVar);
                if (m10655a != null) {
                    map2.put(m10655a.f10519a, m10655a);
                }
            } else if (C2623J.m11106d(xmlPullParser, "metadata")) {
                m10660a(xmlPullParser, map3);
            }
        } while (!C2623J.m11105c(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: a */
    private static void m10659a(String str, C2545e c2545e) {
        Matcher matcher;
        String[] m11073a = C2622I.m11073a(str, "\\s+");
        if (m11073a.length == 1) {
            matcher = f10493q.matcher(str);
        } else {
            if (m11073a.length != 2) {
                throw new C2547g("Invalid number of entries for fontSize: " + m11073a.length + ".");
            }
            matcher = f10493q.matcher(m11073a[1]);
            C2638o.m11160d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C2547g("Invalid expression for fontSize: '" + str + "'.");
        }
        String group = matcher.group(3);
        char c2 = 65535;
        int hashCode = group.hashCode();
        if (hashCode != 37) {
            if (hashCode != 3240) {
                if (hashCode == 3592 && group.equals("px")) {
                    c2 = 0;
                }
            } else if (group.equals("em")) {
                c2 = 1;
            }
        } else if (group.equals("%")) {
            c2 = 2;
        }
        if (c2 == 0) {
            c2545e.m10695c(1);
        } else if (c2 == 1) {
            c2545e.m10695c(2);
        } else {
            if (c2 != 2) {
                throw new C2547g("Invalid unit for fontSize: '" + group + "'.");
            }
            c2545e.m10695c(3);
        }
        c2545e.m10685a(Float.valueOf(matcher.group(1)).floatValue());
    }

    /* renamed from: a */
    private void m10660a(XmlPullParser xmlPullParser, Map<String, String> map) {
        String m11101a;
        do {
            xmlPullParser.next();
            if (C2623J.m11106d(xmlPullParser, "image") && (m11101a = C2623J.m11101a(xmlPullParser, "id")) != null) {
                map.put(m11101a, xmlPullParser.nextText());
            }
        } while (!C2623J.m11105c(xmlPullParser, "metadata"));
    }

    /* renamed from: a */
    private static boolean m10661a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: b */
    private c m10662b(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String m11101a = C2623J.m11101a(xmlPullParser, "extent");
        if (m11101a == null) {
            return null;
        }
        Matcher matcher = f10495s.matcher(m11101a);
        if (matcher.matches()) {
            try {
                return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb.append(str);
        sb.append(m11101a);
        C2638o.m11160d("TtmlDecoder", sb.toString());
        return null;
    }

    /* renamed from: b */
    private String[] m10663b(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C2622I.m11073a(trim, "\\s+");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    public C2546f mo10610a(byte[] bArr, int i, boolean z) {
        c cVar;
        a aVar;
        b bVar;
        C2546f c2546f;
        b bVar2;
        try {
            XmlPullParser newPullParser = this.f10499w.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            c cVar2 = null;
            hashMap2.put("", new C2543c(null));
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar3 = f10497u;
            a aVar2 = f10498v;
            C2546f c2546f2 = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C2542b c2542b = (C2542b) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            b m10653a = m10653a(newPullParser);
                            aVar = m10652a(newPullParser, f10498v);
                            cVar = m10662b(newPullParser);
                            bVar = m10653a;
                        } else {
                            cVar = cVar2;
                            bVar = bVar3;
                            aVar = aVar2;
                        }
                        if (m10661a(name)) {
                            if ("head".equals(name)) {
                                c2546f = c2546f2;
                                bVar2 = bVar;
                                m10658a(newPullParser, hashMap, aVar, cVar, hashMap2, hashMap3);
                            } else {
                                c2546f = c2546f2;
                                bVar2 = bVar;
                                try {
                                    C2542b m10654a = m10654a(newPullParser, c2542b, hashMap2, bVar2);
                                    arrayDeque.push(m10654a);
                                    if (c2542b != null) {
                                        c2542b.m10676a(m10654a);
                                    }
                                } catch (C2547g e2) {
                                    C2638o.m11158b("TtmlDecoder", "Suppressing parser error", e2);
                                    i2++;
                                }
                            }
                            bVar3 = bVar2;
                            c2546f2 = c2546f;
                        } else {
                            C2638o.m11159c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar3 = bVar;
                        }
                    } else {
                        C2546f c2546f3 = c2546f2;
                        if (eventType == 4) {
                            c2542b.m10676a(C2542b.m10666a(newPullParser.getText()));
                        } else if (eventType == 3) {
                            c2546f2 = newPullParser.getName().equals("tt") ? new C2546f((C2542b) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : c2546f3;
                            arrayDeque.pop();
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                        c2546f2 = c2546f3;
                        cVar = cVar2;
                        aVar = aVar2;
                    }
                    aVar2 = aVar;
                    cVar2 = cVar;
                } else {
                    C2546f c2546f4 = c2546f2;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                    c2546f2 = c2546f4;
                }
                newPullParser.next();
            }
            return c2546f2;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new C2547g("Unable to decode source", e4);
        }
    }
}
