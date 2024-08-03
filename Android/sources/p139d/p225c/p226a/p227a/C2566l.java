package p139d.p225c.p226a.p227a;

import android.content.Context;
import android.os.Looper;
import p139d.p225c.p226a.p227a.p228a.C2153a;
import p139d.p225c.p226a.p227a.p231d.C2219s;
import p139d.p225c.p226a.p227a.p231d.InterfaceC2215o;
import p139d.p225c.p226a.p227a.p268l.AbstractC2579m;
import p139d.p225c.p226a.p227a.p269m.C2603q;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2592f;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.l */
/* loaded from: classes.dex */
public final class C2566l {

    /* renamed from: a */
    private static InterfaceC2592f f10632a;

    /* renamed from: a */
    public static C2149N m10802a(Context context, InterfaceC2146K interfaceC2146K, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v) {
        return m10803a(context, interfaceC2146K, abstractC2579m, interfaceC2679v, null, C2622I.m11049a());
    }

    /* renamed from: a */
    public static C2149N m10803a(Context context, InterfaceC2146K interfaceC2146K, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v, InterfaceC2215o<C2219s> interfaceC2215o, Looper looper) {
        return m10804a(context, interfaceC2146K, abstractC2579m, interfaceC2679v, interfaceC2215o, new C2153a.a(), looper);
    }

    /* renamed from: a */
    public static C2149N m10804a(Context context, InterfaceC2146K interfaceC2146K, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v, InterfaceC2215o<C2219s> interfaceC2215o, C2153a.a aVar, Looper looper) {
        return m10805a(context, interfaceC2146K, abstractC2579m, interfaceC2679v, interfaceC2215o, m10807a(), aVar, looper);
    }

    /* renamed from: a */
    public static C2149N m10805a(Context context, InterfaceC2146K interfaceC2146K, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v, InterfaceC2215o<C2219s> interfaceC2215o, InterfaceC2592f interfaceC2592f, C2153a.a aVar, Looper looper) {
        return new C2149N(context, interfaceC2146K, abstractC2579m, interfaceC2679v, interfaceC2215o, interfaceC2592f, aVar, looper);
    }

    @Deprecated
    /* renamed from: a */
    public static C2149N m10806a(Context context, AbstractC2579m abstractC2579m, InterfaceC2679v interfaceC2679v) {
        return m10802a(context, new C2397i(context), abstractC2579m, interfaceC2679v);
    }

    /* renamed from: a */
    private static synchronized InterfaceC2592f m10807a() {
        InterfaceC2592f interfaceC2592f;
        synchronized (C2566l.class) {
            if (f10632a == null) {
                f10632a = new C2603q.a().m10939a();
            }
            interfaceC2592f = f10632a;
        }
        return interfaceC2592f;
    }
}
