package p139d.p225c.p226a.p227a.p231d;

import android.util.Pair;
import java.util.Map;

/* renamed from: d.c.a.a.d.v */
/* loaded from: classes.dex */
public final class C2222v {
    /* renamed from: a */
    private static long m9111a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public static Pair<Long, Long> m9112a(InterfaceC2214n<?> interfaceC2214n) {
        Map<String, String> mo9065a = interfaceC2214n.mo9065a();
        if (mo9065a == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m9111a(mo9065a, "LicenseDurationRemaining")), Long.valueOf(m9111a(mo9065a, "PlaybackDurationRemaining")));
    }
}
