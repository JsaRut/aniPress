package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import p000a.p005b.p009c.p010a.p011a.C0025c;

/* renamed from: a.b.c.b.f */
/* loaded from: classes.dex */
public class C0040f extends C0038d {

    /* renamed from: a */
    protected final Class f159a;

    /* renamed from: b */
    protected final Constructor f160b;

    /* renamed from: c */
    protected final Method f161c;

    /* renamed from: d */
    protected final Method f162d;

    /* renamed from: e */
    protected final Method f163e;

    /* renamed from: f */
    protected final Method f164f;

    /* renamed from: g */
    protected final Method f165g;

    public C0040f() {
        Method method;
        Constructor constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls = null;
        try {
            Class m209a = m209a();
            constructor = m214e(m209a);
            method2 = m211b(m209a);
            method3 = m212c(m209a);
            method4 = m215f(m209a);
            method5 = m210a(m209a);
            method = mo213d(m209a);
            cls = m209a;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f159a = cls;
        this.f160b = constructor;
        this.f161c = method2;
        this.f162d = method3;
        this.f163e = method4;
        this.f164f = method5;
        this.f165g = method;
    }

    /* renamed from: a */
    private boolean m201a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f161c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    private boolean m202a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f162d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    private void m203b(Object obj) {
        try {
            this.f164f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    private boolean m204b() {
        if (this.f161c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f161c != null;
    }

    /* renamed from: c */
    private Object m205c() {
        try {
            return this.f160b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    private boolean m206c(Object obj) {
        try {
            return ((Boolean) this.f163e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000a.p005b.p009c.p012b.C0044j
    /* renamed from: a */
    public Typeface mo200a(Context context, C0025c.b bVar, Resources resources, int i) {
        if (!m204b()) {
            return super.mo200a(context, bVar, resources, i);
        }
        Object m205c = m205c();
        for (C0025c.c cVar : bVar.m118a()) {
            if (!m201a(context, m205c, cVar.m119a(), cVar.m121c(), cVar.m123e(), cVar.m124f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m122d()))) {
                m203b(m205c);
                return null;
            }
        }
        if (m206c(m205c)) {
            return mo208a(m205c);
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p012b.C0044j
    /* renamed from: a */
    public Typeface mo207a(Context context, Resources resources, int i, String str, int i2) {
        if (!m204b()) {
            return super.mo207a(context, resources, i, str, i2);
        }
        Object m205c = m205c();
        if (!m201a(context, m205c, str, 0, -1, -1, null)) {
            m203b(m205c);
            return null;
        }
        if (m206c(m205c)) {
            return mo208a(m205c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[Catch: IOException -> 0x005e, SYNTHETIC, TRY_LEAVE, TryCatch #3 {IOException -> 0x005e, blocks: (B:9:0x0014, B:12:0x0022, B:17:0x0045, B:24:0x005a, B:25:0x005d), top: B:8:0x0014 }] */
    @Override // p000a.p005b.p009c.p012b.C0038d, p000a.p005b.p009c.p012b.C0044j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface mo195a(android.content.Context r12, android.os.CancellationSignal r13, p000a.p005b.p009c.p017f.C0058f.b[] r14, int r15) {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            boolean r0 = r11.m204b()
            if (r0 != 0) goto L5f
            a.b.c.f.f$b r14 = r11.m220a(r14, r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.m256c()     // Catch: java.io.IOException -> L5e
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch: java.io.IOException -> L5e
            if (r12 != 0) goto L26
            if (r12 == 0) goto L25
            r12.close()     // Catch: java.io.IOException -> L5e
        L25:
            return r2
        L26:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            int r15 = r14.m257d()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            boolean r14 = r14.m258e()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            android.graphics.Typeface r13 = r13.build()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4c
            if (r12 == 0) goto L48
            r12.close()     // Catch: java.io.IOException -> L5e
        L48:
            return r13
        L49:
            r13 = move-exception
            r14 = r2
            goto L52
        L4c:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L4e
        L4e:
            r14 = move-exception
            r10 = r14
            r14 = r13
            r13 = r10
        L52:
            if (r12 == 0) goto L5d
            if (r14 == 0) goto L5a
            r12.close()     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L5a:
            r12.close()     // Catch: java.io.IOException -> L5e
        L5d:
            throw r13     // Catch: java.io.IOException -> L5e
        L5e:
            return r2
        L5f:
            java.util.Map r12 = p000a.p005b.p009c.p017f.C0058f.m249a(r12, r14, r13)
            java.lang.Object r13 = r11.m205c()
            int r0 = r14.length
            r3 = 0
            r9 = 0
        L6a:
            if (r9 >= r0) goto L97
            r4 = r14[r9]
            android.net.Uri r5 = r4.m256c()
            java.lang.Object r5 = r12.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L7b
            goto L94
        L7b:
            int r6 = r4.m255b()
            int r7 = r4.m257d()
            boolean r8 = r4.m258e()
            r3 = r11
            r4 = r13
            boolean r3 = r3.m202a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L93
            r11.m203b(r13)
            return r2
        L93:
            r3 = 1
        L94:
            int r9 = r9 + 1
            goto L6a
        L97:
            if (r3 != 0) goto L9d
            r11.m203b(r13)
            return r2
        L9d:
            boolean r12 = r11.m206c(r13)
            if (r12 != 0) goto La4
            return r2
        La4:
            android.graphics.Typeface r12 = r11.mo208a(r13)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p012b.C0040f.mo195a(android.content.Context, android.os.CancellationSignal, a.b.c.f.f$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    protected Typeface mo208a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f159a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f165g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    protected Class m209a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: a */
    protected Method m210a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: b */
    protected Method m211b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: c */
    protected Method m212c(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: d */
    protected Method mo213d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: e */
    protected Constructor m214e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: f */
    protected Method m215f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
