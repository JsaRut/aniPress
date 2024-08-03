package p139d.p143b.p184i.p190d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p139d.p143b.p148c.p152d.InterfaceC1692k;

/* renamed from: d.b.i.d.n */
/* loaded from: classes.dex */
public class C1864n<K, V> {

    /* renamed from: a */
    private final InterfaceC1850G<V> f6817a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f6818b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f6819c = 0;

    public C1864n(InterfaceC1850G<V> interfaceC1850G) {
        this.f6817a = interfaceC1850G;
    }

    /* renamed from: c */
    private int m7604c(V v) {
        if (v == null) {
            return 0;
        }
        return this.f6817a.mo7579a(v);
    }

    /* renamed from: a */
    public synchronized int m7605a() {
        return this.f6818b.size();
    }

    /* renamed from: a */
    public synchronized V m7606a(K k) {
        return this.f6818b.get(k);
    }

    /* renamed from: a */
    public synchronized V m7607a(K k, V v) {
        V remove;
        remove = this.f6818b.remove(k);
        this.f6819c -= m7604c(remove);
        this.f6818b.put(k, v);
        this.f6819c += m7604c(v);
        return remove;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized ArrayList<Map.Entry<K, V>> m7608a(InterfaceC1692k<K> interfaceC1692k) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f6818b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f6818b.entrySet()) {
            if (interfaceC1692k == null || interfaceC1692k.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized K m7609b() {
        return this.f6818b.isEmpty() ? null : this.f6818b.keySet().iterator().next();
    }

    /* renamed from: b */
    public synchronized V m7610b(K k) {
        V remove;
        remove = this.f6818b.remove(k);
        this.f6819c -= m7604c(remove);
        return remove;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public synchronized ArrayList<V> m7611b(InterfaceC1692k<K> interfaceC1692k) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f6818b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (interfaceC1692k == null || interfaceC1692k.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f6819c -= m7604c(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized int m7612c() {
        return this.f6819c;
    }
}
