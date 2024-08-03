package p031c.p032a.p065i;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.io.Closeable;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031c.p032a.p048P.p049a.C0557c;
import p031c.p032a.p062f.C0616a;
import p031c.p032a.p062f.C0617b;
import p031c.p032a.p062f.C0618c;
import p031c.p032a.p063g.C0626h;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p071o.AbstractC0688a;
import p031c.p032a.p071o.C0689b;
import p031c.p032a.p090q.C0809b;
import p031c.p032a.p091r.C0812a;
import p031c.p032a.p091r.C0816e;
import p031c.p032a.p091r.C0819h;
import p031c.p032a.p091r.C0822k;
import p031c.p032a.p092s.InterfaceC0836l;

/* renamed from: c.a.i.l */
/* loaded from: classes.dex */
public class C0669l {

    /* renamed from: a */
    private static C0669l f3095a;

    /* renamed from: b */
    private static int f3096b;

    /* renamed from: c */
    private final AtomicBoolean f3097c = new AtomicBoolean(false);

    /* renamed from: d */
    private final Map<C0626h, Pair<Integer, AbstractC0688a>> f3098d = new HashMap();

    /* renamed from: e */
    private final Map<C0626h, SparseArray<C0671n>> f3099e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, Set<C0626h>> f3100f = new HashMap();

    private C0669l() {
    }

    /* renamed from: a */
    private static synchronized int m3432a(Context context) {
        int intValue;
        synchronized (C0669l.class) {
            Integer num = (Integer) C0618c.m3194b(context, C0617b.m3177o());
            if (num == null) {
                num = Integer.valueOf(Math.abs(new SecureRandom().nextInt(10000)));
            }
            Integer valueOf = Integer.valueOf((num.intValue() + 1) % 10000);
            C0617b<Integer> m3177o = C0617b.m3177o();
            m3177o.m3188a((C0617b<Integer>) valueOf);
            C0618c.m3193a(context, (C0617b<?>[]) new C0617b[]{m3177o});
            intValue = valueOf.intValue();
        }
        return intValue;
    }

    /* renamed from: a */
    public static C0669l m3433a() {
        if (f3095a == null) {
            synchronized (C0669l.class) {
                if (f3095a == null) {
                    f3095a = new C0669l();
                }
            }
        }
        return f3095a;
    }

    /* renamed from: a */
    public static C0671n m3434a(Context context, JSONObject jSONObject, byte[] bArr, int i, File file, Set<String> set, InterfaceC0836l interfaceC0836l) {
        C0671n c0671n = new C0671n();
        c0671n.f3106b = jSONObject;
        c0671n.f3105a = i;
        c0671n.f3107c = bArr;
        c0671n.f3108d = file;
        c0671n.f3109e = set;
        c0671n.f3110f = m3432a(context);
        c0671n.f3114j = interfaceC0836l;
        return c0671n;
    }

