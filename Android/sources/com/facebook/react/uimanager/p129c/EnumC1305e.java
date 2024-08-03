package com.facebook.react.uimanager.p129c;

import java.util.Locale;

/* renamed from: com.facebook.react.uimanager.c.e */
/* loaded from: classes.dex */
enum EnumC1305e {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static EnumC1305e m5686a(String str) {
        char c2;
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1965056864:
                if (lowerCase.equals("easeout")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1310315117:
                if (lowerCase.equals("easein")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1102672091:
                if (lowerCase.equals("linear")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -895679987:
                if (lowerCase.equals("spring")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1164546989:
                if (lowerCase.equals("easeineaseout")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return LINEAR;
        }
        if (c2 == 1) {
            return EASE_IN;
        }
        if (c2 == 2) {
            return EASE_OUT;
        }
        if (c2 == 3) {
            return EASE_IN_EASE_OUT;
        }
        if (c2 == 4) {
            return SPRING;
        }
        throw new IllegalArgumentException("Unsupported interpolation type : " + str);
    }
}
