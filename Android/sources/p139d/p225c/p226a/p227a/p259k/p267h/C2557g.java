package p139d.p225c.p226a.p227a.p259k.p267h;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.p259k.p267h.C2556f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.h.g */
/* loaded from: classes.dex */
public final class C2557g {

    /* renamed from: a */
    public static final Pattern f10595a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f10596b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private final StringBuilder f10597c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.h.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private static final String[] f10598a = new String[0];

        /* renamed from: b */
        public final String f10599b;

        /* renamed from: c */
        public final int f10600c;

        /* renamed from: d */
        public final String f10601d;

        /* renamed from: e */
        public final String[] f10602e;

        private a(String str, int i, String str2, String[] strArr) {
            this.f10600c = i;
            this.f10599b = str;
            this.f10601d = str2;
            this.f10602e = strArr;
        }

        /* renamed from: a */
        public static a m10784a() {
            return new a("", 0, "", new String[0]);
        }

        /* renamed from: a */
        public static a m10785a(String str, int i) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m11073a = C2622I.m11073a(trim, "\\.");
            return new a(m11073a[0], i, str2, m11073a.length > 1 ? (String[]) Arrays.copyOfRange(m11073a, 1, m11073a.length) : f10598a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.h.g$b */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        public final int f10603a;

        /* renamed from: b */
        public final C2554d f10604b;

        public b(int i, C2554d c2554d) {
            this.f10603a = i;
            this.f10604b = c2554d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f10603a - bVar.f10603a;
        }
    }

    /* renamed from: a */
    private static int m10769a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: a */
    private static String m10770a(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return C2622I.m11083b(trim, "[ \\.]")[0];
    }

