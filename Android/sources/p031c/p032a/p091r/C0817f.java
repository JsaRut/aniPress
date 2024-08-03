package p031c.p032a.p091r;

/* renamed from: c.a.r.f */
/* loaded from: classes.dex */
public final class C0817f {
    /* renamed from: a */
    public static Object m3983a(Class<?> cls, String str, Object[] objArr, Class[] clsArr) {
        m3986a(cls);
        m3987a(clsArr, objArr);
        return cls.getMethod(str, clsArr).invoke(cls, objArr);
    }

    /* renamed from: a */
    public static <T> T m3984a(Class<T> cls, Object[] objArr, Class<?>[] clsArr) {
        m3986a(cls);
        m3987a(clsArr, objArr);
        return cls.getConstructor(clsArr).newInstance(objArr);
    }

    /* renamed from: a */
    public static Object m3985a(Object obj, String str, Object[] objArr, Class[] clsArr) {
        m3986a(obj);
        m3987a(clsArr, objArr);
        return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
    }

    /* renamed from: a */
    private static void m3986a(Object obj) {
        if (obj == null) {
            throw new Exception("owner can not be null");
        }
    }

    /* renamed from: a */
    private static void m3987a(Class<?>[] clsArr, Object[] objArr) {
        if ((objArr != null ? objArr.length : 0) != (clsArr != null ? clsArr.length : 0)) {
            throw new Exception("argClasses' size is not equal to args' size");
        }
    }
}
