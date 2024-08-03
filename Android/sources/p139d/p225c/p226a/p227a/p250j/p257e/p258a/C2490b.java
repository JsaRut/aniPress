package p139d.p225c.p226a.p227a.p250j.p257e.p258a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.p239e.C2266k;
import p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2489a;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2630g;

/* renamed from: d.c.a.a.j.e.a.b */
/* loaded from: classes.dex */
public class C2490b implements C2583B.a<C2489a> {

    /* renamed from: a */
    private final XmlPullParserFactory f10080a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.e.a.b$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        private final String f10081a;

        /* renamed from: b */
        private final String f10082b;

        /* renamed from: c */
        private final a f10083c;

        /* renamed from: d */
        private final List<Pair<String, Object>> f10084d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f10083c = aVar;
            this.f10081a = str;
            this.f10082b = str2;
        }

        /* renamed from: a */
        private a m10392a(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* renamed from: a */
        protected final int m10393a(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw new C2683z(e2);
            }
        }

        /* renamed from: a */
        protected final int m10394a(XmlPullParser xmlPullParser, String str, int i) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e2) {
                throw new C2683z(e2);
            }
        }

        /* renamed from: a */
        protected final long m10395a(XmlPullParser xmlPullParser, String str, long j) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e2) {
                throw new C2683z(e2);
            }
        }

        /* renamed from: a */
        protected abstract Object mo10396a();

        /* renamed from: a */
        protected final Object m10397a(String str) {
            for (int i = 0; i < this.f10084d.size(); i++) {
                Pair<String, Object> pair = this.f10084d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f10083c;
            if (aVar == null) {
                return null;
            }
            return aVar.m10397a(str);
        }

        /* renamed from: a */
        public final Object m10398a(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f10082b.equals(name)) {
                        mo10406c(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo10404b(name)) {
                            mo10406c(xmlPullParser);
                        } else {
                            a m10392a = m10392a(this, name, this.f10081a);
                            if (m10392a == null) {
                                i = 1;
                            } else {
                                mo10399a(m10392a.m10398a(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo10407d(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo10403b(xmlPullParser);
                    if (!mo10404b(name2)) {
                        return mo10396a();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: a */
        protected void mo10399a(Object obj) {
        }

        /* renamed from: a */
        protected final void m10400a(String str, Object obj) {
            this.f10084d.add(Pair.create(str, obj));
        }

        /* renamed from: a */
        protected final boolean m10401a(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* renamed from: b */
        protected final long m10402b(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e2) {
                throw new C2683z(e2);
            }
        }

        /* renamed from: b */
        protected void mo10403b(XmlPullParser xmlPullParser) {
        }

        /* renamed from: b */
        protected boolean mo10404b(String str) {
            return false;
        }

        /* renamed from: c */
        protected final String m10405c(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* renamed from: c */
        protected abstract void mo10406c(XmlPullParser xmlPullParser);

        /* renamed from: d */
        protected void mo10407d(XmlPullParser xmlPullParser) {
        }
    }

    /* renamed from: d.c.a.a.j.e.a.b$b */
    /* loaded from: classes.dex */
    public static class b extends C2683z {
        public b(String str) {
            super("Missing required field: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.e.a.b$c */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: e */
        private boolean f10085e;

        /* renamed from: f */
        private UUID f10086f;

        /* renamed from: g */
        private byte[] f10087g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: c */
        private static String m10408c(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: a */
        public Object mo10396a() {
            UUID uuid = this.f10086f;
            return new C2489a.a(uuid, C2266k.m9411a(uuid, this.f10087g));
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: b */
        public void mo10403b(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f10085e = false;
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: b */
        public boolean mo10404b(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: c */
        public void mo10406c(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f10085e = true;
                this.f10086f = UUID.fromString(m10408c(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: d */
        public void mo10407d(XmlPullParser xmlPullParser) {
            if (this.f10085e) {
                this.f10087g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.e.a.b$d */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: e */
        private C2676s f10088e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: c */
        private static List<byte[]> m10409c(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m11068a = C2622I.m11068a(str);
                byte[][] m11126b = C2630g.m11126b(m11068a);
                if (m11126b == null) {
                    arrayList.add(m11068a);
                } else {
                    Collections.addAll(arrayList, m11126b);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private static String m10410d(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: a */
        public Object mo10396a() {
            return this.f10088e;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: c */
        public void mo10406c(XmlPullParser xmlPullParser) {
            C2676s m11435b;
            int intValue = ((Integer) m10397a("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            String str = (String) m10397a("Name");
            int m10393a = m10393a(xmlPullParser, "Bitrate");
            String m10410d = m10410d(m10405c(xmlPullParser, "FourCC"));
            if (intValue == 2) {
                m11435b = C2676s.m11431a(attributeValue, str, "video/mp4", m10410d, (String) null, m10393a, m10393a(xmlPullParser, "MaxWidth"), m10393a(xmlPullParser, "MaxHeight"), -1.0f, m10409c(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0);
            } else if (intValue == 1) {
                if (m10410d == null) {
                    m10410d = "audio/mp4a-latm";
                }
                int m10393a2 = m10393a(xmlPullParser, "Channels");
                int m10393a3 = m10393a(xmlPullParser, "SamplingRate");
                List<byte[]> m10409c = m10409c(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (m10409c.isEmpty() && "audio/mp4a-latm".equals(m10410d)) {
                    m10409c = Collections.singletonList(C2630g.m11120a(m10393a3, m10393a2));
                }
                m11435b = C2676s.m11432a(attributeValue, str, "audio/mp4", m10410d, (String) null, m10393a, m10393a2, m10393a3, m10409c, 0, (String) m10397a("Language"));
            } else {
                m11435b = intValue == 3 ? C2676s.m11435b(attributeValue, str, "application/mp4", m10410d, null, m10393a, 0, (String) m10397a("Language")) : C2676s.m11433a(attributeValue, str, "application/mp4", m10410d, (String) null, m10393a, 0, (String) null);
            }
            this.f10088e = m11435b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.e.a.b$e */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: e */
        private final List<C2489a.b> f10089e;

        /* renamed from: f */
        private int f10090f;

        /* renamed from: g */
        private int f10091g;

        /* renamed from: h */
        private long f10092h;

        /* renamed from: i */
        private long f10093i;

        /* renamed from: j */
        private long f10094j;

        /* renamed from: k */
        private int f10095k;

        /* renamed from: l */
        private boolean f10096l;

        /* renamed from: m */
        private C2489a.a f10097m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f10095k = -1;
            this.f10097m = null;
            this.f10089e = new LinkedList();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: a */
        public Object mo10396a() {
            C2489a.b[] bVarArr = new C2489a.b[this.f10089e.size()];
            this.f10089e.toArray(bVarArr);
            C2489a.a aVar = this.f10097m;
            if (aVar != null) {
                C2213m c2213m = new C2213m(new C2213m.a(aVar.f10062a, "video/mp4", aVar.f10063b));
                for (C2489a.b bVar : bVarArr) {
                    int i = bVar.f10064a;
                    if (i == 2 || i == 1) {
                        C2676s[] c2676sArr = bVar.f10073j;
                        for (int i2 = 0; i2 < c2676sArr.length; i2++) {
                            c2676sArr[i2] = c2676sArr[i2].m11440a(c2213m);
                        }
                    }
                }
            }
            return new C2489a(this.f10090f, this.f10091g, this.f10092h, this.f10093i, this.f10094j, this.f10095k, this.f10096l, this.f10097m, bVarArr);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: a */
        public void mo10399a(Object obj) {
            if (obj instanceof C2489a.b) {
                this.f10089e.add((C2489a.b) obj);
            } else if (obj instanceof C2489a.a) {
                C2628e.m11113b(this.f10097m == null);
                this.f10097m = (C2489a.a) obj;
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: c */
        public void mo10406c(XmlPullParser xmlPullParser) {
            this.f10090f = m10393a(xmlPullParser, "MajorVersion");
            this.f10091g = m10393a(xmlPullParser, "MinorVersion");
            this.f10092h = m10395a(xmlPullParser, "TimeScale", 10000000L);
            this.f10093i = m10402b(xmlPullParser, "Duration");
            this.f10094j = m10395a(xmlPullParser, "DVRWindowLength", 0L);
            this.f10095k = m10394a(xmlPullParser, "LookaheadCount", -1);
            this.f10096l = m10401a(xmlPullParser, "IsLive", false);
            m10400a("TimeScale", Long.valueOf(this.f10092h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.e.a.b$f */
    /* loaded from: classes.dex */
    public static class f extends a {

        /* renamed from: e */
        private final String f10098e;

        /* renamed from: f */
        private final List<C2676s> f10099f;

        /* renamed from: g */
        private int f10100g;

        /* renamed from: h */
        private String f10101h;

        /* renamed from: i */
        private long f10102i;

        /* renamed from: j */
        private String f10103j;

        /* renamed from: k */
        private String f10104k;

        /* renamed from: l */
        private int f10105l;

        /* renamed from: m */
        private int f10106m;

        /* renamed from: n */
        private int f10107n;

        /* renamed from: o */
        private int f10108o;

        /* renamed from: p */
        private String f10109p;

        /* renamed from: q */
        private ArrayList<Long> f10110q;

        /* renamed from: r */
        private long f10111r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f10098e = str;
            this.f10099f = new LinkedList();
        }

        /* renamed from: e */
        private void m10411e(XmlPullParser xmlPullParser) {
            this.f10100g = m10413g(xmlPullParser);
            m10400a("Type", Integer.valueOf(this.f10100g));
            this.f10101h = this.f10100g == 3 ? m10405c(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            this.f10103j = xmlPullParser.getAttributeValue(null, "Name");
            this.f10104k = m10405c(xmlPullParser, "Url");
            this.f10105l = m10394a(xmlPullParser, "MaxWidth", -1);
            this.f10106m = m10394a(xmlPullParser, "MaxHeight", -1);
            this.f10107n = m10394a(xmlPullParser, "DisplayWidth", -1);
            this.f10108o = m10394a(xmlPullParser, "DisplayHeight", -1);
            this.f10109p = xmlPullParser.getAttributeValue(null, "Language");
            m10400a("Language", this.f10109p);
            this.f10102i = m10394a(xmlPullParser, "TimeScale", -1);
            if (this.f10102i == -1) {
                this.f10102i = ((Long) m10397a("TimeScale")).longValue();
            }
            this.f10110q = new ArrayList<>();
        }

        /* renamed from: f */
        private void m10412f(XmlPullParser xmlPullParser) {
            int size = this.f10110q.size();
            long m10395a = m10395a(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (m10395a == -9223372036854775807L) {
                if (size == 0) {
                    m10395a = 0;
                } else {
                    if (this.f10111r == -1) {
                        throw new C2683z("Unable to infer start time");
                    }
                    m10395a = this.f10110q.get(size - 1).longValue() + this.f10111r;
                }
            }
            this.f10110q.add(Long.valueOf(m10395a));
            this.f10111r = m10395a(xmlPullParser, "d", -9223372036854775807L);
            long m10395a2 = m10395a(xmlPullParser, "r", 1L);
            if (m10395a2 > 1 && this.f10111r == -9223372036854775807L) {
                throw new C2683z("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j = i;
                if (j >= m10395a2) {
                    return;
                }
                this.f10110q.add(Long.valueOf((this.f10111r * j) + m10395a));
                i++;
            }
        }

        /* renamed from: g */
        private int m10413g(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw new C2683z("Invalid key value[" + attributeValue + "]");
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: a */
        public Object mo10396a() {
            C2676s[] c2676sArr = new C2676s[this.f10099f.size()];
            this.f10099f.toArray(c2676sArr);
            return new C2489a.b(this.f10098e, this.f10104k, this.f10100g, this.f10101h, this.f10102i, this.f10103j, this.f10105l, this.f10106m, this.f10107n, this.f10108o, this.f10109p, c2676sArr, this.f10110q, this.f10111r);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: a */
        public void mo10399a(Object obj) {
            if (obj instanceof C2676s) {
                this.f10099f.add((C2676s) obj);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: b */
        public boolean mo10404b(String str) {
            return "c".equals(str);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b.a
        /* renamed from: c */
        public void mo10406c(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m10412f(xmlPullParser);
            } else {
                m10411e(xmlPullParser);
            }
        }
    }

    public C2490b() {
        try {
            this.f10080a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p225c.p226a.p227a.p269m.C2583B.a
    /* renamed from: a */
    public C2489a mo10065a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f10080a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C2489a) new e(null, uri.toString()).m10398a(newPullParser);
        } catch (XmlPullParserException e2) {
            throw new C2683z(e2);
        }
    }
}
