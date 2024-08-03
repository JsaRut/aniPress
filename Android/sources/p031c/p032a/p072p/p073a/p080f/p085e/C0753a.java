package p031c.p032a.p072p.p073a.p080f.p085e;

import java.lang.reflect.Field;

/* renamed from: c.a.p.a.f.e.a */
/* loaded from: classes.dex */
public final class C0753a {
    /* renamed from: a */
    public static Object m3776a(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(null);
    }

    /* renamed from: a */
    public static Object m3777a(Object obj, String str, Object[] objArr, Class[] clsArr) {
        if (obj == null) {
            throw new Exception("owner can not be null");
        }
        if ((objArr != null ? objArr.length : 0) == (clsArr != null ? clsArr.length : 0)) {
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        }
        throw new Exception("argClasses' size is not equal to args' size");
    }
}
