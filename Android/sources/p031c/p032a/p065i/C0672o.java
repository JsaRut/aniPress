package p031c.p032a.p065i;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p031c.p032a.p063g.C0621c;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p068l.C0680b;
import p031c.p032a.p090q.AbstractC0808a;
import p031c.p032a.p090q.C0809b;

/* renamed from: c.a.i.o */
/* loaded from: classes.dex */
public final class C0672o {

    /* renamed from: a */
    private static volatile C0672o f3115a;

    /* renamed from: b */
    private static final Object f3116b = new Object();

    /* renamed from: c */
    private static long f3117c = 1;

    /* renamed from: e */
    private AbstractC0808a f3119e = new C0673p(this);

    /* renamed from: d */
    private Map<Long, C0660c> f3118d = new HashMap();

    private C0672o() {
    }

    /* renamed from: a */
    public static C0672o m3448a() {
        if (f3115a == null) {
            synchronized (f3116b) {
                if (f3115a == null) {
                    f3115a = new C0672o();
                }
            }
        }
        return f3115a;
    }

    /* renamed from: a */
    private static byte[] m3449a(Context context, C0660c c0660c) {
        return C0680b.m3495a(context, c0660c.f3062d, c0660c.f3063e, c0660c.f3064f, c0660c.f3065g, 0L);
    }

    /* renamed from: b */
    public static long m3450b() {
        long j = f3117c + 1;
        f3117c = j;
        if (j >= 2147483647L) {
            f3117c = 1L;
        }
        return f3117c;
    }

    /* renamed from: a */
    public final void m3451a(long j) {
        C0660c remove = this.f3118d.remove(Long.valueOf(j));
        if (remove != null) {
            if (remove.f3068j) {
                C0809b.m3924a().m3928b((int) (j + 100000));
            }
            C0675a.m3469c("TcpRequestManager", "handle reponse :" + remove);
        }
    }

    /* renamed from: a */
    public final void m3452a(Context context) {
        if (this.f3118d.isEmpty()) {
            C0675a.m3469c("TcpRequestManager", "no cache request");
            return;
        }
        for (Map.Entry<Long, C0660c> entry : this.f3118d.entrySet()) {
            if (entry.getValue().f3068j) {
                long nanoTime = System.nanoTime() - entry.getValue().f3066h;
                if (entry.getValue().f3067i - nanoTime >= 10000) {
                    entry.getValue().f3059a++;
                    C0675a.m3469c("TcpRequestManager", "send again:" + entry.getValue());
                    C0666i.m3408a().m3430c().m3228c().mo3555a(m3449a(context, entry.getValue()));
                } else {
                    C0675a.m3469c("TcpRequestManager", "shoud not send again by 10000ms,hasRequestTime:" + nanoTime + ",timeout:" + entry.getValue().f3067i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3453a(Context context, long j) {
        C0660c remove = this.f3118d.remove(Long.valueOf(j));
        if (remove == null) {
            C0675a.m3475g("TcpRequestManager", "not found requst by rid:" + j);
        } else {
            C0675a.m3469c("TcpRequestManager", "request time out:" + remove);
            C0659b.m3371a();
            C0659b.m3374a(context, remove.f3061c, remove.f3060b, remove.f3062d);
        }
    }

    /* renamed from: a */
    public final void m3454a(Context context, long j, int i, int i2, byte[] bArr, String str) {
        long m3203b = C0621c.m3203b(context);
        if (this.f3118d.containsKey(Long.valueOf(m3203b))) {
            C0675a.m3476h("TcpRequestManager", "Generator same rid,not do this msg");
            return;
        }
        C0660c c0660c = new C0660c(j, str, i, i2, m3203b, 0L, bArr);
        if (C0666i.m3408a().m3431d()) {
            C0666i.m3408a().m3430c().m3228c().mo3555a(m3449a(context, c0660c));
        }
        this.f3118d.put(Long.valueOf(m3203b), c0660c);
    }

    /* renamed from: a */
    public final void m3455a(Context context, long j, int i, int i2, byte[] bArr, String str, long j2) {
        long j3;
        if (i == 10) {
            j3 = j;
        } else {
            long m3203b = C0621c.m3203b(context);
            C0675a.m3469c("TcpRequestManager", "Generator new rid:" + m3203b);
            if (this.f3118d.containsKey(Long.valueOf(m3203b))) {
                C0675a.m3476h("TcpRequestManager", "Generator same rid,not do this msg");
                return;
            }
            j3 = m3203b;
        }
        long j4 = j2 <= 0 ? 10000L : j2;
        long j5 = j4;
        C0660c c0660c = new C0660c(j, str, i, i2, j3, j4, bArr);
        if (C0666i.m3408a().m3431d()) {
            C0666i.m3408a().m3430c().m3228c().mo3555a(m3449a(context, c0660c));
        }
        c0660c.f3066h = System.nanoTime();
        this.f3118d.put(Long.valueOf(j3), c0660c);
        C0809b.m3924a().m3929b((int) (j3 + 100000), j5, this.f3119e);
    }

    /* renamed from: b */
    public final C0660c m3456b(long j) {
        return this.f3118d.get(Long.valueOf(j));
    }
}
