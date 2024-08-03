package p139d.p143b.p184i.p197k;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.k.b */
/* loaded from: classes.dex */
public class C1925b implements InterfaceC1926c {

    /* renamed from: a */
    private final List<InterfaceC1926c> f7083a;

    public C1925b(Set<InterfaceC1926c> set) {
        this.f7083a = new ArrayList(set.size());
        for (InterfaceC1926c interfaceC1926c : set) {
            if (interfaceC1926c != null) {
                this.f7083a.add(interfaceC1926c);
            }
        }
    }

    public C1925b(InterfaceC1926c... interfaceC1926cArr) {
        this.f7083a = new ArrayList(interfaceC1926cArr.length);
        for (InterfaceC1926c interfaceC1926c : interfaceC1926cArr) {
            if (interfaceC1926c != null) {
                this.f7083a.add(interfaceC1926c);
            }
        }
    }

    /* renamed from: a */
    private void m7933a(String str, Throwable th) {
        C1700a.m6998a("ForwardingRequestListener", str, th);
    }

    /* renamed from: a */
    public void m7934a(InterfaceC1926c interfaceC1926c) {
        this.f7083a.add(interfaceC1926c);
    }

    @Override // p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5336a(C2023c c2023c, Object obj, String str, boolean z) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5336a(c2023c, obj, str, z);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5337a(C2023c c2023c, String str, Throwable th, boolean z) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5337a(c2023c, str, th, z);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: a */
    public void mo5338a(C2023c c2023c, String str, boolean z) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5338a(c2023c, str, z);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5339a(String str, String str2) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5339a(str, str2);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5340a(String str, String str2, String str3) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5340a(str, str2, str3);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5341a(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5341a(str, str2, th, map);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo5342a(String str, String str2, Map<String, String> map) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5342a(str, str2, map);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public void mo7174a(String str, String str2, boolean z) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo7174a(str, str2, z);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: a */
    public boolean mo5343a(String str) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            if (this.f7083a.get(i).mo5343a(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p139d.p143b.p184i.p197k.InterfaceC1926c
    /* renamed from: b */
    public void mo5344b(String str) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5344b(str);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2002qa
    /* renamed from: b */
    public void mo5345b(String str, String str2, Map<String, String> map) {
        int size = this.f7083a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f7083a.get(i).mo5345b(str, str2, map);
            } catch (Exception e2) {
                m7933a("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }
}