    /* renamed from: a */
    private static void m10771a(SpannableStringBuilder spannableStringBuilder, C2554d c2554d, int i, int i2) {
        Object absoluteSizeSpan;
        if (c2554d == null) {
            return;
        }
        if (c2554d.m10748f() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c2554d.m10748f()), i, i2, 33);
        }
        if (c2554d.m10752j()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c2554d.m10753k()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c2554d.m10751i()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c2554d.m10738b()), i, i2, 33);
        }
        if (c2554d.m10750h()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c2554d.m10732a()), i, i2, 33);
        }
        if (c2554d.m10743c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c2554d.m10743c()), i, i2, 33);
        }
        if (c2554d.m10749g() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c2554d.m10749g()), i, i2, 33);
        }
        int m10747e = c2554d.m10747e();
        if (m10747e == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) c2554d.m10745d(), true);
        } else if (m10747e == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(c2554d.m10745d());
        } else if (m10747e != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(c2554d.m10745d() / 100.0f);
        }
        spannableStringBuilder.setSpan(absoluteSizeSpan, i, i2, 33);
    }

    /* renamed from: a */
    private static void m10772a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c2;
        char c3;
        int hashCode = str.hashCode();
        if (hashCode == 3309) {
            if (str.equals("gt")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3464) {
            if (str.equals("lt")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 96708) {
            if (hashCode == 3374865 && str.equals("nbsp")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("amp")) {
                c2 = 3;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            c3 = '<';
        } else if (c2 == 1) {
            c3 = '>';
        } else if (c2 == 2) {
            c3 = ' ';
        } else {
            if (c2 != 3) {
                C2638o.m11160d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
            }
            c3 = '&';
        }
        spannableStringBuilder.append(c3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10773a(String str, C2556f.a aVar) {
        Matcher matcher = f10596b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    m10778b(group2, aVar);
                } else if ("align".equals(group)) {
                    aVar.m10760a(m10782d(group2));
                } else if ("position".equals(group)) {
                    m10781c(group2, aVar);
                } else if ("size".equals(group)) {
                    aVar.m10767c(C2559i.m10789a(group2));
                } else {
                    C2638o.m11160d("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                C2638o.m11160d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[LOOP:0: B:27:0x0096->B:28:0x0098, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m10774a(java.lang.String r8, p139d.p225c.p226a.p227a.p259k.p267h.C2557g.a r9, android.text.SpannableStringBuilder r10, java.util.List<p139d.p225c.p226a.p227a.p259k.p267h.C2554d> r11, java.util.List<p139d.p225c.p226a.p227a.p259k.p267h.C2557g.b> r12) {
        /*
            int r0 = r9.f10600c
            int r1 = r10.length()
            java.lang.String r2 = r9.f10599b
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L67
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L5d
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L53
            r7 = 98
            if (r3 == r7) goto L49
            r7 = 99
            if (r3 == r7) goto L3f
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L35
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L2b
            goto L71
        L2b:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 5
            goto L72
        L35:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 2
            goto L72
        L3f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 3
            goto L72
        L49:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 0
            goto L72
        L53:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 4
            goto L72
        L5d:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 1
            goto L72
        L67:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 6
            goto L72
        L71:
            r2 = -1
        L72:
            r3 = 33
            switch(r2) {
                case 0: goto L84;
                case 1: goto L7e;
                case 2: goto L78;
                case 3: goto L8c;
                case 4: goto L8c;
                case 5: goto L8c;
                case 6: goto L8c;
                default: goto L77;
            }
        L77:
            return
        L78:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            goto L89
        L7e:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            goto L89
        L84:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
        L89:
            r10.setSpan(r2, r0, r1, r3)
        L8c:
            r12.clear()
            m10776a(r11, r8, r9, r12)
            int r8 = r12.size()
        L96:
            if (r4 >= r8) goto La6
            java.lang.Object r9 = r12.get(r4)
            d.c.a.a.k.h.g$b r9 = (p139d.p225c.p226a.p227a.p259k.p267h.C2557g.b) r9
            d.c.a.a.k.h.d r9 = r9.f10604b
            m10771a(r10, r9, r0, r1)
            int r4 = r4 + 1
            goto L96
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p259k.p267h.C2557g.m10774a(java.lang.String, d.c.a.a.k.h.g$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10775a(String str, String str2, C2556f.a aVar, List<C2554d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m10772a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m10769a(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    String m10770a = m10770a(substring);
                    if (m10770a != null && m10779b(m10770a)) {
                        if (!z) {
                            if (!z2) {
                                arrayDeque.push(a.m10785a(substring, spannableStringBuilder.length()));
                            }
                        }
                        while (!arrayDeque.isEmpty()) {
                            a aVar2 = (a) arrayDeque.pop();
                            m10774a(str, aVar2, spannableStringBuilder, list, arrayList);
                            if (aVar2.f10599b.equals(m10770a)) {
                                break;
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m10774a(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        m10774a(str, a.m10784a(), spannableStringBuilder, list, arrayList);
        aVar.m10761a(spannableStringBuilder);
    }

    /* renamed from: a */
    private static void m10776a(List<C2554d> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2554d c2554d = list.get(i);
            int m10733a = c2554d.m10733a(str, aVar.f10599b, aVar.f10602e, aVar.f10601d);
            if (m10733a > 0) {
                list2.add(new b(m10733a, c2554d));
            }
        }
        Collections.sort(list2);
    }

    /* renamed from: a */
    private static boolean m10777a(String str, Matcher matcher, C2644u c2644u, C2556f.a aVar, StringBuilder sb, List<C2554d> list) {
        try {
            aVar.m10765b(C2559i.m10791b(matcher.group(1)));
            aVar.m10759a(C2559i.m10791b(matcher.group(2)));
            m10773a(matcher.group(3), aVar);
            sb.setLength(0);
            while (true) {
                String m11228j = c2644u.m11228j();
                if (TextUtils.isEmpty(m11228j)) {
                    m10775a(str, sb.toString(), aVar, list);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(m11228j.trim());
            }
        } catch (NumberFormatException unused) {
            C2638o.m11160d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }

    /* renamed from: b */
    private static void m10778b(String str, C2556f.a aVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            aVar.m10758a(m10780c(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            aVar.m10758a(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            aVar.m10757a(C2559i.m10789a(str));
            aVar.m10764b(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        aVar.m10757a(parseInt);
        aVar.m10764b(1);
    }

    /* renamed from: b */
    private static boolean m10779b(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == 98) {
            if (str.equals("b")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str.equals("c")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str.equals("i")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str.equals("lang")) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str.equals("v")) {
                c2 = 5;
            }
            c2 = 65535;
        } else {
            if (str.equals("u")) {
                c2 = 4;
            }
            c2 = 65535;
        }
        return c2 == 0 || c2 == 1 || c2 == 2 || c2 == 3 || c2 == 4 || c2 == 5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    private static int m10780c(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1 || c2 == 2) {
            return 1;
        }
        if (c2 == 3) {
            return 2;
        }
        C2638o.m11160d("WebvttCueParser", "Invalid anchor value: " + str);
        return Integer.MIN_VALUE;
    }

    /* renamed from: c */
    private static void m10781c(String str, C2556f.a aVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            aVar.m10768c(m10780c(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            aVar.m10768c(Integer.MIN_VALUE);
        }
        aVar.m10763b(C2559i.m10789a(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    private static Layout.Alignment m10782d(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (str.equals("left")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c2 == 2 || c2 == 3) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (c2 == 4 || c2 == 5) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        C2638o.m11160d("WebvttCueParser", "Invalid alignment value: " + str);
        return null;
    }

    /* renamed from: a */
    public boolean m10783a(C2644u c2644u, C2556f.a aVar, List<C2554d> list) {
        String m11228j = c2644u.m11228j();
        if (m11228j == null) {
            return false;
        }
        Matcher matcher = f10595a.matcher(m11228j);
        if (matcher.matches()) {
            return m10777a(null, matcher, c2644u, aVar, this.f10597c, list);
        }
        String m11228j2 = c2644u.m11228j();
        if (m11228j2 == null) {
            return false;
        }
        Matcher matcher2 = f10595a.matcher(m11228j2);
        if (matcher2.matches()) {
            return m10777a(m11228j.trim(), matcher2, c2644u, aVar, this.f10597c, list);
        }
        return false;
    }
}
