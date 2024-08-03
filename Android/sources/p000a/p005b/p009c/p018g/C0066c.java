package p000a.p005b.p009c.p018g;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: a.b.c.g.c */
/* loaded from: classes.dex */
public final class C0066c {

    /* renamed from: a */
    private static final Locale f240a = new Locale("", "");

    /* renamed from: a */
    public static int m277a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f240a)) {
            return 0;
        }
        String m265a = C0064a.m265a(locale);
        return m265a == null ? m278b(locale) : (m265a.equalsIgnoreCase("Arab") || m265a.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }

    /* renamed from: b */
    private static int m278b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
