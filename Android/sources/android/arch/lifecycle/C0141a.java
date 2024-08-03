package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.a */
/* loaded from: classes.dex */
class C0141a {

    /* renamed from: a */
    static C0141a f581a = new C0141a();

    /* renamed from: b */
    private final Map<Class, a> f582b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f583c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map<AbstractC0144d.a, List<b>> f584a = new HashMap();

        /* renamed from: b */
        final Map<b, AbstractC0144d.a> f585b;

        a(Map<b, AbstractC0144d.a> map) {
            this.f585b = map;
            for (Map.Entry<b, AbstractC0144d.a> entry : map.entrySet()) {
                AbstractC0144d.a value = entry.getValue();
                List<b> list = this.f584a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f584a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m706a(List<b> list, InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m708a(interfaceC0146f, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m707a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar, Object obj) {
            m706a(this.f584a.get(aVar), interfaceC0146f, aVar, obj);
            m706a(this.f584a.get(AbstractC0144d.a.ON_ANY), interfaceC0146f, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int f586a;

        /* renamed from: b */
        final Method f587b;

        b(int i, Method method) {
            this.f586a = i;
            this.f587b = method;
            this.f587b.setAccessible(true);
        }

        /* renamed from: a */
        void m708a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar, Object obj) {
            try {
                int i = this.f586a;
                if (i == 0) {
                    this.f587b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f587b.invoke(obj, interfaceC0146f);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f587b.invoke(obj, interfaceC0146f, aVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f586a == bVar.f586a && this.f587b.getName().equals(bVar.f587b.getName());
        }

        public int hashCode() {
            return (this.f586a * 31) + this.f587b.getName().hashCode();
        }
    }

    C0141a() {
    }

    /* renamed from: a */
    private a m701a(Class cls, Method[] methodArr) {
        int i;
        a m704a;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m704a = m704a(superclass)) != null) {
            hashMap.putAll(m704a.f585b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0144d.a> entry : m704a(cls2).f585b.entrySet()) {
                m702a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m703c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0155o interfaceC0155o = (InterfaceC0155o) method.getAnnotation(InterfaceC0155o.class);
            if (interfaceC0155o != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0146f.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC0144d.a value = interfaceC0155o.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0144d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0144d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m702a(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        a aVar = new a(hashMap);
        this.f582b.put(cls, aVar);
        this.f583c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m702a(Map<b, AbstractC0144d.a> map, b bVar, AbstractC0144d.a aVar, Class cls) {
        AbstractC0144d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f587b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* renamed from: c */
    private Method[] m703c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public a m704a(Class cls) {
        a aVar = this.f582b.get(cls);
        return aVar != null ? aVar : m701a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m705b(Class cls) {
        if (this.f583c.containsKey(cls)) {
            return this.f583c.get(cls).booleanValue();
        }
        Method[] m703c = m703c(cls);
        for (Method method : m703c) {
            if (((InterfaceC0155o) method.getAnnotation(InterfaceC0155o.class)) != null) {
                m701a(cls, m703c);
                return true;
            }
        }
        this.f583c.put(cls, false);
        return false;
    }
}
