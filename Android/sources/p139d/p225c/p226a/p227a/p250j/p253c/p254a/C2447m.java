package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import java.util.Locale;

/* renamed from: d.c.a.a.j.c.a.m */
/* loaded from: classes.dex */
public final class C2447m {

    /* renamed from: a */
    private final String[] f9662a;

    /* renamed from: b */
    private final int[] f9663b;

    /* renamed from: c */
    private final String[] f9664c;

    /* renamed from: d */
    private final int f9665d;

    private C2447m(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f9662a = strArr;
        this.f9663b = iArr;
        this.f9664c = strArr2;
        this.f9665d = i;
    }

    /* renamed from: a */
    private static int m10124a(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c2 = 65535;
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(i);
                i = str.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + str.substring(i, indexOf);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = strArr[i2] + "$";
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals("Bandwidth")) {
                                c2 = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c2 = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        iArr[i2] = 2;
                    } else if (c2 == 1) {
                        iArr[i2] = 3;
                    } else {
                        if (c2 != 2) {
                            throw new IllegalArgumentException("Invalid template: " + str);
                        }
                        iArr[i2] = 4;
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static C2447m m10125a(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C2447m(strArr, iArr, strArr2, m10124a(str, strArr, iArr, strArr2));
    }

    /* renamed from: a */
    public String m10126a(String str, long j, int i, long j2) {
        Locale locale;
        String str2;
        Object[] objArr;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f9665d;
            if (i2 >= i3) {
                sb.append(this.f9662a[i3]);
                return sb.toString();
            }
            sb.append(this.f9662a[i2]);
            int[] iArr = this.f9663b;
            if (iArr[i2] == 1) {
                sb.append(str);
            } else {
                if (iArr[i2] == 2) {
                    locale = Locale.US;
                    str2 = this.f9664c[i2];
                    objArr = new Object[]{Long.valueOf(j)};
                } else if (iArr[i2] == 3) {
                    locale = Locale.US;
                    str2 = this.f9664c[i2];
                    objArr = new Object[]{Integer.valueOf(i)};
                } else if (iArr[i2] == 4) {
                    locale = Locale.US;
                    str2 = this.f9664c[i2];
                    objArr = new Object[]{Long.valueOf(j2)};
                }
                sb.append(String.format(locale, str2, objArr));
            }
            i2++;
        }
    }
}
