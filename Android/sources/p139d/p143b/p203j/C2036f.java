package p139d.p143b.p203j;

import java.io.InputStream;
import p139d.p143b.p148c.p153e.C1700a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.j.f */
/* loaded from: classes.dex */
public class C2036f {

    /* renamed from: a */
    private static final Class<?> f7405a = C2036f.class;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.j.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f7406a;

        /* renamed from: b */
        int f7407b;

        /* renamed from: c */
        int f7408c;

        private a() {
        }
    }

    C2036f() {
    }

    /* renamed from: a */
    public static int m8302a(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: a */
    public static int m8303a(InputStream inputStream, int i) {
        a aVar = new a();
        int m8304a = m8304a(inputStream, i, aVar);
        int i2 = aVar.f7408c - 8;
        if (m8304a == 0 || i2 > m8304a) {
            return 0;
        }
        inputStream.skip(i2);
        return m8305a(inputStream, m8306a(inputStream, m8304a - i2, aVar.f7406a, 274), aVar.f7406a);
    }

    /* renamed from: a */
    private static int m8304a(InputStream inputStream, int i, a aVar) {
        Class<?> cls;
        String str;
        if (i <= 8) {
            return 0;
        }
        aVar.f7407b = C2034d.m8301a(inputStream, 4, false);
        int i2 = i - 4;
        int i3 = aVar.f7407b;
        if (i3 == 1229531648 || i3 == 1296891946) {
            aVar.f7406a = aVar.f7407b == 1229531648;
            aVar.f7408c = C2034d.m8301a(inputStream, 4, aVar.f7406a);
            int i4 = i2 - 4;
            int i5 = aVar.f7408c;
            if (i5 >= 8 && i5 - 8 <= i4) {
                return i4;
            }
            cls = f7405a;
            str = "Invalid offset";
        } else {
            cls = f7405a;
            str = "Invalid TIFF header";
        }
        C1700a.m6989a(cls, str);
        return 0;
    }

    /* renamed from: a */
    private static int m8305a(InputStream inputStream, int i, boolean z) {
        if (i < 10 || C2034d.m8301a(inputStream, 2, z) != 3 || C2034d.m8301a(inputStream, 4, z) != 1) {
            return 0;
        }
        int m8301a = C2034d.m8301a(inputStream, 2, z);
        C2034d.m8301a(inputStream, 2, z);
        return m8301a;
    }

    /* renamed from: a */
    private static int m8306a(InputStream inputStream, int i, boolean z, int i2) {
        if (i < 14) {
            return 0;
        }
        int m8301a = C2034d.m8301a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = m8301a - 1;
            if (m8301a <= 0 || i3 < 12) {
                break;
            }
            int i5 = i3 - 2;
            if (C2034d.m8301a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10L);
            i3 = i5 - 10;
            m8301a = i4;
        }
        return 0;
    }
}
