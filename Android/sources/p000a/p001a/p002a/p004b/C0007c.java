package p000a.p001a.p002a.p004b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.a.a.b.c */
/* loaded from: classes.dex */
public class C0007c<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    private c<K, V> f9a;

    /* renamed from: b */
    private c<K, V> f10b;

    /* renamed from: c */
    private WeakHashMap<f<K, V>, Boolean> f11c = new WeakHashMap<>();

    /* renamed from: d */
    private int f12d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.c$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000a.p001a.p002a.p004b.C0007c.e
        /* renamed from: b */
        c<K, V> mo12b(c<K, V> cVar) {
            return cVar.f16d;
        }

        @Override // p000a.p001a.p002a.p004b.C0007c.e
        /* renamed from: c */
        c<K, V> mo13c(c<K, V> cVar) {
            return cVar.f15c;
        }
    }

    /* renamed from: a.a.a.b.c$b */
    /* loaded from: classes.dex */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000a.p001a.p002a.p004b.C0007c.e
        /* renamed from: b */
        c<K, V> mo12b(c<K, V> cVar) {
            return cVar.f15c;
        }

        @Override // p000a.p001a.p002a.p004b.C0007c.e
        /* renamed from: c */
        c<K, V> mo13c(c<K, V> cVar) {
            return cVar.f16d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.c$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f13a;

        /* renamed from: b */
        final V f14b;

        /* renamed from: c */
        c<K, V> f15c;

        /* renamed from: d */
        c<K, V> f16d;

        c(K k, V v) {
            this.f13a = k;
            this.f14b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f13a.equals(cVar.f13a) && this.f14b.equals(cVar.f14b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f13a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f14b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f13a + "=" + this.f14b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.a.a.b.c$d */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        private c<K, V> f17a;

        /* renamed from: b */
        private boolean f18b;

        private d() {
            this.f18b = true;
        }

        @Override // p000a.p001a.p002a.p004b.C0007c.f
        /* renamed from: a */
        public void mo14a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f17a;
            if (cVar == cVar2) {
                this.f17a = cVar2.f16d;
                this.f18b = this.f17a == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18b) {
                return C0007c.this.f9a != null;
            }
            c<K, V> cVar = this.f17a;
            return (cVar == null || cVar.f15c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f18b) {
                this.f18b = false;
                cVar = C0007c.this.f9a;
            } else {
                c<K, V> cVar2 = this.f17a;
                cVar = cVar2 != null ? cVar2.f15c : null;
            }
            this.f17a = cVar;
            return this.f17a;
        }
    }

    /* renamed from: a.a.a.b.c$e */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        c<K, V> f20a;

        /* renamed from: b */
        c<K, V> f21b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f20a = cVar2;
            this.f21b = cVar;
        }

        /* renamed from: a */
        private c<K, V> m15a() {
            c<K, V> cVar = this.f21b;
            c<K, V> cVar2 = this.f20a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo13c(cVar);
        }

        @Override // p000a.p001a.p002a.p004b.C0007c.f
        /* renamed from: a */
        public void mo14a(c<K, V> cVar) {
            if (this.f20a == cVar && cVar == this.f21b) {
                this.f21b = null;
                this.f20a = null;
            }
            c<K, V> cVar2 = this.f20a;
            if (cVar2 == cVar) {
                this.f20a = mo12b(cVar2);
            }
            if (this.f21b == cVar) {
                this.f21b = m15a();
            }
        }

        /* renamed from: b */
        abstract c<K, V> mo12b(c<K, V> cVar);

        /* renamed from: c */
        abstract c<K, V> mo13c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21b != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f21b;
            this.f21b = m15a();
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.c$f */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        /* renamed from: a */
        void mo14a(c<K, V> cVar);
    }

    /* renamed from: a */
    protected c<K, V> mo4a(K k) {
        c<K, V> cVar = this.f9a;
        while (cVar != null && !cVar.f13a.equals(k)) {
            cVar = cVar.f15c;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public c<K, V> m8a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f12d++;
        c<K, V> cVar2 = this.f10b;
        if (cVar2 == null) {
            this.f9a = cVar;
            this.f10b = this.f9a;
            return cVar;
        }
        cVar2.f15c = cVar;
        cVar.f16d = cVar2;
        this.f10b = cVar;
        return cVar;
    }

    /* renamed from: a */
    public Map.Entry<K, V> m9a() {
        return this.f9a;
    }

    /* renamed from: b */
    public C0007c<K, V>.d m10b() {
        C0007c<K, V>.d dVar = new d();
        this.f11c.put(dVar, false);
        return dVar;
    }

    /* renamed from: b */
    public V mo5b(K k, V v) {
        c<K, V> mo4a = mo4a((C0007c<K, V>) k);
        if (mo4a != null) {
            return mo4a.f14b;
        }
        m8a(k, v);
        return null;
    }

    /* renamed from: c */
    public Map.Entry<K, V> m11c() {
        return this.f10b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f10b, this.f9a);
        this.f11c.put(bVar, false);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0007c)) {
            return false;
        }
        C0007c c0007c = (C0007c) obj;
        if (size() != c0007c.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c0007c.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f9a, this.f10b);
        this.f11c.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> mo4a = mo4a((C0007c<K, V>) k);
        if (mo4a == null) {
            return null;
        }
        this.f12d--;
        if (!this.f11c.isEmpty()) {
            Iterator<f<K, V>> it = this.f11c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo14a(mo4a);
            }
        }
        c<K, V> cVar = mo4a.f16d;
        if (cVar != null) {
            cVar.f15c = mo4a.f15c;
        } else {
            this.f9a = mo4a.f15c;
        }
        c<K, V> cVar2 = mo4a.f15c;
        if (cVar2 != null) {
            cVar2.f16d = mo4a.f16d;
        } else {
            this.f10b = mo4a.f16d;
        }
        mo4a.f15c = null;
        mo4a.f16d = null;
        return mo4a.f14b;
    }

    public int size() {
        return this.f12d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
