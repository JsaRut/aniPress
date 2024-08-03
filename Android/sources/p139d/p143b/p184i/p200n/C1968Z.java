package p139d.p143b.p184i.p200n;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p143b.p184i.p200n.AbstractC1970aa;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.Z */
/* loaded from: classes.dex */
public class C1968Z extends C1979f {

    /* renamed from: a */
    final /* synthetic */ Pair f7194a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1970aa.a f7195b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1968Z(AbstractC1970aa.a aVar, Pair pair) {
        this.f7195b = aVar;
        this.f7194a = pair;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2000pa
    /* renamed from: a */
    public void mo7534a() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        boolean remove;
        List list;
        C1977e c1977e;
        List list2;
        List list3;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        List m8063f;
        synchronized (this.f7195b) {
            copyOnWriteArraySet = this.f7195b.f7199b;
            remove = copyOnWriteArraySet.remove(this.f7194a);
            list = null;
            if (remove) {
                copyOnWriteArraySet2 = this.f7195b.f7199b;
                if (copyOnWriteArraySet2.isEmpty()) {
                    c1977e = this.f7195b.f7203f;
                    list2 = null;
                } else {
                    m8063f = this.f7195b.m8063f();
                    list2 = this.f7195b.m8065g();
                    list3 = this.f7195b.m8061e();
                    c1977e = null;
                    list = m8063f;
                }
            } else {
                c1977e = null;
                list2 = null;
            }
            list3 = list2;
        }
        C1977e.m8101c(list);
        C1977e.m8102d(list2);
        C1977e.m8100b((List<InterfaceC2000pa>) list3);
        if (c1977e != null) {
            c1977e.m8114h();
        }
        if (remove) {
            ((InterfaceC1995n) this.f7194a.first).mo8082a();
        }
    }

    @Override // p139d.p143b.p184i.p200n.C1979f, p139d.p143b.p184i.p200n.InterfaceC2000pa
    /* renamed from: b */
    public void mo8040b() {
        List m8061e;
        m8061e = this.f7195b.m8061e();
        C1977e.m8100b((List<InterfaceC2000pa>) m8061e);
    }

    @Override // p139d.p143b.p184i.p200n.C1979f, p139d.p143b.p184i.p200n.InterfaceC2000pa
    /* renamed from: c */
    public void mo8041c() {
        List m8065g;
        m8065g = this.f7195b.m8065g();
        C1977e.m8102d(m8065g);
    }

    @Override // p139d.p143b.p184i.p200n.C1979f, p139d.p143b.p184i.p200n.InterfaceC2000pa
    /* renamed from: d */
    public void mo8042d() {
        List m8063f;
        m8063f = this.f7195b.m8063f();
        C1977e.m8101c(m8063f);
    }
}
