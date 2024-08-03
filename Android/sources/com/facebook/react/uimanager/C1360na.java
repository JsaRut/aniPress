package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.C1366qa;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.uimanager.na */
/* loaded from: classes.dex */
public class C1360na {

    /* renamed from: a */
    private static final Map<Class<?>, e<?, ?>> f5026a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, d<?>> f5027b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.na$a */
    /* loaded from: classes.dex */
    public static class a<T extends InterfaceC1269E> implements d<T> {

        /* renamed from: a */
        private final Map<String, C1366qa.j> f5028a;

        private a(Class<? extends InterfaceC1269E> cls) {
            this.f5028a = C1366qa.m5894a(cls);
        }

        @Override // com.facebook.react.uimanager.C1360na.d
        /* renamed from: a */
        public void mo5863a(InterfaceC1269E interfaceC1269E, String str, C1271G c1271g) {
            C1366qa.j jVar = this.f5028a.get(str);
            if (jVar != null) {
                jVar.m5902a(interfaceC1269E, c1271g);
            }
        }

        @Override // com.facebook.react.uimanager.C1360na.c
        /* renamed from: a */
        public void mo5864a(Map<String, String> map) {
            for (C1366qa.j jVar : this.f5028a.values()) {
                map.put(jVar.m5901a(), jVar.m5904b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.na$b */
    /* loaded from: classes.dex */
    public static class b<T extends ViewManager, V extends View> implements e<T, V> {

        /* renamed from: a */
        private final Map<String, C1366qa.j> f5029a;

        private b(Class<? extends ViewManager> cls) {
            this.f5029a = C1366qa.m5898b(cls);
        }

        @Override // com.facebook.react.uimanager.C1360na.e
        /* renamed from: a */
        public void mo5865a(T t, V v, String str, C1271G c1271g) {
            C1366qa.j jVar = this.f5029a.get(str);
            if (jVar != null) {
                jVar.m5903a(t, v, c1271g);
            }
        }

        @Override // com.facebook.react.uimanager.C1360na.c
        /* renamed from: a */
        public void mo5864a(Map<String, String> map) {
            for (C1366qa.j jVar : this.f5029a.values()) {
                map.put(jVar.m5901a(), jVar.m5904b());
            }
        }
    }

    /* renamed from: com.facebook.react.uimanager.na$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo5864a(Map<String, String> map);
    }

    /* renamed from: com.facebook.react.uimanager.na$d */
    /* loaded from: classes.dex */
    public interface d<T extends InterfaceC1269E> extends c {
        /* renamed from: a */
        void mo5863a(T t, String str, C1271G c1271g);
    }

    /* renamed from: com.facebook.react.uimanager.na$e */
    /* loaded from: classes.dex */
    public interface e<T extends ViewManager, V extends View> extends c {
        /* renamed from: a */
        void mo5865a(T t, V v, String str, C1271G c1271g);
    }

    /* renamed from: a */
    private static <T> T m5856a(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            C1700a.m7015d("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m5857a(Class<? extends ViewManager> cls, Class<? extends InterfaceC1269E> cls2) {
        HashMap hashMap = new HashMap();
        m5861b(cls).mo5864a(hashMap);
        m5862c(cls2).mo5864a(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public static void m5858a() {
        C1366qa.m5895a();
        f5026a.clear();
        f5027b.clear();
    }

    /* renamed from: a */
    public static <T extends InterfaceC1269E> void m5859a(T t, C1271G c1271g) {
        d m5862c = m5862c(t.getClass());
        ReadableMapKeySetIterator keySetIterator = c1271g.f4754a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            m5862c.mo5863a(t, keySetIterator.nextKey(), c1271g);
        }
    }

    /* renamed from: a */
    public static <T extends ViewManager, V extends View> void m5860a(T t, V v, C1271G c1271g) {
        e m5861b = m5861b(t.getClass());
        ReadableMapKeySetIterator keySetIterator = c1271g.f4754a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            m5861b.mo5865a(t, v, keySetIterator.nextKey(), c1271g);
        }
    }

    /* renamed from: b */
    private static <T extends ViewManager, V extends View> e<T, V> m5861b(Class<? extends ViewManager> cls) {
        e<T, V> eVar = (e) f5026a.get(cls);
        if (eVar == null) {
            eVar = (e) m5856a(cls);
            if (eVar == null) {
                eVar = new b<>(cls);
            }
            f5026a.put(cls, eVar);
        }
        return eVar;
    }

    /* renamed from: c */
    private static <T extends InterfaceC1269E> d<T> m5862c(Class<? extends InterfaceC1269E> cls) {
        d<T> dVar = (d) f5027b.get(cls);
        if (dVar == null) {
            dVar = (d) m5856a(cls);
            if (dVar == null) {
                dVar = new a<>(cls);
            }
            f5027b.put(cls, dVar);
        }
        return dVar;
    }
}
