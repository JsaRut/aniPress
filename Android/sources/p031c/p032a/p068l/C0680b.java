package p031c.p032a.p068l;

import android.content.Context;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p069m.C0684a;
import p031c.p032a.p069m.C0685b;
import p031c.p032a.p091r.C0816e;

/* renamed from: c.a.l.b */
/* loaded from: classes.dex */
public final class C0680b {
    /* renamed from: a */
    public static String m3493a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.getShort()];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m3494a(long j, String str, long[] jArr) {
        C0816e c0816e = new C0816e(20480);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            JSONArray jSONArray = new JSONArray();
            if (jArr != null) {
                jSONArray.put(j);
                for (long j2 : jArr) {
                    jSONArray.put(j2);
                }
            }
            jSONObject.put("uids", jSONArray);
            C0675a.m3469c("CorePackage", "attach uids:" + jSONArray.toString());
            c0816e.m3977a(jSONObject.toString());
            return c0816e.m3982b();
        } catch (Throwable th) {
            C0675a.m3475g("CorePackage", "packageAttachInfo:" + th);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m3495a(Context context, int i, int i2, long j, byte[] bArr, long j2) {
        C0816e c0816e = new C0816e(20480);
        c0816e.m3979b(0);
        c0816e.m3974a(i2);
        c0816e.m3974a(i);
        c0816e.m3981b(j);
        c0816e.m3976a(C0556b.f2706f);
        C0675a.m3469c("CorePackage", "packageSendData uid:" + j2);
        if (j2 == 0) {
            j2 = C0557c.m2911e(context);
            C0675a.m3469c("CorePackage", "use mine uid:" + j2);
        }
        c0816e.m3981b(j2);
        c0816e.m3978a(bArr);
        c0816e.m3980b(c0816e.m3973a(), 0);
        return m3496a(context, c0816e.m3982b());
    }

    /* renamed from: a */
    public static byte[] m3496a(Context context, byte[] bArr) {
        byte[] m3504a;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length - 24;
        byte[] bArr2 = new byte[24];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, 24);
        System.arraycopy(bArr, 24, bArr3, 0, length);
        String m3500a = C0684a.m3500a(context);
        try {
            byte b2 = C0556b.f2705e;
            C0675a.m3469c("CorePackage", "encryptBuf algorithm=" + ((int) b2) + ", key=" + m3500a);
            if (b2 == 2) {
                C0685b c0685b = new C0685b();
                byte[] m3514a = C0685b.m3514a(m3500a);
                String substring = m3500a.substring(0, 16);
                C0675a.m3469c("SM4", "seed=" + m3500a);
                m3504a = c0685b.m3520a(bArr3, m3514a, substring.getBytes("utf-8"));
            } else {
                m3504a = C0684a.m3504a(m3500a, bArr3);
            }
            int length2 = m3504a.length + 24;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr4, 0, 24);
            System.arraycopy(m3504a, 0, bArr4, 24, m3504a.length);
            bArr4[0] = (byte) ((length2 >>> 8) & 255);
            bArr4[1] = (byte) (length2 & 255);
            bArr4[0] = (byte) (bArr4[0] | 128);
            bArr4[4] = b2;
            return bArr4;
        } catch (Exception e2) {
            C0675a.m3475g("CorePackage", "e:" + e2);
            C0675a.m3476h("CorePackage", "encrpt data failed");
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m3497a(String str, long[] jArr) {
        C0816e c0816e = new C0816e(20480);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i <= 0; i++) {
                jSONArray.put(jArr[0]);
            }
            jSONObject.put("uids", jSONArray);
            c0816e.m3977a(jSONObject.toString());
            return c0816e.m3982b();
        } catch (Throwable th) {
            C0675a.m3475g("CorePackage", "packageDetachInfo:" + th);
            return null;
        }
    }
}
