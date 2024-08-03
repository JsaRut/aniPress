package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.util.C0269o;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000a.p005b.p009c.p010a.p011a.C0025c;
import p000a.p005b.p009c.p017f.C0058f;

/* renamed from: a.b.c.b.e */
/* loaded from: classes.dex */
class C0039e extends C0044j {

    /* renamed from: a */
    private static final Class f155a;

    /* renamed from: b */
    private static final Constructor f156b;

    /* renamed from: c */
    private static final Method f157c;

    /* renamed from: d */
    private static final Method f158d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f156b = constructor;
        f155a = cls;
        f157c = method2;
        f158d = method;
    }

    /* renamed from: a */
    private static Typeface m196a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f155a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f158d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static boolean m197a() {
        if (f157c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f157c != null;
    }

    /* renamed from: a */
    private static boolean m198a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f157c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    private static Object m199b() {
        try {
            return f156b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000a.p005b.p009c.p012b.C0044j
    /* renamed from: a */
    public Typeface mo200a(Context context, C0025c.b bVar, Resources resources, int i) {
        Object m199b = m199b();
        for (C0025c.c cVar : bVar.m118a()) {
            ByteBuffer m223a = C0045k.m223a(context, resources, cVar.m120b());
            if (m223a == null || !m198a(m199b, m223a, cVar.m121c(), cVar.m123e(), cVar.m124f())) {
                return null;
            }
        }
        return m196a(m199b);
    }

    @Override // p000a.p005b.p009c.p012b.C0044j
    /* renamed from: a */
    public Typeface mo195a(Context context, CancellationSignal cancellationSignal, C0058f.b[] bVarArr, int i) {
        Object m199b = m199b();
        C0269o c0269o = new C0269o();
        for (C0058f.b bVar : bVarArr) {
            Uri m256c = bVar.m256c();
            ByteBuffer byteBuffer = (ByteBuffer) c0269o.get(m256c);
            if (byteBuffer == null) {
                byteBuffer = C0045k.m224a(context, cancellationSignal, m256c);
                c0269o.put(m256c, byteBuffer);
            }
            if (!m198a(m199b, byteBuffer, bVar.m255b(), bVar.m257d(), bVar.m258e())) {
                return null;
            }
        }
        return Typeface.create(m196a(m199b), i);
    }
}
