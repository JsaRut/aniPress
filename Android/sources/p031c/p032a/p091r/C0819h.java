package p031c.p032a.p091r;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.h */
/* loaded from: classes.dex */
public final class C0819h {

    /* renamed from: a */
    private static Pattern f3556a = Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d{1,2})\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d{1,2})");

    /* renamed from: b */
    private static SimpleDateFormat f3557b = new SimpleDateFormat("HHH:mm:ss:SSS", Locale.ENGLISH);

    /* renamed from: a */
    public static String m3989a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            C0675a.m3469c("StringUtils", "Get SHA1 error");
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m3990a(String str) {
        return str == null || str.length() == 0 || str.trim().length() == 0;
    }

    /* renamed from: a */
    public static boolean m3991a(String str, String str2) {
        if (str.length() < str2.length() + 0) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str.charAt(i + 0);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2 && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m3992b(String str) {
        return m3990a(str) ? "" : Pattern.compile("[^\\w#$@\\-一-龥]+").matcher(str).replaceAll("");
    }

    /* renamed from: c */
    public static byte[] m3993c(String str) {
        try {
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                bArr[i] = (byte) charArray[i];
            }
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m3994d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                bArr[i] = (byte) charArray[i];
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                int i2 = b2 & 255;
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static String m3995e(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8"));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            C0675a.m3469c("StringUtils", "Get MD5 error");
            return "";
        }
    }

    /* renamed from: f */
    public static boolean m3996f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int indexOf = str.indexOf(":");
        if (indexOf >= 0) {
            if (indexOf != str.lastIndexOf(":")) {
                return false;
            }
            str = str.substring(0, indexOf);
        }
        return f3556a.matcher(str).matches();
    }

    /* renamed from: g */
    public static boolean m3997g(String str) {
        int indexOf;
        return (TextUtils.isEmpty(str) || (indexOf = str.indexOf(":")) == -1 || str.lastIndexOf(":") == indexOf) ? false : true;
    }

    /* renamed from: h */
    public static boolean m3998h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Pattern.compile("[\\x20-\\x7E]+").matcher(str).matches();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: i */
    public static boolean m3999i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Pattern.compile("([A-Fa-f0-9]{2}[-:]){5,}[A-Fa-f0-9]{2}").matcher(str).matches();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: j */
    public static byte[] m4000j(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable th) {
            C0675a.m3478j("StringUtils", "stringToUtf8Bytes error:" + th.getMessage());
            return str.getBytes();
        }
    }

    /* renamed from: k */
    public static String m4001k(String str) {
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
}
