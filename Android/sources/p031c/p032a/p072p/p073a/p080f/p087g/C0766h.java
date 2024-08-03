package p031c.p032a.p072p.p073a.p080f.p087g;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.f.g.h */
/* loaded from: classes.dex */
public final class C0766h {
    /* renamed from: a */
    public static double m3814a(double d2, int i) {
        try {
            return Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", Double.valueOf(d2)));
        } catch (Throwable th) {
            C0732b.m3716a("StringUtils", "CutDoubleValue fail: e:" + th);
            return d2;
        }
    }

    /* renamed from: a */
    public static boolean m3815a(String str) {
        return str == null || str.length() == 0 || str.trim().length() == 0;
    }

    /* renamed from: b */
    public static String m3816b(String str) {
        if (str != null && !"".equals(str)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                if (digest == null) {
                    return "";
                }
                StringBuffer stringBuffer = new StringBuffer(digest.length * 2);
                for (byte b2 : digest) {
                    stringBuffer.append("0123456789ABCDEF".charAt((b2 >> 4) & 15));
                    stringBuffer.append("0123456789ABCDEF".charAt(b2 & 15));
                }
                return stringBuffer.toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m3817c(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: d */
    public static byte[] m3818d(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable th) {
            C0732b.m3726i("StringUtils", "stringToUtf8Bytes error:" + th.getMessage());
            return str.getBytes();
        }
    }
}
