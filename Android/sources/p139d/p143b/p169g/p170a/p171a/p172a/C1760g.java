package p139d.p143b.p169g.p170a.p171a.p172a;

import com.facebook.common.time.InterfaceC0986b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p139d.p143b.p169g.p170a.p171a.C1764d;
import p139d.p143b.p169g.p170a.p171a.p172a.p173a.C1752a;
import p139d.p143b.p169g.p170a.p171a.p172a.p173a.C1753b;
import p139d.p143b.p169g.p170a.p171a.p172a.p173a.C1754c;
import p139d.p143b.p169g.p175c.InterfaceC1779g;
import p139d.p143b.p184i.p197k.C1924a;
import p139d.p143b.p184i.p197k.C1925b;
import p139d.p143b.p184i.p197k.InterfaceC1926c;

/* renamed from: d.b.g.a.a.a.g */
/* loaded from: classes.dex */
public class C1760g extends C1924a {

    /* renamed from: a */
    private final C1764d f6357a;

    /* renamed from: b */
    private final InterfaceC0986b f6358b;

    /* renamed from: c */
    private final C1761h f6359c = new C1761h();

    /* renamed from: d */
    private C1756c f6360d;

    /* renamed from: e */
    private InterfaceC1755b f6361e;

    /* renamed from: f */
    private C1754c f6362f;

    /* renamed from: g */
    private C1752a f6363g;

    /* renamed from: h */
    private C1925b f6364h;

    /* renamed from: i */
    private List<InterfaceC1759f> f6365i;

    /* renamed from: j */
    private boolean f6366j;

    public C1760g(InterfaceC0986b interfaceC0986b, C1764d c1764d) {
        this.f6358b = interfaceC0986b;
        this.f6357a = c1764d;
    }

    /* renamed from: c */
    private void m7178c() {
        if (this.f6363g == null) {
            this.f6363g = new C1752a(this.f6358b, this.f6359c, this);
        }
        if (this.f6362f == null) {
            this.f6362f = new C1754c(this.f6358b, this.f6359c);
        }
        if (this.f6361e == null) {
            this.f6361e = new C1753b(this.f6359c, this);
        }
        C1756c c1756c = this.f6360d;
        if (c1756c == null) {
            this.f6360d = new C1756c(this.f6357a.m7290l(), this.f6361e);
        } else {
            c1756c.m7175c(this.f6357a.m7290l());
        }
        if (this.f6364h == null) {
            this.f6364h = new C1925b(this.f6362f, this.f6360d);
        }
    }

    /* renamed from: a */
    public void m7179a() {
        List<InterfaceC1759f> list = this.f6365i;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    public void m7180a(InterfaceC1759f interfaceC1759f) {
        if (interfaceC1759f == null) {
            return;
        }
        if (this.f6365i == null) {
            this.f6365i = new LinkedList();
        }
        this.f6365i.add(interfaceC1759f);
    }

    /* renamed from: a */
    public void m7181a(C1761h c1761h, int i) {
        List<InterfaceC1759f> list;
        c1761h.m7185a(i);
        if (!this.f6366j || (list = this.f6365i) == null || list.isEmpty()) {
            return;
        }
        C1758e m7197c = c1761h.m7197c();
        Iterator<InterfaceC1759f> it = this.f6365i.iterator();
        while (it.hasNext()) {
            it.next().m7177a(m7197c, i);
        }
    }

    /* renamed from: a */
    public void m7182a(boolean z) {
        this.f6366j = z;
        if (!z) {
            InterfaceC1755b interfaceC1755b = this.f6361e;
            if (interfaceC1755b != null) {
                this.f6357a.m7226b(interfaceC1755b);
            }
            C1752a c1752a = this.f6363g;
            if (c1752a != null) {
                this.f6357a.m7282b((InterfaceC1779g) c1752a);
            }
            C1925b c1925b = this.f6364h;
            if (c1925b != null) {
                this.f6357a.m7227b((InterfaceC1926c) c1925b);
                return;
            }
            return;
        }
        m7178c();
        InterfaceC1755b interfaceC1755b2 = this.f6361e;
        if (interfaceC1755b2 != null) {
            this.f6357a.m7220a(interfaceC1755b2);
        }
        C1752a c1752a2 = this.f6363g;
        if (c1752a2 != null) {
            this.f6357a.m7272a((InterfaceC1779g) c1752a2);
        }
        C1925b c1925b2 = this.f6364h;
        if (c1925b2 != null) {
            this.f6357a.m7223a((InterfaceC1926c) c1925b2);
        }
    }

    /* renamed from: b */
    public void m7183b() {
        m7179a();
        m7182a(false);
        this.f6359c.m7192b();
    }
}
