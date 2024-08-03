package android.support.v4.util;

/* renamed from: android.support.v4.util.n */
/* loaded from: classes.dex */
public class C0268n {
    /* renamed from: a */
    public static int m1383a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static <T> T m1384a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m1385a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
