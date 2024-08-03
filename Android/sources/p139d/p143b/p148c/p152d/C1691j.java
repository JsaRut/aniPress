package p139d.p143b.p148c.p152d;

/* renamed from: d.b.c.d.j */
/* loaded from: classes.dex */
public final class C1691j {
    /* renamed from: a */
    public static int m6969a(int i, int i2) {
        m6970a(i, i2, "index");
        return i;
    }

    /* renamed from: a */
    public static int m6970a(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(m6977b(i, i2, str));
        }
        return i;
    }

    /* renamed from: a */
    public static <T> T m6971a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m6972a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    static String m6973a(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m6974a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m6975a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m6976a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m6973a(str, objArr));
        }
    }

    /* renamed from: b */
    private static String m6977b(int i, int i2, String str) {
        if (i < 0) {
            return m6973a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m6973a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* renamed from: b */
    public static void m6978b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m6979b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
