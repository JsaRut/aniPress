package p139d.p225c.p226a.p227a.p270n;

import android.text.TextUtils;
import java.util.ArrayList;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: d.c.a.a.n.r */
/* loaded from: classes.dex */
public final class C2641r {

    /* renamed from: a */
    private static final ArrayList<a> f10976a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.n.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f10977a;

        /* renamed from: b */
        public final String f10978b;

        /* renamed from: c */
        public final int f10979c;
    }

    /* renamed from: a */
    public static String m11165a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case C0121j.AppCompatTheme_textAppearanceLargePopupMenu /* 96 */:
            case C0121j.AppCompatTheme_textAppearanceListItem /* 97 */:
            case C0121j.AppCompatTheme_textAppearanceListItemSecondary /* 98 */:
            case C0121j.AppCompatTheme_textAppearanceListItemSmall /* 99 */:
            case 100:
            case C0121j.AppCompatTheme_textAppearanceSearchResultSubtitle /* 101 */:
                return "video/mpeg2";
            case C0121j.AppCompatTheme_textAppearanceSearchResultTitle /* 102 */:
            case C0121j.AppCompatTheme_textAppearanceSmallPopupMenu /* 103 */:
            case C0121j.AppCompatTheme_textColorAlertDialogListItem /* 104 */:
                return "audio/mp4a-latm";
            case C0121j.AppCompatTheme_textColorSearchUrl /* 105 */:
            case C0121j.AppCompatTheme_toolbarStyle /* 107 */:
                return "audio/mpeg";
            case C0121j.AppCompatTheme_toolbarNavigationButtonStyle /* 106 */:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: a */
    public static String m11166a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C2622I.m11097i(str)) {
            String m11168c = m11168c(str2);
            if (m11168c != null && m11172g(m11168c)) {
                return m11168c;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static int m11167b(String str) {
        char c2;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 5;
        }
        if (c2 == 1 || c2 == 2) {
            return 6;
        }
        if (c2 == 3) {
            return 7;
        }
        if (c2 != 4) {
            return c2 != 5 ? 0 : 14;
        }
        return 8;
    }

    /* renamed from: c */
    public static String m11168c(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m11098j = C2622I.m11098j(str.trim());
        if (m11098j.startsWith("avc1") || m11098j.startsWith("avc3")) {
            return "video/avc";
        }
        if (m11098j.startsWith("hev1") || m11098j.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m11098j.startsWith("vp9") || m11098j.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m11098j.startsWith("vp8") || m11098j.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!m11098j.startsWith("mp4a")) {
            return (m11098j.startsWith("ac-3") || m11098j.startsWith("dac3")) ? "audio/ac3" : (m11098j.startsWith("ec-3") || m11098j.startsWith("dec3")) ? "audio/eac3" : m11098j.startsWith("ec+3") ? "audio/eac3-joc" : (m11098j.startsWith("dtsc") || m11098j.startsWith("dtse")) ? "audio/vnd.dts" : (m11098j.startsWith("dtsh") || m11098j.startsWith("dtsl")) ? "audio/vnd.dts.hd" : m11098j.startsWith("opus") ? "audio/opus" : m11098j.startsWith("vorbis") ? "audio/vorbis" : m11098j.startsWith("flac") ? "audio/flac" : m11175j(m11098j);
        }
        if (m11098j.startsWith("mp4a.")) {
            String substring = m11098j.substring(5);
            if (substring.length() >= 2) {
                try {
                    str2 = m11165a(Integer.parseInt(C2622I.m11099k(substring.substring(0, 2)), 16));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    /* renamed from: d */
    public static int m11169d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m11172g(str)) {
            return 1;
        }
        if (m11174i(str)) {
            return 2;
        }
        if (m11173h(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return m11177l(str);
    }

    /* renamed from: e */
    public static int m11170e(String str) {
        return m11169d(m11168c(str));
    }

    /* renamed from: f */
    public static String m11171f(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C2622I.m11097i(str)) {
            String m11168c = m11168c(str2);
            if (m11168c != null && m11174i(m11168c)) {
                return m11168c;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m11172g(String str) {
        return "audio".equals(m11176k(str));
    }

    /* renamed from: h */
    public static boolean m11173h(String str) {
        return "text".equals(m11176k(str));
    }

    /* renamed from: i */
    public static boolean m11174i(String str) {
        return "video".equals(m11176k(str));
    }

    /* renamed from: j */
    private static String m11175j(String str) {
        int size = f10976a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f10976a.get(i);
            if (str.startsWith(aVar.f10978b)) {
                return aVar.f10977a;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static String m11176k(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    /* renamed from: l */
    private static int m11177l(String str) {
        int size = f10976a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f10976a.get(i);
            if (str.equals(aVar.f10977a)) {
                return aVar.f10979c;
            }
        }
        return -1;
    }
}
