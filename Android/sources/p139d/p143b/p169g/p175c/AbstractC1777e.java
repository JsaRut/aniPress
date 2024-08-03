package p139d.p143b.p169g.p175c;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p161d.C1738g;
import p139d.p143b.p161d.C1741j;
import p139d.p143b.p161d.C1742k;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p169g.p180g.C1814a;
import p139d.p143b.p169g.p181h.InterfaceC1815a;
import p139d.p143b.p169g.p181h.InterfaceC1818d;

/* renamed from: d.b.g.c.e */
/* loaded from: classes.dex */
public abstract class AbstractC1777e<BUILDER extends AbstractC1777e<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements InterfaceC1818d {

    /* renamed from: a */
    private static final InterfaceC1779g<Object> f6483a = new C1775c();

    /* renamed from: b */
    private static final NullPointerException f6484b = new NullPointerException("No image request was specified!");

    /* renamed from: c */
    private static final AtomicLong f6485c = new AtomicLong();

    /* renamed from: d */
    private final Context f6486d;

    /* renamed from: e */
    private final Set<InterfaceC1779g> f6487e;

    /* renamed from: f */
    private Object f6488f;

    /* renamed from: g */
    private REQUEST f6489g;

    /* renamed from: h */
    private REQUEST f6490h;

    /* renamed from: i */
    private REQUEST[] f6491i;

    /* renamed from: j */
    private boolean f6492j;

    /* renamed from: k */
    private InterfaceC1694m<InterfaceC1736e<IMAGE>> f6493k;

    /* renamed from: l */
    private InterfaceC1779g<? super INFO> f6494l;

    /* renamed from: m */
    private InterfaceC1780h f6495m;

    /* renamed from: n */
    private boolean f6496n;

    /* renamed from: o */
    private boolean f6497o;

    /* renamed from: p */
    private boolean f6498p;

    /* renamed from: q */
    private String f6499q;

    /* renamed from: r */
    private InterfaceC1815a f6500r;

    /* renamed from: d.b.g.c.e$a */
    /* loaded from: classes.dex */
    public enum a {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1777e(Context context, Set<InterfaceC1779g> set) {
        this.f6486d = context;
        this.f6487e = set;
        m7296m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static String m7295b() {
        return String.valueOf(f6485c.getAndIncrement());
    }

