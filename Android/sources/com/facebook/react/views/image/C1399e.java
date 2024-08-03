package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p139d.p143b.p145b.p146a.C1650f;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p201o.InterfaceC2025e;

/* renamed from: com.facebook.react.views.image.e */
/* loaded from: classes.dex */
public class C1399e implements InterfaceC2025e {

    /* renamed from: a */
    private final List<InterfaceC2025e> f5127a;

    private C1399e(List<InterfaceC2025e> list) {
        this.f5127a = new LinkedList(list);
    }

    /* renamed from: a */
    public static InterfaceC2025e m5998a(List<InterfaceC2025e> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C1399e(list) : list.get(0);
        }
        return null;
    }

    @Override // p139d.p143b.p184i.p201o.InterfaceC2025e
    /* renamed from: a */
    public InterfaceC1648d mo5999a() {
        LinkedList linkedList = new LinkedList();
        Iterator<InterfaceC2025e> it = this.f5127a.iterator();
        while (it.hasNext()) {
            linkedList.push(it.next().mo5999a());
        }
        return new C1650f(linkedList);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p184i.p201o.InterfaceC2025e
    /* renamed from: a */
    public C1716b<Bitmap> mo6000a(Bitmap bitmap, AbstractC1842f abstractC1842f) {
        C1716b<Bitmap> c1716b = null;
        try {
            Iterator<InterfaceC2025e> it = this.f5127a.iterator();
            C1716b<Bitmap> c1716b2 = null;
            while (it.hasNext()) {
                c1716b = it.next().mo6000a(c1716b2 != null ? c1716b2.m7048n() : bitmap, abstractC1842f);
                C1716b.m7045b(c1716b2);
                c1716b2 = c1716b.m11778clone();
            }
            return c1716b.m11778clone();
        } finally {
            C1716b.m7045b(c1716b);
        }
    }

    @Override // p139d.p143b.p184i.p201o.InterfaceC2025e
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (InterfaceC2025e interfaceC2025e : this.f5127a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(interfaceC2025e.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
