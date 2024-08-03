package com.brentvatne.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import p139d.p140a.p142b.C1640a;
import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2149N;
import p139d.p225c.p226a.p227a.C2338g;
import p139d.p225c.p226a.p227a.C2566l;
import p139d.p225c.p226a.p227a.InterfaceC2139D;
import p139d.p225c.p226a.p227a.p245h.InterfaceC2395g;
import p139d.p225c.p226a.p227a.p250j.C2401B;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p268l.C2567a;
import p139d.p225c.p226a.p227a.p268l.C2571e;
import p139d.p225c.p226a.p227a.p269m.C2601o;
import p139d.p225c.p226a.p227a.p269m.C2603q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.brentvatne.exoplayer.h */
/* loaded from: classes.dex */
public class RunnableC0981h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0982i f4065a;

    /* renamed from: b */
    final /* synthetic */ C0982i f4066b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0981h(C0982i c0982i, C0982i c0982i2) {
        this.f4066b = c0982i;
        this.f4065a = c0982i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2149N c2149n;
        boolean z;
        boolean z2;
        Uri uri;
        ArrayList m4879g;
        Uri uri2;
        String str;
        InterfaceC2515y m4867b;
        int i;
        C2149N c2149n2;
        C0984k c0984k;
        C2149N c2149n3;
        int i2;
        long j;
        C2603q c2603q;
        C2571e c2571e;
        C2571e c2571e2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C2571e c2571e3;
        C2149N c2149n4;
        C2149N c2149n5;
        C0977d c0977d;
        C2149N c2149n6;
        C1640a c1640a;
        C2603q c2603q2;
        boolean z3;
        float f;
        C2149N c2149n7;
        c2149n = this.f4066b.f4098j;
        if (c2149n == null) {
            c2603q = C0982i.f4067a;
            this.f4066b.f4099k = new C2571e(new C2567a.a(c2603q));
            c2571e = this.f4066b.f4099k;
            c2571e2 = this.f4066b.f4099k;
            C2571e.d m10853d = c2571e2.m10853d();
            i3 = this.f4066b.f4111w;
            m10853d.m10869a(i3 == 0 ? Integer.MAX_VALUE : this.f4066b.f4111w);
            c2571e.m10850a(m10853d);
            C2601o c2601o = new C2601o(true, 65536);
            i4 = this.f4066b.f4113y;
            i5 = this.f4066b.f4114z;
            i6 = this.f4066b.f4069A;
            i7 = this.f4066b.f4070B;
            C2338g c2338g = new C2338g(c2601o, i4, i5, i6, i7, -1, true);
            C0982i c0982i = this.f4066b;
            Context context = c0982i.getContext();
            c2571e3 = this.f4066b.f4099k;
            c0982i.f4098j = C2566l.m10806a(context, c2571e3, c2338g);
            c2149n4 = this.f4066b.f4098j;
            c2149n4.mo8513a((InterfaceC2139D.b) this.f4065a);
            c2149n5 = this.f4066b.f4098j;
            c2149n5.m8615b((InterfaceC2395g) this.f4065a);
            c0977d = this.f4066b.f4096h;
            c2149n6 = this.f4066b.f4098j;
            c0977d.setPlayer(c2149n6);
            c1640a = this.f4066b.f4089U;
            c1640a.m6804a(this.f4065a);
            c2603q2 = C0982i.f4067a;
            c2603q2.mo10915a(new Handler(), this.f4065a);
            C0982i c0982i2 = this.f4066b;
            z3 = c0982i2.f4106r;
            c0982i2.m4898o(!z3);
            this.f4066b.f4100l = true;
            f = this.f4066b.f4108t;
            C2137B c2137b = new C2137B(f, 1.0f);
            c2149n7 = this.f4066b.f4098j;
            c2149n7.m8608a(c2137b);
        }
        z = this.f4066b.f4100l;
        if (z) {
            uri = this.f4066b.f4071C;
            if (uri != null) {
                m4879g = this.f4066b.m4879g();
                C0982i c0982i3 = this.f4066b;
                uri2 = c0982i3.f4071C;
                str = this.f4066b.f4072D;
                m4867b = c0982i3.m4867b(uri2, str);
                if (m4879g.size() != 0) {
                    m4879g.add(0, m4867b);
                    m4867b = new C2401B((InterfaceC2515y[]) m4879g.toArray(new InterfaceC2515y[m4879g.size()]));
                }
                i = this.f4066b.f4101m;
                boolean z4 = i != -1;
                if (z4) {
                    c2149n3 = this.f4066b.f4098j;
                    i2 = this.f4066b.f4101m;
                    j = this.f4066b.f4102n;
                    c2149n3.mo8512a(i2, j);
                }
                c2149n2 = this.f4066b.f4098j;
                c2149n2.m8611a(m4867b, !z4, false);
                this.f4066b.f4100l = false;
                c0984k = this.f4066b.f4091c;
                c0984k.m4968h();
                this.f4066b.f4103o = true;
            }
        }
        this.f4066b.m4894n();
        C0982i c0982i4 = this.f4066b;
        z2 = c0982i4.f4086R;
        c0982i4.m4935c(z2);
        this.f4066b.m4877f();
    }
}
