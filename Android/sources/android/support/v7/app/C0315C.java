package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.C */
/* loaded from: classes.dex */
class C0315C {

    /* renamed from: a */
    private static Field f1482a;

    /* renamed from: b */
    private static boolean f1483b;

    /* renamed from: c */
    private static Class f1484c;

    /* renamed from: d */
    private static boolean f1485d;

    /* renamed from: e */
    private static Field f1486e;

    /* renamed from: f */
    private static boolean f1487f;

    /* renamed from: g */
    private static Field f1488g;

    /* renamed from: h */
    private static boolean f1489h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1752a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m1756d(resources);
        } else if (i >= 23) {
            m1755c(resources);
        } else if (i >= 21) {
            m1754b(resources);
        }
    }

    /* renamed from: a */
    private static void m1753a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1485d) {
            try {
                f1484c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1485d = true;
        }
        Class cls = f1484c;
        if (cls == null) {
            return;
        }
        if (!f1487f) {
            try {
                f1486e = cls.getDeclaredField("mUnthemedEntries");
                f1486e.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f1487f = true;
        }
        Field field = f1486e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* renamed from: b */
    private static void m1754b(Resources resources) {
        Map map;
        if (!f1483b) {
            try {
                f1482a = Resources.class.getDeclaredField("mDrawableCache");
                f1482a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f1483b = true;
        }
        Field field = f1482a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m1755c(Resources resources) {
        if (!f1483b) {
            try {
                f1482a = Resources.class.getDeclaredField("mDrawableCache");
                f1482a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f1483b = true;
        }
        Object obj = null;
        Field field = f1482a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        m1753a(obj);
    }

    /* renamed from: d */
    private static void m1756d(Resources resources) {
        Object obj;
        if (!f1489h) {
            try {
                f1488g = Resources.class.getDeclaredField("mResourcesImpl");
                f1488g.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f1489h = true;
        }
        Field field = f1488g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1483b) {
            try {
                f1482a = obj.getClass().getDeclaredField("mDrawableCache");
                f1482a.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f1483b = true;
        }
        Field field2 = f1482a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 != null) {
            m1753a(obj2);
        }
    }
}
