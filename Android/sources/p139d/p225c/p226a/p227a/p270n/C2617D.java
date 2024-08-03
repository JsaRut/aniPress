package p139d.p225c.p226a.p227a.p270n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: d.c.a.a.n.D */
/* loaded from: classes.dex */
final class C2617D implements InterfaceC2637n {

    /* renamed from: a */
    private final Handler f10908a;

    public C2617D(Handler handler) {
        this.f10908a = handler;
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: a */
    public Looper mo11002a() {
        return this.f10908a.getLooper();
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: a */
    public Message mo11003a(int i, int i2, int i3) {
        return this.f10908a.obtainMessage(i, i2, i3);
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: a */
    public Message mo11004a(int i, int i2, int i3, Object obj) {
        return this.f10908a.obtainMessage(i, i2, i3, obj);
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: a */
    public Message mo11005a(int i, Object obj) {
        return this.f10908a.obtainMessage(i, obj);
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: a */
    public boolean mo11006a(int i) {
        return this.f10908a.sendEmptyMessage(i);
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: a */
    public boolean mo11007a(int i, long j) {
        return this.f10908a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2637n
    /* renamed from: b */
    public void mo11008b(int i) {
        this.f10908a.removeMessages(i);
    }
}
