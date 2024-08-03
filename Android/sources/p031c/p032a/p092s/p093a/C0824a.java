package p031c.p032a.p092s.p093a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import p031c.p032a.p092s.AbstractC0834j;
import p031c.p032a.p094t.C0841d;

/* renamed from: c.a.s.a.a */
/* loaded from: classes.dex */
public class C0824a {
    /* renamed from: a */
    private static String m4031a(Throwable th, AbstractC0834j abstractC0834j, ByteBuffer byteBuffer) {
        StringBuilder sb = new StringBuilder();
        if (abstractC0834j != null) {
            sb.append(abstractC0834j.toString());
            StringBuilder sb2 = new StringBuilder("|bytebuffer:");
            sb2.append(byteBuffer == null ? "byteBuffer is null" : byteBuffer.toString());
            sb.append(sb2.toString());
        }
        C0841d.m4109f("ByteBufferUtils", "byteBuffer info:" + sb.toString());
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            C0841d.m4109f("ByteBufferUtils", "parse data error stackTrace:" + stringWriter.toString());
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static short m4032a(java.nio.ByteBuffer r1, p031c.p032a.p092s.AbstractC0834j r2) {
        /*
            short r1 = r1.getShort()     // Catch: java.lang.Exception -> L5 java.nio.BufferOverflowException -> Lb java.nio.BufferUnderflowException -> L11
            return r1
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.fillInStackTrace()
            goto L16
        Lb:
            r0 = move-exception
            java.lang.Throwable r0 = r0.fillInStackTrace()
            goto L16
        L11:
            r0 = move-exception
            java.lang.Throwable r0 = r0.fillInStackTrace()
        L16:
            m4033b(r0, r2, r1)
            if (r2 == 0) goto L1f
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.f3568d = r1
        L1f:
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p092s.p093a.C0824a.m4032a(java.nio.ByteBuffer, c.a.s.j):short");
    }

    /* renamed from: b */
    private static void m4033b(Throwable th, AbstractC0834j abstractC0834j, ByteBuffer byteBuffer) {
        m4031a(th, abstractC0834j, byteBuffer);
    }
}
