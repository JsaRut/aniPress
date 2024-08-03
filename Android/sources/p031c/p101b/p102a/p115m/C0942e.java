package p031c.p101b.p102a.p115m;

import java.lang.reflect.Method;

/* renamed from: c.b.a.m.e */
/* loaded from: classes.dex */
public class C0942e {
    /* renamed from: a */
    public static Object m4751a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if ((objArr != null ? objArr.length : 0) != (clsArr != null ? clsArr.length : 0)) {
            throw new IllegalArgumentException("argClasses' size is not equal to args' size");
        }
        Method method = obj.getClass().getMethod(str, clsArr);
        boolean isAccessible = method.isAccessible();
        if (!isAccessible) {
            method.setAccessible(true);
        }
        Object obj2 = null;
        try {
            obj2 = method.invoke(obj, objArr);
            e = null;
        } catch (Exception e2) {
            e = e2;
        }
        if (!isAccessible) {
            method.setAccessible(false);
        }
        if (e == null) {
            return obj2;
        }
        throw e;
    }
}
