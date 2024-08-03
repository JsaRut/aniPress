package p139d.p143b.p148c.p156h;

import java.io.Closeable;
import java.io.IOException;
import p139d.p143b.p148c.p152d.C1683b;

/* renamed from: d.b.c.h.a */
/* loaded from: classes.dex */
class C1715a implements InterfaceC1718d<Closeable> {
    @Override // p139d.p143b.p148c.p156h.InterfaceC1718d
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4987a(Closeable closeable) {
        try {
            C1683b.m6953a(closeable, true);
        } catch (IOException unused) {
        }
    }
}
