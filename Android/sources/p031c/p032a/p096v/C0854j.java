package p031c.p032a.p096v;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.v.j */
/* loaded from: classes.dex */
public final class C0854j {

    /* renamed from: a */
    private static Pattern f3604a = Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d{1,2})\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d{1,2})");

    /* renamed from: b */
    private static SimpleDateFormat f3605b = new SimpleDateFormat("mm:ss:SSS", Locale.ENGLISH);

    /* renamed from: a */
    public static String m4159a(String str, int i) {
        int length = str.length();
        if (length >= i) {
            return str;
        }
        for (int i2 = 0; i2 < i - length; i2++) {
            str = str + " ";
        }
        return str;
    }

    /* renamed from: a */
    public static String m4160a(byte[] bArr) {
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
            C0601d.m3072b("StringUtils", "Get SHA1 error");
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m4161a(String str) {
        return str == null || str.length() == 0 || str.trim().length() == 0;
    }

    /* renamed from: b */
    public static String m4162b(String str) {
        return m4161a(str) ? "" : Pattern.compile("[^\\w#$@\\-一-龥]+").matcher(str).replaceAll("");
    }

    /* renamed from: c */
    public static String m4163c(String str) {
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

    /* renamed from: d */
    public static String m4164d(String str) {
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
            C0601d.m3072b("StringUtils", "Get MD5 error");
            return "";
        }
    }

    /* renamed from: e */
    public static boolean m4165e(String str) {
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
        return f3604a.matcher(str).matches();
    }

    /* renamed from: f */
    public static boolean m4166f(String str) {
        int indexOf;
        return (TextUtils.isEmpty(str) || (indexOf = str.indexOf(":")) == -1 || str.lastIndexOf(":") == indexOf) ? false : true;
    }

    /* renamed from: g */
    public static boolean m4167g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Pattern.compile("[\\x20-\\x7E]+").matcher(str).matches();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: h */
    public static byte[] m4168h(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable th) {
            C0601d.m3080i("StringUtils", "stringToUtf8Bytes error:" + th.getMessage());
            return str.getBytes();
        }
    }

    /* renamed from: i */
    public static String m4169i(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return m4160a(str.getBytes("utf-8"));
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }
}
