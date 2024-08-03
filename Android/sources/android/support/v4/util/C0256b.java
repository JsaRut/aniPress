package android.support.v4.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.util.b */
/* loaded from: classes.dex */
public class C0256b<K, V> extends C0269o<K, V> implements Map<K, V> {

    /* renamed from: h */
    AbstractC0264j<K, V> f1062h;

    public C0256b() {
    }

    public C0256b(int i) {
        super(i);
    }

    /* renamed from: b */
    private AbstractC0264j<K, V> m1337b() {
        if (this.f1062h == null) {
            this.f1062h = new C0255a(this);
        }
        return this.f1062h;
    }

    /* renamed from: a */
    public boolean m1338a(Collection<?> collection) {
        return AbstractC0264j.m1375c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m1337b().m1378d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m1337b().m1379e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m1393a(this.f1114g + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m1337b().m1380f();
    }
}
