package p139d.p143b.p184i.p190d;

import p139d.p143b.p148c.p152d.InterfaceC1694m;

/* renamed from: d.b.i.d.t */
/* loaded from: classes.dex */
public class C1870t implements InterfaceC1694m<C1845B> {
    /* renamed from: a */
    private int m7640a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public C1845B get() {
        int m7640a = m7640a();
        return new C1845B(m7640a, Integer.MAX_VALUE, m7640a, Integer.MAX_VALUE, m7640a / 8);
    }
}
