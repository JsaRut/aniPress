package com.facebook.react.uimanager;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.p020a.C0080a;
import p139d.p143b.p208m.C2122m;
import p139d.p143b.p208m.C2123n;

/* renamed from: com.facebook.react.uimanager.c */
/* loaded from: classes.dex */
public class C1300c {

    /* renamed from: com.facebook.react.uimanager.c$a */
    /* loaded from: classes.dex */
    public enum a {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public static a m5682a(String str) {
            for (a aVar : values()) {
                if (aVar.name().equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        /* renamed from: a */
        public static String m5683a(a aVar) {
            switch (C1297b.f4797a[aVar.ordinal()]) {
                case 1:
                    return null;
                case 2:
                    return "android.widget.Button";
                case 3:
                    return "android.widget.ViewGroup";
                case 4:
                    return "android.widget.EditText";
                case 5:
                case 6:
                    return "android.widget.ImageView";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.ViewGroup";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                case 11:
                    return "android.widget.ViewGroup";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m5674a(C0080a c0080a, a aVar, Context context) {
        if (aVar == null) {
            aVar = a.NONE;
        }
        c0080a.m367a(a.m5683a(aVar));
        if (Locale.getDefault().getLanguage().equals(new Locale("en").getLanguage())) {
            if (aVar.equals(a.LINK)) {
                c0080a.m383d(context.getString(C2123n.link_description));
                if (c0080a.m376c() != null) {
                    SpannableString spannableString = new SpannableString(c0080a.m376c());
                    spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                    c0080a.m374b(spannableString);
                }
                if (c0080a.m385e() != null) {
                    SpannableString spannableString2 = new SpannableString(c0080a.m385e());
                    spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
                    c0080a.m386e(spannableString2);
                }
            }
            if (aVar.equals(a.SEARCH)) {
                c0080a.m383d(context.getString(C2123n.search_description));
            }
            if (aVar.equals(a.IMAGE)) {
                c0080a.m383d(context.getString(C2123n.image_description));
            }
            if (aVar.equals(a.IMAGEBUTTON)) {
                c0080a.m383d(context.getString(C2123n.image_button_description));
            }
            if (aVar.equals(a.ADJUSTABLE)) {
                c0080a.m383d(context.getString(C2123n.adjustable_description));
            }
            if (aVar.equals(a.HEADER)) {
                c0080a.m383d(context.getString(C2123n.header_description));
                c0080a.m368a(C0080a.b.m407a(0, 1, 0, 1, true));
            }
        }
        if (aVar.equals(a.IMAGEBUTTON)) {
            c0080a.m375b(true);
        }
    }

    /* renamed from: a */
    public static void m5675a(View view) {
        String str = (String) view.getTag(C2122m.accessibility_hint);
        a aVar = (a) view.getTag(C2122m.accessibility_role);
        if (C0107v.m526n(view)) {
            return;
        }
        if (str == null && aVar == null) {
            return;
        }
        C0107v.m496a(view, new C1293a(str, aVar, view));
    }
}
