package com.facebook.react.views.text;

import java.text.BreakIterator;

/* renamed from: com.facebook.react.views.text.C */
/* loaded from: classes.dex */
public enum EnumC1447C {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* renamed from: a */
    private static String m6135a(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i = first;
            first = wordInstance.next();
            if (first == -1) {
                return sb.toString();
            }
            String substring = str.substring(i, first);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                sb.append(Character.toUpperCase(substring.charAt(0)));
                substring = substring.substring(1).toLowerCase();
            }
            sb.append(substring);
        }
    }

    /* renamed from: a */
    public static String m6136a(String str, EnumC1447C enumC1447C) {
        if (str == null) {
            return null;
        }
        int i = C1446B.f5329a[enumC1447C.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? str : m6135a(str) : str.toLowerCase() : str.toUpperCase();
    }
}
