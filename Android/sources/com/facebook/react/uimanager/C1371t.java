package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.uimanager.t */
/* loaded from: classes.dex */
public class C1371t {

    /* renamed from: a */
    private final C1348ha f5077a;

    /* renamed from: b */
    private final C1276L f5078b;

    /* renamed from: c */
    private final SparseBooleanArray f5079c = new SparseBooleanArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.uimanager.t$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final InterfaceC1269E f5080a;

        /* renamed from: b */
        public final int f5081b;

        a(InterfaceC1269E interfaceC1269E, int i) {
            this.f5080a = interfaceC1269E;
            this.f5081b = i;
        }
    }

    public C1371t(C1348ha c1348ha, C1276L c1276l) {
        this.f5077a = c1348ha;
        this.f5078b = c1276l;
    }

    /* renamed from: a */
    private a m5937a(InterfaceC1269E interfaceC1269E, int i) {
        while (interfaceC1269E.mo5475A()) {
            InterfaceC1269E parent = interfaceC1269E.getParent();
            if (parent == null) {
                return null;
            }
            i += parent.mo5477a(interfaceC1269E);
            interfaceC1269E = parent;
        }
        return new a(interfaceC1269E, i);
    }

    /* renamed from: a */
    public static void m5938a(InterfaceC1269E interfaceC1269E) {
        interfaceC1269E.mo5505h();
    }

    /* renamed from: a */
    private void m5939a(InterfaceC1269E interfaceC1269E, int i, int i2) {
        if (!interfaceC1269E.mo5475A() && interfaceC1269E.mo5523z() != null) {
            this.f5077a.m5813a(interfaceC1269E.mo5523z().mo5504g(), interfaceC1269E.mo5504g(), i, i2, interfaceC1269E.mo5509l(), interfaceC1269E.mo5476a());
            return;
        }
        for (int i3 = 0; i3 < interfaceC1269E.mo5501e(); i3++) {
            InterfaceC1269E mo5502e = interfaceC1269E.mo5502e(i3);
            int mo5504g = mo5502e.mo5504g();
            if (!this.f5079c.get(mo5504g)) {
                this.f5079c.put(mo5504g, true);
                m5939a(mo5502e, mo5502e.mo5519v() + i, mo5502e.mo5512o() + i2);
            }
        }
    }

    /* renamed from: a */
    private void m5940a(InterfaceC1269E interfaceC1269E, InterfaceC1269E interfaceC1269E2, int i) {
        C2038a.m8320a(!interfaceC1269E.mo5475A());
        int i2 = i;
        for (int i3 = 0; i3 < interfaceC1269E2.mo5501e(); i3++) {
            InterfaceC1269E mo5502e = interfaceC1269E2.mo5502e(i3);
            C2038a.m8320a(mo5502e.mo5523z() == null);
            if (mo5502e.mo5475A()) {
                int mo5508k = interfaceC1269E.mo5508k();
                m5944b(interfaceC1269E, mo5502e, i2);
                i2 += interfaceC1269E.mo5508k() - mo5508k;
            } else {
                m5947d(interfaceC1269E, mo5502e, i2);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private void m5941a(InterfaceC1269E interfaceC1269E, C1271G c1271g) {
        InterfaceC1269E parent = interfaceC1269E.getParent();
        if (parent == null) {
            interfaceC1269E.mo5486a(false);
            return;
        }
        int mo5493c = parent.mo5493c(interfaceC1269E);
        parent.mo5478a(mo5493c);
        m5942a(interfaceC1269E, false);
        interfaceC1269E.mo5486a(false);
        this.f5077a.m5826a(interfaceC1269E.mo5513p(), interfaceC1269E.mo5504g(), interfaceC1269E.mo5517t(), c1271g);
        parent.mo5492b(interfaceC1269E, mo5493c);
        m5946c(parent, interfaceC1269E, mo5493c);
        for (int i = 0; i < interfaceC1269E.mo5501e(); i++) {
            m5946c(interfaceC1269E, interfaceC1269E.mo5502e(i), i);
        }
        C2038a.m8320a(this.f5079c.size() == 0);
        m5945c(interfaceC1269E);
        for (int i2 = 0; i2 < interfaceC1269E.mo5501e(); i2++) {
            m5945c(interfaceC1269E.mo5502e(i2));
        }
        this.f5079c.clear();
    }

    /* renamed from: a */
    private void m5942a(InterfaceC1269E interfaceC1269E, boolean z) {
        InterfaceC1269E mo5523z = interfaceC1269E.mo5523z();
        if (mo5523z != null) {
            int mo5488b = mo5523z.mo5488b(interfaceC1269E);
            mo5523z.mo5497d(mo5488b);
            this.f5077a.m5823a(mo5523z.mo5504g(), new int[]{mo5488b}, (C1352ja[]) null, z ? new int[]{interfaceC1269E.mo5504g()} : null);
        } else {
            for (int mo5501e = interfaceC1269E.mo5501e() - 1; mo5501e >= 0; mo5501e--) {
                m5942a(interfaceC1269E.mo5502e(mo5501e), z);
            }
        }
    }

    /* renamed from: a */
    private static boolean m5943a(C1271G c1271g) {
        if (c1271g == null) {
            return true;
        }
        if (c1271g.m5578e("collapsable") && !c1271g.m5574a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator keySetIterator = c1271g.f4754a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            if (!C1368ra.m5905a(c1271g.f4754a, keySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m5944b(InterfaceC1269E interfaceC1269E, InterfaceC1269E interfaceC1269E2, int i) {
        m5940a(interfaceC1269E, interfaceC1269E2, i);
    }

    /* renamed from: c */
    private void m5945c(InterfaceC1269E interfaceC1269E) {
        int mo5504g = interfaceC1269E.mo5504g();
        if (this.f5079c.get(mo5504g)) {
            return;
        }
        this.f5079c.put(mo5504g, true);
        int mo5519v = interfaceC1269E.mo5519v();
        int mo5512o = interfaceC1269E.mo5512o();
        for (InterfaceC1269E parent = interfaceC1269E.getParent(); parent != null && parent.mo5475A(); parent = parent.getParent()) {
            mo5519v += Math.round(parent.mo5521x());
            mo5512o += Math.round(parent.mo5518u());
        }
        m5939a(interfaceC1269E, mo5519v, mo5512o);
    }

    /* renamed from: c */
    private void m5946c(InterfaceC1269E interfaceC1269E, InterfaceC1269E interfaceC1269E2, int i) {
        int mo5477a = interfaceC1269E.mo5477a(interfaceC1269E.mo5502e(i));
        if (interfaceC1269E.mo5475A()) {
            a m5937a = m5937a(interfaceC1269E, mo5477a);
            if (m5937a == null) {
                return;
            }
            InterfaceC1269E interfaceC1269E3 = m5937a.f5080a;
            mo5477a = m5937a.f5081b;
            interfaceC1269E = interfaceC1269E3;
        }
        if (interfaceC1269E2.mo5475A()) {
            m5944b(interfaceC1269E, interfaceC1269E2, mo5477a);
        } else {
            m5947d(interfaceC1269E, interfaceC1269E2, mo5477a);
        }
    }

    /* renamed from: d */
    private void m5947d(InterfaceC1269E interfaceC1269E, InterfaceC1269E interfaceC1269E2, int i) {
        interfaceC1269E.mo5480a(interfaceC1269E2, i);
        this.f5077a.m5823a(interfaceC1269E.mo5504g(), (int[]) null, new C1352ja[]{new C1352ja(interfaceC1269E2.mo5504g(), i)}, (int[]) null);
    }

    /* renamed from: a */
    public void m5948a() {
        this.f5079c.clear();
    }

    /* renamed from: a */
    public void m5949a(InterfaceC1269E interfaceC1269E, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            m5946c(interfaceC1269E, this.f5078b.m5587a(readableArray.getInt(i)), i);
        }
    }

    /* renamed from: a */
    public void m5950a(InterfaceC1269E interfaceC1269E, C1278N c1278n, C1271G c1271g) {
        boolean z = interfaceC1269E.mo5517t().equals(ReactViewManager.REACT_CLASS) && m5943a(c1271g);
        interfaceC1269E.mo5486a(z);
        if (z) {
            return;
        }
        this.f5077a.m5826a(c1278n, interfaceC1269E.mo5504g(), interfaceC1269E.mo5517t(), c1271g);
    }

    /* renamed from: a */
    public void m5951a(InterfaceC1269E interfaceC1269E, String str, C1271G c1271g) {
        if (interfaceC1269E.mo5475A() && !m5943a(c1271g)) {
            m5941a(interfaceC1269E, c1271g);
        } else {
            if (interfaceC1269E.mo5475A()) {
                return;
            }
            this.f5077a.m5822a(interfaceC1269E.mo5504g(), str, c1271g);
        }
    }

    /* renamed from: a */
    public void m5952a(InterfaceC1269E interfaceC1269E, int[] iArr, int[] iArr2, C1352ja[] c1352jaArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else {
                    if (iArr3[i2] == i) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            m5942a(this.f5078b.m5587a(i), z);
        }
        for (C1352ja c1352ja : c1352jaArr) {
            m5946c(interfaceC1269E, this.f5078b.m5587a(c1352ja.f5009b), c1352ja.f5010c);
        }
    }

    /* renamed from: b */
    public void m5953b(InterfaceC1269E interfaceC1269E) {
        m5945c(interfaceC1269E);
    }
}
