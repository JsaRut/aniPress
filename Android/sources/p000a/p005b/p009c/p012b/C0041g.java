package p000a.p005b.p009c.p012b;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.c.b.g */
/* loaded from: classes.dex */
public class C0041g extends C0040f {
    @Override // p000a.p005b.p009c.p012b.C0040f
    /* renamed from: a */
    protected Typeface mo208a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f159a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f165g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000a.p005b.p009c.p012b.C0040f
    /* renamed from: d */
    protected Method mo213d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
