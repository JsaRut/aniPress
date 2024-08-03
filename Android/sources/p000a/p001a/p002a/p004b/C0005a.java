package p000a.p001a.p002a.p004b;

import java.util.HashMap;
import java.util.Map;
import p000a.p001a.p002a.p004b.C0007c;

/* renamed from: a.a.a.b.a */
/* loaded from: classes.dex */
public class C0005a<K, V> extends C0007c<K, V> {

    /* renamed from: e */
    private HashMap<K, C0007c.c<K, V>> f8e = new HashMap<>();

    @Override // p000a.p001a.p002a.p004b.C0007c
    /* renamed from: a */
    protected C0007c.c<K, V> mo4a(K k) {
        return this.f8e.get(k);
    }

    @Override // p000a.p001a.p002a.p004b.C0007c
    /* renamed from: b */
    public V mo5b(K k, V v) {
        C0007c.c<K, V> mo4a = mo4a((C0005a<K, V>) k);
        if (mo4a != null) {
            return mo4a.f14b;
        }
        this.f8e.put(k, m8a(k, v));
        return null;
    }

    /* renamed from: b */
    public Map.Entry<K, V> m6b(K k) {
        if (contains(k)) {
            return this.f8e.get(k).f16d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f8e.containsKey(k);
    }

    @Override // p000a.p001a.p002a.p004b.C0007c
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f8e.remove(k);
        return v;
    }
}
