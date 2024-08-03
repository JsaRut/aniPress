package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.common.f */
/* loaded from: classes.dex */
public class C1104f {

    /* renamed from: com.facebook.react.common.f$a */
    /* loaded from: classes.dex */
    public static final class a<K, V> {

        /* renamed from: a */
        private Map f4368a;

        /* renamed from: b */
        private boolean f4369b;

        private a() {
            this.f4368a = C1104f.m5182b();
            this.f4369b = true;
        }

        /* renamed from: a */
        public a<K, V> m5184a(K k, V v) {
            if (!this.f4369b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f4368a.put(k, v);
            return this;
        }

        /* renamed from: a */
        public Map<K, V> m5185a() {
            if (!this.f4369b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f4369b = false;
            return this.f4368a;
        }
    }

    /* renamed from: a */
    public static <K, V> a<K, V> m5175a() {
        return new a<>();
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5176a(K k, V v) {
        Map<K, V> m5183c = m5183c();
        m5183c.put(k, v);
        return m5183c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5177a(K k, V v, K k2, V v2) {
        Map<K, V> m5183c = m5183c();
        m5183c.put(k, v);
        m5183c.put(k2, v2);
        return m5183c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5178a(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> m5183c = m5183c();
        m5183c.put(k, v);
        m5183c.put(k2, v2);
        m5183c.put(k3, v3);
        return m5183c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5179a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> m5183c = m5183c();
        m5183c.put(k, v);
        m5183c.put(k2, v2);
        m5183c.put(k3, v3);
        m5183c.put(k4, v4);
        return m5183c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5180a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> m5183c = m5183c();
        m5183c.put(k, v);
        m5183c.put(k2, v2);
        m5183c.put(k3, v3);
        m5183c.put(k4, v4);
        m5183c.put(k5, v5);
        return m5183c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5181a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> m5183c = m5183c();
        m5183c.put(k, v);
        m5183c.put(k2, v2);
        m5183c.put(k3, v3);
        m5183c.put(k4, v4);
        m5183c.put(k5, v5);
        m5183c.put(k6, v6);
        return m5183c;
    }

    /* renamed from: b */
    public static <K, V> HashMap<K, V> m5182b() {
        return new HashMap<>();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m5183c() {
        return m5182b();
    }
}
