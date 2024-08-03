package p031c.p032a.p040H;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import p031c.p032a.p047O.C0554d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.H.b */
/* loaded from: classes.dex */
public final class C0528b {

    /* renamed from: b */
    Handler f2629b;

    /* renamed from: d */
    private String f2631d;

    /* renamed from: c */
    private int f2630c = 300;

    /* renamed from: a */
    HandlerThread f2628a = new HandlerThread("ping timer");

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0528b(String str, int i) {
        this.f2631d = str;
        this.f2628a.start();
        this.f2629b = new Handler(this.f2628a.getLooper(), new C0529c(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m2764a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = {bArr[0], bArr[1], bArr[2], 0};
        Thread currentThread = Thread.currentThread();
        for (int i3 = 0; i3 < 255; i3++) {
            bArr2[3] = (byte) i3;
            if (bArr2[3] != bArr[3]) {
                String m2760a = C0527a.m2760a(bArr2);
                if (!m2760a.equalsIgnoreCase(this.f2631d)) {
                    this.f2629b.removeCallbacksAndMessages(null);
                    Message obtainMessage = this.f2629b.obtainMessage(1);
                    obtainMessage.obj = currentThread;
                    Bundle bundle = new Bundle();
                    bundle.putString("ip", m2760a);
                    obtainMessage.setData(bundle);
                    this.f2629b.sendMessageDelayed(obtainMessage, this.f2630c);
                    C0554d.m2883a(new String[]{"ping -c 1 -w 1 " + m2760a}, 0);
                }
            }
        }
        this.f2628a.quit();
    }
}
