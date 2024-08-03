package p139d.p143b.p145b.p146a;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import p139d.p143b.p148c.p159k.C1725c;

/* renamed from: d.b.b.a.e */
/* loaded from: classes.dex */
public final class C1649e {
    /* renamed from: a */
    public static String m6819a(InterfaceC1648d interfaceC1648d) {
        try {
            return interfaceC1648d instanceof C1650f ? m6821c(((C1650f) interfaceC1648d).m6822b().get(0)) : m6821c(interfaceC1648d);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public static List<String> m6820b(InterfaceC1648d interfaceC1648d) {
        try {
            if (!(interfaceC1648d instanceof C1650f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(m6821c(interfaceC1648d));
                return arrayList;
            }
            List<InterfaceC1648d> m6822b = ((C1650f) interfaceC1648d).m6822b();
            ArrayList arrayList2 = new ArrayList(m6822b.size());
            for (int i = 0; i < m6822b.size(); i++) {
                arrayList2.add(m6821c(m6822b.get(i)));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    private static String m6821c(InterfaceC1648d interfaceC1648d) {
        return C1725c.m7076a(interfaceC1648d.mo6817a().getBytes("UTF-8"));
    }
}
