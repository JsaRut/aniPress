package p139d.p225c.p226a.p227a.p250j.p255d.p256a;

import android.net.Uri;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.p239e.C2266k;
import p139d.p225c.p226a.p227a.p250j.C2414O;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.j.d.a.g */
/* loaded from: classes.dex */
public final class C2468g implements C2583B.a<AbstractC2467f> {

    /* renamed from: F */
    private final C2465d f9898F;

    /* renamed from: a */
    private static final Pattern f9872a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    private static final Pattern f9873b = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: c */
    private static final Pattern f9874c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    private static final Pattern f9875d = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f9876e = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: f */
    private static final Pattern f9877f = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: g */
    private static final Pattern f9878g = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: h */
    private static final Pattern f9879h = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: i */
    private static final Pattern f9880i = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: j */
    private static final Pattern f9881j = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: k */
    private static final Pattern f9882k = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: l */
    private static final Pattern f9883l = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: m */
    private static final Pattern f9884m = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: n */
    private static final Pattern f9885n = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: o */
    private static final Pattern f9886o = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: p */
    private static final Pattern f9887p = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: q */
    private static final Pattern f9888q = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: r */
    private static final Pattern f9889r = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: s */
    private static final Pattern f9890s = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: t */
    private static final Pattern f9891t = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: u */
    private static final Pattern f9892u = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: v */
    private static final Pattern f9893v = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: w */
    private static final Pattern f9894w = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: x */
    private static final Pattern f9895x = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: y */
    private static final Pattern f9896y = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: z */
    private static final Pattern f9897z = m10287a("AUTOSELECT");

    /* renamed from: A */
    private static final Pattern f9867A = m10287a("DEFAULT");

    /* renamed from: B */
    private static final Pattern f9868B = m10287a("FORCED");

    /* renamed from: C */
    private static final Pattern f9869C = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: D */
    private static final Pattern f9870D = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: E */
    private static final Pattern f9871E = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.d.a.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final BufferedReader f9899a;

        /* renamed from: b */
        private final Queue<String> f9900b;

