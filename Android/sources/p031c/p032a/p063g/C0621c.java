package p031c.p032a.p063g;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;
import java.util.Random;
import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p065i.C0659b;
import p031c.p032a.p065i.C0663f;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0679a;
import p031c.p032a.p068l.C0680b;
import p031c.p032a.p068l.C0681c;
import p031c.p032a.p068l.C0683e;
import p031c.p032a.p069m.C0684a;
import p031c.p032a.p071o.AbstractC0688a;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0814c;
import p031c.p032a.p091r.C0816e;
import p031c.p032a.p091r.C0819h;
import p031c.p032a.p091r.C0821j;
import p031c.p032a.p091r.C0822k;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.g.c */
/* loaded from: classes.dex */
public final class C0621c {
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3196a(android.content.Context r20, p031c.p032a.p071o.AbstractC0688a r21) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p063g.C0621c.m3196a(android.content.Context, c.a.o.a):int");
    }

    /* renamed from: a */
    public static void m3197a(Context context) {
        C0617b<String> m3178p = C0617b.m3178p();
        m3178p.m3188a((C0617b<String>) null);
        C0617b<String> m3179q = C0617b.m3179q();
        m3179q.m3188a((C0617b<String>) null);
        C0617b<String> m3161c = C0617b.m3161c(false);
        m3161c.m3188a((C0617b<String>) null);
        C0617b<String> m3161c2 = C0617b.m3161c(true);
        m3161c2.m3188a((C0617b<String>) null);
        C0617b<String> m3183u = C0617b.m3183u();
        m3183u.m3188a((C0617b<String>) null);
        C0617b<Boolean> m3180r = C0617b.m3180r();
        m3180r.m3188a((C0617b<Boolean>) null);
        C0617b<Long> m3181s = C0617b.m3181s();
        m3181s.m3188a((C0617b<Long>) null);
        C0617b<String> m3155a = C0617b.m3155a(true);
        m3155a.m3188a((C0617b<String>) null);
        C0617b<String> m3155a2 = C0617b.m3155a(false);
        m3155a2.m3188a((C0617b<String>) null);
        C0617b<String> m3158b = C0617b.m3158b(true);
        m3158b.m3188a((C0617b<String>) null);
        C0617b<String> m3158b2 = C0617b.m3158b(false);
        m3158b2.m3188a((C0617b<String>) null);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3178p, m3179q, m3161c, m3161c2, m3183u, m3180r, m3181s, m3155a, m3155a2, m3158b, m3158b2});
        C0617b<Long> m3162d = C0617b.m3162d();
        m3162d.m3188a((C0617b<Long>) null);
        C0617b<String> m3164e = C0617b.m3164e();
        m3164e.m3188a((C0617b<String>) null);
        C0617b<String> m3166f = C0617b.m3166f();
        m3166f.m3188a((C0617b<String>) null);
        C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3162d, m3164e, m3166f});
    }

    /* renamed from: a */
    private static synchronized byte[] m3198a(String str, int i, byte[] bArr, boolean z, int i2) {
        byte[] m3982b;
        synchronized (C0621c.class) {
            if (TextUtils.isEmpty(str) || str.length() != 2 || bArr == null || bArr.length == 0) {
                throw new IllegalArgumentException("flag or body length error");
            }
            C0816e c0816e = new C0816e(300);
            c0816e.m3979b(0);
            c0816e.m3978a(str.getBytes());
            c0816e.m3976a(i);
            c0816e.m3979b(i2);
            c0816e.m3978a(bArr);
            c0816e.m3980b(c0816e.m3973a(), 0);
            c0816e.m3975a((int) ((byte) ((z ? 1 : 0) | 16)), 4);
            m3982b = c0816e.m3982b();
        }
        return m3982b;
    }

    /* renamed from: a */
    public static byte[] m3199a(String str, String str2) {
        byte[] m4000j = C0819h.m4000j(str2);
        boolean z = false;
        try {
            byte[] m4016a = C0822k.m4016a(m4000j);
            if (m4016a.length < m4000j.length) {
                z = true;
                m4000j = m4016a;
            }
        } catch (IOException unused) {
        }
        int length = m4000j.length;
        int m3505b = C0684a.m3505b();
        return m3198a(str, m3505b, C0684a.m3504a(C0684a.m3499a(m3505b), m4000j), z, length);
    }

    /* renamed from: a */
    public static byte[] m3200a(DatagramSocket datagramSocket, DatagramPacket datagramPacket) {
        datagramSocket.setSoTimeout(6000);
        datagramSocket.send(datagramPacket);
        DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1024], 1024);
        C0675a.m3471d("ConnectingHelper", "udp Receiving...");
        datagramSocket.receive(datagramPacket2);
        byte[] bArr = new byte[datagramPacket2.getLength()];
        System.arraycopy(datagramPacket2.getData(), 0, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m3201a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new C0663f(4, "response is empty!");
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.getShort();
            wrap.getShort();
            int i = wrap.getInt();
            int i2 = i >>> 24;
            long j = i & 16777215;
            wrap.getShort();
            int remaining = wrap.remaining();
            byte[] bArr2 = new byte[remaining];
            wrap.get(bArr2, 0, remaining);
            if (j != 0) {
                try {
                    bArr2 = C0684a.m3507b(C0684a.m3499a(j), bArr2);
                    if (bArr2 == null) {
                        throw new C0663f(5, "decrypt response error");
                    }
                } catch (Exception unused) {
                    throw new C0663f(5, "decrypt response error");
                }
            }
            if ((i2 & 1) != 1) {
                return bArr2;
            }
            try {
                return C0822k.m4018b(bArr2);
            } catch (IOException unused2) {
                return bArr2;
            }
        } catch (Throwable th) {
            throw new C0663f(4, "parse head error:" + th.getMessage());
        }
    }

    /* renamed from: b */
    public static int m3202b(Context context, AbstractC0688a abstractC0688a) {
        Object obj;
        Object obj2;
        String str = m3204b(C0821j.m4006a(context), " ") + "$$" + m3204b(C0814c.m3962a(context).f3549t, " ") + "$$" + context.getPackageName() + "$$" + C0557c.m2915i(context);
        String str2 = C0814c.m3962a(context).f3534e;
        C0659b.m3371a();
        String m3383d = C0659b.m3383d();
        C0675a.m3469c("ConnectingHelper", "regVersion:" + m3383d);
        C0814c m3962a = C0814c.m3962a(context);
        String str3 = m3204b(m3962a.f3535f, " ") + "$$" + m3204b(m3962a.f3536g, " ") + "$$" + m3204b(m3962a.f3537h, " ") + "$$" + m3204b(m3962a.f3538i, " ") + "$$" + m3204b(C0557c.m2910d(context), " ") + "$$" + m3383d + "$$" + m3962a.f3540k + "$$" + m3962a.f3541l;
        String str4 = C0814c.m3962a(context).f3543n;
        if ("unknown".equalsIgnoreCase(str4)) {
            str4 = " ";
        }
        String m2904b = C0557c.m2904b(context);
        String str5 = C0557c.m2909c(context) + "$$" + m3204b(m2904b, " ") + "$$" + m3204b(C0814c.m3962a(context).f3550u, " ") + "$$" + m3204b(C0814c.m3962a(context).f3542m, " ") + "$$" + m3204b(C0557c.m2924r(context) ? C0812a.m3948d(context, "") : "", " ") + "$$" + m3204b(str4, " ");
        C0659b.m3371a();
        long m3380b = C0659b.m3380b();
        String m2888a = C0557c.m2888a(context);
        C0675a.m3469c("ConnectingHelper", "Register with: key:" + str + ", apkVersion:" + str2 + ", clientInfo:" + str3 + ", extKey:" + str5 + ",reg business:" + m3380b + " accountId:" + m2888a);
        long m3203b = m3203b(context);
        int m3498a = C0684a.m3498a();
        C0816e c0816e = new C0816e(20480);
        c0816e.m3979b(0);
        c0816e.m3974a(19);
        c0816e.m3974a(0);
        c0816e.m3981b(m3203b);
        c0816e.m3976a((long) m3498a);
        c0816e.m3981b(0L);
        c0816e.m3977a(str);
        c0816e.m3977a(str2);
        c0816e.m3977a(str3);
        c0816e.m3974a(0);
        c0816e.m3977a(str5);
        c0816e.m3976a(m3380b);
        c0816e.m3977a(m2888a);
        c0816e.m3980b(c0816e.m3973a(), 0);
        byte[] m3496a = C0680b.m3496a(context, c0816e.m3982b());
        if (m3496a == null) {
            C0675a.m3476h("ConnectingHelper", "Register failed - encrytor reg info failed");
            return -1;
        }
        if (abstractC0688a.mo3555a(m3496a) != 0) {
            C0675a.m3476h("ConnectingHelper", "Register failed - send reg info failed");
            return -1;
        }
        try {
            Pair<C0681c, ByteBuffer> m3491a = C0679a.m3491a(context, abstractC0688a.mo3556b(20000).array(), "");
            if (m3491a == null || (obj = m3491a.first) == null || (obj2 = m3491a.second) == null || ((C0681c) obj).f3138c != 0) {
                C0675a.m3476h("ConnectingHelper", "Register failed - can't parse a Register Response");
                return -1;
            }
            C0683e c0683e = new C0683e((C0681c) obj, (ByteBuffer) obj2);
            C0675a.m3469c("ConnectingHelper", "register response:" + c0683e);
            int i = c0683e.f3155c;
            C0617b<Integer> m3156b = C0617b.m3156b();
            m3156b.m3188a((C0617b<Integer>) Integer.valueOf(i));
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3156b});
            if (i == 0) {
                long j = c0683e.f3156d;
                String str6 = c0683e.f3157e;
                String str7 = c0683e.f3158f;
                String str8 = c0683e.f3159g;
                C0675a.m3474f("ConnectingHelper", "Register succeed - juid:" + j + ", registrationId:" + str7 + ", deviceId:" + str8);
                if (C0819h.m3990a(str7) || 0 == j) {
                    C0675a.m3478j("ConnectingHelper", "Unexpected: registrationId/juid should not be empty. ");
                    return -1;
                }
                C0557c.m2893a(context, str8);
                C0557c.m2890a(context, j, str6, str7);
            }
            return i;
        } catch (C0663f e2) {
            C0675a.m3476h("ConnectingHelper", "Register failed - recv msg failed with error:" + e2);
            return -1;
        }
    }

    /* renamed from: b */
    public static synchronized long m3203b(Context context) {
        long j;
        synchronized (C0621c.class) {
            long longValue = ((Long) C0618c.m3190a(context, C0617b.m3176n())).longValue();
            if (longValue == -1) {
                longValue = Math.abs(new Random().nextInt(10000));
            }
            j = (longValue + (longValue % 2 == 0 ? 1L : 2L)) % 10000;
            C0617b<Long> m3176n = C0617b.m3176n();
            m3176n.m3188a((C0617b<Long>) Long.valueOf(j));
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3176n});
        }
        return j;
    }

    /* renamed from: b */
    private static String m3204b(String str, String str2) {
        return !C0819h.m3990a(str) ? str : str2;
    }

    /* renamed from: c */
    private static String m3205c(Context context) {
        String str = null;
        if (C0831g.m4078b()) {
            try {
                Object m4072a = C0831g.m4072a(context, C0556b.f2704d, 32, "", null, new Object[0]);
                if (m4072a instanceof Bundle) {
                    String string = ((Bundle) m4072a).getString("test_country");
                    try {
                        C0675a.m3469c("ConnectingHelper", "test country code : " + string);
                    } catch (Throwable unused) {
                    }
                    str = string;
                }
            } catch (Throwable unused2) {
            }
        }
        return !TextUtils.isEmpty(str) ? str : C0812a.m3958k(context);
    }
}
