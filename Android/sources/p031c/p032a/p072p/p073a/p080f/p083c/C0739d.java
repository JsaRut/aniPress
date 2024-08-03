package p031c.p032a.p072p.p073a.p080f.p083c;

import android.util.Base64;
import android.util.Pair;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: c.a.p.a.f.c.d */
/* loaded from: classes.dex */
public final class C0739d {

    /* renamed from: a */
    private static RSAPublicKey f3337a;

    /* renamed from: b */
    private C0737b f3338b;

    static {
        try {
            f3337a = C0741f.m3759a("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiyAsJCE7983IfpIgeFWWF+RdTKBs3m6N3WiThf5JTRCGm32HPMks+kABG21xtkPemEuc3oHGOKNVmdKyGwYEPikYcalhZqAMn1IPczHLE8ibSwIIHAOHCUy4rKU1pdw3jCo+iY15/uV0RlKckUBuIzcq7WZsTknnWswodObIEYQIDAQAB");
        } catch (Throwable unused) {
        }
    }

    public C0739d(String str) {
        this.f3338b = new C0737b(str);
        this.f3338b.m3746a(15000);
        this.f3338b.m3747a("Accept", "application/json");
    }

    /* renamed from: a */
    public final Pair<Integer, String> m3756a(String str, String str2, boolean z) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                sb.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(secureRandom.nextInt(36)));
            }
            String sb2 = sb.toString();
            RSAPublicKey rSAPublicKey = f3337a;
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPublicKey);
            String str3 = new String(Base64.encode(cipher.doFinal(sb2.getBytes()), 2), "UTF-8");
            String str4 = Long.toString(System.currentTimeMillis(), 32) + str;
            String str5 = null;
            if (sb2 != null && sb2.length() == 16) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(sb2.getBytes(), "AES");
                Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher2.init(1, secretKeySpec, new IvParameterSpec("mcr303498345ede&".getBytes()));
                str5 = Base64.encodeToString(cipher2.doFinal(str4.getBytes()), 2);
            }
            String str6 = str2 + ":" + str3;
            this.f3338b.m3747a("Authorization", "Basic " + Base64.encodeToString(str6.getBytes(), 10));
            this.f3338b.m3747a("Content-Length", String.valueOf(str5.getBytes().length));
            C0738c m3757a = C0740e.m3757a(this.f3338b, str5);
            int m3755b = m3757a.m3755b();
            try {
                JSONObject jSONObject = new JSONObject(m3757a.m3751a());
                m3755b = jSONObject.getInt("code");
                return new Pair<>(Integer.valueOf(m3755b), jSONObject.optString("content"));
            } catch (Throwable unused) {
                return new Pair<>(Integer.valueOf(m3755b), "");
            }
        } catch (Exception e2) {
            return new Pair<>(-1, e2.toString());
        }
    }
}
