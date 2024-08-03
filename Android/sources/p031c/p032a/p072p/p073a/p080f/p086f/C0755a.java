package p031c.p032a.p072p.p073a.p080f.p086f;

import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: c.a.p.a.f.f.a */
/* loaded from: classes.dex */
public final class C0755a {
    /* renamed from: a */
    public static HashSet<String> m3779a(SharedPreferences sharedPreferences, String str) {
        Set<String> stringSet;
        if (Build.VERSION.SDK_INT < 11 || (stringSet = sharedPreferences.getStringSet(str, null)) == null) {
            return null;
        }
        if (stringSet instanceof HashSet) {
            return (HashSet) stringSet;
        }
        HashSet<String> hashSet = new HashSet<>();
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        return hashSet;
    }
}
