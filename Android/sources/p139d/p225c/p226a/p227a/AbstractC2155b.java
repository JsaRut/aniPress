package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC2155b implements InterfaceC2139D {

    /* renamed from: a */
    protected final AbstractC2151P.b f7740a = new AbstractC2151P.b();

    /* renamed from: u */
    private int m8756u() {
        int mo8529n = mo8529n();
        if (mo8529n == 1) {
            return 0;
        }
        return mo8529n;
    }

    /* renamed from: a */
    public final int m8757a() {
        long mo8525j = mo8525j();
        long duration = getDuration();
        if (mo8525j == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return C2622I.m11038a((int) ((mo8525j * 100) / duration), 0, 100);
    }

    /* renamed from: a */
    public final void m8758a(long j) {
        mo8512a(mo8522g(), j);
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    public final boolean hasNext() {
        return mo8528m() != -1;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    public final boolean hasPrevious() {
        return mo8524i() != -1;
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: i */
    public final int mo8524i() {
        AbstractC2151P mo8530o = mo8530o();
        if (mo8530o.m8654c()) {
            return -1;
        }
        return mo8530o.m8651b(mo8522g(), m8756u(), mo8532q());
    }

    @Override // p139d.p225c.p226a.p227a.InterfaceC2139D
    /* renamed from: m */
    public final int mo8528m() {
        AbstractC2151P mo8530o = mo8530o();
        if (mo8530o.m8654c()) {
            return -1;
        }
        return mo8530o.m8642a(mo8522g(), m8756u(), mo8532q());
    }

    /* renamed from: s */
    public final long m8759s() {
        AbstractC2151P mo8530o = mo8530o();
        if (mo8530o.m8654c()) {
            return -9223372036854775807L;
        }
        return mo8530o.m8649a(mo8522g(), this.f7740a).m8674c();
    }

    /* renamed from: t */
    public final boolean m8760t() {
        AbstractC2151P mo8530o = mo8530o();
        return !mo8530o.m8654c() && mo8530o.m8649a(mo8522g(), this.f7740a).f7709d;
    }
}
