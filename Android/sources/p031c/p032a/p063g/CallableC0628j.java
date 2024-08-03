package p031c.p032a.p063g;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p064h.C0653m;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p091r.C0822k;

/* renamed from: c.a.g.j */
/* loaded from: classes.dex */
public final class CallableC0628j implements Callable<C0632n> {

    /* renamed from: a */
    private LinkedHashSet<C0626h> f2929a = new LinkedHashSet<>();

    /* renamed from: b */
    private C0630l f2930b;

    public CallableC0628j(C0630l c0630l) {
        this.f2930b = c0630l;
    }

    /* renamed from: a */
    private void m3229a(C0636r c0636r, C0625g c0625g) {
        LinkedHashSet<C0626h> m3220b = C0626h.m3220b((String) C0618c.m3190a(this.f2930b.f2939c, C0617b.m3183u()));
        if (m3220b.isEmpty()) {
            m3220b = C0626h.m3218a(C0616a.m3150b());
        }
        m3220b.removeAll(this.f2929a);
        LinkedList m4012a = C0822k.m4012a(m3220b);
        C0675a.m3469c("Sis", "main sis: default sis" + m4012a);
        Iterator it = m4012a.iterator();
        while (it.hasNext()) {
            if (m3230a((C0626h) it.next(), c0636r, c0625g)) {
                return;
            }
        }
        LinkedHashSet<C0626h> m3361a = C0653m.m3358a().m3361a(C0616a.m3151c(), 10000L);
        m4012a.clear();
        if (m3361a != null) {
            m3361a.removeAll(this.f2929a);
            m4012a = C0822k.m4012a(m3361a);
        }
        C0675a.m3469c("Sis", "main sis: sis srv" + m4012a);
        Iterator it2 = m4012a.iterator();
        while (it2.hasNext() && !m3230a((C0626h) it2.next(), c0636r, c0625g)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:            r9.f2929a.add(r10);     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m3230a(p031c.p032a.p063g.C0626h r10, p031c.p032a.p063g.C0636r r11, p031c.p032a.p063g.C0625g r12) {
        /*
            r9 = this;
            boolean r0 = r11.m3265a()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            if (r10 == 0) goto L79
            boolean r2 = r10.m3221a()
            if (r2 == 0) goto L79
            java.util.LinkedHashSet<c.a.g.h> r2 = r9.f2929a
            boolean r2 = r2.contains(r10)
            if (r2 == 0) goto L1a
            goto L79
        L1a:
            c.a.k.a r3 = p031c.p032a.p067k.C0676a.m3479a()
            c.a.g.l r2 = r9.f2930b
            android.content.Context r4 = r2.f2939c
            java.lang.String r5 = r10.f2922a
            r6 = 3000(0xbb8, double:1.482E-320)
            r8 = 0
            java.net.InetAddress[] r2 = r3.m3482a(r4, r5, r6, r8)
            if (r2 == 0) goto L79
            int r3 = r2.length
            if (r3 != 0) goto L31
            goto L79
        L31:
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.LinkedList r2 = p031c.p032a.p091r.C0822k.m4012a(r2)
            java.util.Iterator r2 = r2.iterator()
        L3d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r2.next()
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            boolean r4 = r11.m3265a()
            if (r4 == 0) goto L50
            return r1
        L50:
            c.a.g.h r4 = new c.a.g.h
            int r5 = r10.f2923b
            r4.<init>(r3, r5)
            java.util.LinkedHashSet<c.a.g.h> r3 = r9.f2929a
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L3d
            boolean r3 = r12.m3215a(r4)
            if (r3 == 0) goto L3d
            java.util.LinkedHashSet<c.a.g.h> r1 = r9.f2929a
            r1.add(r4)
            c.a.g.q r1 = new c.a.g.q
            c.a.g.l r2 = r9.f2930b
            r1.<init>(r2, r11, r12)
            r11.m3264a(r1)
        L74:
            java.util.LinkedHashSet<c.a.g.h> r11 = r9.f2929a
            r11.add(r10)
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p063g.CallableC0628j.m3230a(c.a.g.h, c.a.g.r, c.a.g.g):boolean");
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C0632n call() {
        C0625g c0625g = new C0625g();
        C0636r c0636r = new C0636r(5, 2000, null);
        LinkedHashSet<C0626h> m3218a = C0626h.m3218a(C0616a.m3147a());
        m3218a.removeAll(this.f2929a);
        LinkedList m4012a = C0822k.m4012a(m3218a);
        C0675a.m3469c("Sis", "main sis: sis host=" + m4012a);
        Iterator it = m4012a.iterator();
        while (true) {
            if (!it.hasNext()) {
                C0626h m3216a = C0626h.m3216a((String) C0618c.m3190a(this.f2930b.f2939c, C0617b.m3155a(true)));
                C0675a.m3469c("Sis", "main sis: last good sis v4 address=" + m3216a);
                if (!m3230a(m3216a, c0636r, c0625g)) {
                    C0626h m3216a2 = C0626h.m3216a((String) C0618c.m3190a(this.f2930b.f2939c, C0617b.m3155a(false)));
                    C0675a.m3469c("Sis", "main sis: last good sis v6 address=" + m3216a2);
                    m3230a(m3216a2, c0636r, c0625g);
                }
            } else if (m3230a((C0626h) it.next(), c0636r, c0625g)) {
                break;
            }
        }
        C0675a.m3469c("Sis", "main sis: after host and last good, wait Result");
        Object m3262a = c0636r.m3262a(60000L);
        if (m3262a instanceof C0632n) {
            return (C0632n) m3262a;
        }
        m3229a(c0636r, c0625g);
        C0675a.m3469c("Sis", "main sis: after default and srv, wait Result");
        Object m3262a2 = c0636r.m3262a(60000L);
        if (m3262a2 instanceof C0632n) {
            return (C0632n) m3262a2;
        }
        return null;
    }
}
