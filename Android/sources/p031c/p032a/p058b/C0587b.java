package p031c.p032a.p058b;

import android.content.Context;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p032a.p047O.C0552b;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.b.b */
/* loaded from: classes.dex */
public final class C0587b {

    /* renamed from: a */
    public static String f2813a = "";

    /* renamed from: a */
    private static String m2995a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (Throwable th) {
            C0675a.m3475g("JWakeConfigHelper", "get md5 throwable:" + th.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    private static List<String> m2996a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.get(i).toString());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02cf, code lost:            if (r6 == null) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0299, code lost:            if (r6 == null) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0304, code lost:            if (r6 == null) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0306, code lost:            r6.disconnect();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject m2997a(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p058b.C0587b.m2997a(android.content.Context):org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m2998a(Context context, JSONObject jSONObject) {
        if (jSONObject != null) {
            C0675a.m3469c("JWakeConfigHelper", "write wakeConfigJson:" + jSONObject);
            C0552b.m2879a(context, "bwc.catch", jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p031c.p032a.p056W.C0580a m2999b(android.content.Context r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p058b.C0587b.m2999b(android.content.Context, org.json.JSONObject):c.a.W.a");
    }
}
