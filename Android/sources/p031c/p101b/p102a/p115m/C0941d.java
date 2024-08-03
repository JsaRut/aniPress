package p031c.p101b.p102a.p115m;

import android.text.TextUtils;
import java.util.Set;
import java.util.regex.Pattern;
import p031c.p101b.p102a.p104b.C0883f;

/* renamed from: c.b.a.m.d */
/* loaded from: classes.dex */
public class C0941d {

    /* renamed from: a */
    public static final Pattern f3972a = Pattern.compile("((aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(biz|b[abdefghijmnorstvwyz])|(cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(edu|e[cegrstu])|f[ijkmor]|(gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(info|int|i[delmnoqrst])|(jobs|j[emop])|k[eghimnprwyz]|l[abcikrstuvy]|(mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(name|net|n[acefgilopruz])|(org|om)|(pro|p[aefghklmnrstwy])|qa|r[eosuw]|s[abcdeghijklmnortuvyz]|(tel|travel|t[cdfghjklmnoprtvwz])|u[agksyz]|v[aceginu]|w[fs]|(xn\\-\\-0zwm56d|xn\\-\\-11b5bs3a9aj6g|xn\\-\\-80akhbyknj4f|xn\\-\\-9t4b11yi5a|xn\\-\\-deba0ad|xn\\-\\-g6w251d|xn\\-\\-hgbk6aj7f53bba|xn\\-\\-hlcj6aya9esc7a|xn\\-\\-jxalpdlp|xn\\-\\-kgbechtv|xn\\-\\-zckzah)|y[etu]|z[amw])");

    /* renamed from: b */
    public static final Pattern f3973b = Pattern.compile("((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnprwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eosuw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agksyz]|v[aceginu]|w[fs]|(?:xn\\-\\-0zwm56d|xn\\-\\-11b5bs3a9aj6g|xn\\-\\-80akhbyknj4f|xn\\-\\-9t4b11yi5a|xn\\-\\-deba0ad|xn\\-\\-g6w251d|xn\\-\\-hgbk6aj7f53bba|xn\\-\\-hlcj6aya9esc7a|xn\\-\\-jxalpdlp|xn\\-\\-kgbechtv|xn\\-\\-zckzah)|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");

    /* renamed from: c */
    public static final Pattern f3974c = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");

    /* renamed from: d */
    public static final Pattern f3975d = Pattern.compile("(((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]*)*[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]\\.)+" + f3972a + ")|" + f3974c + ")");

    /* renamed from: e */
    public static final Pattern f3976e = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");

    /* renamed from: f */
    public static final Pattern f3977f = Pattern.compile("(\\+[0-9]+[\\- \\.]*)?(\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.][0-9\\- \\.]+[0-9])");

    /* renamed from: a */
    public static int m4747a(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            if (set.size() > 1000) {
                return C0883f.a.f3728h;
            }
            for (String str : set) {
                if (str == null) {
                    return C0883f.a.f3726f;
                }
                if (str.getBytes().length > 40) {
                    return C0883f.a.f3727g;
                }
                if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
                    return C0883f.a.f3726f;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m4748a(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]{0,40}$").matcher(str).matches();
    }

    /* renamed from: b */
    public static int m4749b(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.getBytes().length > 40) {
                return C0883f.a.f3725e;
            }
            if (!Pattern.compile("^[一-龥0-9a-zA-Z_!@#$&*+=.|]+$").matcher(str).matches()) {
                return C0883f.a.f3724d;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static int m4750c(String str) {
        if (TextUtils.isEmpty(str) || Pattern.compile("^[+0-9][-0-9]{1,}$").matcher(str).matches()) {
            return 0;
        }
        return C0883f.a.f3743w;
    }
}
