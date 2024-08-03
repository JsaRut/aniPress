package p139d.p143b.p145b.p147b;

import android.content.Context;
import com.facebook.common.time.C0987c;
import com.facebook.common.time.InterfaceC0985a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p139d.p143b.p144a.InterfaceC1643a;
import p139d.p143b.p145b.p146a.C1649e;
import p139d.p143b.p145b.p146a.InterfaceC1645a;
import p139d.p143b.p145b.p146a.InterfaceC1647c;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p145b.p146a.InterfaceC1654j;
import p139d.p143b.p145b.p147b.InterfaceC1662h;
import p139d.p143b.p148c.p149a.InterfaceC1670a;
import p139d.p143b.p148c.p149a.InterfaceC1671b;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p157i.C1720a;

/* renamed from: d.b.b.b.j */
/* loaded from: classes.dex */
public class C1664j implements InterfaceC1668n, InterfaceC1670a {

    /* renamed from: a */
    private static final Class<?> f6157a = C1664j.class;

    /* renamed from: b */
    private static final long f6158b = TimeUnit.HOURS.toMillis(2);

    /* renamed from: c */
    private static final long f6159c = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: d */
    private final long f6160d;

    /* renamed from: e */
    private final long f6161e;

    /* renamed from: f */
    private final CountDownLatch f6162f;

    /* renamed from: g */
    private long f6163g;

    /* renamed from: h */
    private final InterfaceC1647c f6164h;

    /* renamed from: i */
    final Set<String> f6165i;

    /* renamed from: j */
    private long f6166j;

    /* renamed from: k */
    private final long f6167k;

    /* renamed from: l */
    private final C1720a f6168l;

    /* renamed from: m */
    private final InterfaceC1662h f6169m;

    /* renamed from: n */
    private final InterfaceC1667m f6170n;

    /* renamed from: o */
    private final InterfaceC1645a f6171o;

    /* renamed from: p */
    private final boolean f6172p;

    /* renamed from: q */
    private final a f6173q;

    /* renamed from: r */
    private final InterfaceC0985a f6174r;

    /* renamed from: s */
    private final Object f6175s = new Object();

    /* renamed from: t */
    private boolean f6176t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.b.b.b.j$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private boolean f6177a = false;

        /* renamed from: b */
        private long f6178b = -1;

        /* renamed from: c */
        private long f6179c = -1;

        a() {
        }

        /* renamed from: a */
        public synchronized long m6913a() {
            return this.f6179c;
        }

        /* renamed from: a */
        public synchronized void m6914a(long j, long j2) {
            if (this.f6177a) {
                this.f6178b += j;
                this.f6179c += j2;
            }
        }

        /* renamed from: b */
        public synchronized long m6915b() {
            return this.f6178b;
        }

        /* renamed from: b */
        public synchronized void m6916b(long j, long j2) {
            this.f6179c = j2;
            this.f6178b = j;
            this.f6177a = true;
        }

        /* renamed from: c */
        public synchronized boolean m6917c() {
            return this.f6177a;
        }

