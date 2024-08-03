package p031c.p032a.p096v;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.v.i */
/* loaded from: classes.dex */
public final class C0853i {
    /* renamed from: a */
    public static int m4149a() {
        return Math.abs(new SecureRandom().nextInt()) & 16777215;
    }

    /* renamed from: a */
    public static String m4150a(long j) {
        long j2;
        long j3;
        switch (((int) j) % 10) {
            case 1:
                j2 = 5 * j;
                j3 = 88;
                break;
            case 2:
                j2 = 23 * j;
                j3 = 15;
                break;
            case 3:
                j2 = 3 * j;
                j3 = 73;
                break;
            case 4:
                j2 = 13 * j;
                j3 = 96;
                break;
            case 5:
                j2 = 17 * j;
                j3 = 49;
                break;
            case 6:
                j2 = 7 * j;
                j3 = 68;
                break;
            case 7:
                j2 = 31 * j;
                j3 = 39;
                break;
            case 8:
                j2 = 29 * j;
                j3 = 41;
                break;
            case 9:
                j2 = 37 * j;
                j3 = 91;
                break;
            default:
                j2 = 8 * j;
                j3 = 74;
                break;
        }
        return C0854j.m4163c("JCKP" + (j2 + (j % j3)));
    }

    /* renamed from: a */
    public static String m4151a(String str) {
        try {
            byte[] m4158c = m4158c("DFA84B10B7ACDD25", "ASCII");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(m4158c, "AES"), m4153a(m4158c));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 2);
        } catch (Exception unused) {
            C0601d.m3077f("", "Unexpected - failed to AES encrypt.");
            return "";
        }
    }

    /* renamed from: a */
    public static String m4152a(String str, String str2) {
        RSAPublicKey m4157c = m4157c(str2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, m4157c);
        return new String(Base64.encode(cipher.doFinal(str.getBytes()), 2), "UTF-8");
    }

    /* renamed from: a */
    private static IvParameterSpec m4153a(byte[] bArr) {
        try {
            return (IvParameterSpec) IvParameterSpec.class.getConstructor(byte[].class).newInstance(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m4154a(byte[] bArr, String str, String str2) {
        if (str == null) {
            return null;
        }
        byte[] m4158c = m4158c(str, "utf-8");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(m4158c, "AES"), m4153a(str2.getBytes("utf-8")));
        return cipher.doFinal(bArr);
    }

    /* renamed from: b */
    public static String m4155b(String str) {
        try {
            return m4156b(str, "DFA84B10B7ACDD25");
        } catch (Exception unused) {
            C0601d.m3077f("", "Unexpected - failed to AES decrypt.");
            return "";
        }
    }

    /* renamed from: b */
    private static String m4156b(String str, String str2) {
        try {
            if (str2.length() != 16) {
                return null;
            }
            byte[] m4158c = m4158c(str2, "ASCII");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(m4158c, "AES"), m4153a(m4158c));
            return new String(cipher.doFinal(Base64.decode(str, 2)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static RSAPublicKey m4157c(String str) {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static byte[] m4158c(String str, String str2) {
        byte[] bArr = new byte[str.length()];
        byte[] bytes = str.substring(0, str.length() / 2).getBytes(str2);
        byte[] bytes2 = str.substring(str.length() / 2).getBytes(str2);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
        return bArr;
    }
}
