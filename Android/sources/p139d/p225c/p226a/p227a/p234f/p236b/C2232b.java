package p139d.p225c.p226a.p227a.p234f.p236b;

import android.util.Pair;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e;
import p139d.p225c.p226a.p227a.p270n.C2630g;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.b.b */
/* loaded from: classes.dex */
final class C2232b extends AbstractC2235e {

    /* renamed from: b */
    private static final int[] f8190b = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f8191c;

    /* renamed from: d */
    private boolean f8192d;

    /* renamed from: e */
    private int f8193e;

    public C2232b(InterfaceC2337q interfaceC2337q) {
        super(interfaceC2337q);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e
    /* renamed from: a */
    protected boolean mo9187a(C2644u c2644u) {
        C2676s m11425a;
        if (this.f8191c) {
            c2644u.m11224f(1);
        } else {
            int m11238t = c2644u.m11238t();
            this.f8193e = (m11238t >> 4) & 15;
            int i = this.f8193e;
            if (i == 2) {
                m11425a = C2676s.m11426a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f8190b[(m11238t >> 2) & 3], (List<byte[]>) null, (C2213m) null, 0, (String) null);
            } else if (i == 7 || i == 8) {
                m11425a = C2676s.m11425a((String) null, this.f8193e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (m11238t & 1) == 1 ? 2 : 3, (List<byte[]>) null, (C2213m) null, 0, (String) null);
            } else {
                if (i != 10) {
                    throw new AbstractC2235e.a("Audio format not supported: " + this.f8193e);
                }
                this.f8191c = true;
            }
            this.f8212a.mo9433a(m11425a);
            this.f8192d = true;
            this.f8191c = true;
        }
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e
    /* renamed from: b */
    protected void mo9188b(C2644u c2644u, long j) {
        if (this.f8193e == 2) {
            int m11208a = c2644u.m11208a();
            this.f8212a.mo9432a(c2644u, m11208a);
            this.f8212a.mo9431a(j, 1, m11208a, 0, null);
            return;
        }
        int m11238t = c2644u.m11238t();
        if (m11238t != 0 || this.f8192d) {
            if (this.f8193e != 10 || m11238t == 1) {
                int m11208a2 = c2644u.m11208a();
                this.f8212a.mo9432a(c2644u, m11208a2);
                this.f8212a.mo9431a(j, 1, m11208a2, 0, null);
                return;
            }
            return;
        }
        byte[] bArr = new byte[c2644u.m11208a()];
        c2644u.m11214a(bArr, 0, bArr.length);
        Pair<Integer, Integer> m11118a = C2630g.m11118a(bArr);
        this.f8212a.mo9433a(C2676s.m11426a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) m11118a.second).intValue(), ((Integer) m11118a.first).intValue(), (List<byte[]>) Collections.singletonList(bArr), (C2213m) null, 0, (String) null));
        this.f8192d = true;
    }
}
