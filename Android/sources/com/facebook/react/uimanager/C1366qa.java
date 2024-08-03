package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import com.facebook.react.uimanager.p127a.InterfaceC1295b;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.qa */
/* loaded from: classes.dex */
public class C1366qa {

    /* renamed from: a */
    private static final Map<Class, Map<String, j>> f5041a = new HashMap();

    /* renamed from: b */
    private static final Map<String, j> f5042b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$a */
    /* loaded from: classes.dex */
    public static class a extends j {
        public a(InterfaceC1294a interfaceC1294a, Method method) {
            super(interfaceC1294a, "Array", method);
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return c1271g.m5573a(this.f5051e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$b */
    /* loaded from: classes.dex */
    public static class b extends j {

        /* renamed from: i */
        private final boolean f5043i;

        public b(InterfaceC1294a interfaceC1294a, Method method, boolean z) {
            super(interfaceC1294a, "boolean", method);
            this.f5043i = z;
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return c1271g.m5574a(this.f5051e, this.f5043i) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$c */
    /* loaded from: classes.dex */
    public static class c extends j {
        public c(InterfaceC1294a interfaceC1294a, Method method) {
            super(interfaceC1294a, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            if (c1271g.m5579f(this.f5051e)) {
                return null;
            }
            return c1271g.m5574a(this.f5051e, false) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$d */
    /* loaded from: classes.dex */
    public static class d extends j {
        public d(InterfaceC1294a interfaceC1294a, Method method) {
            super(interfaceC1294a, "number", method);
        }

        public d(InterfaceC1295b interfaceC1295b, Method method, int i) {
            super(interfaceC1295b, "number", method, i);
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            if (c1271g.m5579f(this.f5051e)) {
                return null;
            }
            return Integer.valueOf(c1271g.m5572a(this.f5051e, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$e */
    /* loaded from: classes.dex */
    public static class e extends j {

        /* renamed from: i */
        private final double f5044i;

        public e(InterfaceC1294a interfaceC1294a, Method method, double d2) {
            super(interfaceC1294a, "number", method);
            this.f5044i = d2;
        }

        public e(InterfaceC1295b interfaceC1295b, Method method, int i, double d2) {
            super(interfaceC1295b, "number", method, i);
            this.f5044i = d2;
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return Double.valueOf(c1271g.m5570a(this.f5051e, this.f5044i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$f */
    /* loaded from: classes.dex */
    public static class f extends j {
        public f(InterfaceC1294a interfaceC1294a, Method method) {
            super(interfaceC1294a, "mixed", method);
        }

        public f(InterfaceC1295b interfaceC1295b, Method method, int i) {
            super(interfaceC1295b, "mixed", method, i);
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return c1271g.m5575b(this.f5051e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$g */
    /* loaded from: classes.dex */
    public static class g extends j {

        /* renamed from: i */
        private final float f5045i;

        public g(InterfaceC1294a interfaceC1294a, Method method, float f) {
            super(interfaceC1294a, "number", method);
            this.f5045i = f;
        }

        public g(InterfaceC1295b interfaceC1295b, Method method, int i, float f) {
            super(interfaceC1295b, "number", method, i);
            this.f5045i = f;
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return Float.valueOf(c1271g.m5571a(this.f5051e, this.f5045i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$h */
    /* loaded from: classes.dex */
    public static class h extends j {

        /* renamed from: i */
        private final int f5046i;

        public h(InterfaceC1294a interfaceC1294a, Method method, int i) {
            super(interfaceC1294a, "number", method);
            this.f5046i = i;
        }

        public h(InterfaceC1295b interfaceC1295b, Method method, int i, int i2) {
            super(interfaceC1295b, "number", method, i);
            this.f5046i = i2;
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return Integer.valueOf(c1271g.m5572a(this.f5051e, this.f5046i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$i */
    /* loaded from: classes.dex */
    public static class i extends j {
        public i(InterfaceC1294a interfaceC1294a, Method method) {
            super(interfaceC1294a, "Map", method);
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return c1271g.m5576c(this.f5051e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.uimanager.qa$j */
    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        private static final Object[] f5047a = new Object[2];

        /* renamed from: b */
        private static final Object[] f5048b = new Object[3];

        /* renamed from: c */
        private static final Object[] f5049c = new Object[1];

        /* renamed from: d */
        private static final Object[] f5050d = new Object[2];

        /* renamed from: e */
        protected final String f5051e;

        /* renamed from: f */
        protected final String f5052f;

        /* renamed from: g */
        protected final Method f5053g;

        /* renamed from: h */
        protected final Integer f5054h;

        private j(InterfaceC1294a interfaceC1294a, String str, Method method) {
            this.f5051e = interfaceC1294a.name();
            this.f5052f = "__default_type__".equals(interfaceC1294a.customType()) ? str : interfaceC1294a.customType();
            this.f5053g = method;
            this.f5054h = null;
        }

        private j(InterfaceC1295b interfaceC1295b, String str, Method method, int i) {
            this.f5051e = interfaceC1295b.names()[i];
            this.f5052f = "__default_type__".equals(interfaceC1295b.customType()) ? str : interfaceC1295b.customType();
            this.f5053g = method;
            this.f5054h = Integer.valueOf(i);
        }

        /* renamed from: a */
        protected abstract Object mo5900a(C1271G c1271g);

        /* renamed from: a */
        public String m5901a() {
            return this.f5051e;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public void m5902a(InterfaceC1269E interfaceC1269E, C1271G c1271g) {
            Object[] objArr;
            try {
                if (this.f5054h == null) {
                    f5049c[0] = mo5900a(c1271g);
                    this.f5053g.invoke(interfaceC1269E, f5049c);
                    objArr = f5049c;
                } else {
                    f5050d[0] = this.f5054h;
                    f5050d[1] = mo5900a(c1271g);
                    this.f5053g.invoke(interfaceC1269E, f5050d);
                    objArr = f5050d;
                }
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                C1700a.m6994a((Class<?>) ViewManager.class, "Error while updating prop " + this.f5051e, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f5051e + "' in shadow node of type: " + interfaceC1269E.mo5517t(), th);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public void m5903a(ViewManager viewManager, View view, C1271G c1271g) {
            Object[] objArr;
            try {
                if (this.f5054h == null) {
                    f5047a[0] = view;
                    f5047a[1] = mo5900a(c1271g);
                    this.f5053g.invoke(viewManager, f5047a);
                    objArr = f5047a;
                } else {
                    f5048b[0] = view;
                    f5048b[1] = this.f5054h;
                    f5048b[2] = mo5900a(c1271g);
                    this.f5053g.invoke(viewManager, f5048b);
                    objArr = f5048b;
                }
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                C1700a.m6994a((Class<?>) ViewManager.class, "Error while updating prop " + this.f5051e, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f5051e + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        /* renamed from: b */
        public String m5904b() {
            return this.f5052f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.qa$k */
    /* loaded from: classes.dex */
    public static class k extends j {
        public k(InterfaceC1294a interfaceC1294a, Method method) {
            super(interfaceC1294a, "String", method);
        }

        @Override // com.facebook.react.uimanager.C1366qa.j
        /* renamed from: a */
        protected Object mo5900a(C1271G c1271g) {
            return c1271g.m5577d(this.f5051e);
        }
    }

    /* renamed from: a */
    private static j m5893a(InterfaceC1294a interfaceC1294a, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new f(interfaceC1294a, method);
        }
        if (cls == Boolean.TYPE) {
            return new b(interfaceC1294a, method, interfaceC1294a.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new h(interfaceC1294a, method, interfaceC1294a.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new g(interfaceC1294a, method, interfaceC1294a.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new e(interfaceC1294a, method, interfaceC1294a.defaultDouble());
        }
        if (cls == String.class) {
            return new k(interfaceC1294a, method);
        }
        if (cls == Boolean.class) {
            return new c(interfaceC1294a, method);
        }
        if (cls == Integer.class) {
            return new d(interfaceC1294a, method);
        }
        if (cls == ReadableArray.class) {
            return new a(interfaceC1294a, method);
        }
        if (cls == ReadableMap.class) {
            return new i(interfaceC1294a, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, j> m5894a(Class<? extends InterfaceC1269E> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == InterfaceC1269E.class) {
                return f5042b;
            }
        }
        Map<String, j> map = f5041a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(m5894a(cls.getSuperclass()));
        m5897a(cls, hashMap);
        f5041a.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static void m5895a() {
        f5041a.clear();
        f5042b.clear();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static void m5896a(InterfaceC1295b interfaceC1295b, Method method, Class<?> cls, Map<String, j> map) {
        String[] names = interfaceC1295b.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < names.length) {
                map.put(names[i2], new f(interfaceC1295b, method, i2));
                i2++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new h(interfaceC1295b, method, i2, interfaceC1295b.defaultInt()));
                i2++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new g(interfaceC1295b, method, i2, interfaceC1295b.defaultFloat()));
                i2++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new e(interfaceC1295b, method, i2, interfaceC1295b.defaultDouble()));
                i2++;
            }
            return;
        }
        if (cls == Integer.class) {
            while (i2 < names.length) {
                map.put(names[i2], new d(interfaceC1295b, method, i2));
                i2++;
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* renamed from: a */
    private static void m5897a(Class<? extends InterfaceC1269E> cls, Map<String, j> map) {
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC1294a interfaceC1294a = (InterfaceC1294a) method.getAnnotation(InterfaceC1294a.class);
            if (interfaceC1294a != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(interfaceC1294a.name(), m5893a(interfaceC1294a, method, parameterTypes[0]));
            }
            InterfaceC1295b interfaceC1295b = (InterfaceC1295b) method.getAnnotation(InterfaceC1295b.class);
            if (interfaceC1295b != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                m5896a(interfaceC1295b, method, parameterTypes2[1], map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Map<String, j> m5898b(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f5042b;
        }
        Map<String, j> map = f5041a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(m5898b(cls.getSuperclass()));
        m5899b(cls, hashMap);
        f5041a.put(cls, hashMap);
        return hashMap;
    }

    /* renamed from: b */
    private static void m5899b(Class<? extends ViewManager> cls, Map<String, j> map) {
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC1294a interfaceC1294a = (InterfaceC1294a) method.getAnnotation(InterfaceC1294a.class);
            if (interfaceC1294a != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(interfaceC1294a.name(), m5893a(interfaceC1294a, method, parameterTypes[1]));
            }
            InterfaceC1295b interfaceC1295b = (InterfaceC1295b) method.getAnnotation(InterfaceC1295b.class);
            if (interfaceC1295b != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                m5896a(interfaceC1295b, method, parameterTypes2[2], map);
            }
        }
    }
}
