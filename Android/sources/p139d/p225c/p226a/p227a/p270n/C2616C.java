package p139d.p225c.p226a.p227a.p270n;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: d.c.a.a.n.C */
/* loaded from: classes.dex */
final class C2616C implements InterfaceC2629f {
    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2629f
    /* renamed from: a */
    public long mo10999a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2629f
    /* renamed from: a */
    public InterfaceC2637n mo11000a(Looper looper, Handler.Callback callback) {
        return new C2617D(new Handler(looper, callback));
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2629f
    /* renamed from: b */
    public long mo11001b() {
        return SystemClock.elapsedRealtime();
    }
}