        /* renamed from: d */
        public synchronized void m6918d() {
            this.f6177a = false;
            this.f6179c = -1L;
            this.f6178b = -1L;
        }
    }

    /* renamed from: d.b.b.b.j$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final long f6180a;

        /* renamed from: b */
        public final long f6181b;

        /* renamed from: c */
        public final long f6182c;

        public b(long j, long j2, long j3) {
            this.f6180a = j;
            this.f6181b = j2;
            this.f6182c = j3;
        }
    }

    public C1664j(InterfaceC1662h interfaceC1662h, InterfaceC1667m interfaceC1667m, b bVar, InterfaceC1647c interfaceC1647c, InterfaceC1645a interfaceC1645a, InterfaceC1671b interfaceC1671b, Context context, Executor executor, boolean z) {
        this.f6160d = bVar.f6181b;
        long j = bVar.f6182c;
        this.f6161e = j;
        this.f6163g = j;
        this.f6168l = C1720a.m7065a();
        this.f6169m = interfaceC1662h;
        this.f6170n = interfaceC1667m;
        this.f6166j = -1L;
        this.f6164h = interfaceC1647c;
        this.f6167k = bVar.f6180a;
        this.f6171o = interfaceC1645a;
        this.f6173q = new a();
        if (interfaceC1671b != null) {
            interfaceC1671b.mo6934a(this);
        }
        this.f6174r = C0987c.m4970a();
        this.f6172p = z;
        this.f6165i = new HashSet();
        if (!this.f6172p) {
            this.f6162f = new CountDownLatch(0);
        } else {
            this.f6162f = new CountDownLatch(1);
            executor.execute(new RunnableC1663i(this));
        }
    }

    /* renamed from: a */
    private InterfaceC1643a m6895a(InterfaceC1662h.b bVar, InterfaceC1648d interfaceC1648d, String str) {
        InterfaceC1643a mo6863a;
        synchronized (this.f6175s) {
            mo6863a = bVar.mo6863a(interfaceC1648d);
            this.f6165i.add(str);
            this.f6173q.m6914a(mo6863a.size(), 1L);
        }
        return mo6863a;
    }

    /* renamed from: a */
    private InterfaceC1662h.b m6896a(String str, InterfaceC1648d interfaceC1648d) {
        m6901b();
        return this.f6169m.mo6845a(str, interfaceC1648d);
    }

    /* renamed from: a */
    private Collection<InterfaceC1662h.a> m6898a(Collection<InterfaceC1662h.a> collection) {
        long now = this.f6174r.now() + f6158b;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (InterfaceC1662h.a aVar : collection) {
            if (aVar.mo6858b() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f6170n.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private void m6899a(long j, InterfaceC1647c.a aVar) {
        try {
            Collection<InterfaceC1662h.a> m6898a = m6898a(this.f6169m.mo6852d());
            long m6915b = this.f6173q.m6915b();
            long j2 = m6915b - j;
            int i = 0;
            long j3 = 0;
            for (InterfaceC1662h.a aVar2 : m6898a) {
                if (j3 > j2) {
                    break;
                }
                long mo6844a = this.f6169m.mo6844a(aVar2);
                this.f6165i.remove(aVar2.getId());
                if (mo6844a > 0) {
                    i++;
                    j3 += mo6844a;
                    C1669o m6924a = C1669o.m6924a();
                    m6924a.m6930a(aVar2.getId());
                    m6924a.m6927a(aVar);
                    m6924a.m6933c(mo6844a);
                    m6924a.m6931b(m6915b - j3);
                    m6924a.m6926a(j);
                    this.f6164h.mo6811b(m6924a);
                    m6924a.m6932b();
                }
            }
            this.f6173q.m6914a(-j3, -i);
            this.f6169m.mo6851c();
        } catch (IOException e2) {
            this.f6171o.mo6808a(InterfaceC1645a.a.EVICTION, f6157a, "evictAboveSize: " + e2.getMessage(), e2);
            throw e2;
        }
    }

    /* renamed from: b */
    private void m6901b() {
        synchronized (this.f6175s) {
            boolean m6904c = m6904c();
            m6906e();
            long m6915b = this.f6173q.m6915b();
            if (m6915b > this.f6163g && !m6904c) {
                this.f6173q.m6918d();
                m6904c();
            }
            if (m6915b > this.f6163g) {
                m6899a((this.f6163g * 9) / 10, InterfaceC1647c.a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m6904c() {
        long now = this.f6174r.now();
        if (this.f6173q.m6917c()) {
            long j = this.f6166j;
            if (j != -1 && now - j <= f6159c) {
                return false;
            }
        }
        return m6905d();
    }

    /* renamed from: d */
    private boolean m6905d() {
        long j;
        long now = this.f6174r.now();
        long j2 = f6158b + now;
        Set<String> hashSet = (this.f6172p && this.f6165i.isEmpty()) ? this.f6165i : this.f6172p ? new HashSet<>() : null;
        try {
            long j3 = -1;
            int i = 0;
            int i2 = 0;
            long j4 = 0;
            boolean z = false;
            int i3 = 0;
            for (InterfaceC1662h.a aVar : this.f6169m.mo6852d()) {
                i3++;
                j4 += aVar.mo6857a();
                if (aVar.mo6858b() > j2) {
                    i++;
                    j = j2;
                    int mo6857a = (int) (i2 + aVar.mo6857a());
                    j3 = Math.max(aVar.mo6858b() - now, j3);
                    i2 = mo6857a;
                    z = true;
                } else {
                    j = j2;
                    if (this.f6172p) {
                        hashSet.add(aVar.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.f6171o.mo6808a(InterfaceC1645a.a.READ_INVALID_ENTRY, f6157a, "Future timestamp found in " + i + " files , with a total size of " + i2 + " bytes, and a maximum time delta of " + j3 + "ms", null);
            }
            long j5 = i3;
            if (this.f6173q.m6913a() != j5 || this.f6173q.m6915b() != j4) {
                if (this.f6172p && this.f6165i != hashSet) {
                    this.f6165i.clear();
                    this.f6165i.addAll(hashSet);
                }
                this.f6173q.m6916b(j4, j5);
            }
            this.f6166j = now;
            return true;
        } catch (IOException e2) {
            this.f6171o.mo6808a(InterfaceC1645a.a.GENERIC_IO, f6157a, "calcFileCacheSize: " + e2.getMessage(), e2);
            return false;
        }
    }

    /* renamed from: e */
    private void m6906e() {
        this.f6163g = this.f6168l.m7070a(this.f6169m.mo6848b() ? C1720a.a.EXTERNAL : C1720a.a.INTERNAL, this.f6161e - this.f6173q.m6915b()) ? this.f6160d : this.f6161e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p145b.p147b.InterfaceC1668n
    /* renamed from: a */
    public InterfaceC1643a mo6907a(InterfaceC1648d interfaceC1648d) {
        InterfaceC1643a interfaceC1643a;
        C1669o m6924a = C1669o.m6924a();
        m6924a.m6928a(interfaceC1648d);
        try {
            synchronized (this.f6175s) {
                List<String> m6820b = C1649e.m6820b(interfaceC1648d);
                String str = null;
                interfaceC1643a = null;
                for (int i = 0; i < m6820b.size(); i++) {
                    str = m6820b.get(i);
                    m6924a.m6930a(str);
                    interfaceC1643a = this.f6169m.mo6850c(str, interfaceC1648d);
                    if (interfaceC1643a != null) {
                        break;
                    }
                }
                if (interfaceC1643a == null) {
                    this.f6164h.mo6810a(m6924a);
                    this.f6165i.remove(str);
                } else {
                    this.f6164h.mo6813d(m6924a);
                    this.f6165i.add(str);
                }
            }
            return interfaceC1643a;
        } catch (IOException e2) {
            this.f6171o.mo6808a(InterfaceC1645a.a.GENERIC_IO, f6157a, "getResource", e2);
            m6924a.m6929a(e2);
            this.f6164h.mo6815f(m6924a);
            return null;
        } finally {
            m6924a.m6932b();
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1668n
    /* renamed from: a */
    public InterfaceC1643a mo6908a(InterfaceC1648d interfaceC1648d, InterfaceC1654j interfaceC1654j) {
        String m6819a;
        C1669o m6924a = C1669o.m6924a();
        m6924a.m6928a(interfaceC1648d);
        this.f6164h.mo6816g(m6924a);
        synchronized (this.f6175s) {
            m6819a = C1649e.m6819a(interfaceC1648d);
        }
        m6924a.m6930a(m6819a);
        try {
            try {
                InterfaceC1662h.b m6896a = m6896a(m6819a, interfaceC1648d);
                try {
                    m6896a.mo6864a(interfaceC1654j, interfaceC1648d);
                    InterfaceC1643a m6895a = m6895a(m6896a, interfaceC1648d, m6819a);
                    m6924a.m6933c(m6895a.size());
                    m6924a.m6931b(this.f6173q.m6915b());
                    this.f6164h.mo6814e(m6924a);
                    return m6895a;
                } finally {
                    if (!m6896a.mo6865a()) {
                        C1700a.m6989a(f6157a, "Failed to delete temp file");
                    }
                }
            } catch (IOException e2) {
                m6924a.m6929a(e2);
                this.f6164h.mo6812c(m6924a);
                C1700a.m6994a(f6157a, "Failed inserting a file into the cache", (Throwable) e2);
                throw e2;
            }
        } finally {
            m6924a.m6932b();
        }
    }

    @Override // p139d.p143b.p145b.p147b.InterfaceC1668n
    /* renamed from: a */
    public void mo6909a() {
        synchronized (this.f6175s) {
            try {
                this.f6169m.mo6846a();
                this.f6165i.clear();
                this.f6164h.mo6809a();
            } catch (IOException e2) {
                this.f6171o.mo6808a(InterfaceC1645a.a.EVICTION, f6157a, "clearAll: " + e2.getMessage(), e2);
            }
            this.f6173q.m6918d();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p145b.p147b.InterfaceC1668n
    /* renamed from: b */
    public boolean mo6910b(InterfaceC1648d interfaceC1648d) {
        synchronized (this.f6175s) {
            List<String> m6820b = C1649e.m6820b(interfaceC1648d);
            for (int i = 0; i < m6820b.size(); i++) {
                if (this.f6165i.contains(m6820b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p145b.p147b.InterfaceC1668n
    /* renamed from: c */
    public void mo6911c(InterfaceC1648d interfaceC1648d) {
        synchronized (this.f6175s) {
            try {
                List<String> m6820b = C1649e.m6820b(interfaceC1648d);
                for (int i = 0; i < m6820b.size(); i++) {
                    String str = m6820b.get(i);
                    this.f6169m.remove(str);
                    this.f6165i.remove(str);
                }
            } catch (IOException e2) {
                this.f6171o.mo6808a(InterfaceC1645a.a.DELETE_FILE, f6157a, "delete: " + e2.getMessage(), e2);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p145b.p147b.InterfaceC1668n
    /* renamed from: d */
    public boolean mo6912d(InterfaceC1648d interfaceC1648d) {
        synchronized (this.f6175s) {
            if (mo6910b(interfaceC1648d)) {
                return true;
            }
            try {
                List<String> m6820b = C1649e.m6820b(interfaceC1648d);
                for (int i = 0; i < m6820b.size(); i++) {
                    String str = m6820b.get(i);
                    if (this.f6169m.mo6849b(str, interfaceC1648d)) {
                        this.f6165i.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }
}
