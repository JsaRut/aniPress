package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.util.j */
/* loaded from: classes.dex */
public abstract class AbstractC0264j<K, V> {

    /* renamed from: a */
    AbstractC0264j<K, V>.b f1092a;

    /* renamed from: b */
    AbstractC0264j<K, V>.c f1093b;

    /* renamed from: c */
    AbstractC0264j<K, V>.e f1094c;

    /* renamed from: android.support.v4.util.j$a */
    /* loaded from: classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1095a;

        /* renamed from: b */
        int f1096b;

        /* renamed from: c */
        int f1097c;

        /* renamed from: d */
        boolean f1098d = false;

        a(int i) {
            this.f1095a = i;
            this.f1096b = AbstractC0264j.this.mo1336c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1097c < this.f1096b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0264j.this.mo1329a(this.f1097c, this.f1095a);
            this.f1097c++;
            this.f1098d = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1098d) {
                throw new IllegalStateException();
            }
            this.f1097c--;
            this.f1096b--;
            this.f1098d = false;
            AbstractC0264j.this.mo1332a(this.f1097c);
        }
    }

    /* renamed from: android.support.v4.util.j$b */
    /* loaded from: classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        /* renamed from: a */
        public boolean m1381a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m1381a((Map.Entry) obj);
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo1336c = AbstractC0264j.this.mo1336c();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0264j.this.mo1333a((AbstractC0264j) entry.getKey(), (K) entry.getValue());
            }
            return mo1336c != AbstractC0264j.this.mo1336c();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0264j.this.mo1331a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo1328a = AbstractC0264j.this.mo1328a(entry.getKey());
            if (mo1328a < 0) {
                return false;
            }
            return C0259e.m1350a(AbstractC0264j.this.mo1329a(mo1328a, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0264j.m1373a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo1336c = AbstractC0264j.this.mo1336c() - 1; mo1336c >= 0; mo1336c--) {
                Object mo1329a = AbstractC0264j.this.mo1329a(mo1336c, 0);
                Object mo1329a2 = AbstractC0264j.this.mo1329a(mo1336c, 1);
                i += (mo1329a == null ? 0 : mo1329a.hashCode()) ^ (mo1329a2 == null ? 0 : mo1329a2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0264j.this.mo1336c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0264j.this.mo1336c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.util.j$c */
    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0264j.this.mo1331a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0264j.this.mo1328a(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0264j.m1372a((Map) AbstractC0264j.this.mo1335b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0264j.m1373a((Set) this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo1336c = AbstractC0264j.this.mo1336c() - 1; mo1336c >= 0; mo1336c--) {
                Object mo1329a = AbstractC0264j.this.mo1329a(mo1336c, 0);
                i += mo1329a == null ? 0 : mo1329a.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0264j.this.mo1336c() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo1328a = AbstractC0264j.this.mo1328a(obj);
            if (mo1328a < 0) {
                return false;
            }
            AbstractC0264j.this.mo1332a(mo1328a);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0264j.m1374b(AbstractC0264j.this.mo1335b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0264j.m1375c(AbstractC0264j.this.mo1335b(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0264j.this.mo1336c();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0264j.this.m1377b(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0264j.this.m1376a(tArr, 0);
        }
    }

    /* renamed from: android.support.v4.util.j$d */
    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f1102a;

        /* renamed from: c */
        boolean f1104c = false;

        /* renamed from: b */
        int f1103b = -1;

        d() {
            this.f1102a = AbstractC0264j.this.mo1336c() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1104c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0259e.m1350a(entry.getKey(), AbstractC0264j.this.mo1329a(this.f1103b, 0)) && C0259e.m1350a(entry.getValue(), AbstractC0264j.this.mo1329a(this.f1103b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1104c) {
                return (K) AbstractC0264j.this.mo1329a(this.f1103b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1104c) {
                return (V) AbstractC0264j.this.mo1329a(this.f1103b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1103b < this.f1102a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1104c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo1329a = AbstractC0264j.this.mo1329a(this.f1103b, 0);
            Object mo1329a2 = AbstractC0264j.this.mo1329a(this.f1103b, 1);
            return (mo1329a == null ? 0 : mo1329a.hashCode()) ^ (mo1329a2 != null ? mo1329a2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            next();
            return this;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1103b++;
            this.f1104c = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1104c) {
                throw new IllegalStateException();
            }
            AbstractC0264j.this.mo1332a(this.f1103b);
            this.f1103b--;
            this.f1102a--;
            this.f1104c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f1104c) {
                return (V) AbstractC0264j.this.mo1330a(this.f1103b, (int) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.util.j$e */
    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0264j.this.mo1331a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0264j.this.mo1334b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0264j.this.mo1336c() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo1334b = AbstractC0264j.this.mo1334b(obj);
            if (mo1334b < 0) {
                return false;
            }
            AbstractC0264j.this.mo1332a(mo1334b);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo1336c = AbstractC0264j.this.mo1336c();
            int i = 0;
            boolean z = false;
            while (i < mo1336c) {
                if (collection.contains(AbstractC0264j.this.mo1329a(i, 1))) {
                    AbstractC0264j.this.mo1332a(i);
                    i--;
                    mo1336c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo1336c = AbstractC0264j.this.mo1336c();
            int i = 0;
            boolean z = false;
            while (i < mo1336c) {
                if (!collection.contains(AbstractC0264j.this.mo1329a(i, 1))) {
                    AbstractC0264j.this.mo1332a(i);
                    i--;
                    mo1336c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0264j.this.mo1336c();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0264j.this.m1377b(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0264j.this.m1376a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m1372a(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m1373a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m1374b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m1375c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract int mo1328a(Object obj);

    /* renamed from: a */
    protected abstract Object mo1329a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo1330a(int i, V v);

    /* renamed from: a */
    protected abstract void mo1331a();

    /* renamed from: a */
    protected abstract void mo1332a(int i);

    /* renamed from: a */
    protected abstract void mo1333a(K k, V v);

    /* renamed from: a */
    public <T> T[] m1376a(T[] tArr, int i) {
        int mo1336c = mo1336c();
        if (tArr.length < mo1336c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo1336c));
        }
        for (int i2 = 0; i2 < mo1336c; i2++) {
            tArr[i2] = mo1329a(i2, i);
        }
        if (tArr.length > mo1336c) {
            tArr[mo1336c] = null;
        }
        return tArr;
    }

    /* renamed from: b */
    protected abstract int mo1334b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo1335b();

    /* renamed from: b */
    public Object[] m1377b(int i) {
        int mo1336c = mo1336c();
        Object[] objArr = new Object[mo1336c];
        for (int i2 = 0; i2 < mo1336c; i2++) {
            objArr[i2] = mo1329a(i2, i);
        }
        return objArr;
    }

    /* renamed from: c */
    protected abstract int mo1336c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> m1378d() {
        if (this.f1092a == null) {
            this.f1092a = new b();
        }
        return this.f1092a;
    }

    /* renamed from: e */
    public Set<K> m1379e() {
        if (this.f1093b == null) {
            this.f1093b = new c();
        }
        return this.f1093b;
    }

    /* renamed from: f */
    public Collection<V> m1380f() {
        if (this.f1094c == null) {
            this.f1094c = new e();
        }
        return this.f1094c;
    }
}
