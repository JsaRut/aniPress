package p031c.p032a.p069m;

import android.content.Context;
import android.util.Base64;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0817f;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.m.a */
/* loaded from: classes.dex */
public final class C0684a {

    /* renamed from: a */
    private static Integer f3162a;

    /* renamed from: a */
    public static int m3498a() {
        Integer num = f3162a;
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(Math.abs(new SecureRandom().nextInt()));
        f3162a = valueOf;
        return valueOf.intValue();
    }

    /* renamed from: a */
    public static String m3499a(long j) {
        long j2;
        long j3;
        switch ((int) (j % 10)) {
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
        return C0819h.m3994d("JCKP" + (j2 + (j % j3)));
    }

    /* renamed from: a */
    public static String m3500a(Context context) {
        long m2911e = C0557c.m2911e(context);
        return m2911e > 0 ? m3499a(m2911e) : m3499a(m3498a());
    }

    /* renamed from: a */
    public static String m3501a(String str) {
        try {
            byte[] m3508c = m3508c("DFA84B10B7ACDD25", "ASCII");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(m3508c, "AES"), m3503a(m3508c));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 2);
        } catch (Exception unused) {
            C0675a.m3475g("", "Unexpected - failed to AES encrypt.");
            return "";
        }
    }

    /* renamed from: a */
    public static String m3502a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            if (str2.length() != 16) {
                return null;
            }
            byte[] m3508c = m3508c(str2, "ASCII");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(m3508c, "AES"), m3503a(m3508c));
            return new String(cipher.doFinal(Base64.decode(str, 2)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static IvParameterSpec m3503a(byte[] bArr) {
        try {
            return (IvParameterSpec) C0817f.m3984a(IvParameterSpec.class, new Object[]{bArr}, new Class[]{byte[].class});
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m3504a(String str, byte[] bArr) {
        byte[] m3508c = m3508c(str, "utf-8");
        String substring = str.substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(m3508c, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, m3503a(substring.getBytes("utf-8")));
        return cipher.doFinal(bArr);
    }

    /* renamed from: b */
    public static int m3505b() {
        return Math.abs(new SecureRandom().nextInt()) & 16777215;
    }

    /* renamed from: b */
    public static String m3506b(String str, String str2) {
        try {
            return m3502a(str, "DFA84B10B7ACDD25");
        } catch (Exception unused) {
            C0675a.m3475g("", "Unexpected - failed to AES decrypt.");
            return str2;
        }
    }

    /* renamed from: b */
    public static byte[] m3507b(String str, byte[] bArr) {
        byte[] m3508c = m3508c(str, "utf-8");
        String substring = str.substring(0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(m3508c, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKeySpec, m3503a(substring.getBytes("utf-8")));
        return cipher.doFinal(bArr);
    }

    /* renamed from: c */
    private static byte[] m3508c(String str, String str2) {
        byte[] bArr = new byte[str.length()];
        byte[] bytes = str.substring(0, str.length() / 2).getBytes(str2);
        byte[] bytes2 = str.substring(str.length() / 2).getBytes(str2);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
        return bArr;
    }
}
