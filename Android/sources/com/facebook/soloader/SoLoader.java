package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SoLoader {

    /* renamed from: a */
    static final boolean f5653a;

    /* renamed from: b */
    static InterfaceC1544l f5654b;

    /* renamed from: f */
    private static AbstractC1549q[] f5658f;

    /* renamed from: g */
    private static C1534b f5659g;

    /* renamed from: l */
    private static int f5664l;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f5655c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static AbstractC1546n[] f5656d = null;

    /* renamed from: e */
    private static int f5657e = 0;

    /* renamed from: h */
    private static final HashSet<String> f5660h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f5661i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f5662j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static InterfaceC1547o f5663k = null;

    @InterfaceC1536d
    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m6398a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e2) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e2);
                }
            }
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    /* loaded from: classes.dex */
    public static final class C1532a extends UnsatisfiedLinkError {
        C1532a(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f5653a = z;
    }

    /* renamed from: a */
    private static void m6382a() {
        f5655c.readLock().lock();
        try {
            if (f5656d != null) {
            } else {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f5655c.readLock().unlock();
        }
    }

    /* renamed from: a */
    public static void m6383a(Context context, int i) {
        m6384a(context, i, (InterfaceC1544l) null);
    }

    /* renamed from: a */
    private static void m6384a(Context context, int i, InterfaceC1544l interfaceC1544l) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m6386a(interfaceC1544l);
            m6393b(context, i, interfaceC1544l);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: a */
    public static void m6385a(Context context, boolean z) {
        try {
            m6383a(context, z ? 1 : 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    private static synchronized void m6386a(InterfaceC1544l interfaceC1544l) {
        synchronized (SoLoader.class) {
            if (interfaceC1544l != null) {
                f5654b = interfaceC1544l;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method m6392b = m6392b();
            boolean z = m6392b != null;
            String m6398a = z ? Api14Utils.m6398a() : null;
            f5654b = new C1545m(z, m6398a, m6391b(m6398a), runtime, m6392b);
        }
    }

    /* renamed from: a */
    public static void m6387a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        m6390a(str, null, null, i, threadPolicy);
    }

    /* renamed from: a */
    public static boolean m6388a(String str) {
        return m6389a(str, 0);
    }

    /* renamed from: a */
    public static boolean m6389a(String str, int i) {
        boolean z;
        f5655c.readLock().lock();
        try {
            if (f5656d == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        z = !f5660h.contains(str);
                        if (z) {
                            if (f5663k != null) {
                                f5663k.m6440a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    return z;
                }
                m6382a();
            }
            f5655c.readLock().unlock();
            String m6429b = C1542j.m6429b(str);
            return m6390a(System.mapLibraryName(m6429b != null ? m6429b : str), str, m6429b, i | 2, null);
        } finally {
            f5655c.readLock().unlock();
        }
    }

    /* renamed from: a */
    private static boolean m6390a(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str2) && f5662j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            if (!f5660h.contains(str)) {
                z = false;
            } else {
                if (str3 == null) {
                    return false;
                }
                z = true;
            }
            if (f5661i.containsKey(str)) {
                obj = f5661i.get(str);
            } else {
                obj = new Object();
                f5661i.put(str, obj);
            }
            synchronized (obj) {
                if (!z) {
                    synchronized (SoLoader.class) {
                        if (f5660h.contains(str)) {
                            if (str3 == null) {
                                return false;
                            }
                            z = true;
                        }
                        if (!z) {
                            try {
                                try {
                                    Log.d("SoLoader", "About to load: " + str);
                                    m6394b(str, i, threadPolicy);
                                    synchronized (SoLoader.class) {
                                        Log.d("SoLoader", "Loaded: " + str);
                                        f5660h.add(str);
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (UnsatisfiedLinkError e3) {
                                String message = e3.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e3;
                                }
                                throw new C1532a(e3);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str2) && f5662j.contains(str2)) {
                    z2 = true;
                }
                if (str3 == null || z2) {
                    return !z;
                }
                if (f5653a) {
                    Api18TraceUtils.m6381a("MergedSoMapping.invokeJniOnload[" + str2 + "]");
                }
                try {
                    Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                    C1542j.m6428a(str2);
                    throw null;
                } catch (Throwable th) {
                    if (f5653a) {
                        Api18TraceUtils.m6380a();
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m6391b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    /* renamed from: b */
    private static Method m6392b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && i <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e2) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e2);
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private static void m6393b(Context context, int i, InterfaceC1544l interfaceC1544l) {
        int i2;
        f5655c.writeLock().lock();
        try {
            if (f5656d == null) {
                Log.d("SoLoader", "init start");
                f5664l = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (int i3 = 0; i3 < split.length; i3++) {
                    Log.d("SoLoader", "adding system library source: " + split[i3]);
                    arrayList.add(new C1535c(new File(split[i3]), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        f5658f = null;
                        Log.d("SoLoader", "adding exo package source: lib-main");
                        arrayList.add(0, new C1538f(context, "lib-main"));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i2 = 0;
                        } else {
                            f5659g = new C1534b(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            Log.d("SoLoader", "adding application source: " + f5659g.toString());
                            arrayList.add(0, f5659g);
                            i2 = 1;
                        }
                        if ((f5664l & 8) != 0) {
                            f5658f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            C1533a c1533a = new C1533a(context, file, "lib-main", i2);
                            arrayList2.add(c1533a);
                            Log.d("SoLoader", "adding backup source from : " + c1533a.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d("SoLoader", "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    File file2 = new File(strArr[i4]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("lib-");
                                    sb.append(i5);
                                    C1533a c1533a2 = new C1533a(context, file2, sb.toString(), i2);
                                    Log.d("SoLoader", "adding backup source: " + c1533a2.toString());
                                    arrayList2.add(c1533a2);
                                    i4++;
                                    i5++;
                                }
                            }
                            f5658f = (AbstractC1549q[]) arrayList2.toArray(new AbstractC1549q[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                AbstractC1546n[] abstractC1546nArr = (AbstractC1546n[]) arrayList.toArray(new AbstractC1546n[arrayList.size()]);
                int m6395c = m6395c();
                int length2 = abstractC1546nArr.length;
                while (true) {
                    int i6 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    Log.d("SoLoader", "Preparing SO source: " + abstractC1546nArr[i6]);
                    abstractC1546nArr[i6].mo6413a(m6395c);
                    length2 = i6;
                }
                f5656d = abstractC1546nArr;
                f5657e++;
                Log.d("SoLoader", "init finish: " + f5656d.length + " SO sources prepared");
            }
        } finally {
            Log.d("SoLoader", "init exiting");
            f5655c.writeLock().unlock();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private static void m6394b(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2;
        f5655c.readLock().lock();
        try {
            if (f5656d == null) {
                Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
                throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
            }
            f5655c.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (f5653a) {
                Api18TraceUtils.m6381a("SoLoader.loadLibrary[" + str + "]");
            }
            int i2 = 0;
            do {
                try {
                    f5655c.readLock().lock();
                    int i3 = f5657e;
                    int i4 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (i4 < f5656d.length) {
                                i2 = f5656d[i4].mo6411a(str, i, threadPolicy);
                                if (i2 == 3 && f5658f != null) {
                                    Log.d("SoLoader", "Trying backup SoSource for " + str);
                                    AbstractC1549q[] abstractC1549qArr = f5658f;
                                    int length = abstractC1549qArr.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            break;
                                        }
                                        AbstractC1549q abstractC1549q = abstractC1549qArr[i5];
                                        abstractC1549q.m6450b(str);
                                        int mo6411a = abstractC1549q.mo6411a(str, i, threadPolicy);
                                        if (mo6411a == 1) {
                                            i2 = mo6411a;
                                            break;
                                        }
                                        i5++;
                                    }
                                } else {
                                    i4++;
                                }
                            } else {
                                break;
                            }
                        } finally {
                        }
                    }
                    f5655c.readLock().unlock();
                    if ((i & 2) == 2 && i2 == 0) {
                        f5655c.writeLock().lock();
                        try {
                            if (f5659g != null && f5659g.m6414a()) {
                                f5657e++;
                            }
                            z2 = f5657e != i3;
                            f5655c.writeLock().unlock();
                        } catch (Throwable th) {
                            f5655c.writeLock().unlock();
                            throw th;
                        }
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th2) {
                    if (f5653a) {
                        Api18TraceUtils.m6380a();
                    }
                    if (z) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i2 == 0 || i2 == 3) {
                        String str2 = "couldn't find DSO to load: " + str;
                        String message = th2.getMessage();
                        if (message == null) {
                            message = th2.toString();
                        }
                        String str3 = str2 + " caused by: " + message;
                        Log.e("SoLoader", str3);
                        throw new UnsatisfiedLinkError(str3);
                    }
                    return;
                }
            } while (z2);
            if (f5653a) {
                Api18TraceUtils.m6380a();
            }
            if (z) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            if (i2 == 0 || i2 == 3) {
                String str4 = "couldn't find DSO to load: " + str;
                Log.e("SoLoader", str4);
                throw new UnsatisfiedLinkError(str4);
            }
        } finally {
        }
    }

    /* renamed from: c */
    private static int m6395c() {
        f5655c.writeLock().lock();
        try {
            return (f5664l & 2) != 0 ? 1 : 0;
        } finally {
            f5655c.writeLock().unlock();
        }
    }

    /* renamed from: c */
    public static File m6396c(String str) {
        m6382a();
        try {
            return m6397d(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: d */
    static File m6397d(String str) {
        f5655c.readLock().lock();
        for (int i = 0; i < f5656d.length; i++) {
            try {
                File mo6412a = f5656d[i].mo6412a(str);
                if (mo6412a != null) {
                    return mo6412a;
                }
            } finally {
                f5655c.readLock().unlock();
            }
        }
        f5655c.readLock().unlock();
        throw new FileNotFoundException(str);
    }
}
