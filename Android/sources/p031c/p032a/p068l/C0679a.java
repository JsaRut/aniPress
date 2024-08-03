package p031c.p032a.p068l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.nio.ByteBuffer;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p065i.C0659b;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p069m.C0684a;
import p031c.p032a.p069m.C0685b;
import p031c.p032a.p070n.RunnableC0686a;

/* renamed from: c.a.l.a */
/* loaded from: classes.dex */
public final class C0679a {
    /* renamed from: a */
    public static Pair<C0681c, ByteBuffer> m3491a(Context context, byte[] bArr, String str) {
        ByteBuffer wrap;
        if (bArr.length < 20) {
            C0675a.m3476h("JCommands", "Error: received body-length short than common head-length, return null");
            return null;
        }
        byte[] bArr2 = new byte[20];
        System.arraycopy(bArr, 0, bArr2, 0, 20);
        C0681c c0681c = new C0681c(false, bArr2);
        C0675a.m3469c("JCommands", "parsed head - " + c0681c.toString());
        int i = c0681c.f3136a - 20;
        if (i < 0) {
            C0675a.m3476h("JCommands", "Error: totalBytes length error with no encrypted, return null");
            return null;
        }
        C0675a.m3465a("JCommands", "body size:" + i);
        if (TextUtils.isEmpty(str)) {
            str = C0684a.m3500a(context);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr, 20, bArr3, 0, i);
        C0675a.m3469c("JCommands", "decode algorithm:" + ((int) c0681c.f3139d) + ", pwd:" + str);
        if (TextUtils.isEmpty(str)) {
            System.arraycopy(bArr, 20, bArr3, 0, i);
            wrap = ByteBuffer.wrap(bArr3);
        } else {
            try {
                wrap = ByteBuffer.wrap(c0681c.f3139d == 2 ? new C0685b().m3521b(bArr3, C0685b.m3514a(str), str.substring(0, 16).getBytes("utf-8")) : C0684a.m3507b(str, bArr3));
            } catch (Exception e2) {
                C0675a.m3469c("JCommands", "decryptBytes error:" + e2.getMessage());
                return null;
            }
        }
        return new Pair<>(c0681c, wrap);
    }

    /* renamed from: a */
    public static boolean m3492a(Context context, byte[] bArr) {
        try {
            Pair<C0681c, ByteBuffer> m3491a = m3491a(context, bArr, "");
            if (m3491a == null) {
                return false;
            }
            long m2911e = C0557c.m2911e(context);
            long j = ((C0681c) m3491a.first).f3142g;
            C0675a.m3469c("JCommands", "uid:" + m2911e + ",msgUid:" + j + ",cmd:" + ((C0681c) m3491a.first).f3138c);
            if (m2911e == 0 || j == 0 || m2911e == j) {
                C0659b.m3371a();
                C0659b.m3373a(context, (C0681c) m3491a.first, (ByteBuffer) m3491a.second);
                return true;
            }
            C0675a.m3469c("JCommands", "recv other app msg");
            RunnableC0686a.m3523a().m3539a(context, j, bArr);
            return true;
        } catch (Throwable th) {
            C0675a.m3476h("JCommands", "dispatchMessage error:" + th.getMessage());
            th.printStackTrace();
            return false;
        }
    }
}
