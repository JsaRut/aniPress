package com.brentvatne.exoplayer;

import android.os.Handler;
import android.os.Message;
import p139d.p225c.p226a.p227a.C2149N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.brentvatne.exoplayer.e */
/* loaded from: classes.dex */
public class HandlerC0978e extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0982i f4062a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC0978e(C0982i c0982i) {
        this.f4062a = c0982i;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C2149N c2149n;
        C2149N c2149n2;
        C2149N c2149n3;
        C2149N c2149n4;
        C2149N c2149n5;
        C2149N c2149n6;
        C0984k c0984k;
        C2149N c2149n7;
        float f;
        if (message.what != 1) {
            return;
        }
        c2149n = this.f4062a.f4098j;
        if (c2149n != null) {
            c2149n2 = this.f4062a.f4098j;
            if (c2149n2.mo8526k() == 3) {
                c2149n3 = this.f4062a.f4098j;
                if (c2149n3.mo8520e()) {
                    c2149n4 = this.f4062a.f4098j;
                    long currentPosition = c2149n4.getCurrentPosition();
                    c2149n5 = this.f4062a.f4098j;
                    long m8757a = c2149n5.m8757a();
                    c2149n6 = this.f4062a.f4098j;
                    long duration = (m8757a * c2149n6.getDuration()) / 100;
                    c0984k = this.f4062a.f4091c;
                    c2149n7 = this.f4062a.f4098j;
                    c0984k.m4953a(currentPosition, duration, c2149n7.getDuration());
                    Message obtainMessage = obtainMessage(1);
                    f = this.f4062a.f4082N;
                    sendMessageDelayed(obtainMessage, Math.round(f));
                }
            }
        }
    }
}
