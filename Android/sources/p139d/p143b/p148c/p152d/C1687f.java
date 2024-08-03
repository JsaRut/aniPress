package p139d.p143b.p148c.p152d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d.b.c.d.f */
/* loaded from: classes.dex */
public class C1687f<K, V> extends HashMap<K, V> {
    private C1687f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> C1687f<K, V> m6956a(Map<? extends K, ? extends V> map) {
        return new C1687f<>(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m6957a(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m6958a(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
