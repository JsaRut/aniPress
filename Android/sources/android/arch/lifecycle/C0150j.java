package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.j */
/* loaded from: classes.dex */
public class C0150j {

    /* renamed from: a */
    private static Map<Class, Integer> f606a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends InterfaceC0143c>>> f607b = new HashMap();

    /* renamed from: a */
    public static GenericLifecycleObserver m730a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class<?> cls = obj.getClass();
        if (m734b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends InterfaceC0143c>> list = f607b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m731a(list.get(0), obj));
        }
        InterfaceC0143c[] interfaceC0143cArr = new InterfaceC0143c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            interfaceC0143cArr[i] = m731a(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0143cArr);
    }

    /* renamed from: a */
    private static InterfaceC0143c m731a(Constructor<? extends InterfaceC0143c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public static String m732a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: a */
    private static Constructor<? extends InterfaceC0143c> m733a(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m732a = m732a(canonicalName);
            if (!name.isEmpty()) {
                m732a = name + "." + m732a;
            }
            Constructor declaredConstructor = Class.forName(m732a).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    private static int m734b(Class<?> cls) {
        if (f606a.containsKey(cls)) {
            return f606a.get(cls).intValue();
        }
        int m736d = m736d(cls);
        f606a.put(cls, Integer.valueOf(m736d));
        return m736d;
    }

    /* renamed from: c */
    private static boolean m735c(Class<?> cls) {
        return cls != null && InterfaceC0145e.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m736d(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0143c> m733a = m733a(cls);
        if (m733a != null) {
            f607b.put(cls, Collections.singletonList(m733a));
            return 2;
        }
        if (C0141a.f581a.m705b(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m735c(superclass)) {
            if (m734b(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f607b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m735c(cls2)) {
                if (m734b(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f607b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f607b.put(cls, arrayList);
        return 2;
    }
}
