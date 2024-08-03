package p139d.p225c.p226a.p227a.p259k.p267h;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.C2547g;
import p139d.p225c.p226a.p227a.p259k.p267h.C2556f;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.h.b */
/* loaded from: classes.dex */
public final class C2552b extends AbstractC2531c {

    /* renamed from: o */
    private static final int f10560o = C2622I.m11078b("payl");

    /* renamed from: p */
    private static final int f10561p = C2622I.m11078b("sttg");

    /* renamed from: q */
    private static final int f10562q = C2622I.m11078b("vttc");

    /* renamed from: r */
    private final C2644u f10563r;

    /* renamed from: s */
    private final C2556f.a f10564s;

    public C2552b() {
        super("Mp4WebvttDecoder");
        this.f10563r = new C2644u();
        this.f10564s = new C2556f.a();
    }

    /* renamed from: a */
    private static C2527b m10730a(C2644u c2644u, C2556f.a aVar, int i) {
        aVar.m10766b();
        while (i > 0) {
            if (i < 8) {
                throw new C2547g("Incomplete vtt cue box header found.");
            }
            int m11226h = c2644u.m11226h();
            int m11226h2 = c2644u.m11226h();
            int i2 = m11226h - 8;
            String m11057a = C2622I.m11057a(c2644u.f11004a, c2644u.m11217c(), i2);
            c2644u.m11224f(i2);
            i = (i - 8) - i2;
            if (m11226h2 == f10561p) {
                C2557g.m10773a(m11057a, aVar);
            } else if (m11226h2 == f10560o) {
                C2557g.m10775a((String) null, m11057a.trim(), aVar, (List<C2554d>) Collections.emptyList());
            }
        }
        return aVar.m10762a();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    public C2553c mo10610a(byte[] bArr, int i, boolean z) {
        this.f10563r.m11213a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f10563r.m11208a() > 0) {
            if (this.f10563r.m11208a() < 8) {
                throw new C2547g("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m11226h = this.f10563r.m11226h();
            if (this.f10563r.m11226h() == f10562q) {
                arrayList.add(m10730a(this.f10563r, this.f10564s, m11226h - 8));
            } else {
                this.f10563r.m11224f(m11226h - 8);
            }
        }
        return new C2553c(arrayList);
    }
}
