package p139d.p143b.p184i.p200n;

import android.os.SystemClock;
import java.io.InputStream;
import java.util.Map;
import p139d.p143b.p148c.p155g.AbstractC1713j;
import p139d.p143b.p148c.p155g.InterfaceC1704a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* renamed from: d.b.i.n.ca */
/* loaded from: classes.dex */
public class C1974ca implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final InterfaceC1711h f7211a;

    /* renamed from: b */
    private final InterfaceC1704a f7212b;

    /* renamed from: c */
    private final InterfaceC1976da f7213c;

    public C1974ca(InterfaceC1711h interfaceC1711h, InterfaceC1704a interfaceC1704a, InterfaceC1976da interfaceC1976da) {
        this.f7211a = interfaceC1711h;
        this.f7212b = interfaceC1704a;
        this.f7213c = interfaceC1976da;
    }

    /* renamed from: a */
    protected static float m8087a(int i, int i2) {
        if (i2 > 0) {
            return i / i2;
        }
        double d2 = -i;
        Double.isNaN(d2);
        return 1.0f - ((float) Math.exp(d2 / 50000.0d));
    }

    /* renamed from: a */
    private Map<String, String> m8088a(C1935B c1935b, int i) {
        if (c1935b.m7959e().mo5343a(c1935b.m7957c())) {
            return this.f7213c.mo7542b(c1935b, i);
        }
        return null;
    }

    /* renamed from: a */
    private void m8089a(AbstractC1713j abstractC1713j, int i, C1877a c1877a, InterfaceC1995n<C1920d> interfaceC1995n) {
        C1920d c1920d;
        C1716b m7043a = C1716b.m7043a(abstractC1713j.mo5043m());
        try {
            c1920d = new C1920d((C1716b<InterfaceC1710g>) m7043a);
            try {
                c1920d.m7907a(c1877a);
                c1920d.m7928y();
                interfaceC1995n.mo8085a(c1920d, i);
                C1920d.m7902b(c1920d);
                C1716b.m7045b(m7043a);
            } catch (Throwable th) {
                th = th;
                C1920d.m7902b(c1920d);
                C1716b.m7045b(m7043a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1920d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8090a(C1935B c1935b) {
        c1935b.m7959e().mo5342a(c1935b.m7957c(), "NetworkFetchProducer", (Map<String, String>) null);
        c1935b.m7952a().mo8082a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8091a(C1935B c1935b, Throwable th) {
        c1935b.m7959e().mo5341a(c1935b.m7957c(), "NetworkFetchProducer", th, null);
        c1935b.m7959e().mo7174a(c1935b.m7957c(), "NetworkFetchProducer", false);
        c1935b.m7952a().mo8086a(th);
    }

    /* renamed from: b */
    private boolean m8094b(C1935B c1935b) {
        if (c1935b.m7956b().mo8112f()) {
            return this.f7213c.mo8098a(c1935b);
        }
        return false;
    }

    /* renamed from: a */
    protected void m8095a(AbstractC1713j abstractC1713j, C1935B c1935b) {
        Map<String, String> m8088a = m8088a(c1935b, abstractC1713j.size());
        InterfaceC2002qa m7959e = c1935b.m7959e();
        m7959e.mo5345b(c1935b.m7957c(), "NetworkFetchProducer", m8088a);
        m7959e.mo7174a(c1935b.m7957c(), "NetworkFetchProducer", true);
        m8089a(abstractC1713j, c1935b.m7960f() | 1, c1935b.m7961g(), c1935b.m7952a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m8096a(C1935B c1935b, InputStream inputStream, int i) {
        AbstractC1713j mo5040a = i > 0 ? this.f7211a.mo5040a(i) : this.f7211a.mo5039a();
        byte[] bArr = this.f7212b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f7213c.mo7541a((InterfaceC1976da) c1935b, mo5040a.size());
                    m8095a(mo5040a, c1935b);
                    return;
                } else if (read > 0) {
                    mo5040a.write(bArr, 0, read);
                    m8097b(mo5040a, c1935b);
                    c1935b.m7952a().mo8083a(m8087a(mo5040a.size(), i));
                }
            } finally {
                this.f7212b.mo4987a(bArr);
                mo5040a.close();
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        interfaceC1998oa.mo8111e().mo5339a(interfaceC1998oa.getId(), "NetworkFetchProducer");
        C1935B mo7538a = this.f7213c.mo7538a(interfaceC1995n, interfaceC1998oa);
        this.f7213c.mo5335a((InterfaceC1976da) mo7538a, (InterfaceC1976da.a) new C1972ba(this, mo7538a));
    }

    /* renamed from: b */
    protected void m8097b(AbstractC1713j abstractC1713j, C1935B c1935b) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!m8094b(c1935b) || uptimeMillis - c1935b.m7958d() < 100) {
            return;
        }
        c1935b.m7954a(uptimeMillis);
        c1935b.m7959e().mo5340a(c1935b.m7957c(), "NetworkFetchProducer", "intermediate_result");
        m8089a(abstractC1713j, c1935b.m7960f(), c1935b.m7961g(), c1935b.m7952a());
    }
}
