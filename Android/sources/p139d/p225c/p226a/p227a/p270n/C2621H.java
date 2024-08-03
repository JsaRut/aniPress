package p139d.p225c.p226a.p227a.p270n;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: d.c.a.a.n.H */
/* loaded from: classes.dex */
public final class C2621H {
    /* renamed from: a */
    public static String m11031a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] m11033a = m11033a(str2);
        if (m11033a[0] != -1) {
            sb.append(str2);
            m11032a(sb, m11033a[1], m11033a[2]);
            return sb.toString();
        }
        int[] m11033a2 = m11033a(str);
        if (m11033a[3] == 0) {
            sb.append((CharSequence) str, 0, m11033a2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (m11033a[2] == 0) {
            sb.append((CharSequence) str, 0, m11033a2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (m11033a[1] != 0) {
            int i = m11033a2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return m11032a(sb, m11033a[1] + i, i + m11033a[2]);
        }
        if (str2.charAt(m11033a[1]) == '/') {
            sb.append((CharSequence) str, 0, m11033a2[1]);
            sb.append(str2);
            return m11032a(sb, m11033a2[1], m11033a2[1] + m11033a[2]);
        }
        if (m11033a2[0] + 2 < m11033a2[1] && m11033a2[1] == m11033a2[2]) {
            sb.append((CharSequence) str, 0, m11033a2[1]);
            sb.append('/');
            sb.append(str2);
            return m11032a(sb, m11033a2[1], m11033a2[1] + m11033a[2] + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, m11033a2[2] - 1);
        int i2 = lastIndexOf == -1 ? m11033a2[1] : lastIndexOf + 1;
        sb.append((CharSequence) str, 0, i2);
        sb.append(str2);
        return m11032a(sb, m11033a2[1], i2 + m11033a[2]);
    }

    /* renamed from: a */
    private static String m11032a(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i2;
        while (true) {
            for (int i7 = i5; i7 <= i6; i7++) {
                if (i7 == i6) {
                    i3 = i7;
                } else if (sb.charAt(i7) == '/') {
                    i3 = i7 + 1;
                }
                int i8 = i5 + 1;
                if (i7 == i8 && sb.charAt(i5) == '.') {
                    sb.delete(i5, i3);
                    i6 -= i3 - i5;
                } else {
                    if (i7 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i8) == '.') {
                        i4 = sb.lastIndexOf("/", i5 - 2) + 1;
                        int i9 = i4 > i ? i4 : i;
                        sb.delete(i9, i3);
                        i6 -= i3 - i9;
                    } else {
                        i4 = i7 + 1;
                    }
                    i5 = i4;
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    private static int[] m11033a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: b */
    public static Uri m11034b(String str, String str2) {
        return Uri.parse(m11031a(str, str2));
    }
}
