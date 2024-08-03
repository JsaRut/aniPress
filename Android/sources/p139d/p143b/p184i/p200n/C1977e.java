package p139d.p143b.p184i.p200n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p139d.p143b.p184i.p191e.EnumC1880d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.e */
/* loaded from: classes.dex */
public class C1977e implements InterfaceC1998oa {

    /* renamed from: a */
    private final C2023c f7214a;

    /* renamed from: b */
    private final String f7215b;

    /* renamed from: c */
    private final InterfaceC2002qa f7216c;

    /* renamed from: d */
    private final Object f7217d;

    /* renamed from: e */
    private final C2023c.b f7218e;

    /* renamed from: f */
    private boolean f7219f;

    /* renamed from: g */
    private EnumC1880d f7220g;

    /* renamed from: h */
    private boolean f7221h;

    /* renamed from: i */
    private boolean f7222i = false;

    /* renamed from: j */
    private final List<InterfaceC2000pa> f7223j = new ArrayList();

    public C1977e(C2023c c2023c, String str, InterfaceC2002qa interfaceC2002qa, Object obj, C2023c.b bVar, boolean z, boolean z2, EnumC1880d enumC1880d) {
        this.f7214a = c2023c;
        this.f7215b = str;
        this.f7216c = interfaceC2002qa;
        this.f7217d = obj;
        this.f7218e = bVar;
        this.f7219f = z;
        this.f7220g = enumC1880d;
        this.f7221h = z2;
    }

    /* renamed from: a */
    public static void m8099a(List<InterfaceC2000pa> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC2000pa> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo7534a();
        }
    }

    /* renamed from: b */
    public static void m8100b(List<InterfaceC2000pa> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC2000pa> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8040b();
        }
    }

    /* renamed from: c */
    public static void m8101c(List<InterfaceC2000pa> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC2000pa> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8042d();
        }
    }

    /* renamed from: d */
    public static void m8102d(List<InterfaceC2000pa> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC2000pa> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8041c();
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: a */
    public Object mo8103a() {
        return this.f7217d;
    }

    /* renamed from: a */
    public synchronized List<InterfaceC2000pa> m8104a(EnumC1880d enumC1880d) {
        if (enumC1880d == this.f7220g) {
            return null;
        }
        this.f7220g = enumC1880d;
        return new ArrayList(this.f7223j);
    }

    /* renamed from: a */
    public synchronized List<InterfaceC2000pa> m8105a(boolean z) {
        if (z == this.f7221h) {
            return null;
        }
        this.f7221h = z;
        return new ArrayList(this.f7223j);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: a */
    public void mo8106a(InterfaceC2000pa interfaceC2000pa) {
        boolean z;
        synchronized (this) {
            this.f7223j.add(interfaceC2000pa);
            z = this.f7222i;
        }
        if (z) {
            interfaceC2000pa.mo7534a();
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: b */
    public synchronized EnumC1880d mo8107b() {
        return this.f7220g;
    }

    /* renamed from: b */
    public synchronized List<InterfaceC2000pa> m8108b(boolean z) {
        if (z == this.f7219f) {
            return null;
        }
        this.f7219f = z;
        return new ArrayList(this.f7223j);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: c */
    public C2023c mo8109c() {
        return this.f7214a;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: d */
    public synchronized boolean mo8110d() {
        return this.f7219f;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: e */
    public InterfaceC2002qa mo8111e() {
        return this.f7216c;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: f */
    public synchronized boolean mo8112f() {
        return this.f7221h;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    /* renamed from: g */
    public C2023c.b mo8113g() {
        return this.f7218e;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1998oa
    public String getId() {
        return this.f7215b;
    }

    /* renamed from: h */
    public void m8114h() {
        m8099a(m8115i());
    }

    /* renamed from: i */
    public synchronized List<InterfaceC2000pa> m8115i() {
        if (this.f7222i) {
            return null;
        }
        this.f7222i = true;
        return new ArrayList(this.f7223j);
    }
}
