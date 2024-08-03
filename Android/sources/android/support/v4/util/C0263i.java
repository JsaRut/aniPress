package android.support.v4.util;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: android.support.v4.util.i */
/* loaded from: classes.dex */
public class C0263i<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f1084a;

    /* renamed from: b */
    private int f1085b;

    /* renamed from: c */
    private int f1086c;

    /* renamed from: d */
    private int f1087d;

    /* renamed from: e */
    private int f1088e;

    /* renamed from: f */
    private int f1089f;

    /* renamed from: g */
    private int f1090g;

    /* renamed from: h */
    private int f1091h;

    public C0263i(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1086c = i;
        this.f1084a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: c */
    private int m1365c(K k, V v) {
        int m1370b = m1370b(k, v);
        if (m1370b >= 0) {
            return m1370b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V m1366a(K k) {
        return null;
    }

    /* renamed from: a */
    public final V m1367a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1087d++;
            this.f1085b += m1365c(k, v);
            put = this.f1084a.put(k, v);
            if (put != null) {
                this.f1085b -= m1365c(k, put);
            }
        }
        if (put != null) {
            m1369a(false, k, put, v);
        }
        m1368a(this.f1086c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:            throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1368a(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f1085b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f1084a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f1085b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f1085b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f1084a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f1084a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f1084a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1085b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m1365c(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f1085b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f1089f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f1089f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.m1369a(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.C0263i.m1368a(int):void");
    }

    /* renamed from: a */
    protected void m1369a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: b */
    protected int m1370b(K k, V v) {
        return 1;
    }

    /* renamed from: b */
    public final V m1371b(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f1084a.get(k);
            if (v2 != null) {
                this.f1090g++;
                return v2;
            }
            this.f1091h++;
            V m1366a = m1366a((C0263i<K, V>) k);
            if (m1366a == null) {
                return null;
            }
            synchronized (this) {
                this.f1088e++;
                v = (V) this.f1084a.put(k, m1366a);
                if (v != null) {
                    this.f1084a.put(k, v);
                } else {
                    this.f1085b += m1365c(k, m1366a);
                }
            }
            if (v != null) {
                m1369a(false, k, m1366a, v);
                return v;
            }
            m1368a(this.f1086c);
            return m1366a;
        }
    }

    public final synchronized String toString() {
        int i;
        i = this.f1090g + this.f1091h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1086c), Integer.valueOf(this.f1090g), Integer.valueOf(this.f1091h), Integer.valueOf(i != 0 ? (this.f1090g * 100) / i : 0));
    }
}
