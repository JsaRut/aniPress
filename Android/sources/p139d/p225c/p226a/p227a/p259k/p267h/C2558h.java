package p139d.p225c.p226a.p227a.p259k.p267h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2547g;
import p139d.p225c.p226a.p227a.p259k.p267h.C2556f;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.h.h */
/* loaded from: classes.dex */
public final class C2558h extends AbstractC2531c {

    /* renamed from: o */
    private final C2557g f10605o;

    /* renamed from: p */
    private final C2644u f10606p;

    /* renamed from: q */
    private final C2556f.a f10607q;

    /* renamed from: r */
    private final C2551a f10608r;

    /* renamed from: s */
    private final List<C2554d> f10609s;

    public C2558h() {
        super("WebvttDecoder");
        this.f10605o = new C2557g();
        this.f10606p = new C2644u();
        this.f10607q = new C2556f.a();
        this.f10608r = new C2551a();
        this.f10609s = new ArrayList();
    }

    /* renamed from: a */
    private static int m10787a(C2644u c2644u) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = c2644u.m11217c();
            String m11228j = c2644u.m11228j();
            i = m11228j == null ? 0 : "STYLE".equals(m11228j) ? 2 : m11228j.startsWith("NOTE") ? 1 : 3;
        }
        c2644u.m11222e(i2);
        return i;
    }

    /* renamed from: b */
    private static void m10788b(C2644u c2644u) {
        do {
        } while (!TextUtils.isEmpty(c2644u.m11228j()));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    public C2560j mo10610a(byte[] bArr, int i, boolean z) {
        this.f10606p.m11213a(bArr, i);
        this.f10607q.m10766b();
        this.f10609s.clear();
        try {
            C2559i.m10793c(this.f10606p);
            do {
            } while (!TextUtils.isEmpty(this.f10606p.m11228j()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int m10787a = m10787a(this.f10606p);
                if (m10787a == 0) {
                    return new C2560j(arrayList);
                }
                if (m10787a == 1) {
                    m10788b(this.f10606p);
                } else if (m10787a == 2) {
                    if (!arrayList.isEmpty()) {
                        throw new C2547g("A style block was found after the first cue.");
                    }
                    this.f10606p.m11228j();
                    C2554d m10729a = this.f10608r.m10729a(this.f10606p);
                    if (m10729a != null) {
                        this.f10609s.add(m10729a);
                    }
                } else if (m10787a == 3 && this.f10605o.m10783a(this.f10606p, this.f10607q, this.f10609s)) {
                    arrayList.add(this.f10607q.m10762a());
                    this.f10607q.m10766b();
                }
            }
        } catch (C2683z e2) {
            throw new C2547g(e2);
        }
    }
}
