package p139d.p143b.p184i.p185a.p186a;

import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p190d.C1867q;
import p139d.p143b.p184i.p192f.InterfaceC1888e;
import p139d.p143b.p184i.p196j.AbstractC1918b;

/* renamed from: d.b.i.a.a.b */
/* loaded from: classes.dex */
public class C1831b {

    /* renamed from: a */
    private static boolean f6756a;

    /* renamed from: b */
    private static InterfaceC1830a f6757b;

    /* renamed from: a */
    public static InterfaceC1830a m7532a(AbstractC1842f abstractC1842f, InterfaceC1888e interfaceC1888e, C1867q<InterfaceC1648d, AbstractC1918b> c1867q) {
        if (!f6756a) {
            try {
                f6757b = (InterfaceC1830a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(AbstractC1842f.class, InterfaceC1888e.class, C1867q.class).newInstance(abstractC1842f, interfaceC1888e, c1867q);
            } catch (Throwable unused) {
            }
            if (f6757b != null) {
                f6756a = true;
            }
        }
        return f6757b;
    }
}
