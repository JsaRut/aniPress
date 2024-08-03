package p139d.p225c.p226a.p227a.p259k.p260a;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p139d.p225c.p226a.p227a.p259k.AbstractC2563k;
import p139d.p225c.p226a.p227a.p259k.C2562j;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2540f;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.k.a.f */
/* loaded from: classes.dex */
public abstract class AbstractC2524f implements InterfaceC2540f {

    /* renamed from: a */
    private final ArrayDeque<a> f10379a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<AbstractC2563k> f10380b;

    /* renamed from: c */
    private final PriorityQueue<a> f10381c;

    /* renamed from: d */
    private a f10382d;

    /* renamed from: e */
    private long f10383e;

    /* renamed from: f */
    private long f10384f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.k.a.f$a */
    /* loaded from: classes.dex */
    public static final class a extends C2562j implements Comparable<a> {

        /* renamed from: g */
        private long f10385g;

        private a() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            if (m9010d() != aVar.m9010d()) {
                return m9010d() ? 1 : -1;
            }
            long j = this.f8041d - aVar.f8041d;
            if (j == 0) {
                j = this.f10385g - aVar.f10385g;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* renamed from: d.c.a.a.k.a.f$b */
    /* loaded from: classes.dex */
    private final class b extends AbstractC2563k {
        private b() {
        }

        @Override // p139d.p225c.p226a.p227a.p230c.AbstractC2197g
        /* renamed from: f */
        public final void mo9031f() {
            AbstractC2524f.this.m10600a((AbstractC2563k) this);
        }
    }

    public AbstractC2524f() {
        int i = 0;
        while (true) {
            if (i >= 10) {
                break;
            }
            this.f10379a.add(new a());
            i++;
        }
        this.f10380b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f10380b.add(new b());
        }
        this.f10381c = new PriorityQueue<>();
    }

    /* renamed from: a */
    private void m10599a(a aVar) {
        aVar.mo9006b();
        this.f10379a.add(aVar);
    }

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: a */
    public void mo9020a() {
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2540f
    /* renamed from: a */
    public void mo10542a(long j) {
        this.f10383e = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* renamed from: a */
    protected abstract void mo10543a(C2562j c2562j);

    /* renamed from: a */
    protected void m10600a(AbstractC2563k abstractC2563k) {
        abstractC2563k.mo9006b();
        this.f10380b.add(abstractC2563k);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: b */
    public AbstractC2563k mo9022b() {
        AbstractC2563k pollFirst;
        if (this.f10380b.isEmpty()) {
            return null;
        }
        while (!this.f10381c.isEmpty() && this.f10381c.peek().f8041d <= this.f10383e) {
            a poll = this.f10381c.poll();
            if (poll.m9010d()) {
                pollFirst = this.f10380b.pollFirst();
                pollFirst.m9007b(4);
            } else {
                mo10543a((C2562j) poll);
                if (mo10546e()) {
                    InterfaceC2537e mo10545d = mo10545d();
                    if (!poll.m9009c()) {
                        pollFirst = this.f10380b.pollFirst();
                        pollFirst.m10794a(poll.f8041d, mo10545d, Long.MAX_VALUE);
                    }
                }
                m10599a(poll);
            }
            m10599a(poll);
            return pollFirst;
        }
        return null;
    }

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9021a(C2562j c2562j) {
        C2628e.m11111a(c2562j == this.f10382d);
        if (c2562j.m9009c()) {
            m10599a(this.f10382d);
        } else {
            a aVar = this.f10382d;
            long j = this.f10384f;
            this.f10384f = 1 + j;
            aVar.f10385g = j;
            this.f10381c.add(this.f10382d);
        }
        this.f10382d = null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    /* renamed from: c */
    public C2562j mo9023c() {
        C2628e.m11113b(this.f10382d == null);
        if (this.f10379a.isEmpty()) {
            return null;
        }
        this.f10382d = this.f10379a.pollFirst();
        return this.f10382d;
    }

    /* renamed from: d */
    protected abstract InterfaceC2537e mo10545d();

    /* renamed from: e */
    protected abstract boolean mo10546e();

    @Override // p139d.p225c.p226a.p227a.p230c.InterfaceC2194d
    public void flush() {
        this.f10384f = 0L;
        this.f10383e = 0L;
        while (!this.f10381c.isEmpty()) {
            m10599a(this.f10381c.poll());
        }
        a aVar = this.f10382d;
        if (aVar != null) {
            m10599a(aVar);
            this.f10382d = null;
        }
    }
}