    /* renamed from: a */
    public C0671n m3435a(C0626h c0626h, int i) {
        SparseArray<C0671n> sparseArray;
        if (c0626h == null || (sparseArray = this.f3099e.get(c0626h)) == null) {
            return null;
        }
        C0671n c0671n = sparseArray.get(i);
        sparseArray.remove(i);
        return c0671n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d7, code lost:            if (r7.f3100f.containsKey(r1) == false) goto L197;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0055. Please report as an issue. */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Set<p031c.p032a.p063g.C0626h> m3437a(android.content.Context r8, java.util.Set<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p032a.p065i.C0669l.m3437a(android.content.Context, java.util.Set):java.util.Set");
    }

    /* renamed from: a */
    private void m3438a(Context context, int i, AbstractC0688a abstractC0688a, C0626h c0626h, C0671n c0671n) {
        byte[] bArr;
        byte[] bArr2 = c0671n.f3107c;
        int i2 = c0671n.f3105a;
        int i3 = c0671n.f3110f;
        if (bArr2 == null || bArr2.length == 0 || bArr2.length > 30683) {
            bArr = null;
        } else {
            C0816e c0816e = new C0816e(bArr2.length + 37);
            c0816e.m3979b(0);
            c0816e.m3974a(1);
            C0659b.m3371a();
            c0816e.m3976a(C0659b.m3380b());
            long longValue = ((Long) C0618c.m3190a(context, C0617b.m3162d())).longValue();
            c0816e.m3981b(longValue);
            byte[] m3993c = C0819h.m3993c(longValue + C0819h.m3995e((String) C0618c.m3190a(context, C0617b.m3166f())) + C0819h.m3989a(bArr2));
            if (m3993c == null) {
                m3993c = new byte[16];
            } else if (m3993c.length != 16) {
                byte[] bArr3 = new byte[16];
                System.arraycopy(bArr2, 0, bArr3, 0, Math.min(m3993c.length, 16));
                m3993c = bArr3;
            }
            c0816e.m3978a(m3993c);
            c0816e.m3976a(i2);
            c0816e.m3979b(i3);
            c0816e.m3978a(bArr2);
            c0816e.m3980b(c0816e.m3973a(), 0);
            bArr = c0816e.m3982b();
        }
        if (bArr == null || bArr.length == 0) {
            C0675a.m3469c("TcpReporter", "package data failed, give up, data=" + c0671n);
            m3440a(context, c0671n, -1);
            return;
        }
        C0675a.m3469c("TcpReporter", "send tcp data, len=" + bArr.length + ", data=" + c0671n);
        c0671n.f3113i = true;
        abstractC0688a.mo3555a(bArr);
        C0809b.m3924a().m3929b(60000 + i, 31000L, new RunnableC0670m(context, c0626h));
        C0809b.m3924a().m3929b(c0671n.f3110f + 50000, 30000L, new RunnableC0670m(context, c0671n));
    }

    /* renamed from: a */
    public void m3439a(Context context, C0626h c0626h, int i) {
        int i2;
        StringBuilder sb;
        Pair<Integer, AbstractC0688a> remove = this.f3098d.remove(c0626h);
        if (remove != null) {
            i2 = ((Integer) remove.first).intValue();
            C0822k.m4013a((Closeable) remove.second);
        } else {
            i2 = 0;
        }
        SparseArray<C0671n> remove2 = this.f3099e.remove(c0626h);
        if (i == 0 && !C0812a.m3947c(context)) {
            i = -2;
        }
        if (remove2 == null || remove2.size() <= 0) {
            if (i2 > 0) {
                C0675a.m3469c("TcpReporter", "socket(" + i2 + ") at " + c0626h + " is disconnected, no task left");
                return;
            }
            return;
        }
        if (i == 0) {
            sb = new StringBuilder("socket(");
            sb.append(i2);
            sb.append(") at ");
            sb.append(c0626h);
            sb.append(" is disconnected, go on send waiting request");
        } else {
            sb = new StringBuilder("socket(");
            sb.append(i2);
            sb.append(") at ");
            sb.append(c0626h);
            sb.append(" is disconnected, finish waiting request, code=");
            sb.append(i);
        }
        C0675a.m3469c("TcpReporter", sb.toString());
        for (int i3 = 0; i3 < remove2.size(); i3++) {
            C0671n valueAt = remove2.valueAt(i3);
            C0809b.m3924a().m3928b(valueAt.f3110f + 50000);
            if (i == 0) {
                m3446a(context, valueAt);
            } else {
                RunnableC0670m runnableC0670m = new RunnableC0670m(context, 3, valueAt);
                runnableC0670m.f3104f = i;
                C0557c.m2899a(runnableC0670m);
            }
        }
    }

    /* renamed from: a */
    private void m3440a(Context context, C0671n c0671n, int i) {
        SparseArray<C0671n> sparseArray;
        C0626h c0626h = c0671n.f3111g;
        if (c0626h != null && (sparseArray = this.f3099e.get(c0626h)) != null) {
            sparseArray.remove(c0671n.f3110f);
        }
        C0809b.m3924a().m3928b(c0671n.f3110f + 50000);
        RunnableC0670m runnableC0670m = new RunnableC0670m(context, 3, c0671n);
        runnableC0670m.f3104f = i;
        C0557c.m2899a(runnableC0670m);
    }

    /* renamed from: a */
    public static /* synthetic */ void m3441a(C0669l c0669l, Context context, C0626h c0626h) {
        AbstractC0688a abstractC0688a;
        byte b2;
        if (c0626h == null) {
            return;
        }
        try {
            Pair<Integer, AbstractC0688a> pair = c0669l.f3098d.get(c0626h);
            if (pair != null && (abstractC0688a = (AbstractC0688a) pair.second) != null && !abstractC0688a.m3558m()) {
                C0675a.m3469c("TcpReporter", "start tcp socket(" + pair.first + "):" + c0626h);
                if (abstractC0688a.mo3554a(c0626h.f2922a, c0626h.f2923b) != 0) {
                    c0669l.m3439a(context, c0626h, 0);
                } else {
                    C0557c.m2899a(new RunnableC0670m(context, 2, c0626h));
                    RunnableC0670m runnableC0670m = new RunnableC0670m(context, c0626h);
                    while (!c0669l.f3097c.get()) {
                        try {
                            ByteBuffer mo3556b = abstractC0688a.mo3556b(0);
                            try {
                                C0675a.m3469c("TcpReporter", "Received bytes - len:" + mo3556b.array().length);
                                b2 = mo3556b.get(2);
                            } catch (Throwable th) {
                                C0675a.m3475g("TcpReporter", "tcp reporter onReceive err:" + th);
                            }
                            if (b2 != 1 && b2 != 0) {
                                C0675a.m3475g("TcpReporter", "wrong version");
                                C0809b.m3924a().m3929b(((Integer) pair.first).intValue() + 60000, 31000L, runnableC0670m);
                            }
                            short s = mo3556b.getShort(15);
                            short s2 = mo3556b.getShort(17);
                            C0675a.m3469c("TcpReporter", "onResult seqId=" + ((int) s) + " code=" + ((int) s2));
                            C0809b.m3924a().m3928b(50000 + s);
                            C0671n m3435a = c0669l.m3435a(c0626h, s);
                            if (m3435a != null) {
                                if (s2 == 0) {
                                    RunnableC0670m runnableC0670m2 = new RunnableC0670m(context, 3, m3435a);
                                    runnableC0670m2.f3104f = s2;
                                    C0557c.m2899a(runnableC0670m2);
                                } else if (s2 == 401) {
                                    c0669l.m3439a(context, c0626h, s2);
                                } else {
                                    c0669l.m3446a(context, m3435a);
                                }
                            }
                            C0809b.m3924a().m3929b(((Integer) pair.first).intValue() + 60000, 31000L, runnableC0670m);
                        } catch (C0663f e2) {
                            if (e2.f3069a != -997) {
                                C0675a.m3475g("TcpReporter", "recv failed with error:" + e2);
                            }
                        }
                    }
                }
                c0669l.m3439a(context, c0626h, 0);
                if (c0669l.f3097c.get()) {
                    C0675a.m3475g("TcpReporter", "Break receiving by wantStop");
                } else {
                    C0675a.m3475g("TcpReporter", "disconnected");
                }
            }
        } catch (Throwable th2) {
            C0675a.m3466a("TcpReporter", "socket exception", th2);
        }
    }

    /* renamed from: a */
    private void m3443a(JSONObject jSONObject) {
        if (jSONObject.length() == 0) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        C0626h m3216a = C0626h.m3216a(optJSONArray.getString(i));
                        if (m3216a != null && m3216a.m3221a()) {
                            linkedHashSet.add(m3216a);
                        }
                    }
                }
                hashMap.put(next, linkedHashSet);
            }
            if (hashMap.isEmpty()) {
                return;
            }
            this.f3100f = hashMap;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static synchronized int m3444b() {
        int i;
        synchronized (C0669l.class) {
            i = (f3096b + 1) % 10000;
            f3096b = i;
        }
        return i;
    }

    /* renamed from: b */
    public static /* synthetic */ void m3445b(C0669l c0669l, Context context, C0626h c0626h) {
        AbstractC0688a abstractC0688a;
        C0675a.m3469c("TcpReporter", "socket at " + c0626h + " is connected, deal with waiting request");
        SparseArray<C0671n> sparseArray = c0669l.f3099e.get(c0626h);
        Pair<Integer, AbstractC0688a> pair = c0669l.f3098d.get(c0626h);
        if (pair != null) {
            if (sparseArray != null && (abstractC0688a = (AbstractC0688a) pair.second) != null && abstractC0688a.m3558m()) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    C0671n valueAt = sparseArray.valueAt(i);
                    if (!valueAt.f3113i) {
                        c0669l.m3438a(context, ((Integer) pair.first).intValue(), abstractC0688a, c0626h, valueAt);
                    }
                }
            }
            C0809b.m3924a().m3929b(((Integer) pair.first).intValue() + 60000, 31000L, new RunnableC0670m(context, c0626h));
        }
    }

    /* renamed from: a */
    public final void m3446a(Context context, C0671n c0671n) {
        try {
            boolean z = c0671n.f3112h == null;
            if (z) {
                C0809b.m3924a().m3926a(context);
                Set<String> set = c0671n.f3109e;
                LinkedHashSet<C0626h> linkedHashSet = new LinkedHashSet<>();
                C0626h m3216a = C0626h.m3216a(C0616a.m3152d());
                if (m3216a == null || !m3216a.m3221a()) {
                    Set<C0626h> m3437a = m3437a(context, set);
                    if (m3437a != null) {
                        for (C0626h c0626h : m3437a) {
                            if (c0626h != null && c0626h.m3221a()) {
                                linkedHashSet.add(c0626h);
                            }
                        }
                    }
                } else {
                    linkedHashSet.add(m3216a);
                }
                C0675a.m3469c("TcpReporter", "tcp report find urls=" + linkedHashSet);
                c0671n.f3112h = linkedHashSet;
                C0675a.m3469c("TcpReporter", "tcp report begin=" + c0671n);
            }
            if (!C0812a.m3947c(context)) {
                m3440a(context, c0671n, -2);
                return;
            }
            if (c0671n.f3112h != null && !c0671n.f3112h.isEmpty()) {
                C0626h next = c0671n.f3112h.iterator().next();
                c0671n.f3111g = next;
                c0671n.f3112h.remove(next);
                if (z) {
                    C0809b.m3924a().m3929b(c0671n.f3110f + 50000, 30000L, new RunnableC0670m(context, c0671n));
                }
                Pair<Integer, AbstractC0688a> pair = this.f3098d.get(next);
                AbstractC0688a abstractC0688a = pair != null ? (AbstractC0688a) pair.second : null;
                SparseArray<C0671n> sparseArray = this.f3099e.get(next);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    this.f3099e.put(next, sparseArray);
                }
                c0671n.f3113i = false;
                sparseArray.put(c0671n.f3110f, c0671n);
                if (abstractC0688a == null) {
                    this.f3098d.put(next, new Pair<>(Integer.valueOf(m3444b()), new C0689b(30720, 19)));
                    C0557c.m2901a("TCP_REPORT", new RunnableC0670m(context, 1, next));
                    return;
                } else {
                    if (abstractC0688a.m3558m()) {
                        m3438a(context, ((Integer) pair.first).intValue(), abstractC0688a, next, c0671n);
                        return;
                    }
                    return;
                }
            }
            m3440a(context, c0671n, -1);
        } catch (Throwable th) {
            C0675a.m3475g("TcpReporter", "tcp upload e:" + th);
        }
    }
}
