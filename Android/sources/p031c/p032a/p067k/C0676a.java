package p031c.p032a.p067k;

import android.util.Pair;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.k.a */
/* loaded from: classes.dex */
public final class C0676a {

    /* renamed from: a */
    private static volatile C0676a f3125a;

    /* renamed from: b */
    private static final Object f3126b = new Object();

    /* renamed from: c */
    private long f3127c = 36000000;

    /* renamed from: d */
    private long f3128d = 900000;

    /* renamed from: e */
    private final Map<String, Pair<InetAddress[], Long>> f3129e = new HashMap();

    private C0676a() {
    }

    /* renamed from: a */
    public static C0676a m3479a() {
        if (f3125a == null) {
            synchronized (f3126b) {
                if (f3125a == null) {
                    f3125a = new C0676a();
                }
            }
        }
        return f3125a;
    }

    /* renamed from: a */
    private static InetAddress m3480a(String str) {
        if (C0819h.m3996f(str) || C0819h.m3997g(str)) {
            try {
                return InetAddress.getByName(str);
            } catch (UnknownHostException e2) {
                C0675a.m3475g("DNSLoader", "dns resolve failed:" + e2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.InetAddress[] m3482a(android.content.Context r20, java.lang.String r21, long r22, boolean r24) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p067k.C0676a.m3482a(android.content.Context, java.lang.String, long, boolean):java.net.InetAddress[]");
    }
}
