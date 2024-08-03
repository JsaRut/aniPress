package p139d.p225c.p226a.p227a.p269m;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.m.g */
/* loaded from: classes.dex */
public abstract class AbstractC2593g implements InterfaceC2597k {

    /* renamed from: a */
    private final boolean f10762a;

    /* renamed from: b */
    private final ArrayList<InterfaceC2586E> f10763b = new ArrayList<>(1);

    /* renamed from: c */
    private int f10764c;

    /* renamed from: d */
    private C2600n f10765d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2593g(boolean z) {
        this.f10762a = z;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public /* synthetic */ Map<String, List<String>> mo9122a() {
        return C2596j.m10922a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m10918a(int i) {
        C2600n c2600n = this.f10765d;
        C2622I.m11050a(c2600n);
        C2600n c2600n2 = c2600n;
        for (int i2 = 0; i2 < this.f10764c; i2++) {
            this.f10763b.get(i2).mo10906a(this, c2600n2, this.f10762a, i);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2597k
    /* renamed from: a */
    public final void mo10300a(InterfaceC2586E interfaceC2586E) {
        if (this.f10763b.contains(interfaceC2586E)) {
            return;
        }
        this.f10763b.add(interfaceC2586E);
        this.f10764c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m10919b() {
        C2600n c2600n = this.f10765d;
        C2622I.m11050a(c2600n);
        C2600n c2600n2 = c2600n;
        for (int i = 0; i < this.f10764c; i++) {
            this.f10763b.get(i).mo10905a(this, c2600n2, this.f10762a);
        }
        this.f10765d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m10920b(C2600n c2600n) {
        for (int i = 0; i < this.f10764c; i++) {
            this.f10763b.get(i).mo10908c(this, c2600n, this.f10762a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m10921c(C2600n c2600n) {
        this.f10765d = c2600n;
        for (int i = 0; i < this.f10764c; i++) {
            this.f10763b.get(i).mo10907b(this, c2600n, this.f10762a);
        }
    }
}
