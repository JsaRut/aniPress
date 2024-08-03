package p139d.p143b.p203j;

import java.io.IOException;
import java.io.InputStream;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.j.c */
/* loaded from: classes.dex */
public class C2033c {
    /* renamed from: a */
    public static int m8296a(int i) {
        return C2036f.m8302a(i);
    }

    /* renamed from: a */
    public static int m8297a(InputStream inputStream) {
        try {
            int m8299b = m8299b(inputStream);
            if (m8299b == 0) {
                return 0;
            }
            return C2036f.m8303a(inputStream, m8299b);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m8298a(InputStream inputStream, int i) {
        C1691j.m6971a(inputStream);
        while (C2034d.m8301a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = C2034d.m8301a(inputStream, 1, false);
            }
            if ((i != 192 || !m8300b(i2)) && i2 != i) {
                if (i2 != 216 && i2 != 1) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip(C2034d.m8301a(inputStream, 2, false) - 2);
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static int m8299b(InputStream inputStream) {
        int m8301a;
        if (m8298a(inputStream, 225) && (m8301a = C2034d.m8301a(inputStream, 2, false) - 2) > 6) {
            int m8301a2 = C2034d.m8301a(inputStream, 4, false);
            int m8301a3 = C2034d.m8301a(inputStream, 2, false);
            int i = (m8301a - 4) - 2;
            if (m8301a2 == 1165519206 && m8301a3 == 0) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m8300b(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }
}
