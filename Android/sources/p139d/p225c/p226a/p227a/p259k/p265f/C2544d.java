package p139d.p225c.p226a.p227a.p259k.p265f;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: d.c.a.a.k.f.d */
/* loaded from: classes.dex */
final class C2544d {
    /* renamed from: a */
    public static C2545e m10679a(C2545e c2545e, String[] strArr, Map<String, C2545e> map) {
        if (c2545e == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (c2545e == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (c2545e == null && strArr.length > 1) {
            C2545e c2545e2 = new C2545e();
            int length = strArr.length;
            while (i < length) {
                c2545e2.m10688a(map.get(strArr[i]));
                i++;
            }
            return c2545e2;
        }
        if (c2545e != null && strArr != null && strArr.length == 1) {
            c2545e.m10688a(map.get(strArr[0]));
            return c2545e;
        }
        if (c2545e != null && strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                c2545e.m10688a(map.get(strArr[i]));
                i++;
            }
        }
        return c2545e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m10680a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10681a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: a */
    public static void m10682a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C2545e c2545e) {
        Object absoluteSizeSpan;
        if (c2545e.m10702g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c2545e.m10702g()), i, i2, 33);
        }
        if (c2545e.m10706k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c2545e.m10707l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c2545e.m10705j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c2545e.m10691b()), i, i2, 33);
        }
        if (c2545e.m10704i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c2545e.m10684a()), i, i2, 33);
        }
        if (c2545e.m10697c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c2545e.m10697c()), i, i2, 33);
        }
        if (c2545e.m10703h() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c2545e.m10703h()), i, i2, 33);
        }
        int m10700e = c2545e.m10700e();
        if (m10700e == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) c2545e.m10698d(), true);
        } else if (m10700e == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(c2545e.m10698d());
        } else if (m10700e != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(c2545e.m10698d() / 100.0f);
        }
        spannableStringBuilder.setSpan(absoluteSizeSpan, i, i2, 33);
    }
}
