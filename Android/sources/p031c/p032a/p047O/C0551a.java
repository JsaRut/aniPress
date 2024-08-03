package p031c.p032a.p047O;

import android.os.Bundle;
import java.nio.ByteBuffer;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.O.a */
/* loaded from: classes.dex */
public final class C0551a {

    /* renamed from: a */
    private static long f2698a;

    static {
        C0557c.m2900a("JCommon");
        C0557c.m2900a("JLocation");
        C0557c.m2900a("JArp");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e1 A[Catch: Throwable -> 0x02e9, TRY_LEAVE, TryCatch #0 {Throwable -> 0x02e9, blocks: (B:4:0x000d, B:7:0x0013, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:15:0x007e, B:17:0x0157, B:19:0x015b, B:21:0x0162, B:24:0x016c, B:27:0x01c4, B:29:0x01c9, B:30:0x01d4, B:31:0x01dd, B:32:0x01f1, B:34:0x01f7, B:36:0x022f, B:37:0x0240, B:51:0x0269, B:53:0x026d, B:54:0x0271, B:55:0x0275, B:56:0x0279, B:57:0x027d, B:58:0x0285, B:59:0x0289, B:60:0x028e, B:61:0x0292, B:62:0x0296, B:63:0x029b, B:65:0x02a1, B:66:0x02a6, B:67:0x02ab, B:68:0x02b4, B:69:0x0177, B:72:0x0182, B:75:0x018d, B:78:0x0196, B:81:0x01a1, B:84:0x01ac, B:87:0x01b7, B:91:0x02bf, B:93:0x02c3, B:95:0x02ca, B:102:0x02e1, B:104:0x02d4, B:110:0x0083, B:112:0x008d, B:114:0x0093, B:116:0x0099, B:117:0x009d, B:119:0x00a3, B:122:0x00b1, B:131:0x00b6, B:132:0x00bf, B:133:0x00c8, B:135:0x00d1, B:137:0x00d8, B:140:0x00eb, B:142:0x00f4, B:144:0x00fd, B:146:0x010a, B:147:0x0111, B:149:0x0115, B:152:0x0123, B:154:0x002d, B:157:0x0037, B:160:0x0041, B:163:0x004b, B:166:0x0055, B:169:0x005f, B:172:0x0069, B:175:0x0073), top: B:2:0x000b }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m2873a(android.content.Context r17, java.lang.String r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p047O.C0551a.m2873a(android.content.Context, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private static JSONObject m2874a(Bundle bundle) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bundle.getByteArray("RESPONSE_BODY"));
            f2698a = wrap.getLong();
            byte[] bArr = new byte[wrap.getShort()];
            wrap.get(bArr);
            String str = new String(bArr, "UTF-8");
            C0675a.m3469c("JCommonActionHelper", "parseBundle2Json content: " + str);
            return new JSONObject(str);
        } catch (Exception e2) {
            C0675a.m3475g("JCommonActionHelper", "parseBundle2Json exception:" + e2.getMessage());
            return null;
        }
    }
}
