package p139d.p225c.p226a.p227a.p270n;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d.c.a.a.n.h */
/* loaded from: classes.dex */
public final class C2631h {

    /* renamed from: a */
    private static final Pattern f10947a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f10948b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f10949c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final Map<String, Integer> f10950d = new HashMap();

    static {
        f10950d.put("aliceblue", -984833);
        f10950d.put("antiquewhite", -332841);
        f10950d.put("aqua", -16711681);
        f10950d.put("aquamarine", -8388652);
        f10950d.put("azure", -983041);
        f10950d.put("beige", -657956);
        f10950d.put("bisque", -6972);
        f10950d.put("black", -16777216);
        f10950d.put("blanchedalmond", -5171);
        f10950d.put("blue", -16776961);
        f10950d.put("blueviolet", -7722014);
        f10950d.put("brown", -5952982);
        f10950d.put("burlywood", -2180985);
        f10950d.put("cadetblue", -10510688);
        f10950d.put("chartreuse", -8388864);
        f10950d.put("chocolate", -2987746);
        f10950d.put("coral", -32944);
        f10950d.put("cornflowerblue", -10185235);
        f10950d.put("cornsilk", -1828);
        f10950d.put("crimson", -2354116);
        f10950d.put("cyan", -16711681);
        f10950d.put("darkblue", -16777077);
        f10950d.put("darkcyan", -16741493);
        f10950d.put("darkgoldenrod", -4684277);
        f10950d.put("darkgray", -5658199);
        f10950d.put("darkgreen", -16751616);
        f10950d.put("darkgrey", -5658199);
        f10950d.put("darkkhaki", -4343957);
        f10950d.put("darkmagenta", -7667573);
        f10950d.put("darkolivegreen", -11179217);
        f10950d.put("darkorange", -29696);
        f10950d.put("darkorchid", -6737204);
        f10950d.put("darkred", -7667712);
        f10950d.put("darksalmon", -1468806);
        f10950d.put("darkseagreen", -7357297);
        f10950d.put("darkslateblue", -12042869);
        f10950d.put("darkslategray", -13676721);
        f10950d.put("darkslategrey", -13676721);
        f10950d.put("darkturquoise", -16724271);
        f10950d.put("darkviolet", -7077677);
        f10950d.put("deeppink", -60269);
        f10950d.put("deepskyblue", -16728065);
        f10950d.put("dimgray", -9868951);
        f10950d.put("dimgrey", -9868951);
        f10950d.put("dodgerblue", -14774017);
        f10950d.put("firebrick", -5103070);
        f10950d.put("floralwhite", -1296);
        f10950d.put("forestgreen", -14513374);
        f10950d.put("fuchsia", -65281);
        f10950d.put("gainsboro", -2302756);
        f10950d.put("ghostwhite", -460545);
        f10950d.put("gold", -10496);
        f10950d.put("goldenrod", -2448096);
        f10950d.put("gray", -8355712);
        f10950d.put("green", -16744448);
        f10950d.put("greenyellow", -5374161);
        f10950d.put("grey", -8355712);
        f10950d.put("honeydew", -983056);
        f10950d.put("hotpink", -38476);
        f10950d.put("indianred", -3318692);
        f10950d.put("indigo", -11861886);
        f10950d.put("ivory", -16);
        f10950d.put("khaki", -989556);
        f10950d.put("lavender", -1644806);
        f10950d.put("lavenderblush", -3851);
        f10950d.put("lawngreen", -8586240);
        f10950d.put("lemonchiffon", -1331);
        f10950d.put("lightblue", -5383962);
        f10950d.put("lightcoral", -1015680);
        f10950d.put("lightcyan", -2031617);
        f10950d.put("lightgoldenrodyellow", -329006);
        f10950d.put("lightgray", -2894893);
        f10950d.put("lightgreen", -7278960);
        f10950d.put("lightgrey", -2894893);
        f10950d.put("lightpink", -18751);
        f10950d.put("lightsalmon", -24454);
        f10950d.put("lightseagreen", -14634326);
        f10950d.put("lightskyblue", -7876870);
        f10950d.put("lightslategray", -8943463);
        f10950d.put("lightslategrey", -8943463);
        f10950d.put("lightsteelblue", -5192482);
        f10950d.put("lightyellow", -32);
        f10950d.put("lime", -16711936);
        f10950d.put("limegreen", -13447886);
        f10950d.put("linen", -331546);
        f10950d.put("magenta", -65281);
        f10950d.put("maroon", -8388608);
        f10950d.put("mediumaquamarine", -10039894);
        f10950d.put("mediumblue", -16777011);
        f10950d.put("mediumorchid", -4565549);
        f10950d.put("mediumpurple", -7114533);
        f10950d.put("mediumseagreen", -12799119);
        f10950d.put("mediumslateblue", -8689426);
        f10950d.put("mediumspringgreen", -16713062);
        f10950d.put("mediumturquoise", -12004916);
        f10950d.put("mediumvioletred", -3730043);
        f10950d.put("midnightblue", -15132304);
        f10950d.put("mintcream", -655366);
        f10950d.put("mistyrose", -6943);
        f10950d.put("moccasin", -6987);
        f10950d.put("navajowhite", -8531);
        f10950d.put("navy", -16777088);
        f10950d.put("oldlace", -133658);
        f10950d.put("olive", -8355840);
        f10950d.put("olivedrab", -9728477);
        f10950d.put("orange", -23296);
        f10950d.put("orangered", -47872);
        f10950d.put("orchid", -2461482);
        f10950d.put("palegoldenrod", -1120086);
        f10950d.put("palegreen", -6751336);
        f10950d.put("paleturquoise", -5247250);
        f10950d.put("palevioletred", -2396013);
        f10950d.put("papayawhip", -4139);
        f10950d.put("peachpuff", -9543);
        f10950d.put("peru", -3308225);
        f10950d.put("pink", -16181);
        f10950d.put("plum", -2252579);
        f10950d.put("powderblue", -5185306);
        f10950d.put("purple", -8388480);
        f10950d.put("rebeccapurple", -10079335);
        f10950d.put("red", -65536);
        f10950d.put("rosybrown", -4419697);
        f10950d.put("royalblue", -12490271);
        f10950d.put("saddlebrown", -7650029);
        f10950d.put("salmon", -360334);
        f10950d.put("sandybrown", -744352);
        f10950d.put("seagreen", -13726889);
        f10950d.put("seashell", -2578);
        f10950d.put("sienna", -6270419);
        f10950d.put("silver", -4144960);
        f10950d.put("skyblue", -7876885);
        f10950d.put("slateblue", -9807155);
        f10950d.put("slategray", -9404272);
        f10950d.put("slategrey", -9404272);
        f10950d.put("snow", -1286);
        f10950d.put("springgreen", -16711809);
        f10950d.put("steelblue", -12156236);
        f10950d.put("tan", -2968436);
        f10950d.put("teal", -16744320);
        f10950d.put("thistle", -2572328);
        f10950d.put("tomato", -40121);
        f10950d.put("transparent", 0);
        f10950d.put("turquoise", -12525360);
        f10950d.put("violet", -1146130);
        f10950d.put("wheat", -663885);
        f10950d.put("white", -1);
        f10950d.put("whitesmoke", -657931);
        f10950d.put("yellow", -256);
        f10950d.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    private static int m11127a(int i, int i2, int i3) {
        return m11128a(255, i, i2, i3);
    }

    /* renamed from: a */
    private static int m11128a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static int m11129a(String str) {
        return m11130a(str, true);
    }

    /* renamed from: a */
    private static int m11130a(String str, boolean z) {
        C2628e.m11111a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f10949c : f10948b).matcher(replace);
            if (matcher.matches()) {
                return m11128a(z ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f10947a.matcher(replace);
            if (matcher2.matches()) {
                return m11127a(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = f10950d.get(C2622I.m11098j(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static int m11131b(String str) {
        return m11130a(str, false);
    }
}
