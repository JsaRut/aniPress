package com.google.android.exoplayer2.p135ui;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: com.google.android.exoplayer2.ui.e */
/* loaded from: classes.dex */
public class C1566e implements InterfaceC1576o {

    /* renamed from: a */
    private final Resources f5898a;

    public C1566e(Resources resources) {
        C2628e.m11110a(resources);
        this.f5898a = resources;
    }

    /* renamed from: a */
    private String m6587a(String str) {
        return (C2622I.f10916a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    /* renamed from: a */
    private String m6588a(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f5898a.getString(C1572k.exo_item_list, str, str2);
            }
        }
        return str;
    }

    /* renamed from: b */
    private String m6589b(C2676s c2676s) {
        Resources resources;
        int i;
        int i2 = c2676s.f11195t;
        if (i2 == -1 || i2 < 1) {
            return "";
        }
        if (i2 == 1) {
            resources = this.f5898a;
            i = C1572k.exo_track_mono;
        } else if (i2 == 2) {
            resources = this.f5898a;
            i = C1572k.exo_track_stereo;
        } else if (i2 == 6 || i2 == 7) {
            resources = this.f5898a;
            i = C1572k.exo_track_surround_5_point_1;
        } else if (i2 != 8) {
            resources = this.f5898a;
            i = C1572k.exo_track_surround;
        } else {
            resources = this.f5898a;
            i = C1572k.exo_track_surround_7_point_1;
        }
        return resources.getString(i);
    }

    /* renamed from: c */
    private String m6590c(C2676s c2676s) {
        int i = c2676s.f11178c;
        return i == -1 ? "" : this.f5898a.getString(C1572k.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    /* renamed from: d */
    private String m6591d(C2676s c2676s) {
        if (!TextUtils.isEmpty(c2676s.f11177b)) {
            return c2676s.f11177b;
        }
        String str = c2676s.f11201z;
        return (TextUtils.isEmpty(str) || "und".equals(str)) ? "" : m6587a(str);
    }

    /* renamed from: e */
    private String m6592e(C2676s c2676s) {
        int i = c2676s.f11187l;
        int i2 = c2676s.f11188m;
        return (i == -1 || i2 == -1) ? "" : this.f5898a.getString(C1572k.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: f */
    private static int m6593f(C2676s c2676s) {
        int m11169d = C2641r.m11169d(c2676s.f11182g);
        if (m11169d != -1) {
            return m11169d;
        }
        if (C2641r.m11171f(c2676s.f11179d) != null) {
            return 2;
        }
        if (C2641r.m11166a(c2676s.f11179d) != null) {
            return 1;
        }
        if (c2676s.f11187l == -1 && c2676s.f11188m == -1) {
            return (c2676s.f11195t == -1 && c2676s.f11196u == -1) ? -1 : 1;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    @Override // com.google.android.exoplayer2.p135ui.InterfaceC1576o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String mo6594a(p139d.p225c.p226a.p227a.C2676s r6) {
        /*
            r5 = this;
            int r0 = m6593f(r6)
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L1c
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r3 = r5.m6592e(r6)
            r0[r1] = r3
            java.lang.String r6 = r5.m6590c(r6)
            r0[r2] = r6
        L17:
            java.lang.String r6 = r5.m6588a(r0)
            goto L38
        L1c:
            if (r0 != r2) goto L34
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r4 = r5.m6591d(r6)
            r0[r1] = r4
            java.lang.String r1 = r5.m6589b(r6)
            r0[r2] = r1
            java.lang.String r6 = r5.m6590c(r6)
            r0[r3] = r6
            goto L17
        L34:
            java.lang.String r6 = r5.m6591d(r6)
        L38:
            int r0 = r6.length()
            if (r0 != 0) goto L46
            android.content.res.Resources r6 = r5.f5898a
            int r0 = com.google.android.exoplayer2.p135ui.C1572k.exo_track_unknown
            java.lang.String r6 = r6.getString(r0)
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p135ui.C1566e.mo6594a(d.c.a.a.s):java.lang.String");
    }
}