        /* renamed from: c */
        private String f9901c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f9900b = queue;
            this.f9899a = bufferedReader;
        }

        /* renamed from: a */
        public boolean m10295a() {
            if (this.f9901c != null) {
                return true;
            }
            if (!this.f9900b.isEmpty()) {
                this.f9901c = this.f9900b.poll();
                return true;
            }
            do {
                String readLine = this.f9899a.readLine();
                this.f9901c = readLine;
                if (readLine == null) {
                    return false;
                }
                this.f9901c = this.f9901c.trim();
            } while (this.f9901c.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m10296b() {
            if (!m10295a()) {
                return null;
            }
            String str = this.f9901c;
            this.f9901c = null;
            return str;
        }
    }

    public C2468g() {
        this(C2465d.f9830d);
    }

    public C2468g(C2465d c2465d) {
        this.f9898F = c2465d;
    }

    /* renamed from: a */
    private static double m10279a(String str, Pattern pattern) {
        return Double.parseDouble(m10293b(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: a */
    private static int m10280a(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !C2622I.m11095g(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: a */
    private static C2213m.a m10281a(String str, String str2, Map<String, String> map) {
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m10293b = m10293b(str, f9890s, map);
            return new C2213m.a(C2200d.f8062d, "video/mp4", Base64.decode(m10293b.substring(m10293b.indexOf(44)), 0));
        }
        if (!"com.widevine".equals(str2)) {
            return null;
        }
        try {
            return new C2213m.a(C2200d.f8062d, "hls", str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new C2683z(e2);
        }
    }

    /* renamed from: a */
    private static C2213m.a m10282a(String str, Map<String, String> map) {
        if (!"1".equals(m10285a(str, f9889r, "1", map))) {
            return null;
        }
        String m10293b = m10293b(str, f9890s, map);
        return new C2213m.a(C2200d.f8063e, "video/mp4", C2266k.m9411a(C2200d.f8063e, Base64.decode(m10293b.substring(m10293b.indexOf(44)), 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* renamed from: a */
    private static C2465d m10283a(a aVar, String str) {
        char c2;
        int parseInt;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (aVar.m10295a()) {
            String m10296b = aVar.m10296b();
            if (m10296b.startsWith("#EXT")) {
                arrayList5.add(m10296b);
            }
            if (m10296b.startsWith("#EXT-X-DEFINE")) {
                hashMap2.put(m10293b(m10296b, f9894w, hashMap2), m10293b(m10296b, f9869C, hashMap2));
            } else if (m10296b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                z2 = true;
            } else if (m10296b.startsWith("#EXT-X-MEDIA")) {
                arrayList4.add(m10296b);
            } else if (m10296b.startsWith("#EXT-X-STREAM-INF")) {
                z |= m10296b.contains("CLOSED-CAPTIONS=NONE");
                int m10291b = m10291b(m10296b, f9874c);
                String m10286a = m10286a(m10296b, f9872a, hashMap2);
                if (m10286a != null) {
                    m10291b = Integer.parseInt(m10286a);
                }
                int i5 = m10291b;
                String m10286a2 = m10286a(m10296b, f9875d, hashMap2);
                String m10286a3 = m10286a(m10296b, f9876e, hashMap2);
                if (m10286a3 != null) {
                    String[] split = m10286a3.split("x");
                    int parseInt2 = Integer.parseInt(split[0]);
                    int parseInt3 = Integer.parseInt(split[1]);
                    if (parseInt2 <= 0 || parseInt3 <= 0) {
                        i3 = -1;
                        i4 = -1;
                    } else {
                        i4 = parseInt3;
                        i3 = parseInt2;
                    }
                    i = i3;
                    i2 = i4;
                } else {
                    i = -1;
                    i2 = -1;
                }
                String m10286a4 = m10286a(m10296b, f9877f, hashMap2);
                float parseFloat = m10286a4 != null ? Float.parseFloat(m10286a4) : -1.0f;
                String m10286a5 = m10286a(m10296b, f9873b, hashMap2);
                if (m10286a5 != null && m10286a2 != null) {
                    hashMap.put(m10286a5, C2622I.m11053a(m10286a2, 1));
                }
                String m10292b = m10292b(aVar.m10296b(), hashMap2);
                if (hashSet.add(m10292b)) {
                    arrayList.add(new C2465d.a(m10292b, C2676s.m11431a(Integer.toString(arrayList.size()), (String) null, "application/x-mpegURL", (String) null, m10286a2, i5, i, i2, parseFloat, (List<byte[]>) null, 0)));
                }
            }
        }
        int i6 = 0;
        C2676s c2676s = null;
        ArrayList arrayList6 = null;
        while (i6 < arrayList4.size()) {
            String str3 = (String) arrayList4.get(i6);
            int m10290b = m10290b(str3);
            String m10286a6 = m10286a(str3, f9890s, hashMap2);
            String m10293b = m10293b(str3, f9894w, hashMap2);
            String m10286a7 = m10286a(str3, f9893v, hashMap2);
            String m10286a8 = m10286a(str3, f9895x, hashMap2);
            ArrayList arrayList7 = arrayList4;
            StringBuilder sb = new StringBuilder();
            sb.append(m10286a8);
            boolean z3 = z2;
            sb.append(":");
            sb.append(m10293b);
            String sb2 = sb.toString();
            String m10293b2 = m10293b(str3, f9892u, hashMap2);
            int hashCode = m10293b2.hashCode();
            C2676s c2676s2 = c2676s;
            ArrayList arrayList8 = arrayList;
            if (hashCode == -959297733) {
                if (m10293b2.equals("SUBTITLES")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode != -333210994) {
                if (hashCode == 62628790 && m10293b2.equals("AUDIO")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (m10293b2.equals("CLOSED-CAPTIONS")) {
                    c2 = 2;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                String str4 = (String) hashMap.get(m10286a8);
                c2676s = C2676s.m11432a(sb2, m10293b, "application/x-mpegURL", str4 != null ? C2641r.m11168c(str4) : null, str4, -1, -1, -1, (List<byte[]>) null, m10290b, m10286a7);
                if (m10286a6 == null) {
                    i6++;
                    arrayList4 = arrayList7;
                    z2 = z3;
                    arrayList = arrayList8;
                } else {
                    arrayList2.add(new C2465d.a(m10286a6, c2676s));
                }
            } else if (c2 == 1) {
                arrayList3.add(new C2465d.a(m10286a6, C2676s.m11435b(sb2, m10293b, "application/x-mpegURL", "text/vtt", null, -1, m10290b, m10286a7)));
            } else if (c2 == 2) {
                String m10293b3 = m10293b(str3, f9896y, hashMap2);
                if (m10293b3.startsWith("CC")) {
                    parseInt = Integer.parseInt(m10293b3.substring(2));
                    str2 = "application/cea-608";
                } else {
                    parseInt = Integer.parseInt(m10293b3.substring(7));
                    str2 = "application/cea-708";
                }
                int i7 = parseInt;
                String str5 = str2;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(C2676s.m11434a(sb2, m10293b, (String) null, str5, (String) null, -1, m10290b, m10286a7, i7));
            }
            c2676s = c2676s2;
            i6++;
            arrayList4 = arrayList7;
            z2 = z3;
            arrayList = arrayList8;
        }
        return new C2465d(str, arrayList5, arrayList, arrayList2, arrayList3, c2676s, z ? Collections.emptyList() : arrayList6, z2, hashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x012c, code lost:            if (r9 != null) goto L44;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2466e m10284a(p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d r60, p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2468g.a r61, java.lang.String r62) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2468g.m10284a(d.c.a.a.j.d.a.d, d.c.a.a.j.d.a.g$a, java.lang.String):d.c.a.a.j.d.a.e");
    }

    /* renamed from: a */
    private static String m10285a(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m10292b(str2, map);
    }

    /* renamed from: a */
    private static String m10286a(String str, Pattern pattern, Map<String, String> map) {
        return m10285a(str, pattern, null, map);
    }

    /* renamed from: a */
    private static Pattern m10287a(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: a */
    private static boolean m10288a(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int m10280a = m10280a(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (m10280a != "#EXTM3U".charAt(i)) {
                return false;
            }
            m10280a = bufferedReader.read();
        }
        return C2622I.m11095g(m10280a(bufferedReader, false, m10280a));
    }

    /* renamed from: a */
    private static boolean m10289a(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    /* renamed from: b */
    private static int m10290b(String str) {
        int i = m10289a(str, f9867A, false) ? 1 : 0;
        if (m10289a(str, f9868B, false)) {
            i |= 2;
        }
        return m10289a(str, f9897z, false) ? i | 4 : i;
    }

    /* renamed from: b */
    private static int m10291b(String str, Pattern pattern) {
        return Integer.parseInt(m10293b(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: b */
    private static String m10292b(String str, Map<String, String> map) {
        Matcher matcher = f9871E.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static String m10293b(String str, Pattern pattern, Map<String, String> map) {
        String m10286a = m10286a(str, pattern, map);
        if (m10286a != null) {
            return m10286a;
        }
        throw new C2683z("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* renamed from: c */
    private static long m10294c(String str, Pattern pattern) {
        return Long.parseLong(m10293b(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.C2583B.a
    /* renamed from: a */
    public AbstractC2467f mo10065a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m10288a(bufferedReader)) {
                throw new C2414O("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    C2622I.m11061a((Closeable) bufferedReader);
                    throw new C2683z("Failed to parse the playlist, could not identify any tags.");
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return m10283a(new a(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return m10284a(this.f9898F, new a(arrayDeque, bufferedReader), uri.toString());
        } finally {
            C2622I.m11061a((Closeable) bufferedReader);
        }
    }
}