    /* renamed from: m */
    private void m7296m() {
        this.f6488f = null;
        this.f6489g = null;
        this.f6490h = null;
        this.f6491i = null;
        this.f6492j = true;
        this.f6494l = null;
        this.f6495m = null;
        this.f6496n = false;
        this.f6497o = false;
        this.f6500r = null;
        this.f6499q = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public InterfaceC1694m<InterfaceC1736e<IMAGE>> m7297a(InterfaceC1815a interfaceC1815a, String str) {
        InterfaceC1694m<InterfaceC1736e<IMAGE>> interfaceC1694m = this.f6493k;
        if (interfaceC1694m != null) {
            return interfaceC1694m;
        }
        InterfaceC1694m<InterfaceC1736e<IMAGE>> interfaceC1694m2 = null;
        REQUEST request = this.f6489g;
        if (request != null) {
            interfaceC1694m2 = m7298a(interfaceC1815a, str, request);
        } else {
            REQUEST[] requestArr = this.f6491i;
            if (requestArr != null) {
                interfaceC1694m2 = m7300a(interfaceC1815a, str, requestArr, this.f6492j);
            }
        }
        if (interfaceC1694m2 != null && this.f6490h != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(interfaceC1694m2);
            arrayList.add(m7298a(interfaceC1815a, str, this.f6490h));
            interfaceC1694m2 = C1742k.m7142a(arrayList, false);
        }
        return interfaceC1694m2 == null ? C1738g.m7127a(f6484b) : interfaceC1694m2;
    }

    /* renamed from: a */
    protected InterfaceC1694m<InterfaceC1736e<IMAGE>> m7298a(InterfaceC1815a interfaceC1815a, String str, REQUEST request) {
        return m7299a(interfaceC1815a, str, (String) request, a.FULL_FETCH);
    }

    /* renamed from: a */
    protected InterfaceC1694m<InterfaceC1736e<IMAGE>> m7299a(InterfaceC1815a interfaceC1815a, String str, REQUEST request, a aVar) {
        return new C1776d(this, interfaceC1815a, str, request, m7310c(), aVar);
    }

    /* renamed from: a */
    protected InterfaceC1694m<InterfaceC1736e<IMAGE>> m7300a(InterfaceC1815a interfaceC1815a, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(m7299a(interfaceC1815a, str, (String) request, a.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(m7298a(interfaceC1815a, str, request2));
        }
        return C1741j.m7129a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InterfaceC1736e<IMAGE> mo7239a(InterfaceC1815a interfaceC1815a, String str, REQUEST request, Object obj, a aVar);

    /* renamed from: a */
    protected AbstractC1774b m7301a() {
        AbstractC1774b mo7242j = mo7242j();
        mo7242j.m7277a(m7316h());
        mo7242j.m7275a(m7312d());
        mo7242j.m7273a(m7313e());
        m7311c(mo7242j);
        m7306a(mo7242j);
        return mo7242j;
    }

    /* renamed from: a */
    public BUILDER m7302a(InterfaceC1779g<? super INFO> interfaceC1779g) {
        this.f6494l = interfaceC1779g;
        m7317i();
        return this;
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1818d
    /* renamed from: a */
    public BUILDER mo7303a(InterfaceC1815a interfaceC1815a) {
        this.f6500r = interfaceC1815a;
        m7317i();
        return this;
    }

    /* renamed from: a */
    public BUILDER m7304a(Object obj) {
        this.f6488f = obj;
        m7317i();
        return this;
    }

    /* renamed from: a */
    public BUILDER m7305a(boolean z) {
        this.f6497o = z;
        m7317i();
        return this;
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1818d
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC1818d mo7303a(InterfaceC1815a interfaceC1815a) {
        mo7303a(interfaceC1815a);
        return this;
    }

    /* renamed from: a */
    protected void m7306a(AbstractC1774b abstractC1774b) {
        Set<InterfaceC1779g> set = this.f6487e;
        if (set != null) {
            Iterator<InterfaceC1779g> it = set.iterator();
            while (it.hasNext()) {
                abstractC1774b.m7272a(it.next());
            }
        }
        InterfaceC1779g<? super INFO> interfaceC1779g = this.f6494l;
        if (interfaceC1779g != null) {
            abstractC1774b.m7272a((InterfaceC1779g) interfaceC1779g);
        }
        if (this.f6497o) {
            abstractC1774b.m7272a((InterfaceC1779g) f6483a);
        }
    }

    /* renamed from: b */
    public BUILDER m7307b(REQUEST request) {
        this.f6489g = request;
        m7317i();
        return this;
    }

    /* renamed from: b */
    protected void m7308b(AbstractC1774b abstractC1774b) {
        if (abstractC1774b.m7289k() == null) {
            abstractC1774b.m7274a(C1814a.m7471a(this.f6486d));
        }
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1818d
    public AbstractC1774b build() {
        REQUEST request;
        m7319l();
        if (this.f6489g == null && this.f6491i == null && (request = this.f6490h) != null) {
            this.f6489g = request;
            this.f6490h = null;
        }
        return m7301a();
    }

    /* renamed from: c */
    public BUILDER m7309c(REQUEST request) {
        this.f6490h = request;
        m7317i();
        return this;
    }

    /* renamed from: c */
    public Object m7310c() {
        return this.f6488f;
    }

    /* renamed from: c */
    protected void m7311c(AbstractC1774b abstractC1774b) {
        if (this.f6496n) {
            abstractC1774b.m7291m().m7256a(this.f6496n);
            m7308b(abstractC1774b);
        }
    }

    /* renamed from: d */
    public String m7312d() {
        return this.f6499q;
    }

    /* renamed from: e */
    public InterfaceC1780h m7313e() {
        return this.f6495m;
    }

    /* renamed from: f */
    public REQUEST m7314f() {
        return this.f6489g;
    }

    /* renamed from: g */
    public InterfaceC1815a m7315g() {
        return this.f6500r;
    }

    /* renamed from: h */
    public boolean m7316h() {
        return this.f6498p;
    }

    /* renamed from: i */
    protected final BUILDER m7317i() {
        return this;
    }

    /* renamed from: j */
    protected abstract AbstractC1774b mo7242j();

    /* renamed from: k */
    public BUILDER m7318k() {
        m7296m();
        m7317i();
        return this;
    }

    /* renamed from: l */
    protected void m7319l() {
        boolean z = false;
        C1691j.m6979b(this.f6491i == null || this.f6489g == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f6493k == null || (this.f6491i == null && this.f6489g == null && this.f6490h == null)) {
            z = true;
        }
        C1691j.m6979b(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }
}
