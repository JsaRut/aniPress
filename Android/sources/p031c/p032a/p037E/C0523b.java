package p031c.p032a.p037E;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import p031c.p032a.p036D.C0521b;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.E.b */
/* loaded from: classes.dex */
public final class C0523b {

    /* renamed from: a */
    private static final Pattern f2615a = Pattern.compile("^zygote[0-9]*$");

    /* renamed from: a */
    private static int m2750a(LinkedList<String> linkedList, String str, int i) {
        int indexOf = linkedList.indexOf(str);
        int indexOf2 = indexOf == -1 ? linkedList.indexOf(str.toLowerCase(Locale.ENGLISH)) : indexOf;
        return indexOf2 == -1 ? i : indexOf2;
    }

    /* renamed from: a */
    private static C0521b m2751a(String str, Map<String, Integer> map) {
        String[] split;
        int length;
        String str2;
        if (TextUtils.isEmpty(str) || (length = (split = str.split("\\s+")).length) < 3) {
            return null;
        }
        try {
            C0521b c0521b = new C0521b();
            if (map != null && !map.isEmpty()) {
                c0521b.f2610a = split[map.get("USER").intValue()];
                c0521b.f2611b = split[map.get("PID").intValue()];
                c0521b.f2612c = split[map.get("PPID").intValue()];
                str2 = split[map.get("NAME").intValue()];
                c0521b.f2613d = str2;
                return c0521b;
            }
            c0521b.f2610a = split[0];
            c0521b.f2611b = split[1];
            c0521b.f2612c = split[2];
            str2 = split[length - 1];
            c0521b.f2613d = str2;
            return c0521b;
        } catch (Throwable th) {
            C0675a.m3475g("JProcessHelper", "parseCommandResult throwable:" + th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: Throwable -> 0x0106, TryCatch #0 {Throwable -> 0x0106, blocks: (B:3:0x0008, B:5:0x0013, B:8:0x001b, B:11:0x006d, B:12:0x0071, B:14:0x0077, B:19:0x0086, B:21:0x0090, B:23:0x0098, B:37:0x00a6, B:40:0x00b4, B:29:0x00ba, B:32:0x00c2, B:48:0x00c8, B:50:0x00ce, B:52:0x00d6, B:53:0x00db, B:55:0x00e1, B:58:0x00ef, B:69:0x0033, B:75:0x0100), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<p031c.p032a.p036D.C0521b> m2752a(int r16) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p037E.C0523b.m2752a(int):java.util.List");
    }
}
