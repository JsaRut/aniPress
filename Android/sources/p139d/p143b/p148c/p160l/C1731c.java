package p139d.p143b.p148c.p160l;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: d.b.c.l.c */
/* loaded from: classes.dex */
public class C1731c {

    /* renamed from: a */
    public static final boolean f6272a;

    /* renamed from: b */
    public static final boolean f6273b;

    /* renamed from: c */
    public static final boolean f6274c;

    /* renamed from: d */
    public static InterfaceC1730b f6275d;

    /* renamed from: e */
    private static boolean f6276e;

    /* renamed from: f */
    private static final byte[] f6277f;

    /* renamed from: g */
    private static final byte[] f6278g;

    /* renamed from: h */
    private static final byte[] f6279h;

    /* renamed from: i */
    private static final byte[] f6280i;

    /* renamed from: j */
    private static final byte[] f6281j;

    static {
        f6272a = Build.VERSION.SDK_INT <= 17;
        f6273b = Build.VERSION.SDK_INT >= 14;
        f6274c = m7100b();
        f6275d = null;
        f6276e = false;
        f6277f = m7099a("RIFF");
        f6278g = m7099a("WEBP");
        f6279h = m7099a("VP8 ");
        f6280i = m7099a("VP8L");
        f6281j = m7099a("VP8X");
    }

    /* renamed from: a */
    public static InterfaceC1730b m7095a() {
        if (f6276e) {
            return f6275d;
        }
        InterfaceC1730b interfaceC1730b = null;
        try {
            interfaceC1730b = (InterfaceC1730b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f6276e = true;
        return interfaceC1730b;
    }

    /* renamed from: a */
    public static boolean m7096a(byte[] bArr, int i) {
        return m7098a(bArr, i + 12, f6281j) && ((bArr[i + 20] & 2) == 2);
    }

    /* renamed from: a */
    public static boolean m7097a(byte[] bArr, int i, int i2) {
        return i2 >= 21 && m7098a(bArr, i + 12, f6281j);
    }

    /* renamed from: a */
    private static boolean m7098a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static byte[] m7099a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    /* renamed from: b */
    private static boolean m7100b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (options.outHeight != 1 || options.outWidth != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m7101b(byte[] bArr, int i) {
        return m7098a(bArr, i + 12, f6281j) && ((bArr[i + 20] & 16) == 16);
    }

    /* renamed from: b */
    public static boolean m7102b(byte[] bArr, int i, int i2) {
        return i2 >= 20 && m7098a(bArr, i, f6277f) && m7098a(bArr, i + 8, f6278g);
    }

    /* renamed from: c */
    public static boolean m7103c(byte[] bArr, int i) {
        return m7098a(bArr, i + 12, f6280i);
    }

    /* renamed from: d */
    public static boolean m7104d(byte[] bArr, int i) {
        return m7098a(bArr, i + 12, f6279h);
    }
}
