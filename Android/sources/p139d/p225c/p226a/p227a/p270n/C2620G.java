package p139d.p225c.p226a.p227a.p270n;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: d.c.a.a.n.G */
/* loaded from: classes.dex */
public final class C2620G {
    /* renamed from: a */
    public static void m11027a() {
        if (C2622I.f10916a >= 18) {
            m11029b();
        }
    }

    /* renamed from: a */
    public static void m11028a(String str) {
        if (C2622I.f10916a >= 18) {
            m11030b(str);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m11029b() {
        Trace.endSection();
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m11030b(String str) {
        Trace.beginSection(str);
    }
}
