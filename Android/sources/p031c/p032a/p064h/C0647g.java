package p031c.p032a.p064h;

import java.util.HashMap;

/* renamed from: c.a.h.g */
/* loaded from: classes.dex */
final class C0647g {

    /* renamed from: a */
    private static Integer[] f3010a = new Integer[64];

    /* renamed from: d */
    private String f3013d;

    /* renamed from: f */
    private String f3015f;

    /* renamed from: h */
    private boolean f3017h;

    /* renamed from: e */
    private int f3014e = 3;

    /* renamed from: b */
    private HashMap f3011b = new HashMap();

    /* renamed from: c */
    private HashMap f3012c = new HashMap();

    /* renamed from: g */
    private int f3016g = Integer.MAX_VALUE;

    static {
        int i = 0;
        while (true) {
            Integer[] numArr = f3010a;
            if (i >= numArr.length) {
                return;
            }
            numArr[i] = Integer.valueOf(i);
            i++;
        }
    }

    public C0647g(String str, int i) {
        this.f3013d = str;
    }

    /* renamed from: c */
    private static Integer m3302c(int i) {
        if (i >= 0) {
            Integer[] numArr = f3010a;
            if (i < numArr.length) {
                return numArr[i];
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: d */
    private void m3303d(int i) {
        if (i < 0 || i > this.f3016g) {
            throw new IllegalArgumentException(this.f3013d + " " + i + "is out of range");
        }
    }

    /* renamed from: a */
    public final void m3304a(int i) {
        this.f3016g = 3;
    }

    /* renamed from: a */
    public final void m3305a(int i, String str) {
        m3303d(i);
        Integer m3302c = m3302c(i);
        int i2 = this.f3014e;
        if (i2 == 2) {
            str = str.toUpperCase();
        } else if (i2 == 3) {
            str = str.toLowerCase();
        }
        this.f3011b.put(str, m3302c);
        this.f3012c.put(m3302c, str);
    }

    /* renamed from: a */
    public final void m3306a(boolean z) {
        this.f3017h = true;
    }

    /* renamed from: b */
    public final String m3307b(int i) {
        m3303d(i);
        String str = (String) this.f3012c.get(m3302c(i));
        if (str != null) {
            return str;
        }
        String num = Integer.toString(i);
        if (this.f3015f == null) {
            return num;
        }
        return this.f3015f + num;
    }
}
